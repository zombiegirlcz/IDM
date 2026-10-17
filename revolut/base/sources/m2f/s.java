package m2f;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s NONE;
    public static final s PARTNER_POINTS;
    public static final s REV_POINTS;

    static {
        s sVar = new s("NONE", 0);
        NONE = sVar;
        s sVar2 = new s("REV_POINTS", 1);
        REV_POINTS = sVar2;
        s sVar3 = new s("PARTNER_POINTS", 2);
        PARTNER_POINTS = sVar3;
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
