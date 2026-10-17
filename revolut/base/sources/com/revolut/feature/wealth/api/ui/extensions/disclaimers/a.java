package com.revolut.feature.wealth.api.ui.extensions.disclaimers;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BOND_PRICE_AND_VOLUME;
    public static final a OTHER;
    public static final a RISK;
    public static final a YIELD;

    static {
        a aVar = new a("RISK", 0);
        RISK = aVar;
        a aVar2 = new a("BOND_PRICE_AND_VOLUME", 1);
        BOND_PRICE_AND_VOLUME = aVar2;
        a aVar3 = new a("YIELD", 2);
        YIELD = aVar3;
        a aVar4 = new a("OTHER", 3);
        OTHER = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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
