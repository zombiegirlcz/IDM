package pwg;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s COMMODITY;
    public static final s CRYPTO;
    public static final s SECURITY;

    static {
        s sVar = new s("SECURITY", 0);
        SECURITY = sVar;
        s sVar2 = new s("CRYPTO", 1);
        CRYPTO = sVar2;
        s sVar3 = new s("COMMODITY", 2);
        COMMODITY = sVar3;
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
