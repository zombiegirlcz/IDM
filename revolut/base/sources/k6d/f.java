package k6d;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f AMEX;
    public static final f APPLE_PAY;
    public static final f APPLE_TAP_TO_PAY;
    public static final f BANK_TRANSFER;
    public static final f CARD;
    public static final f CARD_PRESENT;
    public static final f CASH;
    public static final f CLICK_TO_PAY;
    public static final f GOOGLE_PAY;
    public static final f OPEN_BANKING;
    public static final f PAY_WITH_REVOLUT;
    public static final f SEPA_DIRECT_DEBIT;

    static {
        f fVar = new f("CARD", 0);
        CARD = fVar;
        f fVar2 = new f("CARD_PRESENT", 1);
        CARD_PRESENT = fVar2;
        f fVar3 = new f("PAY_WITH_REVOLUT", 2);
        PAY_WITH_REVOLUT = fVar3;
        f fVar4 = new f("BANK_TRANSFER", 3);
        BANK_TRANSFER = fVar4;
        f fVar5 = new f("GOOGLE_PAY", 4);
        GOOGLE_PAY = fVar5;
        f fVar6 = new f("APPLE_PAY", 5);
        APPLE_PAY = fVar6;
        f fVar7 = new f("APPLE_TAP_TO_PAY", 6);
        APPLE_TAP_TO_PAY = fVar7;
        f fVar8 = new f("OPEN_BANKING", 7);
        OPEN_BANKING = fVar8;
        f fVar9 = new f("AMEX", 8);
        AMEX = fVar9;
        f fVar10 = new f("CASH", 9);
        CASH = fVar10;
        f fVar11 = new f("SEPA_DIRECT_DEBIT", 10);
        SEPA_DIRECT_DEBIT = fVar11;
        f fVar12 = new f("CLICK_TO_PAY", 11);
        CLICK_TO_PAY = fVar12;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
