package wmk;

import ggk.q1;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f298702a;

    static {
        int[] iArr = new int[q1.values().length];
        try {
            iArr[q1.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q1.UPCOMING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f298702a = iArr;
    }
}
