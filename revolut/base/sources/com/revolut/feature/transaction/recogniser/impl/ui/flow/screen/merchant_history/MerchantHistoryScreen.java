package com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.merchant_history;

import ack.f;
import aff.b;
import aff.c;
import aff.h;
import aff.i;
import aff.n;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ce9.r;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transaction.recogniser.impl.R$string;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.merchant_history.MerchantHistoryScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jef.d;
import jii.x;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00052\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/screen/merchant_history/MerchantHistoryScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Laff/i;", "Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/screen/merchant_history/MerchantHistoryScreenContract$InputData;", "Laff/h;", "Companion", "a", "feature_transaction_recogniser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MerchantHistoryScreen extends BaseRecyclerViewScreen<i, MerchantHistoryScreenContract$InputData, h> {
    public final ao.h U;
    public final r V;
    public final FullScreenStateDelegate W;
    public final boolean X;
    public final int Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f91835a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f91836b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f91834d0 = {o0.f186429a.j(new h0(MerchantHistoryScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MerchantHistoryScreen(MerchantHistoryScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, b.f);
        this.V = new r(new f(this, 9));
        this.W = new FullScreenStateDelegate();
        this.X = true;
        this.Y = R$layout.screen_recycler_navbar_two_buttons;
        this.Z = R$id.screenRecyclerNavbarTwoButtons_recyclerView;
        final int i = 0;
        this.f91835a0 = w.y0(new Function0(this) { // from class: aff.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MerchantHistoryScreen f4035b;

            {
                this.f4035b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                MerchantHistoryScreen merchantHistoryScreen = this.f4035b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = MerchantHistoryScreen.f91834d0;
                        return v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), merchantHistoryScreen.W, new ListSubheaderDelegate());
                    default:
                        KProperty[] kPropertyArr2 = MerchantHistoryScreen.f91834d0;
                        return (n) ((jef.d) merchantHistoryScreen.f91836b0.getValue()).f173371c.get();
                }
            }
        });
        this.f91836b0 = w.y0(new a07.b(this, inputData, 27));
        final int i2 = 1;
        this.c0 = w.y0(new Function0(this) { // from class: aff.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MerchantHistoryScreen f4035b;

            {
                this.f4035b = this;
            }

            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                MerchantHistoryScreen merchantHistoryScreen = this.f4035b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = MerchantHistoryScreen.f91834d0;
                        return v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate(), merchantHistoryScreen.W, new ListSubheaderDelegate());
                    default:
                        KProperty[] kPropertyArr2 = MerchantHistoryScreen.f91834d0;
                        return (n) ((jef.d) merchantHistoryScreen.f91836b0.getValue()).f173371c.get();
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
        boolean z = uiState.f4040a;
        screenRecyclerNavbarTwoButtonsFirstButton.setEnabled(z);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = g3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.setEnabled(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (d) this.f91836b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (n) this.c0.getValue();
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
        com.revolut.kompot.navigable.a.g2(this, e.b(this.W.f52371h.f121375b), null, new aff.d(this, null), 3);
        h().addOnScrollListener(this.V);
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
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transaction_recogniser_merchant_history_screen_title, null, null, 14), null);
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.transaction_recogniser_merchant_history_screen_title, null, null, 14));
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.transaction_recogniser_merchant_history_screen_subtitle, null, null, 14));
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = g3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        screenRecyclerNavbarTwoButtonsFirstButton.setText(new TextLocalisedClause(R$string.transaction_recogniser_action_recognise, null, null, 14));
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton2 = g3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton2, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton2.setText(new TextLocalisedClause(R$string.transaction_recogniser_action_dont_recognise, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(jki.n nVar, o oVar) {
        i uiState = (i) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = g3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        boolean z = uiState.f4040a;
        screenRecyclerNavbarTwoButtonsFirstButton.setEnabled(z);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = g3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.setEnabled(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF0() {
        return (List) this.f91835a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.Z;
    }

    public final x g3() {
        ViewBinding value = this.U.getValue(this, f91834d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (x) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
