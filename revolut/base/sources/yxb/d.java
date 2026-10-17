package yxb;

import m1c.x0;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f317612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f317613b;

    static {
        int[] iArr = new int[p1c.h.values().length];
        try {
            iArr[p1c.h.FORCE_FULL_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p1c.h.NORMAL_FLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f317612a = iArr;
        int[] iArr2 = new int[x0.values().length];
        try {
            iArr2[x0.OPTED_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[x0.OPTED_OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f317613b = iArr2;
    }
}
