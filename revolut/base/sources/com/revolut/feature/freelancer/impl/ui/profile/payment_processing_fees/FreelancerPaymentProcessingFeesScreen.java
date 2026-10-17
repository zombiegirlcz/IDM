package com.revolut.feature.freelancer.impl.ui.profile.payment_processing_fees;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.u;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import o07.c;
import o07.d;
import o07.e;
import o07.f;
import o07.g;
import sji.b;
import te0.w;
import us6.s1;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/profile/payment_processing_fees/FreelancerPaymentProcessingFeesScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lo07/c;", "Lcom/revolut/feature/freelancer/impl/ui/profile/payment_processing_fees/FreelancerPaymentProcessingFeesContract$InputData;", "Laii/q;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FreelancerPaymentProcessingFeesScreen extends BaseRecyclerViewScreen<c, FreelancerPaymentProcessingFeesContract$InputData, q> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f74054b0 = {o0.f186429a.j(new h0(FreelancerPaymentProcessingFeesScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int U;
    public final boolean V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final FullScreenStateDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final List f74055a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreelancerPaymentProcessingFeesScreen(FreelancerPaymentProcessingFeesContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = true;
        this.W = s.t(this, e.f);
        this.X = w.y0(new nsh.e(this, inputData, 12));
        this.Y = w.y0(new nmm.h(this, 27));
        FullScreenStateDelegate fullScreenStateDelegate = new FullScreenStateDelegate();
        this.Z = fullScreenStateDelegate;
        this.f74055a0 = v.k(new ListSubheaderLoadingDelegate(), new ListSubheaderDelegate(), new CellDetailsLoadingDelegate(), new CellDetailsDelegate(), new TextDelegate(), fullScreenStateDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (s1) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (d) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, rd0.e.b(h3().f174565c.f59410q), null, new f(this, null, 0), 3);
        a.g2(this, rd0.e.b(h3().f174564b.o), null, new f(this, null, 1), 3);
        a.g2(this, rd0.e.b(this.Z.f52371h.f121375b), null, new g(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f174565c.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        LargeActionButton goToButton = h3().f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(8);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF74055a0() {
        return this.f74055a0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(c uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        u uVarH3 = h3();
        super.Z2(uiState, oVar);
        NavBarWithToolbar navBarWithToolbar = uVarH3.f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setTitle(uiState.f221161a, null);
        LargeActionButton goToButton = uVarH3.f174564b;
        o07.a aVar = uiState.f221163c;
        goToButton.setText(aVar.f221157a);
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setVisibility(aVar.f221158b ? 0 : 8);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.U;
    }

    public final u h3() {
        ViewBinding value = this.W.getValue(this, f74054b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
