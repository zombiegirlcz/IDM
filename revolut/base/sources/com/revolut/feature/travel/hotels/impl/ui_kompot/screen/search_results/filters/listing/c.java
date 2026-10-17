package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing;

import a31.i;
import cli.y;
import com.revolut.feature.travel.hotels.api.TravelHotelsApi$Toggles;
import efm.r;
import i9g.e0;
import i9g.f0;
import i9g.h0;
import i9g.v;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import l80.e;
import meg.g;
import mk0.f;
import n68.w;
import neg.l;
import neg.n;
import neg.u;
import oki.h;
import p8g.d;
import vkm.j2;
import vkm.q;
import vkm.q0;
import zfi.t;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends h implements n {
    public final i9g.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h0 f94033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final meg.h f94034q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p8g.c f94035r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t1 f94036s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f94037t;
    public final d u;
    public final g81.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vii.b f94038w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f94039x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f94040y;

    public c(cli.n stateMapper, i9g.c filtersInteractor, h0 searchParamsInteractor, meg.h reducer, p8g.c featureInteractor, t1 filtersMerger, e dateProvider, d locationsInteractor, g81.a errorHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(filtersInteractor, "filtersInteractor");
        Intrinsics.checkNotNullParameter(searchParamsInteractor, "searchParamsInteractor");
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        Intrinsics.checkNotNullParameter(featureInteractor, "featureInteractor");
        Intrinsics.checkNotNullParameter(filtersMerger, "filtersMerger");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(locationsInteractor, "locationsInteractor");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        this.o = filtersInteractor;
        this.f94033p = searchParamsInteractor;
        this.f94034q = reducer;
        this.f94035r = featureInteractor;
        this.f94036s = filtersMerger;
        this.f94037t = dateProvider;
        this.u = locationsInteractor;
        this.v = errorHandler;
        this.f94038w = new vii.b();
        this.f94039x = mra.d.b(this, new l(0), stateMapper, null, true, 4);
        this.f94040y = hx7.e.a(this, new n8i.e(this, 9));
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0342, code lost:
    
        if (nim.a.a(r13, r4) == r12) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c r28, java.lang.String r29, dgi.i r30, gim.c r31) {
        /*
            Method dump skipped, instruction units count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c.I2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c, java.lang.String, dgi.i, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r1 == r7) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.revolut.core.ui_kit.models.Style, java.lang.Object, java.util.List, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c r10, java.lang.String r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c.J2(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        boolean zC = ((jte.d) ((v) this.f94035r).f159842a).c(TravelHotelsApi$Toggles.StaysSmartSearch.f93619c);
        h0 h0Var = this.f94033p;
        String str = "";
        if (zC) {
            String str2 = h0Var.d().f114677l;
            if (str2 != null) {
                str = str2;
            }
        } else {
            m70.a.c(t0.f186434a);
        }
        i iVar = new i(str, zC, 8);
        y yVar = this.f94039x;
        H2(yVar, iVar);
        Continuation continuation = null;
        q0 q0VarN = rd0.e.n(q.Q(this.f94038w, new f(continuation, this, 23)), zhm.h0.f322473a);
        r rVarDistinctUntilChanged = h0Var.h().map(new f0(0, new e0(1))).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        yji.l.a1(this, yh5.b.e(q0VarN, rd0.e.b(rVarDistinctUntilChanged), rd0.e.b(this.o.b())), null, null, new u(this, continuation, 0), 3);
        yji.l.a1(this, c8g.a.D(zi0.c.w(yVar.B(new nd8.i(5)))), null, null, new u(this, continuation, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f94040y;
    }

    public final void K2(g gVar) {
        String strC;
        Set set;
        if (gVar instanceof meg.a) {
            strC = ((meg.a) gVar).f204657a;
        } else if (gVar instanceof meg.b) {
            strC = ((meg.b) gVar).f204659a;
        } else if (gVar instanceof meg.f) {
            strC = ((meg.f) gVar).f204669a;
        } else if (gVar instanceof meg.e) {
            strC = ((meg.e) gVar).f204667a;
        } else if (gVar instanceof meg.c) {
            strC = ((meg.c) gVar).f204662a;
        } else {
            if (!(gVar instanceof meg.d)) {
                throw new NoWhenBranchMatchedException();
            }
            strC = ((meg.d) gVar).f204665a.c();
        }
        String str = strC;
        y yVar = this.f94039x;
        zfi.a aVar = ((l) ((j2) yVar.f22677a).getValue()).e;
        this.f94034q.getClass();
        zfi.a newFilters = meg.h.b(aVar, gVar);
        zfi.a aVar2 = ((l) ((j2) yVar.f22677a).getValue()).d;
        Intrinsics.checkNotNullParameter(aVar2, "<this>");
        Intrinsics.checkNotNullParameter(newFilters, "newFilters");
        aim.f builder = new aim.f();
        for (Map.Entry entry : aVar2.f321952b.entrySet()) {
            String str2 = (String) entry.getKey();
            zfi.l lVar = (zfi.l) entry.getValue();
            zfi.l lVar2 = (zfi.l) newFilters.f321952b.get(str2);
            if (lVar2 != null && (set = lVar2.f321981b) != null) {
                Set setH0 = d0.h0(lVar.f321981b, set);
                if (!setH0.isEmpty()) {
                    builder.put(str2, zfi.l.a(lVar, setH0));
                }
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        aim.f checkBoxFilters = builder.b();
        Map map = aVar2.f321951a;
        LinkedHashMap booleanFilters = new LinkedHashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            if (newFilters.f321951a.containsKey((String) entry2.getKey())) {
                booleanFilters.put(entry2.getKey(), entry2.getValue());
            }
        }
        Map map2 = aVar2.f321953c;
        LinkedHashMap radioFilters = new LinkedHashMap();
        for (Map.Entry entry3 : map2.entrySet()) {
            String str3 = (String) entry3.getKey();
            t tVar = (t) entry3.getValue();
            t tVar2 = (t) newFilters.f321953c.get(str3);
            if (Intrinsics.f(tVar2 != null ? tVar2.f322001b : null, tVar.f322001b)) {
                radioFilters.put(entry3.getKey(), entry3.getValue());
            }
        }
        Map map3 = aVar2.d;
        LinkedHashMap priceRangeFilters = new LinkedHashMap();
        for (Map.Entry entry4 : map3.entrySet()) {
            if (newFilters.d.containsKey((String) entry4.getKey())) {
                priceRangeFilters.put(entry4.getKey(), entry4.getValue());
            }
        }
        Intrinsics.checkNotNullParameter(booleanFilters, "booleanFilters");
        Intrinsics.checkNotNullParameter(checkBoxFilters, "checkBoxFilters");
        Intrinsics.checkNotNullParameter(radioFilters, "radioFilters");
        Intrinsics.checkNotNullParameter(priceRangeFilters, "priceRangeFilters");
        H2(yVar, new w(2, str, new zfi.a(booleanFilters, checkBoxFilters, radioFilters, priceRangeFilters), newFilters, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L2() {
        /*
            r5 = this;
            cli.y r0 = r5.f94039x
            java.lang.Object r1 = r0.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r2 = r0.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r1 = r1.getValue()
            neg.l r1 = (neg.l) r1
            com.revolut.data.model.Data r1 = r1.i
            boolean r1 = r1.getLoading()
            if (r1 == 0) goto L19
            return
        L19:
            java.lang.Object r1 = r2.getValue()
            neg.l r1 = (neg.l) r1
            boolean r1 = r1.f214519j
            r3 = 0
            if (r1 == 0) goto L62
            java.lang.Object r1 = r2.getValue()
            neg.l r1 = (neg.l) r1
            java.lang.String r1 = r1.f214517g
            boolean r1 = kotlin.text.d0.W(r1)
            if (r1 != 0) goto L62
            java.lang.Object r1 = r2.getValue()
            neg.l r1 = (neg.l) r1
            java.lang.String r1 = r1.f214517g
            java.lang.Object r4 = r2.getValue()
            neg.l r4 = (neg.l) r4
            java.lang.String r4 = r4.f214518h
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r4)
            if (r1 != 0) goto L62
            java.lang.Object r1 = r2.getValue()
            neg.l r1 = (neg.l) r1
            com.revolut.data.model.Data r1 = r1.i
            java.lang.Object r1 = r1.getContent()
            od0.i r1 = (od0.i) r1
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r1.f224257a
            zfi.a r1 = (zfi.a) r1
            goto L5e
        L5d:
            r1 = r3
        L5e:
            if (r1 != 0) goto L62
            r1 = 1
            goto L63
        L62:
            r1 = 0
        L63:
            if (r1 == 0) goto L6e
            nd8.i r2 = new nd8.i
            r4 = 6
            r2.<init>(r4)
            r5.H2(r0, r2)
        L6e:
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.b r0 = new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.b
            r0.<init>(r1, r5, r3)
            yi5.b r1 = new yi5.b
            r2 = 26
            r1.<init>(r2)
            r5.l2(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c.L2():void");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f94039x;
    }
}
