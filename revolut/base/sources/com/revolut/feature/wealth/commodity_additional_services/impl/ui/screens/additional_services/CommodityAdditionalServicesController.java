package com.revolut.feature.wealth.commodity_additional_services.impl.ui.screens.additional_services;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.wealth.commodity_additional_services.impl.R$string;
import com.revolut.feature.wealth.commodity_additional_services.impl.ui.screens.additional_services.CommodityAdditionalServicesController;
import com.revolut.feature.wealth.commodity_additional_services.impl.ui.screens.additional_services.CommodityAdditionalServicesControllerContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import jii.m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import pvk.i;
import q5h.b;
import q5h.f;
import q5h.g;
import q5h.j;
import te0.w;
import vc.s;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/commodity_additional_services/impl/ui/screens/additional_services/CommodityAdditionalServicesController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lq5h/j;", "feature_wealth_commodity_additional_services_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CommodityAdditionalServicesController extends ViewController<q> implements a {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(CommodityAdditionalServicesController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBinding;", 0))};
    public final CommodityAdditionalServicesControllerContract$InputData K;
    public final int L;
    public final h M;
    public final RowDelegate N;
    public final RowLoadingDelegate O;
    public final FullScreenStateDelegate P;
    public final Object Q;
    public final Object R;
    public final Object S;

    public CommodityAdditionalServicesController(CommodityAdditionalServicesControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar;
        this.M = s.t(this, b.f);
        this.N = new RowDelegate(null, null, 7);
        this.O = new RowLoadingDelegate();
        this.P = new FullScreenStateDelegate();
        final int i = 0;
        this.Q = w.y0(new Function0(this) { // from class: q5h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityAdditionalServicesController f242400b;

            {
                this.f242400b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CommodityAdditionalServicesController commodityAdditionalServicesController = this.f242400b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityAdditionalServicesController.T;
                        phm.a aVar = (phm.a) ue0.e.j(commodityAdditionalServicesController.m2()).a().get(l5h.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l5h.a.class, " is not found"));
                        }
                        l5h.a aVar3 = ((l5h.a) aVar2.b()).f;
                        CommodityAdditionalServicesControllerContract$InputData commodityAdditionalServicesControllerContract$InputData = commodityAdditionalServicesController.K;
                        commodityAdditionalServicesControllerContract$InputData.getClass();
                        return new l5h.b(aVar3, commodityAdditionalServicesControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CommodityAdditionalServicesController.T;
                        int i3 = R$id.recyclerView;
                        CommodityAdditionalServicesController commodityAdditionalServicesController2 = this.f242400b;
                        return dli.f.a(commodityAdditionalServicesController2, commodityAdditionalServicesController2.R2(), v.k(commodityAdditionalServicesController2.N, commodityAdditionalServicesController2.O, commodityAdditionalServicesController2.P), i3, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CommodityAdditionalServicesController.T;
                        return (h) ((l5h.b) commodityAdditionalServicesController.Q.getValue()).f192268b.get();
                }
            }
        });
        final int i2 = 1;
        this.R = w.y0(new Function0(this) { // from class: q5h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityAdditionalServicesController f242400b;

            {
                this.f242400b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CommodityAdditionalServicesController commodityAdditionalServicesController = this.f242400b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityAdditionalServicesController.T;
                        phm.a aVar = (phm.a) ue0.e.j(commodityAdditionalServicesController.m2()).a().get(l5h.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l5h.a.class, " is not found"));
                        }
                        l5h.a aVar3 = ((l5h.a) aVar2.b()).f;
                        CommodityAdditionalServicesControllerContract$InputData commodityAdditionalServicesControllerContract$InputData = commodityAdditionalServicesController.K;
                        commodityAdditionalServicesControllerContract$InputData.getClass();
                        return new l5h.b(aVar3, commodityAdditionalServicesControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CommodityAdditionalServicesController.T;
                        int i3 = R$id.recyclerView;
                        CommodityAdditionalServicesController commodityAdditionalServicesController2 = this.f242400b;
                        return dli.f.a(commodityAdditionalServicesController2, commodityAdditionalServicesController2.R2(), v.k(commodityAdditionalServicesController2.N, commodityAdditionalServicesController2.O, commodityAdditionalServicesController2.P), i3, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CommodityAdditionalServicesController.T;
                        return (h) ((l5h.b) commodityAdditionalServicesController.Q.getValue()).f192268b.get();
                }
            }
        });
        final int i3 = 2;
        this.S = w.y0(new Function0(this) { // from class: q5h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CommodityAdditionalServicesController f242400b;

            {
                this.f242400b = this;
            }

            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CommodityAdditionalServicesController commodityAdditionalServicesController = this.f242400b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CommodityAdditionalServicesController.T;
                        phm.a aVar = (phm.a) ue0.e.j(commodityAdditionalServicesController.m2()).a().get(l5h.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", l5h.a.class, " is not found"));
                        }
                        l5h.a aVar3 = ((l5h.a) aVar2.b()).f;
                        CommodityAdditionalServicesControllerContract$InputData commodityAdditionalServicesControllerContract$InputData = commodityAdditionalServicesController.K;
                        commodityAdditionalServicesControllerContract$InputData.getClass();
                        return new l5h.b(aVar3, commodityAdditionalServicesControllerContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = CommodityAdditionalServicesController.T;
                        int i32 = R$id.recyclerView;
                        CommodityAdditionalServicesController commodityAdditionalServicesController2 = this.f242400b;
                        return dli.f.a(commodityAdditionalServicesController2, commodityAdditionalServicesController2.R2(), v.k(commodityAdditionalServicesController2.N, commodityAdditionalServicesController2.O, commodityAdditionalServicesController2.P), i32, null, null, null, 56);
                    default:
                        KProperty[] kPropertyArr3 = CommodityAdditionalServicesController.T;
                        return (h) ((l5h.b) commodityAdditionalServicesController.Q.getValue()).f192268b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((j) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (l5h.b) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        NavBarWithToolbar navBarWithToolbar = ((m) value).f174539b;
        Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
        navBarWithToolbar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.wealth_commodity_additional_services_title, null, null, 14);
        navBarWithToolbar.setTitle(textLocalisedClause, null);
        navBarWithToolbar.setToolbarTitle(textLocalisedClause);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.M.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ViewController.P2(this, rd0.e.b(((m) value).f174539b.f59410q), new q5h.e(this, null, 0), 3);
        RowDelegate rowDelegate = this.N;
        ViewController.P2(this, new i(rd0.e.b(rowDelegate.f53218h), 22), new f(this, null), 3);
        ViewController.P2(this, new i(rd0.e.b(rowDelegate.f53226s), 23), new q5h.e(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.P.f52371h.f121375b), new g(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final q5h.h R2() {
        return (q5h.h) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getW() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.R.getValue();
    }
}
