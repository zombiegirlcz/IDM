package org.bouncycastle.jce;

import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConstants;
import java.io.IOException;
import java.math.BigInteger;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import okl.m;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.EncryptedData;
import org.bouncycastle.asn1.pkcs.MacData;
import org.bouncycastle.asn1.pkcs.Pfx;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Properties;

/* JADX INFO: loaded from: classes14.dex */
public class PKCS12Util {
    static final String PKCS12_MAX_IT_COUNT_PROPERTY = "org.bouncycastle.pkcs12.max_it_count";
    private static final BigInteger DEFAULT_MAX_IT_COUNT = BigInteger.valueOf(LivenessConstants.MAX_VIDEO_SIZE_BYTES);

    private static byte[] calculatePbeMac(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr, int i, char[] cArr, byte[] bArr2, String str) throws Exception {
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(aSN1ObjectIdentifier.getId(), str);
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i);
        SecretKey secretKeyGenerateSecret = secretKeyFactory.generateSecret(new PBEKeySpec(cArr));
        Mac mac = Mac.getInstance(aSN1ObjectIdentifier.getId(), str);
        mac.init(secretKeyGenerateSecret, pBEParameterSpec);
        mac.update(bArr2);
        return mac.doFinal();
    }

    public static byte[] convertToDefiniteLength(byte[] bArr) throws IOException {
        return Pfx.getInstance(bArr).getEncoded("DER");
    }

    public static ASN1Encodable getContent(ContentInfo contentInfo) throws IOException {
        ASN1Encodable content = contentInfo.getContent();
        if (content != null) {
            return content;
        }
        throw new ASN1ParsingException("ContentInfo content missing");
    }

    public static byte[] getContentOctets(ContentInfo contentInfo) throws IOException {
        return ASN1OctetString.getInstance(getContent(contentInfo)).getOctets();
    }

    public static ASN1OctetString getEncryptedContent(EncryptedData encryptedData) throws IOException {
        ASN1OctetString content = encryptedData.getContent();
        if (content != null) {
            return content;
        }
        throw new ASN1ParsingException("EncryptedContentInfo content missing");
    }

    public static int validateIterationCount(BigInteger bigInteger) {
        if (bigInteger.signum() < 0) {
            throw new IllegalStateException("negative iteration count found");
        }
        if (bigInteger.bitLength() > 31) {
            throw new IllegalStateException("iteration counts >= 2^31 are not suppported");
        }
        BigInteger bigIntegerAsBigInteger = Properties.asBigInteger("org.bouncycastle.pkcs12.max_it_count");
        if (bigIntegerAsBigInteger == null) {
            bigIntegerAsBigInteger = DEFAULT_MAX_IT_COUNT;
        }
        if (bigInteger.compareTo(bigIntegerAsBigInteger) <= 0) {
            return BigIntegers.intValueExact(bigInteger);
        }
        throw new IllegalStateException("iteration count " + bigInteger + " greater than " + bigIntegerAsBigInteger);
    }

    public static byte[] convertToDefiniteLength(byte[] bArr, char[] cArr, String str) throws IOException {
        Pfx pfx = Pfx.getInstance(bArr);
        ContentInfo authSafe = pfx.getAuthSafe();
        ContentInfo contentInfo = new ContentInfo(authSafe.getContentType(), new DEROctetString(ASN1Primitive.fromByteArray(getContentOctets(authSafe)).getEncoded("DER")));
        MacData macData = pfx.getMacData();
        try {
            int iValidateIterationCount = validateIterationCount(macData.getIterationCount());
            return new Pfx(contentInfo, new MacData(new DigestInfo(new AlgorithmIdentifier(macData.getMac().getAlgorithmId().getAlgorithm(), DERNull.INSTANCE), calculatePbeMac(macData.getMac().getAlgorithmId().getAlgorithm(), macData.getSalt(), iValidateIterationCount, cArr, getContentOctets(contentInfo), str)), macData.getSalt(), iValidateIterationCount)).getEncoded("DER");
        } catch (Exception e) {
            throw new IOException(m.g(e, new StringBuilder("error constructing MAC: ")));
        }
    }
}
