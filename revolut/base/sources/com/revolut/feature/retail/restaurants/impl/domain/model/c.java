package com.revolut.feature.retail.restaurants.impl.domain.model;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CANCELLATION_FEES;
    public static final c DEPOSIT;
    public static final c UNKNOWN;

    static {
        c cVar = new c("DEPOSIT", 0);
        DEPOSIT = cVar;
        c cVar2 = new c("CANCELLATION_FEES", 1);
        CANCELLATION_FEES = cVar2;
        c cVar3 = new c("UNKNOWN", 2);
        UNKNOWN = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
