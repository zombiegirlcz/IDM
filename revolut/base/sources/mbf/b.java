package mbf;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ADVANCED_PORTFOLIO_ANALYTICS;
    public static final b STOCKS;
    public static final b TRADING_PRO;

    static {
        b bVar = new b("TRADING_PRO", 0);
        TRADING_PRO = bVar;
        b bVar2 = new b("ADVANCED_PORTFOLIO_ANALYTICS", 1);
        ADVANCED_PORTFOLIO_ANALYTICS = bVar2;
        b bVar3 = new b("STOCKS", 2);
        STOCKS = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
