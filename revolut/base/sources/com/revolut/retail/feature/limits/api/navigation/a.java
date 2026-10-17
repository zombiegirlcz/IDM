package com.revolut.retail.feature.limits.api.navigation;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ATM;
    public static final a FX;
    public static final a WALLET_DAILY;
    public static final a WALLET_WEEKLY;
    public static final a YEARLY;

    static {
        a aVar = new a("FX", 0);
        FX = aVar;
        a aVar2 = new a("WALLET_DAILY", 1);
        WALLET_DAILY = aVar2;
        a aVar3 = new a("WALLET_WEEKLY", 2);
        WALLET_WEEKLY = aVar3;
        a aVar4 = new a("YEARLY", 3);
        YEARLY = aVar4;
        a aVar5 = new a("ATM", 4);
        ATM = aVar5;
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
