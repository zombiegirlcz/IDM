package com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fees_info;

import a07.d;
import agh.b;
import agh.f;
import agh.g;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.private_equity.impl.ui.fund_details.fees_info.FundFeesInfoScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nfh.c;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth/private_equity/impl/ui/fund_details/fees_info/FundFeesInfoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FundFeesInfoScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(FundFeesInfoScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final h K;
    public final Object L;
    public final int M;
    public final Object N;
    public final Object O;

    public FundFeesInfoScreen(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = s.t(this, agh.c.f);
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: agh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundFeesInfoScreen f4822b;

            {
                this.f4822b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = FundFeesInfoScreen.P;
                        return (e) ((ufh.b) this.f4822b.O.getValue()).f279829b.get();
                    default:
                        KProperty[] kPropertyArr2 = FundFeesInfoScreen.P;
                        FundFeesInfoScreen fundFeesInfoScreen = this.f4822b;
                        return dli.f.a(fundFeesInfoScreen, (e) fundFeesInfoScreen.L.getValue(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.M = R$layout.screen_recycler_navbar;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: agh.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundFeesInfoScreen f4822b;

            {
                this.f4822b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FundFeesInfoScreen.P;
                        return (e) ((ufh.b) this.f4822b.O.getValue()).f279829b.get();
                    default:
                        KProperty[] kPropertyArr2 = FundFeesInfoScreen.P;
                        FundFeesInfoScreen fundFeesInfoScreen = this.f4822b;
                        return dli.f.a(fundFeesInfoScreen, (e) fundFeesInfoScreen.L.getValue(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), new FullScreenStateDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.O = w.y0(new b(this, inputData, 0));
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        f fVar = uiState.f4831a;
        TextLocalisedClause textLocalisedClause = fVar.f4829a;
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(fVar.f4830b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ufh.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (agh.e) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new d(this, null, 22), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
