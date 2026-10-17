package kkf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u1 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184961l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final n8b.a f184962m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final rnf.c f184963n;

    public u1(klf.h0 commonDataSource, n8b.a countryInteractor, rnf.c gstInvoiceNaviCommandFactory) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(gstInvoiceNaviCommandFactory, "gstInvoiceNaviCommandFactory");
        this.f184961l = commonDataSource;
        this.f184962m = countryInteractor;
        this.f184963n = gstInvoiceNaviCommandFactory;
    }

    public final cmf.p Z2() {
        return new cmf.p(new kh4.f(this.f184961l.d(), this, 14), new i0(9), zhm.u.c(this), "GstInvoice");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof kkf.t1
            if (r0 == 0) goto L13
            r0 = r9
            kkf.t1 r0 = (kkf.t1) r0
            int r1 = r0.f184948w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184948w = r1
            goto L18
        L13:
            kkf.t1 r0 = new kkf.t1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184948w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            goto L8c
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            yhm.o.b(r9)
            goto L48
        L36:
            yhm.o.b(r9)
            klf.h0 r9 = r8.f184961l
            kotlinx.coroutines.flow.SharedFlow r9 = r9.d()
            r0.f184948w = r4
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L48
            goto L8b
        L48:
            tof.a3 r9 = (tof.a3) r9
            java.lang.String r9 = r9.f272581b
            rnf.c r2 = r8.f184963n
            r2.getClass()
            java.lang.String r5 = "transactionId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r5)
            zxd.c r5 = r2.f255659a
            ryd.w r5 = (ryd.w) r5
            java.lang.String r6 = "groupId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r6)
            ryd.g r6 = new ryd.g
            r7 = 0
            r6.<init>(r5, r9, r7)
            efm.r r9 = r5.n(r3, r6)
            vkm.d r9 = rd0.e.b(r9)
            zfd.e r9 = zi0.c.w(r9)
            rnd.d0 r5 = new rnd.d0
            r6 = 1
            r5.<init>(r6)
            r6 = 0
            jhi.b r9 = mo3.a.g(r9, r6, r5, r4)
            qna.n r4 = new qna.n
            r5 = 22
            r4.<init>(r9, r2, r5)
            r0.f184948w = r3
            java.lang.Object r9 = vkm.q.z(r4, r0)
            if (r9 != r1) goto L8c
        L8b:
            return r1
        L8c:
            aii.u r9 = (aii.u) r9
            if (r9 == 0) goto L93
            r8.A2(r9)
        L93:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.u1.b3(gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return Intrinsics.f(str, "ID_GST_INVOICE") ? b3((gim.c) continuation) : Boolean.FALSE;
    }
}
