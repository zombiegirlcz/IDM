package w52;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.IrisContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements my1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c62.e f294685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Boolean f294686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hlm.c f294687c;

    public e(c62.e irisInteractor) {
        Intrinsics.checkNotNullParameter(irisInteractor, "irisInteractor");
        this.f294685a = irisInteractor;
        this.f294687c = hlm.d.a();
    }

    @Override // ly1.a
    public final boolean b(ApmContact contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        return contact instanceof IrisContact;
    }

    @Override // my1.a
    public final /* bridge */ /* synthetic */ Object e(ApmContact apmContact, sy1.b bVar) {
        return Boolean.FALSE;
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
            boolean r0 = r9 instanceof w52.b
            if (r0 == 0) goto L13
            r0 = r9
            w52.b r0 = (w52.b) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            w52.b r0 = new w52.b
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f294681y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            hlm.a r1 = r0.v
            w52.e r0 = r0.u
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
            int r2 = r0.f294680x
            int r4 = r0.f294679w
            hlm.a r6 = r0.v
            w52.e r7 = r0.u
            yhm.o.b(r9)
            r9 = r6
            goto L69
        L47:
            yhm.o.b(r9)
            java.lang.Boolean r9 = r8.f294686b
            if (r9 == 0) goto L53
            boolean r9 = r9.booleanValue()
            goto L98
        L53:
            hlm.c r9 = r8.f294687c
            r0.u = r8
            r0.v = r9
            r2 = 0
            r0.f294679w = r2
            r0.f294680x = r2
            r0.A = r4
            java.lang.Object r4 = r9.lock(r5, r0)
            if (r4 != r1) goto L67
            goto L7d
        L67:
            r7 = r8
            r4 = r2
        L69:
            java.lang.Boolean r6 = r7.f294686b     // Catch: java.lang.Throwable -> L8b
            if (r6 != 0) goto L8f
            r0.u = r7     // Catch: java.lang.Throwable -> L8b
            r0.v = r9     // Catch: java.lang.Throwable -> L8b
            r0.f294679w = r4     // Catch: java.lang.Throwable -> L8b
            r0.f294680x = r2     // Catch: java.lang.Throwable -> L8b
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
            r0.f294686b = r9     // Catch: java.lang.Throwable -> L2f
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
        throw new UnsupportedOperationException("Method not decompiled: w52.e.j(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof w52.c
            if (r0 == 0) goto L13
            r0 = r5
            w52.c r0 = (w52.c) r0
            int r1 = r0.f294682w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f294682w = r1
            goto L18
        L13:
            w52.c r0 = new w52.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f294682w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            i02.j r5 = i02.j.BACKGROUND
            r0.f294682w = r3
            com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile r2 = com.revolut.feature.apm.core.models.transfers.ApmPaymentProfile.PERSONAL
            c62.e r3 = r4.f294685a
            c62.i r3 = (c62.i) r3
            java.lang.Object r5 = r3.a(r2, r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5 instanceof com.revolut.feature.apm.core.models.iris.IrisRegistrationStatus.Active
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w52.e.o(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // my1.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.apm.core.models.recipients.IrisContact r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof w52.d
            if (r0 == 0) goto L13
            r0 = r6
            w52.d r0 = (w52.d) r0
            int r1 = r0.f294684x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f294684x = r1
            goto L18
        L13:
            w52.d r0 = new w52.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f294684x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.apm.core.models.recipients.IrisContact r5 = r0.u
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
            r0.f294684x = r3
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
        throw new UnsupportedOperationException("Method not decompiled: w52.e.h(com.revolut.feature.apm.core.models.recipients.IrisContact, gim.c):java.lang.Object");
    }
}
