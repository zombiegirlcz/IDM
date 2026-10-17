package com.revolut.feature.credit.card.impl.ui.instalment.mapper;

import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import grl.k9;
import gs4.o;
import gs4.q;
import gs4.r;
import java.util.List;
import jii.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import no.m;
import o31.b;
import rd0.e;
import tx0.j0;
import vc.s;
import w01.k;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/mapper/TransactionsOverviewController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "", "Lno/m;", "gs4/o", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TransactionsOverviewController extends SimpleViewController<Object> implements m {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(TransactionsOverviewController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarNextbuttonBinding;", 0))};
    public final o N;
    public final h O;
    public final int P;
    public final AnalyticsProduct.Retail Q;
    public final j R;

    public TransactionsOverviewController(o inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = s.t(this, q.f);
        this.P = R$layout.screen_recycler_navbar_nextbutton;
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.Q = a.h(k9Var, "value", k9Var);
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        this.R = new j(7, v.k(rowDelegate, new SwipeToActionDelegate(rowDelegate, false), new ListSubheaderDelegate()), false);
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getG0() {
        return this.Q;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithToolbar navBarWithToolbar = d3().f174565c;
        o oVar = this.N;
        navBarWithToolbar.setTitle(oVar.f146325a, null);
        navBarWithToolbar.setToolbarTitle(oVar.f146325a);
        navBarWithToolbar.setHeaderTitleMode(j0.MULTILINE_LARGE);
        navBarWithToolbar.setNavigationButtonImage(new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithToolbar.setSecondDescriptionText(oVar.f146326b);
        navBarWithToolbar.setSecondDescriptionVisible(true);
        LargeActionButton largeActionButton = d3().f174564b;
        largeActionButton.setText(oVar.f146327c);
        k.d(largeActionButton);
        ScreenContentRecyclerView screenContentRecyclerView = d3().d;
        j jVar = this.R;
        screenContentRecyclerView.setAdapter(jVar);
        screenContentRecyclerView.setLayoutManager(new LinearLayoutManager(m2()));
        screenContentRecyclerView.setVisibility(0);
        screenContentRecyclerView.addItemDecoration(new b());
        jVar.c(oVar.d);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e.b(d3().f174564b.o), new r(this, null, 0), 3);
        ViewController.P2(this, e.b(d3().f174565c.f59410q), new r(this, null, 1), 3);
    }

    public final u d3() {
        ViewBinding value = this.O.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (u) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.P;
    }
}
