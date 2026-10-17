package knd;

import com.revolut.feature.categorisation.api.model.PeriodPreferenceType;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f186126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f186127b;

    static {
        int[] iArr = new int[PeriodPreferenceType.values().length];
        try {
            iArr[PeriodPreferenceType.WEEK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PeriodPreferenceType.MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PeriodPreferenceType.YEAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f186126a = iArr;
        int[] iArr2 = new int[lzi.i.values().length];
        try {
            iArr2[lzi.i.WEEKLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[lzi.i.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[lzi.i.YEARLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[lzi.i.MAX.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[lzi.i.CUSTOM.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        f186127b = iArr2;
    }
}
