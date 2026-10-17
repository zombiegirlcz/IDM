package com.revolut.feature.acquiring.lite_pos.impl.ui.screen.receipt;

import a07.b;
import af1.a;
import af1.d;
import af1.g;
import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.QRCodeDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.lite_pos.impl.R$id;
import com.revolut.feature.acquiring.lite_pos.impl.R$layout;
import com.revolut.feature.acquiring.lite_pos.impl.R$string;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import jd1.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ld1.t;
import rd0.e;
import te0.w;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/receipt/ReceiptScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Laf1/d;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/screen/receipt/ReceiptScreenContract$InputData;", "Laii/q;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReceiptScreen extends BaseRecyclerViewScreen<d, ReceiptScreenContract$InputData, q> {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f60830b0 = {o0.f186429a.j(new h0(ReceiptScreen.class, "binding", "getBinding()Lcom/revolut/feature/acquiring/lite_pos/impl/databinding/ScreenReceiptBinding;", 0))};
    public final h U;
    public final ListCellDelegate V;
    public final boolean W;
    public final List X;
    public final int Y;
    public final int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f60831a0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptScreen(ReceiptScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = s.t(this, a.f);
        ListCellDelegate listCellDelegate = new ListCellDelegate();
        this.V = listCellDelegate;
        this.W = true;
        this.X = v.k(new QRCodeDelegate(), listCellDelegate);
        this.Y = R$layout.screen_receipt;
        this.Z = R$id.receiptScreen_recyclerView;
        this.f60831a0 = w.y0(new b(this, inputData, 26));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (t) this.f60831a0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g) ((t) this.f60831a0.getValue()).f193999g.get();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        com.revolut.kompot.navigable.a.g2(this, e.b(this.V.f52692c), null, new af1.b(this, null), 3);
        ViewBinding value = this.U.getValue(this, f60830b0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((l) value).f172937b;
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_navigation_back));
        navBarWithToolbar.setTitle(new TextLocalisedClause(R$string.product_catalogue_receipt_toolbar_title, null, null, 14), null);
        navBarWithToolbar.setToolbarTitle(new TextLocalisedClause(R$string.product_catalogue_receipt_toolbar_title, null, null, 14));
        com.revolut.kompot.navigable.a.g2(this, e.b(navBarWithToolbar.f59410q), null, new a07.d(this, null, 20), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getX() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.Y;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
