package u09;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j GRID;
    public static final j LIST_LARGE;
    public static final j LIST_SMALL;

    static {
        j jVar = new j("LIST_SMALL", 0);
        LIST_SMALL = jVar;
        j jVar2 = new j("LIST_LARGE", 1);
        LIST_LARGE = jVar2;
        j jVar3 = new j("GRID", 2);
        GRID = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
