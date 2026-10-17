package com.fourthline.orca.internal;

import com.fourthline.orca.internal.lz;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class wc1 implements lz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r70 f34591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lz f34592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f34593c;
    private final kh1 d;
    private final tb0 e;
    private final sb1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c6 f34594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final oc1 f34595h;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34596a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34598c;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f34596a = obj2;
            this.f34598c |= Integer.MIN_VALUE;
            return wc1.this.a(this);
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f34599a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34601c;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f34599a = obj2;
            this.f34601c |= Integer.MIN_VALUE;
            Object objB = wc1.this.b(this);
            return objB == fim.a.COROUTINE_SUSPENDED ? objB : new yhm.m(objB);
        }
    }

    public static final class c extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34603b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f34604c;
        Object d;
        Object e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f34605g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f34606h;
        int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f34607j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f34608l;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f34607j = obj2;
            this.f34608l |= Integer.MIN_VALUE;
            return wc1.this.b((lz.a) null, this);
        }
    }

    public static final class d extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34609a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34610b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f34611c;
        /* synthetic */ Object d;
        int f;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            Object objA = wc1.this.a((lz.a) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final class e extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34613b;
        int d;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f34613b = obj2;
            this.d |= Integer.MIN_VALUE;
            return wc1.this.a((String) null, this);
        }
    }

    public static final class f extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f34616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f34617c;
        Object d;
        /* synthetic */ Object e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f34618g;

        public f(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.e = obj2;
            this.f34618g |= Integer.MIN_VALUE;
            return wc1.this.a((lz.a) null, (lz.b) null, this);
        }
    }

    public static final class g extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f34619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34620b;
        int d;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f34620b = obj2;
            this.d |= Integer.MIN_VALUE;
            return wc1.this.b((String) null, this);
        }
    }

    public wc1(r70 mainRepository, lz whatsNextDelegate, Function0 workflowIdProvider, kh1 workflowStatusWorker, tb0 nextFlowStatusValidator, sb1 collectDeviceDataWorker, c6 bavRedirectUrlWorker, oc1 completeOnboardingWorker) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(whatsNextDelegate, "whatsNextDelegate");
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(workflowStatusWorker, "workflowStatusWorker");
        Intrinsics.checkNotNullParameter(nextFlowStatusValidator, "nextFlowStatusValidator");
        Intrinsics.checkNotNullParameter(collectDeviceDataWorker, "collectDeviceDataWorker");
        Intrinsics.checkNotNullParameter(bavRedirectUrlWorker, "bavRedirectUrlWorker");
        Intrinsics.checkNotNullParameter(completeOnboardingWorker, "completeOnboardingWorker");
        this.f34591a = mainRepository;
        this.f34592b = whatsNextDelegate;
        this.f34593c = workflowIdProvider;
        this.d = workflowStatusWorker;
        this.e = nextFlowStatusValidator;
        this.f = collectDeviceDataWorker;
        this.f34594g = bavRedirectUrlWorker;
        this.f34595h = completeOnboardingWorker;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
    
        if (r11 != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.fourthline.orca.internal.lz.a r10, kotlin.coroutines.Continuation r11) throws com.fourthline.orca.internal.cf1.f, com.fourthline.orca.internal.cf1.e, com.fourthline.orca.internal.cf1.g {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.wc1.b(com.fourthline.orca.internal.lz$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.fourthline.orca.internal.lz.a r10, com.fourthline.orca.internal.lz.b r11, kotlin.coroutines.Continuation r12) throws com.fourthline.orca.internal.cf1.f, com.fourthline.orca.internal.cf1.e, com.fourthline.orca.internal.cf1.g {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.wc1.a(com.fourthline.orca.internal.lz$a, com.fourthline.orca.internal.lz$b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.fourthline.orca.internal.wc1.g
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.orca.internal.wc1$g r0 = (com.fourthline.orca.internal.wc1.g) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.wc1$g r0 = new com.fourthline.orca.internal.wc1$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34620b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f34619a
            java.lang.String r5 = (java.lang.String) r5
            yhm.o.b(r6)
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r5 = r6.f314193a
            goto L4d
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r6)
            com.fourthline.orca.internal.c6 r6 = r4.f34594g
            com.fourthline.orca.internal.c6$a r2 = new com.fourthline.orca.internal.c6$a
            r2.<init>(r5)
            r5 = 0
            r0.f34619a = r5
            r0.d = r3
            java.lang.Object r5 = r6.a(r2, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            yhm.o.b(r5)
            com.fourthline.orca.internal.c6$b r5 = (com.fourthline.orca.internal.c6.b) r5
            java.lang.String r5 = r5.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.wc1.b(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.lz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.lz.a r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.wc1.d
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.wc1$d r0 = (com.fourthline.orca.internal.wc1.d) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.fourthline.orca.internal.wc1$d r0 = new com.fourthline.orca.internal.wc1$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f34610b
            com.fourthline.orca.internal.lz$b r6 = (com.fourthline.orca.internal.lz.b) r6
            java.lang.Object r6 = r0.f34609a
            com.fourthline.orca.internal.lz$a r6 = (com.fourthline.orca.internal.lz.a) r6
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L32
            goto L71
        L32:
            r6 = move-exception
            goto L76
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.f34609a
            com.fourthline.orca.internal.lz$a r6 = (com.fourthline.orca.internal.lz.a) r6
            yhm.o.b(r7)
            yhm.m r7 = (yhm.m) r7
            java.lang.Object r7 = r7.f314193a
            goto L58
        L48:
            yhm.o.b(r7)
            com.fourthline.orca.internal.lz r7 = r5.f34592b
            r0.f34609a = r6
            r0.f = r4
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L58
            goto L70
        L58:
            yhm.m$a r2 = yhm.m.INSTANCE
            boolean r2 = r7 instanceof yhm.n
            if (r2 != 0) goto L7d
            com.fourthline.orca.internal.lz$b r7 = (com.fourthline.orca.internal.lz.b) r7     // Catch: java.lang.Throwable -> L32
            r2 = 0
            r0.f34609a = r2     // Catch: java.lang.Throwable -> L32
            r0.f34610b = r2     // Catch: java.lang.Throwable -> L32
            r2 = 0
            r0.f34611c = r2     // Catch: java.lang.Throwable -> L32
            r0.f = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r7 = r5.a(r6, r7, r0)     // Catch: java.lang.Throwable -> L32
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            com.fourthline.orca.internal.lz$b r7 = (com.fourthline.orca.internal.lz.b) r7     // Catch: java.lang.Throwable -> L32
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L32
            return r7
        L76:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
            return r6
        L7d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.wc1.a(com.fourthline.orca.internal.lz$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.fourthline.orca.internal.wc1.b
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.orca.internal.wc1$b r0 = (com.fourthline.orca.internal.wc1.b) r0
            int r1 = r0.f34601c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34601c = r1
            goto L18
        L13:
            com.fourthline.orca.internal.wc1$b r0 = new com.fourthline.orca.internal.wc1$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34599a
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f34601c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r6)
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r6 = r6.f314193a
            return r6
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L33:
            yhm.o.b(r6)
            com.fourthline.orca.internal.oc1 r6 = r5.f34595h
            com.fourthline.orca.internal.oc1$a r2 = new com.fourthline.orca.internal.oc1$a
            kotlin.jvm.functions.Function0 r4 = r5.f34593c
            java.lang.Object r4 = r4.invoke()
            java.lang.String r4 = (java.lang.String) r4
            r2.<init>(r4)
            r0.f34601c = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.wc1.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.fourthline.orca.internal.wc1.e
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.orca.internal.wc1$e r0 = (com.fourthline.orca.internal.wc1.e) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.wc1$e r0 = new com.fourthline.orca.internal.wc1$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34613b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f34612a
            java.lang.String r5 = (java.lang.String) r5
            yhm.o.b(r6)
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r5 = r6.f314193a
            goto L4d
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r6)
            com.fourthline.orca.internal.kh1 r6 = r4.d
            com.fourthline.orca.internal.kh1$a r2 = new com.fourthline.orca.internal.kh1$a
            r2.<init>(r5)
            r5 = 0
            r0.f34612a = r5
            r0.d = r3
            java.lang.Object r5 = r6.a(r2, r0)
            if (r5 != r1) goto L4d
            return r1
        L4d:
            yhm.o.b(r5)
            com.fourthline.orca.internal.kh1$b r5 = (com.fourthline.orca.internal.kh1.b) r5
            com.fourthline.orca.internal.hh1 r5 = r5.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.wc1.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.fourthline.orca.internal.wc1.a
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.orca.internal.wc1$a r0 = (com.fourthline.orca.internal.wc1.a) r0
            int r1 = r0.f34598c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34598c = r1
            goto L18
        L13:
            com.fourthline.orca.internal.wc1$a r0 = new com.fourthline.orca.internal.wc1$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34596a
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f34598c
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)
            yhm.m r6 = (yhm.m) r6
            r6.getClass()
            goto L4f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            yhm.o.b(r6)
            com.fourthline.orca.internal.sb1 r6 = r5.f
            com.fourthline.orca.internal.sb1$a r2 = new com.fourthline.orca.internal.sb1$a
            kotlin.jvm.functions.Function0 r4 = r5.f34593c
            java.lang.Object r4 = r4.invoke()
            java.lang.String r4 = (java.lang.String) r4
            r2.<init>(r4)
            r0.f34598c = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.wc1.a(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
