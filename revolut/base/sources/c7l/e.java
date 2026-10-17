package c7l;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e BANK_TRANSFER;
    public static final e CARD_TRANSFER;
    public static final e INTERNAL_TRANSFER;
    public static final e TRANSFER_LINK;
    public static final e WALLET_TRANSFER;

    static {
        e eVar = new e("TRANSFER_LINK", 0);
        TRANSFER_LINK = eVar;
        e eVar2 = new e("BANK_TRANSFER", 1);
        BANK_TRANSFER = eVar2;
        e eVar3 = new e("INTERNAL_TRANSFER", 2);
        INTERNAL_TRANSFER = eVar3;
        e eVar4 = new e("WALLET_TRANSFER", 3);
        WALLET_TRANSFER = eVar4;
        e eVar5 = new e("CARD_TRANSFER", 4);
        CARD_TRANSFER = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
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
