package mk5;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o REVOLUT_FRIENDS_TAB;
    public static final o WALLETS_TAB;

    static {
        o oVar = new o("WALLETS_TAB", 0);
        WALLETS_TAB = oVar;
        o oVar2 = new o("REVOLUT_FRIENDS_TAB", 1);
        REVOLUT_FRIENDS_TAB = oVar2;
        o[] oVarArr = {oVar, oVar2};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
