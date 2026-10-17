package a84;

import hs3.q1;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f2107a;

    static {
        int[] iArr = new int[q1.values().length];
        try {
            iArr[q1.SCROLL_TO_END.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q1.SCROLL_ONE_PAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q1.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f2107a = iArr;
    }
}
