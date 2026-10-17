package com.revolut.feature.store.impl.ui.brand_detail.flow;

import ali.g;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import au0.c1;
import au0.r0;
import au0.s0;
import au0.u0;
import au0.z0;
import aw0.i;
import aw0.s8;
import cli.o;
import cli.q;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithBigTile;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.store.impl.R$id;
import com.revolut.feature.store.impl.R$layout;
import com.revolut.feature.store.impl.ui.brand_detail.flow.StoreBrandDetailFlow;
import com.revolut.feature.store.impl.ui.brand_detail.flow.StoreBrandDetailFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jmrtd.lds.LDSFile;
import q2e.j;
import q2e.k;
import q2e.l;
import q2e.m;
import q2e.n;
import q2e.p;
import q2e.r;
import te0.w;
import vc.s;
import xki.e;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/store/impl/ui/brand_detail/flow/StoreBrandDetailFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lq2e/j;", "Lali/g;", "Lq2e/s;", "Lcom/revolut/feature/store/impl/ui/brand_detail/flow/StoreBrandDetailFlowContract$PagerItem;", "Lc2e/b;", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StoreBrandDetailFlow extends ViewController<j> implements g, c2e.b {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(StoreBrandDetailFlow.class, "binding", "getBinding()Lcom/revolut/feature/store/impl/databinding/FlowStoreBrandDetailBinding;", 0))};
    public final StoreBrandDetailFlowContract$InputData K;
    public final h L;
    public final int M;
    public final Object N;
    public final Object O;
    public final Object P;

    public StoreBrandDetailFlow(StoreBrandDetailFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, q2e.c.f);
        this.M = R$layout.flow_store_brand_detail;
        final int i = 0;
        this.N = w.y0(new Function0(this) { // from class: q2e.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandDetailFlow f241568b;

            {
                this.f241568b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                StoreBrandDetailFlow storeBrandDetailFlow = this.f241568b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = StoreBrandDetailFlow.Q;
                        return (g) ((k2e.d) storeBrandDetailFlow.P.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = StoreBrandDetailFlow.Q;
                        return mif.a.a(storeBrandDetailFlow, 0, R$id.flowStoreBrandDetail_pager, storeBrandDetailFlow.d(), 5);
                    default:
                        KProperty[] kPropertyArr3 = StoreBrandDetailFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(storeBrandDetailFlow.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                        }
                        k2e.j jVar = ((k2e.j) aVar2.b()).f180521r;
                        StoreBrandDetailFlowContract$InputData storeBrandDetailFlowContract$InputData = storeBrandDetailFlow.K;
                        storeBrandDetailFlowContract$InputData.getClass();
                        return new k2e.d(jVar, storeBrandDetailFlowContract$InputData);
                }
            }
        });
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: q2e.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandDetailFlow f241568b;

            {
                this.f241568b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                StoreBrandDetailFlow storeBrandDetailFlow = this.f241568b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StoreBrandDetailFlow.Q;
                        return (g) ((k2e.d) storeBrandDetailFlow.P.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = StoreBrandDetailFlow.Q;
                        return mif.a.a(storeBrandDetailFlow, 0, R$id.flowStoreBrandDetail_pager, storeBrandDetailFlow.d(), 5);
                    default:
                        KProperty[] kPropertyArr3 = StoreBrandDetailFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(storeBrandDetailFlow.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                        }
                        k2e.j jVar = ((k2e.j) aVar2.b()).f180521r;
                        StoreBrandDetailFlowContract$InputData storeBrandDetailFlowContract$InputData = storeBrandDetailFlow.K;
                        storeBrandDetailFlowContract$InputData.getClass();
                        return new k2e.d(jVar, storeBrandDetailFlowContract$InputData);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: q2e.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StoreBrandDetailFlow f241568b;

            {
                this.f241568b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                StoreBrandDetailFlow storeBrandDetailFlow = this.f241568b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = StoreBrandDetailFlow.Q;
                        return (g) ((k2e.d) storeBrandDetailFlow.P.getValue()).i.get();
                    case 1:
                        KProperty[] kPropertyArr2 = StoreBrandDetailFlow.Q;
                        return mif.a.a(storeBrandDetailFlow, 0, R$id.flowStoreBrandDetail_pager, storeBrandDetailFlow.d(), 5);
                    default:
                        KProperty[] kPropertyArr3 = StoreBrandDetailFlow.Q;
                        phm.a aVar = (phm.a) ue0.e.j(storeBrandDetailFlow.m2()).a().get(k2e.j.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k2e.j.class, " is not found"));
                        }
                        k2e.j jVar = ((k2e.j) aVar2.b()).f180521r;
                        StoreBrandDetailFlowContract$InputData storeBrandDetailFlowContract$InputData = storeBrandDetailFlow.K;
                        storeBrandDetailFlowContract$InputData.getClass();
                        return new k2e.d(jVar, storeBrandDetailFlowContract$InputData);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        q2e.s uiState = (q2e.s) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        p pVar = uiState.f241619b;
        k kVar = uiState.f241618a;
        if (pVar instanceof r) {
            Tabs flowStoreBrandDetailTabs = d3().e;
            Intrinsics.checkNotNullExpressionValue(flowStoreBrandDetailTabs, "flowStoreBrandDetailTabs");
            flowStoreBrandDetailTabs.setVisibility(0);
            d3().e.setItems(((r) pVar).f241615a, uiState.f241620c);
        } else {
            if (!(pVar instanceof q2e.q)) {
                throw new NoWhenBranchMatchedException();
            }
            Tabs flowStoreBrandDetailTabs2 = d3().e;
            Intrinsics.checkNotNullExpressionValue(flowStoreBrandDetailTabs2, "flowStoreBrandDetailTabs");
            flowStoreBrandDetailTabs2.setVisibility(8);
        }
        NavBarWithBigTile navBarWithBigTile = d3().f148796c;
        q2e.o oVar2 = kVar.f241594a;
        if (oVar2 instanceof n) {
            navBarWithBigTile.setVisibility(0);
            navBarWithBigTile.setLoadingState(true);
            navBarWithBigTile.setToolbarTitle(null);
        } else if (oVar2 instanceof m) {
            navBarWithBigTile.setVisibility(8);
            navBarWithBigTile.setLoadingState(false);
            navBarWithBigTile.setActionStatusLabel(null);
            navBarWithBigTile.setAvatar(null, r0.DEFAULT);
            c1.S(navBarWithBigTile, f0.f322471a, null, null, 6);
            navBarWithBigTile.setToolbarTitle(null);
        } else {
            if (!(oVar2 instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            navBarWithBigTile.setVisibility(0);
            navBarWithBigTile.setLoadingState(false);
            l lVar = (l) oVar2;
            z0 z0Var = lVar.f241596a;
            UrlImage urlImage = lVar.f241597b;
            CircleIconBadge circleIconBadge = lVar.d;
            navBarWithBigTile.setAvatar(new AvatarModel.Default(urlImage, null, null, null, circleIconBadge != null ? new AvatarModel.BadgeModel(circleIconBadge, com.revolut.core.ui_kit.models.avatar.b.BOTTOM) : null, null, LDSFile.EF_DG14_TAG), r0.DEFAULT);
            c1.S(navBarWithBigTile, u.c(new u0(new NavBarWithContainerBackground.ImageBackground(lVar.f241598c, (s8) null, (Color.SolidRes) null, 14), z0Var, null, null)), null, null, 6);
            navBarWithBigTile.setToolbarTitle(z0Var.f9448a);
        }
        navBarWithBigTile.setMenuItems(kVar.f241595b);
        ActionFooterView actionFooterView = d3().f148795b;
        i iVar = uiState.d;
        actionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            actionFooterView.setModel(iVar);
        }
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return new AnalyticsProduct.Retail(super.f0());
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        StoreBrandDetailFlowContract$PagerItem pagerItem2 = (StoreBrandDetailFlowContract$PagerItem) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        c cVar = (c) d();
        cVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        cVar.H2(cVar.T, new q03.h(pagerItem2, 9));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (k2e.d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (k2e.d) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setUserInputEnabled(false);
        Tabs tabs = d3().e;
        Context context = tabs.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorBackground, context);
        tabs.setBackgroundColor(iS);
        tabs.setBackgroundTintList(ColorStateList.valueOf(iS));
        NavBarWithBigTile navBarWithBigTile = d3().f148796c;
        navBarWithBigTile.setNavigationButtonIcon(new ResourceImage(ofm.q.k(q2()), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        navBarWithBigTile.setLayoutType(s0.LEFT_ALIGNED);
        navBarWithBigTile.setIconClickable(false);
        navBarWithBigTile.setThemeBasedColorSchemeEnabled(true);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f148796c.f59357t), new q2e.d(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f148796c.b()), new q2e.e(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().e.f58882b), new q2e.e(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f148795b.f), new q2e.d(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(d3().f148795b.f58955g), new q2e.d(this, null, 2), 3);
    }

    public final h2e.a d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (h2e.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final q2e.g d() {
        return (q2e.g) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.O.getValue();
    }
}
