package rg4;

import kotlin.jvm.internal.Intrinsics;
import xq3.z;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f254020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.credit.application.models.preapplication.a f254021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f254022c;

    public f(z interactor, com.revolut.feature.credit.application.models.preapplication.a scenarioMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(scenarioMapper, "scenarioMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f254020a = interactor;
        this.f254021b = scenarioMapper;
        this.f254022c = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ft3.d1 r20, ft3.a1 r21, gim.c r22) throws java.lang.Throwable {
        /*
            r19 = this;
            r1 = r19
            r0 = r22
            boolean r2 = r0 instanceof rg4.e
            if (r2 == 0) goto L17
            r2 = r0
            rg4.e r2 = (rg4.e) r2
            int r3 = r2.f254019x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f254019x = r3
            goto L1c
        L17:
            rg4.e r2 = new rg4.e
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f254019x
            r9 = 0
            r5 = 1
            rg4.b r11 = rg4.b.f254017a
            if (r4 == 0) goto L3e
            if (r4 != r5) goto L36
            com.revolut.feature.credit.application.models.preapplication.a r2 = r2.u
            yhm.o.b(r0)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L33
            goto L9b
        L30:
            r0 = move-exception
            goto La5
        L33:
            r0 = move-exception
            goto Lbb
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3e:
            yhm.o.b(r0)
            r8 = r20
            ft3.j1 r0 = r8.f137810a
            r0.getClass()
            ft3.j1 r12 = ft3.j1.CREDIT_CARD
            ft3.j1 r13 = ft3.j1.FIXED_TERM_CREDIT
            ft3.j1 r14 = ft3.j1.MORTGAGE
            ft3.j1 r15 = ft3.j1.REFINANCING_MORTGAGE
            ft3.j1 r16 = ft3.j1.OVERDRAFT
            ft3.j1 r17 = ft3.j1.BUY_NOW_PAY_LATER
            ft3.j1[] r4 = new ft3.j1[]{r12, r13, r14, r15, r16, r17}
            java.lang.String r6 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            java.util.Set r4 = kotlin.collections.d.y0(r4)
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L68
            goto L74
        L68:
            com.revolut.feature.credit.application.api.CreditApplicationApi$Toggles$CreditPreApplicationChecks r0 = com.revolut.feature.credit.application.api.CreditApplicationApi$Toggles.CreditPreApplicationChecks.f66190c
            gte.a r4 = r1.f254022c
            jte.d r4 = (jte.d) r4
            boolean r0 = r4.c(r0)
            if (r0 != 0) goto L75
        L74:
            return r11
        L75:
            com.revolut.feature.credit.application.models.preapplication.a r0 = r1.f254021b     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L33
            xq3.z r4 = r1.f254020a     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L33
            r2.u = r0     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L33
            r2.f254019x = r5     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L33
            xr3.g0 r7 = r4.f308103a     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L33
            r7.getClass()     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L33
            xge.f r5 = new xge.f     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L33
            r10 = 17
            r6 = r21
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L33
            skm.p0 r4 = skm.p0.f264001a     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L33
            elm.f r4 = elm.f.f127540b     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L33
            java.lang.Object r2 = skm.e0.J(r4, r5, r2)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L33
            if (r2 != r3) goto L96
            return r3
        L96:
            r18 = r2
            r2 = r0
            r0 = r18
        L9b:
            et3.b r0 = (et3.b) r0     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L33
            r2.getClass()     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L33
            com.revolut.feature.credit.application.models.preapplication.PreApplicationChecksScenario r0 = com.revolut.feature.credit.application.models.preapplication.a.a(r0)     // Catch: java.lang.Exception -> L30 java.util.concurrent.CancellationException -> L33
            goto Lb0
        La5:
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a
            rd0.c r3 = rd0.c.ERROR
            rd0.d.a(r3, r9, r9, r0, r2)
            com.revolut.feature.credit.application.models.preapplication.PreApplicationChecksScenario$Ready r0 = com.revolut.feature.credit.application.models.preapplication.PreApplicationChecksScenario.Ready.f66269a
        Lb0:
            boolean r2 = r0 instanceof com.revolut.feature.credit.application.models.preapplication.PreApplicationChecksScenario.Ready
            if (r2 == 0) goto Lb5
            goto Lba
        Lb5:
            rg4.a r11 = new rg4.a
            r11.<init>(r0)
        Lba:
            return r11
        Lbb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rg4.f.a(ft3.d1, ft3.a1, gim.c):java.lang.Object");
    }
}
