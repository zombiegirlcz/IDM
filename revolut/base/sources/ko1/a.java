package ko1;

import jli.c;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f186202a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.PERIOD_SELECTION_NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.PERIOD_SELECTION_DAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.PERIOD_SELECTION_WEEK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c.PERIOD_SELECTION_BI_WEEKLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[c.PERIOD_SELECTION_MONTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[c.PERIOD_SELECTION_YEAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f186202a = iArr;
    }
}
