package com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen;

import bw4.s;
import cli.g;
import cli.y;
import cnc.t;
import com.revolut.data.model.Data;
import cv6.j;
import cv6.l;
import cv6.n;
import cv6.q;
import gr6.i;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import mra.d;
import oki.h;
import vii.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements l {
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f73722p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final FreelancerAcquiringPaymentFiltersScreenContract$InputData f73723q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f73724r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f73725s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f73726t;

    public a(i freelancerCurrencyInteractor, e dateProvider, FreelancerAcquiringPaymentFiltersScreenContract$InputData inputData, q stateMapper) {
        Intrinsics.checkNotNullParameter(freelancerCurrencyInteractor, "freelancerCurrencyInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerCurrencyInteractor;
        this.f73722p = dateProvider;
        this.f73723q = inputData;
        this.f73724r = new b();
        this.f73725s = hx7.e.a(this, new t(this, 23));
        this.f73726t = d.b(this, new j(new Data(null, null, true, 3, null), inputData.f73719a, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f73724r, new s(continuation, this, 29)), null, null, new ck7.j(this, continuation, 28), 3);
    }

    public final void I2(Function1 function1, Function1 function12, Object obj2) {
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        if (bool != null) {
            H2(this.f73726t, new n(bool.booleanValue(), function1, function12, 0));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f73725s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f73726t;
    }
}
