package fg6;

import ang.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f134901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f134902b;

    public b(f userInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f134901a = featureToggleInteractor;
        this.f134902b = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof fg6.a
            if (r0 == 0) goto L13
            r0 = r6
            fg6.a r0 = (fg6.a) r0
            int r1 = r0.f134900w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f134900w = r1
            goto L18
        L13:
            fg6.a r0 = new fg6.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f134900w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            goto L55
        L28:
            r6 = move-exception
            goto L78
        L2a:
            r6 = move-exception
            goto L82
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            yhm.o.b(r6)
            com.revolut.feature.external_accounts.api.CrossBorderOpenBankingApi$Toggles$CrossBorderInstitutionFlowImprovements r6 = com.revolut.feature.external_accounts.api.CrossBorderOpenBankingApi$Toggles.CrossBorderInstitutionFlowImprovements.f72200c
            gte.a r2 = r5.f134901a
            jte.d r2 = (jte.d) r2
            boolean r6 = r2.c(r6)
            if (r6 != 0) goto L44
            goto L77
        L44:
            ang.f r6 = r5.f134902b     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            zmg.d r6 = r6.d     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            efm.k r6 = r6.c()     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            r0.f134900w = r3     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            java.lang.Object r6 = nim.a.i(r6, r0)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            if (r6 != r1) goto L55
            return r1
        L55:
            do3.n r6 = (do3.n) r6     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            if (r6 == 0) goto L77
            com.revolut.feature.address.models.Address r6 = r6.k     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            if (r6 == 0) goto L77
            java.lang.String r6 = r6.getCountry()     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            if (r6 == 0) goto L77
            boolean r0 = kotlin.text.d0.W(r6)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            if (r0 != 0) goto L6a
            goto L6b
        L6a:
            r6 = r4
        L6b:
            if (r6 == 0) goto L77
            wi0.a r0 = wi0.b.Companion     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            r0.getClass()     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            wi0.b r6 = wi0.a.a(r6)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a
            return r6
        L77:
            return r4
        L78:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r4, r4, r6, r0)
            return r4
        L82:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fg6.b.a(gim.c):java.io.Serializable");
    }
}
