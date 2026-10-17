package com.revolut.feature.freelancer.impl.ui.profile.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.profile.details.FreelancerProfileScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import dze.n;
import e07.c;
import e07.d;
import e07.f;
import e07.g;
import e07.h;
import java.util.List;
import jii.m;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.q;
import kotlin.reflect.KProperty;
import rd0.e;
import sji.b;
import te0.w;
import us6.p0;
import us6.q0;
import us6.r0;
import vc.s;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/details/FreelancerProfileScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Le07/h;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Le07/f;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerProfileScreen extends BaseRecyclerViewScreen<h, IOData$EmptyInput, f> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f74039d0 = {o0.f186429a.j(new h0(FreelancerProfileScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final ao.h U;
    public final int V;
    public final FullScreenStateDelegate W;
    public final RowDelegate X;
    public final TwinHorizontalButtonDelegate Y;
    public final boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f74040a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f74041b0;
    public final List c0;

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

    public FreelancerProfileScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = s.t(this, a.f);
        this.V = R$layout.screen_recycler_navbar;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.W = fullScreenStateDelegate;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.X = rowDelegate;
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = new TwinHorizontalButtonDelegate();
        this.Y = twinHorizontalButtonDelegate;
        final int i = 1;
        this.Z = true;
        final int i2 = 0;
        this.f74040a0 = w.y0(new Function0(this) { // from class: e07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerProfileScreen f121438b;

            {
                this.f121438b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                FreelancerProfileScreen freelancerProfileScreen = this.f121438b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerProfileScreen.f74039d0;
                        qji.b bVarQ2 = freelancerProfileScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.details.di.FreelancerProfileScreenInjector");
                        us6.q qVar = ((p0) bVarQ2).f282658b;
                        r0 r0Var = new r0();
                        r0Var.f282729a = e4m.b.b(e4m.c.a(freelancerProfileScreen));
                        int i5 = 0;
                        r0Var.f282730b = e4m.b.b(new q0(qVar, r0Var, 2, i5));
                        r0Var.f282731c = e4m.b.b(new q0(qVar, r0Var, 1, i5));
                        r0Var.d = e4m.b.b(new q0(qVar, r0Var, i5, i5));
                        r0Var.e = e4m.b.b(new q0(qVar, r0Var, 4, i5));
                        r0Var.f = e4m.b.b(new q0(qVar, r0Var, 3, i5));
                        r0Var.f282732g = e4m.b.b(new q0(qVar, r0Var, 6, i5));
                        r0Var.f282733h = e4m.b.b(new q0(qVar, r0Var, 5, i5));
                        return r0Var;
                    default:
                        KProperty[] kPropertyArr2 = FreelancerProfileScreen.f74039d0;
                        return (g) ((r0) freelancerProfileScreen.f74040a0.getValue()).f282733h.get();
                }
            }
        });
        this.f74041b0 = w.y0(new Function0(this) { // from class: e07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerProfileScreen f121438b;

            {
                this.f121438b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                FreelancerProfileScreen freelancerProfileScreen = this.f121438b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerProfileScreen.f74039d0;
                        qji.b bVarQ2 = freelancerProfileScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.details.di.FreelancerProfileScreenInjector");
                        us6.q qVar = ((p0) bVarQ2).f282658b;
                        r0 r0Var = new r0();
                        r0Var.f282729a = e4m.b.b(e4m.c.a(freelancerProfileScreen));
                        int i5 = 0;
                        r0Var.f282730b = e4m.b.b(new q0(qVar, r0Var, 2, i5));
                        r0Var.f282731c = e4m.b.b(new q0(qVar, r0Var, 1, i5));
                        r0Var.d = e4m.b.b(new q0(qVar, r0Var, i5, i5));
                        r0Var.e = e4m.b.b(new q0(qVar, r0Var, 4, i5));
                        r0Var.f = e4m.b.b(new q0(qVar, r0Var, 3, i5));
                        r0Var.f282732g = e4m.b.b(new q0(qVar, r0Var, 6, i5));
                        r0Var.f282733h = e4m.b.b(new q0(qVar, r0Var, 5, i5));
                        return r0Var;
                    default:
                        KProperty[] kPropertyArr2 = FreelancerProfileScreen.f74039d0;
                        return (g) ((r0) freelancerProfileScreen.f74040a0.getValue()).f282733h.get();
                }
            }
        });
        this.c0 = v.k(rowDelegate, fullScreenStateDelegate, new RowLoadingDelegate(), twinHorizontalButtonDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (r0) this.f74040a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.U.getValue(this, f74039d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(((m) value).f174539b.f59410q), null, new n(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.X.f53218h), null, new e07.b(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.W.f52371h.f121375b), null, new c(this, null), 3);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.Y;
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.f53572c.f121375b), null, new d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(twinHorizontalButtonDelegate.d.f121375b), null, new d(this, continuation, 1), 3);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ((j60.a) ((r0) this.f74040a0.getValue()).f282731c.get()).d(u.c(this.Y));
        ViewBinding value = this.U.getValue(this, f74039d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.freelancer_common_action_profile, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.freelancer_common_action_profile, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF72097a0() {
        return this.c0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final g T2() {
        return (g) this.f74041b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Z);
    }
}
