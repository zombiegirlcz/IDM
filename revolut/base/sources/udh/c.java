package udh;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c FINAL_CALL;
    public static final c GOOD;
    public static final c LIQUIDATION;
    public static final c MARGIN_CALL;
    public static final c UNKNOWN;

    static {
        c cVar = new c("GOOD", 0);
        GOOD = cVar;
        c cVar2 = new c("MARGIN_CALL", 1);
        MARGIN_CALL = cVar2;
        c cVar3 = new c("FINAL_CALL", 2);
        FINAL_CALL = cVar3;
        c cVar4 = new c("LIQUIDATION", 3);
        LIQUIDATION = cVar4;
        c cVar5 = new c("UNKNOWN", 4);
        UNKNOWN = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final boolean a() {
        int i = b.f279204a[ordinal()];
        if (i == 1 || i == 2) {
            return false;
        }
        if (i == 3 || i == 4 || i == 5) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }
}
