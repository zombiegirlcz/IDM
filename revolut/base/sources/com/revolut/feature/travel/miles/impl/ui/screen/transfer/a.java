package com.revolut.feature.travel.miles.impl.ui.screen.transfer;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.travel.miles.api.TravelMilesApi$Toggles;
import com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2;
import com.revolut.feature.travel.miles.api.model.TravelMilesProviderSummary;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import m1c.o0;
import nyb.i0;
import nyb.k;
import oki.h;
import org.jetbrains.annotations.NotNull;
import p5f.c;
import pch.f;
import pig.a0;
import pig.j;
import pig.o;
import pig.q;
import pig.r;
import pig.v;
import pig.w;
import vfg.d;
import vii.b;
import vkm.j2;
import wkm.l;
import wsg.n;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends h implements o {

    @NotNull
    private static final r Companion = new r();
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final b B;
    public final b C;
    public final b D;
    public final TravelMilesTransferScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f94387p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f94388q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f94389r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pig.b f94390s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wj0.a f94391t;
    public final n60.a u;
    public final agg.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gte.a f94392w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final wub.a f94393x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i0 f94394y;
    public final y z;

    public a(a0 stateMapper, i90.b uuidGenerator, TravelMilesTransferScreenContract$InputData inputData, k revPointsInteractor, n walletInteractor, d travelMilesAccountsInteractor, pig.b milesFormatter, wj0.a idempotencyKeyHolder, n60.a keyboardExtension, agg.a milesCalculator, gte.a featureToggleInteractor, wub.a revPointsBuyingFeatureInteractor, i0 revPointsProductEligibilityInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(travelMilesAccountsInteractor, "travelMilesAccountsInteractor");
        Intrinsics.checkNotNullParameter(milesFormatter, "milesFormatter");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(milesCalculator, "milesCalculator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revPointsBuyingFeatureInteractor, "revPointsBuyingFeatureInteractor");
        Intrinsics.checkNotNullParameter(revPointsProductEligibilityInteractor, "revPointsProductEligibilityInteractor");
        this.o = inputData;
        this.f94387p = revPointsInteractor;
        this.f94388q = walletInteractor;
        this.f94389r = travelMilesAccountsInteractor;
        this.f94390s = milesFormatter;
        this.f94391t = idempotencyKeyHolder;
        this.u = keyboardExtension;
        this.v = milesCalculator;
        this.f94392w = featureToggleInteractor;
        this.f94393x = revPointsBuyingFeatureInteractor;
        this.f94394y = revPointsProductEligibilityInteractor;
        String strU = wp5.y.u(uuidGenerator, "toString(...)");
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        Data data3 = new Data(null, null, true, 3, null);
        RevPoints.INSTANCE.getClass();
        this.z = mra.d.b(this, new j(strU, data, null, data2, data3, RevPoints.Companion.a(0L), "", 0, "", pig.k.NONE, q.NONE, false), stateMapper, null, false, 12);
        this.A = e.a(this, new c(this, 27));
        this.B = new b();
        this.C = new b();
        this.D = new b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable I2(com.revolut.feature.travel.miles.impl.ui.screen.transfer.a r5, hfg.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof pig.t
            if (r0 == 0) goto L13
            r0 = r7
            pig.t r0 = (pig.t) r0
            int r1 = r0.f236497w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f236497w = r1
            goto L18
        L13:
            pig.t r0 = new pig.t
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f236497w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L4e
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            vfg.d r5 = r5.f94389r
            r0.f236497w = r3
            lfg.e r5 = r5.f288613a
            r5.getClass()
            km2.n r7 = new km2.n
            r2 = 15
            r4 = 0
            r7.<init>(r5, r6, r4, r2)
            skm.p0 r5 = skm.p0.f264001a
            elm.f r5 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r5, r7, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            hfg.o0 r7 = (hfg.o0) r7
            hfg.p0 r5 = r7.e
            r6 = -1
            if (r5 != 0) goto L57
            r5 = r6
            goto L5f
        L57:
            int[] r0 = pig.s.f236496b
            int r5 = r5.ordinal()
            r5 = r0[r5]
        L5f:
            if (r5 == r6) goto L84
            if (r5 == r3) goto L7a
            r6 = 2
            if (r5 == r6) goto L77
            r6 = 3
            if (r5 == r6) goto L6f
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L6f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Top up is failed"
            r5.<init>(r6)
            throw r5
        L77:
            hfg.c r5 = hfg.c.PENDING
            goto L7c
        L7a:
            hfg.c r5 = hfg.c.COMPLETED
        L7c:
            java.lang.String r6 = r7.f151877a
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r5, r6)
            return r7
        L84:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Top up state is unknown"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.miles.impl.ui.screen.transfer.a.I2(com.revolut.feature.travel.miles.impl.ui.screen.transfer.a, hfg.b, gim.c):java.io.Serializable");
    }

    public static final String J2(a aVar) {
        TravelMilesProviderSummary travelMilesProviderSummary;
        String str;
        TravelMilesAccountV2 travelMilesAccountV2 = (TravelMilesAccountV2) ((j) ((j2) aVar.z.f22677a).getValue()).f236482b.getContent();
        if (travelMilesAccountV2 != null && (travelMilesProviderSummary = travelMilesAccountV2.f94087c) != null && (str = travelMilesProviderSummary.f94110b) != null) {
            return str;
        }
        m70.a.c(t0.f186434a);
        return "";
    }

    @Override // yji.l
    public final void I1() {
        this.f94391t.a("miles-topup");
        Continuation continuation = null;
        l lVarQ = vkm.q.Q(this.C, new w(2, this, continuation));
        h0 h0Var = h0.f322473a;
        yji.l.a1(this, rd0.e.n(lVarQ, h0Var), null, null, new v(4, this, continuation), 3);
        yji.l.a1(this, rd0.e.n(xam.a.h(new v(2, this, continuation), vkm.q.Q(this.D, new w(1, this, continuation))), h0Var), null, null, new v(3, this, continuation), 3);
        TravelMilesAccountV2 travelMilesAccountV2 = this.o.f94384b;
        y yVar = this.z;
        if (travelMilesAccountV2 != null) {
            H2(yVar, new pb2.v(travelMilesAccountV2, 24));
        } else {
            yji.l.a1(this, rd0.e.n(vkm.q.Q(this.B, new w(0, this, continuation)), h0Var), null, null, new v(0, this, continuation), 3);
        }
        boolean zC = ((jte.d) this.f94392w).c(TravelMilesApi$Toggles.RevPointsBuyingUpsellInMiles.f94081c);
        boolean zA = this.f94393x.a();
        if (zC && zA) {
            yji.l.a1(this, mo3.a.g(rd0.e.b(this.f94394y.b(o0.ACTIVATION)), null, new f(22), 1), null, null, new v(1, this, continuation), 3);
        } else {
            H2(yVar, new phc.e(21));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    public final hfg.t0 K2() {
        TravelMilesProviderSummary travelMilesProviderSummary;
        hfg.t0 t0Var;
        TravelMilesAccountV2 travelMilesAccountV2 = (TravelMilesAccountV2) ((j) ((j2) this.z.f22677a).getValue()).f236482b.getContent();
        return (travelMilesAccountV2 == null || (travelMilesProviderSummary = travelMilesAccountV2.f94087c) == null || (t0Var = travelMilesProviderSummary.d) == null) ? hfg.t0.MILES : t0Var;
    }

    @Override // cli.z
    public final g getState() {
        return this.z;
    }
}
