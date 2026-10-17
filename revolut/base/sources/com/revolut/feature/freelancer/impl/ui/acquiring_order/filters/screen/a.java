package com.revolut.feature.freelancer.impl.ui.acquiring_order.filters.screen;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import gr6.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import li2.f;
import lp2.c;
import lu6.l;
import lu6.n;
import lu6.s;
import mra.d;
import oki.h;
import vii.b;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements n {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f73684p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final FreelancerAcquiringOrderFiltersScreenContract$InputData f73685q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f73686r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f73687s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f73688t;

    public a(i freelancerCurrencyInteractor, e dateProvider, FreelancerAcquiringOrderFiltersScreenContract$InputData inputData, s stateMapper) {
        Intrinsics.checkNotNullParameter(freelancerCurrencyInteractor, "freelancerCurrencyInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerCurrencyInteractor;
        this.f73684p = dateProvider;
        this.f73685q = inputData;
        this.f73686r = new b();
        this.f73687s = hx7.e.a(this, new c(this, 7));
        this.f73688t = d.b(this, new l(new Data(null, null, true, 3, null), inputData.f73681a, false), stateMapper, null, false, 12);
    }

    public static AcquiringOrderFilter J2(AcquiringOrderFilter acquiringOrderFilter, AcquiringOrderFilter acquiringOrderFilter2) {
        AcquiringOrderFilter acquiringOrderFilterZ2;
        return (acquiringOrderFilter == null || (acquiringOrderFilterZ2 = acquiringOrderFilter.z2(acquiringOrderFilter2)) == null) ? acquiringOrderFilter2 : acquiringOrderFilterZ2;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f73686r, new f(continuation, this, 11)), null, null, new lph.h(this, continuation, 7), 3);
    }

    public final void I2(Function1 function1, Function1 function12, Object obj2) {
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        if (bool != null) {
            H2(this.f73688t, new cv6.n(bool.booleanValue(), function1, function12, 1));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f73687s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f73688t;
    }
}
