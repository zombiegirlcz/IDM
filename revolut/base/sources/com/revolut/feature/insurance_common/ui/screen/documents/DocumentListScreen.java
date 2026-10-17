package com.revolut.feature.insurance_common.ui.screen.documents;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import sji.b;
import te0.w;
import tx0.j0;
import ur7.d;
import ur7.e;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/insurance_common/ui/screen/documents/DocumentListScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lur7/e;", "Lcom/revolut/feature/insurance_common/ui/screen/documents/DocumentListScreenContract$InputData;", "", "Lno/m;", "feature_insurance_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DocumentListScreen extends BaseRecyclerViewScreen<e, DocumentListScreenContract$InputData, Object> implements m {
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(DocumentListScreen.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final /* synthetic */ DocumentListScreenContract$InputData U;
    public final boolean V;
    public final int W;
    public final h X;
    public final Object Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final RowDelegate f75718a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final List f75719b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentListScreen(DocumentListScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = inputData;
        this.V = inputData.getF75725c();
        this.W = R$layout.screen_recycler_navbar;
        this.X = s.t(this, ur7.a.f);
        this.Y = w.y0(new uj7.a(this, inputData, 15));
        this.Z = w.y0(new ur2.a(this, 1));
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.f75718a0 = rowDelegate;
        this.f75719b0 = v.k(rowDelegate, new ListSubheaderDelegate(), new RowLoadingDelegate(), new FullScreenStateDelegate());
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return this.U.getL();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (qr7.a) this.Y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (d) this.Z.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        ViewBinding value = this.X.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(((jii.m) value).f174539b.f59410q), null, new uea.e(this, null, 20), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.f75718a0.f53218h), null, new ur7.b(this, null), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        ViewBinding value = this.X.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((jii.m) value).f174539b;
        DocumentListScreenContract$InputData documentListScreenContract$InputData = (DocumentListScreenContract$InputData) this.G;
        navBarWithToolbar.setToolbarTitle(documentListScreenContract$InputData.getF75723a());
        navBarWithToolbar.setTitle(documentListScreenContract$InputData.getF75723a(), null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF79372d0() {
        return this.f75719b0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.V);
    }
}
