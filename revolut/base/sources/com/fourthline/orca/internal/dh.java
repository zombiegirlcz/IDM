package com.fourthline.orca.internal;

import com.fourthline.orca.internal.er;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.si;
import com.fourthline.orca.internal.tf;
import com.fourthline.orca.internal.tg;
import com.fourthline.orca.internal.xd1;
import com.fourthline.orca.internal.xf;
import com.fourthline.orca.internal.yf;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes23.dex */
public final class dh implements ax, CoroutineScope {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f27735q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f27736r = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mq0 f27737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xg f27738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wr f27739c;
    private final aq0 d;
    private final aq0 e;
    private final qg0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fe1 f27740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CoroutineScope f27741h;
    private final dg i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final rg f27742j;
    private final wd1 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Job f27743l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Job f27744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Job f27745n;
    private final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final skm.a0 f27746p;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27752a;

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
            return dh.this.new c(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27752a;
            if (i == 0) {
                yhm.o.b(obj2);
                dh.this.c().a(dh.this.d().v());
                b.Companion companion = kotlin.time.b.INSTANCE;
                long jG = kotlin.time.c.g(2, pkm.e.SECONDS);
                this.f27752a = 1;
                if (skm.k0.c(jG, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            dh.this.f.track(tf.a.c.f33761b);
            dh.this.e();
            return Unit.f186387a;
        }
    }

    public static final class d extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27754a;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return dh.this.new d(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27754a;
            if (i == 0) {
                yhm.o.b(obj2);
                b.Companion companion = kotlin.time.b.INSTANCE;
                long jG = kotlin.time.c.g(5, pkm.e.SECONDS);
                this.f27754a = 1;
                if (skm.k0.c(jG, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            dh.this.c().a(dh.this.d().s());
            return Unit.f186387a;
        }
    }

    public static final class e extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27756a;

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return dh.this.new e(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27756a;
            if (i == 0) {
                yhm.o.b(obj2);
                b.Companion companion = kotlin.time.b.INSTANCE;
                long jH = kotlin.time.c.h(dh.this.f27742j.c(), pkm.e.MILLISECONDS);
                this.f27756a = 1;
                if (skm.k0.c(jH, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
            }
            dh.this.b();
            return Unit.f186387a;
        }
    }

    public static final class f extends kotlin.coroutines.a implements skm.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ dh f27758a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(skm.z zVar, dh dhVar) {
            super(zVar);
            this.f27758a = dhVar;
        }

        @Override // skm.a0
        public void handleException(CoroutineContext coroutineContext, Throwable th10) {
            this.f27758a.f.track(new tf.a.b(th10));
            this.f27758a.e();
        }
    }

    public static final class g extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27759a;

        public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
            public a(Object obj2) {
                super(1, 0, dh.class, obj2, "handleAnalysisResult", "handleAnalysisResult(Lcom/fourthline/orca/core/internal/capabilities/documentrecognition/network/analysis/DocumentAnalysisResult;)V");
            }

            public final void a(tg p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((dh) this.receiver).b(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                a((tg) obj2);
                return Unit.f186387a;
            }
        }

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return dh.this.new g(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27759a;
            if (i == 0) {
                yhm.o.b(obj2);
                dh.this.i.a(dh.this.o, new a(dh.this));
                dg dgVar = dh.this.i;
                String str = dh.this.o;
                this.f27759a = 1;
                if (dgVar.a(str, this) == aVar) {
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

    public dh(mq0 presenter, xg stateProvider, wr effectHandler, aq0 popupHandler, aq0 viewCompletionErrorPopupHandler, qg0 analytics, fe1 viewNavigator, CoroutineScope coroutineScope, dg documentAnalysisManager, rg repository, wd1 viewCompletionHandler) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(viewCompletionErrorPopupHandler, "viewCompletionErrorPopupHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(documentAnalysisManager, "documentAnalysisManager");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        this.f27737a = presenter;
        this.f27738b = stateProvider;
        this.f27739c = effectHandler;
        this.d = popupHandler;
        this.e = viewCompletionErrorPopupHandler;
        this.f = analytics;
        this.f27740g = viewNavigator;
        this.f27741h = coroutineScope;
        this.i = documentAnalysisManager;
        this.f27742j = repository;
        this.k = viewCompletionHandler;
        this.o = repository.b();
        this.f27746p = new f(skm.z.f264021a, this);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f27741h.getF74819h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        a();
        a(zf.f35577a);
    }

    private final void f() {
        a();
        this.f27740g.b(xf.a.f34969a);
    }

    private final void g() {
        this.f.track(new tf.a.C0284a(this.f27742j.a()));
        h();
        i();
    }

    private final void h() {
        this.f27743l = skm.e0.C(this, null, null, new d(null), 3);
        this.f27744m = skm.e0.C(this, null, null, new e(null), 3);
    }

    private final void i() {
        this.f27745n = skm.e0.C(this.f27741h, this.f27746p, null, new g(null), 2);
    }

    public final xg d() {
        return this.f27738b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        tg.b bVar = new tg.b(si.b.f33018a);
        this.f.track(tf.a.d.f33762b);
        this.f27742j.a(bVar);
        b(bVar);
    }

    public final mq0 c() {
        return this.f27737a;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(yf event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof yf.b) {
            g();
        } else {
            if (!(event instanceof yf.a)) {
                throw new NoWhenBranchMatchedException();
            }
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(tg tgVar) {
        a();
        if (tgVar instanceof tg.a) {
            b((tg.a) tgVar);
        } else {
            if (tgVar instanceof tg.b) {
                this.f.track(tf.a.c.f33761b);
                this.f27742j.a(tgVar);
                e();
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void a() {
        this.i.a(this.o, new bi1(18));
        Job job2 = this.f27745n;
        if (job2 != null) {
            job2.f(null);
        }
        this.f27745n = null;
        Job job3 = this.f27743l;
        if (job3 != null) {
            job3.f(null);
        }
        this.f27743l = null;
        Job job4 = this.f27744m;
        if (job4 != null) {
            job4.f(null);
        }
        this.f27744m = null;
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27747a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ zf f27749c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(zf zfVar, Continuation continuation) {
            super(2, continuation);
            this.f27749c = zfVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return dh.this.new b(this.f27749c, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (((kotlinx.coroutines.flow.Flow) r6).collect(r1, r5) == r0) goto L15;
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
                int r1 = r5.f27747a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                yhm.o.b(r6)
                goto L44
            L10:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L18:
                yhm.o.b(r6)
                goto L30
            L1c:
                yhm.o.b(r6)
                com.fourthline.orca.internal.dh r6 = com.fourthline.orca.internal.dh.this
                com.fourthline.orca.internal.wd1 r6 = com.fourthline.orca.internal.dh.g(r6)
                com.fourthline.orca.internal.zf r1 = r5.f27749c
                r5.f27747a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L30
                goto L43
            L30:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.dh$b$a r1 = new com.fourthline.orca.internal.dh$b$a
                com.fourthline.orca.internal.dh r3 = com.fourthline.orca.internal.dh.this
                com.fourthline.orca.internal.zf r4 = r5.f27749c
                r1.<init>(r3, r4)
                r5.f27747a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.dh.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ dh f27750a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ zf f27751b;

            public a(dh dhVar, zf zfVar) {
                this.f27750a = dhVar;
                this.f27751b = zfVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(xd1 xd1Var, Continuation continuation) {
                if (!(xd1Var instanceof xd1.d) && !(xd1Var instanceof xd1.c)) {
                    if (xd1Var instanceof xd1.a) {
                        this.f27750a.f27740g.b(new xf.d(((xd1.a) xd1Var).a()));
                    } else {
                        if (!(xd1Var instanceof xd1.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f27750a.e.a(new hq0.c(((xd1.b) xd1Var).a(), null, new rj1(this.f27750a, this.f27751b, 1), 2, null));
                    }
                }
                return Unit.f186387a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit a(dh dhVar, zf zfVar) {
                dhVar.a(zfVar);
                return Unit.f186387a;
            }
        }
    }

    private final void b(tg.a aVar) {
        this.f.track(new tf.a.e(aVar.a(), aVar.c(), aVar.b(), aVar.e()));
        if (!aVar.e().isEmpty()) {
            er erVar = (er) zhm.d0.b0(aVar.e());
            hq0.c cVar = new hq0.c(erVar, "", null, 4, null);
            if (!(erVar instanceof er.f) && !(erVar instanceof er.g) && !(erVar instanceof er.d) && !(erVar instanceof er.e)) {
                this.d.a(cVar);
                return;
            } else {
                aq0.a(this.d, cVar, null, new rj1(this, aVar, 16), 2, null);
                return;
            }
        }
        a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(tg it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(dh dhVar, tg.a aVar) {
        dhVar.a(aVar);
        return Unit.f186387a;
    }

    private final void a(tg.a aVar) {
        this.f27742j.a(aVar);
        skm.e0.C(this, null, null, new c(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(zf zfVar) {
        skm.e0.C(this, null, null, new b(zfVar, null), 3);
    }
}
