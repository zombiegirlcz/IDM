package o9l;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lo9l/t;", "", "ADHOC", "WEEKLY", "BI_WEEKLY", "MONTHLY", "QUARTERLY", "HALF_YEARLY", "YEARLY", "DAILY", "TWICE_WEEKLY", "TEN_DAYS", "BI_MONTHLY", "TRIMESTER", "UNKNOWN", "feature_shared_recurring_payments_data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;

    @lg.b("ADHOC")
    public static final t ADHOC;

    @lg.b("BI_MONTHLY")
    public static final t BI_MONTHLY;

    @lg.b("BI_WEEKLY")
    public static final t BI_WEEKLY;

    @lg.b("DAILY")
    public static final t DAILY;

    @lg.b("HALF_YEARLY")
    public static final t HALF_YEARLY;

    @lg.b("MONTHLY")
    public static final t MONTHLY;

    @lg.b("QUARTERLY")
    public static final t QUARTERLY;

    @lg.b("TEN_DAYS")
    public static final t TEN_DAYS;

    @lg.b("TRIMESTER")
    public static final t TRIMESTER;

    @lg.b("TWICE_WEEKLY")
    public static final t TWICE_WEEKLY;

    @lg.b("UNKNOWN")
    public static final t UNKNOWN;

    @lg.b("WEEKLY")
    public static final t WEEKLY;

    @lg.b("YEARLY")
    public static final t YEARLY;

    static {
        t tVar = new t("ADHOC", 0);
        ADHOC = tVar;
        t tVar2 = new t("WEEKLY", 1);
        WEEKLY = tVar2;
        t tVar3 = new t("BI_WEEKLY", 2);
        BI_WEEKLY = tVar3;
        t tVar4 = new t("MONTHLY", 3);
        MONTHLY = tVar4;
        t tVar5 = new t("QUARTERLY", 4);
        QUARTERLY = tVar5;
        t tVar6 = new t("HALF_YEARLY", 5);
        HALF_YEARLY = tVar6;
        t tVar7 = new t("YEARLY", 6);
        YEARLY = tVar7;
        t tVar8 = new t("DAILY", 7);
        DAILY = tVar8;
        t tVar9 = new t("TWICE_WEEKLY", 8);
        TWICE_WEEKLY = tVar9;
        t tVar10 = new t("TEN_DAYS", 9);
        TEN_DAYS = tVar10;
        t tVar11 = new t("BI_MONTHLY", 10);
        BI_MONTHLY = tVar11;
        t tVar12 = new t("TRIMESTER", 11);
        TRIMESTER = tVar12;
        t tVar13 = new t("UNKNOWN", 12);
        UNKNOWN = tVar13;
        t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5, tVar6, tVar7, tVar8, tVar9, tVar10, tVar11, tVar12, tVar13};
        $VALUES = tVarArr;
        $ENTRIES = vc.s.n(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
