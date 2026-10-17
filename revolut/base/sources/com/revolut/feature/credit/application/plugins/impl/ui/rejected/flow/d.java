package com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow;

import aw0.o9;
import c84.t;
import com.feature.user.details.api.navigation.UserDetailsDestination;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.flow.RejectedLazyFlowContract$Step;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.kompot.common.ModalDestination;
import ft3.j1;
import grl.r2;
import gt3.f;
import hs3.a1;
import hs3.b1;
import hs3.c1;
import hs3.d1;
import hs3.e1;
import hs3.f1;
import hs3.g1;
import hs3.h1;
import hs3.i1;
import hs3.k1;
import hs3.l1;
import hs3.m1;
import it3.k;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import mri.w;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import ph4.g;
import prk.o;
import wli.x;
import xq3.j;
import yji.l;
import yki.i;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends t implements ph4.b {

    @NotNull
    private static final ph4.d Companion = new ph4.d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RejectedLazyFlowContract$InputData f68313p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j f68314q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hw3.c f68315r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hz3.c f68316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f68317t;
    public final sp3.a u;
    public final w v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f68318w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RejectedLazyFlowContract$InputData inputData, j acknowledgementInteractor, hw3.c creditApplicationCommonInteractor, hz3.c creditApplicationCommandsFactory, x deeplinkHandler, sp3.a creditDataMonitoringFacade, w revolutJobInteractor, e84.e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(acknowledgementInteractor, "acknowledgementInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationCommonInteractor, "creditApplicationCommonInteractor");
        Intrinsics.checkNotNullParameter(creditApplicationCommandsFactory, "creditApplicationCommandsFactory");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(creditDataMonitoringFacade, "creditDataMonitoringFacade");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f68313p = inputData;
        this.f68314q = acknowledgementInteractor;
        this.f68315r = creditApplicationCommonInteractor;
        this.f68316s = creditApplicationCommandsFactory;
        this.f68317t = deeplinkHandler;
        this.u = creditDataMonitoringFacade;
        this.v = revolutJobInteractor;
        this.f68318w = d8l.d.a(this, new cnc.t(this, 4));
    }

    public static TextLocalisedClause P2(m1 m1Var) {
        String str = m1Var.f154912b;
        if (str != null) {
            return new TextLocalisedClause(R$string.credit_application_rejected_subtitle, o.v(0, 30, null, null, str), null, 12);
        }
        return null;
    }

    public static TextLocalisedClause Q2(m1 m1Var) {
        return new TextLocalisedClause(R$string.credit_application_rejected_title, u.c(new TextClause(m1Var.f154911a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    public static TextLocalisedClause T2(m1 m1Var) {
        String str = m1Var.f154913c.f154903a;
        return str != null ? new TextLocalisedClause(R$string.credit_application_rejected_primary_button, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : new TextLocalisedClause(R$string.credit_common_ok_got_it, null, null, 14);
    }

    public static TextLocalisedClause U2(m1 m1Var) {
        String str;
        k1 k1Var = m1Var.d;
        if (k1Var != null && (str = k1Var.f154903a) != null) {
            return new TextLocalisedClause(R$string.credit_application_rejected_secondary_button, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        }
        if (m1Var.f154913c.f154904b.equals(c1.f154874a)) {
            return new TextLocalisedClause(R$string.credit_common_ok_got_it, null, null, 14);
        }
        return null;
    }

    public static AnalyticsContext W2(i1 i1Var) {
        if (i1Var != null) {
            return new AnalyticsContext(zw4.a.a(i1Var.N7()));
        }
        return null;
    }

    @Override // yki.j
    public final void M0() {
        Continuation continuation = null;
        l2(new g(this, continuation, 1), new yi5.b(26));
        RejectedLazyFlowContract$InputData rejectedLazyFlowContract$InputData = this.f68313p;
        l1 l1Var = rejectedLazyFlowContract$InputData.f68302a;
        boolean z = l1Var instanceof m1;
        i iVar = this.f68318w;
        if (!z) {
            if (!(l1Var instanceof l1.a)) {
                throw new NoWhenBranchMatchedException();
            }
            h.u2(this, iVar, RejectedLazyFlowContract$Step.RejectedDetails.f68307a, null, 6);
            return;
        }
        int i = ph4.e.f236206a[rejectedLazyFlowContract$InputData.f68303b.ordinal()];
        if (i == 1) {
            h.w2(iVar, new RejectedLazyFlowContract$Step.Rejected((m1) l1Var), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        m1 m1Var = (m1) l1Var;
        TextLocalisedClause textLocalisedClauseQ2 = Q2(m1Var);
        TextLocalisedClause textLocalisedClauseP2 = P2(m1Var);
        TextLocalisedClause textLocalisedClauseT2 = T2(m1Var);
        AnalyticsContext analyticsContextW2 = W2(m1Var.f154913c.f154904b);
        TextLocalisedClause textLocalisedClauseU2 = U2(m1Var);
        k1 k1Var = m1Var.d;
        l.a1(this, X1(new y0(null, new z(textLocalisedClauseQ2, textLocalisedClauseP2, textLocalisedClauseT2, textLocalisedClauseU2, null, null, false, null, analyticsContextW2, W2(k1Var != null ? k1Var.f154904b : null), null, null, null, 29652), false, 5)), null, null, new o4a.b(this, m1Var, continuation, 14), 3);
    }

    public final void R2(i1 i1Var) {
        boolean z = i1Var instanceof h1;
        RejectedLazyFlowContract$InputData rejectedLazyFlowContract$InputData = this.f68313p;
        if (z) {
            O2(this.f68316s.b(), rejectedLazyFlowContract$InputData.f68304c.f66892b);
            return;
        }
        Continuation continuation = null;
        if (i1Var instanceof hs3.y0) {
            O2(null, rejectedLazyFlowContract$InputData.f68304c.f66892b);
            return;
        }
        if (i1Var instanceof c1) {
            CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = rejectedLazyFlowContract$InputData.f68304c;
            V2(creditApplicationPluginFlowContract$Configuration.d, creditApplicationPluginFlowContract$Configuration.e, creditApplicationPluginFlowContract$Configuration.f66898m, creditApplicationPluginFlowContract$Configuration.k);
            return;
        }
        if (i1Var instanceof d1) {
            V2(j1.FIXED_TERM_CREDIT, gt3.d.LOAN, null, null);
            return;
        }
        if (i1Var instanceof a1) {
            O2(u0.f(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(null, null, null, 7), null, null, 6), true)), rejectedLazyFlowContract$InputData.f68304c.f66892b);
            return;
        }
        if (i1Var instanceof g1) {
            O2(gc0.c.f(new MainScreenFeatureConfig.StartFromOutside(t49.a.f267949a)), rejectedLazyFlowContract$InputData.f68304c.f66892b);
            return;
        }
        if (i1Var instanceof e1) {
            l2(new g(this, continuation, 0), new yi5.b(26));
        } else if (i1Var instanceof f1) {
            O2(u0.f(UserDetailsDestination.f26226a), rejectedLazyFlowContract$InputData.f68304c.f66892b);
        } else {
            if (!(i1Var instanceof b1)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new pdi.j(this, i1Var, continuation, 11), new yi5.b(26));
        }
    }

    public final void S2(String str, m1 m1Var) {
        if (!Intrinsics.f(str, "revolut://app/credit/bureaus")) {
            l2(new ph4.h(str, this, (Continuation) null), new yi5.b(26));
            return;
        }
        h.z2(this.f68318w, new RejectedLazyFlowContract$Step.Bureaus(m1Var), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
    }

    public final void V2(j1 j1Var, f fVar, k kVar, String str) {
        O2(gc0.c.f(new CreditApplicationFeatureConfig.StartApplication(j1Var, fVar, null, str, new ft3.a1(r2.APPLICATION_REJECTED, null, null, s.A(kVar), null, 22), 6652)), this.f68313p.f68304c.f66892b);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f68318w;
    }
}
