package com.revolut.feature.freelancer.impl.ui.acquiring_order.list;

import b9k.f;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import et6.h3;
import gr6.e;
import jr6.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oi3.g;
import oki.h;
import or4.i;
import ou6.l;
import ou6.p;
import ou6.q;
import ou6.r;
import ou6.x;
import r10.v;
import vii.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements l {
    public final f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h3 f73697p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f73698q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v f73699r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jf1.a f73700s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cu6.a f73701t;
    public final m u;
    public final b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f73702w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y f73703x;

    public a(f acquiringOrderInteractor, h3 saleTypeAvailabilityInteractor, e freelancerAvailabilityInteractor, v freelancerSaleChannelAvailabilityInteractor, jf1.a proMerchantTogglesInteractor, cu6.a acquiringOrderFilterMatcher, m freelancerDialogFactory, FreelancerAcquiringOrderListScreenContract$InputData inputData, x stateMapper) {
        AcquiringOrderFilter.Channel channel;
        Intrinsics.checkNotNullParameter(acquiringOrderInteractor, "acquiringOrderInteractor");
        Intrinsics.checkNotNullParameter(saleTypeAvailabilityInteractor, "saleTypeAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(freelancerSaleChannelAvailabilityInteractor, "freelancerSaleChannelAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(proMerchantTogglesInteractor, "proMerchantTogglesInteractor");
        Intrinsics.checkNotNullParameter(acquiringOrderFilterMatcher, "acquiringOrderFilterMatcher");
        Intrinsics.checkNotNullParameter(freelancerDialogFactory, "freelancerDialogFactory");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = acquiringOrderInteractor;
        this.f73697p = saleTypeAvailabilityInteractor;
        this.f73698q = freelancerAvailabilityInteractor;
        this.f73699r = freelancerSaleChannelAvailabilityInteractor;
        this.f73700s = proMerchantTogglesInteractor;
        this.f73701t = acquiringOrderFilterMatcher;
        this.u = freelancerDialogFactory;
        this.v = new b();
        this.f73702w = hx7.e.a(this, new i(this, 3));
        ou6.a aVar = inputData.f73693a;
        int i = p.f229839a[aVar.ordinal()];
        if (i == 1) {
            channel = null;
        } else if (i == 2) {
            nr6.e.Companion.getClass();
            channel = new AcquiringOrderFilter.Channel(nr6.e.IN_PERSON_CHANNELS);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            nr6.e.Companion.getClass();
            channel = new AcquiringOrderFilter.Channel(nr6.e.E_COMMERCE_CHANNELS);
        }
        this.f73703x = d.b(this, new ou6.h(aVar, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), inputData.f73694b, channel, null, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        q qVar = new q(this, null);
        b bVar = this.v;
        yji.l.a1(this, vkm.q.Q(bVar, qVar), null, null, new r(this, null), 3);
        yji.l.a1(this, new g(vkm.q.Q(bVar, new okf.m((Continuation) null, this, 10)), this, 13), null, null, new ou6.v(this, null), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f73702w;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f73703x;
    }
}
