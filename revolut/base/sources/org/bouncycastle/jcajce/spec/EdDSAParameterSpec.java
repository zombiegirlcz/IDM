package org.bouncycastle.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.internal.asn1.edec.EdECObjectIdentifiers;

/* JADX INFO: loaded from: classes14.dex */
public class EdDSAParameterSpec implements AlgorithmParameterSpec {
    private final String curveName;
    public static final String Ed448 = "Ed448";
    public static final String Ed25519 = "Ed25519";

    public EdDSAParameterSpec(String str) {
        if (str.equalsIgnoreCase("Ed25519")) {
            this.curveName = "Ed25519";
            return;
        }
        if (str.equalsIgnoreCase("Ed448")) {
            this.curveName = "Ed448";
        } else if (str.equals(EdECObjectIdentifiers.id_Ed25519.getId())) {
            this.curveName = "Ed25519";
        } else {
            if (!str.equals(EdECObjectIdentifiers.id_Ed448.getId())) {
                throw new IllegalArgumentException("unrecognized curve name: ".concat(str));
            }
            this.curveName = "Ed448";
        }
    }

    public String getCurveName() {
        return this.curveName;
    }
}
