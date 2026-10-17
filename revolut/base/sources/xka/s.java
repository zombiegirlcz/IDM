package xka;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class s implements aii.r {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s CLOSE_CLICK;
    public static final s NEXT_CLICK;
    public static final s NOT_FOUND;

    static {
        s sVar = new s("NOT_FOUND", 0);
        NOT_FOUND = sVar;
        s sVar2 = new s("CLOSE_CLICK", 1);
        CLOSE_CLICK = sVar2;
        s sVar3 = new s("NEXT_CLICK", 2);
        NEXT_CLICK = sVar3;
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
