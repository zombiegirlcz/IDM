package com.revolut.feature.insurance_car.impl.ui.screen.delivery.print;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.TwinVerticalButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$id;
import com.revolut.feature.insurance_car.impl.R$layout;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import nl7.q;
import ql7.d1;
import rn7.d;
import rn7.e;
import rn7.f;
import sji.b;
import te0.w;
import tx0.j0;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/ui/screen/delivery/print/PrintDiscScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lrn7/f;", "Lcom/revolut/feature/insurance_car/impl/ui/screen/delivery/print/PrintDiscScreenContract$InputData;", "Lrn7/d;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PrintDiscScreen extends BaseRecyclerViewScreen<f, PrintDiscScreenContract$InputData, d> {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f75517a0 = {o0.f186429a.j(new h0(PrintDiscScreen.class, "binding", "getBinding()Lcom/revolut/feature/insurance_car/impl/databinding/ScreenPrintDiscBinding;", 0))};
    public final int U;
    public final h V;
    public final int W;
    public final Object X;
    public final Object Y;
    public final List Z;

    public PrintDiscScreen() {
        this(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (d1) this.X.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (e) this.Y.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        a.g2(this, rd0.e.b(g3().f217091c.f59410q), null, new rn7.b(this, null, 0), 3);
        a.g2(this, rd0.e.b(g3().f217090b.o0()), null, new rn7.b(this, null, 1), 3);
        a.g2(this, rd0.e.b(g3().f217090b.p0()), null, new rn7.b(this, null, 2), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        NavBarWithToolbar navBarWithToolbar = g3().f217091c;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_print_certificate_header_title, null, null, 14);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_back_button_arrow));
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE);
        TwinVerticalButton twinVerticalButton = g3().f217090b;
        twinVerticalButton.setMainButtonText(new TextLocalisedClause(R$string.car_insurance_print_certificate_footer_primary_button_title, null, null, 14));
        twinVerticalButton.setSecondaryButtonText(new TextLocalisedClause(R$string.car_insurance_print_certificate_footer_secondary_button_title, null, null, 14));
        twinVerticalButton.setSecondaryButtonStyle(LargeActionButton.ButtonStyle.f58726b);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF95992b0() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getZ() {
        return this.W;
    }

    public final q g3() {
        ViewBinding value = this.V.getValue(this, f75517a0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (q) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.U;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PrintDiscScreen(int i) {
        PrintDiscScreenContract$InputData inputData = PrintDiscScreenContract$InputData.f75518a;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        super(inputData);
        this.U = R$layout.screen_print_disc;
        this.V = s.t(this, rn7.a.f);
        this.W = R$id.printDisc_recyclerView;
        this.X = w.y0(new rgf.b(this, inputData, 9));
        this.Y = w.y0(new r1a.a(this, 18));
        this.Z = m72.b.v(null, null, 7);
    }
}
