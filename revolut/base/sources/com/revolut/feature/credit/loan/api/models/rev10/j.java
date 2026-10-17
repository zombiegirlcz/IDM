package com.revolut.feature.credit.loan.api.models.rev10;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j InterestFreePeriod;
    public static final j InterestOnlyPeriod;
    public static final j InterestOnlyWithoutTermExtension;
    public static final j Prolongation;
    public static final j RepaymentDeferral;
    public static final j TokenRepaymentPlan;
    public static final j ZeroLoanAmount;

    static {
        j jVar = new j("InterestOnlyPeriod", 0);
        InterestOnlyPeriod = jVar;
        j jVar2 = new j("ZeroLoanAmount", 1);
        ZeroLoanAmount = jVar2;
        j jVar3 = new j("InterestOnlyWithoutTermExtension", 2);
        InterestOnlyWithoutTermExtension = jVar3;
        j jVar4 = new j("RepaymentDeferral", 3);
        RepaymentDeferral = jVar4;
        j jVar5 = new j("Prolongation", 4);
        Prolongation = jVar5;
        j jVar6 = new j("InterestFreePeriod", 5);
        InterestFreePeriod = jVar6;
        j jVar7 = new j("TokenRepaymentPlan", 6);
        TokenRepaymentPlan = jVar7;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7};
        $VALUES = jVarArr;
        $ENTRIES = s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
