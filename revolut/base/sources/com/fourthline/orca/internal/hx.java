package com.fourthline.orca.internal;

import com.fourthline.orca.internal.fx0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class hx implements fx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ex0 f29426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yv0 f29427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k81 f29428c;
    private final String d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[sx0.values().length];
            try {
                iArr[sx0.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sx0.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sx0.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[sx0.f33155g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29430b;
        int d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29430b = obj2;
            this.d |= Integer.MIN_VALUE;
            return hx.this.a((String) null, this);
        }
    }

    public static final class c extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f29433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29434c;
        /* synthetic */ Object d;
        int f;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.d = obj2;
            this.f |= Integer.MIN_VALUE;
            Object objA = hx.this.a((fx0.a) null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public hx(ex0 startSignatureRequestWorker, yv0 pollStatusWorker, k81 timedProcessAnalytics) {
        Intrinsics.checkNotNullParameter(startSignatureRequestWorker, "startSignatureRequestWorker");
        Intrinsics.checkNotNullParameter(pollStatusWorker, "pollStatusWorker");
        Intrinsics.checkNotNullParameter(timedProcessAnalytics, "timedProcessAnalytics");
        this.f29426a = startSignatureRequestWorker;
        this.f29427b = pollStatusWorker;
        this.f29428c = timedProcessAnalytics;
        this.d = "qes_start_signature";
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.fx0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.fx0.a r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.hx.c
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.hx$c r0 = (com.fourthline.orca.internal.hx.c) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            com.fourthline.orca.internal.hx$c r0 = new com.fourthline.orca.internal.hx$c
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
            java.lang.Object r6 = r0.f29433b
            com.fourthline.orca.internal.ex0$a r6 = (com.fourthline.orca.internal.ex0.a) r6
            java.lang.Object r6 = r0.f29432a
            com.fourthline.orca.internal.fx0$a r6 = (com.fourthline.orca.internal.fx0.a) r6
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L32
            goto L7c
        L32:
            r6 = move-exception
            goto L81
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.f29432a
            com.fourthline.orca.internal.fx0$a r6 = (com.fourthline.orca.internal.fx0.a) r6
            yhm.o.b(r7)
            yhm.m r7 = (yhm.m) r7
            java.lang.Object r7 = r7.f314193a
            goto L5f
        L48:
            yhm.o.b(r7)
            com.fourthline.orca.internal.k81 r7 = r5.f29428c
            java.lang.String r2 = r5.d
            r7.b(r2)
            com.fourthline.orca.internal.ex0 r7 = r5.f29426a
            r0.f29432a = r6
            r0.f = r4
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L5f
            goto L7b
        L5f:
            yhm.m$a r2 = yhm.m.INSTANCE
            boolean r2 = r7 instanceof yhm.n
            if (r2 != 0) goto L88
            com.fourthline.orca.internal.ex0$a r7 = (com.fourthline.orca.internal.ex0.a) r7     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = r6.c()     // Catch: java.lang.Throwable -> L32
            r7 = 0
            r0.f29432a = r7     // Catch: java.lang.Throwable -> L32
            r0.f29433b = r7     // Catch: java.lang.Throwable -> L32
            r7 = 0
            r0.f29434c = r7     // Catch: java.lang.Throwable -> L32
            r0.f = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r7 = r5.a(r6, r0)     // Catch: java.lang.Throwable -> L32
            if (r7 != r1) goto L7c
        L7b:
            return r1
        L7c:
            com.fourthline.orca.internal.fx0$b r7 = (com.fourthline.orca.internal.fx0.b) r7     // Catch: java.lang.Throwable -> L32
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L32
            return r7
        L81:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r6 = yhm.o.a(r6)
            return r6
        L88:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.hx.a(com.fourthline.orca.internal.fx0$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.fourthline.orca.internal.hx.b
            if (r0 == 0) goto L13
            r0 = r10
            com.fourthline.orca.internal.hx$b r0 = (com.fourthline.orca.internal.hx.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.hx$b r0 = new com.fourthline.orca.internal.hx$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f29430b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r9 = r0.f29429a
            java.lang.String r9 = (java.lang.String) r9
            yhm.o.b(r10)
            yhm.m r10 = (yhm.m) r10
            java.lang.Object r9 = r10.f314193a
            goto L62
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            yhm.o.b(r10)
            com.fourthline.orca.internal.yv0 r10 = r8.f29427b
            com.fourthline.orca.internal.yv0$a r2 = new com.fourthline.orca.internal.yv0$a
            com.fourthline.orca.internal.sx0 r4 = com.fourthline.orca.internal.sx0.d
            com.fourthline.orca.internal.sx0 r5 = com.fourthline.orca.internal.sx0.e
            com.fourthline.orca.internal.sx0 r6 = com.fourthline.orca.internal.sx0.f
            com.fourthline.orca.internal.sx0 r7 = com.fourthline.orca.internal.sx0.f33155g
            com.fourthline.orca.internal.sx0[] r4 = new com.fourthline.orca.internal.sx0[]{r4, r5, r6, r7}
            java.lang.String r5 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            java.util.Set r4 = kotlin.collections.d.y0(r4)
            r2.<init>(r9, r4)
            r9 = 0
            r0.f29429a = r9
            r0.d = r3
            java.lang.Object r9 = r10.a(r2, r0)
            if (r9 != r1) goto L62
            return r1
        L62:
            java.lang.Throwable r10 = yhm.m.a(r9)
            if (r10 != 0) goto Lb9
            com.fourthline.orca.internal.fv0$b r9 = (com.fourthline.orca.internal.fv0.b) r9
            com.fourthline.orca.internal.k81 r10 = r8.f29428c
            java.lang.String r0 = r8.d
            r10.c(r0)
            com.fourthline.orca.internal.gx0 r10 = r9.a()
            com.fourthline.orca.internal.sx0 r10 = r10.getStatus()
            int[] r0 = com.fourthline.orca.internal.hx.a.$EnumSwitchMapping$0
            int r10 = r10.ordinal()
            r10 = r0[r10]
            if (r10 == r3) goto Lb6
            r0 = 2
            if (r10 == r0) goto Lb3
            r0 = 3
            if (r10 == r0) goto Lb0
            r0 = 4
            if (r10 != r0) goto L8f
            com.fourthline.orca.internal.fx0$b$d r9 = com.fourthline.orca.internal.fx0.b.d.f28693a
            return r9
        L8f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            com.fourthline.orca.internal.gx0 r9 = r9.a()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FL Developer error. `pollStatus` returned "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = ". Should never happen!"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        Lb0:
            com.fourthline.orca.internal.fx0$b$c r9 = com.fourthline.orca.internal.fx0.b.c.f28692a
            return r9
        Lb3:
            com.fourthline.orca.internal.fx0$b$a r9 = com.fourthline.orca.internal.fx0.b.a.f28690a
            return r9
        Lb6:
            com.fourthline.orca.internal.fx0$b$b r9 = com.fourthline.orca.internal.fx0.b.C0200b.f28691a
            return r9
        Lb9:
            com.fourthline.orca.internal.k81 r9 = r8.f29428c
            java.lang.String r0 = r8.d
            r9.a(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.hx.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
