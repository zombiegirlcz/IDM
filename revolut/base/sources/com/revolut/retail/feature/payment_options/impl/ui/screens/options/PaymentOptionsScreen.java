package com.revolut.retail.feature.payment_options.impl.ui.screens.options;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.payment_options.impl.R$id;
import com.revolut.retail.feature.payment_options.impl.R$layout;
import com.revolut.retail.feature.payment_options.impl.R$string;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import q1k.c;
import rd0.e;
import rtl.y;
import rxe.b;
import s1k.a;
import s1k.g;
import s1k.i;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payment_options/impl/ui/screens/options/PaymentOptionsScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ls1k/i;", "Lcom/revolut/retail/feature/payment_options/impl/ui/screens/options/PaymentOptionsScreenContract$InputData;", "Ls1k/g;", "feature_retail_payment_options_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentOptionsScreen extends BaseRecyclerViewScreen<i, PaymentOptionsScreenContract$InputData, g> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(PaymentOptionsScreen.class, "binding", "getBinding()Lcom/revolut/retail/feature/payment_options/impl/databinding/ScreenPaymentOptionsBinding;", 0))};
    public final RowDelegate U;
    public final h V;
    public final int W;
    public final int X;
    public final boolean Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f101886a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f101887b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsScreen(PaymentOptionsScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.U = rowDelegate;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        ListSubheaderDelegate listSubheaderDelegate = new ListSubheaderDelegate();
        this.V = s.t(this, a.f);
        this.W = R$layout.screen_payment_options;
        this.X = R$id.paymentOptions_recyclerView;
        this.Y = true;
        this.Z = w.y0(new b(this, inputData, 13));
        this.f101886a0 = w.y0(new y(this, 16));
        this.f101887b0 = v.k(rowDelegate, cellDetailsDelegate, listSubheaderDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (c) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (s1k.h) this.f101886a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.V.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(((o1k.a) value).f221392b.f59410q), null, new s1k.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.U.f53218h), null, new s1k.c(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.V.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((o1k.a) value).f221392b;
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.payment_options_screen_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.payment_options_screen_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF101887b0() {
        return this.f101887b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getX() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Y);
    }
}
