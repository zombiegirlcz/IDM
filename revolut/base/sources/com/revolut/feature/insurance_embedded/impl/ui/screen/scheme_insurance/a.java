package com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance;

import aw0.o9;
import cli.n;
import cli.y;
import cnc.t;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.insurance_embedded.impl.data.model.SchemeInsuranceActivateCoverageWidget;
import com.revolut.feature.insurance_embedded.impl.ui.screen.scheme_insurance.SchemeInsuranceDetailsScreenContract$ModalStep;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.common.ui.R$string;
import cvi.j;
import cw7.f;
import cw7.g;
import cw7.i;
import gu7.l5;
import gu7.p5;
import gu7.q5;
import gu7.s4;
import gu7.t4;
import gu7.u4;
import gu7.v5;
import gu7.w4;
import gu7.x4;
import hu7.o;
import hx7.e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import yi5.b;
import yji.l;
import zh9.u0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements g {
    public final SchemeInsuranceDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f76148p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f76149q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f76150r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f76151s;

    public a(n stateMapper, SchemeInsuranceDetailsScreenContract$InputData inputData, o schemeInsuranceRepository, j60.a bottomExpandableDialogControllerExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(schemeInsuranceRepository, "schemeInsuranceRepository");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        this.o = inputData;
        this.f76148p = schemeInsuranceRepository;
        this.f76149q = bottomExpandableDialogControllerExtension;
        this.f76150r = d.b(this, new f(0), stateMapper, null, false, 12);
        this.f76151s = e.a(this, new t(this, 28));
    }

    @Override // yji.l
    public final void I1() {
        String product = this.o.f76144a;
        o oVar = this.f76148p;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(product, "product");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        l.a1(this, oVar.d.b(new hu7.n(product), loadingStrategy), null, null, new j(this, (Continuation) null, 3), 3);
    }

    public final void I2(Object obj2, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        boolean zF = Intrinsics.f(id10, "ID_DIALOG_GOT_IT_BUTTON");
        j60.a aVar = this.f76149q;
        Continuation continuation = null;
        if (zF) {
            j60.a.v(aVar, false, null, 3);
            return;
        }
        if (obj2 instanceof v5) {
            v5 v5Var = (v5) obj2;
            rp0.l lVar = rp0.l.WINDOW;
            LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.common_action_got_it, null, null, 14);
            int i = R$attr.uikit_dp16;
            aVar.x(new rp0.y(u.c(new LargeActionButtonDelegate.Model("ID_DIALOG_GOT_IT_BUTTON", defaultFilledButton, null, textLocalisedClause, false, null, null, i, i, i, i, 496)), new rp0.t(new TextClause(v5Var.f146850a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new HtmlClause(0, 30, (Integer) null, (Object) null, v5Var.f146851b), null, 28), lVar, null, null, null, 1016));
            return;
        }
        if (obj2 instanceof q5) {
            q5 q5Var = (q5) obj2;
            p5 p5Var = q5Var.f146818a;
            String str = q5Var.f146819b;
            int i2 = i.f109565a[p5Var.ordinal()];
            if (i2 == 1) {
                J2(str);
                return;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                A1(new cn0.d(this, str, continuation, 21), new b(25));
                return;
            }
        }
        boolean z = obj2 instanceof w4;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = this.f76151s;
        if (!z) {
            if (obj2 instanceof l5) {
                C1(u0.c(new CardDesignFeatureConfig(b93.e.PHYSICAL, null, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 536870910)));
                return;
            } else {
                if (obj2 instanceof SchemeInsuranceActivateCoverageWidget) {
                    h.v2(aVar2, new SchemeInsuranceDetailsScreenContract$ModalStep.CoverageActivation((SchemeInsuranceActivateCoverageWidget) obj2), popup);
                    return;
                }
                return;
            }
        }
        w4 w4Var = (w4) obj2;
        if (w4Var instanceof t4) {
            C1(nu7.a.b(((t4) w4Var).f146836a));
            return;
        }
        if (w4Var instanceof u4) {
            C1(nu7.a.c(((u4) w4Var).f146843a));
            return;
        }
        if (w4Var instanceof x4) {
            J2(((x4) w4Var).f146867a);
        } else {
            if (w4Var instanceof w4.a) {
                return;
            }
            if (!(w4Var instanceof s4)) {
                throw new NoWhenBranchMatchedException();
            }
            s4 s4Var = (s4) w4Var;
            h.v2(aVar2, new SchemeInsuranceDetailsScreenContract$ModalStep.CarClaims(s4Var.f146831a, s4Var.f146832b), popup);
        }
    }

    public final void J2(String str) {
        C1(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(str, WebViewScreenTitleSource.Html.f98166a, false)), null, true));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f76151s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f76150r;
    }
}
