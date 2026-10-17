package org.bouncycastle.pqc.crypto.mldsa;

/* JADX INFO: loaded from: classes14.dex */
class Reduce {
    public static int conditionalAddQ(int i) {
        return i + ((i >> 31) & 8380417);
    }

    public static int montgomeryReduce(long j2) {
        return (int) ((j2 - (((long) ((int) (58728449 * j2))) * 8380417)) >>> 32);
    }

    public static int reduce32(int i) {
        return i - (((4194304 + i) >> 23) * 8380417);
    }
}
