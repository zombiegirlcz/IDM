package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f49782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f49784c;
    public final int d;

    public r2(d2 d2Var, String str, Object[] objArr) {
        this.f49782a = d2Var;
        this.f49783b = str;
        this.f49784c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i5 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i5;
            }
        }
    }

    public final o2 a() {
        int i = this.d;
        return (i & 1) != 0 ? o2.PROTO2 : (i & 4) == 4 ? o2.EDITIONS : o2.PROTO3;
    }
}
