package ss4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j BALANCE_AND_MAXIMUM_LIMIT_EXCEEDS;
    public static final j BALANCE_LIMIT_EXCEEDED;
    public static final j INSTALMENT_BOUND_LIMIT_EXCEEDED;
    public static final j MAXIMUM_LIMIT_EXCEEDED;
    public static final j UNDER_MINIMUM_LIMIT;

    static {
        j jVar = new j("BALANCE_LIMIT_EXCEEDED", 0);
        BALANCE_LIMIT_EXCEEDED = jVar;
        j jVar2 = new j("MAXIMUM_LIMIT_EXCEEDED", 1);
        MAXIMUM_LIMIT_EXCEEDED = jVar2;
        j jVar3 = new j("INSTALMENT_BOUND_LIMIT_EXCEEDED", 2);
        INSTALMENT_BOUND_LIMIT_EXCEEDED = jVar3;
        j jVar4 = new j("BALANCE_AND_MAXIMUM_LIMIT_EXCEEDS", 3);
        BALANCE_AND_MAXIMUM_LIMIT_EXCEEDS = jVar4;
        j jVar5 = new j("UNDER_MINIMUM_LIMIT", 4);
        UNDER_MINIMUM_LIMIT = jVar5;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5};
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
