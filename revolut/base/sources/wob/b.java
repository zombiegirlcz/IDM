package wob;

import ejb.m;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f298908a;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f298908a = iArr;
    }
}
