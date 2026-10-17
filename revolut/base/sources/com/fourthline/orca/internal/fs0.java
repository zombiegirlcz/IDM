package com.fourthline.orca.internal;

import com.fourthline.orca.internal.cw0;
import com.fourthline.orca.internal.dw0;
import com.fourthline.orca.internal.gt0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.nx0;
import com.fourthline.orca.internal.or0;
import com.fourthline.orca.internal.qr0;
import com.fourthline.orca.internal.re1;
import com.fourthline.orca.internal.rr0;
import com.fourthline.orca.internal.tr0;
import com.fourthline.orca.internal.wr0;
import com.fourthline.orca.internal.xd1;
import com.fourthline.orca.qes.internal.error.QesError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes23.dex */
public final class fs0 implements ax, CoroutineScope {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final a f28627r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f28628s = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f28629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f28630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final es0 f28631c;
    private final fe1 d;
    private final wd1 e;
    private final zr0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final bs0 f28632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final mr0 f28633h;
    private final dw0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final nx0 f28634j;
    private final kw k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final aq0 f28635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final qg0 f28636m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private dw0.b.a f28637n;
    private List o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List f28638p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f28639q;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f28641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f28642c;

        public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function0 {
            public a(Object obj2) {
                super(0, 0, fs0.class, obj2, "authorizeUser", "authorizeUser()V");
            }

            public final void a() {
                ((fs0) this.receiver).a();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f186387a;
            }
        }

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
            return fs0.this.new b(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            ArrayList arrayListE0;
            Object objA;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f28642c;
            if (i == 0) {
                yhm.o.b(obj2);
                List list = fs0.this.o;
                fs0 fs0Var = fs0.this;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(fs0Var.a((dw0.b.a.C0189b) it8.next()));
                }
                List list2 = fs0.this.f28639q;
                if (list2 != null) {
                    fs0 fs0Var2 = fs0.this;
                    List list3 = fs0Var2.f28638p;
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                    Iterator it9 = list3.iterator();
                    while (it9.hasNext()) {
                        arrayList2.add(fs0Var2.a((dw0.b.a.C0188a) it9.next()));
                    }
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it10 = list2.iterator();
                    while (it10.hasNext()) {
                        arrayList3.add(fs0Var2.a((cw0.a.C0180a.C0181a) it10.next()));
                    }
                    arrayListE0 = zhm.d0.E0(arrayList3, arrayList2);
                } else {
                    List list4 = fs0.this.f28638p;
                    fs0 fs0Var3 = fs0.this;
                    ArrayList arrayList4 = new ArrayList(zhm.w.t(list4, 10));
                    Iterator it11 = list4.iterator();
                    while (it11.hasNext()) {
                        arrayList4.add(fs0Var3.a((dw0.b.a.C0188a) it11.next()));
                    }
                    arrayListE0 = arrayList4;
                }
                nx0 nx0Var = fs0.this.f28634j;
                nx0.a aVar2 = new nx0.a(fs0.this.f.a(), arrayList, arrayListE0, fs0.this.f.b());
                this.f28640a = null;
                this.f28641b = null;
                this.f28642c = 1;
                objA = nx0Var.a(aVar2, this);
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
            fs0 fs0Var4 = fs0.this;
            Throwable thA = yhm.m.a(objA);
            if (thA == null) {
                nx0.b bVar = (nx0.b) objA;
                if (bVar instanceof nx0.b.c) {
                    fs0Var4.a(sr0.f33122a);
                } else if (bVar instanceof nx0.b.a) {
                    fs0Var4.j();
                } else if (bVar instanceof nx0.b.d) {
                    fs0Var4.i();
                } else {
                    if (!(bVar instanceof nx0.b.C0255b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fs0Var4.f28635l.a(new hq0.c(((nx0.b.C0255b) bVar).a(), null, null, 6, null));
                }
            } else {
                fs0Var4.k.handleRecoverableError(thA instanceof QesError ? (kh0) thA : se1.a(thA), "agreements", new a(fs0Var4));
            }
            return Unit.f186387a;
        }
    }

    public static final class d extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28648a;

        public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function0 {
            public a(Object obj2) {
                super(0, 0, fs0.class, obj2, "retrieveSigningDetails", "retrieveSigningDetails()V");
            }

            public final void a() {
                ((fs0) this.receiver).k();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f186387a;
            }
        }

        public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function0 {
            public b(Object obj2) {
                super(0, 0, fs0.class, obj2, "retrieveSigningDetails", "retrieveSigningDetails()V");
            }

            public final void a() {
                ((fs0) this.receiver).k();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f186387a;
            }
        }

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
            return fs0.this.new d(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object objA;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f28648a;
            if (i == 0) {
                yhm.o.b(obj2);
                dw0 dw0Var = fs0.this.i;
                dw0.a aVar2 = new dw0.a(fs0.this.f.a());
                this.f28648a = 1;
                objA = dw0Var.a(aVar2, this);
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
            fs0 fs0Var = fs0.this;
            Throwable thA = yhm.m.a(objA);
            if (thA == null) {
                fs0Var.a(((dw0.b) objA).a());
            } else {
                Throwable thA2 = thA instanceof QesError ? (kh0) thA : se1.a(thA);
                if (thA2 instanceof re1.c) {
                    fs0Var.k.handleRecoverableError(wr0.a.f34775a, "agreements", new a(fs0Var));
                } else {
                    fs0Var.k.handleRecoverableError(thA2, "agreements", new b(fs0Var));
                }
            }
            return Unit.f186387a;
        }
    }

    public fs0(mq0 presenter, es0 stateProvider, fe1 viewNavigator, wd1 viewCompletionHandler, zr0 repository, bs0 resultRepository, mr0 activePdfRepository, dw0 qesRetrieveSigningDetailsWorker, nx0 qesUserAuthorizationWorker, kw errorHandler, aq0 popupHandler, qg0 analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(activePdfRepository, "activePdfRepository");
        Intrinsics.checkNotNullParameter(qesRetrieveSigningDetailsWorker, "qesRetrieveSigningDetailsWorker");
        Intrinsics.checkNotNullParameter(qesUserAuthorizationWorker, "qesUserAuthorizationWorker");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f28629a = coroutineScope;
        this.f28630b = presenter;
        this.f28631c = stateProvider;
        this.d = viewNavigator;
        this.e = viewCompletionHandler;
        this.f = repository;
        this.f28632g = resultRepository;
        this.f28633h = activePdfRepository;
        this.i = qesRetrieveSigningDetailsWorker;
        this.f28634j = qesUserAuthorizationWorker;
        this.k = errorHandler;
        this.f28635l = popupHandler;
        this.f28636m = analytics;
        zhm.f0 f0Var = zhm.f0.f322471a;
        this.o = f0Var;
        this.f28638p = f0Var;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f28629a.getF74819h();
    }

    private final void c() {
        this.f28630b.a(this.f28631c.s());
        this.f28636m.track(or0.a.e.f31748b);
        a();
    }

    private final void d() {
        this.f28636m.track(or0.a.c.f31746b);
        if (this.f28637n == null) {
            k();
        } else {
            l();
        }
    }

    private final void e() {
        this.k.handleRecoverableError(QesError.Canceled.INSTANCE, "agreements", new dl1(12));
        this.f28636m.track(or0.a.C0258a.f31744b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f() {
        return Unit.f186387a;
    }

    private final void g() {
        this.f28636m.track(or0.a.f.f31749b);
    }

    private final void h() {
        this.f28636m.track(or0.a.g.f31750b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        this.k.handleError(QesError.TooManyAuthorizationAttempts.INSTANCE, "agreements");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        this.d.b(new qr0.b(gt0.b.f28997a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        skm.e0.C(this, null, null, new d(null), 3);
    }

    private final void l() {
        this.f28630b.a(this.f28631c.a(this.o, this.f28638p, this.f28639q));
    }

    public final mq0 b() {
        return this.f28630b;
    }

    private final void b(boolean z) {
        this.f28636m.track(new or0.a.i(z));
        this.f28630b.a(this.f28631c.e(z));
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(rr0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof rr0.d) {
            d();
            return;
        }
        if (event instanceof rr0.b) {
            a(((rr0.b) event).a());
            return;
        }
        if (event instanceof rr0.c) {
            c();
            return;
        }
        if (event instanceof rr0.e) {
            e();
            return;
        }
        if (event instanceof rr0.f) {
            g();
            return;
        }
        if (event instanceof rr0.g) {
            h();
        } else if (event instanceof rr0.h) {
            b(((rr0.h) event).a());
        } else {
            if (!(event instanceof rr0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((rr0.a) event).a());
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28643a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ sr0 f28645c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(sr0 sr0Var, Continuation continuation) {
            super(2, continuation);
            this.f28645c = sr0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return fs0.this.new c(this.f28645c, continuation);
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
                int r1 = r5.f28643a
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
                com.fourthline.orca.internal.fs0 r6 = com.fourthline.orca.internal.fs0.this
                com.fourthline.orca.internal.wd1 r6 = com.fourthline.orca.internal.fs0.j(r6)
                com.fourthline.orca.internal.sr0 r1 = r5.f28645c
                r5.f28643a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L30
                goto L43
            L30:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.fs0$c$a r1 = new com.fourthline.orca.internal.fs0$c$a
                com.fourthline.orca.internal.fs0 r3 = com.fourthline.orca.internal.fs0.this
                com.fourthline.orca.internal.sr0 r4 = r5.f28645c
                r1.<init>(r3, r4)
                r5.f28643a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.fs0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ fs0 f28646a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ sr0 f28647b;

            public a(fs0 fs0Var, sr0 sr0Var) {
                this.f28646a = fs0Var;
                this.f28647b = sr0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(xd1 xd1Var, Continuation continuation) {
                if (!(xd1Var instanceof xd1.d) && !(xd1Var instanceof xd1.c)) {
                    if (xd1Var instanceof xd1.a) {
                        fe1 fe1Var = this.f28646a.d;
                        ky kyVarA = ((xd1.a) xd1Var).a();
                        gt0 gt0Var = (gt0) (!(kyVarA instanceof gt0) ? null : kyVarA);
                        if (gt0Var == null) {
                            throw new IllegalStateException(kyVarA.getClass().getSimpleName().concat(" are not accepted by this Coordinator.").toString());
                        }
                        fe1Var.b(new qr0.b(gt0Var));
                    } else {
                        if (!(xd1Var instanceof xd1.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f28646a.f28635l.a(new hq0.c(((xd1.b) xd1Var).a(), null, new rj1(this.f28646a, this.f28647b, 4), 2, null));
                    }
                }
                return Unit.f186387a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit a(fs0 fs0Var, sr0 sr0Var) {
                fs0Var.a(sr0Var);
                return Unit.f186387a;
            }
        }
    }

    private final void a(boolean z) {
        this.f28636m.track(new or0.a.b(z));
        this.f28630b.a(this.f28631c.d(z));
    }

    private final void a(tr0.a.InterfaceC0287a interfaceC0287a) {
        if (interfaceC0287a instanceof tr0.a.InterfaceC0287a.b) {
            a((tr0.a.InterfaceC0287a.b) interfaceC0287a);
        } else {
            if (!(interfaceC0287a instanceof tr0.a.InterfaceC0287a.C0288a)) {
                throw new NoWhenBranchMatchedException();
            }
            a((tr0.a.InterfaceC0287a.C0288a) interfaceC0287a);
        }
    }

    private final void a(tr0.a.InterfaceC0287a.C0288a c0288a) {
        Object next;
        Iterator it8 = this.f28638p.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f(((dw0.b.a.C0188a) next).c(), c0288a.a())) {
                    break;
                }
            }
        }
        dw0.b.a.C0188a c0188a = (dw0.b.a.C0188a) next;
        if (c0188a != null) {
            this.f28633h.a(c0188a.c(), c0188a.a());
            this.f28636m.track(new or0.a.d(this.f28638p.indexOf(c0188a)));
            this.d.b(qr0.c.f32520a);
            return;
        }
        throw new IllegalStateException("Developer error. Document should exist at this point!");
    }

    private final void a(tr0.a.InterfaceC0287a.b bVar) {
        Object next;
        Iterator it8 = this.o.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f(((dw0.b.a.C0189b) next).c(), bVar.b())) {
                    break;
                }
            }
        }
        dw0.b.a.C0189b c0189b = (dw0.b.a.C0189b) next;
        if (c0189b != null) {
            this.f28633h.a(c0189b.c(), c0189b.a());
            this.f28636m.track(new or0.a.h(this.o.indexOf(c0189b)));
            this.d.b(qr0.c.f32520a);
            return;
        }
        throw new IllegalStateException("Developer error. Document should exist at this point!");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(dw0.b.a aVar) {
        this.f28637n = aVar;
        this.f28632g.a(aVar.c());
        this.f28632g.a(aVar.d());
        bs0 bs0Var = this.f28632g;
        List listE = aVar.e();
        ArrayList arrayList = new ArrayList(zhm.w.t(listE, 10));
        Iterator it8 = listE.iterator();
        while (it8.hasNext()) {
            arrayList.add(((dw0.b.a.C0189b) it8.next()).c());
        }
        bs0Var.a(arrayList);
        this.o = aVar.e();
        this.f28638p = aVar.b();
        this.f28639q = aVar.a();
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        skm.e0.C(this, null, null, new b(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(sr0 sr0Var) {
        skm.e0.C(this, null, null, new c(sr0Var, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nx0.a.C0253a a(dw0.b.a.C0188a c0188a) {
        return new nx0.a.C0253a(c0188a.b(), c0188a.d(), c0188a.e(), c0188a.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nx0.a.C0253a a(cw0.a.C0180a.C0181a c0181a) {
        return new nx0.a.C0253a(c0181a.a(), null, c0181a.c(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nx0.a.b a(dw0.b.a.C0189b c0189b) {
        return nx0.a.b.f31506c.a(c0189b.b(), c0189b.a());
    }
}
