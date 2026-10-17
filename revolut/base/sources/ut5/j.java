package ut5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j COLLAPSIBLE;
    public static final j HIDDEN;
    public static final j SINGLE_ITEM;

    static {
        j jVar = new j("HIDDEN", 0);
        HIDDEN = jVar;
        j jVar2 = new j("COLLAPSIBLE", 1);
        COLLAPSIBLE = jVar2;
        j jVar3 = new j("SINGLE_ITEM", 2);
        SINGLE_ITEM = jVar3;
        j[] jVarArr = {jVar, jVar2, jVar3};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
