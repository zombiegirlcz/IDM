package aii;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s CREATED;
    public static final s FINISHED;
    public static final s HIDDEN;
    public static final s SHOWN;

    static {
        s sVar = new s("SHOWN", 0);
        SHOWN = sVar;
        s sVar2 = new s("HIDDEN", 1);
        HIDDEN = sVar2;
        s sVar3 = new s("CREATED", 2);
        CREATED = sVar3;
        s sVar4 = new s("FINISHED", 3);
        FINISHED = sVar4;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4};
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
