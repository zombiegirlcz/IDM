package com.revolut.feature.store.impl.ui.home;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.store.api.declaration.StoreApi$Toggles$StoreDealsAndBrands;
import com.revolut.feature.store.api.declaration.StoreApi$Toggles$StoreExclusives;
import com.revolut.feature.store.api.navigation.StoreTab;
import com.revolut.feature.store.impl.ui.home.StoreHomeFlowContract$PagerItem;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import g2e.e;
import h30.q;
import i2l.n0;
import i3e.f;
import i3e.g;
import i3e.m;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jte.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import oki.h;
import vkm.j2;
import yji.l;
import zhm.d0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends h implements f {
    public final StoreHomeFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g2e.b f88702p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f88703q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mub.b f88704r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f88705s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f88706t;
    public final ali.b u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public b(c stateMapper, StoreHomeFlowContract$InputData inputData, q storeAvailabilityInteractor, g2e.b filtersStateRepository, e exclusivesFiltersStateRepository, mub.b revPointsPillControllerModelExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(storeAvailabilityInteractor, "storeAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(filtersStateRepository, "filtersStateRepository");
        Intrinsics.checkNotNullParameter(exclusivesFiltersStateRepository, "exclusivesFiltersStateRepository");
        Intrinsics.checkNotNullParameter(revPointsPillControllerModelExtension, "revPointsPillControllerModelExtension");
        this.o = inputData;
        this.f88702p = filtersStateRepository;
        this.f88703q = exclusivesFiltersStateRepository;
        this.f88704r = revPointsPillControllerModelExtension;
        gte.a aVar = (gte.a) storeAvailabilityInteractor.f148941b;
        StoreApi$Toggles$StoreDealsAndBrands storeApi$Toggles$StoreDealsAndBrands = StoreApi$Toggles$StoreDealsAndBrands.f88420c;
        StoreHomeFlowContract$PagerItem.Deals deals = ((d) aVar).c(storeApi$Toggles$StoreDealsAndBrands) ? StoreHomeFlowContract$PagerItem.Deals.f88696a : null;
        StoreApi$Toggles$StoreExclusives storeApi$Toggles$StoreExclusives = StoreApi$Toggles$StoreExclusives.f88421c;
        StoreHomeFlowContract$PagerItem[] elements = {deals, ((d) aVar).c(storeApi$Toggles$StoreExclusives) ? StoreHomeFlowContract$PagerItem.Exclusives.f88697a : null, ((d) aVar).c(storeApi$Toggles$StoreDealsAndBrands) ? StoreHomeFlowContract$PagerItem.Brands.f88695a : null, (((d) aVar).c(storeApi$Toggles$StoreExclusives) || ((jwb.c) ((svb.a) storeAvailabilityInteractor.d)).a()) ? StoreHomeFlowContract$PagerItem.YourItems.f88698a : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        this.f88705s = listL;
        this.f88706t = mra.d.b(this, new g(new Data(null, null, true, 3, null), I2(inputData.f88692a), listL, !((g2e.c) filtersStateRepository).a().b()), stateMapper, null, false, 12);
        this.u = s.b(this, new hw9.b(this, 24));
        this.v = hx7.e.a(this, new n0(3));
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.u;
    }

    @Override // yji.l
    public final void I1() {
        Object value;
        g2e.a aVarA;
        String filterQuery = this.o.f88693b;
        g2e.b bVar = this.f88702p;
        if (filterQuery != null) {
            g2e.c cVar = (g2e.c) bVar;
            cVar.getClass();
            Intrinsics.checkNotNullParameter(filterQuery, "filterQuery");
            j2 j2Var = cVar.f139974a;
            do {
                value = j2Var.getValue();
                aVarA = (g2e.a) value;
                if (aVarA.b()) {
                    aVarA = g2e.a.a(u.c(filterQuery), aVarA.f139972b);
                }
            } while (!j2Var.h(value, aVarA));
        }
        l.a1(this, vkm.q.h(((g2e.c) bVar).f139974a), null, null, new m(this, null, 0), 3);
        l.a1(this, rd0.e.b(((lzb.a) this.f88704r).Z2()), null, null, new m(this, null, 1), 3);
    }

    public final String I2(StoreTab storeTab) {
        PagerItem pagerItem;
        boolean zF = Intrinsics.f(storeTab, StoreTab.Deals.f88623a);
        StoreHomeFlowContract$PagerItem.Deals deals = StoreHomeFlowContract$PagerItem.Deals.f88696a;
        if (zF) {
            pagerItem = deals;
        } else if (Intrinsics.f(storeTab, StoreTab.Exclusives.f88624a)) {
            pagerItem = StoreHomeFlowContract$PagerItem.Exclusives.f88697a;
        } else if (Intrinsics.f(storeTab, StoreTab.Brands.f88622a)) {
            pagerItem = StoreHomeFlowContract$PagerItem.Brands.f88695a;
        } else {
            if (!Intrinsics.f(storeTab, StoreTab.YourItems.f88625a)) {
                throw new NoWhenBranchMatchedException();
            }
            pagerItem = StoreHomeFlowContract$PagerItem.YourItems.f88698a;
        }
        String f79006a = pagerItem.getF79006a();
        List list = this.f88705s;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                if (((StoreHomeFlowContract$PagerItem) it8.next()).getF79006a().equals(f79006a)) {
                    return f79006a;
                }
            }
        }
        StoreHomeFlowContract$PagerItem storeHomeFlowContract$PagerItem = (StoreHomeFlowContract$PagerItem) d0.d0(list);
        return storeHomeFlowContract$PagerItem != null ? storeHomeFlowContract$PagerItem.getF79006a() : deals.getF79006a();
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // yji.l
    public final void K1() {
        Object value;
        Object value2;
        j2 j2Var = ((g2e.c) this.f88702p).f139974a;
        do {
            value = j2Var.getValue();
        } while (!j2Var.h(value, new g2e.a(0)));
        j2 j2Var2 = this.f88703q.f139981a;
        do {
            value2 = j2Var2.getValue();
        } while (!j2Var2.h(value2, h0.f322473a));
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f88706t;
    }
}
