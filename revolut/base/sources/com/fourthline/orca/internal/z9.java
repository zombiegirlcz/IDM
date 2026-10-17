package com.fourthline.orca.internal;

/* JADX INFO: loaded from: classes23.dex */
public abstract class z9 {
    public static final aa a() {
        pkm.k.f237220a.getClass();
        pkm.j.f237218a.getClass();
        return new aa(new kotlin.time.f(pkm.j.a()));
    }

    public static final bb0 a(long j2, long j3, long j5, long j16) {
        double d = j2;
        double d5 = j3 - j2;
        if (d5 < 0.0d) {
            d5 = 0.0d;
        }
        return cb0.b(new bb0(j3, j5, j16, null, null, null, j5 > 0 ? Double.valueOf(d) : null, Double.valueOf(d), Double.valueOf(d5), null, null, null, (j5 <= 0 || j2 <= 0) ? null : Double.valueOf((j5 / 1024.0d) / (d / 1000.0d)), (j16 <= 0 || d5 <= 0.0d) ? null : Double.valueOf((j16 / 1024.0d) / (d5 / 1000.0d)), null, null, null, null, 249400, null));
    }
}
