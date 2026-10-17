package com.fourthline.orca.internal;

import com.fourthline.orca.internal.a0;
import com.fourthline.orca.internal.c0;
import com.fourthline.orca.internal.d0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.xd1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes23.dex */
public final class j0 implements ax, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f29766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f29767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wr f29768c;
    private final h0 d;
    private final o40 e;
    private final g0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fe1 f29769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wd1 f29770h;
    private final qg0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final aq0 f29771j;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b0.values().length];
            try {
                iArr[b0.f26948a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b0.f26949b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b0.f26950c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b0.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b0.e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j0(mq0 presenter, wr effectHandler, h0 repository, o40 residencyViewStateManager, g0 stateProvider, fe1 viewNavigator, wd1 viewCompletionHandler, qg0 analytics, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(residencyViewStateManager, "residencyViewStateManager");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f29766a = coroutineScope;
        this.f29767b = presenter;
        this.f29768c = effectHandler;
        this.d = repository;
        this.e = residencyViewStateManager;
        this.f = stateProvider;
        this.f29769g = viewNavigator;
        this.f29770h = viewCompletionHandler;
        this.i = analytics;
        this.f29771j = popupHandler;
    }

    private final void e() {
        this.i.track(a0.a.C0162a.f26664b);
        this.f29769g.b(c0.c.a.f27298a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 f() {
        return c0.b.f27297a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 g() {
        return c0.a.f27296a;
    }

    private final void h() {
        this.i.track(a0.a.c.f26666b);
        a(e0.f27958a);
    }

    private final void i() {
        this.i.track(a0.a.b.f26665b);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f29766a.getF74819h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 c() {
        return c0.d.f27300a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0 d() {
        return c0.b.f27297a;
    }

    public final mq0 b() {
        return this.f29767b;
    }

    public final wr a() {
        return this.f29768c;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(d0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof d0.i) {
            i();
            return;
        }
        if (event instanceof d0.h) {
            h();
            return;
        }
        if (event instanceof d0.a) {
            e();
            return;
        }
        if (event instanceof d0.c) {
            a((d0.c) event);
            return;
        }
        if (event instanceof d0.j) {
            a((d0.j) event);
            return;
        }
        if (event instanceof d0.d) {
            d0.d dVar = (d0.d) event;
            a01 a01VarA = this.e.a(dVar.a());
            if (a01VarA != null) {
                a(a01VarA);
                return;
            } else {
                this.e.b(dVar.a());
                this.f29767b.a(this.f.w());
                return;
            }
        }
        if (event instanceof d0.e) {
            this.e.a(true);
            this.f29767b.a(this.f.w());
            this.f29768c.a(new wn1(1));
        } else if (!(event instanceof d0.f) && !Intrinsics.f(event, d0.b.f27599a)) {
            if (!(event instanceof d0.g)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((d0.g) event).a());
        } else {
            this.e.a(false);
            this.f29767b.a(this.f.w());
            this.f29768c.a(new wn1(2));
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29772a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ e0 f29774c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e0 e0Var, Continuation continuation) {
            super(2, continuation);
            this.f29774c = e0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return j0.this.new b(this.f29774c, continuation);
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
                int r1 = r5.f29772a
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
                com.fourthline.orca.internal.j0 r6 = com.fourthline.orca.internal.j0.this
                com.fourthline.orca.internal.wd1 r6 = com.fourthline.orca.internal.j0.c(r6)
                com.fourthline.orca.internal.e0 r1 = r5.f29774c
                r5.f29772a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L30
                goto L43
            L30:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.j0$b$a r1 = new com.fourthline.orca.internal.j0$b$a
                com.fourthline.orca.internal.j0 r3 = com.fourthline.orca.internal.j0.this
                com.fourthline.orca.internal.e0 r4 = r5.f29774c
                r1.<init>(r3, r4)
                r5.f29772a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.j0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ j0 f29775a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e0 f29776b;

            public a(j0 j0Var, e0 e0Var) {
                this.f29775a = j0Var;
                this.f29776b = e0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(xd1 xd1Var, Continuation continuation) {
                if (!(xd1Var instanceof xd1.d)) {
                    if (xd1Var instanceof xd1.c) {
                        this.f29775a.b().a(this.f29775a.f.d(true));
                    } else if (xd1Var instanceof xd1.a) {
                        this.f29775a.b().a(this.f29775a.f.d(false));
                        fe1 fe1Var = this.f29775a.f29769g;
                        ky kyVarA = ((xd1.a) xd1Var).a();
                        l0 l0Var = (l0) (!(kyVarA instanceof l0) ? null : kyVarA);
                        if (l0Var == null) {
                            throw new IllegalStateException(kyVarA.getClass().getSimpleName().concat(" are not accepted by this Coordinator.").toString());
                        }
                        fe1Var.b(new c0.c.b(l0Var));
                    } else {
                        if (!(xd1Var instanceof xd1.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f29775a.b().a(this.f29775a.f.d(false));
                        this.f29775a.f29771j.a(new hq0.c(((xd1.b) xd1Var).a(), null, new rj1(this.f29775a, this.f29776b, 6), 2, null));
                    }
                }
                return Unit.f186387a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit a(j0 j0Var, e0 e0Var) {
                j0Var.a(e0Var);
                return Unit.f186387a;
            }
        }
    }

    private final void a(a01 a01Var) {
        this.e.a(a01Var);
        this.f29767b.a(this.f.w());
        this.f29768c.a(new wn1(3));
        this.f29768c.a(new wn1(4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(e0 e0Var) {
        skm.e0.C(this, null, null, new b(e0Var, null), 3);
    }

    private final void a(d0.j jVar) {
        String strB = jVar.b();
        int i = a.$EnumSwitchMapping$0[jVar.a().ordinal()];
        if (i == 1) {
            this.d.d(jVar.b());
        } else if (i == 2) {
            try {
                this.d.a(Integer.valueOf(Integer.parseInt(jVar.b())));
            } catch (NumberFormatException unused) {
                if (jVar.b().length() == 0) {
                    this.d.a((Integer) null);
                } else {
                    strB = ((f0) this.f29767b.b()).t().getText();
                }
            }
        } else if (i == 3) {
            this.d.a(jVar.b());
        } else if (i == 4) {
            this.d.c(jVar.b());
        } else if (i == 5) {
            this.d.e(jVar.b());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f29767b.a(this.f.a(jVar.a(), strB));
    }

    private final void a(d0.c cVar) {
        this.f29767b.a(this.f.a(cVar.a(), cVar.b()));
    }
}
