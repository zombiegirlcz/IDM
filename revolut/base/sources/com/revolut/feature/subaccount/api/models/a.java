package com.revolut.feature.subaccount.api.models;

import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import md6.e;

/* JADX INFO: loaded from: classes8.dex */
public abstract class a {
    public static final e a(SubaccountType subaccountType) {
        Intrinsics.checkNotNullParameter(subaccountType, "<this>");
        if (Intrinsics.f(subaccountType, SubaccountType.Personal.f88963a)) {
            return e.PERSONAL_SUBACCOUNT;
        }
        if (Intrinsics.f(subaccountType, SubaccountType.Group.f88960a)) {
            return e.GROUP_SUBACCOUNT;
        }
        if (Intrinsics.f(subaccountType, SubaccountType.Pro.f88964a)) {
            return e.PRO_SUBACCOUNT;
        }
        if (Intrinsics.f(subaccountType, SubaccountType.ProTax.f88965a)) {
            return e.PRO_TAX_SUBACCOUNT;
        }
        if (Intrinsics.f(subaccountType, SubaccountType.Junior.f88962a)) {
            return e.YOUTH_SUBACCOUNT;
        }
        if (Intrinsics.f(subaccountType, SubaccountType.Joint.f88961a)) {
            return e.JOINT_SUBACCOUNT;
        }
        if (Intrinsics.f(subaccountType, SubaccountType.Teen.f88966a)) {
            return e.TEEN_SUBACCOUNT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ExtendedSubaccountType b(SubaccountType subaccountType) {
        Intrinsics.checkNotNullParameter(subaccountType, "<this>");
        if (Intrinsics.f(subaccountType, SubaccountType.Personal.f88963a)) {
            return ExtendedSubaccountType.Personal.INSTANCE;
        }
        if (Intrinsics.f(subaccountType, SubaccountType.Group.f88960a)) {
            return ExtendedSubaccountType.Group.INSTANCE;
        }
        if (Intrinsics.f(subaccountType, SubaccountType.Pro.f88964a)) {
            return ExtendedSubaccountType.Pro.INSTANCE;
        }
        if (Intrinsics.f(subaccountType, SubaccountType.ProTax.f88965a)) {
            return ExtendedSubaccountType.ProTax.INSTANCE;
        }
        if (Intrinsics.f(subaccountType, SubaccountType.Junior.f88962a)) {
            return ExtendedSubaccountType.Junior.INSTANCE;
        }
        if (Intrinsics.f(subaccountType, SubaccountType.Joint.f88961a)) {
            return ExtendedSubaccountType.Joint.INSTANCE;
        }
        if (Intrinsics.f(subaccountType, SubaccountType.Teen.f88966a)) {
            return ExtendedSubaccountType.Teen.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final SubaccountType c(ExtendedSubaccountType extendedSubaccountType) {
        Intrinsics.checkNotNullParameter(extendedSubaccountType, "<this>");
        if (extendedSubaccountType instanceof ExtendedSubaccountType.Personal) {
            return SubaccountType.Personal.f88963a;
        }
        if (extendedSubaccountType instanceof ExtendedSubaccountType.Group) {
            return SubaccountType.Group.f88960a;
        }
        if (extendedSubaccountType instanceof ExtendedSubaccountType.Junior) {
            return SubaccountType.Junior.f88962a;
        }
        if (extendedSubaccountType instanceof ExtendedSubaccountType.Pro) {
            return SubaccountType.Pro.f88964a;
        }
        if (extendedSubaccountType instanceof ExtendedSubaccountType.ProTax) {
            return SubaccountType.ProTax.f88965a;
        }
        if (extendedSubaccountType instanceof ExtendedSubaccountType.Joint) {
            return SubaccountType.Joint.f88961a;
        }
        if (extendedSubaccountType instanceof ExtendedSubaccountType.Teen) {
            return SubaccountType.Teen.f88966a;
        }
        if ((extendedSubaccountType instanceof ExtendedSubaccountType.PlanCashback) || (extendedSubaccountType instanceof ExtendedSubaccountType.RevPoints) || (extendedSubaccountType instanceof ExtendedSubaccountType.Collateral)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
