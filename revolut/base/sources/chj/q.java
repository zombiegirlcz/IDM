package chj;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import nfj.a2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class q {

    @NotNull
    public static final h Companion = new h();
    public static final long d;
    public static final long e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f24289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6c.f f24290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f24291c;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        pkm.e eVar = pkm.e.SECONDS;
        d = kotlin.time.c.g(2, eVar);
        e = kotlin.time.c.g(30, eVar);
    }

    public q(a2 esimSubscriptionsRepository, a6c.f checkoutExtension, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(esimSubscriptionsRepository, "esimSubscriptionsRepository");
        Intrinsics.checkNotNullParameter(checkoutExtension, "checkoutExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f24289a = esimSubscriptionsRepository;
        this.f24290b = checkoutExtension;
        this.f24291c = featureToggleInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
    
        if (r3 == r9) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(chj.q r26, java.lang.String r27, kotlin.time.b r28, kotlin.time.b r29, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod r30, java.lang.String r31, gim.c r32) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: chj.q.a(chj.q, java.lang.String, kotlin.time.b, kotlin.time.b, com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, long r13, long r15, gim.c r17) {
        /*
            r11 = this;
            r0 = r17
            boolean r1 = r0 instanceof chj.o
            if (r1 == 0) goto L15
            r1 = r0
            chj.o r1 = (chj.o) r1
            int r2 = r1.f24281w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f24281w = r2
            goto L1a
        L15:
            chj.o r1 = new chj.o
            r1.<init>(r11, r0)
        L1a:
            java.lang.Object r0 = r1.u
            fim.a r9 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f24281w
            r10 = 1
            if (r2 == 0) goto L31
            if (r2 != r10) goto L29
            yhm.o.b(r0)
            goto L48
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L31:
            yhm.o.b(r0)
            chj.p r2 = new chj.p
            r7 = 0
            r8 = 0
            r3 = r11
            r4 = r12
            r5 = r13
            r2.<init>(r3, r4, r5, r7, r8)
            r1.f24281w = r10
            r3 = r15
            java.lang.Object r0 = skm.h2.e(r3, r2, r1)
            if (r0 != r9) goto L48
            return r9
        L48:
            chj.l r0 = (chj.l) r0
            if (r0 != 0) goto L4e
            chj.j r0 = chj.j.f24261a
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: chj.q.b(java.lang.String, long, long, gim.c):java.lang.Object");
    }
}
