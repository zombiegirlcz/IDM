package com.revolut.feature.credit.core.ui.bottom_sheet.list;

import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.TwinHorizontalButtonDelegate;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import cy4.a;
import cy4.b;
import cy4.c;
import cy4.d;
import grl.k9;
import java.util.List;
import jii.f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.k;
import no.m;
import rd0.e;
import vc.s;
import vkm.q;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\u0005\u0002¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/core/ui/bottom_sheet/list/CreditBottomSheetListItemsController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lcy4/b;", "Lno/m;", "Lno/k;", "cy4/a", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditBottomSheetListItemsController extends SimpleViewController<b> implements m, k {
    public static final /* synthetic */ KProperty[] X = {o0.f186429a.j(new h0(CreditBottomSheetListItemsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetListBinding;", 0))};
    public final a N;
    public final h O;
    public final RowDelegate P;
    public final CellDetailsDelegate Q;
    public final LargeActionButtonDelegate R;
    public final TwinHorizontalButtonDelegate S;
    public final j T;
    public final int U;
    public final AnalyticsProduct.Retail V;
    public AnalyticsContext W;

    public CreditBottomSheetListItemsController(a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = s.t(this, c.f);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.P = rowDelegate;
        CellDetailsDelegate cellDetailsDelegate = new CellDetailsDelegate();
        this.Q = cellDetailsDelegate;
        TextDelegate textDelegate = new TextDelegate();
        LargeActionButtonDelegate largeActionButtonDelegate = new LargeActionButtonDelegate();
        this.R = largeActionButtonDelegate;
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = new TwinHorizontalButtonDelegate();
        this.S = twinHorizontalButtonDelegate;
        this.T = new j(7, v.k(rowDelegate, cellDetailsDelegate, textDelegate, largeActionButtonDelegate, plainTextDelegate, twinHorizontalButtonDelegate), false);
        this.U = R$layout.screen_bottom_sheet_list;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.V = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        this.W = null;
    }

    @Override // no.k
    public final void K1(AnalyticsContext analyticsContext) {
        this.W = analyticsContext;
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getF75724b() {
        return this.V;
    }

    @Override // no.k
    /* JADX INFO: renamed from: R, reason: from getter */
    public final AnalyticsContext getW() {
        return this.W;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarBottomSheet navBarBottomSheet = d3().f174519b;
        a aVar = this.N;
        navBarBottomSheet.setHeaderModel(aVar.f110038a);
        ScreenContentRecyclerView screenContentRecyclerView = d3().f174520c;
        j jVar = this.T;
        screenContentRecyclerView.setAdapter(jVar);
        screenContentRecyclerView.setLayoutManager(new LinearLayoutManager(m2()));
        d3().f174520c.addItemDecoration(new o31.b());
        List list = aVar.f110039b;
        if (list != null) {
            jVar.c(list);
        }
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, e.b(this.R.d.f121375b), new d(this, null), 3);
        vkm.d dVarB = e.b(this.P.f53218h);
        vkm.d dVarB2 = e.b(this.Q.d);
        TwinHorizontalButtonDelegate twinHorizontalButtonDelegate = this.S;
        ViewController.P2(this, q.J(dVarB, dVarB2, e.b(twinHorizontalButtonDelegate.f53572c.f121375b), e.b(twinHorizontalButtonDelegate.d.f121375b)), new cy4.e(this, continuation, 0), 3);
        ViewController.P2(this, e.b(d3().f174519b.F), new cy4.e(this, continuation, 1), 3);
    }

    public final f d3() {
        ViewBinding value = this.O.getValue(this, X[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (f) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }
}
