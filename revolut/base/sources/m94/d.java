package m94;

import my3.g;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f203628a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.ADD_DEBT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.OPEN_DEBTS_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.SKIP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f203628a = iArr;
    }
}
