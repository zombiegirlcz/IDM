package tll;

import gkl.r1;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f272119a;

    static {
        int[] iArr = new int[r1.values().length];
        try {
            iArr[r1.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r1.BUSINESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[r1.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f272119a = iArr;
    }
}
