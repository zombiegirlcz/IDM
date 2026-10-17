package com.revolut.feature.apm.breb.impl.ui.area;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.HeaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.breb.api.R$string;
import com.revolut.feature.apm.breb.impl.ui.area.BrebAreaScreen;
import com.revolut.feature.apm.core.api.product.ApmBreb;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.d1;
import nv1.f;
import te0.w;
import tw0.t0;
import us4.b;
import uv1.c;
import uv1.g;
import uv1.i;
import uv1.m;
import uv1.v;
import uv1.x;
import vc.s;
import xki.e;
import yy0.j;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/breb/impl/ui/area/BrebAreaScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Luv1/v;", "Ldli/a;", "Luv1/x;", "Lno/d1;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BrebAreaScreen extends ViewController<v> implements a, d1 {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(BrebAreaScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final m K;
    public final int L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final h P;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;

    public BrebAreaScreen() {
        this(null);
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((x) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.N.getValue();
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
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.breb_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setEndImage(new j(ApmBreb.f61810c.F()));
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v40, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new uea.e(this, continuation, 26), 3);
        int i = 0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((ActionsDelegate) this.R.getValue()).f51611c.f121375b, new c(i))), null, new g(this, continuation, i), 3);
        int i2 = 1;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ActionWidgetDelegate) this.Q.getValue()).f51589c.f121375b), null, new g(this, continuation, i2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ContactsWidgetDelegate) this.S.getValue()).f), null, new uv1.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((RowDelegate) this.V.getValue()).f53218h, new c(i2))), null, new g(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((PaymentLinkWidgetDelegate) this.U.getValue()).f), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((HeaderDelegate) this.T.getValue()).f52392c.f121375b), null, new uv1.j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowsWidgetDelegate) this.W.getValue()).f), null, new uv1.f(this, null), 3);
    }

    public final jii.m d3() {
        ViewBinding value = this.P.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final uv1.w d() {
        return (uv1.w) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }

    public BrebAreaScreen(m mVar) {
        this.K = mVar;
        this.L = R$layout.screen_recycler_navbar;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: uv1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebAreaScreen f283267b;

            {
                this.f283267b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BrebAreaScreen brebAreaScreen = this.f283267b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BrebAreaScreen.X;
                        return (w) ((nv1.f) brebAreaScreen.N.getValue()).f219395g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BrebAreaScreen.X;
                        qji.b bVarU2 = brebAreaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.area.di.BrebAreaScreenInjector");
                        nv1.e eVar = (nv1.e) bVarU2;
                        return new nv1.f(eVar.f219389b, eVar.f219390c, brebAreaScreen.K);
                    default:
                        KProperty[] kPropertyArr3 = BrebAreaScreen.X;
                        BrebAreaScreen brebAreaScreen2 = this.f283267b;
                        return dli.f.a(brebAreaScreen2, brebAreaScreen2.d(), zhm.d0.E0(((fd6.a) ((nv1.f) brebAreaScreen2.N.getValue()).d.get()).e, zhm.v.k((ActionWidgetDelegate) brebAreaScreen2.Q.getValue(), (ActionsDelegate) brebAreaScreen2.R.getValue(), (ContactsWidgetDelegate) brebAreaScreen2.S.getValue(), (HeaderDelegate) brebAreaScreen2.T.getValue(), (PaymentLinkWidgetDelegate) brebAreaScreen2.U.getValue(), (RowDelegate) brebAreaScreen2.V.getValue(), (RowsWidgetDelegate) brebAreaScreen2.W.getValue(), new FullScreenStateDelegate(), new PaymentLinkWidgetLoadingDelegate(), new RowLoadingDelegate(), new TextDelegate())), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: uv1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebAreaScreen f283267b;

            {
                this.f283267b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BrebAreaScreen brebAreaScreen = this.f283267b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrebAreaScreen.X;
                        return (w) ((nv1.f) brebAreaScreen.N.getValue()).f219395g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BrebAreaScreen.X;
                        qji.b bVarU2 = brebAreaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.area.di.BrebAreaScreenInjector");
                        nv1.e eVar = (nv1.e) bVarU2;
                        return new nv1.f(eVar.f219389b, eVar.f219390c, brebAreaScreen.K);
                    default:
                        KProperty[] kPropertyArr3 = BrebAreaScreen.X;
                        BrebAreaScreen brebAreaScreen2 = this.f283267b;
                        return dli.f.a(brebAreaScreen2, brebAreaScreen2.d(), zhm.d0.E0(((fd6.a) ((nv1.f) brebAreaScreen2.N.getValue()).d.get()).e, zhm.v.k((ActionWidgetDelegate) brebAreaScreen2.Q.getValue(), (ActionsDelegate) brebAreaScreen2.R.getValue(), (ContactsWidgetDelegate) brebAreaScreen2.S.getValue(), (HeaderDelegate) brebAreaScreen2.T.getValue(), (PaymentLinkWidgetDelegate) brebAreaScreen2.U.getValue(), (RowDelegate) brebAreaScreen2.V.getValue(), (RowsWidgetDelegate) brebAreaScreen2.W.getValue(), new FullScreenStateDelegate(), new PaymentLinkWidgetLoadingDelegate(), new RowLoadingDelegate(), new TextDelegate())), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: uv1.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BrebAreaScreen f283267b;

            {
                this.f283267b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                BrebAreaScreen brebAreaScreen = this.f283267b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BrebAreaScreen.X;
                        return (w) ((nv1.f) brebAreaScreen.N.getValue()).f219395g.get();
                    case 1:
                        KProperty[] kPropertyArr2 = BrebAreaScreen.X;
                        qji.b bVarU2 = brebAreaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.breb.impl.ui.area.di.BrebAreaScreenInjector");
                        nv1.e eVar = (nv1.e) bVarU2;
                        return new nv1.f(eVar.f219389b, eVar.f219390c, brebAreaScreen.K);
                    default:
                        KProperty[] kPropertyArr3 = BrebAreaScreen.X;
                        BrebAreaScreen brebAreaScreen2 = this.f283267b;
                        return dli.f.a(brebAreaScreen2, brebAreaScreen2.d(), zhm.d0.E0(((fd6.a) ((nv1.f) brebAreaScreen2.N.getValue()).d.get()).e, zhm.v.k((ActionWidgetDelegate) brebAreaScreen2.Q.getValue(), (ActionsDelegate) brebAreaScreen2.R.getValue(), (ContactsWidgetDelegate) brebAreaScreen2.S.getValue(), (HeaderDelegate) brebAreaScreen2.T.getValue(), (PaymentLinkWidgetDelegate) brebAreaScreen2.U.getValue(), (RowDelegate) brebAreaScreen2.V.getValue(), (RowsWidgetDelegate) brebAreaScreen2.W.getValue(), new FullScreenStateDelegate(), new PaymentLinkWidgetLoadingDelegate(), new RowLoadingDelegate(), new TextDelegate())), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = s.t(this, uv1.e.f);
        this.Q = w.y0(new b(13));
        this.R = w.y0(new b(14));
        this.S = w.y0(new b(15));
        this.T = w.y0(new b(16));
        this.U = w.y0(new b(17));
        this.V = w.y0(new b(11));
        this.W = w.y0(new b(12));
    }
}
