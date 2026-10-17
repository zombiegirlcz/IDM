package com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.before_after;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transaction.recogniser.impl.R$string;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.before_after.BeforeAfterScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jii.x;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import tx0.j0;
import u1.g;
import uef.b;
import uef.c;
import uef.d;
import uef.h;
import uef.i;
import uef.l;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/screen/before_after/BeforeAfterScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Luef/i;", "Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/screen/before_after/BeforeAfterScreenContract$InputData;", "Luef/h;", "feature_transaction_recogniser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BeforeAfterScreen extends BaseRecyclerViewScreen<i, BeforeAfterScreenContract$InputData, h> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(BeforeAfterScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final ao.h U;
    public final FullScreenStateDelegate V;
    public final boolean W;
    public final int X;
    public final int Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f91824a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f91825b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeforeAfterScreen(BeforeAfterScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, b.f);
        this.V = new FullScreenStateDelegate();
        this.W = true;
        this.X = R$layout.screen_recycler_navbar_two_buttons;
        this.Y = R$id.screenRecyclerNavbarTwoButtons_recyclerView;
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: uef.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BeforeAfterScreen f279351b;

            {
                this.f279351b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                BeforeAfterScreen beforeAfterScreen = this.f279351b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = BeforeAfterScreen.c0;
                        return v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), beforeAfterScreen.V);
                    default:
                        KProperty[] kPropertyArr2 = BeforeAfterScreen.c0;
                        return (l) ((jef.b) beforeAfterScreen.f91824a0.getValue()).f173365c.get();
                }
            }
        });
        this.f91824a0 = w.y0(new g(this, inputData, 26));
        final int i2 = 1;
        this.f91825b0 = w.y0(new Function0(this) { // from class: uef.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BeforeAfterScreen f279351b;

            {
                this.f279351b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                BeforeAfterScreen beforeAfterScreen = this.f279351b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = BeforeAfterScreen.c0;
                        return v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), beforeAfterScreen.V);
                    default:
                        KProperty[] kPropertyArr2 = BeforeAfterScreen.c0;
                        return (l) ((jef.b) beforeAfterScreen.f91824a0.getValue()).f173365c.get();
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        i uiState = (i) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = g3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        boolean z = uiState.f279356a;
        screenRecyclerNavbarTwoButtonsFirstButton.setEnabled(z);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = g3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.setEnabled(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (jef.b) this.f91824a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (l) this.f91825b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        NavBarWithToolbar screenRecyclerNavbarTwoButtonsNavBarWithToolbar = g3().f174574c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsNavBarWithToolbar, "screenRecyclerNavbarTwoButtonsNavBarWithToolbar");
        Continuation continuation = null;
        a.g2(this, e.b(screenRecyclerNavbarTwoButtonsNavBarWithToolbar.f59410q), null, new c(this, continuation, 0), 3);
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = g3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        a.g2(this, e.b(screenRecyclerNavbarTwoButtonsFirstButton.o), null, new c(this, continuation, 1), 3);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = g3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        a.g2(this, e.b(screenRecyclerNavbarTwoButtonsSecondButton.o), null, new c(this, continuation, 2), 3);
        a.g2(this, e.b(this.V.f52371h.f121375b), null, new d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar screenRecyclerNavbarTwoButtonsNavBarWithToolbar = g3().f174574c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsNavBarWithToolbar, "screenRecyclerNavbarTwoButtonsNavBarWithToolbar");
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setDescriptionVisible(true);
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = g3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.o(LargeActionButton.ButtonStyle.f58726b);
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transaction_recogniser_before_after_screen_title, null, null, 14), null);
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.transaction_recogniser_before_after_screen_title, null, null, 14));
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.transaction_recogniser_before_after_screen_subtitle, null, null, 14));
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = g3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        screenRecyclerNavbarTwoButtonsFirstButton.setText(new TextLocalisedClause(R$string.transaction_recogniser_action_recognise, null, null, 14));
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton2 = g3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton2, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton2.setText(new TextLocalisedClause(R$string.transaction_recogniser_action_dont_recognise, null, null, 14));
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        i uiState = (i) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = g3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        boolean z = uiState.f279356a;
        screenRecyclerNavbarTwoButtonsFirstButton.setEnabled(z);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = g3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.setEnabled(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF75582b0() {
        return (List) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.Y;
    }

    public final x g3() {
        ViewBinding value = this.U.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
