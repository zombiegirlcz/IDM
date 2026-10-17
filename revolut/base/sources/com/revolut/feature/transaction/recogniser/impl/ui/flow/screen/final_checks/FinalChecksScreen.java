package com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.final_checks;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transaction.recogniser.impl.R$string;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.screen.final_checks.FinalChecksScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jef.c;
import jii.x;
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
import y1a.a;
import y83.d;
import yef.b;
import yef.g;
import yef.j;
import yef.k;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/screen/final_checks/FinalChecksScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lyef/k;", "Lcom/revolut/feature/transaction/recogniser/impl/ui/flow/screen/final_checks/FinalChecksScreenContract$InputData;", "Lyef/g;", "feature_transaction_recogniser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FinalChecksScreen extends BaseRecyclerViewScreen<k, FinalChecksScreenContract$InputData, g> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(FinalChecksScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwoButtonsBinding;", 0))};
    public final h U;
    public final RowDelegate V;
    public final boolean W;
    public final int X;
    public final int Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f91831a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f91832b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinalChecksScreen(FinalChecksScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, b.f);
        this.V = new RowDelegate(null, null, 7);
        this.W = true;
        this.X = R$layout.screen_recycler_navbar_two_buttons;
        this.Y = R$id.screenRecyclerNavbarTwoButtons_recyclerView;
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: yef.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FinalChecksScreen f312914b;

            {
                this.f312914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                FinalChecksScreen finalChecksScreen = this.f312914b;
                switch (i2) {
                    case 0:
                        return u.c(finalChecksScreen.V);
                    default:
                        KProperty[] kPropertyArr = FinalChecksScreen.c0;
                        return (j) ((jef.c) finalChecksScreen.f91831a0.getValue()).f173368c.get();
                }
            }
        });
        this.f91831a0 = w.y0(new a(this, inputData, 26));
        final int i2 = 1;
        this.f91832b0 = w.y0(new Function0(this) { // from class: yef.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FinalChecksScreen f312914b;

            {
                this.f312914b = this;
            }

            /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                FinalChecksScreen finalChecksScreen = this.f312914b;
                switch (i22) {
                    case 0:
                        return u.c(finalChecksScreen.V);
                    default:
                        KProperty[] kPropertyArr = FinalChecksScreen.c0;
                        return (j) ((jef.c) finalChecksScreen.f91831a0.getValue()).f173368c.get();
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (c) this.f91831a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (j) this.f91832b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        NavBarWithToolbar screenRecyclerNavbarTwoButtonsNavBarWithToolbar = g3().f174574c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsNavBarWithToolbar, "screenRecyclerNavbarTwoButtonsNavBarWithToolbar");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(screenRecyclerNavbarTwoButtonsNavBarWithToolbar.f59410q), null, new yef.c(this, continuation, 0), 3);
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = g3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        com.revolut.kompot.navigable.a.g2(this, e.b(screenRecyclerNavbarTwoButtonsFirstButton.o), null, new yef.c(this, continuation, 1), 3);
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = g3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        com.revolut.kompot.navigable.a.g2(this, e.b(screenRecyclerNavbarTwoButtonsSecondButton.o), null, new yef.c(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.V.f53226s), null, new d(this, continuation, 19), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar screenRecyclerNavbarTwoButtonsNavBarWithToolbar = g3().f174574c;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsNavBarWithToolbar, "screenRecyclerNavbarTwoButtonsNavBarWithToolbar");
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setDescriptionVisible(true);
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setSecondDescriptionVisible(true);
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton = g3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton.o(LargeActionButton.ButtonStyle.f58726b);
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transaction_recogniser_final_checks_screen_title, null, null, 14), null);
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.transaction_recogniser_final_checks_screen_title, null, null, 14));
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setDescriptionText(new TextLocalisedClause(R$string.transaction_recogniser_final_checks_screen_subtitle_first, null, null, 14));
        screenRecyclerNavbarTwoButtonsNavBarWithToolbar.setSecondDescriptionText(new TextLocalisedClause(R$string.transaction_recogniser_final_checks_screen_subtitle_second, null, null, 14));
        LargeActionButton screenRecyclerNavbarTwoButtonsFirstButton = g3().f174573b;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsFirstButton, "screenRecyclerNavbarTwoButtonsFirstButton");
        screenRecyclerNavbarTwoButtonsFirstButton.setText(new TextLocalisedClause(R$string.transaction_recogniser_action_recognise, null, null, 14));
        LargeActionButton screenRecyclerNavbarTwoButtonsSecondButton2 = g3().e;
        Intrinsics.checkNotNullExpressionValue(screenRecyclerNavbarTwoButtonsSecondButton2, "screenRecyclerNavbarTwoButtonsSecondButton");
        screenRecyclerNavbarTwoButtonsSecondButton2.setText(new TextLocalisedClause(R$string.transaction_recogniser_final_checks_screen_action_submit_chargeback, null, null, 14));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF78908e0() {
        return (List) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
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
