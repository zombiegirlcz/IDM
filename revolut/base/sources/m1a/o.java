package m1a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl3.a f201323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f201324b;

    public o(cl3.a contactsInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f201323a = contactsInteractor;
        this.f201324b = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(efm.k r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof m1a.k
            if (r0 == 0) goto L13
            r0 = r6
            m1a.k r0 = (m1a.k) r0
            int r1 = r0.f201317w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f201317w = r1
            goto L18
        L13:
            m1a.k r0 = new m1a.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f201317w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L27
            goto L3f
        L27:
            r5 = move-exception
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            r0.f201317w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = nim.a.i(r5, r0)     // Catch: java.lang.Throwable -> L27
            if (r6 != r1) goto L3f
            return r1
        L3f:
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L48
        L42:
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r5)
        L48:
            java.lang.Throwable r5 = yhm.m.a(r6)
            if (r5 != 0) goto L4f
            goto L5e
        L4f:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 != 0) goto L5f
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r5, r6)
            r6 = r1
        L5e:
            return r6
        L5f:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m1a.o.a(efm.k, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof m1a.l
            if (r0 == 0) goto L13
            r0 = r8
            m1a.l r0 = (m1a.l) r0
            int r1 = r0.f201319x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f201319x = r1
            goto L18
        L13:
            m1a.l r0 = new m1a.l
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f201319x
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r3) goto L35
            if (r2 != r4) goto L2d
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L6e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L51
        L3b:
            yhm.o.b(r8)
            cl3.a r8 = r6.f201323a
            wl3.h r8 = (wl3.h) r8
            rfm.z r8 = r8.b(r7)
            r0.u = r7
            r0.f201319x = r3
            java.lang.Object r8 = r6.a(r8, r0)
            if (r8 != r1) goto L51
            goto L6d
        L51:
            zm3.a r8 = (zm3.a) r8
            if (r8 == 0) goto L5b
            com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType$SplitMember$ContactMember r7 = new com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType$SplitMember$ContactMember
            r7.<init>(r8, r5)
            return r7
        L5b:
            ang.f r8 = r6.f201324b
            zmg.d r8 = r8.d
            efm.k r8 = r8.c()
            r0.u = r7
            r0.f201319x = r4
            java.lang.Object r8 = r6.a(r8, r0)
            if (r8 != r1) goto L6e
        L6d:
            return r1
        L6e:
            do3.n r8 = (do3.n) r8
            if (r8 == 0) goto L85
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = r8.f116414l
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r0, r7)
            if (r7 == 0) goto L85
            com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType$SplitMember$UserMember r7 = new com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType$SplitMember$UserMember
            r7.<init>(r8, r5)
            return r7
        L85:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m1a.o.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof m1a.m
            if (r0 == 0) goto L13
            r0 = r6
            m1a.m r0 = (m1a.m) r0
            int r1 = r0.f201320w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f201320w = r1
            goto L18
        L13:
            m1a.m r0 = new m1a.m
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f201320w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            cl3.a r6 = r4.f201323a
            wl3.h r6 = (wl3.h) r6
            rfm.w r5 = r6.c(r5)
            r0.f201320w = r3
            java.lang.Object r6 = r4.a(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            zm3.a r6 = (zm3.a) r6
            r5 = 0
            if (r6 == 0) goto L4e
            com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType$SplitMember$ContactMember r0 = new com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType$SplitMember$ContactMember
            r0.<init>(r6, r5)
            return r0
        L4e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m1a.o.c(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof m1a.n
            if (r0 == 0) goto L13
            r0 = r6
            m1a.n r0 = (m1a.n) r0
            int r1 = r0.f201322x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f201322x = r1
            goto L18
        L13:
            m1a.n r0 = new m1a.n
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f201322x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            ang.f r6 = r4.f201324b
            zmg.d r6 = r6.d
            efm.k r6 = r6.c()
            r0.u = r5
            r0.f201322x = r3
            java.lang.Object r6 = r4.a(r6, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            do3.n r6 = (do3.n) r6
            r0 = 0
            if (r6 == 0) goto L5a
            java.lang.String r1 = r6.f116408a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            if (r5 == 0) goto L5a
            com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType$SplitMember$UserMember r5 = new com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType$SplitMember$UserMember
            r5.<init>(r6, r0)
            return r5
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m1a.o.d(java.lang.String, gim.c):java.lang.Object");
    }
}
