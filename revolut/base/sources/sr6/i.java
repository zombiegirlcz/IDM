package sr6;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i BANK_TRANSFER;
    public static final i CARD;
    public static final i CLICK_TO_PAY;
    public static final i OPEN_BANKING;
    public static final i PAY_WITH_REVOLUT;
    public static final i UNKNOWN;

    static {
        i iVar = new i("PAY_WITH_REVOLUT", 0);
        PAY_WITH_REVOLUT = iVar;
        i iVar2 = new i("CARD", 1);
        CARD = iVar2;
        i iVar3 = new i("BANK_TRANSFER", 2);
        BANK_TRANSFER = iVar3;
        i iVar4 = new i("OPEN_BANKING", 3);
        OPEN_BANKING = iVar4;
        i iVar5 = new i("CLICK_TO_PAY", 4);
        CLICK_TO_PAY = iVar5;
        i iVar6 = new i("UNKNOWN", 5);
        UNKNOWN = iVar6;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6};
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
