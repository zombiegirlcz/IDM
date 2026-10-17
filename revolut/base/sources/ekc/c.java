package ekc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CASHBACK;
    public static final c DISCOUNT;
    public static final c LOYALTY;

    static {
        c cVar = new c("CASHBACK", 0);
        CASHBACK = cVar;
        c cVar2 = new c("DISCOUNT", 1);
        DISCOUNT = cVar2;
        c cVar3 = new c("LOYALTY", 2);
        LOYALTY = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
