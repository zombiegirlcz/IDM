package gec;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ADD_AND_MOVE_MONEY;
    public static final f ADD_CARD;
    public static final f CHOOSE_PAYMENT_METHOD;
    public static final f MOVE_MONEY_ONLY;

    static {
        f fVar = new f("ADD_AND_MOVE_MONEY", 0);
        ADD_AND_MOVE_MONEY = fVar;
        f fVar2 = new f("MOVE_MONEY_ONLY", 1);
        MOVE_MONEY_ONLY = fVar2;
        f fVar3 = new f("CHOOSE_PAYMENT_METHOD", 2);
        CHOOSE_PAYMENT_METHOD = fVar3;
        f fVar4 = new f("ADD_CARD", 3);
        ADD_CARD = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
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
