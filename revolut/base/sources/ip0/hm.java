package ip0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class hm {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ hm[] $VALUES;
    public static final hm HERO;
    public static final hm LARGE;

    static {
        hm hmVar = new hm("HERO", 0);
        HERO = hmVar;
        hm hmVar2 = new hm("LARGE", 1);
        LARGE = hmVar2;
        hm[] hmVarArr = {hmVar, hmVar2};
        $VALUES = hmVarArr;
        $ENTRIES = vc.s.n(hmVarArr);
    }

    public static hm valueOf(String str) {
        return (hm) Enum.valueOf(hm.class, str);
    }

    public static hm[] values() {
        return (hm[]) $VALUES.clone();
    }
}
