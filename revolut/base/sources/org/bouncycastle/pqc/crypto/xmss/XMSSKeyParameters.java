package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* JADX INFO: loaded from: classes14.dex */
public class XMSSKeyParameters extends AsymmetricKeyParameter {
    private final String treeDigest;
    public static final String SHA_512 = "SHA-512";
    public static final String SHA_256 = "SHA-256";
    public static final String SHAKE256 = "SHAKE256";
    public static final String SHAKE128 = "SHAKE128";

    public XMSSKeyParameters(boolean z, String str) {
        super(z);
        this.treeDigest = str;
    }

    public String getTreeDigest() {
        return this.treeDigest;
    }
}
