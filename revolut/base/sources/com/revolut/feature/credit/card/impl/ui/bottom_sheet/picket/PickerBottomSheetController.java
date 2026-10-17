package com.revolut.feature.credit.card.impl.ui.bottom_sheet.picket;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PickerDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import efm.r;
import ep4.b;
import ip0.a10;
import ip0.c10;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import vc.s;
import yo7.p;
import yp4.c;
import yp4.d;
import yp4.e;
import yp4.f;
import z4l.j;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0004\u0002¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/bottom_sheet/picket/PickerBottomSheetController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lyp4/d;", "Lno/m;", "yp4/c", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PickerBottomSheetController extends SimpleViewController<d> implements m {
    public static final /* synthetic */ KProperty[] W = {o0.f186429a.j(new h0(PickerBottomSheetController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final /* synthetic */ b N;
    public final c O;
    public final int P;
    public final h Q;
    public final f R;
    public final f S;
    public final PickerDelegate T;
    public final LargeActionButtonDelegate U;
    public final j V;

    public PickerBottomSheetController(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = b.f128075a;
        this.O = inputData;
        this.P = R$layout.screen_bottom_sheet_list;
        this.Q = s.t(this, e.f);
        f fVar = new f();
        this.R = fVar;
        this.S = fVar;
        PickerDelegate pickerDelegate = new PickerDelegate();
        this.T = pickerDelegate;
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.U = largeActionButtonDelegate;
        this.V = new j(7, v.k(pickerDelegate, largeActionButtonDelegate), false);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        this.N.getClass();
        return b.f128076b;
    }

    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return this.S;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f174520c.setLayoutManager(new LinearLayoutManager(m2()));
        d3().f174520c.addItemDecoration(new o31.b());
        ScreenContentRecyclerView screenContentRecyclerView = d3().f174520c;
        j jVar = this.V;
        screenContentRecyclerView.setAdapter(jVar);
        NavBarBottomSheet navBarBottomSheet = d3().f174519b;
        c cVar = this.O;
        navBarBottomSheet.setHeaderModel(cVar.f315781a);
        ArrayList<yp4.b> arrayList = cVar.f315783c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (yp4.b bVar : arrayList) {
            arrayList2.add(new c10(bVar.f315779a, bVar.f315780b));
        }
        a10 a10Var = new a10("ID_PICKER", arrayList2, cVar.d);
        yp0.b.l(a10Var, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_PICKER_ACTION", LargeActionButton.ButtonStyle.f58725a, null, cVar.f315782b.f315778a, false, null, null, null, null, 1000);
        yp0.b.r(model, R$attr.uikit_dp24, R$attr.uikit_dp16, 0, 0, 12);
        jVar.c(v.k(a10Var, model));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        r rVarSwitchMap = this.T.f52922c.switchMap(new yma.r(new p(this, 4), 23));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        a.g2(this, rd0.e.b(rVarSwitchMap), null, new yk6.m(this, (Continuation) null, 7), 3);
    }

    public final jii.f d3() {
        ViewBinding value = this.Q.getValue(this, W[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.f) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.P;
    }
}
