package com.revolut.domain.models.moneyrequest;

import com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final String a(MoneyRequestCounterParty.BankBeneficiary bankBeneficiary) {
        Intrinsics.checkNotNullParameter(bankBeneficiary, "<this>");
        String str = bankBeneficiary.d;
        String str2 = bankBeneficiary.f;
        String str3 = bankBeneficiary.e;
        if ((str == null || str.length() == 0) && (str3 == null || str3.length() == 0)) {
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            m70.a.c(t0.f186434a);
            return "";
        }
        String[] elements = {bankBeneficiary.d, str3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = d.L(elements);
        m70.a.t(t0.f186434a);
        return d0.k0(listL, " ", null, null, 0, null, 62);
    }

    public static final String b(MoneyRequestCounterParty.Revolut revolut) {
        Intrinsics.checkNotNullParameter(revolut, "<this>");
        String str = revolut.f60346g;
        String str2 = revolut.f60348j;
        String str3 = revolut.i;
        String str4 = revolut.f60347h;
        if (str != null && str.length() != 0) {
            return revolut.f60346g;
        }
        if ((str4 == null || str4.length() == 0) && (str3 == null || str3.length() == 0)) {
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            m70.a.c(t0.f186434a);
            return "";
        }
        String[] elements = {str4, str3};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = d.L(elements);
        m70.a.t(t0.f186434a);
        return d0.k0(listL, " ", null, null, 0, null, 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String c(com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r1 = r2 instanceof com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty.Revolut
            if (r1 == 0) goto L10
            com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty$Revolut r2 = (com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty.Revolut) r2
            java.lang.String r2 = b(r2)
            return r2
        L10:
            boolean r1 = r2 instanceof com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty.Apm
            if (r1 == 0) goto L37
            com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty$Apm r2 = (com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty.Apm) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = r2.d
            if (r0 == 0) goto L2a
            int r1 = r0.length()
            if (r1 <= 0) goto L27
            goto L28
        L27:
            r0 = 0
        L28:
            if (r0 != 0) goto L2c
        L2a:
            java.lang.String r0 = r2.e
        L2c:
            if (r0 != 0) goto L36
            kotlin.jvm.internal.t0 r2 = kotlin.jvm.internal.t0.f186434a
            m70.a.c(r2)
            java.lang.String r2 = ""
            return r2
        L36:
            return r0
        L37:
            boolean r0 = r2 instanceof com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty.BankBeneficiary
            if (r0 == 0) goto L42
            com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty$BankBeneficiary r2 = (com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty.BankBeneficiary) r2
            java.lang.String r2 = a(r2)
            return r2
        L42:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.domain.models.moneyrequest.a.c(com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty):java.lang.String");
    }

    public static final String d(MoneyRequestCounterParty moneyRequestCounterParty) {
        String strConcat;
        Intrinsics.checkNotNullParameter(moneyRequestCounterParty, "<this>");
        if (moneyRequestCounterParty instanceof MoneyRequestCounterParty.Revolut) {
            MoneyRequestCounterParty.Revolut revolut = (MoneyRequestCounterParty.Revolut) moneyRequestCounterParty;
            Intrinsics.checkNotNullParameter(revolut, "<this>");
            String str = revolut.f;
            if (str != null && (strConcat = "@".concat(str)) != null) {
                return strConcat;
            }
            String str2 = revolut.f60344b;
            if (str2 != null) {
                return str2;
            }
            String str3 = revolut.f60345c;
            if (str3 != null) {
                return str3;
            }
            m70.a.c(t0.f186434a);
            return "";
        }
        if (!(moneyRequestCounterParty instanceof MoneyRequestCounterParty.Apm)) {
            if (!(moneyRequestCounterParty instanceof MoneyRequestCounterParty.BankBeneficiary)) {
                throw new NoWhenBranchMatchedException();
            }
            m70.a.c(t0.f186434a);
            return "";
        }
        MoneyRequestCounterParty.Apm apm = (MoneyRequestCounterParty.Apm) moneyRequestCounterParty;
        Intrinsics.checkNotNullParameter(apm, "<this>");
        String str4 = apm.f60338b;
        if (str4 != null) {
            return str4;
        }
        String str5 = apm.f60339c;
        if (str5 != null) {
            return str5;
        }
        m70.a.c(t0.f186434a);
        return "";
    }

    public static final String e(MoneyRequestCounterParty moneyRequestCounterParty) {
        Intrinsics.checkNotNullParameter(moneyRequestCounterParty, "<this>");
        if (moneyRequestCounterParty instanceof MoneyRequestCounterParty.Revolut) {
            MoneyRequestCounterParty.Revolut revolut = (MoneyRequestCounterParty.Revolut) moneyRequestCounterParty;
            Intrinsics.checkNotNullParameter(revolut, "<this>");
            return revolut.f60347h;
        }
        if (!(moneyRequestCounterParty instanceof MoneyRequestCounterParty.Apm)) {
            if (!(moneyRequestCounterParty instanceof MoneyRequestCounterParty.BankBeneficiary)) {
                throw new NoWhenBranchMatchedException();
            }
            MoneyRequestCounterParty.BankBeneficiary bankBeneficiary = (MoneyRequestCounterParty.BankBeneficiary) moneyRequestCounterParty;
            Intrinsics.checkNotNullParameter(bankBeneficiary, "<this>");
            String str = bankBeneficiary.d;
            return str == null ? bankBeneficiary.f : str;
        }
        MoneyRequestCounterParty.Apm apm = (MoneyRequestCounterParty.Apm) moneyRequestCounterParty;
        Intrinsics.checkNotNullParameter(apm, "<this>");
        String str2 = apm.d;
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
        }
        return apm.e;
    }
}
