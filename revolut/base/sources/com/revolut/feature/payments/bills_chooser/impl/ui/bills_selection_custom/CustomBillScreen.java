package com.revolut.feature.payments.bills_chooser.impl.ui.bills_selection_custom;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.bills_chooser.api.navigation.CustomBillInputData;
import com.revolut.feature.payments.bills_chooser.impl.R$id;
import com.revolut.feature.payments.bills_chooser.impl.R$layout;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import efm.r;
import gp9.f;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import sji.b;
import te0.w;
import uj7.a;
import umd.n;
import up5.d0;
import up9.c;
import up9.d;
import up9.g;
import up9.i;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/impl/ui/bills_selection_custom/CustomBillScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lup9/d;", "Lcom/revolut/feature/payments/bills_chooser/api/navigation/CustomBillInputData;", "Lbp9/d;", "", "feature_payments_bills_chooser_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomBillScreen extends BaseRecyclerViewScreen<d, CustomBillInputData, bp9.d> {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f79238d0 = {o0.f186429a.j(new h0(CustomBillScreen.class, "binding", "getBinding()Lcom/revolut/feature/payments/bills_chooser/impl/databinding/ScreenBillsSelectionCustomBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final Object X;
    public final Object Y;
    public final boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final CenteredAmountDelegate f79239a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final InputTextDelegate f79240b0;
    public final List c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomBillScreen(CustomBillInputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_bills_selection_custom;
        this.V = R$id.bcCustomBill_recyclerView;
        this.W = s.t(this, g.f);
        this.X = w.y0(new a(this, inputData, 13));
        this.Y = w.y0(new tyl.a(this, 27));
        this.Z = true;
        CenteredAmountDelegate centeredAmountDelegate = new CenteredAmountDelegate(new n(this, 8));
        this.f79239a0 = centeredAmountDelegate;
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.f79240b0 = inputTextDelegate;
        this.c0 = v.k(centeredAmountDelegate, inputTextDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (f) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (c) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ep9.b bVarH3 = h3();
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, e.b(bVarH3.f128123c.f59338a), null, new up9.h(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(bVarH3.f128122b.o), null, new up9.h(this, continuation, 1), 3);
        CenteredAmountDelegate centeredAmountDelegate = this.f79239a0;
        r rVarMerge = r.merge(centeredAmountDelegate.f51966j.f121375b.map(new d0(6, new up5.h(28))), centeredAmountDelegate.e.f121375b.map(new d0(7, new up5.h(29))));
        Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
        com.revolut.kompot.navigable.a.g2(this, e.b(rVarMerge), null, new up9.h(this, continuation, 2), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f79240b0.e.f121375b), null, new i(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ep9.b bVarH3 = h3();
        bVarH3.f128123c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        LargeActionButton largeActionButton = bVarH3.f128122b;
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        largeActionButton.setText(new TextLocalisedClause(R$string.payments_groups_actions_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF79492e0() {
        return this.c0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getY() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(d uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        d3().c(uiState.f281924a);
        ep9.b bVarH3 = h3();
        bVarH3.f128122b.setEnabled(uiState.f281926c);
        bVarH3.f128123c.setToolbarTitle(uiState.f281925b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.U;
    }

    public final ep9.b h3() {
        ViewBinding value = this.W.getValue(this, f79238d0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ep9.b) value;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Z);
    }
}
