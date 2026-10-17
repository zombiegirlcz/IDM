package com.revolut.feature.standingordertopup.impl.ui.screen.edit_order;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.standingordertopup.impl.R$string;
import com.revolut.feature.standingordertopup.impl.ui.screen.edit_order.EditTopUpOrderScreen;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.revolut.feature_fourthline_impl.R;
import dli.a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import sxd.b;
import sxd.c;
import sxd.d;
import sxd.f;
import sxd.h;
import sxd.k;
import sxd.l;
import te0.w;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/standingordertopup/impl/ui/screen/edit_order/EditTopUpOrderScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsxd/h;", "Ldli/a;", "Lsxd/l;", "feature_standing_order_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditTopUpOrderScreen extends ViewController<h> implements a {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(EditTopUpOrderScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarTwinVerticalButtonsBinding;", 0))};
    public final int K;
    public final ao.h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final RowDelegate P;
    public final SuggestionsBarDelegate Q;
    public final Object R;

    public EditTopUpOrderScreen(EditTopUpOrderScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_recycler_navbar_twin_vertical_buttons;
        this.L = s.t(this, b.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: sxd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditTopUpOrderScreen f266417b;

            {
                this.f266417b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                EditTopUpOrderScreen editTopUpOrderScreen = this.f266417b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = EditTopUpOrderScreen.S;
                        return editTopUpOrderScreen.d3().d;
                    case 1:
                        KProperty[] kPropertyArr2 = EditTopUpOrderScreen.S;
                        return (k) ((jxd.e) editTopUpOrderScreen.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = EditTopUpOrderScreen.S;
                        EditTopUpOrderScreen editTopUpOrderScreen2 = this.f266417b;
                        return dli.f.a(editTopUpOrderScreen2, editTopUpOrderScreen2.R2(), zhm.v.k(editTopUpOrderScreen2.P, editTopUpOrderScreen2.Q, new RowLoadingDelegate(), new ExpandableCellLoadingDelegate(), new CellDetailsActionDelegate(), new PlainTextWarningDelegate()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.N = w.y0(new sw6.a(this, inputData, 1));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: sxd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditTopUpOrderScreen f266417b;

            {
                this.f266417b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                EditTopUpOrderScreen editTopUpOrderScreen = this.f266417b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditTopUpOrderScreen.S;
                        return editTopUpOrderScreen.d3().d;
                    case 1:
                        KProperty[] kPropertyArr2 = EditTopUpOrderScreen.S;
                        return (k) ((jxd.e) editTopUpOrderScreen.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = EditTopUpOrderScreen.S;
                        EditTopUpOrderScreen editTopUpOrderScreen2 = this.f266417b;
                        return dli.f.a(editTopUpOrderScreen2, editTopUpOrderScreen2.R2(), zhm.v.k(editTopUpOrderScreen2.P, editTopUpOrderScreen2.Q, new RowLoadingDelegate(), new ExpandableCellLoadingDelegate(), new CellDetailsActionDelegate(), new PlainTextWarningDelegate()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
        this.P = new RowDelegate(null, null, 7);
        this.Q = new SuggestionsBarDelegate();
        final int i3 = 2;
        this.R = w.y0(new Function0(this) { // from class: sxd.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditTopUpOrderScreen f266417b;

            {
                this.f266417b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                EditTopUpOrderScreen editTopUpOrderScreen = this.f266417b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = EditTopUpOrderScreen.S;
                        return editTopUpOrderScreen.d3().d;
                    case 1:
                        KProperty[] kPropertyArr2 = EditTopUpOrderScreen.S;
                        return (k) ((jxd.e) editTopUpOrderScreen.N.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = EditTopUpOrderScreen.S;
                        EditTopUpOrderScreen editTopUpOrderScreen2 = this.f266417b;
                        return dli.f.a(editTopUpOrderScreen2, editTopUpOrderScreen2.R2(), zhm.v.k(editTopUpOrderScreen2.P, editTopUpOrderScreen2.Q, new RowLoadingDelegate(), new ExpandableCellLoadingDelegate(), new CellDetailsActionDelegate(), new PlainTextWarningDelegate()), R$id.screenRecyclerNavbarTwinVerticalButton_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // cli.w
    public final void B(o oVar, q qVar) {
        l uiState = (l) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        TwinVerticalButton twinVerticalButton = (TwinVerticalButton) this.M.getValue();
        twinVerticalButton.setMainButtonEnabled(uiState.f266436c);
        twinVerticalButton.setSecondaryButtonVisible(uiState.f266435b);
        boolean z = uiState.d != null;
        twinVerticalButton.setDescriptionVisibility(z ? 0 : 8);
        TwinVerticalButton.setDescription$default(twinVerticalButton, uiState.d, null, null, 6, null);
        twinVerticalButton.setGradientBackgroundEnabled(z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (jxd.e) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.standing_orders_topup_balance_ob_title, null, null, 14);
        NavBarWithToolbar navBarWithToolbar = d3().f174570b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        TwinVerticalButton twinVerticalButton = (TwinVerticalButton) this.M.getValue();
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_save, null, null, 14));
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R.string.common_action_delete, null, null, 14));
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.o);
        twinVerticalButton.setSecondaryButtonVisible(false);
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().f174570b.f59410q), new c(this, continuation, 0), 3);
        RowDelegate rowDelegate = this.P;
        ViewController.P2(this, rd0.e.b(rowDelegate.f53218h), new d(this, null), 3);
        ViewController.P2(this, rd0.e.b(rowDelegate.f53220l), new sxd.e(this, null), 3);
        ViewController.P2(this, rd0.e.b(this.Q.p().d), new f(this, null), 3);
        ?? r62 = this.M;
        ViewController.P2(this, rd0.e.b(((TwinVerticalButton) r62.getValue()).o0()), new c(this, continuation, 2), 3);
        ViewController.P2(this, rd0.e.b(((TwinVerticalButton) r62.getValue()).p0()), new c(this, continuation, 1), 3);
    }

    public final jii.w d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.w) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final k R2() {
        return (k) this.O.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getO() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.R.getValue();
    }
}
