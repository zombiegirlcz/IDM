package lr6;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class q {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q APPLE_PAY;
    public static final q BANK_TRANSFER;
    public static final q CARD;
    public static final q CARD_PRESENT;
    public static final q GOOGLE_PAY;
    public static final q OPEN_BANKING;
    public static final q PAY_WITH_REVOLUT;

    static {
        q qVar = new q("CARD", 0);
        CARD = qVar;
        q qVar2 = new q("BANK_TRANSFER", 1);
        BANK_TRANSFER = qVar2;
        q qVar3 = new q("PAY_WITH_REVOLUT", 2);
        PAY_WITH_REVOLUT = qVar3;
        q qVar4 = new q("APPLE_PAY", 3);
        APPLE_PAY = qVar4;
        q qVar5 = new q("GOOGLE_PAY", 4);
        GOOGLE_PAY = qVar5;
        q qVar6 = new q("CARD_PRESENT", 5);
        CARD_PRESENT = qVar6;
        q qVar7 = new q("OPEN_BANKING", 6);
        OPEN_BANKING = qVar7;
        q[] qVarArr = {qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7};
        $VALUES = qVarArr;
        $ENTRIES = vc.s.n(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
