package com.revolut.feature.spending_analytics.api.models.income_sorter;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CUSTODIAN_JISA;
    public static final a GIA;
    public static final a ISA;
    public static final a PERSONAL_JISA;

    static {
        a aVar = new a("GIA", 0);
        GIA = aVar;
        a aVar2 = new a("ISA", 1);
        ISA = aVar2;
        a aVar3 = new a("PERSONAL_JISA", 2);
        PERSONAL_JISA = aVar3;
        a aVar4 = new a("CUSTODIAN_JISA", 3);
        CUSTODIAN_JISA = aVar4;
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
