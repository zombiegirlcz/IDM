package m1c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class p {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final p EARN;
    public static final p HOTELS_POINTS;
    public static final p MILES;
    public static final p REDEEM;

    static {
        p pVar = new p("EARN", 0);
        EARN = pVar;
        p pVar2 = new p("REDEEM", 1);
        REDEEM = pVar2;
        p pVar3 = new p("MILES", 2);
        MILES = pVar3;
        p pVar4 = new p("HOTELS_POINTS", 3);
        HOTELS_POINTS = pVar4;
        p[] pVarArr = {pVar, pVar2, pVar3, pVar4};
        $VALUES = pVarArr;
        $ENTRIES = vc.s.n(pVarArr);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }
}
