package com.revolut.feature.customer_present.tips.impl.screen.tips_management;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import c06.f;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.customer_present.tips.impl.R$string;
import com.revolut.feature.customer_present.tips.impl.screen.tips_management.TipsManagementScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import cw6.m;
import h30.l;
import hw9.b;
import i06.c;
import i06.d;
import i06.j;
import i06.k;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/customer_present/tips/impl/screen/tips_management/TipsManagementScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Li06/k;", "<init>", "()V", "feature_customer_present_tips_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TipsManagementScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TipsManagementScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final Object K;
    public final Object L;
    public final Object N;
    public final int M = R$layout.screen_recycler_navbar_nextbutton;
    public final h O = s.t(this, a.f);
    public final m P = new m(2);
    public final RowDelegate Q = new RowDelegate(null, new b(this, 11), 5);
    public final ListSubheaderDelegate R = new ListSubheaderDelegate();

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public TipsManagementScreen() {
        final int i = 0;
        this.K = w.y0(new Function0(this) { // from class: i06.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TipsManagementScreen f157289b;

            {
                this.f157289b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TipsManagementScreen tipsManagementScreen = this.f157289b;
                int i3 = 1;
                int i5 = 0;
                int i6 = 2;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = TipsManagementScreen.S;
                        return (j) ((c06.f) tipsManagementScreen.L.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TipsManagementScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(tipsManagementScreen.m2()).a().get(c06.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c06.c.class, " is not found"));
                        }
                        c06.c cVar = ((c06.c) aVar2.b()).f20175c;
                        c06.f fVar = new c06.f();
                        fVar.f20181a = e4m.b.b(e4m.c.a(tipsManagementScreen));
                        int i21 = 7;
                        fVar.f20182b = e4m.b.b(new bt7.e(cVar, fVar, i3, i21));
                        fVar.f20183c = e4m.b.b(new bt7.e(cVar, fVar, i5, i21));
                        fVar.d = e4m.b.b(new bt7.e(cVar, fVar, 3, i21));
                        fVar.e = e4m.b.b(new bt7.e(cVar, fVar, i6, i21));
                        return fVar;
                    default:
                        KProperty[] kPropertyArr3 = TipsManagementScreen.S;
                        TipsManagementScreen tipsManagementScreen2 = this.f157289b;
                        return dli.f.a(tipsManagementScreen2, tipsManagementScreen2.d(), v.k(tipsManagementScreen2.Q, tipsManagementScreen2.R), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.L = w.y0(new Function0(this) { // from class: i06.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TipsManagementScreen f157289b;

            {
                this.f157289b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TipsManagementScreen tipsManagementScreen = this.f157289b;
                int i3 = 1;
                int i5 = 0;
                int i6 = 2;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TipsManagementScreen.S;
                        return (j) ((c06.f) tipsManagementScreen.L.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TipsManagementScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(tipsManagementScreen.m2()).a().get(c06.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c06.c.class, " is not found"));
                        }
                        c06.c cVar = ((c06.c) aVar2.b()).f20175c;
                        c06.f fVar = new c06.f();
                        fVar.f20181a = e4m.b.b(e4m.c.a(tipsManagementScreen));
                        int i21 = 7;
                        fVar.f20182b = e4m.b.b(new bt7.e(cVar, fVar, i3, i21));
                        fVar.f20183c = e4m.b.b(new bt7.e(cVar, fVar, i5, i21));
                        fVar.d = e4m.b.b(new bt7.e(cVar, fVar, 3, i21));
                        fVar.e = e4m.b.b(new bt7.e(cVar, fVar, i6, i21));
                        return fVar;
                    default:
                        KProperty[] kPropertyArr3 = TipsManagementScreen.S;
                        TipsManagementScreen tipsManagementScreen2 = this.f157289b;
                        return dli.f.a(tipsManagementScreen2, tipsManagementScreen2.d(), v.k(tipsManagementScreen2.Q, tipsManagementScreen2.R), 0, null, null, null, 60);
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: i06.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TipsManagementScreen f157289b;

            {
                this.f157289b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                TipsManagementScreen tipsManagementScreen = this.f157289b;
                int i32 = 1;
                int i5 = 0;
                int i6 = 2;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = TipsManagementScreen.S;
                        return (j) ((c06.f) tipsManagementScreen.L.getValue()).e.get();
                    case 1:
                        KProperty[] kPropertyArr2 = TipsManagementScreen.S;
                        phm.a aVar = (phm.a) ue0.e.j(tipsManagementScreen.m2()).a().get(c06.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", c06.c.class, " is not found"));
                        }
                        c06.c cVar = ((c06.c) aVar2.b()).f20175c;
                        c06.f fVar = new c06.f();
                        fVar.f20181a = e4m.b.b(e4m.c.a(tipsManagementScreen));
                        int i21 = 7;
                        fVar.f20182b = e4m.b.b(new bt7.e(cVar, fVar, i32, i21));
                        fVar.f20183c = e4m.b.b(new bt7.e(cVar, fVar, i5, i21));
                        fVar.d = e4m.b.b(new bt7.e(cVar, fVar, 3, i21));
                        fVar.e = e4m.b.b(new bt7.e(cVar, fVar, i6, i21));
                        return fVar;
                    default:
                        KProperty[] kPropertyArr3 = TipsManagementScreen.S;
                        TipsManagementScreen tipsManagementScreen2 = this.f157289b;
                        return dli.f.a(tipsManagementScreen2, tipsManagementScreen2.d(), v.k(tipsManagementScreen2.Q, tipsManagementScreen2.R), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setVisibility(uiState.f157297b ? 0 : 8);
        largeActionButton.setEnabled(uiState.f157298c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (f) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.customer_present_tipping_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.customer_present_tipping_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        d3().f174564b.setText(new TextClause("Confirm", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.f59410q), null, new i06.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174565c.q0()), null, new i06.b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174564b.o), null, new i06.b(this, null, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.R.f52707c), null, new c(this, null), 3);
        RowDelegate rowDelegate = this.Q;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53223p), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(rowDelegate.f53222n), null, new i06.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, l.y(rowDelegate.f53218h, rowDelegate.f53225r, "merge(...)"), null, new i06.f(this, null), 3);
    }

    public final u d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final j d() {
        return (j) this.K.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.N.getValue();
    }
}
