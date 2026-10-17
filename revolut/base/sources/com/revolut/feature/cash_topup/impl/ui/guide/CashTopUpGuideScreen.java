package com.revolut.feature.cash_topup.impl.ui.guide;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.cash_topup.impl.R$string;
import com.revolut.feature.cash_topup.impl.ui.guide.CashTopUpGuideScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import efm.r;
import jii.x;
import kc3.b;
import kc3.c;
import kc3.d;
import kc3.f;
import kc3.g;
import kc3.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mb3.p;
import mb3.q;
import mb3.z;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/guide/CashTopUpGuideScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lkc3/g;", "Ldli/a;", "Lkc3/i;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CashTopUpGuideScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(CashTopUpGuideScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final f K;
    public final int L;
    public final boolean M;
    public final h N;
    public final TextDelegate O;
    public final Object P;
    public final Object Q;
    public final Object R;

    public CashTopUpGuideScreen(f inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_two_buttons;
        this.M = true;
        this.N = s.t(this, b.f);
        this.O = new TextDelegate();
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: kc3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopUpGuideScreen f182650b;

            {
                this.f182650b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CashTopUpGuideScreen cashTopUpGuideScreen = this.f182650b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CashTopUpGuideScreen.S;
                        CashTopUpGuideScreen cashTopUpGuideScreen2 = this.f182650b;
                        return dli.f.a(cashTopUpGuideScreen2, cashTopUpGuideScreen2.d(), v.k(new RowDelegate(null, null, 7), new FullScreenStateDelegate(), cashTopUpGuideScreen2.O), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CashTopUpGuideScreen.S;
                        qji.b bVarU2 = cashTopUpGuideScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.cash_topup.impl.ui.guide.di.CashTopUpGuideScreenInjector");
                        }
                        z zVar = (z) bVarU2;
                        p pVar = zVar.f204119b;
                        z zVar2 = zVar.f204120c;
                        f fVar = cashTopUpGuideScreen.K;
                        fVar.getClass();
                        return new q(pVar, zVar2, fVar);
                    default:
                        KProperty[] kPropertyArr3 = CashTopUpGuideScreen.S;
                        return (h) ((q) cashTopUpGuideScreen.Q.getValue()).f204099c.get();
                }
            }
        });
        final int i2 = 1;
        this.Q = w.y0(new Function0(this) { // from class: kc3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopUpGuideScreen f182650b;

            {
                this.f182650b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CashTopUpGuideScreen cashTopUpGuideScreen = this.f182650b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CashTopUpGuideScreen.S;
                        CashTopUpGuideScreen cashTopUpGuideScreen2 = this.f182650b;
                        return dli.f.a(cashTopUpGuideScreen2, cashTopUpGuideScreen2.d(), v.k(new RowDelegate(null, null, 7), new FullScreenStateDelegate(), cashTopUpGuideScreen2.O), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CashTopUpGuideScreen.S;
                        qji.b bVarU2 = cashTopUpGuideScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.cash_topup.impl.ui.guide.di.CashTopUpGuideScreenInjector");
                        }
                        z zVar = (z) bVarU2;
                        p pVar = zVar.f204119b;
                        z zVar2 = zVar.f204120c;
                        f fVar = cashTopUpGuideScreen.K;
                        fVar.getClass();
                        return new q(pVar, zVar2, fVar);
                    default:
                        KProperty[] kPropertyArr3 = CashTopUpGuideScreen.S;
                        return (h) ((q) cashTopUpGuideScreen.Q.getValue()).f204099c.get();
                }
            }
        });
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: kc3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CashTopUpGuideScreen f182650b;

            {
                this.f182650b = this;
            }

            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CashTopUpGuideScreen cashTopUpGuideScreen = this.f182650b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CashTopUpGuideScreen.S;
                        CashTopUpGuideScreen cashTopUpGuideScreen2 = this.f182650b;
                        return dli.f.a(cashTopUpGuideScreen2, cashTopUpGuideScreen2.d(), v.k(new RowDelegate(null, null, 7), new FullScreenStateDelegate(), cashTopUpGuideScreen2.O), R$id.screenRecyclerNavbarTwoButtons_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CashTopUpGuideScreen.S;
                        qji.b bVarU2 = cashTopUpGuideScreen.U2();
                        if (bVarU2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.cash_topup.impl.ui.guide.di.CashTopUpGuideScreenInjector");
                        }
                        z zVar = (z) bVarU2;
                        p pVar = zVar.f204119b;
                        z zVar2 = zVar.f204120c;
                        f fVar = cashTopUpGuideScreen.K;
                        fVar.getClass();
                        return new q(pVar, zVar2, fVar);
                    default:
                        KProperty[] kPropertyArr3 = CashTopUpGuideScreen.S;
                        return (h) ((q) cashTopUpGuideScreen.Q.getValue()).f204099c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (q) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174574c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.topup_cash_guide_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        LargeActionButton largeActionButton = d3().f174573b;
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        largeActionButton.setText(new TextLocalisedClause(R$string.topup_cash_guide_eu_actions_find_locations, null, null, 14));
        LargeActionButton largeActionButton2 = d3().e;
        largeActionButton2.o(LargeActionButton.ButtonStyle.f58726b);
        largeActionButton2.setText(new TextLocalisedClause(R$string.topup_cash_guide_eu_actions_set_amount, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174574c.f59410q), null, new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174573b.o), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().e.o), new c(this, null, 2), 3);
        ihm.f fVar = this.O.d;
        d dVar = d.f;
        r map = fVar.map(new joe.e(12));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(map), null, new jl6.b(2, d(), kc3.h.class, "onTermsAndConditionsClicked", "onTermsAndConditionsClicked(Ljava/lang/String;)V", 4, 11), 3);
    }

    public final x d3() {
        ViewBinding value = this.N.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final kc3.h d() {
        return (kc3.h) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.M);
    }
}
