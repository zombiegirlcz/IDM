package dlf;

import elf.s0;
import klf.h0;
import klf.m1;
import kotlin.jvm.internal.Intrinsics;
import mjf.t;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f115758l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f115759m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final thf.m f115760n;
    public final vlf.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c6k.e f115761p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final t f115762q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final bmf.b f115763r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final lg0.b f115764s;

    public q(h0 commonDataSource, m1 juniorDataSource, thf.m transactionTextResourcesMapper, vlf.b commonUiMapper, c6k.e trackingFactory, t kycTransactionInteractor, bmf.b modalFactory, lg0.b deeplinkHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(trackingFactory, "trackingFactory");
        Intrinsics.checkNotNullParameter(kycTransactionInteractor, "kycTransactionInteractor");
        Intrinsics.checkNotNullParameter(modalFactory, "modalFactory");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f115758l = commonDataSource;
        this.f115759m = juniorDataSource;
        this.f115760n = transactionTextResourcesMapper;
        this.o = commonUiMapper;
        this.f115761p = trackingFactory;
        this.f115762q = kycTransactionInteractor;
        this.f115763r = modalFactory;
        this.f115764s = deeplinkHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof dlf.p
            if (r0 == 0) goto L14
            r0 = r9
            dlf.p r0 = (dlf.p) r0
            int r1 = r0.f115757x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f115757x = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            dlf.p r0 = new dlf.p
            r0.<init>(r7, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r5.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f115757x
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.lang.String r8 = r5.u
            yhm.o.b(r9)
            goto L49
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            yhm.o.b(r9)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r5.u = r8
            r5.f115757x = r2
            lg0.b r1 = r7.f115764s
            r3 = 0
            r6 = 2
            r2 = r8
            java.lang.Object r9 = lg0.b.x1(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L48
            return r0
        L48:
            r8 = r2
        L49:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L66
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Transaction details screen. Unable to handle deeplink: "
            java.lang.String r8 = j6.a.q(r0, r8)
            r9.<init>(r8)
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r9, r8)
        L66:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dlf.q.Z2(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d9, code lost:
    
        if (Z2("revolut://app/kyc/jp-my-number", r4) == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
    
        if (Z2(r1, r4) == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e4, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r21, java.lang.String r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dlf.q.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
