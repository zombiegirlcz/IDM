package d27;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v CUSTOMER_SETS_PRICE;
    public static final v EXPIRY_DATE;
    public static final v REUSABLE_PAYMENT_LINK;

    static {
        v vVar = new v("CUSTOMER_SETS_PRICE", 0);
        CUSTOMER_SETS_PRICE = vVar;
        v vVar2 = new v("EXPIRY_DATE", 1);
        EXPIRY_DATE = vVar2;
        v vVar3 = new v("REUSABLE_PAYMENT_LINK", 2);
        REUSABLE_PAYMENT_LINK = vVar3;
        v[] vVarArr = {vVar, vVar2, vVar3};
        $VALUES = vVarArr;
        $ENTRIES = vc.s.n(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
