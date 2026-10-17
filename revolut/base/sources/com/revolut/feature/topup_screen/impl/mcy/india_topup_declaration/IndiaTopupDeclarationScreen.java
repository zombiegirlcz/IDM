package com.revolut.feature.topup_screen.impl.mcy.india_topup_declaration;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.mcy.india_topup_declaration.IndiaTopupDeclarationScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import efm.r;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import kw4.b;
import kye.m0;
import l0f.c;
import l0f.d;
import l0f.e;
import l0f.g;
import p12.o;
import qve.i;
import te0.w;
import tx0.j0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/topup_screen/impl/mcy/india_topup_declaration/IndiaTopupDeclarationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ll0f/d;", "Ldli/a;", "Ll0f/e;", "<init>", "()V", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IndiaTopupDeclarationScreen extends ViewController<d> implements dli.a {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(IndiaTopupDeclarationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final Object M;
    public final Object N;
    public final Object P;
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, a.f);
    public final Object O = w.y0(new b(8));

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

    public IndiaTopupDeclarationScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: l0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndiaTopupDeclarationScreen f191240b;

            {
                this.f191240b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                IndiaTopupDeclarationScreen indiaTopupDeclarationScreen = this.f191240b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = IndiaTopupDeclarationScreen.Q;
                        qji.b bVarU2 = indiaTopupDeclarationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.mcy.india_topup_declaration.di.IndiaTopupDeclarationScreenInjector");
                        i iVar = new i();
                        iVar.f249597a = e4m.b.b(new o(25));
                        return iVar;
                    case 1:
                        KProperty[] kPropertyArr2 = IndiaTopupDeclarationScreen.Q;
                        return (g) ((i) indiaTopupDeclarationScreen.M.getValue()).f249597a.get();
                    default:
                        KProperty[] kPropertyArr3 = IndiaTopupDeclarationScreen.Q;
                        IndiaTopupDeclarationScreen indiaTopupDeclarationScreen2 = this.f191240b;
                        return dli.f.a(indiaTopupDeclarationScreen2, (g) indiaTopupDeclarationScreen2.N.getValue(), v.k((InputDisclosureDelegate) indiaTopupDeclarationScreen2.O.getValue(), new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: l0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndiaTopupDeclarationScreen f191240b;

            {
                this.f191240b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                IndiaTopupDeclarationScreen indiaTopupDeclarationScreen = this.f191240b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IndiaTopupDeclarationScreen.Q;
                        qji.b bVarU2 = indiaTopupDeclarationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.mcy.india_topup_declaration.di.IndiaTopupDeclarationScreenInjector");
                        i iVar = new i();
                        iVar.f249597a = e4m.b.b(new o(25));
                        return iVar;
                    case 1:
                        KProperty[] kPropertyArr2 = IndiaTopupDeclarationScreen.Q;
                        return (g) ((i) indiaTopupDeclarationScreen.M.getValue()).f249597a.get();
                    default:
                        KProperty[] kPropertyArr3 = IndiaTopupDeclarationScreen.Q;
                        IndiaTopupDeclarationScreen indiaTopupDeclarationScreen2 = this.f191240b;
                        return dli.f.a(indiaTopupDeclarationScreen2, (g) indiaTopupDeclarationScreen2.N.getValue(), v.k((InputDisclosureDelegate) indiaTopupDeclarationScreen2.O.getValue(), new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: l0f.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IndiaTopupDeclarationScreen f191240b;

            {
                this.f191240b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                IndiaTopupDeclarationScreen indiaTopupDeclarationScreen = this.f191240b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = IndiaTopupDeclarationScreen.Q;
                        qji.b bVarU2 = indiaTopupDeclarationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.topup_screen.impl.mcy.india_topup_declaration.di.IndiaTopupDeclarationScreenInjector");
                        i iVar = new i();
                        iVar.f249597a = e4m.b.b(new o(25));
                        return iVar;
                    case 1:
                        KProperty[] kPropertyArr2 = IndiaTopupDeclarationScreen.Q;
                        return (g) ((i) indiaTopupDeclarationScreen.M.getValue()).f249597a.get();
                    default:
                        KProperty[] kPropertyArr3 = IndiaTopupDeclarationScreen.Q;
                        IndiaTopupDeclarationScreen indiaTopupDeclarationScreen2 = this.f191240b;
                        return dli.f.a(indiaTopupDeclarationScreen2, (g) indiaTopupDeclarationScreen2.N.getValue(), v.k((InputDisclosureDelegate) indiaTopupDeclarationScreen2.O.getValue(), new TextDelegate()), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(cli.o oVar, cli.q qVar) {
        dli.a.z0((e) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (g) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.topup_india_declaration_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.topup_india_declaration_description, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithToolbar.f59410q), null, new ko2.b(this, null, 17), 3);
        ?? r72 = this.O;
        r rVarFilter = ((InputDisclosureDelegate) r72.getValue()).f52538c.filter(new kxj.e(new m0(28), 12));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter), new l0f.b(this, null), 3);
        r rVarFilter2 = ((InputDisclosureDelegate) r72.getValue()).f52538c.filter(new kxj.e(new m0(29), 13));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        ViewController.P2(this, rd0.e.b(rVarFilter2), new c(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.P.getValue();
    }
}
