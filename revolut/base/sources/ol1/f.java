package ol1;

import com.revolut.feature.apm.core.models.recipients.AaniContact;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements jl1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kdh.b f226316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Boolean f226317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hlm.c f226318c;

    public f(kdh.b aaniInteractor) {
        Intrinsics.checkNotNullParameter(aaniInteractor, "aaniInteractor");
        this.f226316a = aaniInteractor;
        this.f226318c = hlm.d.a();
    }

    @Override // ly1.a
    public final boolean b(ApmContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return contact instanceof AaniContact;
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
            boolean r0 = r9 instanceof ol1.b
            if (r0 == 0) goto L13
            r0 = r9
            ol1.b r0 = (ol1.b) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            ol1.b r0 = new ol1.b
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f226310y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            hlm.a r1 = r0.v
            ol1.f r0 = r0.u
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
            int r2 = r0.f226309x
            int r4 = r0.f226308w
            hlm.a r6 = r0.v
            ol1.f r7 = r0.u
            yhm.o.b(r9)
            r9 = r6
            goto L69
        L47:
            yhm.o.b(r9)
            java.lang.Boolean r9 = r8.f226317b
            if (r9 == 0) goto L53
            boolean r9 = r9.booleanValue()
            goto L98
        L53:
            hlm.c r9 = r8.f226318c
            r0.u = r8
            r0.v = r9
            r2 = 0
            r0.f226308w = r2
            r0.f226309x = r2
            r0.A = r4
            java.lang.Object r4 = r9.lock(r5, r0)
            if (r4 != r1) goto L67
            goto L7d
        L67:
            r7 = r8
            r4 = r2
        L69:
            java.lang.Boolean r6 = r7.f226317b     // Catch: java.lang.Throwable -> L8b
            if (r6 != 0) goto L8f
            r0.u = r7     // Catch: java.lang.Throwable -> L8b
            r0.v = r9     // Catch: java.lang.Throwable -> L8b
            r0.f226308w = r4     // Catch: java.lang.Throwable -> L8b
            r0.f226309x = r2     // Catch: java.lang.Throwable -> L8b
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
            r0.f226317b = r9     // Catch: java.lang.Throwable -> L2f
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
        throw new UnsupportedOperationException("Method not decompiled: ol1.f.j(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(gim.c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ol1.c
            if (r0 == 0) goto L13
            r0 = r5
            ol1.c r0 = (ol1.c) r0
            int r1 = r0.f226311w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226311w = r1
            goto L18
        L13:
            ol1.c r0 = new ol1.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226311w
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
            r0.f226311w = r3
            kdh.b r5 = r4.f226316a
            java.lang.Object r5 = r5.J(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            boolean r5 = r5 instanceof com.revolut.feature.apm.aani.impl.model.AaniRegistrationStatus.Active
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ol1.f.o(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // my1.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.feature.apm.core.models.recipients.AaniContact r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ol1.d
            if (r0 == 0) goto L13
            r0 = r6
            ol1.d r0 = (ol1.d) r0
            int r1 = r0.f226313x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226313x = r1
            goto L18
        L13:
            ol1.d r0 = new ol1.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226313x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.recipients.AaniContact r5 = r0.u
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
            r0.f226313x = r3
            java.lang.Object r6 = r4.j(r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r0 = 0
            if (r6 == 0) goto L4d
            boolean r6 = r5.f62098g
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
        throw new UnsupportedOperationException("Method not decompiled: ol1.f.e(com.revolut.feature.apm.core.models.recipients.AaniContact, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // my1.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.apm.core.models.recipients.AaniContact r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ol1.e
            if (r0 == 0) goto L13
            r0 = r6
            ol1.e r0 = (ol1.e) r0
            int r1 = r0.f226315x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226315x = r1
            goto L18
        L13:
            ol1.e r0 = new ol1.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226315x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.recipients.AaniContact r5 = r0.u
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
            r0.f226315x = r3
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
        throw new UnsupportedOperationException("Method not decompiled: ol1.f.h(com.revolut.feature.apm.core.models.recipients.AaniContact, gim.c):java.lang.Object");
    }
}
