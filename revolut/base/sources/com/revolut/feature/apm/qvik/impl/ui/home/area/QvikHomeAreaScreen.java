package com.revolut.feature.apm.qvik.impl.ui.home.area;

import aii.q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlaceholderRowDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.product.ApmQvik;
import com.revolut.feature.apm.qvik.api.R$string;
import com.revolut.feature.apm.qvik.impl.ui.home.area.QvikHomeAreaScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import hc2.p;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qba.c;
import qc2.d;
import qc2.g;
import qc2.i;
import qc2.k;
import te0.w;
import tw0.t0;
import vc.s;
import xki.e;
import yy0.j;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/qvik/impl/ui/home/area/QvikHomeAreaScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lqc2/d;", "<init>", "()V", "feature_apm_qvik_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class QvikHomeAreaScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(QvikHomeAreaScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final Object N = w.y0(new c(4));
    public final Object O = w.y0(new c(5));
    public final Object P = w.y0(new c(6));
    public final Object Q = w.y0(new c(7));
    public final Object R = w.y0(new c(8));
    public final Object S = w.y0(new c(9));
    public final Object T;
    public final Object U;
    public final Object V;

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

    public QvikHomeAreaScreen() {
        final int i = 0;
        this.T = w.y0(new Function0(this) { // from class: qc2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QvikHomeAreaScreen f244523b;

            {
                this.f244523b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                QvikHomeAreaScreen qvikHomeAreaScreen = this.f244523b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = QvikHomeAreaScreen.W;
                        QvikHomeAreaScreen qvikHomeAreaScreen2 = this.f244523b;
                        return dli.f.a(qvikHomeAreaScreen2, qvikHomeAreaScreen2.d(), v.k((FullScreenStateDelegate) qvikHomeAreaScreen2.N.getValue(), (ActionsDelegate) qvikHomeAreaScreen2.O.getValue(), (ActionWidgetDelegate) qvikHomeAreaScreen2.P.getValue(), (ContactsWidgetDelegate) qvikHomeAreaScreen2.Q.getValue(), (RowDelegate) qvikHomeAreaScreen2.S.getValue(), (RowsWidgetDelegate) qvikHomeAreaScreen2.R.getValue(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlaceholderRowDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = QvikHomeAreaScreen.W;
                        qji.b bVarU2 = qvikHomeAreaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.qvik.impl.ui.home.area.di.QvikHomeAreaScreenInjector");
                        hc2.q qVar = (hc2.q) bVarU2;
                        return new hc2.p(qVar.f150823a, qVar.f150824b);
                    default:
                        KProperty[] kPropertyArr3 = QvikHomeAreaScreen.W;
                        return (e) ((hc2.p) qvikHomeAreaScreen.U.getValue()).f150822c.get();
                }
            }
        });
        final int i2 = 1;
        this.U = w.y0(new Function0(this) { // from class: qc2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QvikHomeAreaScreen f244523b;

            {
                this.f244523b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                QvikHomeAreaScreen qvikHomeAreaScreen = this.f244523b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = QvikHomeAreaScreen.W;
                        QvikHomeAreaScreen qvikHomeAreaScreen2 = this.f244523b;
                        return dli.f.a(qvikHomeAreaScreen2, qvikHomeAreaScreen2.d(), v.k((FullScreenStateDelegate) qvikHomeAreaScreen2.N.getValue(), (ActionsDelegate) qvikHomeAreaScreen2.O.getValue(), (ActionWidgetDelegate) qvikHomeAreaScreen2.P.getValue(), (ContactsWidgetDelegate) qvikHomeAreaScreen2.Q.getValue(), (RowDelegate) qvikHomeAreaScreen2.S.getValue(), (RowsWidgetDelegate) qvikHomeAreaScreen2.R.getValue(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlaceholderRowDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = QvikHomeAreaScreen.W;
                        qji.b bVarU2 = qvikHomeAreaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.qvik.impl.ui.home.area.di.QvikHomeAreaScreenInjector");
                        hc2.q qVar = (hc2.q) bVarU2;
                        return new hc2.p(qVar.f150823a, qVar.f150824b);
                    default:
                        KProperty[] kPropertyArr3 = QvikHomeAreaScreen.W;
                        return (e) ((hc2.p) qvikHomeAreaScreen.U.getValue()).f150822c.get();
                }
            }
        });
        final int i3 = 2;
        this.V = w.y0(new Function0(this) { // from class: qc2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ QvikHomeAreaScreen f244523b;

            {
                this.f244523b = this;
            }

            /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                QvikHomeAreaScreen qvikHomeAreaScreen = this.f244523b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = QvikHomeAreaScreen.W;
                        QvikHomeAreaScreen qvikHomeAreaScreen2 = this.f244523b;
                        return dli.f.a(qvikHomeAreaScreen2, qvikHomeAreaScreen2.d(), v.k((FullScreenStateDelegate) qvikHomeAreaScreen2.N.getValue(), (ActionsDelegate) qvikHomeAreaScreen2.O.getValue(), (ActionWidgetDelegate) qvikHomeAreaScreen2.P.getValue(), (ContactsWidgetDelegate) qvikHomeAreaScreen2.Q.getValue(), (RowDelegate) qvikHomeAreaScreen2.S.getValue(), (RowsWidgetDelegate) qvikHomeAreaScreen2.R.getValue(), new RowLoadingDelegate(), new ListSubheaderLoadingDelegate(), new PlaceholderRowDelegate()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = QvikHomeAreaScreen.W;
                        qji.b bVarU2 = qvikHomeAreaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.qvik.impl.ui.home.area.di.QvikHomeAreaScreenInjector");
                        hc2.q qVar = (hc2.q) bVarU2;
                        return new hc2.p(qVar.f150823a, qVar.f150824b);
                    default:
                        KProperty[] kPropertyArr3 = QvikHomeAreaScreen.W;
                        return (e) ((hc2.p) qvikHomeAreaScreen.U.getValue()).f150822c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((d) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (p) this.U.getValue();
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
        navBarWithToolbar.setEndImage(new j(ApmQvik.f61823c.F()));
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.qvik_area_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.qvik_area_title, null, null, 14), null);
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.f59410q), null, new q43.m(this, continuation, 19), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) this.N.getValue()).f52371h.f121375b), null, new g(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(w.a0(((ActionsDelegate) this.O.getValue()).f51611c.f121375b, new qb5.a(18))), null, new qc2.h(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ActionWidgetDelegate) this.P.getValue()).f51589c.f121375b), null, new qc2.h(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ContactsWidgetDelegate) this.Q.getValue()).f), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowsWidgetDelegate) this.R.getValue()).f), null, new qc2.j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.S.getValue()).f53218h), null, new k(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final qc2.e d() {
        return (qc2.e) this.V.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
