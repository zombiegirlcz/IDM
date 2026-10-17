package ny0;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s LEAST_RESTRICTIVE;
    public static final s MOST_RESTRICTIVE;

    static {
        s sVar = new s("MOST_RESTRICTIVE", 0);
        MOST_RESTRICTIVE = sVar;
        s sVar2 = new s("LEAST_RESTRICTIVE", 1);
        LEAST_RESTRICTIVE = sVar2;
        s[] sVarArr = {sVar, sVar2};
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
