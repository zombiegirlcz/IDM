package com.revolut.feature.payments.messaging.data.api.model;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a CANCELLED;
    public static final a CLAIMED;
    public static final a EXPIRED;
    public static final a PENDING;
    public static final a UNKNOWN;

    static {
        a aVar = new a("PENDING", 0);
        PENDING = aVar;
        a aVar2 = new a("CLAIMED", 1);
        CLAIMED = aVar2;
        a aVar3 = new a("CANCELLED", 2);
        CANCELLED = aVar3;
        a aVar4 = new a("EXPIRED", 3);
        EXPIRED = aVar4;
        a aVar5 = new a("UNKNOWN", 4);
        UNKNOWN = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
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
