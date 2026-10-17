package ds6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o EXPORT_TRANSACTIONS;
    public static final o GO_TO_TAX_AUTHORITY;
    public static final o MAKE_PAYMENT;
    private final int order;

    static {
        o oVar = new o("EXPORT_TRANSACTIONS", 0, 1);
        EXPORT_TRANSACTIONS = oVar;
        o oVar2 = new o("GO_TO_TAX_AUTHORITY", 1, 2);
        GO_TO_TAX_AUTHORITY = oVar2;
        o oVar3 = new o("MAKE_PAYMENT", 2, 3);
        MAKE_PAYMENT = oVar3;
        o[] oVarArr = {oVar, oVar2, oVar3};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
    }

    public o(String str, int i, int i2) {
        this.order = i2;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public final int a() {
        return this.order;
    }
}
