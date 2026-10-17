package org.bouncycastle.jce;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;

/* JADX INFO: loaded from: classes14.dex */
public class ECNamedCurveTable {
    public static Enumeration getNames() {
        return org.bouncycastle.asn1.x9.ECNamedCurveTable.getNames();
    }

    public static ECNamedCurveParameterSpec getParameterSpec(String str) {
        ASN1ObjectIdentifier aSN1ObjectIdentifierTryFromID = ASN1ObjectIdentifier.tryFromID(str);
        X9ECParameters byOID = aSN1ObjectIdentifierTryFromID != null ? CustomNamedCurves.getByOID(aSN1ObjectIdentifierTryFromID) : CustomNamedCurves.getByName(str);
        if (byOID == null) {
            byOID = aSN1ObjectIdentifierTryFromID != null ? org.bouncycastle.asn1.x9.ECNamedCurveTable.getByOID(aSN1ObjectIdentifierTryFromID) : org.bouncycastle.asn1.x9.ECNamedCurveTable.getByName(str);
        }
        if (byOID == null) {
            return null;
        }
        return new ECNamedCurveParameterSpec(str, byOID.getCurve(), byOID.getG(), byOID.getN(), byOID.getH(), byOID.getSeed());
    }
}
