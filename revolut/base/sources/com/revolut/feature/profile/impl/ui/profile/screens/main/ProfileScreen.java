package com.revolut.feature.profile.impl.ui.profile.screens.main;

import android.os.Parcelable;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import bt9.t;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.delegates.ActionCardDelegate;
import com.revolut.core.ui_kit.delegates.ActionCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.BigTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlanTileDelegate;
import com.revolut.core.ui_kit.delegates.PlanWidgetDelegate;
import com.revolut.core.ui_kit.delegates.PlanWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PromotionalMediumTileDelegate;
import com.revolut.core.ui_kit.delegates.PromotionalMediumTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit.views.navbar.j;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.profile.impl.R$id;
import com.revolut.feature.profile.impl.R$layout;
import com.revolut.feature.profile.impl.ui.profile.screens.main.ProfileScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.revolut.feature_fourthline_impl.R;
import efm.r;
import grl.k9;
import ihm.f;
import java.util.List;
import jki.o;
import koi.c;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import mkd.g;
import nkd.b;
import no.m;
import rd0.e;
import te0.w;
import vc.s;
import xo8.a0;
import yea.l;
import yh6.y;
import yna.b0;
import yna.c0;
import yna.d0;
import yna.e0;
import yna.j1;
import yna.k1;
import yna.l1;
import yna.m1;
import yna.n1;
import yna.o1;
import yna.p1;
import yna.q1;
import yna.s1;
import yna.t1;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/screens/main/ProfileScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lyna/e0;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lyna/b0;", "", "Lmcf/a;", "Lno/m;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProfileScreen extends BaseRecyclerViewScreen<e0, IOData$EmptyInput, b0> implements b, g, mcf.a, m {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f81447v0 = {o0.f186429a.j(new h0(ProfileScreen.class, "binding", "getBinding()Lcom/revolut/feature/profile/impl/databinding/ScreenProfileMainRevTenBinding;", 0))};
    public final int U;
    public final int V;
    public final int W;
    public final k9 X;
    public final boolean Y;
    public final h Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f81448a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f81449b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Object f81450d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Object f81451e0;
    public final Object f0;
    public final Object g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f81452h0;
    public final PromotionalMediumTileDelegate i0;
    public final Object j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f81453k0;
    public final Object l0;
    public final Object m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Object f81454n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final Object f81455o0;
    public final Object p0;
    public final ActionWidgetDelegate q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ScrollerDelegate f81456r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final f f81457s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Object f81458t0;
    public final Object u0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, ema.b.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/profile/impl/databinding/ScreenProfileMainRevTenBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            ControllerContainerCoordinatorLayout controllerContainerCoordinatorLayout = (ControllerContainerCoordinatorLayout) p0;
            int i = R$id.profileMainRevTen_navBarLargeCentred;
            NavBarLargeCentred navBarLargeCentred = (NavBarLargeCentred) ViewBindings.findChildViewById(p0, i);
            if (navBarLargeCentred != null) {
                i = R$id.profileMainRevTen_recyclerView;
                if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                    return new ema.b(controllerContainerCoordinatorLayout, navBarLargeCentred);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public ProfileScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_profile_main_rev_ten;
        this.V = R$style.UiKitTheme_TransparentSlider;
        this.W = R$id.profileMainRevTen_recyclerView;
        k9 value = k9.Profile;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        this.X = value;
        final int i = 1;
        this.Y = true;
        this.Z = s.t(this, a.f);
        final int i2 = 0;
        this.f81448a0 = w.y0(new Function0(this) { // from class: yna.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileScreen f315351b;

            {
                this.f315351b = this;
            }

            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ProfileScreen profileScreen = this.f315351b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = ProfileScreen.f81447v0;
                        ProfileScreen profileScreen2 = this.f315351b;
                        qji.b bVarQ2 = profileScreen2.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.main.di.ProfileMainScreenInjector");
                        fma.d0 d0Var = (fma.d0) bVarQ2;
                        return new fma.y(d0Var.f136085b, d0Var.f136086c, profileScreen2, profileScreen2, profileScreen2, profileScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = ProfileScreen.f81447v0;
                        return (fd6.a) ((fma.y) profileScreen.f81448a0.getValue()).u.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ProfileScreen.f81447v0;
                        return zhm.d0.E0(((fd6.a) profileScreen.f81458t0.getValue()).e, zhm.v.k((RowDelegate) profileScreen.c0.getValue(), new RowLoadingDelegate(), (PlanWidgetDelegate) profileScreen.f81450d0.getValue(), new PlanWidgetLoadingDelegate(), (TextDelegate) profileScreen.f81451e0.getValue(), (ListSubheaderDelegate) profileScreen.g0.getValue(), (CellDetailsActionDelegate) profileScreen.f0.getValue(), (BigTileDelegate) profileScreen.f81452h0.getValue(), new BigTileLoadingDelegate(), profileScreen.f81456r0, profileScreen.q0, new ActionWidgetLoadingDelegate(), profileScreen.i0, new PromotionalMediumTileLoadingDelegate(), (PlanTileDelegate) profileScreen.p0.getValue()));
                    default:
                        KProperty[] kPropertyArr4 = ProfileScreen.f81447v0;
                        return (c0) ((fma.y) profileScreen.f81448a0.getValue()).J.get();
                }
            }
        });
        final int i3 = 3;
        this.f81449b0 = w.y0(new Function0(this) { // from class: yna.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileScreen f315351b;

            {
                this.f315351b = this;
            }

            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                ProfileScreen profileScreen = this.f315351b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = ProfileScreen.f81447v0;
                        ProfileScreen profileScreen2 = this.f315351b;
                        qji.b bVarQ2 = profileScreen2.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.main.di.ProfileMainScreenInjector");
                        fma.d0 d0Var = (fma.d0) bVarQ2;
                        return new fma.y(d0Var.f136085b, d0Var.f136086c, profileScreen2, profileScreen2, profileScreen2, profileScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = ProfileScreen.f81447v0;
                        return (fd6.a) ((fma.y) profileScreen.f81448a0.getValue()).u.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ProfileScreen.f81447v0;
                        return zhm.d0.E0(((fd6.a) profileScreen.f81458t0.getValue()).e, zhm.v.k((RowDelegate) profileScreen.c0.getValue(), new RowLoadingDelegate(), (PlanWidgetDelegate) profileScreen.f81450d0.getValue(), new PlanWidgetLoadingDelegate(), (TextDelegate) profileScreen.f81451e0.getValue(), (ListSubheaderDelegate) profileScreen.g0.getValue(), (CellDetailsActionDelegate) profileScreen.f0.getValue(), (BigTileDelegate) profileScreen.f81452h0.getValue(), new BigTileLoadingDelegate(), profileScreen.f81456r0, profileScreen.q0, new ActionWidgetLoadingDelegate(), profileScreen.i0, new PromotionalMediumTileLoadingDelegate(), (PlanTileDelegate) profileScreen.p0.getValue()));
                    default:
                        KProperty[] kPropertyArr4 = ProfileScreen.f81447v0;
                        return (c0) ((fma.y) profileScreen.f81448a0.getValue()).J.get();
                }
            }
        });
        final int i5 = 2;
        this.c0 = w.y0(new j1(2));
        this.f81450d0 = w.y0(new y(20));
        this.f81451e0 = w.y0(new y(21));
        this.f0 = w.y0(new y(22));
        this.g0 = w.y0(new y(23));
        this.f81452h0 = w.y0(new y(24));
        this.i0 = new PromotionalMediumTileDelegate();
        this.j0 = w.y0(new y(25));
        this.f81453k0 = w.y0(new y(26));
        this.l0 = w.y0(new y(27));
        this.m0 = w.y0(new y(28));
        this.f81454n0 = w.y0(new y(29));
        Lazy lazyY0 = w.y0(new j1(0));
        this.f81455o0 = lazyY0;
        this.p0 = w.y0(new j1(1));
        ActionWidgetDelegate actionWidgetDelegate = new ActionWidgetDelegate();
        this.q0 = actionWidgetDelegate;
        this.f81456r0 = new ScrollerDelegate(v.k((ActionCardDelegate) lazyY0.getValue(), new ActionCardLoadingDelegate(), actionWidgetDelegate, new HeroBannerDelegate(0)), false);
        this.f81457s0 = v0.a.d("create(...)");
        this.f81458t0 = w.y0(new Function0(this) { // from class: yna.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileScreen f315351b;

            {
                this.f315351b = this;
            }

            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i;
                ProfileScreen profileScreen = this.f315351b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = ProfileScreen.f81447v0;
                        ProfileScreen profileScreen2 = this.f315351b;
                        qji.b bVarQ2 = profileScreen2.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.main.di.ProfileMainScreenInjector");
                        fma.d0 d0Var = (fma.d0) bVarQ2;
                        return new fma.y(d0Var.f136085b, d0Var.f136086c, profileScreen2, profileScreen2, profileScreen2, profileScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = ProfileScreen.f81447v0;
                        return (fd6.a) ((fma.y) profileScreen.f81448a0.getValue()).u.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ProfileScreen.f81447v0;
                        return zhm.d0.E0(((fd6.a) profileScreen.f81458t0.getValue()).e, zhm.v.k((RowDelegate) profileScreen.c0.getValue(), new RowLoadingDelegate(), (PlanWidgetDelegate) profileScreen.f81450d0.getValue(), new PlanWidgetLoadingDelegate(), (TextDelegate) profileScreen.f81451e0.getValue(), (ListSubheaderDelegate) profileScreen.g0.getValue(), (CellDetailsActionDelegate) profileScreen.f0.getValue(), (BigTileDelegate) profileScreen.f81452h0.getValue(), new BigTileLoadingDelegate(), profileScreen.f81456r0, profileScreen.q0, new ActionWidgetLoadingDelegate(), profileScreen.i0, new PromotionalMediumTileLoadingDelegate(), (PlanTileDelegate) profileScreen.p0.getValue()));
                    default:
                        KProperty[] kPropertyArr4 = ProfileScreen.f81447v0;
                        return (c0) ((fma.y) profileScreen.f81448a0.getValue()).J.get();
                }
            }
        });
        this.u0 = w.y0(new Function0(this) { // from class: yna.i1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProfileScreen f315351b;

            {
                this.f315351b = this;
            }

            /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                ProfileScreen profileScreen = this.f315351b;
                switch (i32) {
                    case 0:
                        KProperty[] kPropertyArr = ProfileScreen.f81447v0;
                        ProfileScreen profileScreen2 = this.f315351b;
                        qji.b bVarQ2 = profileScreen2.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.profile.impl.ui.profile.screens.main.di.ProfileMainScreenInjector");
                        fma.d0 d0Var = (fma.d0) bVarQ2;
                        return new fma.y(d0Var.f136085b, d0Var.f136086c, profileScreen2, profileScreen2, profileScreen2, profileScreen2);
                    case 1:
                        KProperty[] kPropertyArr2 = ProfileScreen.f81447v0;
                        return (fd6.a) ((fma.y) profileScreen.f81448a0.getValue()).u.get();
                    case 2:
                        KProperty[] kPropertyArr3 = ProfileScreen.f81447v0;
                        return zhm.d0.E0(((fd6.a) profileScreen.f81458t0.getValue()).e, zhm.v.k((RowDelegate) profileScreen.c0.getValue(), new RowLoadingDelegate(), (PlanWidgetDelegate) profileScreen.f81450d0.getValue(), new PlanWidgetLoadingDelegate(), (TextDelegate) profileScreen.f81451e0.getValue(), (ListSubheaderDelegate) profileScreen.g0.getValue(), (CellDetailsActionDelegate) profileScreen.f0.getValue(), (BigTileDelegate) profileScreen.f81452h0.getValue(), new BigTileLoadingDelegate(), profileScreen.f81456r0, profileScreen.q0, new ActionWidgetLoadingDelegate(), profileScreen.i0, new PromotionalMediumTileLoadingDelegate(), (PlanTileDelegate) profileScreen.p0.getValue()));
                    default:
                        KProperty[] kPropertyArr4 = ProfileScreen.f81447v0;
                        return (c0) ((fma.y) profileScreen.f81448a0.getValue()).J.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getM() {
        return Integer.valueOf(this.V);
    }

    @Override // mkd.g
    public final r F1() {
        return this.f81456r0.i;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        return new AnalyticsProduct.Retail(this.X);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (fma.y) this.f81448a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        int i = 0;
        ViewBinding value = this.Z.getValue(this, f81447v0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarLargeCentred navBarLargeCentred = ((ema.b) value).f127640b;
        Continuation continuation = null;
        int i2 = 3;
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarLargeCentred.F()), null, new m1(this, continuation, i), 3);
        int i3 = 1;
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarLargeCentred.C()), null, new m1(this, continuation, i3), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarLargeCentred.f59297s), null, new n1(this, null), 3);
        int i5 = 2;
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarLargeCentred.f59292m), null, new m1(this, continuation, i5), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarLargeCentred.f59291l.f57403b), null, new l1(this, continuation, i3), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarLargeCentred.f59298t), null, new m1(this, continuation, i2), 3);
        int i6 = 4;
        com.revolut.kompot.navigable.a.g2(this, e.b(w.a0(navBarLargeCentred.f59287b0.e, new t(12))), null, new m1(this, continuation, i6), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((RowDelegate) this.c0.getValue()).f53218h), null, new q1(this, null), 3);
        ?? r110 = this.f81450d0;
        com.revolut.kompot.navigable.a.g2(this, e.b(((PlanWidgetDelegate) r110.getValue()).f52955c), null, new o1(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((PlanWidgetDelegate) r110.getValue()).d), null, new p1(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((PlanWidgetDelegate) r110.getValue()).e.f121375b), null, new l1(this, continuation, i5), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((ActionCardDelegate) this.f81455o0.getValue()).f51572n), null, new k1(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, new a0(e.b(((TextDelegate) this.f81451e0.getValue()).f53530c), 28), null, new l1(this, continuation, i2), 3);
        ?? r111 = this.f81448a0;
        j60.a aVar = (j60.a) ((fma.y) r111.getValue()).i.get();
        ?? r92 = this.j0;
        CellDetailsSwitcherDelegate cellDetailsSwitcherDelegate = (CellDetailsSwitcherDelegate) r92.getValue();
        CellDetailsStandaloneNoteDelegate cellDetailsStandaloneNoteDelegate = new CellDetailsStandaloneNoteDelegate();
        ?? r122 = this.f81453k0;
        LargeActionButtonDelegate largeActionButtonDelegate = (LargeActionButtonDelegate) r122.getValue();
        ?? r142 = this.l0;
        aVar.d(v.k(cellDetailsSwitcherDelegate, cellDetailsStandaloneNoteDelegate, largeActionButtonDelegate, (TwinHorizontalButtonDelegate) r142.getValue(), (RowDelegate) this.f81454n0.getValue(), new GridBoxDelegate(u.c((SmallCardDelegate) this.m0.getValue()), 2, BitmapDescriptorFactory.HUE_RED, 8.0f, 4), new FullScreenStateDelegate()));
        com.revolut.kompot.navigable.a.g2(this, e.b(((CellDetailsSwitcherDelegate) r92.getValue()).f51912c), null, new s1(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((LargeActionButtonDelegate) r122.getValue()).d.f121375b), null, new t1(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((TwinHorizontalButtonDelegate) r142.getValue()).f53572c.f121375b), null, new l1(this, continuation, i6), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((TwinHorizontalButtonDelegate) r142.getValue()).d.f121375b), null, new l1(this, continuation, 5), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(((e60.s) ((e60.a) ((fma.y) r111.getValue()).f136246r.get())).f122868g), null, new l1(this, continuation, i), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        new xv0.w(new l(1, this.f81457s0, f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 10), null).b(h());
    }

    @Override // jkd.b
    public final r X1() {
        return this.f81457s0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF106555a0() {
        return (List) this.u0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(e0 uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        d0 d0Var = uiState.f315333a;
        ViewBinding value = this.Z.getValue(this, f81447v0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarLargeCentred navBarLargeCentred = ((ema.b) value).f127640b;
        TextClause textClause = d0Var.f315326a;
        navBarLargeCentred.setModel(new NavBarLargeCentred.Model(new com.revolut.core.ui_kit.views.navbar.l(textClause), textClause, d0Var.f315327b, d0Var.f315328c, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, new TextLocalisedClause(R.string.common_action_dismiss, null, null, 14), 126), null, new j((AvatarModel) d0Var.d, d0Var.f315330h, true), d0Var.e, 336));
        navBarLargeCentred.setMenuItems(d0Var.f);
        navBarLargeCentred.setSwitcherButton(d0Var.f315329g);
        Unit unit = Unit.f186387a;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final c0 T2() {
        return (c0) this.f81449b0.getValue();
    }

    @Override // nkd.b
    public final r q0() {
        PromotionalMediumTileDelegate promotionalMediumTileDelegate = this.i0;
        r rVarMerge = r.merge(promotionalMediumTileDelegate.f53038c, promotionalMediumTileDelegate.e);
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        return rVarMerge;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Y);
    }

    @Override // mkd.g
    public final c v0() {
        return d3().f;
    }

    @Override // nkd.b
    public final f w1() {
        return this.i0.d;
    }
}
