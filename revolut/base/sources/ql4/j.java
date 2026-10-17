package ql4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j ANTICIPATION;
    public static final j CHANGE_TERM;
    public static final j CUSTOM_AMOUNT;
    public static final j FUTURE_INSTALMENTS;
    public static final j UNKNOWN;

    static {
        j jVar = new j("ANTICIPATION", 0);
        ANTICIPATION = jVar;
        j jVar2 = new j("FUTURE_INSTALMENTS", 1);
        FUTURE_INSTALMENTS = jVar2;
        j jVar3 = new j("CUSTOM_AMOUNT", 2);
        CUSTOM_AMOUNT = jVar3;
        j jVar4 = new j("CHANGE_TERM", 3);
        CHANGE_TERM = jVar4;
        j jVar5 = new j("UNKNOWN", 4);
        UNKNOWN = jVar5;
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
