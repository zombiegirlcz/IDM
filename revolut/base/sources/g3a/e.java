package g3a;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e BALANCE_TRANSFER_CREDIT_CARD;
    public static final e CRYPTO_SEND;
    public static final e PAYMENTS;

    static {
        e eVar = new e("CRYPTO_SEND", 0);
        CRYPTO_SEND = eVar;
        e eVar2 = new e("PAYMENTS", 1);
        PAYMENTS = eVar2;
        e eVar3 = new e("BALANCE_TRANSFER_CREDIT_CARD", 2);
        BALANCE_TRANSFER_CREDIT_CARD = eVar3;
        e[] eVarArr = {eVar, eVar2, eVar3};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
