package com.revolut.feature.insurance_home.impl.ui.screen.home;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import au0.b1;
import au0.m0;
import au0.s0;
import cli.o;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_home.impl.R$id;
import com.revolut.feature.insurance_home.impl.R$layout;
import com.revolut.feature.insurance_home.impl.R$string;
import com.revolut.feature.insurance_home.impl.ui.screen.home.InsuranceHomeScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import dli.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import qw7.i;
import te0.w;
import tna.p;
import tw7.d;
import tw7.f;
import tw7.g;
import tw7.j;
import tx0.p2;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/insurance_home/impl/ui/screen/home/InsuranceHomeScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Ltw7/j;", "<init>", "()V", "feature_insurance_home_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InsuranceHomeScreen extends ViewController<q> implements dli.a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(InsuranceHomeScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_home/impl/databinding/ScreenInsuranceHomeBinding;", 0))};
    public final Object P;
    public final Object R;
    public final Object S;
    public final int K = R$layout.screen_insurance_home;
    public final int L = R$style.UiKitTheme_Mono;
    public final FullScreenStateDelegate M = new FullScreenStateDelegate();
    public final RowDelegate N = new RowDelegate(null, null, 7);
    public final ActionWidgetDelegate O = new ActionWidgetDelegate();
    public final h Q = s.t(this, a.f);

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, nw7.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/insurance_home/impl/databinding/ScreenInsuranceHomeBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.insuranceHomeScreen_background;
            AnimatedBackgroundView animatedBackgroundView = (AnimatedBackgroundView) ViewBindings.findChildViewById(p0, i);
            if (animatedBackgroundView != null) {
                i = R$id.insuranceHomeScreen_button;
                LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                if (largeActionButton != null) {
                    i = R$id.insuranceHomeScreen_navBar;
                    NavBarWithBigTile navBarWithBigTile = (NavBarWithBigTile) ViewBindings.findChildViewById(p0, i);
                    if (navBarWithBigTile != null) {
                        i = R$id.insuranceHomeScreen_recyclerView;
                        if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                            return new nw7.a((ControllerContainerCoordinatorLayout) p0, animatedBackgroundView, largeActionButton, navBarWithBigTile);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public InsuranceHomeScreen() {
        final int i = 0;
        this.P = w.y0(new Function0(this) { // from class: tw7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceHomeScreen f274932b;

            {
                this.f274932b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                InsuranceHomeScreen insuranceHomeScreen = this.f274932b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceHomeScreen.T;
                        InsuranceHomeScreen insuranceHomeScreen2 = this.f274932b;
                        return dli.f.a(insuranceHomeScreen2, insuranceHomeScreen2.R2(), v.k(insuranceHomeScreen2.M, insuranceHomeScreen2.N, insuranceHomeScreen2.O, new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.insuranceHomeScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceHomeScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(insuranceHomeScreen.m2()).a().get(qw7.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (qw7.i) ((uw7.a) ((uw7.b) aVar2.b()).b().mo3808a(insuranceHomeScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", qw7.e.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = InsuranceHomeScreen.T;
                        qw7.i iVar = (qw7.i) insuranceHomeScreen.R.getValue();
                        switch (iVar.f249825a) {
                            case 0:
                                return (i) iVar.d.get();
                            default:
                                return (i) iVar.d.get();
                        }
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: tw7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceHomeScreen f274932b;

            {
                this.f274932b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                InsuranceHomeScreen insuranceHomeScreen = this.f274932b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceHomeScreen.T;
                        InsuranceHomeScreen insuranceHomeScreen2 = this.f274932b;
                        return dli.f.a(insuranceHomeScreen2, insuranceHomeScreen2.R2(), v.k(insuranceHomeScreen2.M, insuranceHomeScreen2.N, insuranceHomeScreen2.O, new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.insuranceHomeScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceHomeScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(insuranceHomeScreen.m2()).a().get(qw7.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (qw7.i) ((uw7.a) ((uw7.b) aVar2.b()).b().mo3808a(insuranceHomeScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", qw7.e.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = InsuranceHomeScreen.T;
                        qw7.i iVar = (qw7.i) insuranceHomeScreen.R.getValue();
                        switch (iVar.f249825a) {
                            case 0:
                                return (i) iVar.d.get();
                            default:
                                return (i) iVar.d.get();
                        }
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: tw7.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InsuranceHomeScreen f274932b;

            {
                this.f274932b = this;
            }

            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                InsuranceHomeScreen insuranceHomeScreen = this.f274932b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = InsuranceHomeScreen.T;
                        InsuranceHomeScreen insuranceHomeScreen2 = this.f274932b;
                        return dli.f.a(insuranceHomeScreen2, insuranceHomeScreen2.R2(), v.k(insuranceHomeScreen2.M, insuranceHomeScreen2.N, insuranceHomeScreen2.O, new RowLoadingDelegate(), new ListSubheaderDelegate()), R$id.insuranceHomeScreen_recyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = InsuranceHomeScreen.T;
                        phm.a aVar = (phm.a) ue0.e.j(insuranceHomeScreen.m2()).a().get(qw7.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 != null) {
                            return (qw7.i) ((uw7.a) ((uw7.b) aVar2.b()).b().mo3808a(insuranceHomeScreen)).mo3783build();
                        }
                        throw new IllegalStateException(a0.d.q("Api ", qw7.e.class, " is not found"));
                    default:
                        KProperty[] kPropertyArr3 = InsuranceHomeScreen.T;
                        qw7.i iVar = (qw7.i) insuranceHomeScreen.R.getValue();
                        switch (iVar.f249825a) {
                            case 0:
                                return (i) iVar.d.get();
                            default:
                                return (i) iVar.d.get();
                        }
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getW() {
        return Integer.valueOf(this.L);
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        j uiState = (j) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        dli.a.z0(uiState);
        LargeActionButton largeActionButton = d3().f219788c;
        Clause clause = uiState.f274939c;
        largeActionButton.setVisibility(clause != null ? 0 : 8);
        largeActionButton.setText(clause);
        NavBarWithBigTile navBarWithBigTile = d3().d;
        navBarWithBigTile.setLoadingState(uiState.f274937a);
        navBarWithBigTile.setDescription(uiState.f274938b);
        navBarWithBigTile.setMenuItems(uiState.e);
        d3().f219787b.setBackgroundType(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().d;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.insurance_home_home_title, null, null, 14);
        navBarWithBigTile.setToolbarTitle(textLocalisedClause);
        navBarWithBigTile.setTitle(textLocalisedClause);
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setLoadingState(false);
        navBarWithBigTile.setTitleStyle(b1.LARGE);
        navBarWithBigTile.setLayoutType(s0.CENTERED);
        navBarWithBigTile.setHeightMode(p2.f275222a);
        navBarWithBigTile.setBackgroundOverlayDecoration(m0.NONE);
        d3().f219788c.o(LargeActionButton.ButtonStyle.f58725a);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.f59357t), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().f219788c.o), null, new d(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(d3().d.b()), null, new p(this, continuation, 20), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f51589c.f121375b), null, new tw7.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.f53218h), null, new f(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new t9l.f(rd0.e.b(this.M.f52371h.f121375b), 27), null, new g(this, null), 3);
    }

    public final nw7.a d3() {
        ViewBinding value = this.Q.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (nw7.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final tw7.i R2() {
        return (tw7.i) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
