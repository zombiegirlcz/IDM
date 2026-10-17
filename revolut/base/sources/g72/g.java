package g72;

import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.MultibancoContact;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoFlowDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements my1.a, my1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a72.h f141081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a72.f f141082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uw1.c f141083c;
    public volatile Boolean d;
    public final hlm.c e;

    public g(a72.h repository, a72.f pendingPaymentRepository, uw1.c apmFeatureChecker) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pendingPaymentRepository, "pendingPaymentRepository");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        this.f141081a = repository;
        this.f141082b = pendingPaymentRepository;
        this.f141083c = apmFeatureChecker;
        this.e = hlm.d.a();
    }

    @Override // ly1.a
    public final boolean b(ApmContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return contact instanceof MultibancoContact;
    }

    @Override // my1.b
    public final Object c(gim.c cVar) {
        return new MultibancoFlowDestination(0);
    }

    @Override // ly1.a
    public final boolean d(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return product instanceof ApmMultibanco;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        if (r6 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // my1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof g72.b
            if (r0 == 0) goto L13
            r0 = r6
            g72.b r0 = (g72.b) r0
            int r1 = r0.f141072w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141072w = r1
            goto L18
        L13:
            g72.b r0 = new g72.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f141072w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            goto L66
        L2a:
            r6 = move-exception
            goto L72
        L2c:
            r6 = move-exception
            goto L88
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            yhm.o.b(r6)
            goto L50
        L3a:
            yhm.o.b(r6)
            uw1.c r6 = r5.f141083c
            ty1.b r6 = (ty1.b) r6
            yoj.c r2 = yoj.c.APM_MULTIBANCO
            pfm.z r6 = r6.c(r2)
            r0.f141072w = r4
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L50
            goto L65
        L50:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L5b
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L5b:
            a72.f r6 = r5.f141082b     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r0.f141072w = r3     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.Object r6 = r6.a(r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r6 = r6 ^ r4
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            goto L7d
        L72:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r6, r0)
            r6 = r2
        L7d:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L88:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g72.g.i(gim.c):java.lang.Object");
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
            boolean r0 = r9 instanceof g72.c
            if (r0 == 0) goto L13
            r0 = r9
            g72.c r0 = (g72.c) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            g72.c r0 = new g72.c
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f141075y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            hlm.a r1 = r0.v
            g72.g r0 = r0.u
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
            int r2 = r0.f141074x
            int r4 = r0.f141073w
            hlm.a r6 = r0.v
            g72.g r7 = r0.u
            yhm.o.b(r9)
            r9 = r6
            goto L69
        L47:
            yhm.o.b(r9)
            java.lang.Boolean r9 = r8.d
            if (r9 == 0) goto L53
            boolean r9 = r9.booleanValue()
            goto L98
        L53:
            hlm.c r9 = r8.e
            r0.u = r8
            r0.v = r9
            r2 = 0
            r0.f141073w = r2
            r0.f141074x = r2
            r0.A = r4
            java.lang.Object r4 = r9.lock(r5, r0)
            if (r4 != r1) goto L67
            goto L7d
        L67:
            r7 = r8
            r4 = r2
        L69:
            java.lang.Boolean r6 = r7.d     // Catch: java.lang.Throwable -> L8b
            if (r6 != 0) goto L8f
            r0.u = r7     // Catch: java.lang.Throwable -> L8b
            r0.v = r9     // Catch: java.lang.Throwable -> L8b
            r0.f141073w = r4     // Catch: java.lang.Throwable -> L8b
            r0.f141074x = r2     // Catch: java.lang.Throwable -> L8b
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
            r0.d = r9     // Catch: java.lang.Throwable -> L2f
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
        throw new UnsupportedOperationException("Method not decompiled: g72.g.j(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof g72.d
            if (r0 == 0) goto L13
            r0 = r5
            g72.d r0 = (g72.d) r0
            int r1 = r0.f141076w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141076w = r1
            goto L18
        L13:
            g72.d r0 = new g72.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f141076w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f141076w = r3
            a72.h r5 = r4.f141081a
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            boolean r5 = r5 instanceof com.revolut.feature.apm.core.models.multibanco.MultibancoRegistrationStatus.Registered
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g72.g.o(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // my1.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature.apm.core.models.recipients.MultibancoContact r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g72.e
            if (r0 == 0) goto L13
            r0 = r6
            g72.e r0 = (g72.e) r0
            int r1 = r0.f141078x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141078x = r1
            goto L18
        L13:
            g72.e r0 = new g72.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f141078x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.recipients.MultibancoContact r5 = r0.u
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
            r0.f141078x = r3
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
        throw new UnsupportedOperationException("Method not decompiled: g72.g.e(com.revolut.feature.apm.core.models.recipients.MultibancoContact, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // my1.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.apm.core.models.recipients.MultibancoContact r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof g72.f
            if (r0 == 0) goto L13
            r0 = r6
            g72.f r0 = (g72.f) r0
            int r1 = r0.f141080x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141080x = r1
            goto L18
        L13:
            g72.f r0 = new g72.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f141080x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.recipients.MultibancoContact r5 = r0.u
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
            r0.f141080x = r3
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
        throw new UnsupportedOperationException("Method not decompiled: g72.g.h(com.revolut.feature.apm.core.models.recipients.MultibancoContact, gim.c):java.lang.Object");
    }
}
