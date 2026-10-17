package end;

import com.revolut.feature.categorisation.api.model.PeriodPreferenceType;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f127806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f127807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f127808c;

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
        f127806a = iArr;
        int[] iArr2 = new int[dmd.a.values().length];
        try {
            iArr2[dmd.a.POSITIVE_SURPLUS_TREND.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[dmd.a.NEGATIVE_SURPLUS_TREND.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f127807b = iArr2;
        int[] iArr3 = new int[qzi.g.values().length];
        try {
            iArr3[qzi.g.ON_TRACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[qzi.g.NOT_ON_TRACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[qzi.g.OVERSPENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f127808c = iArr3;
    }
}
