package com.revolut.feature.masav.impl.ui.payment_authorisation.confirmation;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.masav.api.R$string;
import com.revolut.feature.masav.impl.ui.payment_authorisation.confirmation.MasavPayToMerchantConfirmationScreen;
import com.revolut.feature.masav.impl.ui.payment_authorisation.confirmation.MasavPayToMerchantConfirmationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import e69.b;
import e69.c;
import e69.d;
import e69.g;
import e69.n;
import jii.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/masav/impl/ui/payment_authorisation/confirmation/MasavPayToMerchantConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Le69/n;", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MasavPayToMerchantConfirmationScreen extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(MasavPayToMerchantConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarActionFooterBinding;", 0))};
    public final MasavPayToMerchantConfirmationScreenContract$InputData K;
    public final h L;
    public final CellDetailsDelegate M;
    public final FullScreenStateDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final int R;

    public MasavPayToMerchantConfirmationScreen(MasavPayToMerchantConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        this.M = new CellDetailsDelegate();
        this.N = new FullScreenStateDelegate();
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: e69.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MasavPayToMerchantConfirmationScreen f122940b;

            {
                this.f122940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MasavPayToMerchantConfirmationScreen masavPayToMerchantConfirmationScreen = this.f122940b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MasavPayToMerchantConfirmationScreen.S;
                        MasavPayToMerchantConfirmationScreen masavPayToMerchantConfirmationScreen2 = this.f122940b;
                        return dli.f.a(masavPayToMerchantConfirmationScreen2, masavPayToMerchantConfirmationScreen2.d(), zhm.v.k(masavPayToMerchantConfirmationScreen2.M, masavPayToMerchantConfirmationScreen2.N, new RowDelegate(null, null, 7), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = MasavPayToMerchantConfirmationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(masavPayToMerchantConfirmationScreen.m2()).a().get(w59.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w59.d.class, " is not found"));
                        }
                        w59.d dVar = ((w59.d) aVar2.b()).f294742h;
                        MasavPayToMerchantConfirmationScreenContract$InputData masavPayToMerchantConfirmationScreenContract$InputData = masavPayToMerchantConfirmationScreen.K;
                        masavPayToMerchantConfirmationScreenContract$InputData.getClass();
                        return new w59.e(dVar, masavPayToMerchantConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MasavPayToMerchantConfirmationScreen.S;
                        return (g) ((w59.e) masavPayToMerchantConfirmationScreen.P.getValue()).f294746c.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: e69.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MasavPayToMerchantConfirmationScreen f122940b;

            {
                this.f122940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MasavPayToMerchantConfirmationScreen masavPayToMerchantConfirmationScreen = this.f122940b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MasavPayToMerchantConfirmationScreen.S;
                        MasavPayToMerchantConfirmationScreen masavPayToMerchantConfirmationScreen2 = this.f122940b;
                        return dli.f.a(masavPayToMerchantConfirmationScreen2, masavPayToMerchantConfirmationScreen2.d(), zhm.v.k(masavPayToMerchantConfirmationScreen2.M, masavPayToMerchantConfirmationScreen2.N, new RowDelegate(null, null, 7), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = MasavPayToMerchantConfirmationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(masavPayToMerchantConfirmationScreen.m2()).a().get(w59.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w59.d.class, " is not found"));
                        }
                        w59.d dVar = ((w59.d) aVar2.b()).f294742h;
                        MasavPayToMerchantConfirmationScreenContract$InputData masavPayToMerchantConfirmationScreenContract$InputData = masavPayToMerchantConfirmationScreen.K;
                        masavPayToMerchantConfirmationScreenContract$InputData.getClass();
                        return new w59.e(dVar, masavPayToMerchantConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MasavPayToMerchantConfirmationScreen.S;
                        return (g) ((w59.e) masavPayToMerchantConfirmationScreen.P.getValue()).f294746c.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: e69.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MasavPayToMerchantConfirmationScreen f122940b;

            {
                this.f122940b = this;
            }

            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                MasavPayToMerchantConfirmationScreen masavPayToMerchantConfirmationScreen = this.f122940b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MasavPayToMerchantConfirmationScreen.S;
                        MasavPayToMerchantConfirmationScreen masavPayToMerchantConfirmationScreen2 = this.f122940b;
                        return dli.f.a(masavPayToMerchantConfirmationScreen2, masavPayToMerchantConfirmationScreen2.d(), zhm.v.k(masavPayToMerchantConfirmationScreen2.M, masavPayToMerchantConfirmationScreen2.N, new RowDelegate(null, null, 7), new ListSubheaderDelegate(), new RowLoadingDelegate()), R$id.screenRecyclerNavbarActionFooter_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = MasavPayToMerchantConfirmationScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(masavPayToMerchantConfirmationScreen.m2()).a().get(w59.d.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", w59.d.class, " is not found"));
                        }
                        w59.d dVar = ((w59.d) aVar2.b()).f294742h;
                        MasavPayToMerchantConfirmationScreenContract$InputData masavPayToMerchantConfirmationScreenContract$InputData = masavPayToMerchantConfirmationScreen.K;
                        masavPayToMerchantConfirmationScreenContract$InputData.getClass();
                        return new w59.e(dVar, masavPayToMerchantConfirmationScreenContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = MasavPayToMerchantConfirmationScreen.S;
                        return (g) ((w59.e) masavPayToMerchantConfirmationScreen.P.getValue()).f294746c.get();
                }
            }
        });
        this.R = R$layout.screen_recycler_navbar_action_footer;
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        n uiState = (n) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        ActionFooterView screenRecyclerNavbarActionFooterActionFooterView = d3().f174533b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarActionFooterActionFooterView, "screenRecyclerNavbarActionFooterActionFooterView");
        i iVar = uiState.f122949b;
        screenRecyclerNavbarActionFooterActionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            d3().f174533b.setModel(iVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (w59.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174534c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.authorisation_masav_p2m_confirm_payment_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.authorisation_masav_p2m_confirm_payment_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174534c.f59410q), new c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f), new c(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174533b.f58955g), new c(this, null, 2), 3);
        ViewController.P2(this, rd0.e.b(this.M.e), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new e69.e(this, null), 3);
    }

    public final k d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (k) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final g d() {
        return (g) this.Q.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getR() {
        return this.R;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
