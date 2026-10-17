package org.bouncycastle.asn1.ua;

import com.google.common.base.Ascii;
import ehe.n;
import net.sf.scuba.smartcards.ISO7816;
import net.sf.scuba.smartcards.ISOFileInfo;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class DSTU4145Params extends ASN1Object {
    private static final byte[] DEFAULT_DKE = {-87, ISO7816.INS_UPDATE_BINARY, -21, 69, -15, 60, ISO7816.INS_MANAGE_CHANNEL, -126, -128, -60, -106, 123, 35, Ascii.US, 94, -83, -10, 88, -21, -92, ISO7816.INS_GET_RESPONSE, 55, 41, 29, 56, -39, 107, -16, 37, ISO7816.INS_GET_DATA, 78, Ascii.ETB, -8, -23, 114, 13, -58, Ascii.NAK, ISO7816.INS_READ_BINARY_STAMPED, 58, 40, -105, 95, 11, -63, -34, -93, ISOFileInfo.FMD_BYTE, 56, -75, ISOFileInfo.FMD_BYTE, -22, ISO7816.INS_UNBLOCK_CHV, Ascii.ETB, -97, ISO7816.INS_WRITE_BINARY, 18, 62, 109, -72, -6, -59, 121, 4};

    /* JADX INFO: renamed from: dke, reason: collision with root package name */
    private byte[] f228216dke;
    private DSTU4145ECBinary ecbinary;
    private ASN1ObjectIdentifier namedCurve;

    public DSTU4145Params(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.f228216dke = DEFAULT_DKE;
        this.namedCurve = aSN1ObjectIdentifier;
    }

    public static byte[] getDefaultDKE() {
        return Arrays.clone(DEFAULT_DKE);
    }

    public static DSTU4145Params getInstance(Object obj2) {
        if (obj2 instanceof DSTU4145Params) {
            return (DSTU4145Params) obj2;
        }
        if (obj2 == null) {
            throw new IllegalArgumentException("object parse error");
        }
        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(obj2);
        DSTU4145Params dSTU4145Params = aSN1Sequence.getObjectAt(0) instanceof ASN1ObjectIdentifier ? new DSTU4145Params(ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0))) : new DSTU4145Params(DSTU4145ECBinary.getInstance(aSN1Sequence.getObjectAt(0)));
        if (aSN1Sequence.size() == 2) {
            byte[] bArrD = n.D(aSN1Sequence, 1);
            dSTU4145Params.f228216dke = bArrD;
            if (bArrD.length != DEFAULT_DKE.length) {
                throw new IllegalArgumentException("object parse error");
            }
        }
        return dSTU4145Params;
    }

    public byte[] getDKE() {
        return Arrays.clone(this.f228216dke);
    }

    public DSTU4145ECBinary getECBinary() {
        return this.ecbinary;
    }

    public ASN1ObjectIdentifier getNamedCurve() {
        return this.namedCurve;
    }

    public boolean isNamedCurve() {
        return this.namedCurve != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        ASN1Encodable aSN1Encodable = this.namedCurve;
        if (aSN1Encodable == null) {
            aSN1Encodable = this.ecbinary;
        }
        aSN1EncodableVector.add(aSN1Encodable);
        if (!Arrays.areEqual(this.f228216dke, DEFAULT_DKE)) {
            aSN1EncodableVector.add(new DEROctetString(this.f228216dke));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public DSTU4145Params(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr) {
        this.f228216dke = DEFAULT_DKE;
        this.namedCurve = aSN1ObjectIdentifier;
        this.f228216dke = Arrays.clone(bArr);
    }

    public DSTU4145Params(DSTU4145ECBinary dSTU4145ECBinary) {
        this.f228216dke = DEFAULT_DKE;
        this.ecbinary = dSTU4145ECBinary;
    }
}
