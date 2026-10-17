package gk3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i BANK_TRANSFER;
    public static final i CARD_TRANSFER;
    public static final i INTERNAL_TRANSFER;
    public static final i TRANSFER_LINK;
    public static final i WALLET_TRANSFER;

    static {
        i iVar = new i("TRANSFER_LINK", 0);
        TRANSFER_LINK = iVar;
        i iVar2 = new i("BANK_TRANSFER", 1);
        BANK_TRANSFER = iVar2;
        i iVar3 = new i("INTERNAL_TRANSFER", 2);
        INTERNAL_TRANSFER = iVar3;
        i iVar4 = new i("WALLET_TRANSFER", 3);
        WALLET_TRANSFER = iVar4;
        i iVar5 = new i("CARD_TRANSFER", 4);
        CARD_TRANSFER = iVar5;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
