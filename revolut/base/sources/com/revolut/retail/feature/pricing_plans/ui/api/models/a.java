package com.revolut.retail.feature.pricing_plans.ui.api.models;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a EVERYDAY_INSURANCE;
    public static final a TRAVEL_INSURANCE;

    static {
        a aVar = new a("TRAVEL_INSURANCE", 0);
        TRAVEL_INSURANCE = aVar;
        a aVar2 = new a("EVERYDAY_INSURANCE", 1);
        EVERYDAY_INSURANCE = aVar2;
        a[] aVarArr = {aVar, aVar2};
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
