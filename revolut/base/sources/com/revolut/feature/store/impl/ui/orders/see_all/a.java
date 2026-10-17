package com.revolut.feature.store.impl.ui.orders.see_all;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.store.impl.ui.orders.see_all.StoreOrdersSeeAllContract$InputData;
import ihm.f;
import k25.o;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lhk.a0;
import lk0.g;
import mz3.r;
import n33.i2;
import n33.v0;
import n3e.b;
import n3e.c;
import n3e.d;
import n3e.e;
import n3e.m;
import oki.h;
import vkm.q;
import yhm.j;
import yji.l;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements e {
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jwb.e f88717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l80.e f88718q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final StoreOrdersSeeAllContract$InputData f88719r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f88720s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Lazy f88721t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    public a(m stateMapper, b pagingInteractor, jwb.e revPointsGiftcardsInteractor, l80.e dateProvider, StoreOrdersSeeAllContract$InputData inputData) {
        d dVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pagingInteractor, "pagingInteractor");
        Intrinsics.checkNotNullParameter(revPointsGiftcardsInteractor, "revPointsGiftcardsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = pagingInteractor;
        this.f88717p = revPointsGiftcardsInteractor;
        this.f88718q = dateProvider;
        this.f88719r = inputData;
        this.f88720s = v0.a.d("create(...)");
        this.f88721t = j.b(new n08.b(26));
        if (Intrinsics.f(inputData, StoreOrdersSeeAllContract$InputData.Orders.f88715a)) {
            f0 f0Var = f0.f322471a;
            b.Companion.getClass();
            dVar = new d(new g(u.c(new lk0.e(f0Var, n3e.a.f211989b, true, null, null, 24))), (Data) null, 6);
        } else {
            if (!(inputData instanceof StoreOrdersSeeAllContract$InputData.GiftCards)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = new d((g) null, new Data(null, null, true, 3, null), 5);
        }
        this.u = mra.d.b(this, dVar, stateMapper, null, false, 12);
        this.v = hx7.e.a(this, new r(this, 12));
    }

    @Override // yji.l
    public final void I1() {
        StoreOrdersSeeAllContract$InputData.Orders orders = StoreOrdersSeeAllContract$InputData.Orders.f88715a;
        StoreOrdersSeeAllContract$InputData storeOrdersSeeAllContract$InputData = this.f88719r;
        Continuation continuation = null;
        if (!Intrinsics.f(storeOrdersSeeAllContract$InputData, orders)) {
            if (!(storeOrdersSeeAllContract$InputData instanceof StoreOrdersSeeAllContract$InputData.GiftCards)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((StoreOrdersSeeAllContract$InputData.GiftCards) storeOrdersSeeAllContract$InputData).f88714a;
            l.a1(this, rd0.e.n(q.Q((vii.b) this.f88721t.getValue(), new o(continuation, this, str, 18)), h0.f322473a), null, null, new a0(this, str, continuation, 16), 3);
            return;
        }
        efm.r rVarFilter = ((c) this.o).f211991b.hide().filter(new i2(25, new v0(10)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        l.a1(this, rd0.e.b(rVarFilter), null, null, new mx5.g(this, continuation, 16), 3);
        l2(new mci.e(this, continuation, 29), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (this.f88719r instanceof StoreOrdersSeeAllContract$InputData.GiftCards) {
            ((vii.b) this.f88721t.getValue()).a();
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
