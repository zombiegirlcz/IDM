package com.revolut.feature.wealth.asset.selection.impl.ui.flow;

import cli.g;
import com.revolut.feature.wealth.asset.selection.api.model.AssetSelectionCategory;
import com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowControllerContract$DomainState;
import com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowControllerContract$InputData;
import com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowControllerContract$Page;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.cash.CashSelectionController;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.cash.CashSelectionControllerContract$InputData;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.instrument.InstrumentSelectionController;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.instrument.InstrumentSelectionControllerContract$InputData;
import e2h.b;
import f2h.e;
import f2h.i;
import f2h.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import yji.l;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements e {

    @NotNull
    public static final f2h.h Companion = new f2h.h();
    public final AssetSelectionFlowControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f95397p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e2h.a f95398q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final cli.h f95399r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ali.b f95400s;

    public a(AssetSelectionFlowControllerContract$InputData inputData, b selectedAssetsDataProvider, e2h.a assetSelectionSearchQueryProvider, k stateMapper) {
        Object next;
        Set set;
        AssetSelectionFlowControllerContract$Page cfd2;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(selectedAssetsDataProvider, "selectedAssetsDataProvider");
        Intrinsics.checkNotNullParameter(assetSelectionSearchQueryProvider, "assetSelectionSearchQueryProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f95397p = selectedAssetsDataProvider;
        this.f95398q = assetSelectionSearchQueryProvider;
        Intrinsics.checkNotNullParameter("TabAssetSelectionFlow", "keyValue");
        Set<AssetSelectionCategory> set2 = inputData.f95391c;
        ArrayList arrayList = new ArrayList(w.t(set2, 10));
        for (AssetSelectionCategory assetSelectionCategory : set2) {
            if (assetSelectionCategory instanceof AssetSelectionCategory.Cash) {
                cfd2 = new AssetSelectionFlowControllerContract$Page.Cash((AssetSelectionCategory.Cash) assetSelectionCategory);
            } else if (assetSelectionCategory instanceof AssetSelectionCategory.Stock) {
                cfd2 = new AssetSelectionFlowControllerContract$Page.Stock((AssetSelectionCategory.Stock) assetSelectionCategory);
            } else if (assetSelectionCategory instanceof AssetSelectionCategory.Etp) {
                cfd2 = new AssetSelectionFlowControllerContract$Page.Etp((AssetSelectionCategory.Etp) assetSelectionCategory);
            } else if (assetSelectionCategory instanceof AssetSelectionCategory.Bond) {
                cfd2 = new AssetSelectionFlowControllerContract$Page.Bond((AssetSelectionCategory.Bond) assetSelectionCategory);
            } else {
                if (!(assetSelectionCategory instanceof AssetSelectionCategory.Cfd)) {
                    throw new NoWhenBranchMatchedException();
                }
                cfd2 = new AssetSelectionFlowControllerContract$Page.Cfd((AssetSelectionCategory.Cfd) assetSelectionCategory);
            }
            arrayList.add(cfd2);
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (it8.hasNext()) {
                next = it8.next();
                if (Intrinsics.f(((AssetSelectionFlowControllerContract$Page) next).x1(), inputData.f)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        AssetSelectionFlowControllerContract$Page assetSelectionFlowControllerContract$Page = (AssetSelectionFlowControllerContract$Page) next;
        String f94249a = assetSelectionFlowControllerContract$Page != null ? assetSelectionFlowControllerContract$Page.getF94249a() : null;
        int i = i.f131792a[inputData.f95390b.ordinal()];
        if (i == 1) {
            set = h0.f322473a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            set = inputData.d;
        }
        AssetSelectionFlowControllerContract$DomainState assetSelectionFlowControllerContract$DomainState = new AssetSelectionFlowControllerContract$DomainState(inputData.f95389a, false, set, f94249a, arrayList);
        final int i2 = 0;
        this.f95399r = d.e(this, "TabAssetSelectionFlow", assetSelectionFlowControllerContract$DomainState, stateMapper, new Function2(this) { // from class: f2h.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.asset.selection.impl.ui.flow.a f131791b;

            {
                this.f131791b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        AssetSelectionFlowControllerContract$DomainState initialState = (AssetSelectionFlowControllerContract$DomainState) obj2;
                        AssetSelectionFlowControllerContract$DomainState restoredState = (AssetSelectionFlowControllerContract$DomainState) obj3;
                        Intrinsics.checkNotNullParameter(initialState, "initialState");
                        Intrinsics.checkNotNullParameter(restoredState, "restoredState");
                        return this.f131791b.f226127l ? restoredState : initialState;
                    default:
                        com.revolut.feature.wealth.asset.selection.impl.ui.flow.a aVar = this.f131791b;
                        AssetSelectionFlowControllerContract$InputData assetSelectionFlowControllerContract$InputData = aVar.o;
                        ali.b PagerCoordinator = (ali.b) obj2;
                        AssetSelectionFlowControllerContract$Page tab2 = (AssetSelectionFlowControllerContract$Page) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(tab2, "tab");
                        if (tab2 instanceof AssetSelectionFlowControllerContract$Page.Cash) {
                            y1h.e eVar = assetSelectionFlowControllerContract$InputData.f95390b;
                            Set set3 = ((AssetSelectionFlowControllerContract$DomainState) ((j2) aVar.f95399r.f22677a).getValue()).f95388c;
                            Set set4 = assetSelectionFlowControllerContract$InputData.e;
                            AssetSelectionCategory.Cash cash = ((AssetSelectionFlowControllerContract$Page.Cash) tab2).f95393a;
                            return new CashSelectionController(new CashSelectionControllerContract$InputData(eVar, set3, set4, cash.f95373a, cash.f95374b));
                        }
                        if (tab2 instanceof AssetSelectionFlowControllerContract$Page.Stock) {
                            return aVar.I2(((AssetSelectionFlowControllerContract$Page.Stock) tab2).f95396a);
                        }
                        if (tab2 instanceof AssetSelectionFlowControllerContract$Page.Etp) {
                            return aVar.I2(((AssetSelectionFlowControllerContract$Page.Etp) tab2).f95395a);
                        }
                        if (tab2 instanceof AssetSelectionFlowControllerContract$Page.Bond) {
                            return aVar.I2(((AssetSelectionFlowControllerContract$Page.Bond) tab2).f95392a);
                        }
                        if (tab2 instanceof AssetSelectionFlowControllerContract$Page.Cfd) {
                            return aVar.I2(((AssetSelectionFlowControllerContract$Page.Cfd) tab2).f95394a);
                        }
                        throw new NoWhenBranchMatchedException();
                }
            }
        }, 8);
        final int i3 = 1;
        this.f95400s = s.b(this, new Function2(this) { // from class: f2h.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.wealth.asset.selection.impl.ui.flow.a f131791b;

            {
                this.f131791b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        AssetSelectionFlowControllerContract$DomainState initialState = (AssetSelectionFlowControllerContract$DomainState) obj2;
                        AssetSelectionFlowControllerContract$DomainState restoredState = (AssetSelectionFlowControllerContract$DomainState) obj3;
                        Intrinsics.checkNotNullParameter(initialState, "initialState");
                        Intrinsics.checkNotNullParameter(restoredState, "restoredState");
                        return this.f131791b.f226127l ? restoredState : initialState;
                    default:
                        com.revolut.feature.wealth.asset.selection.impl.ui.flow.a aVar = this.f131791b;
                        AssetSelectionFlowControllerContract$InputData assetSelectionFlowControllerContract$InputData = aVar.o;
                        ali.b PagerCoordinator = (ali.b) obj2;
                        AssetSelectionFlowControllerContract$Page tab2 = (AssetSelectionFlowControllerContract$Page) obj3;
                        Intrinsics.checkNotNullParameter(PagerCoordinator, "$this$PagerCoordinator");
                        Intrinsics.checkNotNullParameter(tab2, "tab");
                        if (tab2 instanceof AssetSelectionFlowControllerContract$Page.Cash) {
                            y1h.e eVar = assetSelectionFlowControllerContract$InputData.f95390b;
                            Set set3 = ((AssetSelectionFlowControllerContract$DomainState) ((j2) aVar.f95399r.f22677a).getValue()).f95388c;
                            Set set4 = assetSelectionFlowControllerContract$InputData.e;
                            AssetSelectionCategory.Cash cash = ((AssetSelectionFlowControllerContract$Page.Cash) tab2).f95393a;
                            return new CashSelectionController(new CashSelectionControllerContract$InputData(eVar, set3, set4, cash.f95373a, cash.f95374b));
                        }
                        if (tab2 instanceof AssetSelectionFlowControllerContract$Page.Stock) {
                            return aVar.I2(((AssetSelectionFlowControllerContract$Page.Stock) tab2).f95396a);
                        }
                        if (tab2 instanceof AssetSelectionFlowControllerContract$Page.Etp) {
                            return aVar.I2(((AssetSelectionFlowControllerContract$Page.Etp) tab2).f95395a);
                        }
                        if (tab2 instanceof AssetSelectionFlowControllerContract$Page.Bond) {
                            return aVar.I2(((AssetSelectionFlowControllerContract$Page.Bond) tab2).f95392a);
                        }
                        if (tab2 instanceof AssetSelectionFlowControllerContract$Page.Cfd) {
                            return aVar.I2(((AssetSelectionFlowControllerContract$Page.Cfd) tab2).f95394a);
                        }
                        throw new NoWhenBranchMatchedException();
                }
            }
        });
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.f95400s;
    }

    @Override // yji.l
    public final void I1() {
        Set set = ((AssetSelectionFlowControllerContract$DomainState) ((j2) this.f95399r.f22677a).getValue()).f95388c;
        b bVar = this.f95397p;
        bVar.b(set);
        l.a1(this, bVar.d, null, null, new ew1.d(this, null, 21), 3);
    }

    public final InstrumentSelectionController I2(AssetSelectionCategory assetSelectionCategory) {
        AssetSelectionFlowControllerContract$InputData assetSelectionFlowControllerContract$InputData = this.o;
        return new InstrumentSelectionController(new InstrumentSelectionControllerContract$InputData(assetSelectionFlowControllerContract$InputData.f95390b, assetSelectionCategory, ((AssetSelectionFlowControllerContract$DomainState) ((j2) this.f95399r.f22677a).getValue()).f95388c, assetSelectionFlowControllerContract$InputData.e));
    }

    @Override // ali.h, cli.z
    public final g getState() {
        return this.f95399r;
    }
}
