package com.fourthline.orca.internal;

import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.lz;
import com.fourthline.orca.internal.ub1;
import com.fourthline.orca.internal.vb1;
import com.fourthline.orca.internal.wb1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class lc1 implements ax, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f30569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f30570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final kc1 f30571c;
    private final aq0 d;
    private final fe1 e;
    private final qg0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ic1 f30572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ry f30573h;
    private final lz i;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function0 {
        public a(Object obj2) {
            super(0, 0, lc1.class, obj2, "retryUploads", "retryUploads()V");
        }

        public final void a() {
            ((lc1) this.receiver).g();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f186387a;
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f30575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f30576c;
        Object d;
        int e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f30577g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f30578h;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return lc1.this.new b(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
        
            if (r1.a(r6, r5) == r0) goto L17;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r5.f30578h
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r0 = r5.d
                com.fourthline.orca.internal.lz$b r0 = (com.fourthline.orca.internal.lz.b) r0
                java.lang.Object r0 = r5.f30574a
                com.fourthline.orca.internal.lz$a r0 = (com.fourthline.orca.internal.lz.a) r0
                yhm.o.b(r6)
                goto L73
            L19:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L21:
                java.lang.Object r1 = r5.f30574a
                com.fourthline.orca.internal.lz$a r1 = (com.fourthline.orca.internal.lz.a) r1
                yhm.o.b(r6)
                yhm.m r6 = (yhm.m) r6
                java.lang.Object r6 = r6.f314193a
                goto L46
            L2d:
                yhm.o.b(r6)
                com.fourthline.orca.internal.lz$a r6 = new com.fourthline.orca.internal.lz$a
                r6.<init>(r4, r3, r4)
                com.fourthline.orca.internal.lc1 r1 = com.fourthline.orca.internal.lc1.this
                com.fourthline.orca.internal.lz r1 = com.fourthline.orca.internal.lc1.b(r1)
                r5.f30574a = r4
                r5.f30578h = r3
                java.lang.Object r6 = r1.a(r6, r5)
                if (r6 != r0) goto L46
                goto L6b
            L46:
                com.fourthline.orca.internal.lc1 r1 = com.fourthline.orca.internal.lc1.this
                java.lang.Throwable r3 = yhm.m.a(r6)
                if (r3 != 0) goto L6c
                com.fourthline.orca.internal.lz$b r6 = (com.fourthline.orca.internal.lz.b) r6
                com.fourthline.orca.internal.lz$c r6 = r6.a()
                r5.f30574a = r4
                r5.f30575b = r4
                r5.f30576c = r4
                r5.d = r4
                r3 = 0
                r5.e = r3
                r5.f = r3
                r5.f30577g = r3
                r5.f30578h = r2
                java.lang.Object r6 = com.fourthline.orca.internal.lc1.a(r1, r6, r5)
                if (r6 != r0) goto L73
            L6b:
                return r0
            L6c:
                com.fourthline.orca.internal.re1 r6 = com.fourthline.orca.internal.se1.a(r3)
                com.fourthline.orca.internal.lc1.a(r1, r6)
            L73:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.lc1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f30580b;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return lc1.this.new c(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f30580b;
            if (i == 0) {
                yhm.o.b(obj2);
                h10 h10VarA = lc1.this.f30572g.a();
                lc1 lc1Var = lc1.this;
                this.f30579a = null;
                this.f30580b = 1;
                if (lc1Var.a(h10VarA, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            return Unit.f186387a;
        }
    }

    public static final class d extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30583b;
        int d;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f30583b = obj2;
            this.d |= Integer.MIN_VALUE;
            return lc1.this.a((h10) null, this);
        }
    }

    public lc1(mq0 presenter, kc1 stateProvider, aq0 popupHandler, fe1 viewNavigator, qg0 analytics, ic1 requestsBuilder, ry dataWorkManager, lz whatsNextWorker, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(requestsBuilder, "requestsBuilder");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        Intrinsics.checkNotNullParameter(whatsNextWorker, "whatsNextWorker");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f30569a = coroutineScope;
        this.f30570b = presenter;
        this.f30571c = stateProvider;
        this.d = popupHandler;
        this.e = viewNavigator;
        this.f = analytics;
        this.f30572g = requestsBuilder;
        this.f30573h = dataWorkManager;
        this.i = whatsNextWorker;
    }

    private final void d() {
        b();
    }

    private final void e() {
        skm.e0.C(this, null, null, new b(null), 3);
    }

    private final void f() {
        skm.e0.C(this, null, null, new c(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        f();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f30569a.getCoroutineContext();
    }

    private final void b() {
        this.f.track(ub1.a.C0292a.f33993b);
        this.e.b(vb1.a.f34291a);
    }

    private final void c() {
        this.f.track(ub1.a.b.f33994b);
        f();
    }

    public final mq0 a() {
        return this.f30570b;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(wb1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof wb1.b) {
            c();
        } else if (event instanceof wb1.a) {
            b();
        } else {
            if (!(event instanceof wb1.c)) {
                throw new NoWhenBranchMatchedException();
            }
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.fourthline.orca.internal.h10 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.fourthline.orca.internal.lc1.d
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.orca.internal.lc1$d r0 = (com.fourthline.orca.internal.lc1.d) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.lc1$d r0 = new com.fourthline.orca.internal.lc1$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f30583b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f30582a
            com.fourthline.orca.internal.h10 r5 = (com.fourthline.orca.internal.h10) r5
            yhm.o.b(r6)
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r5 = r6.f314193a
            goto L48
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r6)
            com.fourthline.orca.internal.ry r6 = r4.f30573h
            r2 = 0
            r0.f30582a = r2
            r0.d = r3
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            java.lang.Throwable r6 = yhm.m.a(r5)
            if (r6 != 0) goto L54
            kotlin.Unit r5 = (kotlin.Unit) r5
            r4.e()
            goto L5b
        L54:
            com.fourthline.orca.internal.re1 r5 = com.fourthline.orca.internal.se1.a(r6)
            r4.a(r5)
        L5b:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.lc1.a(com.fourthline.orca.internal.h10, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(lz.c cVar, Continuation continuation) {
        h10 h10VarA;
        if ((cVar instanceof lz.c.C0245c) && (h10VarA = this.f30572g.a(((lz.c.C0245c) cVar).c())) != null) {
            Object objA = a(h10VarA, continuation);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
        }
        a(cVar.a());
        return Unit.f186387a;
    }

    private final void a(ny nyVar) {
        this.e.b(new vb1.b(new ac1(nyVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(kh0 kh0Var) {
        this.d.a(new hq0.c(kh0Var, "n/a", new a(this)));
    }
}
