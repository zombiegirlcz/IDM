package zz1;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j CREATE;
    public static final j DELETE;
    public static final j DENY_CLAIM;
    public static final j REPLACE;

    static {
        j jVar = new j("CREATE", 0);
        CREATE = jVar;
        j jVar2 = new j("DELETE", 1);
        DELETE = jVar2;
        j jVar3 = new j("DENY_CLAIM", 2);
        DENY_CLAIM = jVar3;
        j jVar4 = new j("REPLACE", 3);
        REPLACE = jVar4;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
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
