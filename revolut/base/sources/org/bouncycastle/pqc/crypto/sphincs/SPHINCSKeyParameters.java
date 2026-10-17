package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes14.dex */
public class SPHINCSKeyParameters extends AsymmetricKeyParameter {
    private final String treeDigest;
    public static final String SHA512_256 = "SHA-512/256";
    public static final String SHA3_256 = "SHA3-256";

    public SPHINCSKeyParameters(boolean z, String str) {
        super(z);
        this.treeDigest = str;
    }

    public String getTreeDigest() {
        return this.treeDigest;
    }
}
