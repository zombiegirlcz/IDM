package xmj;

import dej.m;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f307278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f307279b;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.DISPLAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.SHARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f307278a = iArr;
        int[] iArr2 = new int[m.values().length];
        try {
            iArr2[m.MOBILE_PLAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[m.DATA_PLAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f307279b = iArr2;
    }
}
