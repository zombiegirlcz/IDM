package u6k;

import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements vv9.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k61.a f277621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f277622b;

    public f(utf.a transferRequestApprovalHandler, k61.a transferInteractor) {
        Intrinsics.checkNotNullParameter(transferRequestApprovalHandler, "transferRequestApprovalHandler");
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        this.f277621a = transferInteractor;
        this.f277622b = y0.b(MoneyRequestChannel.Upi.f60335b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.domain.models.moneyrequest.MoneyRequest r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof u6k.d
            if (r0 == 0) goto L13
            r0 = r6
            u6k.d r0 = (u6k.d) r0
            int r1 = r0.f277619w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f277619w = r1
            goto L18
        L13:
            u6k.d r0 = new u6k.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f277619w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.util.Set r6 = r4.f277622b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            com.revolut.domain.models.moneyrequest.MoneyRequestChannel r2 = r5.f60316c
            boolean r6 = zhm.d0.T(r6, r2)
            if (r6 == 0) goto L41
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L41:
            r0.f277619w = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            krf.f r6 = (krf.f) r6
            java.util.ArrayList r5 = r6.f188864a
            boolean r5 = r5.isEmpty()
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u6k.f.a(com.revolut.domain.models.moneyrequest.MoneyRequest, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.domain.models.moneyrequest.MoneyRequest r18, gim.c r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof u6k.e
            if (r3 == 0) goto L19
            r3 = r2
            u6k.e r3 = (u6k.e) r3
            int r4 = r3.f277620w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f277620w = r4
            goto L1e
        L19:
            u6k.e r3 = new u6k.e
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.u
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f277620w
            r6 = 1
            if (r5 == 0) goto L35
            if (r5 != r6) goto L2d
            yhm.o.b(r2)
            goto L83
        L2d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L35:
            yhm.o.b(r2)
            java.lang.String r2 = "moneyRequest"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            dj0.d r2 = r1.d
            xi0.b r8 = r2.f115083b
            com.revolut.domain.models.moneyrequest.MoneyRequestCounterParty r1 = r1.f60320l
            java.lang.String r2 = r1.getD()
            r5 = 0
            if (r2 == 0) goto L55
            wi0.a r7 = wi0.b.Companion
            r7.getClass()
            wi0.b r2 = wi0.a.a(r2)
            r9 = r2
            goto L56
        L55:
            r9 = r5
        L56:
            java.lang.String r11 = r1.getE()
            gk3.i r10 = gk3.i.TRANSFER_LINK
            r15 = 0
            r16 = 240(0xf0, float:3.36E-43)
            k61.a r7 = r0.f277621a
            r12 = 0
            r13 = 0
            r14 = 0
            efm.r r1 = k61.a.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            efm.r r1 = zi0.c.J(r1)
            r2 = 3
            efm.r r1 = m70.a.g(r1, r5, r5, r2)
            efm.d0 r1 = r1.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r3.f277620w = r6
            java.lang.Object r2 = nim.a.b(r1, r3)
            if (r2 != r4) goto L83
            return r4
        L83:
            java.lang.String r1 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u6k.f.b(com.revolut.domain.models.moneyrequest.MoneyRequest, gim.c):java.lang.Object");
    }
}
