package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.b1;
import au0.r0;
import au0.s0;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ExpandableCellDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details.CustomAssetDetailsController;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import java.util.List;
import jii.d0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ppd.u0;
import ppd.v;
import srd.b;
import srd.c;
import srd.d;
import srd.e;
import srd.f;
import srd.i;
import srd.j;
import srd.k;
import srd.l;
import te0.w;
import tx0.p2;
import vc.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/spending_analytics/impl/ui/rev10/total_wealth/custom_asset_details/CustomAssetDetailsController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lsrd/e;", "Ldli/a;", "Lsrd/f;", "feature_spending_analytics_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomAssetDetailsController extends ViewController<e> implements a {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(CustomAssetDetailsController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarwithbigtileBinding;", 0))};
    public final c K;
    public final int L;
    public final h M;
    public final CellDetailsDelegate N;
    public final ExpandableCellDelegate O;
    public final RowDelegate P;
    public final TextDelegate Q;
    public final Object R;
    public final Object S;
    public final Object T;

    public CustomAssetDetailsController(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbarwithbigtile;
        this.M = s.t(this, srd.h.f);
        this.N = new CellDetailsDelegate();
        this.O = new ExpandableCellDelegate();
        this.P = new RowDelegate(null, null, 7);
        this.Q = new TextDelegate();
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: srd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomAssetDetailsController f265174b;

            {
                this.f265174b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                CustomAssetDetailsController customAssetDetailsController = this.f265174b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = CustomAssetDetailsController.U;
                        qji.b bVarU2 = customAssetDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details.di.CustomAssetDetailsInjector");
                        u0 u0Var = (u0) bVarU2;
                        ppd.n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        c cVar = customAssetDetailsController.K;
                        cVar.getClass();
                        return new v(nVar, u0Var2, cVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CustomAssetDetailsController.U;
                        return (d) ((v) customAssetDetailsController.R.getValue()).f238561b.get();
                    default:
                        KProperty[] kPropertyArr3 = CustomAssetDetailsController.U;
                        CustomAssetDetailsController customAssetDetailsController2 = this.f265174b;
                        return dli.f.a(customAssetDetailsController2, customAssetDetailsController2.R2(), zhm.v.k(customAssetDetailsController2.N, customAssetDetailsController2.O, customAssetDetailsController2.P, customAssetDetailsController2.Q), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: srd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomAssetDetailsController f265174b;

            {
                this.f265174b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                CustomAssetDetailsController customAssetDetailsController = this.f265174b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomAssetDetailsController.U;
                        qji.b bVarU2 = customAssetDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details.di.CustomAssetDetailsInjector");
                        u0 u0Var = (u0) bVarU2;
                        ppd.n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        c cVar = customAssetDetailsController.K;
                        cVar.getClass();
                        return new v(nVar, u0Var2, cVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CustomAssetDetailsController.U;
                        return (d) ((v) customAssetDetailsController.R.getValue()).f238561b.get();
                    default:
                        KProperty[] kPropertyArr3 = CustomAssetDetailsController.U;
                        CustomAssetDetailsController customAssetDetailsController2 = this.f265174b;
                        return dli.f.a(customAssetDetailsController2, customAssetDetailsController2.R2(), zhm.v.k(customAssetDetailsController2.N, customAssetDetailsController2.O, customAssetDetailsController2.P, customAssetDetailsController2.Q), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                }
            }
        });
        final int i3 = 2;
        this.T = w.y0(new Function0(this) { // from class: srd.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CustomAssetDetailsController f265174b;

            {
                this.f265174b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                CustomAssetDetailsController customAssetDetailsController = this.f265174b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = CustomAssetDetailsController.U;
                        qji.b bVarU2 = customAssetDetailsController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details.di.CustomAssetDetailsInjector");
                        u0 u0Var = (u0) bVarU2;
                        ppd.n nVar = u0Var.f238558b;
                        u0 u0Var2 = u0Var.f238559c;
                        c cVar = customAssetDetailsController.K;
                        cVar.getClass();
                        return new v(nVar, u0Var2, cVar);
                    case 1:
                        KProperty[] kPropertyArr2 = CustomAssetDetailsController.U;
                        return (d) ((v) customAssetDetailsController.R.getValue()).f238561b.get();
                    default:
                        KProperty[] kPropertyArr3 = CustomAssetDetailsController.U;
                        CustomAssetDetailsController customAssetDetailsController2 = this.f265174b;
                        return dli.f.a(customAssetDetailsController2, customAssetDetailsController2.R2(), zhm.v.k(customAssetDetailsController2.N, customAssetDetailsController2.O, customAssetDetailsController2.P, customAssetDetailsController2.Q), R$id.screenRecyclerNavBarWithBigTile_recyclerView, null, null, null, 56);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        a.z0(uiState);
        b bVar = uiState.f265171b;
        List<ActionsView.Item> list = uiState.f265172c;
        NavBarWithBigTile navBarWithBigTile = d3().f174510b;
        navBarWithBigTile.setIcon(bVar.f265163a, r0.BLURRED_BACKGROUND);
        TextClause textClause = bVar.f265164b;
        navBarWithBigTile.setToolbarTitle(textClause);
        navBarWithBigTile.setTitle(textClause);
        navBarWithBigTile.setDescription(new au0.o0(bVar.f265165c));
        navBarWithBigTile.setActions(list);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (v) this.R.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarWithBigTile navBarWithBigTile = d3().f174510b;
        navBarWithBigTile.setLayoutType(s0.CENTERED_SMALL_BUTTONS);
        navBarWithBigTile.setTitleStyle(b1.LARGE_SINGLE_LINE);
        Continuation continuation = null;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setHeightMode(p2.f275222a);
        navBarWithBigTile.setIconClickable(false);
        NavBarWithBigTile navBarWithBigTile2 = d3().f174510b;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile2.f59357t), null, new se4.c(this, continuation, 18), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(navBarWithBigTile2.K()), null, new i(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.N.e), null, new j(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.O.f52255c), null, new k(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.P.f53218h), null, new l(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(this.Q.d), null, new sek.q(this, continuation, 18), 3);
    }

    public final d0 d3() {
        ViewBinding value = this.M.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (d0) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final d R2() {
        return (d) this.S.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.T.getValue();
    }
}
