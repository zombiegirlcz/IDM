package com.revolut.retail.feature.payments.bank_transfer.impl.new_zealand_transfer_note;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.retail.feature.payments.bank_transfer.impl.R$string;
import java.util.List;
import jki.m;
import jki.n;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import te0.w;
import vc.s;
import y1a.a;
import y2k.b;
import y2k.c;
import y2k.d;
import y2k.f;
import y2k.i;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/new_zealand_transfer_note/NewZealandTransferNoteScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ly2k/i;", "Lcom/revolut/retail/feature/payments/bank_transfer/impl/new_zealand_transfer_note/NewZealandTransferNoteScreenContract$InputData;", "Ly2k/f;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewZealandTransferNoteScreen extends BaseRecyclerViewScreen<i, NewZealandTransferNoteScreenContract$InputData, f> {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(NewZealandTransferNoteScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final int U;
    public final int V;
    public final h W;
    public final boolean X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final InputTextDelegate f102010a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f102011b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewZealandTransferNoteScreen(NewZealandTransferNoteScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recycler_navbar_nextbutton;
        this.V = R$id.recyclerView;
        this.W = s.t(this, b.f);
        this.X = true;
        this.Y = w.y0(new a(this, inputData, 1));
        this.Z = w.y0(new xge.h(this, 23));
        InputTextDelegate inputTextDelegate = new InputTextDelegate(null);
        this.f102010a0 = inputTextDelegate;
        this.f102011b0 = u.c(inputTextDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.a
    public final boolean F2() {
        ((y2k.a) ((y2k.h) this.Z.getValue())).v2(f.a.f310673a);
        return true;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        i uiState = (i) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        LargeActionButton goToButton = ((jii.u) value).f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setEnabled(uiState.f310676b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (p2k.m) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (y2k.h) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        KProperty[] kPropertyArr = c0;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.W;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.u) value).f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.f59410q), null, new c(this, null, 0), 3);
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        LargeActionButton goToButton = ((jii.u) value2).f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        com.revolut.kompot.navigable.a.g2(this, e.b(goToButton.o), null, new c(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.f102010a0.e.f121375b), null, new d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        KProperty[] kPropertyArr = c0;
        KProperty kProperty = kPropertyArr[0];
        h hVar = this.W;
        ViewBinding value = hVar.getValue(this, kProperty);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.u) value).f174565c;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.transfer_note_new_zealand_title, null, null, 14));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.transfer_note_new_zealand_title, null, null, 14), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        ViewBinding value2 = hVar.getValue(this, kPropertyArr[0]);
        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
        LargeActionButton goToButton = ((jii.u) value2).f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setText(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(n nVar, o oVar) {
        i uiState = (i) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        ViewBinding value = this.W.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        LargeActionButton goToButton = ((jii.u) value).f174564b;
        Intrinsics.checkNotNullExpressionValue(goToButton, "goToButton");
        goToButton.setEnabled(uiState.f310676b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF78883b0() {
        return this.f102011b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getW() {
        return this.V;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.X);
    }
}
