package zg7;

import m1c.x0;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f322086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f322087b;

    static {
        int[] iArr = new int[x0.values().length];
        try {
            iArr[x0.OPTED_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x0.OPTED_OUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f322086a = iArr;
        int[] iArr2 = new int[ze7.a.values().length];
        try {
            iArr2[ze7.a.REV_POINTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f322087b = iArr2;
    }
}
