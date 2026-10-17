package com.revolut.feature.global_markets.impl.ui.flow.index_details;

import ael.k;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.global_markets.impl.ui.flow.index_details.IndexDetailsFlowContract$PagerItem;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import e54.r;
import e87.c;
import e87.g;
import ecm.q;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import md6.s;
import mra.d;
import oki.h;
import rd0.e;
import vkm.v1;
import yji.l;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements c {
    public final IndexDetailsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q f74590p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.b f74591q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u1d.a f74592r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f74593s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f74594t;
    public final ali.b u;

    public b(n stateMapper, IndexDetailsFlowContract$InputData inputData, q indexDetailsInteractor, ybl.b instrumentTickerInteractor, u1d.a watchlistExtension, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(indexDetailsInteractor, "indexDetailsInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(watchlistExtension, "watchlistExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f74590p = indexDetailsInteractor;
        this.f74591q = instrumentTickerInteractor;
        this.f74592r = watchlistExtension;
        this.f74593s = featureToggleInteractor;
        String str = inputData.f74582a;
        String str2 = inputData.f74583b;
        IndexDetailsFlowContract$PagerItem.OverviewItem overviewItem = IndexDetailsFlowContract$PagerItem.OverviewItem.f74585a;
        this.f74594t = d.b(this, new a(str, str2, u.c(overviewItem), overviewItem.getF70838b(), null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.u = s.b(this, new r(this, 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable I2(com.revolut.feature.global_markets.impl.ui.flow.index_details.b r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof e87.f
            if (r0 == 0) goto L13
            r0 = r5
            e87.f r0 = (e87.f) r0
            int r1 = r0.f123615w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f123615w = r1
            goto L18
        L13:
            e87.f r0 = new e87.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f123615w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            ecm.q r5 = r4.f74590p
            com.revolut.feature.global_markets.impl.ui.flow.index_details.IndexDetailsFlowContract$InputData r4 = r4.o
            java.lang.String r4 = r4.f74582a
            vkm.d r4 = r5.k(r4)
            r0.f123615w = r3
            java.lang.Object r5 = vkm.q.z(r4, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            if (r5 == 0) goto L56
            java.lang.Object r4 = r5.getContent()
            k77.i r4 = (k77.i) r4
            if (r4 == 0) goto L56
            xi0.b r4 = r4.f181836c
            if (r4 == 0) goto L56
            return r4
        L56:
            xi0.a r4 = xi0.b.Companion
            r4.getClass()
            xi0.b r4 = xi0.b.i
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.global_markets.impl.ui.flow.index_details.b.I2(com.revolut.feature.global_markets.impl.ui.flow.index_details.b, gim.c):java.io.Serializable");
    }

    public static String J2(String str) {
        return j6.a.q("I:", str);
    }

    @Override // ali.h
    public final ali.b I0() {
        return this.u;
    }

    @Override // yji.l
    public final void T1(long j2) {
        vkm.y yVarD;
        IndexDetailsFlowContract$InputData indexDetailsFlowContract$InputData = this.o;
        Continuation continuation = null;
        l.b1(this, com.revolut.data.database.models.openbanking.d.y("IndexDetailsFlowModel", "observeIndexDetails", this.f74590p.k(indexDetailsFlowContract$InputData.f74582a)), null, new g(this, continuation, 0), 3);
        l.b1(this, com.revolut.data.database.models.openbanking.d.x("IndexDetailsFlowModel", "observeInstrumentTicker", ((k) this.f74591q).p(indexDetailsFlowContract$InputData.f74582a, w4l.h.f294642c, n9l.b.SEC_3.a())), null, new g(this, continuation, 1), 3);
        if (((jte.d) this.f74593s).c(FeatureWealthApi$Toggles.MultipleWatchlists.f95167c)) {
            yVarD = e.d(vkm.q.Q(new v1(new e38.c(this, continuation, 6)), new dz6.n(continuation, this, 6)), y0.b(new Pair("IndexDetails", "observeIsInWatchlist")));
        } else {
            y1d.b.Companion.getClass();
            yVarD = e.d(this.f74592r.d3(y1d.a.f310362j, J2(indexDetailsFlowContract$InputData.f74583b)), y0.b(new Pair("IndexDetails", "observeIsInWatchlist")));
        }
        l.a1(this, yVarD, null, null, new a2g.q(this, continuation, 12), 3);
    }

    @Override // ali.h, cli.z
    public final cli.g getState() {
        return this.f74594t;
    }
}
