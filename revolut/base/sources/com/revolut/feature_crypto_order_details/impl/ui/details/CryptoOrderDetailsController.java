package com.revolut.feature_crypto_order_details.impl.ui.details;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.ActionsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import com.revolut.feature_crypto_order_details.impl.ui.details.CryptoOrderDetailsController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import ft.d;
import fyh.g;
import fyh.k;
import fyh.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pd.b;
import te0.w;
import uxh.i;
import vc.s;
import wxh.m;
import xki.e;
import xxh.h;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature_crypto_order_details/impl/ui/details/CryptoOrderDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lfyh/i;", "Luxh/i;", "Lwxh/m;", "Lyxh/i;", "Lxxh/h;", "feature_crypto_order_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoOrderDetailsController extends ViewController<q> implements a, i, m, yxh.i, h {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(CryptoOrderDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final CryptoOrderDetailsInputData K;
    public final Object L;
    public final Object M;
    public final int N;
    public final ao.h O;
    public final Object P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;

    public CryptoOrderDetailsController(CryptoOrderDetailsInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: fyh.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoOrderDetailsController f139009b;

            {
                this.f139009b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CryptoOrderDetailsController cryptoOrderDetailsController = this.f139009b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoOrderDetailsController.X;
                        return ((gyh.b) cryptoOrderDetailsController.M.getValue()).a();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoOrderDetailsController.X;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoOrderDetailsController.m2()).a().get(ayh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (gyh.b) ((gyh.a) ((gyh.c) aVar2.b()).b().mo3808a(cryptoOrderDetailsController)).t(cryptoOrderDetailsController.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ayh.b.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = CryptoOrderDetailsController.X;
                        CryptoOrderDetailsController cryptoOrderDetailsController2 = this.f139009b;
                        return dli.f.a(cryptoOrderDetailsController2, (g) cryptoOrderDetailsController2.L.getValue(), v.k((TextDelegate) cryptoOrderDetailsController2.P.getValue(), (CellDetailsChevronDelegate) cryptoOrderDetailsController2.Q.getValue(), (ActionsDelegate) cryptoOrderDetailsController2.T.getValue(), (RowDelegate) cryptoOrderDetailsController2.S.getValue(), (LargeActionButtonDelegate) cryptoOrderDetailsController2.R.getValue(), new ListSubheaderDelegate(), new PlainTextWarningDelegate(), new ActionsLoadingDelegate(), new CellDetailsDelegate(), new ListCellDelegate(), new RowLoadingDelegate(), (FixedTabsDelegate) cryptoOrderDetailsController2.U.getValue(), new FullScreenStateDelegate(), new CellDetailsLoadingDelegate(), (CellDetailsActionDelegate) cryptoOrderDetailsController2.V.getValue(), new CellDetailsSwitcherDelegate()), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: fyh.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoOrderDetailsController f139009b;

            {
                this.f139009b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CryptoOrderDetailsController cryptoOrderDetailsController = this.f139009b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoOrderDetailsController.X;
                        return ((gyh.b) cryptoOrderDetailsController.M.getValue()).a();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoOrderDetailsController.X;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoOrderDetailsController.m2()).a().get(ayh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (gyh.b) ((gyh.a) ((gyh.c) aVar2.b()).b().mo3808a(cryptoOrderDetailsController)).t(cryptoOrderDetailsController.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ayh.b.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = CryptoOrderDetailsController.X;
                        CryptoOrderDetailsController cryptoOrderDetailsController2 = this.f139009b;
                        return dli.f.a(cryptoOrderDetailsController2, (g) cryptoOrderDetailsController2.L.getValue(), v.k((TextDelegate) cryptoOrderDetailsController2.P.getValue(), (CellDetailsChevronDelegate) cryptoOrderDetailsController2.Q.getValue(), (ActionsDelegate) cryptoOrderDetailsController2.T.getValue(), (RowDelegate) cryptoOrderDetailsController2.S.getValue(), (LargeActionButtonDelegate) cryptoOrderDetailsController2.R.getValue(), new ListSubheaderDelegate(), new PlainTextWarningDelegate(), new ActionsLoadingDelegate(), new CellDetailsDelegate(), new ListCellDelegate(), new RowLoadingDelegate(), (FixedTabsDelegate) cryptoOrderDetailsController2.U.getValue(), new FullScreenStateDelegate(), new CellDetailsLoadingDelegate(), (CellDetailsActionDelegate) cryptoOrderDetailsController2.V.getValue(), new CellDetailsSwitcherDelegate()), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
        this.N = R$layout.screen_recycler_navbar;
        this.O = s.t(this, l.f);
        this.P = w.y0(new ft3.h0(26));
        this.Q = w.y0(new ft3.h0(27));
        this.R = w.y0(new ft3.h0(28));
        this.S = w.y0(new ft3.h0(29));
        this.T = w.y0(new k(0));
        this.U = w.y0(new k(1));
        final int i3 = 2;
        this.V = w.y0(new k(i3));
        this.W = w.y0(new Function0(this) { // from class: fyh.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CryptoOrderDetailsController f139009b;

            {
                this.f139009b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CryptoOrderDetailsController cryptoOrderDetailsController = this.f139009b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CryptoOrderDetailsController.X;
                        return ((gyh.b) cryptoOrderDetailsController.M.getValue()).a();
                    case 1:
                        KProperty[] kPropertyArr2 = CryptoOrderDetailsController.X;
                        phm.a aVar = (phm.a) ue0.e.j(cryptoOrderDetailsController.m2()).a().get(ayh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (gyh.b) ((gyh.a) ((gyh.c) aVar2.b()).b().mo3808a(cryptoOrderDetailsController)).t(cryptoOrderDetailsController.K).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", ayh.b.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = CryptoOrderDetailsController.X;
                        CryptoOrderDetailsController cryptoOrderDetailsController2 = this.f139009b;
                        return dli.f.a(cryptoOrderDetailsController2, (g) cryptoOrderDetailsController2.L.getValue(), v.k((TextDelegate) cryptoOrderDetailsController2.P.getValue(), (CellDetailsChevronDelegate) cryptoOrderDetailsController2.Q.getValue(), (ActionsDelegate) cryptoOrderDetailsController2.T.getValue(), (RowDelegate) cryptoOrderDetailsController2.S.getValue(), (LargeActionButtonDelegate) cryptoOrderDetailsController2.R.getValue(), new ListSubheaderDelegate(), new PlainTextWarningDelegate(), new ActionsLoadingDelegate(), new CellDetailsDelegate(), new ListCellDelegate(), new RowLoadingDelegate(), (FixedTabsDelegate) cryptoOrderDetailsController2.U.getValue(), new FullScreenStateDelegate(), new CellDetailsLoadingDelegate(), (CellDetailsActionDelegate) cryptoOrderDetailsController2.V.getValue(), new CellDetailsSwitcherDelegate()), R$id.recyclerView, null, new koi.h(null, false, true, 1), null, 40);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        Image image;
        fyh.i uiState = (fyh.i) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        fyh.h hVar = qVar instanceof fyh.h ? (fyh.h) qVar : null;
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        zxh.a aVar = uiState.f139007b;
        navBarWithToolbar.setTitle(aVar.f326335a, null);
        Clause clause = aVar.f326336b;
        Clause clause2 = aVar.f326337c;
        if (clause != null) {
            navBarWithToolbar.setToolbarTitle(clause);
        }
        if (clause2 != null) {
            navBarWithToolbar.setDescriptionText(clause2);
        }
        navBarWithToolbar.setDescriptionVisible(clause2 != null);
        navBarWithToolbar.setSecondDescriptionVisible(false);
        if (b.k(hVar != null ? Boolean.valueOf(hVar.f139004a) : null)) {
            navBarWithToolbar.setEndIconImage(aVar.d);
        }
        if (!b.k(hVar != null ? Boolean.valueOf(hVar.f139005b) : null) || (image = aVar.e) == null) {
            return;
        }
        navBarWithToolbar.setEndIconBadgeImage(image);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (gyh.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174539b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new d(this, null, 12), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.O.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.W.getValue();
    }
}
