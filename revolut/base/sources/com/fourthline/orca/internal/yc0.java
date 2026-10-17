package com.fourthline.orca.internal;

import com.fourthline.orca.internal.qc0;
import com.fourthline.orca.internal.rc0;
import com.fourthline.orca.internal.sc0;
import com.fourthline.orca.internal.xd1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class yc0 implements ax, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f35255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f35256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final xc0 f35257c;
    private final n9 d;
    private final fe1 e;
    private final wd1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final qg0 f35258g;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35259a;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.yc0$a$a, reason: collision with other inner class name */
        public static final class C0317a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f35261a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f35262b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ yc0 f35263c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0317a(yc0 yc0Var, Continuation continuation) {
                super(2, continuation);
                this.f35263c = yc0Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(xd1 xd1Var, Continuation continuation) {
                return ((C0317a) create(xd1Var, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0317a c0317a = new C0317a(this.f35263c, continuation);
                c0317a.f35262b = obj2;
                return c0317a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                boolean z;
                xd1 xd1Var = (xd1) this.f35262b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f35261a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (xd1Var instanceof xd1.a) {
                    fe1 fe1Var = this.f35263c.e;
                    ky kyVarA = ((xd1.a) xd1Var).a();
                    wb0 wb0Var = (wb0) (!(kyVarA instanceof wb0) ? null : kyVarA);
                    if (wb0Var == null) {
                        throw new IllegalStateException(kyVarA.getClass().getSimpleName().concat(" are not accepted by this Coordinator.").toString());
                    }
                    fe1Var.b(new rc0.c(wb0Var));
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return yc0.this.new a(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (vkm.q.y((kotlinx.coroutines.flow.Flow) r6, r1, r5) == r0) goto L15;
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
                int r1 = r5.f35259a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                yhm.o.b(r6)
                goto L43
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
                com.fourthline.orca.internal.yc0 r6 = com.fourthline.orca.internal.yc0.this
                com.fourthline.orca.internal.wd1 r6 = com.fourthline.orca.internal.yc0.a(r6)
                com.fourthline.orca.internal.uc0 r1 = com.fourthline.orca.internal.uc0.f34000a
                r5.f35259a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L30
                goto L42
            L30:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.yc0$a$a r1 = new com.fourthline.orca.internal.yc0$a$a
                com.fourthline.orca.internal.yc0 r3 = com.fourthline.orca.internal.yc0.this
                r4 = 0
                r1.<init>(r3, r4)
                r5.f35259a = r2
                java.lang.Object r6 = vkm.q.y(r6, r1, r5)
                if (r6 != r0) goto L43
            L42:
                return r0
            L43:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.yc0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public yc0(mq0 presenter, xc0 stateProvider, n9 resultRepository, fe1 viewNavigator, wd1 viewCompletionHandler, qg0 analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f35255a = coroutineScope;
        this.f35256b = presenter;
        this.f35257c = stateProvider;
        this.d = resultRepository;
        this.e = viewNavigator;
        this.f = viewCompletionHandler;
        this.f35258g = analytics;
    }

    private final void c() {
        this.f35258g.track(qc0.a.d.f32389b);
        skm.e0.C(this, null, null, new a(null), 3);
    }

    private final void d() {
        this.f35258g.track(qc0.a.e.f32390b);
        this.e.b(rc0.b.f32687a);
    }

    private final void e() {
        this.f35258g.track(qc0.a.c.f32388b);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f35255a.getF74819h();
    }

    private final void b() {
        this.f35258g.track(qc0.a.C0272a.f32386b);
        this.e.b(rc0.a.f32686a);
    }

    public final mq0 a() {
        return this.f35256b;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(sc0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof sc0.e) {
            e();
            return;
        }
        if (event instanceof sc0.d) {
            d();
            return;
        }
        if (event instanceof sc0.a) {
            b();
            return;
        }
        if (event instanceof sc0.b) {
            a((sc0.b) event);
        } else if (event instanceof sc0.f) {
            a((sc0.f) event);
        } else {
            if (!(event instanceof sc0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            c();
        }
    }

    private final void a(sc0.f fVar) {
        this.f35258g.track(qc0.a.b.f32387b);
        this.d.a(fVar.a());
        this.f35256b.a(this.f35257c.a(fVar.a()));
    }

    private final void a(sc0.b bVar) {
        this.f35256b.a(this.f35257c.a(bVar.b(), bVar.a()));
    }
}
