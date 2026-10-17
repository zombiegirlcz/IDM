package org.jmrtd.lds;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.logging.Level;
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
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x9.X962NamedCurves;
import org.bouncycastle.asn1.x9.X962Parameters;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.jmrtd.Util;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class PACEDomainParameterInfo extends SecurityInfo {
    public static final String ID_DH_PUBLIC_NUMBER = "1.2.840.10046.2.1";
    public static final String ID_EC_PUBLIC_KEY = "1.2.840.10045.2.1";
    public static final String ID_PRIME_FIELD = "1.2.840.10045.1.1";
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -5851251908152594728L;
    private transient AlgorithmIdentifier domainParameter;

    /* JADX INFO: renamed from: oid, reason: collision with root package name */
    private String f228970oid;
    private BigInteger parameterId;

    public PACEDomainParameterInfo(String str, AlgorithmIdentifier algorithmIdentifier) {
        this(str, algorithmIdentifier, null);
    }

    public static boolean checkRequiredIdentifier(String str) {
        return "0.4.0.127.0.7.2.2.4.1".equals(str) || "0.4.0.127.0.7.2.2.4.2".equals(str) || "0.4.0.127.0.7.2.2.4.3".equals(str) || "0.4.0.127.0.7.2.2.4.4".equals(str) || "0.4.0.127.0.7.2.2.4.6".equals(str);
    }

    @Deprecated
    public static AlgorithmIdentifier toAlgorithmIdentifier(ECParameterSpec eCParameterSpec) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ASN1Integer(BigInteger.ONE));
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.2.840.10045.1.1");
        EllipticCurve curve = eCParameterSpec.getCurve();
        arrayList.add(new DLSequence(new ASN1Encodable[]{aSN1ObjectIdentifier, new ASN1Integer(((ECFieldFp) curve.getField()).getP())}));
        arrayList.add(new DLSequence(new ASN1Encodable[]{new DEROctetString(Util.i2os(curve.getA())), new DEROctetString(Util.i2os(curve.getB()))}));
        arrayList.add(new DEROctetString(Util.ecPoint2OS(eCParameterSpec.getGenerator(), eCParameterSpec.getCurve().getField().getFieldSize())));
        arrayList.add(new ASN1Integer(eCParameterSpec.getOrder()));
        arrayList.add(new ASN1Integer(eCParameterSpec.getCofactor()));
        ASN1Encodable[] aSN1EncodableArr = new ASN1Encodable[arrayList.size()];
        arrayList.toArray(aSN1EncodableArr);
        return new AlgorithmIdentifier(new ASN1ObjectIdentifier("1.2.840.10045.2.1"), new DLSequence(aSN1EncodableArr));
    }

    @Deprecated
    public static ECParameterSpec toECParameterSpec(AlgorithmIdentifier algorithmIdentifier) {
        ASN1Encodable parameters = algorithmIdentifier.getParameters();
        if (!(parameters instanceof ASN1Sequence)) {
            throw new IllegalArgumentException("Was expecting an ASN.1 sequence");
        }
        try {
            X962Parameters x962Parameters = X962Parameters.getInstance(parameters);
            if (x962Parameters.isNamedCurve()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) x962Parameters.getParameters();
                X9ECParameters byOID = X962NamedCurves.getByOID(aSN1ObjectIdentifier);
                return Util.toECNamedCurveSpec(new ECNamedCurveParameterSpec(X962NamedCurves.getName(aSN1ObjectIdentifier), byOID.getCurve(), byOID.getG(), byOID.getN(), byOID.getH(), byOID.getSeed()));
            }
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e);
        }
        ASN1Sequence aSN1Sequence = (ASN1Sequence) parameters;
        if (aSN1Sequence.size() < 5) {
            throw new IllegalArgumentException("Was expecting an ASN.1 sequence of length 5 or longer");
        }
        try {
            ((ASN1Integer) aSN1Sequence.getObjectAt(0)).getValue();
            ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
            ((ASN1ObjectIdentifier) aSN1Sequence2.getObjectAt(0)).getId();
            BigInteger positiveValue = ((ASN1Integer) aSN1Sequence2.getObjectAt(1)).getPositiveValue();
            ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
            ASN1OctetString aSN1OctetString = (ASN1OctetString) aSN1Sequence3.getObjectAt(0);
            ASN1OctetString aSN1OctetString2 = (ASN1OctetString) aSN1Sequence3.getObjectAt(1);
            BigInteger bigIntegerOs2i = Util.os2i(aSN1OctetString.getOctets());
            BigInteger bigIntegerOs2i2 = Util.os2i(aSN1OctetString2.getOctets());
            ECPoint eCPointOs2ECPoint = Util.os2ECPoint(((ASN1OctetString) aSN1Sequence.getObjectAt(3)).getOctets());
            BigInteger affineX = eCPointOs2ECPoint.getAffineX();
            eCPointOs2ECPoint.getAffineY().pow(2).mod(positiveValue);
            affineX.pow(3).add(bigIntegerOs2i.multiply(affineX)).add(bigIntegerOs2i2).mod(positiveValue);
            EllipticCurve ellipticCurve = new EllipticCurve(new ECFieldFp(positiveValue), bigIntegerOs2i, bigIntegerOs2i2);
            BigInteger positiveValue2 = ((ASN1Integer) aSN1Sequence.getObjectAt(4)).getPositiveValue();
            return aSN1Sequence.size() <= 5 ? new ECParameterSpec(ellipticCurve, eCPointOs2ECPoint, positiveValue2, 1) : new ECParameterSpec(ellipticCurve, eCPointOs2ECPoint, positiveValue2, ((ASN1Integer) aSN1Sequence.getObjectAt(5)).getValue().intValue());
        } catch (Exception e2) {
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e2);
            throw new IllegalArgumentException("Could not get EC parameters from explicit parameters");
        }
    }

    private static String toProtocolOIDString(String str) {
        return "0.4.0.127.0.7.2.2.4.1".equals(str) ? "id-PACE-DH-GM" : "0.4.0.127.0.7.2.2.4.2".equals(str) ? "id-PACE-ECDH-GM" : "0.4.0.127.0.7.2.2.4.3".equals(str) ? "id-PACE-DH-IM" : "0.4.0.127.0.7.2.2.4.4".equals(str) ? "id-PACE-ECDH-IM" : "0.4.0.127.0.7.2.2.4.6".equals(str) ? "id-PACE-ECDH-CAM" : str;
    }

    public boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (obj2 == this) {
            return true;
        }
        if (PACEDomainParameterInfo.class.equals(obj2.getClass())) {
            return getDERObject().equals(((PACEDomainParameterInfo) obj2).getDERObject());
        }
        return false;
    }

    @Override // org.jmrtd.lds.SecurityInfo
    @Deprecated
    public ASN1Primitive getDERObject() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1ObjectIdentifier(this.f228970oid));
        aSN1EncodableVector.add(this.domainParameter);
        if (this.parameterId != null) {
            aSN1EncodableVector.add(new ASN1Integer(this.parameterId));
        }
        return new DLSequence(aSN1EncodableVector);
    }

    @Override // org.jmrtd.lds.SecurityInfo
    public String getObjectIdentifier() {
        return this.f228970oid;
    }

    public BigInteger getParameterId() {
        return this.parameterId;
    }

    public AlgorithmParameterSpec getParameters() {
        if ("1.2.840.10046.2.1".equals(this.f228970oid)) {
            throw new IllegalStateException("DH PACEDomainParameterInfo not yet implemented");
        }
        if ("1.2.840.10045.2.1".equals(this.f228970oid)) {
            return toECParameterSpec(this.domainParameter);
        }
        throw new IllegalStateException("Unsupported PACEDomainParameterInfo type " + this.f228970oid);
    }

    @Override // org.jmrtd.lds.SecurityInfo
    public String getProtocolOIDString() {
        return toProtocolOIDString(this.f228970oid);
    }

    public int hashCode() {
        int iHashCode = (this.domainParameter.hashCode() * 5) + (this.f228970oid.hashCode() * 7) + 111111111;
        BigInteger bigInteger = this.parameterId;
        return ((bigInteger == null ? 333 : bigInteger.hashCode()) * 3) + iHashCode;
    }

    public String toString() {
        String str;
        StringBuilder sb6 = new StringBuilder("PACEDomainParameterInfo[protocol: ");
        sb6.append(toProtocolOIDString(this.f228970oid));
        sb6.append(", domainParameter: [algorithm: ");
        sb6.append(this.domainParameter.getAlgorithm().getId());
        sb6.append(", parameters: ");
        sb6.append(this.domainParameter.getParameters());
        if (this.parameterId == null) {
            str = "";
        } else {
            str = ", parameterId: " + this.parameterId;
        }
        return a.i(sb6, str, "]");
    }

    public PACEDomainParameterInfo(String str, AlgorithmIdentifier algorithmIdentifier, BigInteger bigInteger) {
        if (!checkRequiredIdentifier(str)) {
            throw new IllegalArgumentException(j6.a.q("Invalid protocol id: ", str));
        }
        this.f228970oid = str;
        this.domainParameter = algorithmIdentifier;
        this.parameterId = bigInteger;
    }

    private static AlgorithmIdentifier toAlgorithmIdentifier(String str, ASN1Encodable aSN1Encodable) {
        if (!"0.4.0.127.0.7.2.2.4.1".equals(str) && !"0.4.0.127.0.7.2.2.4.3".equals(str)) {
            if (!"0.4.0.127.0.7.2.2.4.2".equals(str) && !"0.4.0.127.0.7.2.2.4.4".equals(str) && !"0.4.0.127.0.7.2.2.4.6".equals(str)) {
                throw new IllegalArgumentException(j6.a.q("Cannot infer algorithm OID from protocol OID: ", str));
            }
            return new AlgorithmIdentifier(new ASN1ObjectIdentifier("1.2.840.10045.2.1"), aSN1Encodable);
        }
        return new AlgorithmIdentifier(new ASN1ObjectIdentifier("1.2.840.10046.2.1"), aSN1Encodable);
    }
}
