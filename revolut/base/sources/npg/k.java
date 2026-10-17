package npg;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k ALL_SET;
    public static final k SAVINGS_UNAVAILABLE;
    public static final k TAX_RESIDENCY_MISSING;
    public static final k TIN_MISSING;

    static {
        k kVar = new k("TAX_RESIDENCY_MISSING", 0);
        TAX_RESIDENCY_MISSING = kVar;
        k kVar2 = new k("TIN_MISSING", 1);
        TIN_MISSING = kVar2;
        k kVar3 = new k("SAVINGS_UNAVAILABLE", 2);
        SAVINGS_UNAVAILABLE = kVar3;
        k kVar4 = new k("ALL_SET", 3);
        ALL_SET = kVar4;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
