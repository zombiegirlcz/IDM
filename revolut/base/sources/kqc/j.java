package kqc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j CLABE;
    public static final j MASKED_PAN;
    public static final j UNKNOWN;

    static {
        j jVar = new j("CLABE", 0);
        CLABE = jVar;
        j jVar2 = new j("MASKED_PAN", 1);
        MASKED_PAN = jVar2;
        j jVar3 = new j("UNKNOWN", 2);
        UNKNOWN = jVar3;
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
