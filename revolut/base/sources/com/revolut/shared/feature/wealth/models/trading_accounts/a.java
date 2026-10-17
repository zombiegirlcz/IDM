package com.revolut.shared.feature.wealth.models.trading_accounts;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACTIVE;
    public static final a CREATED;
    public static final a OFFBOARDING;
    public static final a ONBOARDING;
    public static final a SUSPENDED;
    public static final a TERMINATED;

    static {
        a aVar = new a("CREATED", 0);
        CREATED = aVar;
        a aVar2 = new a("ONBOARDING", 1);
        ONBOARDING = aVar2;
        a aVar3 = new a("ACTIVE", 2);
        ACTIVE = aVar3;
        a aVar4 = new a("SUSPENDED", 3);
        SUSPENDED = aVar4;
        a aVar5 = new a("OFFBOARDING", 4);
        OFFBOARDING = aVar5;
        a aVar6 = new a("TERMINATED", 5);
        TERMINATED = aVar6;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
