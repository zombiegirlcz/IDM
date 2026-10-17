package com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import b75.d;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.instalment.repay.anticipation.confirmation.CreditCardAnticipationConfirmationScreen;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import ep4.b;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import ns4.h;
import ns4.i;
import ns4.j;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/repay/anticipation/confirmation/CreditCardAnticipationConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lns4/h;", "Ldli/a;", "Lns4/j;", "Lno/m;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditCardAnticipationConfirmationScreen extends ViewController<h> implements dli.a, m {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CreditCardAnticipationConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final /* synthetic */ b K;
    public final int L;
    public final Object M;
    public final Object N;
    public final ao.h O;
    public final Object P;
    public final Object Q;

    public CreditCardAnticipationConfirmationScreen(CreditCardAnticipationConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = b.f128075a;
        this.L = R$layout.screen_recycler_navbar_nextbutton;
        this.M = w.y0(new ns1.a(1));
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: ns4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardAnticipationConfirmationScreen f218738b;

            {
                this.f218738b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardAnticipationConfirmationScreen.R;
                        CreditCardAnticipationConfirmationScreen creditCardAnticipationConfirmationScreen = this.f218738b;
                        return dli.f.a(creditCardAnticipationConfirmationScreen, (i) creditCardAnticipationConfirmationScreen.Q.getValue(), v.k((CellDetailsActionDelegate) creditCardAnticipationConfirmationScreen.M.getValue(), new CounterTextDelegate(), new CellDetailsDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CreditCardAnticipationConfirmationScreen.R;
                        return (i) ((jm4.h0) this.f218738b.P.getValue()).f176100c.get();
                }
            }
        });
        this.O = s.t(this, ns4.b.f);
        this.P = w.y0(new ni1.a(this, inputData, 28));
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: ns4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditCardAnticipationConfirmationScreen f218738b;

            {
                this.f218738b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CreditCardAnticipationConfirmationScreen.R;
                        CreditCardAnticipationConfirmationScreen creditCardAnticipationConfirmationScreen = this.f218738b;
                        return dli.f.a(creditCardAnticipationConfirmationScreen, (i) creditCardAnticipationConfirmationScreen.Q.getValue(), v.k((CellDetailsActionDelegate) creditCardAnticipationConfirmationScreen.M.getValue(), new CounterTextDelegate(), new CellDetailsDelegate()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = CreditCardAnticipationConfirmationScreen.R;
                        return (i) ((jm4.h0) this.f218738b.P.getValue()).f176100c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((j) oVar);
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
        return (jm4.h0) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (i) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.credit_card_anticipation_confirm_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.credit_card_anticipation_confirm_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f174564b.setText(new TextLocalisedClause(R$string.credit_card_anticipation_confirm_action, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, new d(rd0.e.b(((CellDetailsActionDelegate) this.M.getValue()).d), yx4.b.Companion, 13), null, new nn7.d(this, null, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new ns4.d(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new ns4.d(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.O.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
