package com.revolut.feature.wealth.asset.selection.impl.ui.flow;

import ali.g;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import aw0.i;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.Tabs;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.feature.wealth.asset.selection.impl.R$id;
import com.revolut.feature.wealth.asset.selection.impl.R$layout;
import com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowController;
import com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import com.revolut.retail.wealth.resources.R$string;
import efm.r;
import f2h.b;
import f2h.c;
import f2h.e;
import f2h.f;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import te0.w;
import vc.s;
import y1h.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Ly1h/d;", "Lali/g;", "Lf2h/f;", "Lcom/revolut/feature/wealth/asset/selection/impl/ui/flow/AssetSelectionFlowControllerContract$Page;", "Companion", "a", "feature_wealth_asset_selection_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AssetSelectionFlowController extends ViewController<d> implements g {
    public final AssetSelectionFlowControllerContract$InputData K;
    public final h L;
    public final Object M;
    public final Object N;
    public final int O;
    public final Object P;
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(AssetSelectionFlowController.class, "binding", "getBinding()Lcom/revolut/feature/wealth/asset/selection/impl/databinding/FlowAssetSelectionBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowController$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public AssetSelectionFlowController(AssetSelectionFlowControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: f2h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AssetSelectionFlowController f131785b;

            {
                this.f131785b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                AssetSelectionFlowController assetSelectionFlowController = this.f131785b;
                switch (i2) {
                    case 0:
                        AssetSelectionFlowController.Companion companion = AssetSelectionFlowController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(assetSelectionFlowController.m2()).a().get(d2h.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d2h.e.class, " is not found"));
                        }
                        d2h.e eVar = ((d2h.e) aVar2.b()).d;
                        AssetSelectionFlowControllerContract$InputData assetSelectionFlowControllerContract$InputData = assetSelectionFlowController.K;
                        assetSelectionFlowControllerContract$InputData.getClass();
                        return new d2h.a(eVar, assetSelectionFlowControllerContract$InputData);
                    case 1:
                        AssetSelectionFlowController.Companion companion2 = AssetSelectionFlowController.INSTANCE;
                        return (e) ((d2h.a) assetSelectionFlowController.M.getValue()).f.get();
                    default:
                        AssetSelectionFlowController.Companion companion3 = AssetSelectionFlowController.INSTANCE;
                        return mif.a.a(assetSelectionFlowController, 0, R$id.flowAssetSelection_viewPager, assetSelectionFlowController.R2(), 5);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: f2h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AssetSelectionFlowController f131785b;

            {
                this.f131785b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                AssetSelectionFlowController assetSelectionFlowController = this.f131785b;
                switch (i22) {
                    case 0:
                        AssetSelectionFlowController.Companion companion = AssetSelectionFlowController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(assetSelectionFlowController.m2()).a().get(d2h.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d2h.e.class, " is not found"));
                        }
                        d2h.e eVar = ((d2h.e) aVar2.b()).d;
                        AssetSelectionFlowControllerContract$InputData assetSelectionFlowControllerContract$InputData = assetSelectionFlowController.K;
                        assetSelectionFlowControllerContract$InputData.getClass();
                        return new d2h.a(eVar, assetSelectionFlowControllerContract$InputData);
                    case 1:
                        AssetSelectionFlowController.Companion companion2 = AssetSelectionFlowController.INSTANCE;
                        return (e) ((d2h.a) assetSelectionFlowController.M.getValue()).f.get();
                    default:
                        AssetSelectionFlowController.Companion companion3 = AssetSelectionFlowController.INSTANCE;
                        return mif.a.a(assetSelectionFlowController, 0, R$id.flowAssetSelection_viewPager, assetSelectionFlowController.R2(), 5);
                }
            }
        });
        this.O = R$layout.flow_asset_selection;
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: f2h.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AssetSelectionFlowController f131785b;

            {
                this.f131785b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                AssetSelectionFlowController assetSelectionFlowController = this.f131785b;
                switch (i22) {
                    case 0:
                        AssetSelectionFlowController.Companion companion = AssetSelectionFlowController.INSTANCE;
                        phm.a aVar = (phm.a) ue0.e.j(assetSelectionFlowController.m2()).a().get(d2h.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", d2h.e.class, " is not found"));
                        }
                        d2h.e eVar = ((d2h.e) aVar2.b()).d;
                        AssetSelectionFlowControllerContract$InputData assetSelectionFlowControllerContract$InputData = assetSelectionFlowController.K;
                        assetSelectionFlowControllerContract$InputData.getClass();
                        return new d2h.a(eVar, assetSelectionFlowControllerContract$InputData);
                    case 1:
                        AssetSelectionFlowController.Companion companion2 = AssetSelectionFlowController.INSTANCE;
                        return (e) ((d2h.a) assetSelectionFlowController.M.getValue()).f.get();
                    default:
                        AssetSelectionFlowController.Companion companion3 = AssetSelectionFlowController.INSTANCE;
                        return mif.a.a(assetSelectionFlowController, 0, R$id.flowAssetSelection_viewPager, assetSelectionFlowController.R2(), 5);
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        ArrayList arrayList = uiState.f131788b;
        i iVar = uiState.d;
        String str = uiState.f131789c;
        Tabs flowAssetSelectionTabs = d3().d;
        Intrinsics.checkNotNullExpressionValue(flowAssetSelectionTabs, "flowAssetSelectionTabs");
        Tabs.setItems$default(flowAssetSelectionTabs, arrayList, null, 2, null);
        if (str != null) {
            Tabs flowAssetSelectionTabs2 = d3().d;
            Intrinsics.checkNotNullExpressionValue(flowAssetSelectionTabs2, "flowAssetSelectionTabs");
            Tabs.u(flowAssetSelectionTabs2, str, false, false, false, 14);
        }
        d3().f11941c.setHeaderModel(uiState.f131787a);
        ActionFooterView flowAssetSelectionActionFooterView = d3().f11940b;
        Intrinsics.checkNotNullExpressionValue(flowAssetSelectionActionFooterView, "flowAssetSelectionActionFooterView");
        flowAssetSelectionActionFooterView.setVisibility(iVar != null ? 0 : 8);
        if (iVar != null) {
            ActionFooterView flowAssetSelectionActionFooterView2 = d3().f11940b;
            Intrinsics.checkNotNullExpressionValue(flowAssetSelectionActionFooterView2, "flowAssetSelectionActionFooterView");
            flowAssetSelectionActionFooterView2.setModel(iVar);
        }
    }

    @Override // ali.g
    public final void Q1(PagerItem pagerItem) {
        AssetSelectionFlowControllerContract$Page pagerItem2 = (AssetSelectionFlowControllerContract$Page) pagerItem;
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        Intrinsics.checkNotNullParameter(pagerItem2, "pagerItem");
        e eVarR2 = R2();
        String pageId = pagerItem2.getF94249a();
        a aVar = (a) eVarR2;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        aVar.H2(aVar.f95399r, new e2j.i(pageId, 29));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (d2h.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (d2h.a) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().f11941c.setSearchButtonActive(true);
        d3().f11941c.setHint(new TextLocalisedClause(R$string.wealth_stocks_search, null, null, 14));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        ViewController.P2(this, rd0.e.b(d3().d.f58882b), new c(this, continuation, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f11940b.f), new ev7.b(this, null, 14), 3);
        r rVarDebounce = d3().f11941c.I().debounce(400L, TimeUnit.MILLISECONDS);
        f2h.d dVar = f2h.d.f;
        r rVarDistinctUntilChanged = rVarDebounce.map(new dug.e(16)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        ViewController.P2(this, rd0.e.b(rVarDistinctUntilChanged), new c(this, continuation, 1), 3);
    }

    public final b2h.a d3() {
        ViewBinding value = this.L.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (b2h.a) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: e3, reason: merged with bridge method [inline-methods] */
    public final e R2() {
        return (e) this.N.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getK() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (ali.c) this.P.getValue();
    }
}
