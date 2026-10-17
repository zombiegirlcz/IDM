package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ab0;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class p1 implements ib0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib0 f31790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d90 f31791b;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31793b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f31793b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = p1.this.a((ab0.a) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31796b;
        int d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f31796b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = p1.this.a((ab0.c) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public p1(ib0 networkService, d90 networkAnalytics) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(networkAnalytics, "networkAnalytics");
        this.f31790a = networkService;
        this.f31791b = networkAnalytics;
    }

    private final void a(ab0 ab0Var, eb0 eb0Var) {
        if (fb0.f(eb0Var)) {
            this.f31791b.a(ab0Var.getAlias(), a(ab0Var), Integer.valueOf(eb0Var.d()), fb0.c(eb0Var), eb0Var.c());
        } else {
            this.f31791b.a(ab0Var.getAlias(), a(ab0Var), Integer.valueOf(eb0Var.d()), fb0.c(eb0Var), (Throwable) null);
        }
    }

    @Override // com.fourthline.orca.internal.ib0
    public mb.d b() {
        return this.f31790a.b();
    }

    private final void a(ab0 ab0Var, Throwable th10) {
        d90.a(this.f31791b, ab0Var.getAlias(), a(ab0Var), null, null, th10, 12, null);
    }

    private final Integer a(ab0 ab0Var) {
        if (!(ab0Var instanceof ab0.c)) {
            return null;
        }
        Iterator it8 = ((ab0.c) ab0Var).a().iterator();
        int length = 0;
        while (it8.hasNext()) {
            length += ((ab0.c.a) it8.next()).c().b().length;
        }
        return Integer.valueOf(length);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.ib0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.ab0.a r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.p1.a
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.p1$a r0 = (com.fourthline.orca.internal.p1.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.p1$a r0 = new com.fourthline.orca.internal.p1$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31793b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f31792a
            com.fourthline.orca.internal.ab0$a r6 = (com.fourthline.orca.internal.ab0.a) r6
            yhm.o.b(r7)
            yhm.m r7 = (yhm.m) r7
            java.lang.Object r7 = r7.f314193a
            goto L54
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            yhm.o.b(r7)
            com.fourthline.orca.internal.d90 r7 = r5.f31791b
            java.lang.String r2 = r6.getAlias()
            java.lang.Integer r4 = r5.a(r6)
            r7.a(r2, r4)
            com.fourthline.orca.internal.ib0 r7 = r5.f31790a
            r0.f31792a = r6
            r0.d = r3
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            yhm.m$a r0 = yhm.m.INSTANCE
            boolean r0 = r7 instanceof yhm.n
            if (r0 != 0) goto L60
            r0 = r7
            com.fourthline.orca.internal.eb0 r0 = (com.fourthline.orca.internal.eb0) r0
            r5.a(r6, r0)
        L60:
            java.lang.Throwable r0 = yhm.m.a(r7)
            if (r0 == 0) goto L69
            r5.a(r6, r0)
        L69:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.p1.a(com.fourthline.orca.internal.ab0$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.ib0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.ab0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.p1.b
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.p1$b r0 = (com.fourthline.orca.internal.p1.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.p1$b r0 = new com.fourthline.orca.internal.p1$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f31796b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f31795a
            com.fourthline.orca.internal.ab0$c r6 = (com.fourthline.orca.internal.ab0.c) r6
            yhm.o.b(r7)
            yhm.m r7 = (yhm.m) r7
            java.lang.Object r7 = r7.f314193a
            goto L54
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            yhm.o.b(r7)
            com.fourthline.orca.internal.d90 r7 = r5.f31791b
            java.lang.String r2 = r6.getAlias()
            java.lang.Integer r4 = r5.a(r6)
            r7.a(r2, r4)
            com.fourthline.orca.internal.ib0 r7 = r5.f31790a
            r0.f31795a = r6
            r0.d = r3
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            yhm.m$a r0 = yhm.m.INSTANCE
            boolean r0 = r7 instanceof yhm.n
            if (r0 != 0) goto L60
            r0 = r7
            com.fourthline.orca.internal.eb0 r0 = (com.fourthline.orca.internal.eb0) r0
            r5.a(r6, r0)
        L60:
            java.lang.Throwable r0 = yhm.m.a(r7)
            if (r0 == 0) goto L69
            r5.a(r6, r0)
        L69:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.p1.a(com.fourthline.orca.internal.ab0$c, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
