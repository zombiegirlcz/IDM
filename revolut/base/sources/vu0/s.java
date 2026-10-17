package vu0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s BOTH;
    public static final s FROM_END_TO_START;
    public static final s FROM_START_TO_END;

    static {
        s sVar = new s("FROM_END_TO_START", 0);
        FROM_END_TO_START = sVar;
        s sVar2 = new s("FROM_START_TO_END", 1);
        FROM_START_TO_END = sVar2;
        s sVar3 = new s("BOTH", 2);
        BOTH = sVar3;
        s[] sVarArr = {sVar, sVar2, sVar3};
        $VALUES = sVarArr;
        $ENTRIES = vc.s.n(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
