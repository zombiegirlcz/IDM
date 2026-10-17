package com.revolut.feature.credit_card.autopay.api.models_v3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FIXED;
    public static final a MIN_REPAYMENT;
    public static final a STATEMENT_BALANCE;

    static {
        a aVar = new a("STATEMENT_BALANCE", 0);
        STATEMENT_BALANCE = aVar;
        a aVar2 = new a("MIN_REPAYMENT", 1);
        MIN_REPAYMENT = aVar2;
        a aVar3 = new a("FIXED", 2);
        FIXED = aVar3;
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
