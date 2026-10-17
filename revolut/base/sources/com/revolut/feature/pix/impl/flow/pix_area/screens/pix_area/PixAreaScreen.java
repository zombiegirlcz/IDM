package com.revolut.feature.pix.impl.flow.pix_area.screens.pix_area;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.pix.impl.R$id;
import com.revolut.feature.pix.impl.R$layout;
import com.revolut.feature.pix.impl.flow.pix_area.screens.pix_area.PixAreaScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import dli.c;
import h30.l;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import te0.w;
import tw0.t0;
import uwe.f;
import vaa.a0;
import vaa.b0;
import vaa.d;
import vaa.g;
import vaa.i;
import vaa.k;
import vaa.y;
import vaa.z;
import vc.s;
import xki.e;
import yhm.j;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pix/impl/flow/pix_area/screens/pix_area/PixAreaScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lvaa/y;", "Ldli/a;", "Lvaa/b0;", "Lno/d1;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PixAreaScreen extends ViewController<y> implements a, d1 {
    public static final /* synthetic */ KProperty[] Z = {o0.f186429a.j(new h0(PixAreaScreen.class, "binding", "getBinding()Lcom/revolut/feature/pix/impl/databinding/ScreenPixAreaBinding;", 0))};
    public final k K;
    public final boolean L;
    public final h M;
    public final int N;
    public final Object O;
    public final Object P;
    public final Lazy Q;
    public final Lazy R;
    public final Lazy S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;

    public PixAreaScreen(k inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = true;
        this.M = s.t(this, d.f);
        this.N = R$layout.screen_pix_area;
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: vaa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAreaScreen f287183b;

            {
                this.f287183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PixAreaScreen pixAreaScreen = this.f287183b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PixAreaScreen.Z;
                        qji.b bVarU2 = pixAreaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.pix_area.di.PixAreaScreenInjector");
                        p8a.n nVar = (p8a.n) bVarU2;
                        p8a.d0 d0Var = nVar.f234031b;
                        p8a.n nVar2 = nVar.f234032c;
                        k kVar = pixAreaScreen.K;
                        kVar.getClass();
                        return new p8a.o(d0Var, nVar2, kVar);
                    case 1:
                        KProperty[] kPropertyArr2 = PixAreaScreen.Z;
                        PixAreaScreen pixAreaScreen2 = this.f287183b;
                        return dli.f.a(pixAreaScreen2, pixAreaScreen2.R2(), zhm.v.k((ActionsDelegate) pixAreaScreen2.Q.getValue(), new SmallActionButtonDelegate(), new TextDelegate(), (RowDelegate) pixAreaScreen2.T.getValue(), (HeaderDelegate) pixAreaScreen2.R.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) pixAreaScreen2.S.getValue(), (ListSubheaderDelegate) pixAreaScreen2.V.getValue(), new ScrollerBoxDelegate(zhm.u.c((ReferralContactDelegate) pixAreaScreen2.U.getValue())), (ContactsWidgetDelegate) pixAreaScreen2.W.getValue(), (RowsWidgetDelegate) pixAreaScreen2.X.getValue()), R$id.screenPixArea_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixAreaScreen.Z;
                        return (a0) ((p8a.o) pixAreaScreen.O.getValue()).f234042g.get();
                }
            }
        });
        final int i2 = 2;
        this.P = w.y0(new Function0(this) { // from class: vaa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAreaScreen f287183b;

            {
                this.f287183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PixAreaScreen pixAreaScreen = this.f287183b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixAreaScreen.Z;
                        qji.b bVarU2 = pixAreaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.pix_area.di.PixAreaScreenInjector");
                        p8a.n nVar = (p8a.n) bVarU2;
                        p8a.d0 d0Var = nVar.f234031b;
                        p8a.n nVar2 = nVar.f234032c;
                        k kVar = pixAreaScreen.K;
                        kVar.getClass();
                        return new p8a.o(d0Var, nVar2, kVar);
                    case 1:
                        KProperty[] kPropertyArr2 = PixAreaScreen.Z;
                        PixAreaScreen pixAreaScreen2 = this.f287183b;
                        return dli.f.a(pixAreaScreen2, pixAreaScreen2.R2(), zhm.v.k((ActionsDelegate) pixAreaScreen2.Q.getValue(), new SmallActionButtonDelegate(), new TextDelegate(), (RowDelegate) pixAreaScreen2.T.getValue(), (HeaderDelegate) pixAreaScreen2.R.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) pixAreaScreen2.S.getValue(), (ListSubheaderDelegate) pixAreaScreen2.V.getValue(), new ScrollerBoxDelegate(zhm.u.c((ReferralContactDelegate) pixAreaScreen2.U.getValue())), (ContactsWidgetDelegate) pixAreaScreen2.W.getValue(), (RowsWidgetDelegate) pixAreaScreen2.X.getValue()), R$id.screenPixArea_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixAreaScreen.Z;
                        return (a0) ((p8a.o) pixAreaScreen.O.getValue()).f234042g.get();
                }
            }
        });
        this.Q = j.b(new v4a.a(13));
        this.R = j.b(new v4a.a(14));
        this.S = j.b(new v4a.a(15));
        this.T = w.y0(new v4a.a(16));
        this.U = w.y0(new v4a.a(17));
        this.V = w.y0(new v4a.a(18));
        this.W = w.y0(new v4a.a(19));
        this.X = w.y0(new v4a.a(12));
        final int i3 = 1;
        this.Y = w.y0(new Function0(this) { // from class: vaa.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PixAreaScreen f287183b;

            {
                this.f287183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PixAreaScreen pixAreaScreen = this.f287183b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PixAreaScreen.Z;
                        qji.b bVarU2 = pixAreaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.pix.impl.flow.pix_area.screens.pix_area.di.PixAreaScreenInjector");
                        p8a.n nVar = (p8a.n) bVarU2;
                        p8a.d0 d0Var = nVar.f234031b;
                        p8a.n nVar2 = nVar.f234032c;
                        k kVar = pixAreaScreen.K;
                        kVar.getClass();
                        return new p8a.o(d0Var, nVar2, kVar);
                    case 1:
                        KProperty[] kPropertyArr2 = PixAreaScreen.Z;
                        PixAreaScreen pixAreaScreen2 = this.f287183b;
                        return dli.f.a(pixAreaScreen2, pixAreaScreen2.R2(), zhm.v.k((ActionsDelegate) pixAreaScreen2.Q.getValue(), new SmallActionButtonDelegate(), new TextDelegate(), (RowDelegate) pixAreaScreen2.T.getValue(), (HeaderDelegate) pixAreaScreen2.R.getValue(), new RowLoadingDelegate(), (FullScreenStateDelegate) pixAreaScreen2.S.getValue(), (ListSubheaderDelegate) pixAreaScreen2.V.getValue(), new ScrollerBoxDelegate(zhm.u.c((ReferralContactDelegate) pixAreaScreen2.U.getValue())), (ContactsWidgetDelegate) pixAreaScreen2.W.getValue(), (RowsWidgetDelegate) pixAreaScreen2.X.getValue()), R$id.screenPixArea_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = PixAreaScreen.Z;
                        return (a0) ((p8a.o) pixAreaScreen.O.getValue()).f234042g.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        b0 uiState = (b0) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        NavBarWithToolbar navBarWithToolbar = d3().f222964b;
        navBarWithToolbar.setTitle(uiState.f287180a.f287219a, null);
        z zVar = uiState.f287180a;
        navBarWithToolbar.setToolbarTitle(zVar.f287219a);
        navBarWithToolbar.setDescriptionText(null);
        navBarWithToolbar.setDescriptionVisible(false);
        navBarWithToolbar.setEndIconImage(zVar.f287221c);
        navBarWithToolbar.setMenuItems(zVar.f287220b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p8a.o) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView screenContentRecyclerView = d3().f222965c;
        RecyclerView.Adapter adapter = screenContentRecyclerView.getAdapter();
        Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.recyclerkit.delegates.DiffAdapter");
        screenContentRecyclerView.addItemDecoration(new t0((koi.h) adapter, false));
        d3().f222964b.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f222964b.f59410q), null, new f(this, continuation, 16), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ActionsDelegate) this.Q.getValue()).f51611c.f121375b), null, new vaa.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.S.getValue()).f52371h.f121375b), null, new vaa.f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((HeaderDelegate) this.R.getValue()).f52392c.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.T.getValue()).f53218h), null, new vaa.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((ReferralContactDelegate) this.U.getValue()).q(), new v80.a(12))), null, new v44.e(this, continuation, 13), 3);
        com.revolut.kompot.navigable.a.g2(this, l.y(((ContactsWidgetDelegate) this.W.getValue()).f, ((RowsWidgetDelegate) this.X.getValue()).f, "merge(...)"), null, new i(this, null), 3);
    }

    public final o8a.a d3() {
        ViewBinding value = this.M.getValue(this, Z[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o8a.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final a0 R2() {
        return (a0) this.P.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
