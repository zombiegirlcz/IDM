package end;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f127813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f127814b;

    static {
        int[] iArr = new int[com.revolut.feature.spending_analytics.api.models.income_sorter.a.values().length];
        try {
            iArr[com.revolut.feature.spending_analytics.api.models.income_sorter.a.GIA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.spending_analytics.api.models.income_sorter.a.ISA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.feature.spending_analytics.api.models.income_sorter.a.PERSONAL_JISA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[com.revolut.feature.spending_analytics.api.models.income_sorter.a.CUSTODIAN_JISA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f127813a = iArr;
        int[] iArr2 = new int[hel.b.values().length];
        try {
            iArr2[hel.b.US.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[hel.b.GB.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[hel.b.AU.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[hel.b.EEA.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[hel.b.SG.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[hel.b.MX.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[hel.b.BR.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        f127814b = iArr2;
    }
}
