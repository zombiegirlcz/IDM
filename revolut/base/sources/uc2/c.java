package uc2;

import g12.l;
import kotlin.jvm.internal.Intrinsics;
import tnb.g0;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f278972a;

    public c(g0 payInteractor) {
        Intrinsics.checkNotNullParameter(payInteractor, "payInteractor");
        this.f278972a = payInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // g12.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(xq2.a r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof uc2.b
            if (r0 == 0) goto L13
            r0 = r7
            uc2.b r0 = (uc2.b) r0
            int r1 = r0.f278971w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278971w = r1
            goto L1a
        L13:
            uc2.b r0 = new uc2.b
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f278971w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)
            goto L55
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            if (r6 == 0) goto L5d
            java.lang.String r6 = r6.f308049a
            if (r6 == 0) goto L5d
            r0.f278971w = r3
            tnb.g0 r7 = r5.f278972a
            java.lang.Object r7 = r7.f272384b
            o7.b r7 = (o7.b) r7
            d3i.g r2 = new d3i.g
            r3 = 0
            r4 = 15
            r2.<init>(r7, r6, r3, r4)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r6, r2, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            com.revolut.feature.apm.qvik.impl.data.models.QvikQrScanDetails r7 = (com.revolut.feature.apm.qvik.impl.data.models.QvikQrScanDetails) r7
            uc2.a r6 = new uc2.a
            r6.<init>(r7)
            return r6
        L5d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Null Barcode"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uc2.c.c(xq2.a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
