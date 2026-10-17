package o7j;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m PRICE_IS_CLOSE_TO_MARKET_RATE;

    static {
        m mVar = new m("PRICE_IS_CLOSE_TO_MARKET_RATE", 0);
        PRICE_IS_CLOSE_TO_MARKET_RATE = mVar;
        m[] mVarArr = {mVar};
        $VALUES = mVarArr;
        $ENTRIES = vc.s.n(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
