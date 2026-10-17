package x15;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s HOME_IMPROVEMENT;
    public static final s LOAN;
    public static final s MORTGAGE;
    public static final s REFINANCING_LOAN;
    public static final s REFINANCING_MORTGAGE;

    static {
        s sVar = new s("LOAN", 0);
        LOAN = sVar;
        s sVar2 = new s("REFINANCING_LOAN", 1);
        REFINANCING_LOAN = sVar2;
        s sVar3 = new s("HOME_IMPROVEMENT", 2);
        HOME_IMPROVEMENT = sVar3;
        s sVar4 = new s("MORTGAGE", 3);
        MORTGAGE = sVar4;
        s sVar5 = new s("REFINANCING_MORTGAGE", 4);
        REFINANCING_MORTGAGE = sVar5;
        s[] sVarArr = {sVar, sVar2, sVar3, sVar4, sVar5};
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
