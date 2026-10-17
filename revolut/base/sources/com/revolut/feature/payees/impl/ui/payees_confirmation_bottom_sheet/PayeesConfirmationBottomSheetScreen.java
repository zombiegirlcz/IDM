package com.revolut.feature.payees.impl.ui.payees_confirmation_bottom_sheet;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.feature.payees.impl.R$id;
import com.revolut.feature.payees.impl.R$layout;
import com.revolut.feature.payees.impl.ui.payees_confirmation_bottom_sheet.PayeesConfirmationBottomSheetScreen;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import hm9.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nm9.b;
import nm9.j;
import nm9.k;
import nm9.m;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/payees_confirmation_bottom_sheet/PayeesConfirmationBottomSheetScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lnm9/j;", "Ldli/a;", "Lnm9/k;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayeesConfirmationBottomSheetScreen extends ViewController<j> implements a {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(PayeesConfirmationBottomSheetScreen.class, "binding", "getBinding()Lcom/revolut/feature/payees/impl/databinding/ScreenConfirmationBottomSheetBinding;", 0))};
    public final int K;
    public final Object L;
    public final h M;
    public final Object N;
    public final Object O;

    public PayeesConfirmationBottomSheetScreen(PayeesConfirmationBottomSheetScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = R$layout.screen_confirmation_bottom_sheet;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: nm9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayeesConfirmationBottomSheetScreen f217216b;

            {
                this.f217216b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KProperty[] kPropertyArr = PayeesConfirmationBottomSheetScreen.P;
                        PayeesConfirmationBottomSheetScreen payeesConfirmationBottomSheetScreen = this.f217216b;
                        return dli.f.a(payeesConfirmationBottomSheetScreen, (m) payeesConfirmationBottomSheetScreen.O.getValue(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate()), R$id.confirmationBottomSheetScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PayeesConfirmationBottomSheetScreen.P;
                        return (m) ((hm9.c) this.f217216b.N.getValue()).f153553c.get();
                }
            }
        });
        this.M = s.t(this, b.f);
        this.N = w.y0(new ni1.a(this, inputData, 5));
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: nm9.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayeesConfirmationBottomSheetScreen f217216b;

            {
                this.f217216b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PayeesConfirmationBottomSheetScreen.P;
                        PayeesConfirmationBottomSheetScreen payeesConfirmationBottomSheetScreen = this.f217216b;
                        return dli.f.a(payeesConfirmationBottomSheetScreen, (m) payeesConfirmationBottomSheetScreen.O.getValue(), v.k(new RowDelegate(null, null, 7), new RowLoadingDelegate()), R$id.confirmationBottomSheetScreen_recyclerView, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr2 = PayeesConfirmationBottomSheetScreen.P;
                        return (m) ((hm9.c) this.f217216b.N.getValue()).f153553c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        k uiState = (k) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        d3().f144797b.setHeaderModel(uiState.f217226b);
        TwinVerticalButton twinVerticalButton = d3().f144798c;
        twinVerticalButton.setMainButtonText(uiState.d);
        twinVerticalButton.setMainButtonEnabled(uiState.f217227c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (c) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (m) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        TwinVerticalButton twinVerticalButton = d3().f144798c;
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.security_hub_payees_select_sheet_action_cancel, null, null, 14));
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f144798c.o0()), new nm9.c(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f144798c.p0()), new nm9.c(this, null, 1), 3);
    }

    public final gm9.b d3() {
        ViewBinding value = this.M.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (gm9.b) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.K;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.L.getValue();
    }
}
