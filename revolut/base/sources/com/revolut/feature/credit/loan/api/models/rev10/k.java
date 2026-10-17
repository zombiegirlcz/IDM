package com.revolut.feature.credit.loan.api.models.rev10;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k AdditionalCharges;
    public static final k CollateralLoss;
    public static final k Termination;

    static {
        k kVar = new k("AdditionalCharges", 0);
        AdditionalCharges = kVar;
        k kVar2 = new k("CollateralLoss", 1);
        CollateralLoss = kVar2;
        k kVar3 = new k("Termination", 2);
        Termination = kVar3;
        k[] kVarArr = {kVar, kVar2, kVar3};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
