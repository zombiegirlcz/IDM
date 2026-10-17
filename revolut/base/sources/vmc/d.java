package vmc;

import k4l.c0;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f290557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f290558b;

    static {
        int[] iArr = new int[c0.values().length];
        try {
            iArr[c0.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c0.WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c0.MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f290557a = iArr;
        int[] iArr2 = new int[ilc.c.values().length];
        try {
            iArr2[ilc.c.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ilc.c.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ilc.c.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ilc.c.CANCELLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f290558b = iArr2;
    }
}
