package r40;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s IDLE;
    public static final s LOADING;
    public static final s NOTHING_TO_LOAD;

    static {
        s sVar = new s("LOADING", 0);
        LOADING = sVar;
        s sVar2 = new s("IDLE", 1);
        IDLE = sVar2;
        s sVar3 = new s("NOTHING_TO_LOAD", 2);
        NOTHING_TO_LOAD = sVar3;
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
