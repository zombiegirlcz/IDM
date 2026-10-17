package org.jmrtd.cbeff;

import org.jmrtd.cbeff.BiometricDataBlock;

/* JADX INFO: loaded from: classes14.dex */
public class SimpleCBEFFInfo<B extends BiometricDataBlock> implements CBEFFInfo<B> {
    private B bdb;

    public SimpleCBEFFInfo(B b4) {
        this.bdb = b4;
    }

    public B getBiometricDataBlock() {
        return this.bdb;
    }
}
