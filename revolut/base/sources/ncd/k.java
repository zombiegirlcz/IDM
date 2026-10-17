package ncd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k EFFECTIVE;
    public static final k GROSS;
    public static final k NET;
    public static final k PRE_TAX_NET;
    public static final k REFERENCE;
    public static final k UNKNOWN;

    static {
        k kVar = new k("EFFECTIVE", 0);
        EFFECTIVE = kVar;
        k kVar2 = new k("GROSS", 1);
        GROSS = kVar2;
        k kVar3 = new k("PRE_TAX_NET", 2);
        PRE_TAX_NET = kVar3;
        k kVar4 = new k("NET", 3);
        NET = kVar4;
        k kVar5 = new k("REFERENCE", 4);
        REFERENCE = kVar5;
        k kVar6 = new k("UNKNOWN", 5);
        UNKNOWN = kVar6;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6};
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
