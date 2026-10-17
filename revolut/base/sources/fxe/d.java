package fxe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y51.a f138812a;

    public d(y51.a externalCardsInteractor) {
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        this.f138812a = externalCardsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dj0.d r7, gim.c r8, java.lang.String r9) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof fxe.b
            if (r0 == 0) goto L13
            r0 = r8
            fxe.b r0 = (fxe.b) r0
            int r1 = r0.f138810w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f138810w = r1
            goto L18
        L13:
            fxe.b r0 = new fxe.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f138810w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L49
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            long r4 = r7.f115082a
            xi0.b r7 = r7.f115083b
            java.lang.String r7 = r7.f306286a
            y51.a r8 = r6.f138812a
            e0f.z r8 = (e0f.z) r8
            ufm.n r7 = r8.a(r4, r9, r7)
            r0.f138810w = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L49
            return r1
        L49:
            com.revolut.data.model.Data r8 = (com.revolut.data.model.Data) r8
            java.lang.Object r7 = r8.getContent()
            e71.b r7 = (e71.b) r7
            if (r7 == 0) goto L56
            dj0.d r7 = r7.f123019a
            goto L57
        L56:
            r7 = 0
        L57:
            dj0.d r7 = pyd.c.M(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fxe.d.a(dj0.d, gim.c, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dj0.d r5, com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof fxe.c
            if (r0 == 0) goto L13
            r0 = r7
            fxe.c r0 = (fxe.c) r0
            int r1 = r0.f138811w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f138811w = r1
            goto L18
        L13:
            fxe.c r0 = new fxe.c
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f138811w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L57
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            if (r6 != 0) goto L3c
            dj0.c r5 = dj0.d.Companion
            r5.getClass()
            dj0.d r5 = dj0.d.e
            return r5
        L3c:
            com.revolut.feature.topup_screen.common.CardDetails r6 = r6.f90484a
            java.lang.String r6 = r6.f90566a
            r7 = 9
            java.lang.String r6 = kotlin.text.f0.U0(r7, r6)
            y51.a r7 = r4.f138812a
            e0f.z r7 = (e0f.z) r7
            ufm.n r5 = r7.b(r5, r6)
            r0.f138811w = r3
            java.lang.Object r7 = nim.a.b(r5, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            java.lang.Object r5 = r7.getContent()
            e71.b r5 = (e71.b) r5
            if (r5 == 0) goto L64
            dj0.d r5 = r5.f123019a
            goto L65
        L64:
            r5 = 0
        L65:
            dj0.d r5 = pyd.c.M(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fxe.d.b(dj0.d, com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData, gim.c):java.lang.Object");
    }
}
