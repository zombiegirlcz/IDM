package com.revolut.feature.retail.restaurants.impl.domain.model;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a AUTHORISED;
    public static final a CANCELLED;
    public static final a CANCELLING;
    public static final a COMPLETED;
    public static final a FAILED;
    public static final a IN_SETTLEMENT;
    public static final a PENDING;
    public static final a PROCESSING;
    public static final a UNKNOWN;

    static {
        a aVar = new a("PENDING", 0);
        PENDING = aVar;
        a aVar2 = new a("PROCESSING", 1);
        PROCESSING = aVar2;
        a aVar3 = new a("AUTHORISED", 2);
        AUTHORISED = aVar3;
        a aVar4 = new a("IN_SETTLEMENT", 3);
        IN_SETTLEMENT = aVar4;
        a aVar5 = new a("CANCELLING", 4);
        CANCELLING = aVar5;
        a aVar6 = new a("COMPLETED", 5);
        COMPLETED = aVar6;
        a aVar7 = new a("CANCELLED", 6);
        CANCELLED = aVar7;
        a aVar8 = new a("FAILED", 7);
        FAILED = aVar8;
        a aVar9 = new a("UNKNOWN", 8);
        UNKNOWN = aVar9;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
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
