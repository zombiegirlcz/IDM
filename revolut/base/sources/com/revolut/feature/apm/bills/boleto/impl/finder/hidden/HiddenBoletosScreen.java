package com.revolut.feature.apm.bills.boleto.impl.finder.hidden;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.apm.bills.boleto.api.R$string;
import com.revolut.feature.apm.bills.boleto.impl.finder.hidden.HiddenBoletosScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import sm1.l;
import te0.w;
import vc.s;
import wm1.d;
import wm1.e;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/bills/boleto/impl/finder/hidden/HiddenBoletosScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lwm1/e;", "<init>", "()V", "feature_apm_bills_boleto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HiddenBoletosScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(HiddenBoletosScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object L;
    public final Object M;
    public final Object N;
    public final int K = R$layout.screen_recycler_navbar;
    public final h O = s.t(this, a.f);
    public final Object P = w.y0(new wf5.a(18));

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

    public HiddenBoletosScreen() {
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: wm1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HiddenBoletosScreen f298589b;

            {
                this.f298589b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                HiddenBoletosScreen hiddenBoletosScreen = this.f298589b;
                int i3 = 1;
                int i5 = 0;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = HiddenBoletosScreen.Q;
                        qji.b bVarU2 = hiddenBoletosScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.finder.hidden.di.HiddenBoletosScreenInjector");
                        sm1.d dVar = ((sm1.g) bVarU2).f264325b;
                        l lVar = new l();
                        int i6 = 26;
                        lVar.f264339a = e4m.b.b(new ryc.d(dVar, lVar, i3, i6));
                        lVar.f264340b = e4m.b.b(new ryc.d(dVar, lVar, i5, i6));
                        return lVar;
                    case 1:
                        KProperty[] kPropertyArr2 = HiddenBoletosScreen.Q;
                        return (d) ((l) hiddenBoletosScreen.L.getValue()).f264340b.get();
                    default:
                        KProperty[] kPropertyArr3 = HiddenBoletosScreen.Q;
                        HiddenBoletosScreen hiddenBoletosScreen2 = this.f298589b;
                        return dli.f.a(hiddenBoletosScreen2, (d) hiddenBoletosScreen2.M.getValue(), v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (RowDelegate) hiddenBoletosScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: wm1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HiddenBoletosScreen f298589b;

            {
                this.f298589b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                HiddenBoletosScreen hiddenBoletosScreen = this.f298589b;
                int i3 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = HiddenBoletosScreen.Q;
                        qji.b bVarU2 = hiddenBoletosScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.finder.hidden.di.HiddenBoletosScreenInjector");
                        sm1.d dVar = ((sm1.g) bVarU2).f264325b;
                        l lVar = new l();
                        int i6 = 26;
                        lVar.f264339a = e4m.b.b(new ryc.d(dVar, lVar, i3, i6));
                        lVar.f264340b = e4m.b.b(new ryc.d(dVar, lVar, i5, i6));
                        return lVar;
                    case 1:
                        KProperty[] kPropertyArr2 = HiddenBoletosScreen.Q;
                        return (d) ((l) hiddenBoletosScreen.L.getValue()).f264340b.get();
                    default:
                        KProperty[] kPropertyArr3 = HiddenBoletosScreen.Q;
                        HiddenBoletosScreen hiddenBoletosScreen2 = this.f298589b;
                        return dli.f.a(hiddenBoletosScreen2, (d) hiddenBoletosScreen2.M.getValue(), v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (RowDelegate) hiddenBoletosScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: wm1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HiddenBoletosScreen f298589b;

            {
                this.f298589b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                HiddenBoletosScreen hiddenBoletosScreen = this.f298589b;
                int i32 = 1;
                int i5 = 0;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = HiddenBoletosScreen.Q;
                        qji.b bVarU2 = hiddenBoletosScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.bills.boleto.impl.finder.hidden.di.HiddenBoletosScreenInjector");
                        sm1.d dVar = ((sm1.g) bVarU2).f264325b;
                        l lVar = new l();
                        int i6 = 26;
                        lVar.f264339a = e4m.b.b(new ryc.d(dVar, lVar, i32, i6));
                        lVar.f264340b = e4m.b.b(new ryc.d(dVar, lVar, i5, i6));
                        return lVar;
                    case 1:
                        KProperty[] kPropertyArr2 = HiddenBoletosScreen.Q;
                        return (d) ((l) hiddenBoletosScreen.L.getValue()).f264340b.get();
                    default:
                        KProperty[] kPropertyArr3 = HiddenBoletosScreen.Q;
                        HiddenBoletosScreen hiddenBoletosScreen2 = this.f298589b;
                        return dli.f.a(hiddenBoletosScreen2, (d) hiddenBoletosScreen2.M.getValue(), v.k(new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate(), (RowDelegate) hiddenBoletosScreen2.P.getValue()), R$id.recyclerView, null, null, null, 56);
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
        return (l) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (d) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.boleto_finder_hidden_boletos_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((m) value).f174539b.f59410q), null, new wkg.e(this, null, 3), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), null, new wm1.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
