package om4;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al4.q f226640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f226641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f226642c;

    public m4(al4.q creditCardProductInteractor, wsg.n walletInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f226640a = creditCardProductInteractor;
        this.f226641b = walletInteractor;
        this.f226642c = transactionsInteractor;
    }

    public final vkm.y a() {
        return rd0.e.e(vkm.q.q(xam.a.h(new jkh.g(this, (Continuation) null, 20), nim.a.v(((y3) this.f226640a).e(w4l.j.f294644c, true), new l3(13)))), zhm.h0.f322473a, new n28.b(3, 26, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a9, code lost:
    
        if (nim.a.a(r8, r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof om4.l4
            if (r0 == 0) goto L13
            r0 = r8
            om4.l4 r0 = (om4.l4) r0
            int r1 = r0.f226635w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226635w = r1
            goto L18
        L13:
            om4.l4 r0 = new om4.l4
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226635w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            goto Lac
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            yhm.o.b(r8)
            goto L6a
        L37:
            yhm.o.b(r8)
            fo3.d r8 = fo3.d.FAMILY_CREDIT_CARD
            w4l.j r2 = w4l.j.f294644c
            r5 = 0
            wsg.n r6 = r7.f226641b
            efm.r r8 = r6.g0(r8, r2, r5)
            vkm.d r8 = rd0.e.b(r8)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.q0 r8 = rd0.e.n(r8, r2)
            ol6.b r2 = new ol6.b
            r5 = 17
            r2.<init>(r5)
            ol6.b r5 = new ol6.b
            r6 = 18
            r5.<init>(r6)
            jhi.b r8 = mo3.a.e(r8, r2, r5)
            r0.f226635w = r4
            java.lang.Object r8 = vkm.q.z(r8, r0)
            if (r8 != r1) goto L6a
            goto Lab
        L6a:
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto Lac
            java.lang.Object r8 = zhm.d0.d0(r8)
            kotlin.Pair r8 = (kotlin.Pair) r8
            if (r8 == 0) goto Lac
            java.lang.Object r2 = r8.f186385a
            fo3.c r2 = (fo3.c) r2
            java.lang.Object r8 = r8.f186386b
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = zhm.d0.d0(r8)
            io3.d r8 = (io3.d) r8
            if (r8 == 0) goto Lac
            tof.hc r5 = new tof.hc
            java.lang.String r2 = r2.f136801a
            java.lang.String r8 = r8.f163145a
            r5.<init>(r2, r8)
            tof.q6[] r8 = new tof.q6[r4]
            r2 = 0
            r8[r2] = r5
            com.revolut.domain.interactors.transactions.a r6 = r7.f226642c
            mjf.b0 r6 = (mjf.b0) r6
            r6.t(r8)
            tof.q6[] r8 = new tof.q6[r4]
            r8[r2] = r5
            pfm.r r8 = r6.g(r8)
            r0.f226635w = r3
            java.lang.Object r8 = nim.a.a(r8, r0)
            if (r8 != r1) goto Lac
        Lab:
            return r1
        Lac:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.m4.b(gim.c):java.lang.Object");
    }
}
