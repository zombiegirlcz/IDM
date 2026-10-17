package wub;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tub.i;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements qub.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f300098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f300099b;

    public d(i revPointsBuyingRepository, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(revPointsBuyingRepository, "revPointsBuyingRepository");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f300098a = revPointsBuyingRepository;
        this.f300099b = transactionsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, org.joda.time.DateTime r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof wub.c
            if (r0 == 0) goto L13
            r0 = r9
            wub.c r0 = (wub.c) r0
            int r1 = r0.f300097w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f300097w = r1
            goto L18
        L13:
            wub.c r0 = new wub.c
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f300097w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r9)
            goto Laa
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            yhm.o.b(r9)
            tif.e r9 = new tif.e
            r2 = 9
            r9.<init>(r6, r2, r7, r8)
            ufm.c r7 = new ufm.c
            r8 = 0
            r7.<init>(r9, r8)
            wsg.a r8 = new wsg.a
            r9 = 26
            r8.<init>(r9)
            wsg.k r9 = new wsg.k
            r9.<init>(r8, r2)
            efm.i r7 = r7.v()
            qfm.j1 r8 = new qfm.j1
            r2 = 2
            r8.<init>(r7, r9, r2)
            wsg.a r7 = new wsg.a
            r9 = 27
            r7.<init>(r9)
            wsg.k r9 = new wsg.k
            r2 = 10
            r9.<init>(r7, r2)
            qfm.n r7 = new qfm.n
            r2 = 2
            r7.<init>(r8, r9, r2)
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            efm.c0 r8 = hhm.f.f152430b
            r4 = 2000(0x7d0, double:9.88E-321)
            qfm.v2 r8 = efm.i.r(r4, r8)
            qfm.u r9 = new qfm.u
            r2 = 0
            r9.<init>(r7, r8, r2)
            java.lang.String r7 = "delaySubscription(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
            r0.f300097w = r3
            blm.d r7 = blm.d.LAST
            skm.l r8 = new skm.l
            kotlin.coroutines.Continuation r2 = fim.h.b(r0)
            r8.<init>(r3, r2)
            r8.u()
            blm.c[] r2 = blm.g.f16753a
            int r3 = r2.length
            if (r3 > 0) goto Lb0
            blm.b r2 = new blm.b
            r2.<init>(r8, r7)
            r9.a(r2)
            java.lang.Object r9 = r8.t()
            if (r9 != r1) goto La7
            java.lang.String r7 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r7)
        La7:
            if (r9 != r1) goto Laa
            return r1
        Laa:
            java.lang.String r7 = "awaitLast(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r7)
            return r9
        Lb0:
            r7 = 0
            r7 = r2[r7]
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wub.d.a(java.lang.String, org.joda.time.DateTime, gim.c):java.lang.Object");
    }
}
