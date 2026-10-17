package t27;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n FIXED_PERCENTAGE_TAX;
    public static final n PRODUCT_TAX;

    static {
        n nVar = new n("PRODUCT_TAX", 0);
        PRODUCT_TAX = nVar;
        n nVar2 = new n("FIXED_PERCENTAGE_TAX", 1);
        FIXED_PERCENTAGE_TAX = nVar2;
        n[] nVarArr = {nVar, nVar2};
        $VALUES = nVarArr;
        $ENTRIES = vc.s.n(nVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }
}
