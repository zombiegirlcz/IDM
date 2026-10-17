package com.revolut.feature.category_boost.impl.ui.overview;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import c65.i;
import cf3.c;
import cli.a0;
import cli.l;
import cli.o;
import cli.w;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.category_boost.impl.ui.overview.CategoryBoostsOverviewScreen;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import jii.j;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pki.b;
import tx0.d0;
import u45.v;
import ue3.d;
import ue3.e;
import ue3.g;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/category_boost/impl/ui/overview/CategoryBoostsOverviewScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Lcli/l;", "<init>", "()V", "feature_category_boost_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CategoryBoostsOverviewScreen extends ViewController<q> implements w {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(CategoryBoostsOverviewScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarBinding;", 0))};
    public final Object L;
    public final Object M;
    public final Object N;
    public final h K = s.t(this, a.f);
    public final int O = R$layout.screen_recycler_basic_navbar;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, j.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerBasicNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return j.a(p0);
        }
    }

    public CategoryBoostsOverviewScreen() {
        final int i = 0;
        this.L = te0.w.y0(new Function0(this) { // from class: cf3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CategoryBoostsOverviewScreen f23533b;

            {
                this.f23533b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CategoryBoostsOverviewScreen categoryBoostsOverviewScreen = this.f23533b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CategoryBoostsOverviewScreen.P;
                        qji.b bVarU2 = categoryBoostsOverviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.category_boost.impl.ui.overview.di.CategoryBoostsOverviewScreenInjector");
                        d dVar = ((e) bVarU2).f279296a;
                        g gVar = new g();
                        gVar.f279299a = e4m.b.b(new v(dVar, 19));
                        return gVar;
                    case 1:
                        KProperty[] kPropertyArr2 = CategoryBoostsOverviewScreen.P;
                        return (c) ((g) categoryBoostsOverviewScreen.L.getValue()).f279299a.get();
                    default:
                        KProperty[] kPropertyArr3 = CategoryBoostsOverviewScreen.P;
                        return n14.e.a(categoryBoostsOverviewScreen, (c) categoryBoostsOverviewScreen.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = te0.w.y0(new Function0(this) { // from class: cf3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CategoryBoostsOverviewScreen f23533b;

            {
                this.f23533b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CategoryBoostsOverviewScreen categoryBoostsOverviewScreen = this.f23533b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CategoryBoostsOverviewScreen.P;
                        qji.b bVarU2 = categoryBoostsOverviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.category_boost.impl.ui.overview.di.CategoryBoostsOverviewScreenInjector");
                        d dVar = ((e) bVarU2).f279296a;
                        g gVar = new g();
                        gVar.f279299a = e4m.b.b(new v(dVar, 19));
                        return gVar;
                    case 1:
                        KProperty[] kPropertyArr2 = CategoryBoostsOverviewScreen.P;
                        return (c) ((g) categoryBoostsOverviewScreen.L.getValue()).f279299a.get();
                    default:
                        KProperty[] kPropertyArr3 = CategoryBoostsOverviewScreen.P;
                        return n14.e.a(categoryBoostsOverviewScreen, (c) categoryBoostsOverviewScreen.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = te0.w.y0(new Function0(this) { // from class: cf3.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CategoryBoostsOverviewScreen f23533b;

            {
                this.f23533b = this;
            }

            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CategoryBoostsOverviewScreen categoryBoostsOverviewScreen = this.f23533b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CategoryBoostsOverviewScreen.P;
                        qji.b bVarU2 = categoryBoostsOverviewScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.category_boost.impl.ui.overview.di.CategoryBoostsOverviewScreenInjector");
                        d dVar = ((e) bVarU2).f279296a;
                        g gVar = new g();
                        gVar.f279299a = e4m.b.b(new v(dVar, 19));
                        return gVar;
                    case 1:
                        KProperty[] kPropertyArr2 = CategoryBoostsOverviewScreen.P;
                        return (c) ((g) categoryBoostsOverviewScreen.L.getValue()).f279299a.get();
                    default:
                        KProperty[] kPropertyArr3 = CategoryBoostsOverviewScreen.P;
                        return n14.e.a(categoryBoostsOverviewScreen, (c) categoryBoostsOverviewScreen.M.getValue());
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (c) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        BasicNavBar basicNavBar = ((j) value).f174530b;
        basicNavBar.setBackground(d0.TRANSPARENT);
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((j) value).f174530b.f59211b), new i(this, null, 10), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.N.getValue();
    }
}
