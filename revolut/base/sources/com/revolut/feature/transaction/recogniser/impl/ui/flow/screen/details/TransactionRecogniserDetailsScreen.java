package com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.MapDelegate;
import com.revolut.core.ui_kit.delegates.MapLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transaction.recogniser.impl.R$string;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.details.TransactionRecogniserDetailsScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jef.f;
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
import vc.s;
import w83.a;
import wef.b;
import wef.c;
import wef.d;
import wef.h;
import wef.i;
import wef.l;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/screen/details/TransactionRecogniserDetailsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lwef/i;", "Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/screen/details/TransactionRecogniserDetailsScreenContract$InputData;", "Lwef/h;", "feature_transaction_recogniser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionRecogniserDetailsScreen extends BaseRecyclerViewScreen<i, TransactionRecogniserDetailsScreenContract$InputData, h> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f91827d0 = {o0.f186429a.j(new h0(TransactionRecogniserDetailsScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final ao.h U;
    public final MapDelegate V;
    public final FullScreenStateDelegate W;
    public final boolean X;
    public final int Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f91828a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f91829b0;
    public final Object c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionRecogniserDetailsScreen(TransactionRecogniserDetailsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, b.f);
        this.V = new MapDelegate();
        this.W = new FullScreenStateDelegate();
        this.X = true;
        this.Y = R$layout.screen_recycler_navbar_two_buttons;
        this.Z = R$id.screenRecyclerNavbarTwoButtons_recyclerView;
        final int i = 0;
        this.f91828a0 = w.y0(new Function0(this) { // from class: wef.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionRecogniserDetailsScreen f296767b;

            {
                this.f296767b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                TransactionRecogniserDetailsScreen transactionRecogniserDetailsScreen = this.f296767b;
                switch (i2) {
                    case 0:
                        return v.k(transactionRecogniserDetailsScreen.V, new MapLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), transactionRecogniserDetailsScreen.W);
                    default:
                        KProperty[] kPropertyArr = TransactionRecogniserDetailsScreen.f91827d0;
                        return (l) ((jef.f) transactionRecogniserDetailsScreen.f91829b0.getValue()).f173378c.get();
                }
            }
        });
        this.f91829b0 = w.y0(new a(this, inputData, 11));
        final int i2 = 1;
        this.c0 = w.y0(new Function0(this) { // from class: wef.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ TransactionRecogniserDetailsScreen f296767b;

            {
                this.f296767b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                TransactionRecogniserDetailsScreen transactionRecogniserDetailsScreen = this.f296767b;
                switch (i22) {
                    case 0:
                        return v.k(transactionRecogniserDetailsScreen.V, new MapLoadingDelegate(), new CellDetailsDelegate(), new CellDetailsLoadingDelegate(), transactionRecogniserDetailsScreen.W);
                    default:
                        KProperty[] kPropertyArr = TransactionRecogniserDetailsScreen.f91827d0;
                        return (l) ((jef.f) transactionRecogniserDetailsScreen.f91829b0.getValue()).f173378c.get();
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
        boolean z = uiState.f296772a;
        screenRecyclerNavbarTwoButtonsFirstButton.setEnabled(z);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = g3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.setEnabled(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (f) this.f91829b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (l) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        NavBarWithToolbar screenRecyclerNavbarTwoButtonsNavBarWithToolbar = g3().f174574c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsNavBarWithToolbar, "screenRecyclerNavbarTwoButtonsNavBarWithToolbar");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(screenRecyclerNavbarTwoButtonsNavBarWithToolbar.f59410q), null, new c(this, continuation, 0), 3);
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = g3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        com.revolut.kompot.navigable.a.g2(this, e.b(screenRecyclerNavbarTwoButtonsFirstButton.o), null, new c(this, continuation, 1), 3);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = g3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        com.revolut.kompot.navigable.a.g2(this, e.b(screenRecyclerNavbarTwoButtonsSecondButton.o), null, new c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.W.f52371h.f121375b), null, new d(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.V.f52762c), null, new c(this, continuation, 3), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar screenRecyclerNavbarTwoButtonsNavBarWithToolbar = g3().f174574c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsNavBarWithToolbar, "screenRecyclerNavbarTwoButtonsNavBarWithToolbar");
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setDescriptionVisible(true);
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = g3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.o(LargeActionButton.ButtonStyle.f58726b);
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transaction_recogniser_transaction_data_screen_title, null, null, 14), null);
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.transaction_recogniser_transaction_data_screen_title, null, null, 14));
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.transaction_recogniser_transaction_data_screen_subtitle, null, null, 14));
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = g3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        screenRecyclerNavbarTwoButtonsFirstButton.setText(new TextLocalisedClause(R$string.transaction_recogniser_action_recognise, null, null, 14));
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton2 = g3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton2, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton2.setText(new TextLocalisedClause(R$string.transaction_recogniser_action_dont_recognise, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        i uiState = (i) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = g3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        boolean z = uiState.f296772a;
        screenRecyclerNavbarTwoButtonsFirstButton.setEnabled(z);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = g3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.setEnabled(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF86294b0() {
        return (List) this.f91828a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.Z;
    }

    public final x g3() {
        ViewBinding value = this.U.getValue(this, f91827d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
