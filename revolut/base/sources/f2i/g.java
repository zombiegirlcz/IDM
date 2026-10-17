package f2i;

import com.revolut.feature_exchange.impl.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class g {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;

    @NotNull
    public static final e Companion;
    public static final g DAILY;
    public static final g MONTHLY;
    public static final g WEEKLY;
    private final int inSentenceStringRes;
    private final int standaloneStringRes;

    static {
        g gVar = new g("DAILY", 0, R$string.fx_orders_recurring_period_daily, R$string.fx_orders_recurring_period_daily_in_sentence);
        DAILY = gVar;
        g gVar2 = new g("WEEKLY", 1, R$string.fx_orders_recurring_period_weekly, R$string.fx_orders_recurring_period_weekly_in_sentence);
        WEEKLY = gVar2;
        g gVar3 = new g("MONTHLY", 2, R$string.fx_orders_recurring_period_monthly, R$string.fx_orders_recurring_period_monthly_in_sentence);
        MONTHLY = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        $VALUES = gVarArr;
        $ENTRIES = vc.s.n(gVarArr);
        Companion = new e();
    }

    public g(String str, int i, int i2, int i3) {
        this.standaloneStringRes = i2;
        this.inSentenceStringRes = i3;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }

    public final int a() {
        return this.inSentenceStringRes;
    }

    public final int b() {
        return this.standaloneStringRes;
    }
}
