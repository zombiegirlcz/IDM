package com.revolut.feature.revpro.card_reader.order.impl.ui.screen.vat;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.revpro.card_reader.order.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jki.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.x8;
import mzb.e;
import nfc.a;
import nfc.c;
import nfc.d;
import nfc.f;
import nfc.g;
import nfc.h;
import sji.b;
import te0.w;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revpro/card_reader/order/impl/ui/screen/vat/VatInputScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lnfc/h;", "Lcom/revolut/feature/revpro/card_reader/order/impl/ui/screen/vat/VatInputScreenContract$InputData;", "Lnfc/f;", "feature_revpro_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class VatInputScreen extends BaseRecyclerViewScreen<h, VatInputScreenContract$InputData, f> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f84760a0 = {o0.f186429a.j(new h0(VatInputScreen.class, "binding", "getBinding()Lcom/revolut/feature/revpro/card_reader/order/impl/databinding/ScreenCardReaderVatInputScreenBinding;", 0))};
    public final ao.h U;
    public final InputTextDelegate V;
    public final InputChecklistDelegate W;
    public final int X;
    public final Object Y;
    public final Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VatInputScreen(VatInputScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, a.f);
        this.V = new InputTextDelegate(null);
        this.W = new InputChecklistDelegate();
        this.X = R$layout.screen_card_reader_vat_input_screen;
        this.Y = w.y0(new x8(this, 26));
        this.Z = w.y0(new e(inputData, this, 26));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (ofc.b) this.Z.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) ((ofc.b) this.Z.getValue()).f224801c.get();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f183353c.f59410q), null, new nfc.b(this, null, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(h3().f183352b.o), null, new nfc.b(this, null, 1), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.V.e.f121375b), null, new c(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.W.f52518c), null, new d(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        h3().f183352b.setVisibility(8);
        h3().f183352b.setEnabled(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3 */
    public final List getF92555b0() {
        return (List) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(h uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        h3().f183353c.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        NavBarWithToolbar navBar = h3().f183353c;
        Intrinsics.checkNotNullExpressionValue(navBar, "navBar");
        navBar.H0(false);
        NavBarWithToolbar navBar2 = h3().f183353c;
        Intrinsics.checkNotNullExpressionValue(navBar2, "navBar");
        TextLocalisedClause textLocalisedClause = uiState.f214893b;
        navBar2.setTitle(textLocalisedClause, null);
        h3().f183353c.setToolbarTitle(textLocalisedClause);
        h3().f183353c.setDescriptionText(uiState.f214894c);
        h3().f183353c.setDescriptionVisible(true);
        h3().f183352b.setVisibility(0);
        h3().f183352b.setEnabled(uiState.e);
        h3().f183352b.setText(uiState.d);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.X;
    }

    public final kfc.a h3() {
        ViewBinding value = this.U.getValue(this, f84760a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (kfc.a) value;
    }
}
