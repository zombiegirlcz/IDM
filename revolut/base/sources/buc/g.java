package buc;

import kotlin.jvm.internal.Intrinsics;
import smd.s;
import wtc.q0;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f18764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q0 f18765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f18766c;

    public g(ang.f userInteractor, q0 userCountryInteractor, s countryTransactionLimitsInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userCountryInteractor, "userCountryInteractor");
        Intrinsics.checkNotNullParameter(countryTransactionLimitsInteractor, "countryTransactionLimitsInteractor");
        this.f18764a = userInteractor;
        this.f18765b = userCountryInteractor;
        this.f18766c = countryTransactionLimitsInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        if (r6 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof buc.e
            if (r0 == 0) goto L13
            r0 = r6
            buc.e r0 = (buc.e) r0
            int r1 = r0.f18762w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18762w = r1
            goto L18
        L13:
            buc.e r0 = new buc.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f18762w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L70
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L49
        L36:
            yhm.o.b(r6)
            ang.f r6 = r5.f18764a
            r2 = 0
            efm.d0 r6 = r6.f(r2)
            r0.f18762w = r4
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L49
            goto L6f
        L49:
            do3.n r6 = (do3.n) r6
            wtc.q0 r2 = r5.f18765b
            r2.getClass()
            if (r6 == 0) goto L5b
            com.revolut.feature.address.models.Address r6 = r6.k
            if (r6 == 0) goto L5b
            wi0.b r6 = nz8.d.g(r6)
            goto L5c
        L5b:
            r6 = 0
        L5c:
            boolean r6 = com.bumptech.glide.d.v(r6)
            if (r6 == 0) goto L65
            com.revolut.feature.security_hub.impl.ui.LimitType$Basic r6 = com.revolut.feature.security_hub.impl.ui.LimitType.Basic.f85502a
            return r6
        L65:
            r0.f18762w = r3
            smd.s r6 = r5.f18766c
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L70
        L6f:
            return r1
        L70:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L7b
            com.revolut.feature.security_hub.impl.ui.LimitType$OutboundLimit r6 = com.revolut.feature.security_hub.impl.ui.LimitType.OutboundLimit.f85503a
            return r6
        L7b:
            com.revolut.feature.security_hub.impl.ui.LimitType$SepaExtended r6 = com.revolut.feature.security_hub.impl.ui.LimitType.SepaExtended.f85504a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: buc.g.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof buc.f
            if (r0 == 0) goto L13
            r0 = r5
            buc.f r0 = (buc.f) r0
            int r1 = r0.f18763w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18763w = r1
            goto L18
        L13:
            buc.f r0 = new buc.f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f18763w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f18764a
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f18763w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            do3.n r5 = (do3.n) r5
            wtc.q0 r0 = r4.f18765b
            r0.getClass()
            r0 = 0
            if (r5 == 0) goto L55
            com.revolut.feature.address.models.Address r1 = r5.k
            if (r1 == 0) goto L55
            wi0.b r1 = nz8.d.g(r1)
            goto L56
        L55:
            r1 = r0
        L56:
            boolean r1 = com.bumptech.glide.d.v(r1)
            if (r1 == 0) goto L5f
            com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType$Singapore r5 = com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType.Singapore.f85737a
            return r5
        L5f:
            if (r5 == 0) goto L6a
            com.revolut.feature.address.models.Address r1 = r5.k
            if (r1 == 0) goto L6a
            wi0.b r1 = nz8.d.g(r1)
            goto L6b
        L6a:
            r1 = r0
        L6b:
            boolean r1 = com.bumptech.glide.d.x(r1)
            if (r1 != 0) goto L98
            if (r5 == 0) goto L7b
            com.revolut.feature.address.models.Address r1 = r5.k
            if (r1 == 0) goto L7b
            wi0.b r0 = nz8.d.g(r1)
        L7b:
            boolean r0 = com.bumptech.glide.d.t(r0)
            if (r0 == 0) goto L82
            goto L98
        L82:
            com.revolut.feature.address.models.Address r5 = r5.k
            if (r5 == 0) goto L90
            wi0.b r5 = nz8.d.g(r5)
            com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType$SepaExtended r0 = new com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType$SepaExtended
            r0.<init>(r5)
            return r0
        L90:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "User has to have address for transaction limits"
            r5.<init>(r0)
            throw r5
        L98:
            com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType$WalletLimits r5 = com.revolut.feature.security_hub.impl.ui.transactions_limits.TransactionsLimitsScreenContract$LimitFlowType.WalletLimits.f85738a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: buc.g.b(gim.c):java.lang.Object");
    }
}
