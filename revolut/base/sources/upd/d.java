package upd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f281963a;

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
        f281963a = iArr;
    }
}
