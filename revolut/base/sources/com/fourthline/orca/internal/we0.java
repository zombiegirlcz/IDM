package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.ke0;
import com.fourthline.orca.internal.le0;
import com.fourthline.orca.internal.me0;
import com.fourthline.orca.internal.xd1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes23.dex */
public final class we0 implements ax, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f34655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f34656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wr f34657c;
    private final j20 d;
    private final aq0 e;
    private final se0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wd1 f34658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final qg0 f34659h;
    private final fe1 i;

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function0 {
        public b(Object obj2) {
            super(0, 0, we0.class, obj2, "onNextButtonClicked", "onNextButtonClicked()V");
        }

        public final void a() {
            ((we0) this.receiver).i();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f186387a;
        }
    }

    public we0(mq0 presenter, wr effectHandler, j20 stateProvider, aq0 popupHandler, se0 repository, wd1 viewCompletionHandler, qg0 analytics, fe1 viewNavigator, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f34655a = coroutineScope;
        this.f34656b = presenter;
        this.f34657c = effectHandler;
        this.d = stateProvider;
        this.e = popupHandler;
        this.f = repository;
        this.f34658g = viewCompletionHandler;
        this.f34659h = analytics;
        this.i = viewNavigator;
    }

    private final void e() {
        l();
        this.i.b(le0.a.b.f30593a);
    }

    private final void f() {
        fd fdVarC = c();
        if (fdVarC != null) {
            this.f34659h.track(new ke0.a.C0236a(a(), fdVarC));
        }
        this.i.b(le0.a.C0241a.f30592a);
    }

    private final void g() {
        if (this.f.c()) {
            this.i.b(le0.a.b.f30593a);
        }
    }

    private final void h() {
        fd fdVarC = c();
        if (fdVarC != null) {
            this.f34659h.track(new ke0.a.d(a(), fdVarC));
        }
        aq0.a(this.e, ne0.f31400a, new b(this), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        fd fdVarC = c();
        if (fdVarC != null) {
            this.f34659h.track(new ke0.a.e(a(), fdVarC));
        }
        if (this.f.c()) {
            e();
        } else {
            this.e.a(oe0.f31654a);
        }
    }

    private final void j() {
        fd fdVarC = c();
        if (fdVarC != null) {
            this.f34659h.track(new ke0.a.b(a(), fdVarC));
        }
        m();
    }

    private final void k() {
        fd fdVarC = c();
        if (fdVarC != null) {
            this.f34659h.track(new ke0.a.f(a(), fdVarC));
        }
        l();
        a(pe0.f31928a);
    }

    private final void l() {
        this.f.e();
    }

    private final void m() {
        this.f34656b.a(new ss1(this, 3));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f34655a.getF74819h();
    }

    private final fd c() {
        return this.f.a();
    }

    public final mq0 d() {
        return this.f34656b;
    }

    public final wr b() {
        return this.f34657c;
    }

    private final DocumentType a() {
        return this.f.b();
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(me0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof me0.a) {
            f();
            return;
        }
        if (event instanceof me0.f) {
            i();
            return;
        }
        if (event instanceof me0.h) {
            k();
            return;
        }
        if (event instanceof me0.b) {
            g();
            return;
        }
        if (event instanceof me0.g) {
            j();
            return;
        }
        if (event instanceof me0.c) {
            m();
            return;
        }
        if (event instanceof me0.e) {
            h();
        } else {
            if (event instanceof me0.d) {
                me0.d dVar = (me0.d) event;
                a(dVar.b(), dVar.a(), dVar.c());
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f34660a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pe0 f34662c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(pe0 pe0Var, Continuation continuation) {
            super(2, continuation);
            this.f34662c = pe0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return we0.this.new a(this.f34662c, continuation);
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
                int r1 = r5.f34660a
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
                com.fourthline.orca.internal.we0 r6 = com.fourthline.orca.internal.we0.this
                com.fourthline.orca.internal.wd1 r6 = com.fourthline.orca.internal.we0.b(r6)
                com.fourthline.orca.internal.pe0 r1 = r5.f34662c
                r5.f34660a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L30
                goto L43
            L30:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.we0$a$a r1 = new com.fourthline.orca.internal.we0$a$a
                com.fourthline.orca.internal.we0 r3 = com.fourthline.orca.internal.we0.this
                com.fourthline.orca.internal.pe0 r4 = r5.f34662c
                r1.<init>(r3, r4)
                r5.f34660a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.we0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.we0$a$a, reason: collision with other inner class name */
        public static final class C0304a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ we0 f34663a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ pe0 f34664b;

            public C0304a(we0 we0Var, pe0 pe0Var) {
                this.f34663a = we0Var;
                this.f34664b = pe0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(xd1 xd1Var, Continuation continuation) {
                if (!(xd1Var instanceof xd1.d) && !(xd1Var instanceof xd1.c)) {
                    if (xd1Var instanceof xd1.a) {
                        fe1 fe1Var = this.f34663a.i;
                        ky kyVarA = ((xd1.a) xd1Var).a();
                        ld0 ld0Var = (ld0) (!(kyVarA instanceof ld0) ? null : kyVarA);
                        if (ld0Var == null) {
                            throw new IllegalStateException(kyVarA.getClass().getSimpleName().concat(" are not accepted by this Coordinator.").toString());
                        }
                        fe1Var.b(new le0.a.c(ld0Var));
                    } else {
                        if (!(xd1Var instanceof xd1.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f34663a.e.a(new hq0.c(((xd1.b) xd1Var).a(), null, new rj1(this.f34663a, this.f34664b, 11), 2, null));
                    }
                }
                return Unit.f186387a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit a(we0 we0Var, pe0 pe0Var) {
                we0Var.a(pe0Var);
                return Unit.f186387a;
            }
        }
    }

    private final void a(String str, int i, int i2) {
        this.f34659h.track(new ke0.a.c(str, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(pe0 pe0Var) {
        skm.e0.C(this, null, null, new a(pe0Var, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qe0 a(we0 we0Var, qe0 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return (qe0) we0Var.d.getInitialState();
    }
}
