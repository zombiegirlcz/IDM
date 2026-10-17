package com.revolut.feature.apm.multibanco.impl.via_verde.ui.home;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.multibanco.api.R$string;
import com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.ViaVerdeHomeScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import g92.g;
import h30.l;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import l92.j;
import l92.k;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/multibanco/impl/via_verde/ui/home/ViaVerdeHomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ll92/c;", "<init>", "()V", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ViaVerdeHomeScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(ViaVerdeHomeScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final int K = R$layout.screen_recycler_navbar;
    public final boolean L = true;
    public final h M = s.t(this, a.f);
    public final Object N = w.y0(new kw4.b(28));
    public final Object O = w.y0(new kw4.b(29));
    public final Object P = w.y0(new l92.h(0));
    public final Object Q = w.y0(new l92.h(1));
    public final Object R;
    public final Object S;
    public final Object T;

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

    public ViaVerdeHomeScreen() {
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: l92.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViaVerdeHomeScreen f193032b;

            {
                this.f193032b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ViaVerdeHomeScreen viaVerdeHomeScreen = this.f193032b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ViaVerdeHomeScreen.U;
                        ViaVerdeHomeScreen viaVerdeHomeScreen2 = this.f193032b;
                        return dli.f.a(viaVerdeHomeScreen2, viaVerdeHomeScreen2.R2(), v.k(new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new TextDelegate(), (FullScreenStateDelegate) viaVerdeHomeScreen2.N.getValue(), (ListSubheaderDelegate) viaVerdeHomeScreen2.O.getValue(), (RowDelegate) viaVerdeHomeScreen2.P.getValue(), (LargeActionButtonDelegate) viaVerdeHomeScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ViaVerdeHomeScreen.U;
                        qji.b bVarU2 = viaVerdeHomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.di.ViaVerdeHomeScreenInjector");
                        g92.f fVar = (g92.f) bVarU2;
                        return new g92.g(fVar.f141447a, fVar.f141448b);
                    default:
                        KProperty[] kPropertyArr3 = ViaVerdeHomeScreen.U;
                        return (d) ((g92.g) viaVerdeHomeScreen.S.getValue()).f141452c.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: l92.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViaVerdeHomeScreen f193032b;

            {
                this.f193032b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ViaVerdeHomeScreen viaVerdeHomeScreen = this.f193032b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ViaVerdeHomeScreen.U;
                        ViaVerdeHomeScreen viaVerdeHomeScreen2 = this.f193032b;
                        return dli.f.a(viaVerdeHomeScreen2, viaVerdeHomeScreen2.R2(), v.k(new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new TextDelegate(), (FullScreenStateDelegate) viaVerdeHomeScreen2.N.getValue(), (ListSubheaderDelegate) viaVerdeHomeScreen2.O.getValue(), (RowDelegate) viaVerdeHomeScreen2.P.getValue(), (LargeActionButtonDelegate) viaVerdeHomeScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ViaVerdeHomeScreen.U;
                        qji.b bVarU2 = viaVerdeHomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.di.ViaVerdeHomeScreenInjector");
                        g92.f fVar = (g92.f) bVarU2;
                        return new g92.g(fVar.f141447a, fVar.f141448b);
                    default:
                        KProperty[] kPropertyArr3 = ViaVerdeHomeScreen.U;
                        return (d) ((g92.g) viaVerdeHomeScreen.S.getValue()).f141452c.get();
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: l92.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViaVerdeHomeScreen f193032b;

            {
                this.f193032b = this;
            }

            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ViaVerdeHomeScreen viaVerdeHomeScreen = this.f193032b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ViaVerdeHomeScreen.U;
                        ViaVerdeHomeScreen viaVerdeHomeScreen2 = this.f193032b;
                        return dli.f.a(viaVerdeHomeScreen2, viaVerdeHomeScreen2.R2(), v.k(new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new TextDelegate(), (FullScreenStateDelegate) viaVerdeHomeScreen2.N.getValue(), (ListSubheaderDelegate) viaVerdeHomeScreen2.O.getValue(), (RowDelegate) viaVerdeHomeScreen2.P.getValue(), (LargeActionButtonDelegate) viaVerdeHomeScreen2.Q.getValue()), R$id.recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = ViaVerdeHomeScreen.U;
                        qji.b bVarU2 = viaVerdeHomeScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.di.ViaVerdeHomeScreenInjector");
                        g92.f fVar = (g92.f) bVarU2;
                        return new g92.g(fVar.f141447a, fVar.f141448b);
                    default:
                        KProperty[] kPropertyArr3 = ViaVerdeHomeScreen.U;
                        return (d) ((g92.g) viaVerdeHomeScreen.S.getValue()).f141452c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((l92.c) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.via_verde_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.via_verde_home_header_subtitle, u.c(new TextLocalisedClause(R$string.via_verde_home_header_subtitle_link, null, new Click(30, (Integer) null, (Object) null, "HEADER_CLAUSE", false), 10)), null, 12);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setSecondDescriptionText(textLocalisedClause2);
        navBarWithToolbar.setSecondDescriptionVisible(true);
    }

    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, l.y(d3().f174539b.f59410q, d3().f174539b.f59409p.f57336l, "merge(...)"), null, new ko2.b(this, null, 28), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f174539b.x0()), null, new com.revolut.feature.apm.multibanco.impl.via_verde.ui.home.a(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((ListSubheaderDelegate) this.O.getValue()).f52707c), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((RowDelegate) this.P.getValue()).f53218h), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((LargeActionButtonDelegate) this.Q.getValue()).d.f121375b), null, new l92.l(this, null), 3);
        ?? r56 = this.N;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) r56.getValue()).f.f121375b), null, new l92.m(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((FullScreenStateDelegate) r56.getValue()).f52370g.f121375b), null, new b(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final l92.d R2() {
        return (l92.d) this.T.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.L);
    }
}
