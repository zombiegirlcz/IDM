package hxe;

import com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f156575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hy2.f f156576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CheckoutFlowContract$InputData f156577c;

    public d(gte.a featureToggleInteractor, hy2.f cardDesignInteractor, CheckoutFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f156575a = featureToggleInteractor;
        this.f156576b = cardDesignInteractor;
        this.f156577c = inputData;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(uwe.a r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof hxe.c
            if (r0 == 0) goto L13
            r0 = r9
            hxe.c r0 = (hxe.c) r0
            int r1 = r0.f156574w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f156574w = r1
            goto L18
        L13:
            hxe.c r0 = new hxe.c
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f156574w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2c
            goto Lb7
        L29:
            r8 = move-exception
            goto Lba
        L2c:
            r8 = move-exception
            goto Lc4
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r9)
            com.revolut.feature.cards_core.api.CardsCoreApi$Toggles$CardOrderDiscountsWithRevPoints r9 = com.revolut.feature.cards_core.api.CardsCoreApi$Toggles.CardOrderDiscountsWithRevPoints.f65558c
            gte.a r2 = r7.f156575a
            jte.d r2 = (jte.d) r2
            boolean r9 = r2.c(r9)
            if (r9 != 0) goto L48
            goto La9
        L48:
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order r9 = r8.f283629a
            boolean r2 = r9 instanceof com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order.Checkout
            if (r2 != 0) goto L50
            goto La9
        L50:
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order$Checkout r9 = (com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order.Checkout) r9
            com.revolut.feature.checkout.models.CheckoutOrder r9 = r9.f90710a
            pi3.d r9 = r9.d
            if (r9 == 0) goto L5b
            pi3.i r9 = r9.f236397p
            goto L5c
        L5b:
            r9 = r4
        L5c:
            com.revolut.feature.topup_screen.impl.flows.checkout.flow.CheckoutFlowContract$InputData r2 = r7.f156577c
            com.revolut.feature.checkout.models.CheckoutParams r2 = r2.f90668a
            boolean r5 = r2 instanceof com.revolut.feature.checkout.models.CheckoutParams.CardOrder
            if (r5 == 0) goto L67
            com.revolut.feature.checkout.models.CheckoutParams$CardOrder r2 = (com.revolut.feature.checkout.models.CheckoutParams.CardOrder) r2
            goto L68
        L67:
            r2 = r4
        L68:
            if (r2 == 0) goto L6d
            b93.f r5 = r2.f65850a
            goto L6e
        L6d:
            r5 = r4
        L6e:
            boolean r6 = r5 instanceof b93.g
            if (r6 == 0) goto L75
            b93.g r5 = (b93.g) r5
            goto L76
        L75:
            r5 = r4
        L76:
            if (r5 == 0) goto L7f
            c93.j r5 = r5.f13623h
            if (r5 == 0) goto L7f
            c93.l r5 = r5.f22288a
            goto L80
        L7f:
            r5 = r4
        L80:
            if (r2 == 0) goto L85
            b93.f r2 = r2.f65850a
            goto L86
        L85:
            r2 = r4
        L86:
            boolean r6 = r2 instanceof b93.g
            if (r6 == 0) goto L8d
            b93.g r2 = (b93.g) r2
            goto L8e
        L8d:
            r2 = r4
        L8e:
            if (r2 == 0) goto L97
            c93.j r2 = r2.i
            if (r2 == 0) goto L97
            c93.l r2 = r2.f22288a
            goto L98
        L97:
            r2 = r4
        L98:
            if (r5 != 0) goto L9f
            if (r2 != 0) goto L9f
            if (r9 != 0) goto L9f
            goto La9
        L9f:
            long r8 = uwe.h.a(r8)
            r5 = 0
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 > 0) goto Laa
        La9:
            return r4
        Laa:
            hy2.f r2 = r7.f156576b     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2c
            r0.f156574w = r3     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2c
            v6l.s r2 = r2.f156704a     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2c
            java.lang.Object r9 = r2.b(r8, r0)     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2c
            if (r9 != r1) goto Lb7
            return r1
        Lb7:
            e93.c r9 = (e93.c) r9     // Catch: java.lang.Exception -> L29 java.util.concurrent.CancellationException -> L2c
            return r9
        Lba:
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r4, r4, r8, r9)
            return r4
        Lc4:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: hxe.d.a(uwe.a, gim.c):java.lang.Object");
    }
}
