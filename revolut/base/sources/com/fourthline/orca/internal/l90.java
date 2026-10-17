package com.fourthline.orca.internal;

import com.fourthline.orca.internal.a6;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class l90 implements a6 {
    public static final a f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f30535g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Function1 f30536h = new jm1(21);
    private static final Function1 i = new jm1(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z5 f30537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f30538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function1 f30539c;
    private final k81 d;
    private final String e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30540a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30541b;
        int d;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f30541b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = l90.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30543a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a6.a f30545c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a6.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f30545c = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return l90.this.new c(this.f30545c, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object objA;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f30543a;
            if (i == 0) {
                yhm.o.b(obj2);
                l90 l90Var = l90.this;
                a6.a aVar2 = this.f30545c;
                this.f30543a = 1;
                objA = l90Var.a(0, aVar2, this);
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
        int f30546a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f30547b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f30548c;
        Object d;
        /* synthetic */ Object e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f30549g;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.e = obj2;
            this.f30549g |= Integer.MIN_VALUE;
            Object objA = l90.this.a(0, null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public l90(z5 statusWorker, long j2, Function1 retryStrategy, k81 timedProcessAnalytics) {
        Intrinsics.checkNotNullParameter(statusWorker, "statusWorker");
        Intrinsics.checkNotNullParameter(retryStrategy, "retryStrategy");
        Intrinsics.checkNotNullParameter(timedProcessAnalytics, "timedProcessAnalytics");
        this.f30537a = statusWorker;
        this.f30538b = j2;
        this.f30539c = retryStrategy;
        this.d = timedProcessAnalytics;
        this.e = "bav_payment_status_check";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(int i2) {
        return 2000L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long a(int i2) {
        return ((long) Math.pow(2.0d, i2)) * ((long) 1000);
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
    public final java.lang.Object a(int r9, com.fourthline.orca.internal.a6.a r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.l90.a(int, com.fourthline.orca.internal.a6$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ l90(z5 z5Var, long j2, Function1 function1, k81 k81Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z5Var, (i2 & 2) != 0 ? 60000L : j2, (i2 & 4) != 0 ? i : function1, k81Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.a6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.a6.a r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.fourthline.orca.internal.l90.b
            if (r0 == 0) goto L13
            r0 = r8
            com.fourthline.orca.internal.l90$b r0 = (com.fourthline.orca.internal.l90.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.l90$b r0 = new com.fourthline.orca.internal.l90$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f30541b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r7 = r0.f30540a
            com.fourthline.orca.internal.a6$a r7 = (com.fourthline.orca.internal.a6.a) r7
            yhm.o.b(r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70
            goto L50
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            com.fourthline.orca.internal.k81 r8 = r6.d
            java.lang.String r2 = r6.e
            r8.b(r2)
            long r4 = r6.f30538b     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70
            com.fourthline.orca.internal.l90$c r8 = new com.fourthline.orca.internal.l90$c     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70
            r2 = 0
            r8.<init>(r7, r2)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70
            r0.f30540a = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70
            r0.d = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70
            java.lang.Object r8 = skm.h2.b(r4, r8, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70
            if (r8 != r1) goto L50
            return r1
        L50:
            yhm.m r8 = (yhm.m) r8     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70
            java.lang.Object r7 = r8.f314193a     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70
            boolean r8 = r7 instanceof yhm.n     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70
            if (r8 != 0) goto L62
            r8 = r7
            com.fourthline.orca.internal.z5$b r8 = (com.fourthline.orca.internal.z5.b) r8     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70
            com.fourthline.orca.internal.k81 r8 = r6.d     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70
            java.lang.String r0 = r6.e     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70
            r8.c(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70
        L62:
            java.lang.Throwable r8 = yhm.m.a(r7)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70
            if (r8 == 0) goto L6f
            com.fourthline.orca.internal.k81 r8 = r6.d     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70
            java.lang.String r0 = r6.e     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70
            r8.a(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L70
        L6f:
            return r7
        L70:
            com.fourthline.orca.internal.k81 r7 = r6.d
            java.lang.String r8 = r6.e
            r7.a(r8)
            yhm.m$a r7 = yhm.m.INSTANCE
            com.fourthline.orca.internal.re1$b r7 = new com.fourthline.orca.internal.re1$b
            java.lang.String r8 = "NetworkBavPollPaymentTransferStatusWorker.timeout"
            r7.<init>(r8)
            yhm.n r7 = yhm.o.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.l90.a(com.fourthline.orca.internal.a6$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
