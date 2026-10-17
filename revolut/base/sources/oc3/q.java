package oc3;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q LOADING;
    public static final q SEARCH_PLACEHOLDER_BUTTON;
    public static final q SEARCH_THIS_AREA_BUTTON;

    static {
        q qVar = new q("LOADING", 0);
        LOADING = qVar;
        q qVar2 = new q("SEARCH_THIS_AREA_BUTTON", 1);
        SEARCH_THIS_AREA_BUTTON = qVar2;
        q qVar3 = new q("SEARCH_PLACEHOLDER_BUTTON", 2);
        SEARCH_PLACEHOLDER_BUTTON = qVar3;
        q[] qVarArr = {qVar, qVar2, qVar3};
        $VALUES = qVarArr;
        $ENTRIES = vc.s.n(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
