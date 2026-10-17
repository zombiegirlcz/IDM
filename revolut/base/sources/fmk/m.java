package fmk;

import m1c.x0;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f136475a;

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
        f136475a = iArr;
    }
}
