package lz3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wie.a f200920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al4.q f200921b;

    public f(al4.q creditCardProductInteractor, wie.a creditAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(creditAccountDestinationResolver, "creditAccountDestinationResolver");
        Intrinsics.checkNotNullParameter(creditCardProductInteractor, "creditCardProductInteractor");
        this.f200920a = creditAccountDestinationResolver;
        this.f200921b = creditCardProductInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // lz3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(it3.d r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof lz3.e
            if (r0 == 0) goto L13
            r0 = r13
            lz3.e r0 = (lz3.e) r0
            int r1 = r0.f200919x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f200919x = r1
            goto L1a
        L13:
            lz3.e r0 = new lz3.e
            gim.c r13 = (gim.c) r13
            r0.<init>(r11, r13)
        L1a:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f200919x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r13)
            return r13
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            it3.d r12 = r0.u
            yhm.o.b(r13)
            goto L4a
        L3a:
            yhm.o.b(r13)
            r0.u = r12
            r0.f200919x = r4
            al4.q r13 = r11.f200921b
            java.lang.Object r13 = al4.q.a(r13, r0)
            if (r13 != r1) goto L4a
            goto L79
        L4a:
            it3.k r13 = r12.f168334r
            it3.k r2 = it3.k.CC_CLI_USER_INITIATED
            r4 = 0
            if (r13 != r2) goto L52
            return r4
        L52:
            java.lang.String r12 = r12.f168330m
            if (r12 != 0) goto L66
            java.util.concurrent.CopyOnWriteArrayList r12 = rd0.d.f253311a
            rd0.c r5 = rd0.c.WARNING
            r9 = 0
            r10 = 16
            java.lang.String r6 = "CreditCardLimitIncreaseExitDelegate"
            java.lang.String r7 = "facilityId is null after finishing the application"
            r8 = 0
            rd0.d.b(r5, r6, r7, r8, r9, r10)
            return r4
        L66:
            com.revolut.feature.credit.models.CreditAccountType$CreditCard r13 = new com.revolut.feature.credit.models.CreditAccountType$CreditCard
            r13.<init>(r12)
            r0.u = r4
            r0.f200919x = r3
            rie.a r12 = rie.b.Companion
            wie.a r12 = r11.f200920a
            java.lang.Object r12 = r12.c(r13, r4, r0)
            if (r12 != r1) goto L7a
        L79:
            return r1
        L7a:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: lz3.f.a(it3.d, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
