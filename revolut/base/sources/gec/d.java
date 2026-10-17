package gec;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ADD_CARD;
    public static final d ADD_MONEY;
    public static final d MOVE_MONEY;
    public static final d PAYMENT_METHOD;

    static {
        d dVar = new d("ADD_MONEY", 0);
        ADD_MONEY = dVar;
        d dVar2 = new d("MOVE_MONEY", 1);
        MOVE_MONEY = dVar2;
        d dVar3 = new d("PAYMENT_METHOD", 2);
        PAYMENT_METHOD = dVar3;
        d dVar4 = new d("ADD_CARD", 3);
        ADD_CARD = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
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
