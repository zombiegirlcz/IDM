package zbj;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class w {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w RevolutFriends;
    public static final w Tabs;
    public static final w Wallet;

    static {
        w wVar = new w("RevolutFriends", 0);
        RevolutFriends = wVar;
        w wVar2 = new w("Tabs", 1);
        Tabs = wVar2;
        w wVar3 = new w("Wallet", 2);
        Wallet = wVar3;
        w[] wVarArr = {wVar, wVar2, wVar3};
        $VALUES = wVarArr;
        $ENTRIES = vc.s.n(wVarArr);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }
}
