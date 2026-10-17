package ti9;

import ej9.f0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ci9.b f271470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f271471b;

    public n(ci9.b payLaterRepository, f0 repository) {
        Intrinsics.checkNotNullParameter(payLaterRepository, "payLaterRepository");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f271470a = payLaterRepository;
        this.f271471b = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ti9.m
            if (r0 == 0) goto L13
            r0 = r8
            ti9.m r0 = (ti9.m) r0
            int r1 = r0.f271469x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f271469x = r1
            goto L18
        L13:
            ti9.m r0 = new ti9.m
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f271469x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.revolut.feature.pay_later.impl.models.right_to_cancel.RightToCancelCancellationOutcome r7 = r0.u
            yhm.o.b(r8)
            return r7
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            goto L54
        L38:
            yhm.o.b(r8)
            r0.f271469x = r4
            ej9.f0 r8 = r6.f271471b
            r8.getClass()
            eif.j r2 = new eif.j
            r4 = 6
            r5 = 0
            r2.<init>(r8, r7, r5, r4)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r7, r2, r0)
            if (r8 != r1) goto L54
            goto L64
        L54:
            com.revolut.feature.pay_later.impl.models.right_to_cancel.RightToCancelCancellationOutcome r8 = (com.revolut.feature.pay_later.impl.models.right_to_cancel.RightToCancelCancellationOutcome) r8
            r0.u = r8
            r0.f271469x = r3
            ci9.b r7 = r6.f271470a
            ej9.e0 r7 = (ej9.e0) r7
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L65
        L64:
            return r1
        L65:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ti9.n.a(java.lang.String, gim.c):java.lang.Object");
    }

    public final vkm.d b(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        f0 f0Var = this.f271471b;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return f0Var.f126810c.a(new ej9.h(facilityId), loadingStrategy);
    }
}
