package pu3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d BNPL;
    public static final d CREDIT_CARD;
    public static final d LINE_OF_CREDIT;
    public static final d LOAN;
    public static final d MORTGAGE;
    public static final d OVERDRAFT;

    static {
        d dVar = new d("MORTGAGE", 0);
        MORTGAGE = dVar;
        d dVar2 = new d("LOAN", 1);
        LOAN = dVar2;
        d dVar3 = new d("BNPL", 2);
        BNPL = dVar3;
        d dVar4 = new d("CREDIT_CARD", 3);
        CREDIT_CARD = dVar4;
        d dVar5 = new d("LINE_OF_CREDIT", 4);
        LINE_OF_CREDIT = dVar5;
        d dVar6 = new d("OVERDRAFT", 5);
        OVERDRAFT = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
