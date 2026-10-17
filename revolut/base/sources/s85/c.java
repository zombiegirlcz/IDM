package s85;

import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l35.b f260886l;

    public c(l35.b loanInteractor) {
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        this.f260886l = loanInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(koi.j r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof s85.a
            if (r0 == 0) goto L13
            r0 = r7
            s85.a r0 = (s85.a) r0
            int r1 = r0.f260884x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260884x = r1
            goto L18
        L13:
            s85.a r0 = new s85.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260884x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            koi.j r6 = r0.u
            koi.j r6 = (koi.j) r6
            yhm.o.b(r7)
            goto L5d
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r7)
            r7 = r6
            qv0.p r7 = (qv0.p) r7
            java.lang.Object r7 = r7.getF53364p()
            r2 = r6
            koi.j r2 = (koi.j) r2
            r0.u = r2
            r0.f260884x = r4
            boolean r2 = r7 instanceof c55.j
            if (r2 == 0) goto L59
            c55.j r7 = (c55.j) r7
            java.lang.String r2 = r7.f21447a
            com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard r7 = r7.f21448b
            java.lang.Object r7 = r5.b3(r2, r7, r0)
            if (r7 != r1) goto L56
            goto L5a
        L56:
            s35.a r7 = (s35.a) r7
            goto L5a
        L59:
            r7 = r3
        L5a:
            if (r7 != r1) goto L5d
            return r1
        L5d:
            s35.a r7 = (s35.a) r7
            if (r7 != 0) goto L7c
            java.lang.String r6 = r6.getF53355a()
            java.lang.String r7 = "ITEM_ID_CARD_DETAILS"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r7 == 0) goto L70
            s35.a$c r6 = s35.a.c.f259421a
            return r6
        L70:
            java.lang.String r7 = "ERROR_STATE_ID"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r6 == 0) goto L7b
            s35.a$b r6 = s35.a.b.f259420a
            return r6
        L7b:
            return r3
        L7c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: s85.c.Z2(koi.j, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(java.lang.String r6, com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof s85.b
            if (r0 == 0) goto L13
            r0 = r8
            s85.b r0 = (s85.b) r0
            int r1 = r0.f260885w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f260885w = r1
            goto L18
        L13:
            s85.b r0 = new s85.b
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f260885w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L51
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r8)
            p35.u0 r8 = p35.u0.CARD
            boolean r7 = com.revolut.feature.credit.loan.api.models.rev10.a.a(r7)
            if (r7 == 0) goto L3d
            p35.p0 r7 = p35.p0.DISABLED
            goto L3f
        L3d:
            p35.p0 r7 = p35.p0.ACTIVE
        L3f:
            l35.b r2 = r5.f260886l
            y45.f r2 = (y45.f) r2
            r4 = 0
            pfm.a r6 = r2.q(r6, r8, r7, r4)
            r0.f260885w = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            s35.a$a r6 = s35.a.C1436a.f259419a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s85.c.b3(java.lang.String, com.revolut.feature.credit.loan.api.models.rev10.LoanBackupCard, gim.c):java.lang.Object");
    }
}
