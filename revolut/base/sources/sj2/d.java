package sj2;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ACCOUNT_WITHDRAWAL;
    public static final d BALANCE_INQUIRY;
    public static final d CARD_DISPENSING;
    public static final d CARD_WITHDRAWAL;
    public static final d PIN_CHANGE;
    public static final d PIN_UNBLOCK;

    static {
        d dVar = new d("CARD_WITHDRAWAL", 0);
        CARD_WITHDRAWAL = dVar;
        d dVar2 = new d("CARD_DISPENSING", 1);
        CARD_DISPENSING = dVar2;
        d dVar3 = new d("PIN_CHANGE", 2);
        PIN_CHANGE = dVar3;
        d dVar4 = new d("PIN_UNBLOCK", 3);
        PIN_UNBLOCK = dVar4;
        d dVar5 = new d("ACCOUNT_WITHDRAWAL", 4);
        ACCOUNT_WITHDRAWAL = dVar5;
        d dVar6 = new d("BALANCE_INQUIRY", 5);
        BALANCE_INQUIRY = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
