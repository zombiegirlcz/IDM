package org.bouncycastle.crypto.kems.mlkem;

/* JADX INFO: loaded from: classes14.dex */
class Reduce {
    public static short barrettReduce(short s2) {
        return (short) (s2 - ((short) (((short) ((s2 * 20159) >> 26)) * 3329)));
    }

    public static int checkModulus(short s2) {
        return s2 - 3329;
    }

    public static short condSubQ(short s2) {
        short s3 = (short) (s2 - 3329);
        return (short) (s3 + ((s3 >> 15) & 3329));
    }

    public static short montgomeryReduce(int i) {
        return (short) ((i - (((short) (62209 * i)) * 3329)) >> 16);
    }
}
