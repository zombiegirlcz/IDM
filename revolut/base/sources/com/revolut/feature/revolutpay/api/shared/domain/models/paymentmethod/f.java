package com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ACCOUNTS;
    public static final f COMMODITIES;
    public static final f CREDIT;
    public static final f CRYPTO;
    public static final f POCKETS;
    public static final f SAVINGS;

    static {
        f fVar = new f("ACCOUNTS", 0);
        ACCOUNTS = fVar;
        f fVar2 = new f("POCKETS", 1);
        POCKETS = fVar2;
        f fVar3 = new f("CREDIT", 2);
        CREDIT = fVar3;
        f fVar4 = new f("CRYPTO", 3);
        CRYPTO = fVar4;
        f fVar5 = new f("COMMODITIES", 4);
        COMMODITIES = fVar5;
        f fVar6 = new f("SAVINGS", 5);
        SAVINGS = fVar6;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
