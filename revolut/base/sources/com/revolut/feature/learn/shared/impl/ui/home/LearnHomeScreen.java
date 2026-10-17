package com.revolut.feature.learn.shared.impl.ui.home;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.BigTileLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ContainerDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ScrollerDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.learn.shared.impl.R$layout;
import com.revolut.feature.learn.shared.impl.R$string;
import com.revolut.feature.learn.shared.impl.ui.home.LearnHomeScreen;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseScreen;
import dz8.f;
import f09.d;
import java.util.ArrayList;
import jki.o;
import kkf.r6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mc9.n;
import mta.c;
import mx0.oc;
import myj.g;
import mzb.e;
import n09.b;
import n09.b0;
import n09.c0;
import n09.j;
import no.m;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/learn/shared/impl/ui/home/LearnHomeScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Ln09/c0;", "Lcom/revolut/feature/learn/shared/impl/ui/home/LearnHomeScreenContract$InputData;", "Laii/q;", "Lno/m;", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LearnHomeScreen extends BaseScreen<c0, LearnHomeScreenContract$InputData, q> implements m {
    public static final /* synthetic */ KProperty[] Y = {o0.f186429a.j(new h0(LearnHomeScreen.class, "binding", "getBinding()Lcom/revolut/feature/learn/shared/impl/databinding/ScreenLearnHomeBinding;", 0))};
    public final int M;
    public final boolean N;
    public final h O;
    public final SmallCardDelegate P;
    public final BigTileDelegate Q;
    public final SmallCardDelegate R;
    public final TextDelegate S;
    public final FullScreenStateDelegate T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final j X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LearnHomeScreen(LearnHomeScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = R$layout.screen_learn_home;
        this.N = true;
        this.O = s.t(this, b.f);
        this.P = new SmallCardDelegate(null);
        this.Q = new BigTileDelegate();
        SmallCardDelegate.INSTANCE.getClass();
        this.R = new SmallCardDelegate(SmallCardDelegate.f53351j);
        this.S = new TextDelegate();
        this.T = new FullScreenStateDelegate();
        final int i = 0;
        this.U = w.y0(new Function0(this) { // from class: n09.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LearnHomeScreen f210922b;

            {
                this.f210922b = this;
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LearnHomeScreen learnHomeScreen = this.f210922b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = LearnHomeScreen.Y;
                        return new z4l.j(7, zhm.u.c(new ContainerDelegate(zhm.v.k(new ListSubheaderDelegate(), new ScrollerDelegate(zhm.v.k(learnHomeScreen.P, new SmallCardLoadingDelegate(null), learnHomeScreen.Q, new BigTileLoadingDelegate()), false), learnHomeScreen.R, learnHomeScreen.S, new ListSubheaderLoadingDelegate(), new BigTileLoadingDelegate(), new SmallCardLoadingDelegate(null), learnHomeScreen.T), new oc(29), 4)), false);
                    default:
                        KProperty[] kPropertyArr2 = LearnHomeScreen.Y;
                        return (w) ((f09.d) learnHomeScreen.V.getValue()).d.get();
                }
            }
        });
        this.V = w.y0(new e(this, inputData, 2));
        final int i2 = 1;
        this.W = w.y0(new Function0(this) { // from class: n09.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LearnHomeScreen f210922b;

            {
                this.f210922b = this;
            }

            /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LearnHomeScreen learnHomeScreen = this.f210922b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = LearnHomeScreen.Y;
                        return new z4l.j(7, zhm.u.c(new ContainerDelegate(zhm.v.k(new ListSubheaderDelegate(), new ScrollerDelegate(zhm.v.k(learnHomeScreen.P, new SmallCardLoadingDelegate(null), learnHomeScreen.Q, new BigTileLoadingDelegate()), false), learnHomeScreen.R, learnHomeScreen.S, new ListSubheaderLoadingDelegate(), new BigTileLoadingDelegate(), new SmallCardLoadingDelegate(null), learnHomeScreen.T), new oc(29), 4)), false);
                    default:
                        KProperty[] kPropertyArr2 = LearnHomeScreen.Y;
                        return (w) ((f09.d) learnHomeScreen.V.getValue()).d.get();
                }
            }
        });
        this.X = new j(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        c0 uiState = (c0) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        z4l.j jVar = (z4l.j) this.U.getValue();
        ArrayList arrayList = uiState.f210930b;
        int i = uiState.e;
        jVar.c(arrayList);
        Z2().f110332c.setItems(uiState.f210931c, uiState.d);
        Tabs learnHomeTabs = Z2().f110332c;
        Intrinsics.checkNotNullExpressionValue(learnHomeTabs, "learnHomeTabs");
        boolean z = uiState.f;
        learnHomeTabs.setVisibility(z ? 0 : 8);
        Z2().d.setUserInputEnabled(z);
        Z2().f110331b.setMenuItems(uiState.f210929a);
        if (oVar == null || !(oVar instanceof b0)) {
            Tabs learnHomeTabs2 = Z2().f110332c;
            Intrinsics.checkNotNullExpressionValue(learnHomeTabs2, "learnHomeTabs");
            Tabs.u(learnHomeTabs2, uiState.d, false, false, false, 14);
            Z2().d.setCurrentItem(i);
            return;
        }
        b0 b0Var = (b0) oVar;
        if (b0Var.f210927b) {
            Z2().d.setCurrentItem(i);
        }
        if (b0Var.f210926a) {
            Tabs learnHomeTabs3 = Z2().f110332c;
            Intrinsics.checkNotNullExpressionValue(learnHomeTabs3, "learnHomeTabs");
            Tabs.u(learnHomeTabs3, uiState.d, false, false, false, 14);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getV() {
        f fVar = (f) ((d) this.V.getValue()).f131056b.f131058a.f220914j.get();
        s.j(fVar);
        return ((g) fVar).d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (d) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, rd0.e.b(Z2().f110331b.f59410q), null, new c(this, null, 7), 3);
        int i = 4;
        int i2 = 2;
        a.g2(this, new mmh.e(rd0.e.b(Z2().f110331b.o.f57403b), 13), null, new n(i2, T2(), n09.w.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/home/LearnHomeScreenContract$Event;)V", i, 20), 3);
        a.g2(this, new mmh.e(rd0.e.b(Z2().f110332c.f58882b), 14), null, new n(i2, T2(), n09.w.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/home/LearnHomeScreenContract$Event;)V", i, 21), 3);
        a.g2(this, new an9.g(vkm.q.J(rd0.e.b(this.P.d), rd0.e.b(this.R.d)), 18), null, new n(i2, T2(), n09.w.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/home/LearnHomeScreenContract$Event;)V", i, 16), 3);
        a.g2(this, new mmh.e(rd0.e.b(this.Q.d), 15), null, new n(i2, T2(), n09.w.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/home/LearnHomeScreenContract$Event;)V", i, 17), 3);
        a.g2(this, new mmh.e(rd0.e.b(this.T.f52371h.f121375b), 16), null, new n(i2, T2(), n09.w.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/home/LearnHomeScreenContract$Event;)V", i, 18), 3);
        a.g2(this, new r6(new mmh.e(rd0.e.b(this.S.d), 12), 27), null, new n(i2, T2(), n09.w.class, "onEvent", "onEvent(Lcom/revolut/feature/learn/shared/impl/ui/home/LearnHomeScreenContract$Event;)V", i, 19), 3);
        Z2().d.registerOnPageChangeCallback(this.X);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = Z2().f110331b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.investmentlearn_home_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.investmentlearn_home_header_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        Z2().d.setAdapter((z4l.j) this.U.getValue());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void Y2() {
        Z2().d.unregisterOnPageChangeCallback(this.X);
    }

    public final d09.b Z2() {
        ViewBinding value = this.O.getValue(this, Y[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d09.b) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: a3, reason: merged with bridge method [inline-methods] */
    public final n09.w T2() {
        return (n09.w) this.W.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.M;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.N);
    }
}
