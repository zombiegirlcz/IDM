package org.jmrtd.lds;

import com.google.common.primitives.UnsignedBytes;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DLSequence;

/* JADX INFO: loaded from: classes14.dex */
public class TerminalAuthenticationInfo extends SecurityInfo {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd.lds");
    public static final int VERSION_1 = 1;
    private static final int VERSION_2 = 2;
    private static final long serialVersionUID = 6220506985707094044L;
    private transient ASN1Sequence efCVCA;

    /* JADX INFO: renamed from: oid, reason: collision with root package name */
    private String f228972oid;
    private int version;

    public TerminalAuthenticationInfo(String str, int i, ASN1Sequence aSN1Sequence) {
        this.f228972oid = str;
        this.version = i;
        this.efCVCA = aSN1Sequence;
        checkFields();
    }

    private void checkFields() {
        try {
            if (!checkRequiredIdentifier(this.f228972oid)) {
                throw new IllegalArgumentException("Wrong identifier: " + this.f228972oid);
            }
            int i = this.version;
            if (i != 1 && i != 2) {
                LOGGER.warning("Wrong version. Was expecting 1 or 2, found " + this.version);
            }
            ASN1Sequence aSN1Sequence = this.efCVCA;
            if (aSN1Sequence != null) {
                if (((ASN1OctetString) aSN1Sequence.getObjectAt(0)).getOctets().length != 2) {
                    throw new IllegalArgumentException("Malformed FID.");
                }
                if (this.efCVCA.size() == 2 && ((ASN1OctetString) this.efCVCA.getObjectAt(1)).getOctets().length != 1) {
                    throw new IllegalArgumentException("Malformed SFI.");
                }
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Malformed TerminalAuthenticationInfo", e);
        }
    }

    public static boolean checkRequiredIdentifier(String str) {
        return SecurityInfo.ID_TA.equals(str);
    }

    private static ASN1Sequence constructEFCVCA(short s2, byte b4) {
        return b4 != -1 ? new DLSequence(new ASN1Encodable[]{new DEROctetString(new byte[]{(byte) ((65280 & s2) >> 8), (byte) (s2 & 255)}), new DEROctetString(new byte[]{(byte) (b4 & UnsignedBytes.MAX_VALUE)})}) : new DLSequence(new ASN1Encodable[]{new DEROctetString(new byte[]{(byte) ((65280 & s2) >> 8), (byte) (s2 & 255)})});
    }

    private static short getFID(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence == null) {
            return (short) -1;
        }
        byte[] octets = ((ASN1OctetString) aSN1Sequence.getObjectAt(0)).getOctets();
        return (short) ((octets[1] & UnsignedBytes.MAX_VALUE) | ((octets[0] & UnsignedBytes.MAX_VALUE) << 8));
    }

    private static byte getSFI(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence != null && aSN1Sequence.size() == 2) {
            return ((ASN1OctetString) aSN1Sequence.getObjectAt(1)).getOctets()[0];
        }
        return (byte) -1;
    }

    private String toProtocolOIDString(String str) {
        return SecurityInfo.ID_TA.equals(str) ? "id-TA" : SecurityInfo.ID_TA_RSA.equals(str) ? "id-TA-RSA" : SecurityInfo.ID_TA_RSA_V1_5_SHA_1.equals(str) ? "id-TA-RSA-v1-5-SHA-1" : SecurityInfo.ID_TA_RSA_V1_5_SHA_256.equals(str) ? "id-TA-RSA-v1-5-SHA-256" : SecurityInfo.ID_TA_RSA_PSS_SHA_1.equals(str) ? "id-TA-RSA-PSS-SHA-1" : SecurityInfo.ID_TA_RSA_PSS_SHA_256.equals(str) ? "id-TA-RSA-PSS-SHA-256" : SecurityInfo.ID_TA_ECDSA.equals(str) ? "id-TA-ECDSA" : SecurityInfo.ID_TA_ECDSA_SHA_1.equals(str) ? "id-TA-ECDSA-SHA-1" : SecurityInfo.ID_TA_ECDSA_SHA_224.equals(str) ? "id-TA-ECDSA-SHA-224" : SecurityInfo.ID_TA_ECDSA_SHA_256.equals(str) ? "id-TA-ECDSA-SHA-256" : str;
    }

    public boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (obj2 == this) {
            return true;
        }
        if (!TerminalAuthenticationInfo.class.equals(obj2.getClass())) {
            return false;
        }
        TerminalAuthenticationInfo terminalAuthenticationInfo = (TerminalAuthenticationInfo) obj2;
        ASN1Sequence aSN1Sequence = this.efCVCA;
        if (aSN1Sequence == null && terminalAuthenticationInfo.efCVCA != null) {
            return false;
        }
        if (aSN1Sequence == null || terminalAuthenticationInfo.efCVCA != null) {
            return getDERObject().equals(terminalAuthenticationInfo.getDERObject());
        }
        return false;
    }

    @Override // org.jmrtd.lds.SecurityInfo
    @Deprecated
    public ASN1Primitive getDERObject() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.f228972oid));
        aSN1EncodableVector.add(new ASN1Integer(this.version));
        ASN1Sequence aSN1Sequence = this.efCVCA;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        return new DLSequence(aSN1EncodableVector);
    }

    public int getFileId() {
        return getFID(this.efCVCA);
    }

    @Override // org.jmrtd.lds.SecurityInfo
    public String getObjectIdentifier() {
        return this.f228972oid;
    }

    @Override // org.jmrtd.lds.SecurityInfo
    public String getProtocolOIDString() {
        return toProtocolOIDString(this.f228972oid);
    }

    public byte getShortFileId() {
        return getSFI(this.efCVCA);
    }

    public int getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.f228972oid;
        int iHashCode = (this.version * 5) + ((str == null ? 0 : str.hashCode()) * 7) + 123;
        ASN1Sequence aSN1Sequence = this.efCVCA;
        return ((aSN1Sequence == null ? 1 : aSN1Sequence.hashCode()) * 3) + iHashCode;
    }

    public String toString() {
        return "TerminalAuthenticationInfo [protocol: " + toProtocolOIDString(this.f228972oid) + ", version: " + this.version + ", fileID: " + getFileId() + ", shortFileID: " + ((int) getShortFileId()) + "]";
    }

    public TerminalAuthenticationInfo(String str, int i) {
        this(str, i, null);
    }

    public TerminalAuthenticationInfo() {
        this(SecurityInfo.ID_TA, 1);
    }

    public TerminalAuthenticationInfo(short s2, byte b4) {
        this(SecurityInfo.ID_TA, 1, constructEFCVCA(s2, b4));
    }
}
