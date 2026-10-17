package com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign;

import aii.q;
import ali.c;
import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.ScreenerAllCollectionsRedesignScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.retail.wealth.resources.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import joh.i;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kx4.f0;
import lph.d;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_collections_redesign/ScreenerAllCollectionsRedesignScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lali/g;", "Llph/b;", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_collections_redesign/ScreenerAllCollectionsRedesignContract$CollectionsPagerItem;", "<init>", "()V", "Companion", "a", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScreenerAllCollectionsRedesignScreen extends ViewController<q> implements g {
    public final h K = s.t(this, b.f);
    public final int L = R$layout.screen_navbar_tabs_pager;
    public final Object M;
    public final Object N;
    public final Object O;
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(ScreenerAllCollectionsRedesignScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenNavbarTabsPagerBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, jii.g.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenNavbarTabsPagerBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return jii.g.a(p0);
        }
    }

    public ScreenerAllCollectionsRedesignScreen() {
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: lph.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerAllCollectionsRedesignScreen f199134b;

            {
                this.f199134b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ScreenerAllCollectionsRedesignScreen screenerAllCollectionsRedesignScreen = this.f199134b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerAllCollectionsRedesignScreen.P;
                        return (d) ((joh.i) screenerAllCollectionsRedesignScreen.O.getValue()).f177008a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerAllCollectionsRedesignScreen.P;
                        return mif.a.a(screenerAllCollectionsRedesignScreen, 0, R$id.screenNavbarTabsPager_pager, screenerAllCollectionsRedesignScreen.d(), 5);
                    default:
                        KProperty[] kPropertyArr3 = ScreenerAllCollectionsRedesignScreen.P;
                        phm.a aVar = (phm.a) ue0.e.j(screenerAllCollectionsRedesignScreen.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        joh.i iVar = new joh.i();
                        iVar.f177008a = e4m.b.b(new joh.h(wVar, iVar));
                        return iVar;
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: lph.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerAllCollectionsRedesignScreen f199134b;

            {
                this.f199134b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ScreenerAllCollectionsRedesignScreen screenerAllCollectionsRedesignScreen = this.f199134b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerAllCollectionsRedesignScreen.P;
                        return (d) ((joh.i) screenerAllCollectionsRedesignScreen.O.getValue()).f177008a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerAllCollectionsRedesignScreen.P;
                        return mif.a.a(screenerAllCollectionsRedesignScreen, 0, R$id.screenNavbarTabsPager_pager, screenerAllCollectionsRedesignScreen.d(), 5);
                    default:
                        KProperty[] kPropertyArr3 = ScreenerAllCollectionsRedesignScreen.P;
                        phm.a aVar = (phm.a) ue0.e.j(screenerAllCollectionsRedesignScreen.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        joh.i iVar = new joh.i();
                        iVar.f177008a = e4m.b.b(new joh.h(wVar, iVar));
                        return iVar;
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: lph.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ScreenerAllCollectionsRedesignScreen f199134b;

            {
                this.f199134b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ScreenerAllCollectionsRedesignScreen screenerAllCollectionsRedesignScreen = this.f199134b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ScreenerAllCollectionsRedesignScreen.P;
                        return (d) ((joh.i) screenerAllCollectionsRedesignScreen.O.getValue()).f177008a.get();
                    case 1:
                        KProperty[] kPropertyArr2 = ScreenerAllCollectionsRedesignScreen.P;
                        return mif.a.a(screenerAllCollectionsRedesignScreen, 0, R$id.screenNavbarTabsPager_pager, screenerAllCollectionsRedesignScreen.d(), 5);
                    default:
                        KProperty[] kPropertyArr3 = ScreenerAllCollectionsRedesignScreen.P;
                        phm.a aVar = (phm.a) ue0.e.j(screenerAllCollectionsRedesignScreen.m2()).a().get(vnh.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", vnh.b.class, " is not found"));
                        }
                        joh.w wVar = ((joh.w) aVar2.b()).k;
                        joh.i iVar = new joh.i();
                        iVar.f177008a = e4m.b.b(new joh.h(wVar, iVar));
                        return iVar;
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        lph.b uiState = (lph.b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174522b.setItems(uiState.f199124a, uiState.f199125b);
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        ScreenerAllCollectionsRedesignContract$CollectionsPagerItem pagerItem2 = (ScreenerAllCollectionsRedesignContract$CollectionsPagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        d dVarD = d();
        String tabId = pagerItem2.getF94249a();
        dVarD.getClass();
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        dVarD.H2(dVarD.f199131s, new l3d.a(tabId, 27));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (i) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174523c;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.screener_collections_header_title, null, null, 14), null);
        navBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.screener_collections_header_description, null, null, 14));
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setMenuItems(u.c(new IconNavBarMenuItem("LIST_ID_MENU_ACTION_NEW", new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.screener_collections_header_action_new, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION)));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174523c.f59410q), new lph.g(this, null, 0), 3);
        ViewController.P2(this, new f0(rd0.e.b(d3().f174523c.o.f57403b), 28), new lph.g(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f174522b.f58882b), new lph.h(this, null, 0), 3);
    }

    public final jii.g d3() {
        ViewBinding value = this.K.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.g) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d d() {
        return (d) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.N.getValue();
    }
}
