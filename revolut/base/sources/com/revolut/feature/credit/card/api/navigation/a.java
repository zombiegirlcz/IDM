package com.revolut.feature.credit.card.api.navigation;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ADD_MONEY;
    public static final a INITIAL_DEPOSIT;
    public static final a WITHDRAWAL;

    static {
        a aVar = new a("ADD_MONEY", 0);
        ADD_MONEY = aVar;
        a aVar2 = new a("INITIAL_DEPOSIT", 1);
        INITIAL_DEPOSIT = aVar2;
        a aVar3 = new a("WITHDRAWAL", 2);
        WITHDRAWAL = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
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
