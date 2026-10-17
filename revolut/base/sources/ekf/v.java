package ekf;

import akf.t1;
import akf.u1;
import akf.v1;
import klf.m1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import sgm.e3;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f127129l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f127130m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ao.h f127131n;
    public final e3 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f127132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f127133q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lr8.a f127134r;

    public v(klf.h0 commonDataSource, m1 juniorDataSource, ao.h juniorCoparentInteractor, e3 juniorTransferRequestInteractor, p availabilityChecker, q mapper, lr8.a juniorTransferRequestMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        Intrinsics.checkNotNullParameter(juniorTransferRequestInteractor, "juniorTransferRequestInteractor");
        Intrinsics.checkNotNullParameter(availabilityChecker, "availabilityChecker");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(juniorTransferRequestMapper, "juniorTransferRequestMapper");
        this.f127129l = commonDataSource;
        this.f127130m = juniorDataSource;
        this.f127131n = juniorCoparentInteractor;
        this.o = juniorTransferRequestInteractor;
        this.f127132p = availabilityChecker;
        this.f127133q = mapper;
        this.f127134r = juniorTransferRequestMapper;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        Continuation continuation2 = null;
        boolean z = true;
        if (a10.b.B(v1.Companion, t1.JUNIOR_P2P_TRANSFER_REJECT, str)) {
            T2(new t(this, continuation2, 1), new yi5.b(27));
        } else if (Intrinsics.f(str, u1.a(t1.JUNIOR_P2P_TRANSFER_APPROVE))) {
            T2(new t(this, continuation2, 0), new yi5.b(27));
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
