package com.revolut.feature.freelancer.impl.network.errorhandling;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ACCOUNT_NOT_EMPTY;
    public static final a PENDING_CASHBACK;
    public static final a PENDING_SALE;
    public static final a POCKET_NOT_EMPTY;
    public static final a WITHDRAWING_BLOCKED;

    static {
        a aVar = new a("ACCOUNT_NOT_EMPTY", 0);
        ACCOUNT_NOT_EMPTY = aVar;
        a aVar2 = new a("PENDING_CASHBACK", 1);
        PENDING_CASHBACK = aVar2;
        a aVar3 = new a("PENDING_SALE", 2);
        PENDING_SALE = aVar3;
        a aVar4 = new a("POCKET_NOT_EMPTY", 3);
        POCKET_NOT_EMPTY = aVar4;
        a aVar5 = new a("WITHDRAWING_BLOCKED", 4);
        WITHDRAWING_BLOCKED = aVar5;
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
