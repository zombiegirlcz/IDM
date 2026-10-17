package ew3;

import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.linked_accounts.LinkedAccountsV3PluginFactory;
import e4m.e;
import ft3.j1;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mz3.a1;
import mz3.b0;
import mz3.b1;
import mz3.c1;
import mz3.c2;
import mz3.d1;
import mz3.d2;
import mz3.e1;
import mz3.f1;
import mz3.f2;
import mz3.g1;
import mz3.g2;
import mz3.h1;
import mz3.i2;
import mz3.r1;
import mz3.s1;
import mz3.v0;
import mz3.w0;
import mz3.x0;
import mz3.y0;
import mz3.y1;
import mz3.z1;
import nz3.f;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public abstract class c implements e {
    public static Pair A(b bVar, f2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.MORTGAGE_SIGNATURE), factory);
    }

    public static Pair B(b bVar, g2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.MORTGAGE_VALUATION_V2), factory);
    }

    public static Pair C(b bVar, i2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.EXIT, j1.NON_EMBEDDED_CREDIT_INSURANCE_FTC), factory);
    }

    public static Pair D(b bVar, z1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.a(ks3.a.NOT_AVAILABLE), factory);
    }

    public static Pair a(b bVar) {
        return new Pair(new fv3.c(ks3.b.EMAIL_VERIFICATION), new v0());
    }

    public static Pair b(b bVar, w0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.EMERGENCY_PAYMENT_SETUP), factory);
    }

    public static Pair c(b bVar, b0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.EXIT, j1.BUY_NOW_PAY_LATER), factory);
    }

    public static Pair d(b bVar, x0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.a(ks3.a.EXPIRED), factory);
    }

    public static Pair e(b bVar, y0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.a(ks3.a.FAILURE), factory);
    }

    public static Pair f(b bVar, a1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.EXIT, u.c(j1.FAMILY_CREDIT_CARD)), factory);
    }

    public static Pair g(b bVar, b1 familyCreditCardSettingsPluginFactory) {
        Intrinsics.checkNotNullParameter(familyCreditCardSettingsPluginFactory, "familyCreditCardSettingsPluginFactory");
        return new Pair(new fv3.c(ks3.b.FAMILY_CREDIT_CARD_SETTINGS), familyCreditCardSettingsPluginFactory);
    }

    public static Pair h(b bVar, c1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.FINANCIAL_EVIDENCE), factory);
    }

    public static Pair i(b bVar, d1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.FINANCIAL_SITUATION_CONFIRMATION), factory);
    }

    public static Pair j(b bVar, e1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.FORM), factory);
    }

    public static Pair k(b bVar, r1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.EXIT, v.k(j1.FTC_FORBEARANCE, j1.CC_FORBEARANCE, j1.POST_TERMINATION_PARTIAL_SETTLEMENTS, j1.POST_TERMINATION_REPAYMENT_PLAN)), factory);
    }

    public static Pair l(b bVar, f1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.HOME_INSURANCE), factory);
    }

    public static Pair m(b bVar, g1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.HOW_IT_WORKS), factory);
    }

    public static Pair n(b bVar, h1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.ILLION_BANKSTATEMENTS), factory);
    }

    public static Pair o(b bVar, mz3.j1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.a(ks3.a.IN_PROGRESS), factory);
    }

    public static Pair p(b bVar, com.revolut.feature.credit.application.plugins.impl.navigation.plugins.a factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.KONTOMATIK, v.k(j1.FIXED_TERM_CREDIT, j1.CREDIT_CARD, j1.CREDIT_CARD_LIMIT_INCREASE)), factory);
    }

    public static Pair q(b bVar, com.revolut.feature.credit.application.plugins.impl.navigation.plugins.b factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.KONTOMATIK_V2, v.k(j1.FIXED_TERM_CREDIT, j1.CREDIT_CARD, j1.CREDIT_CARD_LIMIT_INCREASE)), factory);
    }

    public static Pair r(b bVar, qz3.a factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.LINKED_ACCOUNTS_V2), factory);
    }

    public static Pair s(b bVar, LinkedAccountsV3PluginFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.LINKED_ACCOUNTS_V3), factory);
    }

    public static Pair t(b bVar, r1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.EXIT, u.c(j1.FIXED_TERM_CREDIT)), factory);
    }

    public static Pair u(b bVar, hw3.e creditApplicationConfigInteractor) {
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        fv3.c cVar = new fv3.c(ks3.b.AUTO_PAY, j1.FIXED_TERM_CREDIT);
        Intrinsics.checkNotNullParameter(creditApplicationConfigInteractor, "creditApplicationConfigInteractor");
        return new Pair(cVar, new f(creditApplicationConfigInteractor));
    }

    public static Pair v(b bVar, s1 loanSelectionPluginFactory) {
        Intrinsics.checkNotNullParameter(loanSelectionPluginFactory, "loanSelectionPluginFactory");
        return new Pair(new fv3.c(ks3.b.LOAN_SELECTION), loanSelectionPluginFactory);
    }

    public static Pair w(b bVar, y1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.MANUAL_UNDERWRITING), factory);
    }

    public static Pair x(b bVar, z1 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.EXIT, v.k(j1.MORTGAGE, j1.REFINANCING_MORTGAGE)), factory);
    }

    public static Pair y(b bVar, c2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.MORTGAGE_OFFER), factory);
    }

    public static Pair z(b bVar, d2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.MORTGAGE_REFINANCING_DETAILS_V2), factory);
    }
}
