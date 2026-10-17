package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes17.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f49360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f49361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f49362c;
    public final int d;

    public f1(a aVar, String str, Object[] objArr) {
        this.f49360a = aVar;
        this.f49361b = str;
        this.f49362c = objArr;
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
}
