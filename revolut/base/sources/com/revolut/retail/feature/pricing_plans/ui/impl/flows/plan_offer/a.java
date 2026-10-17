package com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_offer;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BOTTOM_SHEET;
    public static final a FULL_SCREEN;

    static {
        a aVar = new a("BOTTOM_SHEET", 0);
        BOTTOM_SHEET = aVar;
        a aVar2 = new a("FULL_SCREEN", 1);
        FULL_SCREEN = aVar2;
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
