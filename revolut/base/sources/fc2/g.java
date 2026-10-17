package fc2;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.QvikContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements my1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.c f133620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Boolean f133621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Boolean f133622c;
    public final hlm.c d;
    public final hlm.c e;

    public g(uw1.c apmFeatureChecker) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        this.f133620a = apmFeatureChecker;
        this.d = hlm.d.a();
        this.e = hlm.d.a();
    }

    @Override // ly1.a
    public final boolean b(ApmContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return contact instanceof QvikContact;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // my1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(gim.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof fc2.b
            if (r0 == 0) goto L13
            r0 = r6
            fc2.b r0 = (fc2.b) r0
            int r1 = r0.f133609w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f133609w = r1
            goto L18
        L13:
            fc2.b r0 = new fc2.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f133609w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L42
        L36:
            yhm.o.b(r6)
            r0.f133609w = r4
            java.lang.Object r6 = r5.o(r0)
            if (r6 != r1) goto L42
            goto L52
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L54
            r0.f133609w = r3
            java.lang.Object r6 = r5.p(r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            return r6
        L54:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fc2.g.j(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(gim.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof fc2.c
            if (r0 == 0) goto L13
            r0 = r9
            fc2.c r0 = (fc2.c) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            fc2.c r0 = new fc2.c
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f133612y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            hlm.a r1 = r0.v
            fc2.g r0 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L89
        L2f:
            r9 = move-exception
            goto La5
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3a:
            int r2 = r0.f133611x
            int r4 = r0.f133610w
            hlm.a r6 = r0.v
            fc2.g r7 = r0.u
            yhm.o.b(r9)
            r9 = r6
            goto L69
        L47:
            yhm.o.b(r9)
            java.lang.Boolean r9 = r8.f133622c
            if (r9 == 0) goto L53
            boolean r9 = r9.booleanValue()
            goto La0
        L53:
            hlm.c r9 = r8.d
            r0.u = r8
            r0.v = r9
            r2 = 0
            r0.f133610w = r2
            r0.f133611x = r2
            r0.A = r4
            java.lang.Object r4 = r9.lock(r5, r0)
            if (r4 != r1) goto L67
            goto L85
        L67:
            r7 = r8
            r4 = r2
        L69:
            java.lang.Boolean r6 = r7.f133622c     // Catch: java.lang.Throwable -> L90
            if (r6 != 0) goto L94
            uw1.c r6 = r7.f133620a     // Catch: java.lang.Throwable -> L90
            ty1.b r6 = (ty1.b) r6     // Catch: java.lang.Throwable -> L90
            ufm.c r6 = r6.g()     // Catch: java.lang.Throwable -> L90
            r0.u = r7     // Catch: java.lang.Throwable -> L90
            r0.v = r9     // Catch: java.lang.Throwable -> L90
            r0.f133610w = r4     // Catch: java.lang.Throwable -> L90
            r0.f133611x = r2     // Catch: java.lang.Throwable -> L90
            r0.A = r3     // Catch: java.lang.Throwable -> L90
            java.lang.Object r0 = nim.a.b(r6, r0)     // Catch: java.lang.Throwable -> L90
            if (r0 != r1) goto L86
        L85:
            return r1
        L86:
            r1 = r9
            r9 = r0
            r0 = r7
        L89:
            r6 = r9
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L2f
            r0.f133622c = r6     // Catch: java.lang.Throwable -> L2f
            r9 = r1
            goto L94
        L90:
            r0 = move-exception
            r1 = r9
            r9 = r0
            goto La5
        L94:
            r9.unlock(r5)
            java.lang.String r9 = "run(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r9)
            boolean r9 = r6.booleanValue()
        La0:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        La5:
            r1.unlock(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: fc2.g.o(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(gim.c r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof fc2.d
            if (r0 == 0) goto L13
            r0 = r10
            fc2.d r0 = (fc2.d) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            fc2.d r0 = new fc2.d
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.f133615y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            hlm.a r1 = r0.v
            fc2.g r0 = r0.u
            yhm.o.b(r10)     // Catch: java.lang.Throwable -> L2f
            goto L8b
        L2f:
            r10 = move-exception
            goto La7
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L3a:
            int r2 = r0.f133614x
            int r4 = r0.f133613w
            hlm.a r6 = r0.v
            fc2.g r7 = r0.u
            yhm.o.b(r10)
            r10 = r6
            goto L69
        L47:
            yhm.o.b(r10)
            java.lang.Boolean r10 = r9.f133621b
            if (r10 == 0) goto L53
            boolean r10 = r10.booleanValue()
            goto La2
        L53:
            hlm.c r10 = r9.e
            r0.u = r9
            r0.v = r10
            r2 = 0
            r0.f133613w = r2
            r0.f133614x = r2
            r0.A = r4
            java.lang.Object r4 = r10.lock(r5, r0)
            if (r4 != r1) goto L67
            goto L87
        L67:
            r7 = r9
            r4 = r2
        L69:
            java.lang.Boolean r6 = r7.f133621b     // Catch: java.lang.Throwable -> L92
            if (r6 != 0) goto L96
            uw1.c r6 = r7.f133620a     // Catch: java.lang.Throwable -> L92
            ty1.b r6 = (ty1.b) r6     // Catch: java.lang.Throwable -> L92
            uw1.f r8 = uw1.f.QVIK     // Catch: java.lang.Throwable -> L92
            ufm.c r6 = r6.f(r8)     // Catch: java.lang.Throwable -> L92
            r0.u = r7     // Catch: java.lang.Throwable -> L92
            r0.v = r10     // Catch: java.lang.Throwable -> L92
            r0.f133613w = r4     // Catch: java.lang.Throwable -> L92
            r0.f133614x = r2     // Catch: java.lang.Throwable -> L92
            r0.A = r3     // Catch: java.lang.Throwable -> L92
            java.lang.Object r0 = nim.a.b(r6, r0)     // Catch: java.lang.Throwable -> L92
            if (r0 != r1) goto L88
        L87:
            return r1
        L88:
            r1 = r10
            r10 = r0
            r0 = r7
        L8b:
            r6 = r10
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L2f
            r0.f133621b = r6     // Catch: java.lang.Throwable -> L2f
            r10 = r1
            goto L96
        L92:
            r0 = move-exception
            r1 = r10
            r10 = r0
            goto La7
        L96:
            r10.unlock(r5)
            java.lang.String r10 = "run(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r10)
            boolean r10 = r6.booleanValue()
        La2:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        La7:
            r1.unlock(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: fc2.g.p(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // my1.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature.apm.core.models.recipients.QvikContact r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof fc2.e
            if (r0 == 0) goto L13
            r0 = r6
            fc2.e r0 = (fc2.e) r0
            int r1 = r0.f133617x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f133617x = r1
            goto L18
        L13:
            fc2.e r0 = new fc2.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f133617x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.recipients.QvikContact r5 = r0.u
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
            r0.f133617x = r3
            java.lang.Object r6 = r4.o(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 == 0) goto L4d
            boolean r6 = r5.f62150g
            if (r6 == 0) goto L4d
            goto L4e
        L4d:
            r3 = r0
        L4e:
            com.revolut.feature.apm.core.models.recipients.ApmContact$SimpleState r5 = r5.f
            com.revolut.feature.apm.core.models.recipients.ApmContact$State$ACTIVE r6 = com.revolut.feature.apm.core.models.recipients.ApmContact.State.ACTIVE.f62099a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r6 == 0) goto L5a
            r0 = r3
            goto L62
        L5a:
            com.revolut.feature.apm.core.models.recipients.ApmContact$State$DELETED r6 = com.revolut.feature.apm.core.models.recipients.ApmContact.State.DELETED.f62100a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 == 0) goto L67
        L62:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L67:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fc2.g.e(com.revolut.feature.apm.core.models.recipients.QvikContact, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // my1.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.apm.core.models.recipients.QvikContact r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof fc2.f
            if (r0 == 0) goto L13
            r0 = r6
            fc2.f r0 = (fc2.f) r0
            int r1 = r0.f133619x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f133619x = r1
            goto L18
        L13:
            fc2.f r0 = new fc2.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f133619x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.recipients.QvikContact r5 = r0.u
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
            r0.f133619x = r3
            java.lang.Object r6 = r4.p(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 == 0) goto L57
            com.revolut.feature.apm.core.models.recipients.ApmDescriptor r6 = r5.f62148b
            boolean r1 = r6 instanceof com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Phone
            if (r1 != 0) goto L58
            boolean r1 = r6 instanceof com.revolut.feature.apm.core.models.recipients.ApmDescriptor.Email
            if (r1 != 0) goto L58
            boolean r6 = r6 instanceof com.revolut.feature.apm.core.models.recipients.ApmDescriptor.TaxNumber
            if (r6 == 0) goto L57
            goto L58
        L57:
            r3 = r0
        L58:
            com.revolut.feature.apm.core.models.recipients.ApmContact$SimpleState r5 = r5.f
            com.revolut.feature.apm.core.models.recipients.ApmContact$State$ACTIVE r6 = com.revolut.feature.apm.core.models.recipients.ApmContact.State.ACTIVE.f62099a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r6 == 0) goto L64
            r0 = r3
            goto L6c
        L64:
            com.revolut.feature.apm.core.models.recipients.ApmContact$State$DELETED r6 = com.revolut.feature.apm.core.models.recipients.ApmContact.State.DELETED.f62100a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 == 0) goto L71
        L6c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L71:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: fc2.g.h(com.revolut.feature.apm.core.models.recipients.QvikContact, gim.c):java.lang.Object");
    }
}
