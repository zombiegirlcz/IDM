package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.orca.internal.fm0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.xd1;
import com.fourthline.orca.internal.zn0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes23.dex */
public final class go0 implements ax, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f28944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f28945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fo0 f28946c;
    private final co0 d;
    private final do0 e;
    private final qg0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fe1 f28947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wd1 f28948h;
    private final aq0 i;

    public go0(mq0 presenter, fo0 stateProvider, co0 repository, do0 resultRepository, qg0 analytics, fe1 viewNavigator, wd1 viewCompletionHandler, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f28944a = coroutineScope;
        this.f28945b = presenter;
        this.f28946c = stateProvider;
        this.d = repository;
        this.e = resultRepository;
        this.f = analytics;
        this.f28947g = viewNavigator;
        this.f28948h = viewCompletionHandler;
        this.i = popupHandler;
    }

    private final void d() {
        this.f.track(fm0.a.c.f28566b);
        this.e.a(this.d.a());
        a(ao0.f26858a);
    }

    private final void e() {
        this.f28945b.a(new mp1(this, 8));
        this.f.track(fm0.a.b.f28565b);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f28944a.getF74819h();
    }

    private final void c() {
        this.f28945b.a(this.f28946c.p());
    }

    private final void b() {
        this.f.track(fm0.a.C0199a.f28564b);
        if (((bo0) this.f28945b.b()).r() != null) {
            c();
        } else {
            this.f28947g.b(xn0.f35048a);
        }
    }

    public final mq0 a() {
        return this.f28945b;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(zn0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(event instanceof zn0.a) && !(event instanceof zn0.b)) {
            if (event instanceof zn0.d) {
                d();
                return;
            }
            if (event instanceof zn0.f) {
                e();
                return;
            } else if (event instanceof zn0.e) {
                a(((zn0.e) event).a());
                return;
            } else {
                if (!(event instanceof zn0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                c();
                return;
            }
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(ao0 ao0Var) {
        skm.e0.C(this, null, null, new a(ao0Var, null), 3);
    }

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28949a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ao0 f28951c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ao0 ao0Var, Continuation continuation) {
            super(2, continuation);
            this.f28951c = ao0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return go0.this.new a(this.f28951c, continuation);
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
                int r1 = r5.f28949a
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
                com.fourthline.orca.internal.go0 r6 = com.fourthline.orca.internal.go0.this
                com.fourthline.orca.internal.wd1 r6 = com.fourthline.orca.internal.go0.b(r6)
                com.fourthline.orca.internal.ao0 r1 = r5.f28951c
                r5.f28949a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L30
                goto L43
            L30:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.go0$a$a r1 = new com.fourthline.orca.internal.go0$a$a
                com.fourthline.orca.internal.go0 r3 = com.fourthline.orca.internal.go0.this
                com.fourthline.orca.internal.ao0 r4 = r5.f28951c
                r1.<init>(r3, r4)
                r5.f28949a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.go0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.go0$a$a, reason: collision with other inner class name */
        public static final class C0204a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ go0 f28952a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ao0 f28953b;

            public C0204a(go0 go0Var, ao0 ao0Var) {
                this.f28952a = go0Var;
                this.f28953b = ao0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(xd1 xd1Var, Continuation continuation) {
                if (!(xd1Var instanceof xd1.d) && !(xd1Var instanceof xd1.c)) {
                    if (xd1Var instanceof xd1.a) {
                        fe1 fe1Var = this.f28952a.f28947g;
                        ky kyVarA = ((xd1.a) xd1Var).a();
                        kp0 kp0Var = (kp0) (!(kyVarA instanceof kp0) ? null : kyVarA);
                        if (kp0Var == null) {
                            throw new IllegalStateException(kyVarA.getClass().getSimpleName().concat(" are not accepted by this Coordinator.").toString());
                        }
                        fe1Var.b(new yn0(kp0Var));
                    } else {
                        if (!(xd1Var instanceof xd1.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f28952a.i.a(new hq0.c(((xd1.b) xd1Var).a(), null, new rj1(this.f28952a, this.f28953b, 5), 2, null));
                    }
                }
                return Unit.f186387a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit a(go0 go0Var, ao0 ao0Var) {
                go0Var.a(ao0Var);
                return Unit.f186387a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bo0 a(go0 go0Var, bo0 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return go0Var.f28946c.getInitialState();
    }

    private final void a(Bitmap bitmap) {
        this.f.track(fm0.a.d.f28567b);
        this.f28945b.a(this.f28946c.a(bitmap));
    }
}
