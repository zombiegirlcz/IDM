package a7g;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q COLLAPSED;
    public static final q FILTERS_EXPANDED;
    public static final q SEARCH_INPUT_EXPANDED;

    static {
        q qVar = new q("COLLAPSED", 0);
        COLLAPSED = qVar;
        q qVar2 = new q("FILTERS_EXPANDED", 1);
        FILTERS_EXPANDED = qVar2;
        q qVar3 = new q("SEARCH_INPUT_EXPANDED", 2);
        SEARCH_INPUT_EXPANDED = qVar3;
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
