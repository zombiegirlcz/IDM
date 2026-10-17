package cuc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ATM;
    public static final e BALANCE;
    public static final e CARD;
    public static final e EMPTY;
    public static final e INDIVIDUAL;
    public static final e OTHER;
    public static final e PIX;
    public static final e SEPA_INSTANT;
    public static final e TOP_UP;
    public static final e TRANSFER;

    static {
        e eVar = new e("BALANCE", 0);
        BALANCE = eVar;
        e eVar2 = new e("CARD", 1);
        CARD = eVar2;
        e eVar3 = new e("ATM", 2);
        ATM = eVar3;
        e eVar4 = new e("TRANSFER", 3);
        TRANSFER = eVar4;
        e eVar5 = new e("SEPA_INSTANT", 4);
        SEPA_INSTANT = eVar5;
        e eVar6 = new e("TOP_UP", 5);
        TOP_UP = eVar6;
        e eVar7 = new e("PIX", 6);
        PIX = eVar7;
        e eVar8 = new e("OTHER", 7);
        OTHER = eVar8;
        e eVar9 = new e("INDIVIDUAL", 8);
        INDIVIDUAL = eVar9;
        e eVar10 = new e("EMPTY", 9);
        EMPTY = eVar10;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10};
        $VALUES = eVarArr;
        $ENTRIES = vc.s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
