package q2a;

import bn2.p;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f241555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f241556b;

    public f(p backgroundsInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f241555a = backgroundsInteractor;
        this.f241556b = walletInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof q2a.c
            if (r0 == 0) goto L13
            r0 = r7
            q2a.c r0 = (q2a.c) r0
            int r1 = r0.f241551w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241551w = r1
            goto L18
        L13:
            q2a.c r0 = new q2a.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241551w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L54
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L49
        L36:
            yhm.o.b(r7)
            com.revolut.feature.backgroundpicker.models.RetailThemeAgnosticBackgroundKey$Chat r7 = new com.revolut.feature.backgroundpicker.models.RetailThemeAgnosticBackgroundKey$Chat
            r7.<init>(r6)
            r0.f241551w = r4
            bn2.p r6 = r5.f241555a
            java.lang.Object r7 = r6.c(r7, r0)
            if (r7 != r1) goto L49
            goto L53
        L49:
            com.revolut.feature.backgroundpicker.api.model.PersistedBackground r7 = (com.revolut.feature.backgroundpicker.api.model.PersistedBackground) r7
            r0.f241551w = r3
            java.lang.Object r7 = r5.c(r7, r0)
            if (r7 != r1) goto L54
        L53:
            return r1
        L54:
            com.revolut.feature.backgroundpicker.api.model.PersistedBackground r7 = (com.revolut.feature.backgroundpicker.api.model.PersistedBackground) r7
            com.revolut.feature.backgroundpicker.api.model.ChosenBackground r6 = r7.f63743a
            com.revolut.core.ui_kit.models.NavBarWithContainerBackground r6 = r6.f63742b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q2a.f.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof q2a.d
            if (r0 == 0) goto L13
            r0 = r10
            q2a.d r0 = (q2a.d) r0
            int r1 = r0.f241552w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241552w = r1
            goto L18
        L13:
            q2a.d r0 = new q2a.d
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241552w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r10)
            return r10
        L2b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L33:
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L39
            goto L4f
        L37:
            r10 = move-exception
            goto L52
        L39:
            r10 = move-exception
            goto L85
        L3b:
            yhm.o.b(r10)
            wsg.n r10 = r9.f241556b     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L39
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L39
            ufm.i r10 = r10.y(r2)     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L39
            r0.f241552w = r4     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L39
            java.lang.Object r10 = nim.a.b(r10, r0)     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L39
            if (r10 != r1) goto L4f
            goto L83
        L4f:
            io3.d r10 = (io3.d) r10     // Catch: java.lang.Exception -> L37 java.util.concurrent.CancellationException -> L39
            goto L5c
        L52:
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r4 = rd0.d.f253311a
            rd0.c r4 = rd0.c.ERROR
            rd0.d.a(r4, r5, r5, r10, r2)
            r10 = r5
        L5c:
            if (r10 != 0) goto L5f
            return r5
        L5f:
            com.revolut.feature.backgroundpicker.models.RetailBackgroundKey$PersonalCurrency r2 = new com.revolut.feature.backgroundpicker.models.RetailBackgroundKey$PersonalCurrency
            java.lang.String r4 = r10.f163145a
            xi0.a r6 = xi0.b.Companion
            java.lang.String r10 = r10.f163147c
            r6.getClass()
            xi0.b r10 = xi0.a.a(r10)
            com.revolut.feature.backgroundpicker.models.EntityInfo r6 = new com.revolut.feature.backgroundpicker.models.EntityInfo
            md6.e r7 = md6.e.CURRENCY
            r8 = 6
            r6.<init>(r7, r5, r5, r8)
            r2.<init>(r4, r10, r6)
            r0.f241552w = r3
            bn2.p r10 = r9.f241555a
            java.lang.Object r10 = r10.c(r2, r0)
            if (r10 != r1) goto L84
        L83:
            return r1
        L84:
            return r10
        L85:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: q2a.f.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.backgroundpicker.api.model.PersistedBackground r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof q2a.e
            if (r0 == 0) goto L13
            r0 = r6
            q2a.e r0 = (q2a.e) r0
            int r1 = r0.f241554x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f241554x = r1
            goto L18
        L13:
            q2a.e r0 = new q2a.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f241554x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.backgroundpicker.api.model.PersistedBackground r5 = r0.u
            yhm.o.b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            boolean r6 = r5.f63744b
            if (r6 != 0) goto L39
            return r5
        L39:
            r0.u = r5
            r0.f241554x = r3
            java.lang.Object r6 = r4.b(r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            com.revolut.feature.backgroundpicker.api.model.PersistedBackground r6 = (com.revolut.feature.backgroundpicker.api.model.PersistedBackground) r6
            if (r6 != 0) goto L49
            return r5
        L49:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q2a.f.c(com.revolut.feature.backgroundpicker.api.model.PersistedBackground, gim.c):java.lang.Object");
    }
}
