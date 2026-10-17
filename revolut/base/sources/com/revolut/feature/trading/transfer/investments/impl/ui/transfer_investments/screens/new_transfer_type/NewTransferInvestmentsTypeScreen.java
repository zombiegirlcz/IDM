package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.screens.new_transfer_type;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trading.transfer.investments.impl.R$string;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.screens.new_transfer_type.NewTransferInvestmentsTypeScreen;
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
import taf.b;
import taf.c;
import taf.g;
import taf.h;
import taf.i;
import taf.j;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/ui/transfer_investments/screens/new_transfer_type/NewTransferInvestmentsTypeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ltaf/h;", "Ldli/a;", "Ltaf/j;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewTransferInvestmentsTypeScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(NewTransferInvestmentsTypeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final g K;
    public final ao.h L;
    public final RowDelegate M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public NewTransferInvestmentsTypeScreen(g inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new RowDelegate(null, null, 7);
        this.N = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: taf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewTransferInvestmentsTypeScreen f269309b;

            {
                this.f269309b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                NewTransferInvestmentsTypeScreen newTransferInvestmentsTypeScreen = this.f269309b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = NewTransferInvestmentsTypeScreen.R;
                        qji.b bVarU2 = newTransferInvestmentsTypeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.screens.new_transfer_type.di.NewTransferInvestmentsTypeScreenInjector");
                        l9f.l lVar = (l9f.l) bVarU2;
                        l9f.k kVar = lVar.f193200b;
                        l9f.l lVar2 = lVar.f193201c;
                        g gVar = newTransferInvestmentsTypeScreen.K;
                        gVar.getClass();
                        return new l9f.e(kVar, lVar2, gVar);
                    case 1:
                        KProperty[] kPropertyArr2 = NewTransferInvestmentsTypeScreen.R;
                        return (i) ((l9f.e) newTransferInvestmentsTypeScreen.O.getValue()).f193165c.get();
                    default:
                        KProperty[] kPropertyArr3 = NewTransferInvestmentsTypeScreen.R;
                        NewTransferInvestmentsTypeScreen newTransferInvestmentsTypeScreen2 = this.f269309b;
                        return dli.f.a(newTransferInvestmentsTypeScreen2, (i) newTransferInvestmentsTypeScreen2.P.getValue(), v.k(new RowLoadingDelegate(), newTransferInvestmentsTypeScreen2.M, new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: taf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewTransferInvestmentsTypeScreen f269309b;

            {
                this.f269309b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                NewTransferInvestmentsTypeScreen newTransferInvestmentsTypeScreen = this.f269309b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NewTransferInvestmentsTypeScreen.R;
                        qji.b bVarU2 = newTransferInvestmentsTypeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.screens.new_transfer_type.di.NewTransferInvestmentsTypeScreenInjector");
                        l9f.l lVar = (l9f.l) bVarU2;
                        l9f.k kVar = lVar.f193200b;
                        l9f.l lVar2 = lVar.f193201c;
                        g gVar = newTransferInvestmentsTypeScreen.K;
                        gVar.getClass();
                        return new l9f.e(kVar, lVar2, gVar);
                    case 1:
                        KProperty[] kPropertyArr2 = NewTransferInvestmentsTypeScreen.R;
                        return (i) ((l9f.e) newTransferInvestmentsTypeScreen.O.getValue()).f193165c.get();
                    default:
                        KProperty[] kPropertyArr3 = NewTransferInvestmentsTypeScreen.R;
                        NewTransferInvestmentsTypeScreen newTransferInvestmentsTypeScreen2 = this.f269309b;
                        return dli.f.a(newTransferInvestmentsTypeScreen2, (i) newTransferInvestmentsTypeScreen2.P.getValue(), v.k(new RowLoadingDelegate(), newTransferInvestmentsTypeScreen2.M, new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: taf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NewTransferInvestmentsTypeScreen f269309b;

            {
                this.f269309b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                NewTransferInvestmentsTypeScreen newTransferInvestmentsTypeScreen = this.f269309b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = NewTransferInvestmentsTypeScreen.R;
                        qji.b bVarU2 = newTransferInvestmentsTypeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.transfer.investments.impl.ui.transfer_investments.screens.new_transfer_type.di.NewTransferInvestmentsTypeScreenInjector");
                        l9f.l lVar = (l9f.l) bVarU2;
                        l9f.k kVar = lVar.f193200b;
                        l9f.l lVar2 = lVar.f193201c;
                        g gVar = newTransferInvestmentsTypeScreen.K;
                        gVar.getClass();
                        return new l9f.e(kVar, lVar2, gVar);
                    case 1:
                        KProperty[] kPropertyArr2 = NewTransferInvestmentsTypeScreen.R;
                        return (i) ((l9f.e) newTransferInvestmentsTypeScreen.O.getValue()).f193165c.get();
                    default:
                        KProperty[] kPropertyArr3 = NewTransferInvestmentsTypeScreen.R;
                        NewTransferInvestmentsTypeScreen newTransferInvestmentsTypeScreen2 = this.f269309b;
                        return dli.f.a(newTransferInvestmentsTypeScreen2, (i) newTransferInvestmentsTypeScreen2.P.getValue(), v.k(new RowLoadingDelegate(), newTransferInvestmentsTypeScreen2.M, new FullScreenStateDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l9f.e) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (i) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.trading_stocks_transfer_in_transfer_type_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.trading_stocks_transfer_in_transfer_type_title, null, null, 14));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new t05.m(this, null, 15), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.Q.getValue();
    }
}
