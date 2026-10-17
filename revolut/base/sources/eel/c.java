package eel;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Leel/c;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "a", "ONE_DAY", "ONE_WEEK", "ONE_MONTH", "SIX_MONTHS", "FIVE_YEAR", "ONE_YEAR", "YEAR_TO_DATE", "TEN_YEARS", "ALL", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @lg.b("trading_api_chart_period_all")
    public static final c ALL;

    @lg.b("trading_api_chart_period_five_year")
    public static final c FIVE_YEAR;

    @lg.b("trading_api_chart_period_one_day")
    public static final c ONE_DAY;

    @lg.b("trading_api_chart_period_one_month")
    public static final c ONE_MONTH;

    @lg.b("trading_api_chart_period_one_week")
    public static final c ONE_WEEK;

    @lg.b("trading_api_chart_period_one_year")
    public static final c ONE_YEAR;

    @lg.b("trading_api_chart_period_sizx_month")
    public static final c SIX_MONTHS;

    @lg.b("trading_api_chart_period_ten_years")
    public static final c TEN_YEARS;

    @lg.b("trading_api_chart_period_year_to_date")
    public static final c YEAR_TO_DATE;

    @lg.b("trading_api_chart_period_id")
    @NotNull
    private final String id;

    static {
        c cVar = new c("ONE_DAY", 0, "1D");
        ONE_DAY = cVar;
        c cVar2 = new c("ONE_WEEK", 1, "1W");
        ONE_WEEK = cVar2;
        c cVar3 = new c("ONE_MONTH", 2, "1M");
        ONE_MONTH = cVar3;
        c cVar4 = new c("SIX_MONTHS", 3, "6M");
        SIX_MONTHS = cVar4;
        c cVar5 = new c("FIVE_YEAR", 4, "5Y");
        FIVE_YEAR = cVar5;
        c cVar6 = new c("ONE_YEAR", 5, "1Y");
        ONE_YEAR = cVar6;
        c cVar7 = new c("YEAR_TO_DATE", 6, "YTD");
        YEAR_TO_DATE = cVar7;
        c cVar8 = new c("TEN_YEARS", 7, "10Y");
        TEN_YEARS = cVar8;
        c cVar9 = new c("ALL", 8, "ALL");
        ALL = cVar9;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
        INSTANCE = new Companion();
    }

    public c(String str, int i, String str2) {
        this.id = str2;
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final String getId() {
        return this.id;
    }
}
