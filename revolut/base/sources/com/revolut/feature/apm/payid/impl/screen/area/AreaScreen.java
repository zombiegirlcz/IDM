package com.revolut.feature.apm.payid.impl.screen.area;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.product.ApmPayId;
import com.revolut.feature.apm.payid.api.R$string;
import com.revolut.feature.apm.payid.impl.screen.area.AreaScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.youTransactor.uCube.rpc.Constants;
import dw3.v7;
import java.util.List;
import jii.m;
import ka2.d;
import ka2.f;
import ka2.g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tx0.j0;
import vc.s;
import xki.e;
import yy0.i;
import yy0.l;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/apm/payid/impl/screen/area/AreaScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/apm/payid/impl/screen/area/a;", "Ldli/a;", "Lka2/u;", "<init>", "()V", "Companion", "a", "feature_apm_payid_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AreaScreen extends ViewController<a> implements dli.a {
    public final int K = R$layout.screen_recycler_navbar;
    public final h L = s.t(this, b.f);
    public final ActionsDelegate M = new ActionsDelegate();
    public final ActionWidgetDelegate N = new ActionWidgetDelegate();
    public final ListSubheaderDelegate O = new ListSubheaderDelegate();
    public final ReferralContactDelegate P;
    public final ScrollerBoxDelegate Q;
    public final RowDelegate R;
    public final SwipeToActionDelegate S;
    public final LargeActionButtonDelegate T;
    public final Object U;
    public final Object V;
    public final Object W;
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(AreaScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.apm.payid.impl.screen.area.AreaScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final /* synthetic */ class b extends q implements Function1 {
        public static final b f = new b();

        public b() {
            super(1, m.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return m.a(p0);
        }
    }

    public AreaScreen() {
        ReferralContactDelegate referralContactDelegate = new ReferralContactDelegate();
        this.P = referralContactDelegate;
        this.Q = new ScrollerBoxDelegate(u.c(referralContactDelegate));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = rowDelegate;
        this.S = new SwipeToActionDelegate(rowDelegate, false);
        this.T = new LargeActionButtonDelegate();
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: ka2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AreaScreen f182388b;

            {
                this.f182388b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AreaScreen areaScreen = this.f182388b;
                int i3 = 2;
                int i5 = 1;
                int i6 = 0;
                switch (i2) {
                    case 0:
                        AreaScreen.Companion companion = AreaScreen.INSTANCE;
                        return (i) ((ea2.c) areaScreen.V.getValue()).f124059c.get();
                    case 1:
                        AreaScreen.Companion companion2 = AreaScreen.INSTANCE;
                        qji.b bVarU2 = areaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.area.di.AreaScreenInjector");
                        ea2.h hVar = ((ea2.i) bVarU2).f124085b;
                        ea2.c cVar = new ea2.c();
                        int i21 = 23;
                        cVar.f124057a = e4m.b.b(new v7(hVar, cVar, i5, i21));
                        cVar.f124058b = e4m.b.b(new v7(hVar, cVar, i3, i21));
                        cVar.f124059c = e4m.b.b(new v7(hVar, cVar, i6, i21));
                        return cVar;
                    default:
                        AreaScreen.Companion companion3 = AreaScreen.INSTANCE;
                        AreaScreen areaScreen2 = this.f182388b;
                        return dli.f.a(areaScreen2, areaScreen2.d(), zhm.v.k(areaScreen2.M, areaScreen2.N, areaScreen2.O, areaScreen2.Q, new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new TextDelegate(), areaScreen2.S, areaScreen2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.V = w.y0(new Function0(this) { // from class: ka2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AreaScreen f182388b;

            {
                this.f182388b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AreaScreen areaScreen = this.f182388b;
                int i3 = 2;
                int i5 = 1;
                int i6 = 0;
                switch (i22) {
                    case 0:
                        AreaScreen.Companion companion = AreaScreen.INSTANCE;
                        return (i) ((ea2.c) areaScreen.V.getValue()).f124059c.get();
                    case 1:
                        AreaScreen.Companion companion2 = AreaScreen.INSTANCE;
                        qji.b bVarU2 = areaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.area.di.AreaScreenInjector");
                        ea2.h hVar = ((ea2.i) bVarU2).f124085b;
                        ea2.c cVar = new ea2.c();
                        int i21 = 23;
                        cVar.f124057a = e4m.b.b(new v7(hVar, cVar, i5, i21));
                        cVar.f124058b = e4m.b.b(new v7(hVar, cVar, i3, i21));
                        cVar.f124059c = e4m.b.b(new v7(hVar, cVar, i6, i21));
                        return cVar;
                    default:
                        AreaScreen.Companion companion3 = AreaScreen.INSTANCE;
                        AreaScreen areaScreen2 = this.f182388b;
                        return dli.f.a(areaScreen2, areaScreen2.d(), zhm.v.k(areaScreen2.M, areaScreen2.N, areaScreen2.O, areaScreen2.Q, new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new TextDelegate(), areaScreen2.S, areaScreen2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.W = w.y0(new Function0(this) { // from class: ka2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AreaScreen f182388b;

            {
                this.f182388b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AreaScreen areaScreen = this.f182388b;
                int i32 = 2;
                int i5 = 1;
                int i6 = 0;
                switch (i22) {
                    case 0:
                        AreaScreen.Companion companion = AreaScreen.INSTANCE;
                        return (i) ((ea2.c) areaScreen.V.getValue()).f124059c.get();
                    case 1:
                        AreaScreen.Companion companion2 = AreaScreen.INSTANCE;
                        qji.b bVarU2 = areaScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.apm.payid.impl.screen.area.di.AreaScreenInjector");
                        ea2.h hVar = ((ea2.i) bVarU2).f124085b;
                        ea2.c cVar = new ea2.c();
                        int i21 = 23;
                        cVar.f124057a = e4m.b.b(new v7(hVar, cVar, i5, i21));
                        cVar.f124058b = e4m.b.b(new v7(hVar, cVar, i32, i21));
                        cVar.f124059c = e4m.b.b(new v7(hVar, cVar, i6, i21));
                        return cVar;
                    default:
                        AreaScreen.Companion companion3 = AreaScreen.INSTANCE;
                        AreaScreen areaScreen2 = this.f182388b;
                        return dli.f.a(areaScreen2, areaScreen2.d(), zhm.v.k(areaScreen2.M, areaScreen2.N, areaScreen2.O, areaScreen2.Q, new ListSubheaderLoadingDelegate(), new RowLoadingDelegate(), new TextDelegate(), areaScreen2.S, areaScreen2.T), R$id.recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        dli.a.z0((ka2.u) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (ea2.c) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        List<? extends NavBarMenuItem> listC = u.c(new IconNavBarMenuItem("MENU_OPEN_SETTINGS_SCREEN", new ResourceImage(R$drawable.uikit_icn_24_gear, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(R$string.payid_settings_title, null, null, 14), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
        NavBarWithToolbar navBarWithToolbar = d3().f174539b;
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.pay_id_area_title, null, null, 14), null);
        navBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.pay_id_area_subtitle, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10));
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        i iVar = l.Companion;
        Image imageF = ApmPayId.f61819c.F();
        iVar.getClass();
        navBarWithToolbar.setEndImage(i.a(imageF));
        navBarWithToolbar.setDescriptionVisible(true);
        navBarWithToolbar.setMenuItems(listC);
        ViewController.P2(this, rd0.e.b(this.M.f51611c.f121375b), new ka2.b(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.N.f51589c.f121375b), new ka2.c(this, null), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.f59410q), new k22.c(this, continuation, 14), 3);
        ViewController.P2(this, rd0.e.b(d3().f174539b.o.f57403b), new jv.o(this, continuation, 29), 3);
        ViewController.P2(this, rd0.e.b(this.O.f52707c), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.P.q()), new ka2.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.R.f53218h), new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.T.d.f121375b), null, new g(this, null), 3);
    }

    public final m d3() {
        ViewBinding value = this.L.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (m) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final ka2.i d() {
        return (ka2.i) this.U.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.W.getValue();
    }
}
