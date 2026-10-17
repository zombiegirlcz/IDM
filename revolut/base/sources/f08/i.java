package f08;

import n08.d0;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f131017a;

    static {
        int[] iArr = new int[d0.values().length];
        try {
            iArr[d0.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d0.INCOMPLETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f131017a = iArr;
    }
}
