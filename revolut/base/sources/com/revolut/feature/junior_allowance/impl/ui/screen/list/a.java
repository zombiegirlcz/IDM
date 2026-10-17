package com.revolut.feature.junior_allowance.impl.ui.screen.list;

import a3e.u;
import ang.f;
import cli.y;
import com.revolut.data.model.Data;
import ec8.g;
import ec8.i;
import ec8.k;
import ec8.l;
import ec8.m;
import ec8.n;
import ec8.o;
import ec8.p;
import hx7.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import om4.d0;
import vii.b;
import vkm.q;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends h implements i {
    public final ec8.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f76846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hj8.a f76847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ao.h f76848r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d0 f76849s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f76850t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b f76851w;

    public a(u stateMapper, ec8.h inputData, f userInteractor, hj8.a juniorProfileInteractor, ao.h juniorCoparentInteractor, d0 juniorAllowancesInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        Intrinsics.checkNotNullParameter(juniorAllowancesInteractor, "juniorAllowancesInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f76846p = userInteractor;
        this.f76847q = juniorProfileInteractor;
        this.f76848r = juniorCoparentInteractor;
        this.f76849s = juniorAllowancesInteractor;
        this.f76850t = featureToggleInteractor;
        this.u = d.b(this, new g(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.v = e.a(this, new e6e.a(21));
        this.f76851w = new b();
    }

    public static final ec8.f I2(a aVar, List list, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((nb8.b) obj2).k == null) {
                arrayList.add(obj2);
            } else {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (Intrinsics.f(((nb8.b) obj3).f214010h.f214013a, str)) {
                arrayList3.add(obj3);
            } else {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (((nb8.b) obj4).f214007b == nb8.f.ACTIVE) {
                arrayList5.add(obj4);
            }
        }
        List listP0 = zhm.d0.P0(arrayList5, new a9j.f(new k(), 27));
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : arrayList) {
            if (((nb8.b) obj5).f214007b == nb8.f.INACTIVE) {
                arrayList6.add(obj5);
            }
        }
        return new ec8.f(listP0, zhm.d0.P0(arrayList6, new l()), zhm.d0.P0(arrayList4, new m()), zhm.d0.P0(arrayList3, new n()));
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f76851w, new o(0, this, continuation)), null, null, new p(0, this, continuation), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, q.Q(this.f76851w, new o(1, this, continuation)), null, new p(1, this, continuation), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
