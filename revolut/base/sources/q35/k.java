package q35;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k ACTIVE;
    public static final k INACTIVE;
    public static final k UNKNOWN;

    static {
        k kVar = new k("ACTIVE", 0);
        ACTIVE = kVar;
        k kVar2 = new k("INACTIVE", 1);
        INACTIVE = kVar2;
        k kVar3 = new k("UNKNOWN", 2);
        UNKNOWN = kVar3;
        k[] kVarArr = {kVar, kVar2, kVar3};
        $VALUES = kVarArr;
        $ENTRIES = vc.s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
