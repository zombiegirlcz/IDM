package g8a;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class s {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s ACTIVE;
    public static final s DEACTIVATED;
    public static final s PENDING;

    static {
        s sVar = new s("PENDING", 0);
        PENDING = sVar;
        s sVar2 = new s("ACTIVE", 1);
        ACTIVE = sVar2;
        s sVar3 = new s("DEACTIVATED", 2);
        DEACTIVATED = sVar3;
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
