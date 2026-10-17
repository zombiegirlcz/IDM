package d3c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i CANCELLED_BY_USER;
    public static final i CART_EXPIRED;
    public static final i INELIGIBLE_MERCHANT;
    public static final i PAYMENT_FAILED;

    static {
        i iVar = new i("CANCELLED_BY_USER", 0);
        CANCELLED_BY_USER = iVar;
        i iVar2 = new i("INELIGIBLE_MERCHANT", 1);
        INELIGIBLE_MERCHANT = iVar2;
        i iVar3 = new i("PAYMENT_FAILED", 2);
        PAYMENT_FAILED = iVar3;
        i iVar4 = new i("CART_EXPIRED", 3);
        CART_EXPIRED = iVar4;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4};
        $VALUES = iVarArr;
        $ENTRIES = vc.s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
