package it3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ELIGIBLE;
    public static final h ELIGIBLE_WITH_CREDIT_HEALTH;
    public static final h FACILITY_ALREADY_ACTIVE;
    public static final h MAINTENANCE;
    public static final h MULTIPLE_APPLICATIONS;
    public static final h NOT_ELIGIBLE;
    public static final h UPDATE_REQUIRED;
    public static final h WAITING_LIST;

    static {
        h hVar = new h("ELIGIBLE", 0);
        ELIGIBLE = hVar;
        h hVar2 = new h("NOT_ELIGIBLE", 1);
        NOT_ELIGIBLE = hVar2;
        h hVar3 = new h("ELIGIBLE_WITH_CREDIT_HEALTH", 2);
        ELIGIBLE_WITH_CREDIT_HEALTH = hVar3;
        h hVar4 = new h("FACILITY_ALREADY_ACTIVE", 3);
        FACILITY_ALREADY_ACTIVE = hVar4;
        h hVar5 = new h("MAINTENANCE", 4);
        MAINTENANCE = hVar5;
        h hVar6 = new h("UPDATE_REQUIRED", 5);
        UPDATE_REQUIRED = hVar6;
        h hVar7 = new h("MULTIPLE_APPLICATIONS", 6);
        MULTIPLE_APPLICATIONS = hVar7;
        h hVar8 = new h("WAITING_LIST", 7);
        WAITING_LIST = hVar8;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
