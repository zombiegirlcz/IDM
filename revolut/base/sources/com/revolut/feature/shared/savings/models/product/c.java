package com.revolut.feature.shared.savings.models.product;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CROSS_CURRENCY_TOPUP_RESTRICTION;
    public static final c CROSS_CURRENCY_WITHDRAWAL_RESTRICTION;
    public static final c SAVINGS_TO_SAVINGS_TRANSFER_RESTRICTION;

    static {
        c cVar = new c("CROSS_CURRENCY_TOPUP_RESTRICTION", 0);
        CROSS_CURRENCY_TOPUP_RESTRICTION = cVar;
        c cVar2 = new c("CROSS_CURRENCY_WITHDRAWAL_RESTRICTION", 1);
        CROSS_CURRENCY_WITHDRAWAL_RESTRICTION = cVar2;
        c cVar3 = new c("SAVINGS_TO_SAVINGS_TRANSFER_RESTRICTION", 2);
        SAVINGS_TO_SAVINGS_TRANSFER_RESTRICTION = cVar3;
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
