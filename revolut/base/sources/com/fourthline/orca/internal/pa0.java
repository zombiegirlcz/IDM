package com.fourthline.orca.internal;

import com.fourthline.orca.internal.yv0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class pa0 implements yv0 {
    public static final a d = new a(null);
    public static final int e = 8;
    private static final Function1 f = new nq1(1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Function1 f31897g = new nq1(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fv0 f31898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f31899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f31900c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f31901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31902b;
        int d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f31902b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = pa0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31904a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ yv0.a f31906c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(yv0.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f31906c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return pa0.this.new c(this.f31906c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object objA;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f31904a;
            if (i == 0) {
                yhm.o.b(obj2);
                pa0 pa0Var = pa0.this;
                yv0.a aVar2 = this.f31906c;
                this.f31904a = 1;
                objA = pa0Var.a(0, aVar2, this);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                objA = ((yhm.m) obj2).f314193a;
            }
            return new yhm.m(objA);
        }
    }

    public static final class d extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f31908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f31909c;
        Object d;
        /* synthetic */ Object e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f31910g;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.e = obj2;
            this.f31910g |= Integer.MIN_VALUE;
            Object objA = pa0.this.a(0, null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public pa0(fv0 getSignatureStatusWorker, long j2, Function1 retryStrategy) {
        Intrinsics.checkNotNullParameter(getSignatureStatusWorker, "getSignatureStatusWorker");
        Intrinsics.checkNotNullParameter(retryStrategy, "retryStrategy");
        this.f31898a = getSignatureStatusWorker;
        this.f31899b = j2;
        this.f31900c = retryStrategy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(int i) {
        return 2000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long a(int i) {
        return ((long) Math.pow(2.0d, i)) * ((long) 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00da, code lost:
    
        if (r9 != r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(int r9, com.fourthline.orca.internal.yv0.a r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.pa0.a(int, com.fourthline.orca.internal.yv0$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ pa0(fv0 fv0Var, long j2, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fv0Var, (i & 2) != 0 ? 60000L : j2, (i & 4) != 0 ? f31897g : function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.yv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.yv0.a r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.fourthline.orca.internal.pa0.b
            if (r0 == 0) goto L13
            r0 = r8
            com.fourthline.orca.internal.pa0$b r0 = (com.fourthline.orca.internal.pa0.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.pa0$b r0 = new com.fourthline.orca.internal.pa0$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f31902b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.f31901a
            com.fourthline.orca.internal.yv0$a r7 = (com.fourthline.orca.internal.yv0.a) r7
            yhm.o.b(r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            goto L49
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            long r4 = r6.f31899b     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            com.fourthline.orca.internal.pa0$c r8 = new com.fourthline.orca.internal.pa0$c     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            r2 = 0
            r8.<init>(r7, r2)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            r0.f31901a = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            r0.d = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            java.lang.Object r8 = skm.h2.b(r4, r8, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            if (r8 != r1) goto L49
            return r1
        L49:
            yhm.m r8 = (yhm.m) r8     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            java.lang.Object r7 = r8.f314193a     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L4e
            return r7
        L4e:
            yhm.m$a r7 = yhm.m.INSTANCE
            com.fourthline.orca.internal.re1$b r7 = new com.fourthline.orca.internal.re1$b
            java.lang.String r8 = "NetworkQesPollSignatureStatusWorker.timeout"
            r7.<init>(r8)
            yhm.n r7 = yhm.o.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.pa0.a(com.fourthline.orca.internal.yv0$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
