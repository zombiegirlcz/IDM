package com.revolut.feature.freelancer.impl.ui.referral_info;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SimpleMediaDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$id;
import com.revolut.feature.freelancer.impl.R$layout;
import com.revolut.feature.freelancer.impl.ui.referral_info.FreelancerReferralInfoScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import j17.f;
import j17.g;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import rs6.c;
import sji.b;
import te0.w;
import tx0.j0;
import tx0.t3;
import us6.q0;
import us6.u0;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/referral_info/FreelancerReferralInfoScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lj17/f;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Laii/q;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerReferralInfoScreen extends BaseRecyclerViewScreen<f, IOData$EmptyInput, q> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f74111d0 = {o0.f186429a.j(new h0(FreelancerReferralInfoScreen.class, "binding", "getBinding()Lcom/revolut/feature/freelancer/impl/databinding/ScreenFreelancerReferralInfoBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final boolean X;
    public final FullScreenStateDelegate Y;
    public final ErrorDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f74112a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f74113b0;
    public final Object c0;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/freelancer/impl/databinding/ScreenFreelancerReferralInfoBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            int i = R$id.screenFreelancerReferralInfo_goToButton;
            LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
            if (largeActionButton != null) {
                i = R$id.screenFreelancerReferralInfo_navBarWithToolbar;
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
                if (navBarWithToolbar != null) {
                    i = R$id.screenFreelancerReferralInfo_recyclerView;
                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                        return new c((ControllerContainerFrameLayout) p0, largeActionButton, navBarWithToolbar);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
        }
    }

    public FreelancerReferralInfoScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = R$layout.screen_freelancer_referral_info;
        this.V = R$id.screenFreelancerReferralInfo_recyclerView;
        this.W = s.t(this, a.f);
        this.X = true;
        this.Y = new FullScreenStateDelegate();
        this.Z = new ErrorDelegate();
        final int i = 0;
        this.f74112a0 = w.y0(new Function0(this) { // from class: j17.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerReferralInfoScreen f170126b;

            {
                this.f170126b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FreelancerReferralInfoScreen freelancerReferralInfoScreen = this.f170126b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerReferralInfoScreen.f74111d0;
                        return v.k(new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), new SimpleMediaDelegate(), new RowLoadingDelegate(), new RowDelegate(null, null, 7), new CellDetailsLoadingDelegate(), freelancerReferralInfoScreen.Y, freelancerReferralInfoScreen.Z);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerReferralInfoScreen.f74111d0;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerReferralInfoScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        u0 u0Var = new u0();
                        u0Var.f282763a = e4m.b.b(new q0(qVar, u0Var, 1, 2));
                        u0Var.f282764b = e4m.b.b(new q0(qVar, u0Var, 0, 2));
                        return u0Var;
                    default:
                        KProperty[] kPropertyArr3 = FreelancerReferralInfoScreen.f74111d0;
                        return (g) ((u0) freelancerReferralInfoScreen.f74113b0.getValue()).f282764b.get();
                }
            }
        });
        final int i2 = 1;
        this.f74113b0 = w.y0(new Function0(this) { // from class: j17.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerReferralInfoScreen f170126b;

            {
                this.f170126b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FreelancerReferralInfoScreen freelancerReferralInfoScreen = this.f170126b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerReferralInfoScreen.f74111d0;
                        return v.k(new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), new SimpleMediaDelegate(), new RowLoadingDelegate(), new RowDelegate(null, null, 7), new CellDetailsLoadingDelegate(), freelancerReferralInfoScreen.Y, freelancerReferralInfoScreen.Z);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerReferralInfoScreen.f74111d0;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerReferralInfoScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        u0 u0Var = new u0();
                        u0Var.f282763a = e4m.b.b(new q0(qVar, u0Var, 1, 2));
                        u0Var.f282764b = e4m.b.b(new q0(qVar, u0Var, 0, 2));
                        return u0Var;
                    default:
                        KProperty[] kPropertyArr3 = FreelancerReferralInfoScreen.f74111d0;
                        return (g) ((u0) freelancerReferralInfoScreen.f74113b0.getValue()).f282764b.get();
                }
            }
        });
        final int i3 = 2;
        this.c0 = w.y0(new Function0(this) { // from class: j17.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerReferralInfoScreen f170126b;

            {
                this.f170126b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                FreelancerReferralInfoScreen freelancerReferralInfoScreen = this.f170126b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerReferralInfoScreen.f74111d0;
                        return v.k(new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), new SimpleMediaDelegate(), new RowLoadingDelegate(), new RowDelegate(null, null, 7), new CellDetailsLoadingDelegate(), freelancerReferralInfoScreen.Y, freelancerReferralInfoScreen.Z);
                    case 1:
                        KProperty[] kPropertyArr2 = FreelancerReferralInfoScreen.f74111d0;
                        phm.a aVar = (phm.a) ue0.e.j(freelancerReferralInfoScreen.m2()).a().get(us6.q.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", us6.q.class, " is not found"));
                        }
                        us6.q qVar = ((us6.q) aVar2.b()).Q;
                        u0 u0Var = new u0();
                        u0Var.f282763a = e4m.b.b(new q0(qVar, u0Var, 1, 2));
                        u0Var.f282764b = e4m.b.b(new q0(qVar, u0Var, 0, 2));
                        return u0Var;
                    default:
                        KProperty[] kPropertyArr3 = FreelancerReferralInfoScreen.f74111d0;
                        return (g) ((u0) freelancerReferralInfoScreen.f74113b0.getValue()).f282764b.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (u0) this.f74113b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f257025c.f59410q), null, new j17.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f257024b.o), null, new j17.b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, vkm.q.J(e.b(this.Y.f52371h.f121375b), e.b(this.Z.f52226c)), null, new j17.b(this, null, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f257025c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getZ() {
        return (List) this.f74112a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(f uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = h3().f257025c;
        j17.e eVar = uiState.f170132a;
        j17.c cVar = uiState.f170134c;
        navBarWithToolbar.setTitle(eVar.f170130a, null);
        navBarWithToolbar.setToolbarTitle(eVar.f170130a);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        if (eVar.f170131b) {
            navBarWithToolbar.I0(t3.TWO_LINES, false);
        } else {
            navBarWithToolbar.l0();
        }
        LargeActionButton largeActionButton = h3().f257024b;
        largeActionButton.setText(cVar.f170127a);
        largeActionButton.setVisibility(cVar.f170128b ? 0 : 8);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    public final c h3() {
        ViewBinding value = this.W.getValue(this, f74111d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
