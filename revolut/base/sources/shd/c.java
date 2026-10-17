package shd;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c LOSING;
    public static final c PENDING;
    public static final c WINNING;
    public static final c WON;

    static {
        c cVar = new c("WINNING", 0);
        WINNING = cVar;
        c cVar2 = new c("LOSING", 1);
        LOSING = cVar2;
        c cVar3 = new c("PENDING", 2);
        PENDING = cVar3;
        c cVar4 = new c("WON", 3);
        WON = cVar4;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
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
