package com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.prepay_schedule;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.prepay_schedule.CreditCardAnticipationPrepayScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import ep4.b;
import jm4.h4;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import qs4.c;
import qs4.g;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/anticipation/prepay_schedule/CreditCardAnticipationPrepayScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "", "Ldli/a;", "Lqs4/g;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardAnticipationPrepayScreen extends ViewController<Object> implements a, m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CreditCardAnticipationPrepayScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final CreditCardAnticipationPrepayScreenContract$InputData L;
    public final int M;
    public final Object N;
    public final h O;
    public final Object P;
    public final Object Q;

    public CreditCardAnticipationPrepayScreen(CreditCardAnticipationPrepayScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = inputData;
        this.M = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: qs4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardAnticipationPrepayScreen f248745b;

            {
                this.f248745b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CreditCardAnticipationPrepayScreen creditCardAnticipationPrepayScreen = this.f248745b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardAnticipationPrepayScreen.R;
                        CreditCardAnticipationPrepayScreen creditCardAnticipationPrepayScreen2 = this.f248745b;
                        return dli.f.a(creditCardAnticipationPrepayScreen2, (h) creditCardAnticipationPrepayScreen2.Q.getValue(), u.c(new ProgressStepVerticalV2Delegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardAnticipationPrepayScreen.R;
                        qji.b bVarU2 = creditCardAnticipationPrepayScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.prepay_schedule.di.CreditCardAnticipationPrepayScreenInjector");
                        return (h4) ((rs4.a) ((rs4.b) bVarU2).j().mo3808a(creditCardAnticipationPrepayScreen)).p(creditCardAnticipationPrepayScreen.L).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardAnticipationPrepayScreen.R;
                        h4 h4Var = (h4) creditCardAnticipationPrepayScreen.P.getValue();
                        switch (h4Var.f176110a) {
                            case 0:
                                return (h) h4Var.d.get();
                            default:
                                return (h) h4Var.d.get();
                        }
                }
            }
        });
        this.O = s.t(this, qs4.b.f);
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: qs4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardAnticipationPrepayScreen f248745b;

            {
                this.f248745b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CreditCardAnticipationPrepayScreen creditCardAnticipationPrepayScreen = this.f248745b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardAnticipationPrepayScreen.R;
                        CreditCardAnticipationPrepayScreen creditCardAnticipationPrepayScreen2 = this.f248745b;
                        return dli.f.a(creditCardAnticipationPrepayScreen2, (h) creditCardAnticipationPrepayScreen2.Q.getValue(), u.c(new ProgressStepVerticalV2Delegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardAnticipationPrepayScreen.R;
                        qji.b bVarU2 = creditCardAnticipationPrepayScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.prepay_schedule.di.CreditCardAnticipationPrepayScreenInjector");
                        return (h4) ((rs4.a) ((rs4.b) bVarU2).j().mo3808a(creditCardAnticipationPrepayScreen)).p(creditCardAnticipationPrepayScreen.L).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardAnticipationPrepayScreen.R;
                        h4 h4Var = (h4) creditCardAnticipationPrepayScreen.P.getValue();
                        switch (h4Var.f176110a) {
                            case 0:
                                return (h) h4Var.d.get();
                            default:
                                return (h) h4Var.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: qs4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardAnticipationPrepayScreen f248745b;

            {
                this.f248745b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CreditCardAnticipationPrepayScreen creditCardAnticipationPrepayScreen = this.f248745b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardAnticipationPrepayScreen.R;
                        CreditCardAnticipationPrepayScreen creditCardAnticipationPrepayScreen2 = this.f248745b;
                        return dli.f.a(creditCardAnticipationPrepayScreen2, (h) creditCardAnticipationPrepayScreen2.Q.getValue(), u.c(new ProgressStepVerticalV2Delegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CreditCardAnticipationPrepayScreen.R;
                        qji.b bVarU2 = creditCardAnticipationPrepayScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.prepay_schedule.di.CreditCardAnticipationPrepayScreenInjector");
                        return (h4) ((rs4.a) ((rs4.b) bVarU2).j().mo3808a(creditCardAnticipationPrepayScreen)).p(creditCardAnticipationPrepayScreen.L).mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CreditCardAnticipationPrepayScreen.R;
                        h4 h4Var = (h4) creditCardAnticipationPrepayScreen.P.getValue();
                        switch (h4Var.f176110a) {
                            case 0:
                                return (h) h4Var.d.get();
                            default:
                                return (h) h4Var.d.get();
                        }
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((g) oVar);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.K.getClass();
        return b.f128076b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (h4) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (qs4.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_card_anticipation_instalments_to_repay_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_card_anticipation_instalments_to_repay_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.credit_card_anticipation_instalments_to_repay_subtitle, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        d3().f174564b.setText(new TextLocalisedClause(R$string.credit_common_got_it, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new c(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new c(this, null, 1), 3);
    }

    public final jii.u d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
