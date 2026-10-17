package q97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tzg.m f243789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.i f243790b;

    public t0(tzg.m wealthAccountsInteractor, ybl.i productGroupAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        this.f243789a = wealthAccountsInteractor;
        this.f243790b = productGroupAvailabilityInteractor;
    }

    public final jhi.b a() {
        return mo3.a.e(nim.a.v(zh9.u0.m(tzg.m.c(this.f243789a, null, null, 3), ((ael.h0) this.f243790b).d()), new q2j.j(zhm.u.c(cfl.p.ETF), 7)), new ku1.f0(22), new q92.f(9));
    }
}
