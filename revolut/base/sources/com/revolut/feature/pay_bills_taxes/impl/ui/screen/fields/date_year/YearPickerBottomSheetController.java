package com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.date_year;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.YearPickerDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import grl.b4;
import ip0.up0;
import java.util.List;
import jii.f;
import kg9.a;
import kg9.b;
import kg9.c;
import kg9.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import rd0.e;
import vc.s;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_bills_taxes/impl/ui/screen/fields/date_year/YearPickerBottomSheetController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lkg9/b;", "kg9/a", "feature_pay_bills_taxes_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class YearPickerBottomSheetController extends SimpleViewController<b> {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(YearPickerBottomSheetController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final a N;
    public final int O;
    public final h P;
    public final d Q;
    public final d R;
    public final YearPickerDelegate S;
    public final j T;

    public YearPickerBottomSheetController(a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = R$layout.screen_bottom_sheet_list;
        this.P = s.t(this, c.f);
        d dVar = new d();
        this.Q = dVar;
        this.R = dVar;
        YearPickerDelegate yearPickerDelegate = new YearPickerDelegate();
        this.S = yearPickerDelegate;
        this.T = new j(7, u.c(yearPickerDelegate), false);
    }

    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return this.R;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174520c.setLayoutManager(new LinearLayoutManager(m2()));
        d3().f174520c.addItemDecoration(new o31.b());
        ScreenContentRecyclerView screenContentRecyclerView = d3().f174520c;
        j jVar = this.T;
        screenContentRecyclerView.setAdapter(jVar);
        NavBarBottomSheet navBarBottomSheet = d3().f174519b;
        a aVar = this.N;
        navBarBottomSheet.setHeaderModel(new lw0.a(aVar.f183933a, null, null, null, false, 30));
        List listC = u.c(new up0("YEAR_PICKER_ID", aVar.f183934b, aVar.f183935c, Integer.valueOf(b4.EXPIRED_OR_INVALID_KEY_VALUE), aVar.d));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        jVar.c(listC);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        com.revolut.kompot.navigable.a.g2(this, e.b(this.S.f53650c.f121375b), null, new kae.d(this, null, 8), 3);
    }

    public final f d3() {
        ViewBinding value = this.P.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (f) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }
}
