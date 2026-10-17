package me7;

import at.r;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import n30.x;
import v30.s;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends oki.h implements dli.b {
    public final be7.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final be7.k f204629p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x f204630q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f204631r;

    public k(be7.h inAppCalls, be7.k inAppCallsInteractor, x chatPricingPlanInteractor, r stateMapper) {
        Intrinsics.checkNotNullParameter(inAppCalls, "inAppCalls");
        Intrinsics.checkNotNullParameter(inAppCallsInteractor, "inAppCallsInteractor");
        Intrinsics.checkNotNullParameter(chatPricingPlanInteractor, "chatPricingPlanInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inAppCalls;
        this.f204629p = inAppCallsInteractor;
        this.f204630q = chatPricingPlanInteractor;
        this.f204631r = mra.d.b(this, new c(s.NONE), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(this.f204630q.a()), null, null, new i(this, null, 0), 3);
        l.a1(this, rd0.e.b(((com.revolut.feature.in_app_calls.b) this.f204629p).f74794b), null, null, new i(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f204631r;
    }
}
