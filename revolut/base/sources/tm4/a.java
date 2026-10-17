package tm4;

import ql4.g;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f272155a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.AMORTISATION_TABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.PL_ADDENDUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f272155a = iArr;
    }
}
