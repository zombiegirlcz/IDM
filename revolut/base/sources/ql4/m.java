package ql4;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m CUSTOMER_REQUEST;
    public static final m FACILITY_TERMINATION;
    public static final m FORBEARANCE;
    public static final m MAX_TDPD_EXCEEDED;
    public static final m UNKNOWN;

    static {
        m mVar = new m("CUSTOMER_REQUEST", 0);
        CUSTOMER_REQUEST = mVar;
        m mVar2 = new m("MAX_TDPD_EXCEEDED", 1);
        MAX_TDPD_EXCEEDED = mVar2;
        m mVar3 = new m("FACILITY_TERMINATION", 2);
        FACILITY_TERMINATION = mVar3;
        m mVar4 = new m("FORBEARANCE", 3);
        FORBEARANCE = mVar4;
        m mVar5 = new m("UNKNOWN", 4);
        UNKNOWN = mVar5;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5};
        $VALUES = mVarArr;
        $ENTRIES = vc.s.n(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
