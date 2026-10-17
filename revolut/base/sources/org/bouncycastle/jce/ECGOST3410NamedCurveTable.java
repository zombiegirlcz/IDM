package org.bouncycastle.jce;

import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cryptopro.ECGOST3410NamedCurves;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;

/* JADX INFO: loaded from: classes14.dex */
public class ECGOST3410NamedCurveTable {
    public static Enumeration getNames() {
        return ECGOST3410NamedCurves.getNames();
    }

    public static ECNamedCurveParameterSpec getParameterSpec(String str) {
        ASN1ObjectIdentifier aSN1ObjectIdentifierTryFromID;
        X9ECParameters byNameX9 = ECGOST3410NamedCurves.getByNameX9(str);
        if (byNameX9 == null && (aSN1ObjectIdentifierTryFromID = ASN1ObjectIdentifier.tryFromID(str)) != null) {
            byNameX9 = ECGOST3410NamedCurves.getByOIDX9(aSN1ObjectIdentifierTryFromID);
        }
        if (byNameX9 == null) {
            return null;
        }
        X9ECParameters x9ECParameters = byNameX9;
        return new ECNamedCurveParameterSpec(str, x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
    }
}
