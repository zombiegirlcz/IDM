package com.revolut.feature.profile.impl.ui.profile.screens.appearance;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.ThemeSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.ThemeSwitcherRoundedDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.R$id;
import com.revolut.feature.profile.impl.R$layout;
import com.revolut.feature.profile.impl.ui.profile.screens.appearance.AppearanceThemeScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import ema.c;
import fma.c0;
import fma.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import rd0.e;
import sji.b;
import t9l.f;
import te0.w;
import tna.g;
import tna.i;
import tna.j;
import tna.l;
import tna.n;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/screens/appearance/AppearanceThemeScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ltna/n;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AppearanceThemeScreen extends BaseRecyclerViewScreen<n, IOData$EmptyInput, q> {
    public static final /* synthetic */ KProperty[] i0 = {o0.f186429a.j(new h0(AppearanceThemeScreen.class, "binding", "getBinding()Lcom/revolut/feature/profile/impl/databinding/ScreenThemeBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RowDelegate f81435a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ThemeSwitcherDelegate f81436b0;
    public final ThemeSwitcherRoundedDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final IconSelectorDelegate f81437d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final ListSubheaderDelegate f81438e0;
    public final TextDelegate f0;
    public final LargeActionButtonDelegate g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f81439h0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/profile/impl/databinding/ScreenThemeBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.theme_navBar;
            BasicNavBar basicNavBar = (BasicNavBar) ViewBindings.findChildViewById(p0, i);
            if (basicNavBar != null) {
                i = R$id.theme_recyclerView;
                ScreenContentRecyclerView screenContentRecyclerView = (ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i);
                if (screenContentRecyclerView != null) {
                    return new c((ControllerContainerCoordinatorLayout) p0, basicNavBar, screenContentRecyclerView);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public AppearanceThemeScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_theme;
        this.V = true;
        this.W = s.t(this, a.f);
        this.X = R$id.theme_recyclerView;
        final int i = 0;
        this.Y = w.y0(new Function0(this) { // from class: tna.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppearanceThemeScreen f272339b;

            {
                this.f272339b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                int i3 = 4;
                int i5 = 3;
                int i6 = 2;
                int i21 = 1;
                int i22 = 0;
                AppearanceThemeScreen appearanceThemeScreen = this.f272339b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = AppearanceThemeScreen.i0;
                        phm.a aVar = (phm.a) ue0.e.j(appearanceThemeScreen.m2()).a().get(pla.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", pla.b.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).G0;
                        fma.t tVar = new fma.t();
                        tVar.f136221a = e4m.b.b(e4m.c.a(appearanceThemeScreen));
                        int i32 = 19;
                        tVar.f136222b = e4m.b.b(new fa0.q(c0Var, tVar, i6, i32));
                        tVar.f136223c = e4m.b.b(new fa0.q(c0Var, tVar, i21, i32));
                        tVar.d = e4m.b.b(new fa0.q(c0Var, tVar, i22, i32));
                        tVar.e = e4m.b.b(new fa0.q(c0Var, tVar, i3, i32));
                        tVar.f = e4m.b.b(new fa0.q(c0Var, tVar, i5, i32));
                        return tVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AppearanceThemeScreen.i0;
                        return (l) ((fma.t) appearanceThemeScreen.Y.getValue()).f.get();
                    default:
                        return v.k(appearanceThemeScreen.f81435a0, appearanceThemeScreen.f81436b0, appearanceThemeScreen.c0, appearanceThemeScreen.f81437d0, appearanceThemeScreen.f81438e0, appearanceThemeScreen.f0, appearanceThemeScreen.g0, new RowLoadingDelegate(), new FullScreenStateDelegate());
                }
            }
        });
        final int i2 = 1;
        this.Z = w.y0(new Function0(this) { // from class: tna.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppearanceThemeScreen f272339b;

            {
                this.f272339b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                int i3 = 4;
                int i5 = 3;
                int i6 = 2;
                int i21 = 1;
                int i222 = 0;
                AppearanceThemeScreen appearanceThemeScreen = this.f272339b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AppearanceThemeScreen.i0;
                        phm.a aVar = (phm.a) ue0.e.j(appearanceThemeScreen.m2()).a().get(pla.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", pla.b.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).G0;
                        fma.t tVar = new fma.t();
                        tVar.f136221a = e4m.b.b(e4m.c.a(appearanceThemeScreen));
                        int i32 = 19;
                        tVar.f136222b = e4m.b.b(new fa0.q(c0Var, tVar, i6, i32));
                        tVar.f136223c = e4m.b.b(new fa0.q(c0Var, tVar, i21, i32));
                        tVar.d = e4m.b.b(new fa0.q(c0Var, tVar, i222, i32));
                        tVar.e = e4m.b.b(new fa0.q(c0Var, tVar, i3, i32));
                        tVar.f = e4m.b.b(new fa0.q(c0Var, tVar, i5, i32));
                        return tVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AppearanceThemeScreen.i0;
                        return (l) ((fma.t) appearanceThemeScreen.Y.getValue()).f.get();
                    default:
                        return v.k(appearanceThemeScreen.f81435a0, appearanceThemeScreen.f81436b0, appearanceThemeScreen.c0, appearanceThemeScreen.f81437d0, appearanceThemeScreen.f81438e0, appearanceThemeScreen.f0, appearanceThemeScreen.g0, new RowLoadingDelegate(), new FullScreenStateDelegate());
                }
            }
        });
        this.f81435a0 = new RowDelegate(null, null, 7);
        this.f81436b0 = new ThemeSwitcherDelegate();
        this.c0 = new ThemeSwitcherRoundedDelegate();
        this.f81437d0 = new IconSelectorDelegate();
        this.f81438e0 = new ListSubheaderDelegate();
        this.f0 = new TextDelegate();
        this.g0 = new LargeActionButtonDelegate();
        final int i3 = 2;
        this.f81439h0 = w.y0(new Function0(this) { // from class: tna.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppearanceThemeScreen f272339b;

            {
                this.f272339b = this;
            }

            /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                int i32 = 4;
                int i5 = 3;
                int i6 = 2;
                int i21 = 1;
                int i222 = 0;
                AppearanceThemeScreen appearanceThemeScreen = this.f272339b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = AppearanceThemeScreen.i0;
                        phm.a aVar = (phm.a) ue0.e.j(appearanceThemeScreen.m2()).a().get(pla.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", pla.b.class, " is not found"));
                        }
                        c0 c0Var = ((c0) aVar2.b()).G0;
                        fma.t tVar = new fma.t();
                        tVar.f136221a = e4m.b.b(e4m.c.a(appearanceThemeScreen));
                        int i322 = 19;
                        tVar.f136222b = e4m.b.b(new fa0.q(c0Var, tVar, i6, i322));
                        tVar.f136223c = e4m.b.b(new fa0.q(c0Var, tVar, i21, i322));
                        tVar.d = e4m.b.b(new fa0.q(c0Var, tVar, i222, i322));
                        tVar.e = e4m.b.b(new fa0.q(c0Var, tVar, i32, i322));
                        tVar.f = e4m.b.b(new fa0.q(c0Var, tVar, i5, i322));
                        return tVar;
                    case 1:
                        KProperty[] kPropertyArr2 = AppearanceThemeScreen.i0;
                        return (l) ((fma.t) appearanceThemeScreen.Y.getValue()).f.get();
                    default:
                        return v.k(appearanceThemeScreen.f81435a0, appearanceThemeScreen.f81436b0, appearanceThemeScreen.c0, appearanceThemeScreen.f81437d0, appearanceThemeScreen.f81438e0, appearanceThemeScreen.f0, appearanceThemeScreen.g0, new RowLoadingDelegate(), new FullScreenStateDelegate());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (t) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f127642b.f59211b), null, new tk5.c(this, continuation, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, new f(e.b(this.f81436b0.f53542c), 10), null, new g(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, new f(e.b(this.c0.d.f121375b), 11), null, new g(this, continuation, 1), 3);
        RowDelegate rowDelegate = this.f81435a0;
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53218h), null, new tna.h(this, null), 3);
        IconSelectorDelegate iconSelectorDelegate = this.f81437d0;
        com.revolut.kompot.navigable.a.g2(this, e.b(iconSelectorDelegate.f52489c.d), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(iconSelectorDelegate.d.f274884a), null, new g(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(rowDelegate.f53225r), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f0.f53530c), null, new tna.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.g0.d.f121375b), null, new tna.f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        BasicNavBar basicNavBar = g3().f127642b;
        m70.a.c(t0.f186434a);
        basicNavBar.setTitle(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        basicNavBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        g3().f127643c.setItemAnimator(null);
        ((j60.a) ((t) this.Y.getValue()).f136223c.get()).d(u.c(this.g0));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: b3 */
    public final boolean getQ() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF74047a0() {
        return (List) this.f81439h0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.X;
    }

    public final c g3() {
        ViewBinding value = this.W.getValue(this, i0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final l T2() {
        return (l) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
