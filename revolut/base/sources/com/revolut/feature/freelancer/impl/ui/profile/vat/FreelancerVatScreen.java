package com.revolut.feature.freelancer.impl.ui.profile.vat;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.profile.vat.FreelancerVatScreen;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.u;
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
import us6.t1;
import us6.u1;
import vc.s;
import xv4.o;
import y07.c;
import y07.d;
import y07.f;
import y07.h;
import y07.i;
import y07.j;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/vat/FreelancerVatScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ly07/j;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Ly07/h;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerVatScreen extends BaseRecyclerViewScreen<j, IOData$EmptyInput, h> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f74071e0 = {o0.f186429a.j(new h0(FreelancerVatScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final ao.h U;
    public final InputTextDelegate V;
    public final FullScreenStateDelegate W;
    public final InputChecklistDelegate X;
    public final LargeActionButtonDelegate Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f74072a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f74073b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f74074d0;

    public static final /* synthetic */ class a extends q implements Function1 {
        public static final a f = new a();

        public a() {
            super(1, u.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj2) {
            View p0 = (View) obj2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return u.a(p0);
        }
    }

    public FreelancerVatScreen() {
        super(IOData$EmptyInput.f98299a);
        this.U = s.t(this, a.f);
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.V = inputTextDelegate;
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.W = fullScreenStateDelegate;
        InputChecklistDelegate inputChecklistDelegate = new InputChecklistDelegate();
        this.X = inputChecklistDelegate;
        this.Y = new LargeActionButtonDelegate();
        this.Z = R$layout.screen_recycler_navbar_nextbutton;
        final int i = 1;
        this.f74072a0 = true;
        final int i2 = 0;
        this.f74073b0 = w.y0(new Function0(this) { // from class: y07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerVatScreen f310155b;

            {
                this.f310155b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                FreelancerVatScreen freelancerVatScreen = this.f310155b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerVatScreen.f74071e0;
                        qji.b bVarQ2 = freelancerVatScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.vat.di.FreelancerVatScreenInjector");
                        return (u1) ((t1) ((z07.a) bVarQ2).b().S(freelancerVatScreen)).mo3800build();
                    default:
                        KProperty[] kPropertyArr2 = FreelancerVatScreen.f74071e0;
                        u1 u1Var = (u1) freelancerVatScreen.f74073b0.getValue();
                        switch (u1Var.f282765a) {
                            case 0:
                                return (i) u1Var.f282768g.get();
                            case 1:
                                return (i) u1Var.f282768g.get();
                            default:
                                return (i) u1Var.f282768g.get();
                        }
                }
            }
        });
        this.c0 = w.y0(new Function0(this) { // from class: y07.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FreelancerVatScreen f310155b;

            {
                this.f310155b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                FreelancerVatScreen freelancerVatScreen = this.f310155b;
                switch (i3) {
                    case 0:
                        KProperty[] kPropertyArr = FreelancerVatScreen.f74071e0;
                        qji.b bVarQ2 = freelancerVatScreen.Q2();
                        Intrinsics.i(bVarQ2, "null cannot be cast to non-null type com.revolut.feature.freelancer.impl.ui.profile.vat.di.FreelancerVatScreenInjector");
                        return (u1) ((t1) ((z07.a) bVarQ2).b().S(freelancerVatScreen)).mo3800build();
                    default:
                        KProperty[] kPropertyArr2 = FreelancerVatScreen.f74071e0;
                        u1 u1Var = (u1) freelancerVatScreen.f74073b0.getValue();
                        switch (u1Var.f282765a) {
                            case 0:
                                return (i) u1Var.f282768g.get();
                            case 1:
                                return (i) u1Var.f282768g.get();
                            default:
                                return (i) u1Var.f282768g.get();
                        }
                }
            }
        });
        this.f74074d0 = v.k(inputTextDelegate, fullScreenStateDelegate, inputChecklistDelegate, new RowLoadingDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (u1) this.f74073b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174565c.f59410q), null, new y07.b(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174565c.o.f57403b), null, new o(this, continuation, 12), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.V.e.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(h3().f174564b.o), null, new y07.b(this, continuation, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.W.f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.X.f52518c), null, new y07.e(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Y.d.f121375b), null, new f(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        j60.a aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.freelancer_vat_merchant_header_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.freelancer_vat_merchant_header_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        h3().f174564b.setText(new TextLocalisedClause(R$string.freelancer_common_action_save, null, null, 14));
        u1 u1Var = (u1) this.f74073b0.getValue();
        switch (u1Var.f282765a) {
            case 0:
                aVar = (j60.a) u1Var.d.get();
                break;
            case 1:
                aVar = (j60.a) u1Var.d.get();
                break;
            default:
                aVar = (j60.a) u1Var.d.get();
                break;
        }
        aVar.d(zhm.u.c(this.Y));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF74074d0() {
        return this.f74074d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(j uiState, jki.o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().f174564b.setEnabled(uiState.f310161b);
        NavBarWithToolbar navBarWithToolbar = h3().f174565c;
        navBarWithToolbar.setSecondDescriptionText(uiState.f310162c);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        navBarWithToolbar.setMenuItems(uiState.d);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.Z;
    }

    public final u h3() {
        ViewBinding value = this.U.getValue(this, f74071e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final i T2() {
        return (i) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f74072a0);
    }
}
