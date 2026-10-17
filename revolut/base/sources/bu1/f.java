package bu1;

import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.BlikContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements vt1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fx1.a f18663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xt1.d f18664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt1.b f18665c;
    public final uw1.c d;
    public volatile Boolean e;
    public final hlm.c f;

    public f(fx1.a apmOnboardingRepository, xt1.d blikRepository, wt1.b blikDestinationProvider, uw1.c apmFeatureChecker) {
        Intrinsics.checkNotNullParameter(apmOnboardingRepository, "apmOnboardingRepository");
        Intrinsics.checkNotNullParameter(blikRepository, "blikRepository");
        Intrinsics.checkNotNullParameter(blikDestinationProvider, "blikDestinationProvider");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        this.f18663a = apmOnboardingRepository;
        this.f18664b = blikRepository;
        this.f18665c = blikDestinationProvider;
        this.d = apmFeatureChecker;
        this.f = hlm.d.a();
    }

    @Override // ly1.a
    public final boolean b(ApmContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return contact instanceof BlikContact;
    }

    @Override // my1.b
    public final Object c(gim.c cVar) {
        return ((fu1.b) this.f18665c).a(cVar);
    }

    @Override // ly1.a
    public final boolean d(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return product instanceof ApmBlik;
    }

    @Override // my1.a
    public final /* bridge */ /* synthetic */ Object e(ApmContact apmContact, sy1.b bVar) {
        return Boolean.FALSE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a8, code lost:
    
        if (r9 == r2) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // my1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gim.c r9) {
        /*
            r8 = this;
            java.lang.String r0 = "map(...)"
            boolean r1 = r9 instanceof bu1.b
            if (r1 == 0) goto L15
            r1 = r9
            bu1.b r1 = (bu1.b) r1
            int r2 = r1.f18656w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f18656w = r2
            goto L1a
        L15:
            bu1.b r1 = new bu1.b
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f18656w
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3f
            if (r3 == r5) goto L3b
            if (r3 != r4) goto L33
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            goto Lab
        L2d:
            r9 = move-exception
            goto Lae
        L30:
            r9 = move-exception
            goto Lc4
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            yhm.o.b(r9)
            goto L53
        L3f:
            yhm.o.b(r9)
            uw1.c r9 = r8.d
            ty1.b r9 = (ty1.b) r9
            ufm.i r9 = r9.a()
            r1.f18656w = r5
            java.lang.Object r9 = nim.a.b(r9, r1)
            if (r9 != r2) goto L53
            goto Laa
        L53:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L5e
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L5e:
            xt1.d r9 = r8.f18664b     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            com.revolut.feature.apm.blik.impl.data.network.BlikService r9 = r9.f308742a     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            efm.d0 r9 = r9.getBlikTransactions()     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            xrl.a r3 = new xrl.a     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r6 = 13
            r3.<init>(r6)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            xt1.a r6 = new xt1.a     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r6.<init>(r4, r3)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r9.getClass()     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            ufm.i r3 = new ufm.i     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r3.<init>(r9, r6, r5)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            ufm.n r9 = te0.w.i0(r3)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            bt9.t r3 = new bt9.t     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r6 = 5
            r3.<init>(r6)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            bs9.i0 r6 = new bs9.i0     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r7 = 8
            r6.<init>(r7, r3)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            ufm.i r3 = new ufm.i     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r3.<init>(r9, r6, r5)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            bt9.t r9 = new bt9.t     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r0 = 6
            r9.<init>(r0)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            zhm.h0 r0 = zhm.h0.f322473a     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            pfm.z r9 = ue0.e.I(r3, r0, r9)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            r1.f18656w = r4     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            java.lang.Object r9 = nim.a.b(r9, r1)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            if (r9 != r2) goto Lab
        Laa:
            return r2
        Lab:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L30
            goto Lb9
        Lae:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r9, r0)
            r9 = r2
        Lb9:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r9 = kotlin.jvm.internal.Intrinsics.f(r9, r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        Lc4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bu1.f.i(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // my1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(gim.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof bu1.c
            if (r0 == 0) goto L13
            r0 = r9
            bu1.c r0 = (bu1.c) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            bu1.c r0 = new bu1.c
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f18659y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            hlm.a r1 = r0.v
            bu1.f r0 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L81
        L2f:
            r9 = move-exception
            goto L9d
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            int r2 = r0.f18658x
            int r4 = r0.f18657w
            hlm.a r6 = r0.v
            bu1.f r7 = r0.u
            yhm.o.b(r9)
            r9 = r6
            goto L69
        L47:
            yhm.o.b(r9)
            java.lang.Boolean r9 = r8.e
            if (r9 == 0) goto L53
            boolean r9 = r9.booleanValue()
            goto L98
        L53:
            hlm.c r9 = r8.f
            r0.u = r8
            r0.v = r9
            r2 = 0
            r0.f18657w = r2
            r0.f18658x = r2
            r0.A = r4
            java.lang.Object r4 = r9.lock(r5, r0)
            if (r4 != r1) goto L67
            goto L7d
        L67:
            r7 = r8
            r4 = r2
        L69:
            java.lang.Boolean r6 = r7.e     // Catch: java.lang.Throwable -> L8b
            if (r6 != 0) goto L8f
            r0.u = r7     // Catch: java.lang.Throwable -> L8b
            r0.v = r9     // Catch: java.lang.Throwable -> L8b
            r0.f18657w = r4     // Catch: java.lang.Throwable -> L8b
            r0.f18658x = r2     // Catch: java.lang.Throwable -> L8b
            r0.A = r3     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r0 = r7.o(r0)     // Catch: java.lang.Throwable -> L8b
            if (r0 != r1) goto L7e
        L7d:
            return r1
        L7e:
            r1 = r9
            r9 = r0
            r0 = r7
        L81:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2f
            r0.e = r9     // Catch: java.lang.Throwable -> L2f
            r9 = r2
            goto L95
        L8b:
            r0 = move-exception
            r1 = r9
            r9 = r0
            goto L9d
        L8f:
            boolean r0 = r6.booleanValue()     // Catch: java.lang.Throwable -> L8b
            r1 = r9
            r9 = r0
        L95:
            r1.unlock(r5)
        L98:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        L9d:
            r1.unlock(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bu1.f.j(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof bu1.d
            if (r0 == 0) goto L13
            r0 = r5
            bu1.d r0 = (bu1.d) r0
            int r1 = r0.f18660w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18660w = r1
            goto L18
        L13:
            bu1.d r0 = new bu1.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f18660w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            com.revolut.feature.apm.core.api.product.ApmBlik r5 = com.revolut.feature.apm.core.api.product.ApmBlik.f61809c
            r0.f18660w = r3
            fx1.a r2 = r4.f18663a
            java.lang.Object r5 = fx1.a.a(r2, r5, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            boolean r5 = r5 instanceof com.revolut.feature.apm.core.models.onboarding.ApmOnboardingStatus.Active
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bu1.f.o(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // my1.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.apm.core.models.recipients.BlikContact r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof bu1.e
            if (r0 == 0) goto L13
            r0 = r6
            bu1.e r0 = (bu1.e) r0
            int r1 = r0.f18662x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18662x = r1
            goto L18
        L13:
            bu1.e r0 = new bu1.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f18662x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.recipients.BlikContact r5 = r0.u
            yhm.o.b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f18662x = r3
            java.lang.Object r6 = r4.j(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            com.revolut.feature.apm.core.models.recipients.ApmContact$SimpleState r5 = r5.f
            com.revolut.feature.apm.core.models.recipients.ApmContact$State$ACTIVE r0 = com.revolut.feature.apm.core.models.recipients.ApmContact.State.ACTIVE.f62099a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r5, r0)
            if (r0 == 0) goto L50
            goto L59
        L50:
            com.revolut.feature.apm.core.models.recipients.ApmContact$State$DELETED r6 = com.revolut.feature.apm.core.models.recipients.ApmContact.State.DELETED.f62100a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 == 0) goto L5e
            r6 = 0
        L59:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            return r5
        L5e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bu1.f.h(com.revolut.feature.apm.core.models.recipients.BlikContact, gim.c):java.lang.Object");
    }
}
