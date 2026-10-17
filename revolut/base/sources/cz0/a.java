package cz0;

/* JADX INFO: loaded from: classes20.dex */
public final class a {
    private a() {
    }

    public static b a(long[] jArr) {
        return new b(Math.floor(b(jArr) * 360.0d), 40.0d + (b(jArr) * 60.0d), (b(jArr) + b(jArr) + b(jArr) + b(jArr)) * 25.0d);
    }

    public static double b(long[] jArr) {
        long j2 = jArr[0];
        int i = (int) (j2 ^ (j2 << 11));
        jArr[0] = jArr[1];
        jArr[1] = jArr[2];
        long j3 = jArr[3];
        jArr[2] = j3;
        jArr[3] = ((long) (i >> 8)) ^ ((j3 ^ (j3 >> 19)) ^ ((long) i));
        return Math.abs(r0) / ((double) Integer.MAX_VALUE);
    }
}
