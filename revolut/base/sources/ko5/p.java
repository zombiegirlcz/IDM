package ko5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p BANK_BENEFICIARY;
    public static final p P2P;
    public static final p WALLET;

    static {
        p pVar = new p("WALLET", 0);
        WALLET = pVar;
        p pVar2 = new p("P2P", 1);
        P2P = pVar2;
        p pVar3 = new p("BANK_BENEFICIARY", 2);
        BANK_BENEFICIARY = pVar3;
        p[] pVarArr = {pVar, pVar2, pVar3};
        $VALUES = pVarArr;
        $ENTRIES = s.n(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
