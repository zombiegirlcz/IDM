package yui;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ r[] $VALUES;
    public static final r CONTINUE;
    public static final r PURCHASE;

    static {
        r rVar = new r("CONTINUE", 0);
        CONTINUE = rVar;
        r rVar2 = new r("PURCHASE", 1);
        PURCHASE = rVar2;
        r[] rVarArr = {rVar, rVar2};
        $VALUES = rVarArr;
        $ENTRIES = vc.s.n(rVarArr);
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
