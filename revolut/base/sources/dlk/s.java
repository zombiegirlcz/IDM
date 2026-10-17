package dlk;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s DOWNGRADE_FEES_AND_TERMS;
    public static final s DOWNGRADE_LEGIBILITY;
    public static final s DOWNGRADE_REASONS;
    public static final s FEEDBACK;

    static {
        s sVar = new s("DOWNGRADE_FEES_AND_TERMS", 0);
        DOWNGRADE_FEES_AND_TERMS = sVar;
        s sVar2 = new s("DOWNGRADE_REASONS", 1);
        DOWNGRADE_REASONS = sVar2;
        s sVar3 = new s("DOWNGRADE_LEGIBILITY", 2);
        DOWNGRADE_LEGIBILITY = sVar3;
        s sVar4 = new s("FEEDBACK", 3);
        FEEDBACK = sVar4;
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
