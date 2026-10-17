package kkf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class s7 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184936l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f184937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fal.b f184938n;
    public final cal.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sof.a f184939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final lg0.b f184940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f184941r;

    public s7(klf.h0 commonDataSource, klf.m1 juniorDataSource, fal.b suspiciousTransactionInteractor, cal.c suspiciousTransactionBannerFactory, sof.a suspiciousTransactionDialogProvider, lg0.b deeplinkHandler, j60.a bottomDialogExtension) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(suspiciousTransactionInteractor, "suspiciousTransactionInteractor");
        Intrinsics.checkNotNullParameter(suspiciousTransactionBannerFactory, "suspiciousTransactionBannerFactory");
        Intrinsics.checkNotNullParameter(suspiciousTransactionDialogProvider, "suspiciousTransactionDialogProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        this.f184936l = commonDataSource;
        this.f184937m = juniorDataSource;
        this.f184938n = suspiciousTransactionInteractor;
        this.o = suspiciousTransactionBannerFactory;
        this.f184939p = suspiciousTransactionDialogProvider;
        this.f184940q = deeplinkHandler;
        this.f184941r = bottomDialogExtension;
    }

    public final cmf.p Z2() {
        return new cmf.p(vkm.q.Q(yh5.b.d(this.f184936l.h(new kjk.x(20)), new x5(this.f184937m.a(), 7)), new m5(null, this, 4)), new z5(6), zhm.u.c(this), "SuspiciousTransaction");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(java.lang.Object r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.s7.b3(java.lang.Object, gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return Intrinsics.f(str, "TAG_SUSPICIOUS_TRANSACTION") ? b3(obj2, (gim.c) continuation) : Boolean.FALSE;
    }
}
