package org.bouncycastle.jcajce.spec;

/* JADX INFO: loaded from: classes14.dex */
public class KEMParameterSpec extends KTSParameterSpec {
    public KEMParameterSpec(String str) {
        this(str, 256);
    }

    public int getKeySizeInBits() {
        return getKeySize();
    }

    public KEMParameterSpec(String str, int i) {
        super(str, i, null, null, null);
    }
}
