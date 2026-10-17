package ls1;

import com.revolut.feature.apm.core.api.product.ApmBizum;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements my1.a, my1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hs1.c f199594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oz1.c f199595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uw1.c f199596c;
    public volatile Boolean d;
    public final hlm.c e;

    public h(hs1.c repository, oz1.c apmConsentsInteractor, uw1.c apmFeatureChecker) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(apmConsentsInteractor, "apmConsentsInteractor");
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        this.f199594a = repository;
        this.f199595b = apmConsentsInteractor;
        this.f199596c = apmFeatureChecker;
        this.e = hlm.d.a();
    }

    @Override // ly1.a
    public final boolean b(ApmContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return contact instanceof BizumContact;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // my1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ls1.b
            if (r0 == 0) goto L13
            r0 = r6
            ls1.b r0 = (ls1.b) r0
            int r1 = r0.f199584w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f199584w = r1
            goto L18
        L13:
            ls1.b r0 = new ls1.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f199584w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r6)
            goto L4e
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            yhm.o.b(r6)
            r0.f199584w = r4
            oz1.c r6 = r5.f199595b
            iz1.b r6 = r6.f231102a
            r6.getClass()
            imk.p0 r2 = new imk.p0
            r4 = 9
            r2.<init>(r6, r3, r4)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r6, r2, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = zhm.d0.d0(r6)
            d02.b r6 = (d02.b) r6
            if (r6 == 0) goto L66
            com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmConsentNavigation$Destination r0 = new com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmConsentNavigation$Destination
            com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmConsentNavigation$InputData r1 = new com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmConsentNavigation$InputData
            java.lang.String r6 = r6.f110280a
            r2 = 0
            r1.<init>(r6, r2)
            r0.<init>(r1)
            return r0
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ls1.h.c(gim.c):java.lang.Object");
    }

    @Override // ly1.a
    public final boolean d(dx1.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        return product instanceof ApmBizum;
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
    public final java.lang.Object i(gim.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ls1.c
            if (r0 == 0) goto L13
            r0 = r6
            ls1.c r0 = (ls1.c) r0
            int r1 = r0.f199585w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f199585w = r1
            goto L18
        L13:
            ls1.c r0 = new ls1.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f199585w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r6)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            goto L66
        L2a:
            r6 = move-exception
            goto L69
        L2c:
            r6 = move-exception
            goto L7f
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
            uw1.c r6 = r5.f199596c
            ty1.b r6 = (ty1.b) r6
            yoj.c r2 = yoj.c.APM_BIZUM
            pfm.z r6 = r6.c(r2)
            r0.f199585w = r4
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
            oz1.c r6 = r5.f199595b     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            r0.f199585w = r3     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.Object r6 = r6.b(r0)     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            if (r6 != r1) goto L66
        L65:
            return r1
        L66:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Exception -> L2a java.util.concurrent.CancellationException -> L2c
            goto L74
        L69:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r6, r0)
            r6 = r2
        L74:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L7f:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ls1.h.i(gim.c):java.lang.Object");
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
            boolean r0 = r9 instanceof ls1.d
            if (r0 == 0) goto L13
            r0 = r9
            ls1.d r0 = (ls1.d) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            ls1.d r0 = new ls1.d
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f199588y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            hlm.a r1 = r0.v
            ls1.h r0 = r0.u
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
            int r2 = r0.f199587x
            int r4 = r0.f199586w
            hlm.a r6 = r0.v
            ls1.h r7 = r0.u
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
            r0.f199586w = r2
            r0.f199587x = r2
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
            r0.f199586w = r4     // Catch: java.lang.Throwable -> L8b
            r0.f199587x = r2     // Catch: java.lang.Throwable -> L8b
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
        throw new UnsupportedOperationException("Method not decompiled: ls1.h.j(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(gim.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ls1.e
            if (r0 == 0) goto L13
            r0 = r6
            ls1.e r0 = (ls1.e) r0
            int r1 = r0.f199589w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f199589w = r1
            goto L18
        L13:
            ls1.e r0 = new ls1.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f199589w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L48
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            r0.f199589w = r3
            hs1.a r6 = new hs1.a
            r2 = 0
            r3 = 0
            hs1.c r4 = r5.f199594a
            r6.<init>(r4, r2, r3)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r2, r6, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            boolean r6 = r6 instanceof com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus.Active
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ls1.h.o(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // my1.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature.apm.core.models.recipients.BizumContact r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ls1.f
            if (r0 == 0) goto L13
            r0 = r6
            ls1.f r0 = (ls1.f) r0
            int r1 = r0.f199591x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f199591x = r1
            goto L18
        L13:
            ls1.f r0 = new ls1.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f199591x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.recipients.BizumContact r5 = r0.u
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
            r0.f199591x = r3
            java.lang.Object r6 = r4.j(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 == 0) goto L50
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor r6 = r5.f62117b
            boolean r6 = r6 instanceof com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Phone
            if (r6 == 0) goto L50
            r6 = r3
            goto L51
        L50:
            r6 = r0
        L51:
            com.revolut.feature.apm.core.models.recipients.ApmContact$State r1 = r5.f
            com.revolut.feature.apm.core.models.recipients.ApmContact$State$ACTIVE r2 = com.revolut.feature.apm.core.models.recipients.ApmContact.State.ACTIVE.f62099a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r2 == 0) goto L5d
            r3 = r6
            goto L75
        L5d:
            com.revolut.feature.apm.core.models.recipients.ApmContact$State$DELETED r2 = com.revolut.feature.apm.core.models.recipients.ApmContact.State.DELETED.f62100a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r2 == 0) goto L67
        L65:
            r3 = r0
            goto L75
        L67:
            com.revolut.feature.apm.core.models.recipients.ApmContact$State$NOT_REGISTERED r2 = com.revolut.feature.apm.core.models.recipients.ApmContact.State.NOT_REGISTERED.f62101a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r1 == 0) goto L7a
            if (r6 == 0) goto L65
            java.lang.String r5 = r5.d
            if (r5 != 0) goto L65
        L75:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L7a:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ls1.h.e(com.revolut.feature.apm.core.models.recipients.BizumContact, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // my1.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.apm.core.models.recipients.BizumContact r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ls1.g
            if (r0 == 0) goto L13
            r0 = r6
            ls1.g r0 = (ls1.g) r0
            int r1 = r0.f199593x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f199593x = r1
            goto L18
        L13:
            ls1.g r0 = new ls1.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f199593x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.recipients.BizumContact r5 = r0.u
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
            r0.f199593x = r3
            java.lang.Object r6 = r4.j(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 == 0) goto L50
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor r6 = r5.f62117b
            boolean r6 = r6 instanceof com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Phone
            if (r6 == 0) goto L50
            r6 = r3
            goto L51
        L50:
            r6 = r0
        L51:
            com.revolut.feature.apm.core.models.recipients.ApmContact$State r1 = r5.f
            com.revolut.feature.apm.core.models.recipients.ApmContact$State$ACTIVE r2 = com.revolut.feature.apm.core.models.recipients.ApmContact.State.ACTIVE.f62099a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r2 == 0) goto L5d
            r3 = r6
            goto L77
        L5d:
            com.revolut.feature.apm.core.models.recipients.ApmContact$State$DELETED r2 = com.revolut.feature.apm.core.models.recipients.ApmContact.State.DELETED.f62100a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r2 == 0) goto L67
        L65:
            r3 = r0
            goto L77
        L67:
            com.revolut.feature.apm.core.models.recipients.ApmContact$State$NOT_REGISTERED r2 = com.revolut.feature.apm.core.models.recipients.ApmContact.State.NOT_REGISTERED.f62101a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r1 == 0) goto L7c
            if (r6 == 0) goto L65
            boolean r5 = r5.b()
            if (r5 != 0) goto L65
        L77:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L7c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ls1.h.h(com.revolut.feature.apm.core.models.recipients.BizumContact, gim.c):java.lang.Object");
    }
}
