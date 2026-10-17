package yw4;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class o {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o DEBTOR_MARKED_WITH_PLAIS_TAG;
    public static final o FACILITY_DEACTIVATION;
    public static final o FACILITY_TERMINATION;
    public static final o FORBEARANCE;
    public static final o OTHER;
    public static final o TDPD_THRESHOLD_EXCEEDED;

    static {
        o oVar = new o("TDPD_THRESHOLD_EXCEEDED", 0);
        TDPD_THRESHOLD_EXCEEDED = oVar;
        o oVar2 = new o("DEBTOR_MARKED_WITH_PLAIS_TAG", 1);
        DEBTOR_MARKED_WITH_PLAIS_TAG = oVar2;
        o oVar3 = new o("FORBEARANCE", 2);
        FORBEARANCE = oVar3;
        o oVar4 = new o("FACILITY_DEACTIVATION", 3);
        FACILITY_DEACTIVATION = oVar4;
        o oVar5 = new o("FACILITY_TERMINATION", 4);
        FACILITY_TERMINATION = oVar5;
        o oVar6 = new o("OTHER", 5);
        OTHER = oVar6;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6};
        $VALUES = oVarArr;
        $ENTRIES = s.n(oVarArr);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
