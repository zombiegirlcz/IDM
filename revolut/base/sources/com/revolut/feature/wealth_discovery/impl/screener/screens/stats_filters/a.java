package com.revolut.feature.wealth_discovery.impl.screener.screens.stats_filters;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerStatsGroup;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import gc0.c;
import hx7.e;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import jul.o;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qee.s;
import rqh.g;
import soh.f;
import sph.m;
import vii.b;
import vkm.j2;
import vkm.q;
import vph.d;
import w4l.j;
import yji.l;
import yph.i;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements g {
    public final ScreenerStatsFiltersControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o f96280p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vph.o f96281q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f96282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f96283s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f96284t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j2 f96285w;

    public a(ScreenerStatsFiltersControllerContract$InputData inputData, s stateMapper, o filtersProvider, vph.o selectedFilterReducer, m screenerInfoDialogMapper, d filterInfoDescriptorProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(filtersProvider, "filtersProvider");
        Intrinsics.checkNotNullParameter(selectedFilterReducer, "selectedFilterReducer");
        Intrinsics.checkNotNullParameter(screenerInfoDialogMapper, "screenerInfoDialogMapper");
        Intrinsics.checkNotNullParameter(filterInfoDescriptorProvider, "filterInfoDescriptorProvider");
        this.o = inputData;
        this.f96280p = filtersProvider;
        this.f96281q = selectedFilterReducer;
        this.f96282r = screenerInfoDialogMapper;
        this.f96283s = filterInfoDescriptorProvider;
        this.f96284t = new b(j.f294644c);
        ScreenerStatsGroup screenerStatsGroup = inputData.f96276b;
        Data data = new Data(null, null, true, 3, null);
        List list = inputData.f96277c;
        int iB = q0.b(w.t(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : list) {
            linkedHashMap.put(((ScreenerSelectedFilter) obj2).getF105167a(), obj2);
        }
        this.u = mra.d.b(this, new rqh.h(screenerStatsGroup, data, linkedHashMap), stateMapper, null, false, 12);
        this.v = e.a(this, new rl8.d(this, 13));
        this.f96285w = q.c(this.o.f96276b);
    }

    @Override // yph.h
    public final void H(yph.j parcel, Pair updatedRange) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Intrinsics.checkNotNullParameter(updatedRange, "updatedRange");
        f fVar = parcel.f315903b;
        zel.g gVar = parcel.f315902a;
        BigDecimal bigDecimal = fVar.f264838c;
        int iG = c.g(fVar.f264836a, bigDecimal);
        int iG2 = c.g(fVar.f264837b, bigDecimal);
        int iIntValue = ((Number) updatedRange.f186385a).intValue();
        int iIntValue2 = ((Number) updatedRange.f186386b).intValue();
        this.f96281q.getClass();
        H2(this.u, new rgf.m(parcel, vph.o.b(gVar, bigDecimal, iG, iG2, iIntValue, iIntValue2), 24));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.f96284t, new r3k.c(continuation, this, 10)), null, new rk9.d(this, continuation, 21), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }

    @Override // yph.h
    public final void r(i option) {
        Intrinsics.checkNotNullParameter(option, "option");
        y yVar = this.u;
        ScreenerSelectedFilter screenerSelectedFilter = (ScreenerSelectedFilter) ((rqh.h) ((j2) yVar.f22677a).getValue()).f256543c.get(option.f315900a);
        ScreenerSelectedFilter.Options options = screenerSelectedFilter instanceof ScreenerSelectedFilter.Options ? (ScreenerSelectedFilter.Options) screenerSelectedFilter : null;
        List list = options != null ? options.f105166b : null;
        zel.g gVar = option.f315900a;
        String str = option.f315901b;
        this.f96281q.getClass();
        H2(yVar, new rgf.m(option, vph.o.a(gVar, list, str), 25));
    }
}
