package com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.modal.confirmation;

import a8b.b;
import a8b.c;
import a8b.d;
import a8b.g;
import a8b.i;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.o9;
import b6b.j0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderActionConfirmation;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsValueReminderActionConfirmationAction;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.modal.confirmation.CobrandedCardsDowngradeConfirmationScreen;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.modal.confirmation.CobrandedCardsDowngradeConfirmationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.cobranded.cards.impl.R$string;
import dli.a;
import java.util.List;
import jii.p;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import te0.w;
import vc.s;
import xki.e;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/impl/presentation/screens/value_reminder/modal/confirmation/CobrandedCardsDowngradeConfirmationScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "La8b/g;", "Ldli/a;", "La8b/i;", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CobrandedCardsDowngradeConfirmationScreen extends ViewController<g> implements a {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(CobrandedCardsDowngradeConfirmationScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetTwinVerticalButtonBinding;", 0))};
    public final CobrandedCardsDowngradeConfirmationScreenContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public CobrandedCardsDowngradeConfirmationScreen(CobrandedCardsDowngradeConfirmationScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet_twin_vertical_button;
        this.M = s.t(this, b.f);
        this.N = new RowDelegate(null, null, 7);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: a8b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsDowngradeConfirmationScreen f2146b;

            {
                this.f2146b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CobrandedCardsDowngradeConfirmationScreen cobrandedCardsDowngradeConfirmationScreen = this.f2146b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsDowngradeConfirmationScreen.R;
                        CobrandedCardsDowngradeConfirmationScreen cobrandedCardsDowngradeConfirmationScreen2 = this.f2146b;
                        return dli.f.a(cobrandedCardsDowngradeConfirmationScreen2, (h) cobrandedCardsDowngradeConfirmationScreen2.Q.getValue(), v.k(cobrandedCardsDowngradeConfirmationScreen2.N, new CellDetailsDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsDowngradeConfirmationScreen.R;
                        qji.b bVarU2 = cobrandedCardsDowngradeConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.modal.confirmation.di.CobrandedCardsDowngradeConfirmationScreenInjector");
                        j0 j0Var = (j0) ((b8b.b) bVarU2).q().mo3808a(cobrandedCardsDowngradeConfirmationScreen);
                        CobrandedCardsDowngradeConfirmationScreenContract$InputData cobrandedCardsDowngradeConfirmationScreenContract$InputData = cobrandedCardsDowngradeConfirmationScreen.K;
                        switch (j0Var.f12625a) {
                            case 0:
                                cobrandedCardsDowngradeConfirmationScreenContract$InputData.getClass();
                                j0Var.d = cobrandedCardsDowngradeConfirmationScreenContract$InputData;
                                break;
                            default:
                                cobrandedCardsDowngradeConfirmationScreenContract$InputData.getClass();
                                j0Var.d = cobrandedCardsDowngradeConfirmationScreenContract$InputData;
                                break;
                        }
                        return (b8b.a) j0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsDowngradeConfirmationScreen.R;
                        return ((b8b.a) cobrandedCardsDowngradeConfirmationScreen.P.getValue()).a();
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: a8b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsDowngradeConfirmationScreen f2146b;

            {
                this.f2146b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CobrandedCardsDowngradeConfirmationScreen cobrandedCardsDowngradeConfirmationScreen = this.f2146b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsDowngradeConfirmationScreen.R;
                        CobrandedCardsDowngradeConfirmationScreen cobrandedCardsDowngradeConfirmationScreen2 = this.f2146b;
                        return dli.f.a(cobrandedCardsDowngradeConfirmationScreen2, (h) cobrandedCardsDowngradeConfirmationScreen2.Q.getValue(), v.k(cobrandedCardsDowngradeConfirmationScreen2.N, new CellDetailsDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsDowngradeConfirmationScreen.R;
                        qji.b bVarU2 = cobrandedCardsDowngradeConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.modal.confirmation.di.CobrandedCardsDowngradeConfirmationScreenInjector");
                        j0 j0Var = (j0) ((b8b.b) bVarU2).q().mo3808a(cobrandedCardsDowngradeConfirmationScreen);
                        CobrandedCardsDowngradeConfirmationScreenContract$InputData cobrandedCardsDowngradeConfirmationScreenContract$InputData = cobrandedCardsDowngradeConfirmationScreen.K;
                        switch (j0Var.f12625a) {
                            case 0:
                                cobrandedCardsDowngradeConfirmationScreenContract$InputData.getClass();
                                j0Var.d = cobrandedCardsDowngradeConfirmationScreenContract$InputData;
                                break;
                            default:
                                cobrandedCardsDowngradeConfirmationScreenContract$InputData.getClass();
                                j0Var.d = cobrandedCardsDowngradeConfirmationScreenContract$InputData;
                                break;
                        }
                        return (b8b.a) j0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsDowngradeConfirmationScreen.R;
                        return ((b8b.a) cobrandedCardsDowngradeConfirmationScreen.P.getValue()).a();
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: a8b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CobrandedCardsDowngradeConfirmationScreen f2146b;

            {
                this.f2146b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CobrandedCardsDowngradeConfirmationScreen cobrandedCardsDowngradeConfirmationScreen = this.f2146b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CobrandedCardsDowngradeConfirmationScreen.R;
                        CobrandedCardsDowngradeConfirmationScreen cobrandedCardsDowngradeConfirmationScreen2 = this.f2146b;
                        return dli.f.a(cobrandedCardsDowngradeConfirmationScreen2, (h) cobrandedCardsDowngradeConfirmationScreen2.Q.getValue(), v.k(cobrandedCardsDowngradeConfirmationScreen2.N, new CellDetailsDelegate()), R$id.navBarBottomSheet_RecyclerView, null, null, null, 56);
                    case 1:
                        KProperty[] kPropertyArr2 = CobrandedCardsDowngradeConfirmationScreen.R;
                        qji.b bVarU2 = cobrandedCardsDowngradeConfirmationScreen.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.value_reminder.modal.confirmation.di.CobrandedCardsDowngradeConfirmationScreenInjector");
                        j0 j0Var = (j0) ((b8b.b) bVarU2).q().mo3808a(cobrandedCardsDowngradeConfirmationScreen);
                        CobrandedCardsDowngradeConfirmationScreenContract$InputData cobrandedCardsDowngradeConfirmationScreenContract$InputData = cobrandedCardsDowngradeConfirmationScreen.K;
                        switch (j0Var.f12625a) {
                            case 0:
                                cobrandedCardsDowngradeConfirmationScreenContract$InputData.getClass();
                                j0Var.d = cobrandedCardsDowngradeConfirmationScreenContract$InputData;
                                break;
                            default:
                                cobrandedCardsDowngradeConfirmationScreenContract$InputData.getClass();
                                j0Var.d = cobrandedCardsDowngradeConfirmationScreenContract$InputData;
                                break;
                        }
                        return (b8b.a) j0Var.mo3783build();
                    default:
                        KProperty[] kPropertyArr3 = CobrandedCardsDowngradeConfirmationScreen.R;
                        return ((b8b.a) cobrandedCardsDowngradeConfirmationScreen.P.getValue()).a();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((i) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (b8b.a) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (a8b.h) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        TextClause textClause;
        Style style;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarBottomSheet navBarBottomSheet = d3().f174548b;
        CobrandedCardsDowngradeConfirmationScreenContract$InputData cobrandedCardsDowngradeConfirmationScreenContract$InputData = this.K;
        TextClause textClause2 = new TextClause(cobrandedCardsDowngradeConfirmationScreenContract$InputData.f82633a.f82449a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        CobrandedCardsValueReminderActionConfirmation cobrandedCardsValueReminderActionConfirmation = cobrandedCardsDowngradeConfirmationScreenContract$InputData.f82633a;
        String str = cobrandedCardsValueReminderActionConfirmation.f82450b;
        if (str != null) {
            style = null;
            textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = null;
            style = null;
        }
        Style style2 = style;
        navBarBottomSheet.setHeaderModel(new lw0.a(textClause2, textClause, null, null, false, 28));
        ScreenContentRecyclerView navBarBottomSheetRecyclerView = d3().f174549c;
        Intrinsics.checkNotNullExpressionValue(navBarBottomSheetRecyclerView, "navBarBottomSheetRecyclerView");
        knm.b.v(-kli.a.w(R$attr.uikit_dp32, m2()), navBarBottomSheetRecyclerView);
        CobrandedCardsValueReminderActionConfirmationAction cobrandedCardsValueReminderActionConfirmationAction = cobrandedCardsValueReminderActionConfirmation.e;
        CobrandedCardsValueReminderActionConfirmationAction cobrandedCardsValueReminderActionConfirmationAction2 = cobrandedCardsValueReminderActionConfirmation.f;
        TwinVerticalButton twinVerticalButton = d3().d;
        twinVerticalButton.setMainButtonVisible(cobrandedCardsValueReminderActionConfirmationAction != null);
        if (cobrandedCardsValueReminderActionConfirmationAction != null) {
            twinVerticalButton.setMainButtonText(new TextLocalisedClause(R$string.cobrand_action_confirm_button_placeholder, u.c(cobrandedCardsValueReminderActionConfirmationAction.f82452a), style2, 12));
        }
        twinVerticalButton.setSecondaryButtonVisible(cobrandedCardsValueReminderActionConfirmationAction2 != null);
        if (cobrandedCardsValueReminderActionConfirmationAction2 != null) {
            twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.cobrand_action_cancel_button_placeholder, u.c(cobrandedCardsValueReminderActionConfirmationAction2.f82452a), style2, 12));
            twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        CobrandedCardsDowngradeConfirmationScreenContract$InputData cobrandedCardsDowngradeConfirmationScreenContract$InputData = this.K;
        if (cobrandedCardsDowngradeConfirmationScreenContract$InputData.f82633a.e != null) {
            ViewController.P2(this, rd0.e.b(d3().d.o0()), new c(this, null, 0), 3);
        }
        if (cobrandedCardsDowngradeConfirmationScreenContract$InputData.f82633a.f != null) {
            ViewController.P2(this, rd0.e.b(d3().d.p0()), new c(this, null, 1), 3);
        }
        ViewController.P2(this, rd0.e.b(this.N.f53218h), new d(this, null), 3);
    }

    public final p d3() {
        ViewBinding value = this.M.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (p) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
