package org.bouncycastle.crypto.engines;

/* JADX INFO: loaded from: classes14.dex */
public class AESWrapEngine extends RFC3394WrapEngine {
    public AESWrapEngine() {
        super(AESEngine.newInstance());
    }

    public AESWrapEngine(boolean z) {
        super(AESEngine.newInstance(), z);
    }
}
