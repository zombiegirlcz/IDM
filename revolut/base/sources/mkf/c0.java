package mkf;

import klf.m1;
import klf.z2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f206231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z2 f206232m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m1 f206233n;
    public final c9e.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kpj.f f206234p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d0 f206235q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bmf.b f206236r;

    public c0(klf.h0 commonDataSource, z2 subscriptionDataSource, m1 juniorDataSource, c9e.c subscriptionNavigationProvider, kpj.f availabilityChecker, d0 mapper, bmf.b modalFactory) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(subscriptionDataSource, "subscriptionDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(subscriptionNavigationProvider, "subscriptionNavigationProvider");
        Intrinsics.checkNotNullParameter(availabilityChecker, "availabilityChecker");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(modalFactory, "modalFactory");
        this.f206231l = commonDataSource;
        this.f206232m = subscriptionDataSource;
        this.f206233n = juniorDataSource;
        this.o = subscriptionNavigationProvider;
        this.f206234p = availabilityChecker;
        this.f206235q = mapper;
        this.f206236r = modalFactory;
    }

    public final cmf.p Z2() {
        klf.h0 h0Var = this.f206231l;
        return new cmf.p(ta6.a.g(h0Var.d(), h0Var.c(), (SharedFlow) this.f206232m.f185624h.getValue(), this.f206233n.a(), new m98.m(this, null, 1)), new s(1), zhm.u.c(this), "BankTransferScheduledPayment");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r18, java.lang.String r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mkf.c0.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
