package com.revolut.feature.apm.upi.impl.flow.area.screen;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmUpi;
import com.revolut.feature.apm.upi.impl.flow.area.screen.UpiAreaScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import java.util.List;
import jii.m;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ox5.r;
import pd4.u;
import pdg.d;
import pf2.e;
import pf2.i;
import pf2.j;
import pf2.k;
import te0.w;
import tw0.t0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/area/screen/UpiAreaScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lpf2/e;", "<init>", "()V", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpiAreaScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(UpiAreaScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final Object M = w.y0(new d(19));
    public final Object N;
    public final Object O;
    public final Object P;
    public final Object Q;
    public final SwipeToActionDelegate R;
    public final ListSubheaderDelegate S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
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

    public UpiAreaScreen() {
        Lazy lazyY0 = w.y0(new d(20));
        this.N = lazyY0;
        this.O = w.y0(new d(21));
        this.P = w.y0(new d(22));
        this.Q = w.y0(new d(23));
        this.R = new SwipeToActionDelegate((RowDelegate) lazyY0.getValue(), false);
        this.S = new ListSubheaderDelegate();
        this.T = w.y0(new d(24));
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: pf2.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiAreaScreen f235415b;

            {
                this.f235415b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UpiAreaScreen upiAreaScreen = this.f235415b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UpiAreaScreen.X;
                        UpiAreaScreen upiAreaScreen2 = this.f235415b;
                        return dli.f.a(upiAreaScreen2, upiAreaScreen2.d(), v.k((FullScreenStateDelegate) upiAreaScreen2.M.getValue(), (ActionsDelegate) upiAreaScreen2.O.getValue(), (RowDelegate) upiAreaScreen2.N.getValue(), (RowsWidgetDelegate) upiAreaScreen2.P.getValue(), (PaymentLinkWidgetDelegate) upiAreaScreen2.Q.getValue(), upiAreaScreen2.R, upiAreaScreen2.S, (ContactsWidgetDelegate) upiAreaScreen2.T.getValue(), new TextDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = UpiAreaScreen.X;
                        qji.b bVarU2 = upiAreaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.upi.impl.flow.area.screen.di.UpiAreaScreenInjector");
                        if2.h hVar = (if2.h) bVarU2;
                        return new if2.d(hVar.f160869a, hVar.f160870b);
                    default:
                        KProperty[] kPropertyArr3 = UpiAreaScreen.X;
                        return (d) ((if2.d) upiAreaScreen.V.getValue()).f160847c.get();
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: pf2.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiAreaScreen f235415b;

            {
                this.f235415b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UpiAreaScreen upiAreaScreen = this.f235415b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UpiAreaScreen.X;
                        UpiAreaScreen upiAreaScreen2 = this.f235415b;
                        return dli.f.a(upiAreaScreen2, upiAreaScreen2.d(), v.k((FullScreenStateDelegate) upiAreaScreen2.M.getValue(), (ActionsDelegate) upiAreaScreen2.O.getValue(), (RowDelegate) upiAreaScreen2.N.getValue(), (RowsWidgetDelegate) upiAreaScreen2.P.getValue(), (PaymentLinkWidgetDelegate) upiAreaScreen2.Q.getValue(), upiAreaScreen2.R, upiAreaScreen2.S, (ContactsWidgetDelegate) upiAreaScreen2.T.getValue(), new TextDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = UpiAreaScreen.X;
                        qji.b bVarU2 = upiAreaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.upi.impl.flow.area.screen.di.UpiAreaScreenInjector");
                        if2.h hVar = (if2.h) bVarU2;
                        return new if2.d(hVar.f160869a, hVar.f160870b);
                    default:
                        KProperty[] kPropertyArr3 = UpiAreaScreen.X;
                        return (d) ((if2.d) upiAreaScreen.V.getValue()).f160847c.get();
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: pf2.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UpiAreaScreen f235415b;

            {
                this.f235415b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UpiAreaScreen upiAreaScreen = this.f235415b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UpiAreaScreen.X;
                        UpiAreaScreen upiAreaScreen2 = this.f235415b;
                        return dli.f.a(upiAreaScreen2, upiAreaScreen2.d(), v.k((FullScreenStateDelegate) upiAreaScreen2.M.getValue(), (ActionsDelegate) upiAreaScreen2.O.getValue(), (RowDelegate) upiAreaScreen2.N.getValue(), (RowsWidgetDelegate) upiAreaScreen2.P.getValue(), (PaymentLinkWidgetDelegate) upiAreaScreen2.Q.getValue(), upiAreaScreen2.R, upiAreaScreen2.S, (ContactsWidgetDelegate) upiAreaScreen2.T.getValue(), new TextDelegate(), new ListSubheaderLoadingDelegate(), new RowLoadingDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = UpiAreaScreen.X;
                        qji.b bVarU2 = upiAreaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.upi.impl.flow.area.screen.di.UpiAreaScreenInjector");
                        if2.h hVar = (if2.h) bVarU2;
                        return new if2.d(hVar.f160869a, hVar.f160870b);
                    default:
                        KProperty[] kPropertyArr3 = UpiAreaScreen.X;
                        return (d) ((if2.d) upiAreaScreen.V.getValue()).f160847c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (if2.d) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ScreenContentRecyclerView screenContentRecyclerView = d3().f174540c;
        RecyclerView.Adapter adapter = screenContentRecyclerView.getAdapter();
        Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.recyclerkit.delegates.DiffAdapter");
        screenContentRecyclerView.addItemDecoration(new t0((koi.h) adapter, false));
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setEndIconImage(ApmUpi.f61828c.F());
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.apm_product_upi_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.apm_product_upi_title, null, null, 14), null);
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new p0l.d(this, continuation, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((ActionsDelegate) this.O.getValue()).f51611c.f121375b, new u(18))), null, new r(this, continuation, 26), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.N.getValue()).f53218h), null, new pf2.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowsWidgetDelegate) this.P.getValue()).f), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PaymentLinkWidgetDelegate) this.Q.getValue()).f), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ContactsWidgetDelegate) this.T.getValue()).f), null, new k(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final pf2.d d() {
        return (pf2.d) this.W.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getV() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.U.getValue();
    }
}
