package com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen;

import ang.f;
import cli.y;
import et6.a3;
import et6.f1;
import et6.h1;
import et6.h3;
import gr6.l;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import mra.d;
import nya.b0;
import o17.k;
import o17.m;
import o17.s;
import oki.h;
import tqi.g;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements m {
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final gr6.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f1 f74122p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h1 f74123q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f74124r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o7.b f74125s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a3 f74126t;
    public final FreelancerSaleDetailsScreenContract$InputData u;
    public final g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final l17.a f74127w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f f74128x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vii.b f74129y;
    public final y z;

    public a(gr6.a freelancerAccountDetailsInteractor, f1 freelancerEquivalentAmountInteractor, h1 freelancerInteractor, l freelancerOrderTimelineEventInteractor, o7.b freelancerPaymentsInteractor, a3 freelancerRefundInteractor, h3 freelancerSaleTypeAvailabilityInteractor, FreelancerSaleDetailsScreenContract$InputData inputData, g shareNaviCommandFactory, l17.a shareTextGenerator, f userInteractor, b stateMapper) {
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerEquivalentAmountInteractor, "freelancerEquivalentAmountInteractor");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(freelancerOrderTimelineEventInteractor, "freelancerOrderTimelineEventInteractor");
        Intrinsics.checkNotNullParameter(freelancerPaymentsInteractor, "freelancerPaymentsInteractor");
        Intrinsics.checkNotNullParameter(freelancerRefundInteractor, "freelancerRefundInteractor");
        Intrinsics.checkNotNullParameter(freelancerSaleTypeAvailabilityInteractor, "freelancerSaleTypeAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(shareTextGenerator, "shareTextGenerator");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = freelancerAccountDetailsInteractor;
        this.f74122p = freelancerEquivalentAmountInteractor;
        this.f74123q = freelancerInteractor;
        this.f74124r = freelancerOrderTimelineEventInteractor;
        this.f74125s = freelancerPaymentsInteractor;
        this.f74126t = freelancerRefundInteractor;
        this.u = inputData;
        this.v = shareNaviCommandFactory;
        this.f74127w = shareTextGenerator;
        this.f74128x = userInteractor;
        this.f74129y = new vii.b();
        this.z = d.b(this, new k(0), stateMapper, null, false, 12);
        this.A = e.a(this, new nx2.f(this, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a r8, com.revolut.feature.freelancer.common.models.FreelancerOrder r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof o17.w
            if (r0 == 0) goto L13
            r0 = r10
            o17.w r0 = (o17.w) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            o17.w r0 = new o17.w
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            java.lang.String r3 = ""
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 != r4) goto L38
            java.lang.String r8 = r0.f221340y
            tqi.g r9 = r0.f221339x
            com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a r1 = r0.f221338w
            l17.a r2 = r0.v
            com.revolut.feature.freelancer.common.models.FreelancerOrder r0 = r0.u
            yhm.o.b(r10)
            r7 = r9
            r9 = r8
            r8 = r1
            r1 = r10
            r10 = r7
            goto L69
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            yhm.o.b(r10)
            tqi.g r10 = r8.v
            kotlin.jvm.internal.t0 r2 = kotlin.jvm.internal.t0.f186434a
            m70.a.c(r2)
            l17.a r2 = r8.f74127w
            ang.f r5 = r8.f74128x
            r6 = 0
            efm.d0 r5 = r5.f(r6)
            r0.u = r9
            r0.v = r2
            r0.f221338w = r8
            r0.f221339x = r10
            r0.f221340y = r3
            r0.B = r4
            java.lang.Object r0 = nim.a.b(r5, r0)
            if (r0 != r1) goto L66
            return r1
        L66:
            r1 = r0
            r0 = r9
            r9 = r3
        L69:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            do3.n r1 = (do3.n) r1
            java.lang.String r4 = r0.i
            if (r4 != 0) goto L75
            goto L76
        L75:
            r3 = r4
        L76:
            dj0.d r0 = r0.f73294j
            java.lang.String r0 = r2.a(r1, r0, r3)
            r1 = 8379(0x20bb, float:1.1741E-41)
            com.revolut.retail.core.navigation.ActivityNavigateCommand r9 = r10.f(r1, r9, r0)
            com.revolut.kompot.bridge.navigation.BridgeDestination r9 = zh9.u0.b(r9)
            r8.C1(r9)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a.I2(com.revolut.feature.freelancer.impl.ui.sales.details.kompot.screen.a, com.revolut.feature.freelancer.common.models.FreelancerOrder, gim.c):java.lang.Object");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f74129y, new ns9.h(continuation, this, 10)), null, null, new s(this, continuation, 1), 3);
        yji.l.a1(this, c6d.b.i(this.z.B(new h0() { // from class: o17.r
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((k) obj2).f221325b;
            }
        }), new b0(this, 16)), null, null, new s(this, continuation, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.z;
    }
}
