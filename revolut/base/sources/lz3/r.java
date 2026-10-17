package lz3;

import kotlin.jvm.internal.Intrinsics;
import z6l.s;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f200932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wie.a f200933b;

    public r(s revolutCardsInteractor, wie.a creditAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(creditAccountDestinationResolver, "creditAccountDestinationResolver");
        this.f200932a = revolutCardsInteractor;
        this.f200933b = creditAccountDestinationResolver;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // lz3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(it3.d r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof lz3.q
            if (r0 == 0) goto L13
            r0 = r8
            lz3.q r0 = (lz3.q) r0
            int r1 = r0.f200931x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f200931x = r1
            goto L1a
        L13:
            lz3.q r0 = new lz3.q
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f200931x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r8)
            return r8
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            it3.d r7 = r0.u
            yhm.o.b(r8)
            goto L5c
        L3a:
            yhm.o.b(r8)
            r0.u = r7
            r0.f200931x = r4
            z6l.s r8 = r6.f200932a
            j6l.b r8 = r8.f319829a
            v6l.b1 r8 = (v6l.b1) r8
            w4l.f r8 = r8.f286432n
            v6l.h0$a r2 = v6l.h0.a.f286452a
            r4 = 0
            efm.b r8 = r8.g(r2, r4)
            java.lang.Object r8 = nim.a.a(r8, r0)
            if (r8 != r1) goto L57
            goto L59
        L57:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L59:
            if (r8 != r1) goto L5c
            goto L82
        L5c:
            java.lang.String r7 = r7.f168330m
            r8 = 0
            if (r7 != 0) goto L71
            java.util.concurrent.CopyOnWriteArrayList r7 = rd0.d.f253311a
            rd0.c r0 = rd0.c.WARNING
            r4 = 0
            r5 = 16
            java.lang.String r1 = "PayLaterExitDelegate"
            java.lang.String r2 = "facilityId is null after finishing the application"
            r3 = 0
            rd0.d.b(r0, r1, r2, r3, r4, r5)
            return r8
        L71:
            com.revolut.feature.credit.models.CreditAccountType$PayLater r2 = new com.revolut.feature.credit.models.CreditAccountType$PayLater
            r2.<init>(r7)
            r0.u = r8
            r0.f200931x = r3
            wie.a r7 = r6.f200933b
            java.lang.Object r7 = rie.b.a(r7, r2, r0)
            if (r7 != r1) goto L83
        L82:
            return r1
        L83:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lz3.r.a(it3.d, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
