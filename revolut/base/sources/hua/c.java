package hua;

import com.revolut.feature.recurring_buys.schedule.api.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final c DAILY;
    public static final c MONTHLY;
    public static final c WEEKLY;
    private final int inSentenceStringRes;
    private final int standaloneStringRes;

    static {
        c cVar = new c("DAILY", 0, R$string.cryptobuysell_recurring_buy_order_frequency_daily, R$string.cryptobuysell_recurring_buy_order_frequency_daily_lowercased);
        DAILY = cVar;
        c cVar2 = new c("WEEKLY", 1, R$string.cryptobuysell_recurring_buy_order_frequency_weekly, R$string.cryptobuysell_recurring_buy_order_frequency_weekly_lowercased);
        WEEKLY = cVar2;
        c cVar3 = new c("MONTHLY", 2, R$string.cryptobuysell_recurring_buy_order_frequency_monthly, R$string.cryptobuysell_recurring_buy_order_frequency_monthly_lowercased);
        MONTHLY = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
        Companion = new a();
    }

    public c(String str, int i, int i2, int i3) {
        this.standaloneStringRes = i2;
        this.inSentenceStringRes = i3;
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

    public final int b() {
        return this.inSentenceStringRes;
    }

    public final int c() {
        return this.standaloneStringRes;
    }
}
