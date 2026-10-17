package d3c;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o AWAITING_DISPATCH;
    public static final o DELIVERED;
    public static final o DISPATCHED;
    public static final o UNKNOWN;

    static {
        o oVar = new o("UNKNOWN", 0);
        UNKNOWN = oVar;
        o oVar2 = new o("AWAITING_DISPATCH", 1);
        AWAITING_DISPATCH = oVar2;
        o oVar3 = new o("DISPATCHED", 2);
        DISPATCHED = oVar3;
        o oVar4 = new o("DELIVERED", 3);
        DELIVERED = oVar4;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4};
        $VALUES = oVarArr;
        $ENTRIES = vc.s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
