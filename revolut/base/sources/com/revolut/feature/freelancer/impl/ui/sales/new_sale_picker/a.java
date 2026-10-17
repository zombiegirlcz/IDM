package com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker;

import au6.a3;
import av8.n;
import avk.i;
import b27.f;
import b27.o;
import cli.g;
import cli.y;
import et6.c1;
import et6.h3;
import gr6.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import r10.v;
import vii.b;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b27.h {
    public final c1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f74164p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f74165q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h3 f74166r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final FreelancerNewSalePickerScreenContract$InputData f74167s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jf1.a f74168t;
    public final b u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f74169w;

    public a(c1 ecommerceInteractor, e freelancerAvailabilityInteractor, v freelancerSaleChannelAvailabilityInteractor, h3 freelancerSaleTypeAvailabilityInteractor, FreelancerNewSalePickerScreenContract$InputData inputData, jf1.a proMerchantTogglesInteractor, o stateMapper) {
        Intrinsics.checkNotNullParameter(ecommerceInteractor, "ecommerceInteractor");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerSaleChannelAvailabilityInteractor, "freelancerSaleChannelAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerSaleTypeAvailabilityInteractor, "freelancerSaleTypeAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(proMerchantTogglesInteractor, "proMerchantTogglesInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = ecommerceInteractor;
        this.f74164p = freelancerAvailabilityInteractor;
        this.f74165q = freelancerSaleChannelAvailabilityInteractor;
        this.f74166r = freelancerSaleTypeAvailabilityInteractor;
        this.f74167s = inputData;
        this.f74168t = proMerchantTogglesInteractor;
        this.u = new b();
        this.v = d.b(this, new f(0), stateMapper, null, false, 12);
        this.f74169w = hx7.e.a(this, new n(this, 10));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f74169w;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.u, new a3(continuation, this, 7)), null, new i(this, continuation, 16), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
