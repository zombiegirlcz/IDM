package com.fourthline.orca.internal;

import com.fourthline.orca.internal.nx0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class lx0 implements nx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final nx0 f30777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yv0 f30778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k81 f30779c;
    private final String d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[sx0.values().length];
            try {
                iArr[sx0.f33156h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sx0.k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sx0.i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30781b;
        int d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f30781b = obj2;
            this.d |= Integer.MIN_VALUE;
            return lx0.this.a((String) null, this);
        }
    }

    public static final class c extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f30784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f30785c;
        /* synthetic */ Object d;
        int f;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            Object objA = lx0.this.a((nx0.a) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public lx0(nx0 userAuthorizationWorker, yv0 pollStatusWorker, k81 timedProcessAnalytics) {
        Intrinsics.checkNotNullParameter(userAuthorizationWorker, "userAuthorizationWorker");
        Intrinsics.checkNotNullParameter(pollStatusWorker, "pollStatusWorker");
        Intrinsics.checkNotNullParameter(timedProcessAnalytics, "timedProcessAnalytics");
        this.f30777a = userAuthorizationWorker;
        this.f30778b = pollStatusWorker;
        this.f30779c = timedProcessAnalytics;
        this.d = "qes_user_authorize";
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.nx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.nx0.a r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.lx0.c
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.lx0$c r0 = (com.fourthline.orca.internal.lx0.c) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.fourthline.orca.internal.lx0$c r0 = new com.fourthline.orca.internal.lx0$c
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
            java.lang.Object r6 = r0.f30784b
            com.fourthline.orca.internal.nx0$b r6 = (com.fourthline.orca.internal.nx0.b) r6
            java.lang.Object r6 = r0.f30783a
            com.fourthline.orca.internal.nx0$a r6 = (com.fourthline.orca.internal.nx0.a) r6
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L32
            goto L80
        L32:
            r6 = move-exception
            goto L8d
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.f30783a
            com.fourthline.orca.internal.nx0$a r6 = (com.fourthline.orca.internal.nx0.a) r6
            yhm.o.b(r7)
            yhm.m r7 = (yhm.m) r7
            java.lang.Object r7 = r7.f314193a
            goto L5f
        L48:
            yhm.o.b(r7)
            com.fourthline.orca.internal.k81 r7 = r5.f30779c
            java.lang.String r2 = r5.d
            r7.b(r2)
            com.fourthline.orca.internal.nx0 r7 = r5.f30777a
            r0.f30783a = r6
            r0.f = r4
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L5f
            goto L7f
        L5f:
            yhm.m$a r2 = yhm.m.INSTANCE
            boolean r2 = r7 instanceof yhm.n
            if (r2 != 0) goto L94
            com.fourthline.orca.internal.nx0$b r7 = (com.fourthline.orca.internal.nx0.b) r7     // Catch: java.lang.Throwable -> L32
            boolean r2 = r7 instanceof com.fourthline.orca.internal.nx0.b.c     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L83
            java.lang.String r6 = r6.d()     // Catch: java.lang.Throwable -> L32
            r7 = 0
            r0.f30783a = r7     // Catch: java.lang.Throwable -> L32
            r0.f30784b = r7     // Catch: java.lang.Throwable -> L32
            r7 = 0
            r0.f30785c = r7     // Catch: java.lang.Throwable -> L32
            r0.f = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r7 = r5.a(r6, r0)     // Catch: java.lang.Throwable -> L32
            if (r7 != r1) goto L80
        L7f:
            return r1
        L80:
            com.fourthline.orca.internal.nx0$b r7 = (com.fourthline.orca.internal.nx0.b) r7     // Catch: java.lang.Throwable -> L32
            goto L8a
        L83:
            com.fourthline.orca.internal.k81 r6 = r5.f30779c     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = r5.d     // Catch: java.lang.Throwable -> L32
            r6.a(r0)     // Catch: java.lang.Throwable -> L32
        L8a:
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L32
            return r7
        L8d:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
            return r6
        L94:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.lx0.a(com.fourthline.orca.internal.nx0$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.lx0.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
