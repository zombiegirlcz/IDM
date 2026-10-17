package com.revolut.feature.trading.impl.ui.holdings.information.entry;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.trading.impl.ui.holdings.information.entry.HoldingsInformationEntryController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import xsf.c;
import y4f.d;
import y4f.f;
import y4f.g;
import y4f.k;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/trading/impl/ui/holdings/information/entry/HoldingsInformationEntryController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ly4f/k;", "Ldli/a;", "Ly4f/m;", "<init>", "()V", "feature_trading_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HoldingsInformationEntryController extends ViewController<k> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(HoldingsInformationEntryController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object L;
    public final Object U;
    public final Object V;
    public final h K = s.t(this, a.f);
    public final int M = R$layout.screen_recycler_navbar;
    public final Object N = w.y0(new c(28));
    public final Object O = w.y0(new c(29));
    public final Object P = w.y0(new y4f.c(0));
    public final Object Q = w.y0(new y4f.c(1));
    public final Object R = w.y0(new y4f.c(2));
    public final Object S = w.y0(new y4f.c(3));
    public final Object T = w.y0(new y4f.c(4));

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public HoldingsInformationEntryController() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: y4f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HoldingsInformationEntryController f310903b;

            {
                this.f310903b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                int i5 = 2;
                int i6 = 1;
                HoldingsInformationEntryController holdingsInformationEntryController = this.f310903b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = HoldingsInformationEntryController.W;
                        return (h) ((c4f.e) holdingsInformationEntryController.V.getValue()).f21209c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = HoldingsInformationEntryController.W;
                        HoldingsInformationEntryController holdingsInformationEntryController2 = this.f310903b;
                        return dli.f.a(holdingsInformationEntryController2, holdingsInformationEntryController2.R2(), v.k((TextDelegate) holdingsInformationEntryController2.N.getValue(), (CellDetailsDelegate) holdingsInformationEntryController2.O.getValue(), (CellDetailsActionDelegate) holdingsInformationEntryController2.P.getValue(), (CellDetailsLoadingDelegate) holdingsInformationEntryController2.Q.getValue(), (FullScreenStateDelegate) holdingsInformationEntryController2.T.getValue(), (ListSubheaderDelegate) holdingsInformationEntryController2.R.getValue(), (ListSubheaderLoadingDelegate) holdingsInformationEntryController2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = HoldingsInformationEntryController.W;
                        qji.b bVarU2 = holdingsInformationEntryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.impl.ui.holdings.information.entry.di.HoldingsInformationEntryControllerInjector");
                        c4f.d dVar = ((c4f.f) bVarU2).f21210a;
                        c4f.e eVar = new c4f.e();
                        int i21 = 15;
                        eVar.f21207a = e4m.b.b(new bt7.e(dVar, eVar, i6, i21));
                        eVar.f21208b = e4m.b.b(new bt7.e(dVar, eVar, i5, i21));
                        eVar.f21209c = e4m.b.b(new bt7.e(dVar, eVar, i3, i21));
                        return eVar;
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: y4f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HoldingsInformationEntryController f310903b;

            {
                this.f310903b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                int i5 = 2;
                int i6 = 1;
                HoldingsInformationEntryController holdingsInformationEntryController = this.f310903b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = HoldingsInformationEntryController.W;
                        return (h) ((c4f.e) holdingsInformationEntryController.V.getValue()).f21209c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = HoldingsInformationEntryController.W;
                        HoldingsInformationEntryController holdingsInformationEntryController2 = this.f310903b;
                        return dli.f.a(holdingsInformationEntryController2, holdingsInformationEntryController2.R2(), v.k((TextDelegate) holdingsInformationEntryController2.N.getValue(), (CellDetailsDelegate) holdingsInformationEntryController2.O.getValue(), (CellDetailsActionDelegate) holdingsInformationEntryController2.P.getValue(), (CellDetailsLoadingDelegate) holdingsInformationEntryController2.Q.getValue(), (FullScreenStateDelegate) holdingsInformationEntryController2.T.getValue(), (ListSubheaderDelegate) holdingsInformationEntryController2.R.getValue(), (ListSubheaderLoadingDelegate) holdingsInformationEntryController2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = HoldingsInformationEntryController.W;
                        qji.b bVarU2 = holdingsInformationEntryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.impl.ui.holdings.information.entry.di.HoldingsInformationEntryControllerInjector");
                        c4f.d dVar = ((c4f.f) bVarU2).f21210a;
                        c4f.e eVar = new c4f.e();
                        int i21 = 15;
                        eVar.f21207a = e4m.b.b(new bt7.e(dVar, eVar, i6, i21));
                        eVar.f21208b = e4m.b.b(new bt7.e(dVar, eVar, i5, i21));
                        eVar.f21209c = e4m.b.b(new bt7.e(dVar, eVar, i3, i21));
                        return eVar;
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: y4f.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HoldingsInformationEntryController f310903b;

            {
                this.f310903b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                int i5 = 2;
                int i6 = 1;
                HoldingsInformationEntryController holdingsInformationEntryController = this.f310903b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = HoldingsInformationEntryController.W;
                        return (h) ((c4f.e) holdingsInformationEntryController.V.getValue()).f21209c.get();
                    case 1:
                        KProperty[] kPropertyArr2 = HoldingsInformationEntryController.W;
                        HoldingsInformationEntryController holdingsInformationEntryController2 = this.f310903b;
                        return dli.f.a(holdingsInformationEntryController2, holdingsInformationEntryController2.R2(), v.k((TextDelegate) holdingsInformationEntryController2.N.getValue(), (CellDetailsDelegate) holdingsInformationEntryController2.O.getValue(), (CellDetailsActionDelegate) holdingsInformationEntryController2.P.getValue(), (CellDetailsLoadingDelegate) holdingsInformationEntryController2.Q.getValue(), (FullScreenStateDelegate) holdingsInformationEntryController2.T.getValue(), (ListSubheaderDelegate) holdingsInformationEntryController2.R.getValue(), (ListSubheaderLoadingDelegate) holdingsInformationEntryController2.S.getValue()), R$id.recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = HoldingsInformationEntryController.W;
                        qji.b bVarU2 = holdingsInformationEntryController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.trading.impl.ui.holdings.information.entry.di.HoldingsInformationEntryControllerInjector");
                        c4f.d dVar = ((c4f.f) bVarU2).f21210a;
                        c4f.e eVar = new c4f.e();
                        int i21 = 15;
                        eVar.f21207a = e4m.b.b(new bt7.e(dVar, eVar, i6, i21));
                        eVar.f21208b = e4m.b.b(new bt7.e(dVar, eVar, i5, i21));
                        eVar.f21209c = e4m.b.b(new bt7.e(dVar, eVar, i32, i21));
                        return eVar;
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        y4f.m uiState = (y4f.m) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        ViewBinding value = this.K.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(uiState.f310910a, null);
        navBarWithToolbar.setDescriptionText(uiState.f310911b);
        navBarWithToolbar.setDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c4f.e) this.V.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new xni.h(this, null, 27), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((CellDetailsActionDelegate) this.P.getValue()).d), null, new d(this, null), 3);
        ?? r56 = this.R;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) r56.getValue()).f52707c), null, new y4f.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) r56.getValue()).f52707c), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.T.getValue()).f52371h.f121375b), null, new g(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final y4f.h R2() {
        return (y4f.h) this.L.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.U.getValue();
    }
}
