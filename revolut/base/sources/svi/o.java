package svi;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o ACTIVE;
    public static final o CANCELLED;
    public static final o CANCELLING;
    public static final o CREATED;
    public static final o EXPIRED;
    public static final o PROVISIONING;
    public static final o REDEEMED;
    public static final o REFUNDED;
    public static final o UNKNOWN;

    static {
        o oVar = new o("CREATED", 0);
        CREATED = oVar;
        o oVar2 = new o("PROVISIONING", 1);
        PROVISIONING = oVar2;
        o oVar3 = new o("ACTIVE", 2);
        ACTIVE = oVar3;
        o oVar4 = new o("REDEEMED", 3);
        REDEEMED = oVar4;
        o oVar5 = new o("CANCELLING", 4);
        CANCELLING = oVar5;
        o oVar6 = new o("CANCELLED", 5);
        CANCELLED = oVar6;
        o oVar7 = new o("REFUNDED", 6);
        REFUNDED = oVar7;
        o oVar8 = new o("EXPIRED", 7);
        EXPIRED = oVar8;
        o oVar9 = new o("UNKNOWN", 8);
        UNKNOWN = oVar9;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7, oVar8, oVar9};
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
