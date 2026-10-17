package com.revolut.feature.junior.isa.impl.ui.child_picker;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.junior.isa.impl.R$string;
import com.revolut.feature.junior.isa.impl.ui.child_picker.JuniorIsaChildPickerScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import ha8.c;
import ha8.f;
import ha8.g;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import te0.w;
import tx0.j0;
import vc.s;
import x98.j;
import x98.o;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/ui/child_picker/JuniorIsaChildPickerScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lha8/g;", "<init>", "()V", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class JuniorIsaChildPickerScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(JuniorIsaChildPickerScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final RowDelegate M = new RowDelegate(null, null, 7);
    public final FullScreenStateDelegate N = new FullScreenStateDelegate();
    public final Object O;
    public final Object P;
    public final Object Q;

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

    public JuniorIsaChildPickerScreen() {
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: ha8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaChildPickerScreen f150459b;

            {
                this.f150459b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 0;
                JuniorIsaChildPickerScreen juniorIsaChildPickerScreen = this.f150459b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorIsaChildPickerScreen.R;
                        JuniorIsaChildPickerScreen juniorIsaChildPickerScreen2 = this.f150459b;
                        return dli.f.a(juniorIsaChildPickerScreen2, (f) juniorIsaChildPickerScreen2.Q.getValue(), v.k(juniorIsaChildPickerScreen2.M, new RowLoadingDelegate(), juniorIsaChildPickerScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorIsaChildPickerScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(juniorIsaChildPickerScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f303638q;
                        x98.j jVar = new x98.j();
                        jVar.f303620a = e4m.b.b(new x98.i(oVar, i3));
                        return jVar;
                    default:
                        KProperty[] kPropertyArr3 = JuniorIsaChildPickerScreen.R;
                        return (f) ((x98.j) juniorIsaChildPickerScreen.P.getValue()).f303620a.get();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: ha8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaChildPickerScreen f150459b;

            {
                this.f150459b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 0;
                JuniorIsaChildPickerScreen juniorIsaChildPickerScreen = this.f150459b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorIsaChildPickerScreen.R;
                        JuniorIsaChildPickerScreen juniorIsaChildPickerScreen2 = this.f150459b;
                        return dli.f.a(juniorIsaChildPickerScreen2, (f) juniorIsaChildPickerScreen2.Q.getValue(), v.k(juniorIsaChildPickerScreen2.M, new RowLoadingDelegate(), juniorIsaChildPickerScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorIsaChildPickerScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(juniorIsaChildPickerScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f303638q;
                        x98.j jVar = new x98.j();
                        jVar.f303620a = e4m.b.b(new x98.i(oVar, i3));
                        return jVar;
                    default:
                        KProperty[] kPropertyArr3 = JuniorIsaChildPickerScreen.R;
                        return (f) ((x98.j) juniorIsaChildPickerScreen.P.getValue()).f303620a.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: ha8.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JuniorIsaChildPickerScreen f150459b;

            {
                this.f150459b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 0;
                JuniorIsaChildPickerScreen juniorIsaChildPickerScreen = this.f150459b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = JuniorIsaChildPickerScreen.R;
                        JuniorIsaChildPickerScreen juniorIsaChildPickerScreen2 = this.f150459b;
                        return dli.f.a(juniorIsaChildPickerScreen2, (f) juniorIsaChildPickerScreen2.Q.getValue(), v.k(juniorIsaChildPickerScreen2.M, new RowLoadingDelegate(), juniorIsaChildPickerScreen2.N), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = JuniorIsaChildPickerScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(juniorIsaChildPickerScreen.m2()).a().get(o.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", o.class, " is not found"));
                        }
                        o oVar = ((o) aVar2.b()).f303638q;
                        x98.j jVar = new x98.j();
                        jVar.f303620a = e4m.b.b(new x98.i(oVar, i32));
                        return jVar;
                    default:
                        KProperty[] kPropertyArr3 = JuniorIsaChildPickerScreen.R;
                        return (f) ((x98.j) juniorIsaChildPickerScreen.P.getValue()).f303620a.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, cli.q qVar) {
        dli.a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (j) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (f) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.junior_trading_child_selector_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.junior_trading_child_selector_header_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new gqh.o(this, null, 24), 3);
        ViewController.P2(this, rd0.e.b(this.M.f53218h), new ha8.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f52371h.f121375b), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
