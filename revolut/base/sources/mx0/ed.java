package mx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class ed {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ed[] $VALUES;
    public static final ed IDLE;
    public static final ed SHOWING_FIRST;
    public static final ed SHOWING_SECOND;

    static {
        ed edVar = new ed("IDLE", 0);
        IDLE = edVar;
        ed edVar2 = new ed("SHOWING_FIRST", 1);
        SHOWING_FIRST = edVar2;
        ed edVar3 = new ed("SHOWING_SECOND", 2);
        SHOWING_SECOND = edVar3;
        ed[] edVarArr = {edVar, edVar2, edVar3};
        $VALUES = edVarArr;
        $ENTRIES = vc.s.n(edVarArr);
    }

    public static ed valueOf(String str) {
        return (ed) Enum.valueOf(ed.class, str);
    }

    public static ed[] values() {
        return (ed[]) $VALUES.clone();
    }
}
