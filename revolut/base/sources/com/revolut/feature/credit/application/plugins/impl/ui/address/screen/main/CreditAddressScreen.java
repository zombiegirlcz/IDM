package com.revolut.feature.credit.application.plugins.impl.ui.address.screen.main;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginRecyclerViewScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import dw3.u0;
import java.util.List;
import jii.x;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ljd.e;
import ltf.b;
import m44.a;
import m44.c;
import m44.d;
import m44.j;
import m44.m;
import m44.n;
import m44.u;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/address/screen/main/CreditAddressScreen;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginRecyclerViewScreen;", "Lm44/n;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/address/screen/main/CreditAddressScreenContract$InputData;", "Lm44/m;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditAddressScreen extends PluginRecyclerViewScreen<n, CreditAddressScreenContract$InputData, m> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(CreditAddressScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final int V;
    public final Object W;
    public final Object X;
    public final h Y;
    public final InputTextDelegate Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final InputChecklistDelegate f66955a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f66956b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditAddressScreen(CreditAddressScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.V = R$layout.screen_recycler_navbar_two_buttons;
        this.W = w.y0(new b(this, inputData, 14));
        this.X = w.y0(new e(this, 25));
        this.Y = s.t(this, a.f);
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.Z = inputTextDelegate;
        InputChecklistDelegate inputChecklistDelegate = new InputChecklistDelegate();
        this.f66955a0 = inputChecklistDelegate;
        this.f66956b0 = v.k(inputTextDelegate, inputChecklistDelegate);
    }

    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        T2().v2(j.f202655a);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (u0) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        NavBarWithToolbar screenRecyclerNavbarTwoButtonsNavBarWithToolbar = h3().f174574c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsNavBarWithToolbar, "screenRecyclerNavbarTwoButtonsNavBarWithToolbar");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(screenRecyclerNavbarTwoButtonsNavBarWithToolbar.f59410q), null, new m44.b(this, continuation, 0), 3);
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = h3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(screenRecyclerNavbarTwoButtonsFirstButton.o), null, new m44.b(this, continuation, 1), 3);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = h3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(screenRecyclerNavbarTwoButtonsSecondButton.o), null, new m44.b(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Z.f52575g.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f66955a0.f52518c), null, new d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar screenRecyclerNavbarTwoButtonsNavBarWithToolbar = h3().f174574c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsNavBarWithToolbar, "screenRecyclerNavbarTwoButtonsNavBarWithToolbar");
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setSecondDescriptionVisible(true);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = h3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.o(LargeActionButton.ButtonStyle.o);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF66956b0() {
        return this.f66956b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3 */
    public final int getV() {
        return R$id.screenRecyclerNavbarTwoButtons_recyclerView;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(n uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = h3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        boolean z = uiState.f;
        m44.h hVar = uiState.f202659b;
        screenRecyclerNavbarTwoButtonsSecondButton.setVisibility(z ? 0 : 8);
        super.Z2(uiState, oVar);
        NavBarWithToolbar screenRecyclerNavbarTwoButtonsNavBarWithToolbar = h3().f174574c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsNavBarWithToolbar, "screenRecyclerNavbarTwoButtonsNavBarWithToolbar");
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setToolbarTitle(hVar.f202651a);
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setTitle(hVar.f202651a, null);
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setSecondDescriptionText(hVar.f202652b);
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(hVar.f202653c));
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = h3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        screenRecyclerNavbarTwoButtonsFirstButton.setText(uiState.f202660c);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton2 = h3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton2, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton2.setText(uiState.e);
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton2 = h3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton2, "screenRecyclerNavbarTwoButtonsFirstButton");
        screenRecyclerNavbarTwoButtonsFirstButton2.setEnabled(uiState.d);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.V;
    }

    public final x h3() {
        ViewBinding value = this.Y.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    public final u T2() {
        return (u) this.X.getValue();
    }
}
