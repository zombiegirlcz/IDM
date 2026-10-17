package com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i CREDIT;
    public static final i CURRENT;
    public static final i MERCHANT;
    public static final i SAVINGS;
    public static final i SAVINGS_EXTERNAL;
    public static final i SAVINGS_INTEREST_BEARING;

    static {
        i iVar = new i("CURRENT", 0);
        CURRENT = iVar;
        i iVar2 = new i("SAVINGS", 1);
        SAVINGS = iVar2;
        i iVar3 = new i("CREDIT", 2);
        CREDIT = iVar3;
        i iVar4 = new i("MERCHANT", 3);
        MERCHANT = iVar4;
        i iVar5 = new i("SAVINGS_EXTERNAL", 4);
        SAVINGS_EXTERNAL = iVar5;
        i iVar6 = new i("SAVINGS_INTEREST_BEARING", 5);
        SAVINGS_INTEREST_BEARING = iVar6;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
