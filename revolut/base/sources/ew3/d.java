package ew3;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.StatusDialogPluginFactory;
import com.revolut.feature.credit.application.plugins.impl.navigation.plugins.WorkflowPluginFactory;
import e4m.e;
import ewg.r;
import ft3.j1;
import java.util.Set;
import kg.o;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import mz3.a3;
import mz3.b0;
import mz3.b3;
import mz3.c3;
import mz3.d3;
import mz3.e3;
import mz3.g3;
import mz3.i3;
import mz3.j0;
import mz3.j3;
import mz3.k3;
import mz3.l2;
import mz3.l3;
import mz3.m3;
import mz3.q2;
import mz3.q3;
import mz3.s2;
import mz3.u2;
import mz3.u3;
import mz3.v2;
import mz3.v3;
import mz3.w3;
import mz3.x2;
import mz3.y2;
import mz3.z2;
import retrofit2.Retrofit;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public abstract class d implements e {
    public static Pair A(b bVar, WorkflowPluginFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.a(ks3.a.WORKFLOW), factory);
    }

    public static Pair B(b bVar, WorkflowPluginFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.QUESTIONNAIRE_WORKFLOW), factory);
    }

    public static a C(b bVar, ImmutableSet factories) {
        Intrinsics.checkNotNullParameter(factories, "factories");
        return new a((Set) factories);
    }

    public static Retrofit D(o gson, Retrofit retrofit) {
        r.Companion.getClass();
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Intrinsics.checkNotNullParameter(gson, "gson");
        return j6.a.B(retrofit.newBuilder(), gson, "build(...)");
    }

    public static Pair a(b bVar, l2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.OFFER), factory);
    }

    public static Pair b(b bVar, q2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.OFFER_V2), factory);
    }

    public static Pair c(b bVar, s2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.OUTSTANDING_DEBTS), factory);
    }

    public static Pair d(b bVar, u2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.OUTSTANDING_DEBTS_V2), factory);
    }

    public static Pair e(b bVar, v2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.OUTSTANDING_DEBTS_V3), factory);
    }

    public static Pair f(b bVar, b0 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.EXIT, j1.OVERDRAFT), factory);
    }

    public static Pair g(b bVar, x2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.OVERDRAFT_OFFER), factory);
    }

    public static Pair h(b bVar, y2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.PAYMENT), factory);
    }

    public static Pair i(b bVar, z2 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.PERSONAL_DETAILS), factory);
    }

    public static Pair j(b bVar, a3 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.PHOTOS_UPLOAD), factory);
    }

    public static Pair k(b bVar, b3 planSelectionPluginFactory) {
        Intrinsics.checkNotNullParameter(planSelectionPluginFactory, "planSelectionPluginFactory");
        return new Pair(new fv3.c(ks3.b.PLAN_SELECTION), planSelectionPluginFactory);
    }

    public static Pair l(b bVar, c3 planSubscribePluginFactory) {
        Intrinsics.checkNotNullParameter(planSubscribePluginFactory, "planSubscribePluginFactory");
        return new Pair(new fv3.c(ks3.b.PLAN_SUBSCRIBE), planSubscribePluginFactory);
    }

    public static Pair m(b bVar, d3 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.a(ks3.a.PRODUCT_ARTICLES), factory);
    }

    public static Pair n(b bVar, hz3.c commandsFactory, sp3.a creditDataMonitoringFacade) {
        Intrinsics.checkNotNullParameter(commandsFactory, "commandsFactory");
        Intrinsics.checkNotNullParameter(creditDataMonitoringFacade, "creditDataMonitoringFacade");
        return new Pair(new fv3.c(ks3.b.QUESTIONNAIRE), new j0(commandsFactory, creditDataMonitoringFacade));
    }

    public static Pair o(b bVar, e3 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.REFINANCING_ACCOUNT_DETAILS), factory);
    }

    public static Pair p(b bVar, g3 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.REFINANCING_OFFER), factory);
    }

    public static Pair q(b bVar, i3 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.a(ks3.a.REJECTED), factory);
    }

    public static Pair r(b bVar, j3 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.ROLLEE), factory);
    }

    public static Pair s(b bVar, k3 securityDepositPluginFactory) {
        Intrinsics.checkNotNullParameter(securityDepositPluginFactory, "securityDepositPluginFactory");
        return new Pair(new fv3.c(ks3.b.SECURITY_DEPOSIT), securityDepositPluginFactory);
    }

    public static Pair t(b bVar, l3 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.SEPA_DIRECT_DEBIT), factory);
    }

    public static Pair u(b bVar, m3 securityDepositPluginFactory) {
        Intrinsics.checkNotNullParameter(securityDepositPluginFactory, "securityDepositPluginFactory");
        return new Pair(new fv3.c(ks3.b.SOLICITOR_SELECTION), securityDepositPluginFactory);
    }

    public static Pair v(b bVar, q3 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.SPOUSAL_CONSENT_INITIATOR, v.k(j1.FIXED_TERM_CREDIT, j1.CREDIT_CARD, j1.CREDIT_CARD_LIMIT_INCREASE)), factory);
    }

    public static Pair w(b bVar, u3 factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new Pair(new fv3.c(ks3.b.SPOUSAL_CONSENT_PARTNER, v.k(j1.FIXED_TERM_CREDIT, j1.CREDIT_CARD, j1.CREDIT_CARD_LIMIT_INCREASE)), factory);
    }

    public static Pair x(b bVar, StatusDialogPluginFactory statusDialogPluginFactory) {
        Intrinsics.checkNotNullParameter(statusDialogPluginFactory, "statusDialogPluginFactory");
        return new Pair(new fv3.a(ks3.a.STATUS_DIALOG), statusDialogPluginFactory);
    }

    public static Pair y(b bVar, v3 userSelectionPluginFactory) {
        Intrinsics.checkNotNullParameter(userSelectionPluginFactory, "userSelectionPluginFactory");
        return new Pair(new fv3.c(ks3.b.USER_SELECTION), userSelectionPluginFactory);
    }

    public static Pair z(b bVar, w3 prequalificationPluginFactory) {
        Intrinsics.checkNotNullParameter(prequalificationPluginFactory, "prequalificationPluginFactory");
        return new Pair(new fv3.c(ks3.b.VISIBLE_PREQUALIFICATION), prequalificationPluginFactory);
    }
}
