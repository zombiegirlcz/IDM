package oh4;

import aw0.o9;
import cli.n;
import cli.y;
import com.feature.user.details.api.navigation.UserDetailsDestination;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.RejectedControllerContract$InputData;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.retail.core.navigation.NaviCommand;
import ft3.j1;
import ft3.r0;
import ft3.s0;
import ft3.t0;
import ft3.v0;
import ft3.w0;
import ft3.x0;
import grl.r2;
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
import hs3.m1;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mri.w;
import nii.y0;
import nii.z;
import nya.i0;
import org.jetbrains.annotations.NotNull;
import prk.o;
import rp0.m;
import rp0.t;
import wli.x;
import yhm.m;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends oki.h implements e {

    @NotNull
    public static final g Companion = new g();
    public final xq3.j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hw3.c f225296p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f225297q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RejectedControllerContract$InputData f225298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hz3.c f225299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j60.a f225300t;
    public final a u;
    public final c84.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x f225301w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f225302x;

    public l(xq3.j interactor, hw3.c creditApplicationCommonInteractor, w revolutJobInteractor, RejectedControllerContract$InputData inputData, hz3.c creditApplicationCommandsFactory, j60.a bottomDialogExtension, a bureausMapper, c84.b analyticsPluginScreenControllerModelExtension, x deeplinkHandler, n stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(creditApplicationCommonInteractor, "creditApplicationCommonInteractor");
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditApplicationCommandsFactory, "creditApplicationCommandsFactory");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(bureausMapper, "bureausMapper");
        Intrinsics.checkNotNullParameter(analyticsPluginScreenControllerModelExtension, "analyticsPluginScreenControllerModelExtension");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f225296p = creditApplicationCommonInteractor;
        this.f225297q = revolutJobInteractor;
        this.f225298r = inputData;
        this.f225299s = creditApplicationCommandsFactory;
        this.f225300t = bottomDialogExtension;
        this.u = bureausMapper;
        this.v = analyticsPluginScreenControllerModelExtension;
        this.f225301w = deeplinkHandler;
        this.f225302x = mra.d.b(this, cli.k.f25028a, stateMapper, null, false, 12);
    }

    public static TextLocalisedClause J2(m1 m1Var) {
        String str = m1Var.f154912b;
        if (str != null) {
            return new TextLocalisedClause(R$string.credit_application_rejected_subtitle, o.v(0, 30, null, null, str), null, 12);
        }
        return null;
    }

    public static TextLocalisedClause K2(m1 m1Var) {
        return new TextLocalisedClause(R$string.credit_application_rejected_title, u.c(new TextClause(m1Var.f154911a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
    }

    public static TextLocalisedClause M2(m1 m1Var) {
        String str = m1Var.f154913c.f154903a;
        return str != null ? new TextLocalisedClause(R$string.credit_application_rejected_primary_button, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : new TextLocalisedClause(R$string.credit_common_ok_got_it, null, null, 14);
    }

    public static TextLocalisedClause N2(m1 m1Var) {
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

    public static AnalyticsContext P2(i1 i1Var) {
        return new AnalyticsContext(zw4.a.a(i1Var.N7()));
    }

    @Override // yji.l
    public final void I1() {
        LargeActionButtonDelegate.Model model;
        RejectedControllerContract$InputData rejectedControllerContract$InputData = this.f225298r;
        m1 m1Var = rejectedControllerContract$InputData.f68299a;
        int i = h.f225290a[rejectedControllerContract$InputData.f68300b.ordinal()];
        j60.a aVar = this.f225300t;
        Continuation continuation = null;
        if (i == 1) {
            m.b bVar = rp0.m.Companion;
            t tVar = new t(K2(m1Var), J2(m1Var), null, 28);
            LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_BUTTON_PRIMARY", LargeActionButton.ButtonStyle.f58725a, null, M2(m1Var), false, null, null, null, P2(m1Var.f154913c.f154904b), 488);
            yp0.b.r(model2, R$attr.uikit_dp24, N2(m1Var) != null ? R$attr.uikit_dp8 : R$attr.uikit_dp24, 0, 0, 12);
            TextLocalisedClause textLocalisedClauseN2 = N2(m1Var);
            if (textLocalisedClauseN2 != null) {
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
                k1 k1Var = m1Var.d;
                model = new LargeActionButtonDelegate.Model("ID_BUTTON_SECONDARY", defaultFilledButton, null, textLocalisedClauseN2, false, null, null, null, k1Var != null ? P2(k1Var.f154904b) : null, 488);
                yp0.b.r(model, 0, R$attr.uikit_dp24, 0, 0, 13);
            } else {
                model = null;
            }
            LargeActionButtonDelegate.Model[] elements = {model2, model};
            Intrinsics.checkNotNullParameter(elements, "elements");
            aVar.x(dy4.b.b(bVar, kotlin.collections.d.L(elements), tVar, rp0.l.WINDOW, null, this.v.f22074l, null, 760));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            TextLocalisedClause textLocalisedClauseK2 = K2(m1Var);
            TextLocalisedClause textLocalisedClauseJ2 = J2(m1Var);
            TextLocalisedClause textLocalisedClauseM2 = M2(m1Var);
            AnalyticsContext analyticsContextP2 = P2(m1Var.f154913c.f154904b);
            TextLocalisedClause textLocalisedClauseN22 = N2(m1Var);
            k1 k1Var2 = m1Var.d;
            yji.l.a1(this, X1(new y0(null, new z(textLocalisedClauseK2, textLocalisedClauseJ2, textLocalisedClauseM2, textLocalisedClauseN22, null, null, false, null, analyticsContextP2, k1Var2 != null ? P2(k1Var2.f154904b) : null, null, null, null, 29652), false, 5)), null, null, new k(this, continuation, 1), 3);
        }
        yji.l.a1(this, rd0.e.b(aVar.E()), null, null, new ocb.d(this, continuation, 5), 3);
        yji.l.a1(this, rd0.e.b(aVar.C()), null, null, new k(this, continuation, 0), 3);
    }

    public final void I2(NaviCommand naviCommand) {
        C2(new f(naviCommand));
    }

    public final void L2(i1 action) throws Throwable {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof h1) {
            I2(this.f225299s.b());
            return;
        }
        Continuation continuation = null;
        if (action instanceof hs3.y0) {
            I2(null);
            return;
        }
        if (action instanceof c1) {
            CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$Configuration = this.f225298r.f68301c;
            O2(creditApplicationPluginFlowContract$Configuration.d, creditApplicationPluginFlowContract$Configuration.e, creditApplicationPluginFlowContract$Configuration.f66898m, creditApplicationPluginFlowContract$Configuration.k);
            return;
        }
        if (action instanceof d1) {
            O2(j1.FIXED_TERM_CREDIT, gt3.d.LOAN, null, null);
            return;
        }
        if (action instanceof a1) {
            I2(u0.f(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(null, null, null, 7), null, null, 6), true)));
            return;
        }
        if (action instanceof g1) {
            I2(gc0.c.f(new MainScreenFeatureConfig.StartFromOutside(t49.a.f267949a)));
            return;
        }
        if (action instanceof e1) {
            n2(new j(this, continuation, 1), new whi.b(6));
        } else if (action instanceof f1) {
            I2(u0.f(UserDetailsDestination.f26226a));
        } else {
            if (!(action instanceof b1)) {
                throw new NoWhenBranchMatchedException();
            }
            n2(new i0(this, action, null, 29), new whi.b(6));
        }
    }

    public final void O2(j1 j1Var, gt3.f fVar, it3.k kVar, String str) throws Throwable {
        r2 r2Var = r2.APPLICATION_REJECTED;
        ft3.y0 y0Var = null;
        switch (kVar == null ? -1 : h.f225291b[kVar.ordinal()]) {
            case -1:
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                y0Var = x0.f137890a;
                break;
            case 2:
                y0Var = v0.f137882a;
                break;
            case 3:
                y0Var = w0.f137887a;
                break;
            case 4:
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    throw new IllegalStateException("Invitee can't start application without getting another invitation from facility owner");
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    Throwable thA = yhm.m.a(yhm.o.a(th10));
                    if (thA != null) {
                        hx7.e.n(thA);
                    }
                }
                break;
            case 5:
                y0Var = t0.f137874a;
                break;
            case 6:
                y0Var = s0.f137872a;
                break;
            case 7:
                y0Var = r0.f137867a;
                break;
        }
        I2(gc0.c.f(new CreditApplicationFeatureConfig.StartApplication(j1Var, fVar, null, str, new ft3.a1(r2Var, null, null, y0Var, null, 22), 6652)));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f225302x;
    }
}
