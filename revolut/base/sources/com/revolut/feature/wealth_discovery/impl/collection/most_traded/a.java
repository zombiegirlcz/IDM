package com.revolut.feature.wealth_discovery.impl.collection.most_traded;

import au6.a3;
import bhl.g;
import boh.b;
import boh.m;
import boh.n;
import boh.r;
import boh.u;
import boh.w;
import boh.x;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.wealth_discovery.api.declaration.collection.MostTradedAssetsDestination;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import su9.c;
import vkm.j2;
import vkm.q;
import xzg.b0;
import xzg.d0;
import yji.l;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements m {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d9h.a f96128p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sgh.a f96129q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x f96130r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f96131s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final MostTradedAssetsDestination f96132t;
    public final j2 u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f96133w;

    public a(MostTradedAssetsScreenContract$InputData inputData, c mostTradedAssetsInteractor, d9h.a rateProvider, sgh.a navigationProvider, x disclaimersProvider, b filtersMapper, w stateMapper) {
        b0 b0Var;
        d0 d0Var;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mostTradedAssetsInteractor, "mostTradedAssetsInteractor");
        Intrinsics.checkNotNullParameter(rateProvider, "rateProvider");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(disclaimersProvider, "disclaimersProvider");
        Intrinsics.checkNotNullParameter(filtersMapper, "filtersMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = mostTradedAssetsInteractor;
        this.f96128p = rateProvider;
        this.f96129q = navigationProvider;
        this.f96130r = disclaimersProvider;
        this.f96131s = filtersMapper;
        MostTradedAssetsDestination mostTradedAssetsDestination = inputData.f96125a;
        this.f96132t = mostTradedAssetsDestination;
        wnh.b f96117a = mostTradedAssetsDestination.getF96117a();
        Intrinsics.checkNotNullParameter(f96117a, "<this>");
        int i = boh.a.f17459a[f96117a.ordinal()];
        if (i == 1) {
            b0Var = b0.ONE_DAY;
        } else if (i == 2) {
            b0Var = b0.ONE_WEEK;
        } else if (i == 3) {
            b0Var = b0.ONE_MONTH;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            b0Var = b0.ONE_YEAR;
        }
        wnh.a f96118b = mostTradedAssetsDestination.getF96118b();
        Intrinsics.checkNotNullParameter(f96118b, "<this>");
        int i2 = boh.a.f17460b[f96118b.ordinal()];
        if (i2 == 1) {
            d0Var = d0.MOST_TRADED;
        } else if (i2 == 2) {
            d0Var = d0.MOST_BOUGHT;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            d0Var = d0.MOST_SOLD;
        }
        j2 j2VarC = q.c(new r(b0Var, d0Var));
        this.u = j2VarC;
        this.v = d.b(this, new n(mostTradedAssetsDestination, new Data(null, null, true, 3, null), ((r) j2VarC.getValue()).f17479a, ((r) j2VarC.getValue()).f17480b, null), stateMapper, null, false, 12);
        this.f96133w = e.a(this, new bhi.c(this, 13));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        u uVar = new u(this, continuation, 0);
        j2 j2Var = this.u;
        l.a1(this, j2Var, null, null, uVar, 3);
        l.a1(this, q.Q(j2Var, new a3(continuation, this, 26)), null, null, new u(this, continuation, 1), 3);
        x xVar = this.f96130r;
        xVar.getClass();
        MostTradedAssetsDestination destination = this.f96132t;
        Intrinsics.checkNotNullParameter(destination, "destination");
        l.a1(this, nim.a.v(xVar.f17486a.w0(), new g(destination, 21)), null, null, new u(this, continuation, 2), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f96133w;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
