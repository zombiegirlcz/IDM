package org.bouncycastle.crypto.engines;

/* JADX INFO: loaded from: classes14.dex */
public class AESWrapPadEngine extends RFC5649WrapEngine {
    public AESWrapPadEngine() {
        super(AESEngine.newInstance());
    }
}
