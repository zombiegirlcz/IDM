package com.fourthline.orca.internal;

import com.fourthline.orca.internal.ab0;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class i2 implements ib0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib0 f29472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f29473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f29474c;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29477c;
        int e;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29477c = obj2;
            this.e |= Integer.MIN_VALUE;
            Object objA = i2.this.a((ab0.a) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29480c;
        int e;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29480c = obj2;
            this.e |= Integer.MIN_VALUE;
            Object objA = i2.this.a((ab0.c) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public i2(ib0 networkService, Function0 authTokenProvider) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(authTokenProvider, "authTokenProvider");
        this.f29472a = networkService;
        this.f29473b = authTokenProvider;
        this.f29474c = yhm.j.b(new ul1(this, 21));
    }

    private final String a() {
        return (String) this.f29474c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(i2 i2Var) {
        return (String) i2Var.f29473b.invoke();
    }

    @Override // com.fourthline.orca.internal.ib0
    public mb.d b() {
        return this.f29472a.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.ib0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.ab0.a r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.fourthline.orca.internal.i2.a
            if (r0 == 0) goto L13
            r0 = r15
            com.fourthline.orca.internal.i2$a r0 = (com.fourthline.orca.internal.i2.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.fourthline.orca.internal.i2$a r0 = new com.fourthline.orca.internal.i2$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f29477c
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r14 = r0.f29476b
            com.fourthline.orca.internal.ab0$a r14 = (com.fourthline.orca.internal.ab0.a) r14
            java.lang.Object r14 = r0.f29475a
            com.fourthline.orca.internal.ab0$a r14 = (com.fourthline.orca.internal.ab0.a) r14
            yhm.o.b(r15)
            yhm.m r15 = (yhm.m) r15
            java.lang.Object r14 = r15.f314193a
            return r14
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            yhm.o.b(r15)
            java.util.Map r15 = r14.b()
            java.lang.String r2 = r13.a()
            kotlin.Pair r2 = com.fourthline.orca.internal.j2.a(r2)
            java.util.Map r8 = zhm.r0.q(r15, r2)
            r11 = 55
            r12 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r4 = r14
            com.fourthline.orca.internal.ab0$a r14 = com.fourthline.orca.internal.ab0.a.a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.fourthline.orca.internal.ib0 r15 = r13.f29472a
            r2 = 0
            r0.f29475a = r2
            r0.f29476b = r2
            r0.e = r3
            java.lang.Object r14 = r15.a(r14, r0)
            if (r14 != r1) goto L6b
            return r1
        L6b:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.i2.a(com.fourthline.orca.internal.ab0$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.ib0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.ab0.c r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.fourthline.orca.internal.i2.b
            if (r0 == 0) goto L13
            r0 = r14
            com.fourthline.orca.internal.i2$b r0 = (com.fourthline.orca.internal.i2.b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.fourthline.orca.internal.i2$b r0 = new com.fourthline.orca.internal.i2$b
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f29480c
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r13 = r0.f29479b
            com.fourthline.orca.internal.ab0$c r13 = (com.fourthline.orca.internal.ab0.c) r13
            java.lang.Object r13 = r0.f29478a
            com.fourthline.orca.internal.ab0$c r13 = (com.fourthline.orca.internal.ab0.c) r13
            yhm.o.b(r14)
            yhm.m r14 = (yhm.m) r14
            java.lang.Object r13 = r14.f314193a
            return r13
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            yhm.o.b(r14)
            java.util.Map r14 = r13.b()
            java.lang.String r2 = r12.a()
            kotlin.Pair r2 = com.fourthline.orca.internal.j2.a(r2)
            java.util.Map r7 = zhm.r0.q(r14, r2)
            r10 = 27
            r11 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r4 = r13
            com.fourthline.orca.internal.ab0$c r13 = com.fourthline.orca.internal.ab0.c.a(r4, r5, r6, r7, r8, r9, r10, r11)
            com.fourthline.orca.internal.ib0 r14 = r12.f29472a
            r2 = 0
            r0.f29478a = r2
            r0.f29479b = r2
            r0.e = r3
            java.lang.Object r13 = r14.a(r13, r0)
            if (r13 != r1) goto L6a
            return r1
        L6a:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.i2.a(com.fourthline.orca.internal.ab0$c, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
