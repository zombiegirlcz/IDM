package cfl;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class v {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ v[] $VALUES;
    public static final v ACTIVE;
    public static final v AVAILABLE;
    public static final v DISABLED;
    public static final v OFFBOARDED;
    public static final v OFFBOARDING;
    public static final v ONBOARDING;
    public static final v REMEDIATION_REQUIRED;

    static {
        v vVar = new v("DISABLED", 0);
        DISABLED = vVar;
        v vVar2 = new v("AVAILABLE", 1);
        AVAILABLE = vVar2;
        v vVar3 = new v("ONBOARDING", 2);
        ONBOARDING = vVar3;
        v vVar4 = new v("ACTIVE", 3);
        ACTIVE = vVar4;
        v vVar5 = new v("REMEDIATION_REQUIRED", 4);
        REMEDIATION_REQUIRED = vVar5;
        v vVar6 = new v("OFFBOARDING", 5);
        OFFBOARDING = vVar6;
        v vVar7 = new v("OFFBOARDED", 6);
        OFFBOARDED = vVar7;
        v[] vVarArr = {vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7};
        $VALUES = vVarArr;
        $ENTRIES = vc.s.n(vVarArr);
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) $VALUES.clone();
    }
}
