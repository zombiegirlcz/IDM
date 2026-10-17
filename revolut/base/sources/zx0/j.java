package zx0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j EXPANDED;
    public static final j EXPANDED_SEARCH;
    public static final j HIDDEN;
    public static final j SEMI_OPEN;

    static {
        j jVar = new j("HIDDEN", 0);
        HIDDEN = jVar;
        j jVar2 = new j("SEMI_OPEN", 1);
        SEMI_OPEN = jVar2;
        j jVar3 = new j("EXPANDED", 2);
        EXPANDED = jVar3;
        j jVar4 = new j("EXPANDED_SEARCH", 3);
        EXPANDED_SEARCH = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final boolean a() {
        return this == EXPANDED || this == EXPANDED_SEARCH;
    }
}
