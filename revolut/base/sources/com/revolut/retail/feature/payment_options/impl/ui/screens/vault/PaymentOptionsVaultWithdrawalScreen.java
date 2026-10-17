package com.revolut.retail.feature.payment_options.impl.ui.screens.vault;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.payment_options.impl.R$id;
import com.revolut.retail.feature.payment_options.impl.R$layout;
import com.revolut.retail.feature.payment_options.impl.R$string;
import com.revolut.retail.feature.payment_options.impl.ui.screens.vault.PaymentOptionsVaultWithdrawalScreen;
import efm.r;
import java.util.List;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q1k.d;
import rd0.e;
import te0.w;
import tp8.l;
import ty1.c;
import u1.g;
import u1k.b;
import u1k.f;
import u1k.h;
import v0.a;
import vc.s;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payment_options/impl/ui/screens/vault/PaymentOptionsVaultWithdrawalScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lu1k/h;", "Lcom/revolut/retail/feature/payment_options/impl/ui/screens/vault/PaymentOptionsVaultWithdrawalScreenContract$InputData;", "Lu1k/f;", "feature_retail_payment_options_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentOptionsVaultWithdrawalScreen extends BaseRecyclerViewScreen<h, PaymentOptionsVaultWithdrawalScreenContract$InputData, f> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f101889e0 = {o0.f186429a.j(new h0(PaymentOptionsVaultWithdrawalScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/payment_options/impl/databinding/ScreenPaymentOptionsVaultWithdrawalBinding;", 0))};
    public final ao.h U;
    public final Object V;
    public final ihm.f W;
    public final Lazy X;
    public final int Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f101890a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f101891b0;
    public final Object c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f101892d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsVaultWithdrawalScreen(PaymentOptionsVaultWithdrawalScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, b.f);
        final int i = 0;
        this.V = w.y0(new Function0(this) { // from class: u1k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentOptionsVaultWithdrawalScreen f276416b;

            {
                this.f276416b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PaymentOptionsVaultWithdrawalScreen paymentOptionsVaultWithdrawalScreen = this.f276416b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentOptionsVaultWithdrawalScreen.f101889e0;
                        qd0.b bVarN = ((q1k.d) paymentOptionsVaultWithdrawalScreen.f101891b0.getValue()).f241464b.f241456c.n();
                        s.j(bVarN);
                        return bVarN;
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentOptionsVaultWithdrawalScreen.f101889e0;
                        return new AmountEditDelegate(new l(paymentOptionsVaultWithdrawalScreen, 19));
                    default:
                        KProperty[] kPropertyArr3 = PaymentOptionsVaultWithdrawalScreen.f101889e0;
                        return (g) ((q1k.d) paymentOptionsVaultWithdrawalScreen.f101891b0.getValue()).e.get();
                }
            }
        });
        this.W = a.d("create(...)");
        final int i2 = 1;
        Lazy lazyB = j.b(new Function0(this) { // from class: u1k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentOptionsVaultWithdrawalScreen f276416b;

            {
                this.f276416b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PaymentOptionsVaultWithdrawalScreen paymentOptionsVaultWithdrawalScreen = this.f276416b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentOptionsVaultWithdrawalScreen.f101889e0;
                        qd0.b bVarN = ((q1k.d) paymentOptionsVaultWithdrawalScreen.f101891b0.getValue()).f241464b.f241456c.n();
                        s.j(bVarN);
                        return bVarN;
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentOptionsVaultWithdrawalScreen.f101889e0;
                        return new AmountEditDelegate(new l(paymentOptionsVaultWithdrawalScreen, 19));
                    default:
                        KProperty[] kPropertyArr3 = PaymentOptionsVaultWithdrawalScreen.f101889e0;
                        return (g) ((q1k.d) paymentOptionsVaultWithdrawalScreen.f101891b0.getValue()).e.get();
                }
            }
        });
        this.X = lazyB;
        this.Y = R$layout.screen_payment_options_vault_withdrawal;
        this.Z = R$id.vaultWithdrawal_recyclerView;
        this.f101890a0 = true;
        this.f101891b0 = w.y0(new g(this, inputData, 7));
        final int i3 = 2;
        this.c0 = w.y0(new Function0(this) { // from class: u1k.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentOptionsVaultWithdrawalScreen f276416b;

            {
                this.f276416b = this;
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                PaymentOptionsVaultWithdrawalScreen paymentOptionsVaultWithdrawalScreen = this.f276416b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = PaymentOptionsVaultWithdrawalScreen.f101889e0;
                        qd0.b bVarN = ((q1k.d) paymentOptionsVaultWithdrawalScreen.f101891b0.getValue()).f241464b.f241456c.n();
                        s.j(bVarN);
                        return bVarN;
                    case 1:
                        KProperty[] kPropertyArr2 = PaymentOptionsVaultWithdrawalScreen.f101889e0;
                        return new AmountEditDelegate(new l(paymentOptionsVaultWithdrawalScreen, 19));
                    default:
                        KProperty[] kPropertyArr3 = PaymentOptionsVaultWithdrawalScreen.f101889e0;
                        return (g) ((q1k.d) paymentOptionsVaultWithdrawalScreen.f101891b0.getValue()).e.get();
                }
            }
        });
        this.f101892d0 = u.c((AmountEditDelegate) lazyB.getValue());
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        h uiState = (h) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f221395c.setEnabled(uiState.f276423b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (d) this.f101891b0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (u1k.g) this.c0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f221394b.f59410q), null, new u1k.d(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(g3().f221395c.o), null, new u1k.d(this, continuation, 1), 3);
        r map = this.W.map(new c(new tyg.g(26), 28));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(map), null, new tz6.e(this, continuation, 7), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f221394b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.payment_options_pocket_withdrawal_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.payment_options_pocket_withdrawal_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton largeActionButton = g3().f221395c;
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        largeActionButton.setText(new TextLocalisedClause(R$string.payment_options_pocket_withdrawal_button, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        h uiState = (h) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        g3().f221395c.setEnabled(uiState.f276423b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF101892d0() {
        return this.f101892d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.Z;
    }

    public final o1k.b g3() {
        ViewBinding value = this.U.getValue(this, f101889e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (o1k.b) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getY() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.f101890a0);
    }
}
