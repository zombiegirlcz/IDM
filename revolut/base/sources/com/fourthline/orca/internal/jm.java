package com.fourthline.orca.internal;

import com.fourthline.orca.internal.bm;
import com.fourthline.orca.internal.cm;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.xd1;
import com.fourthline.orca.internal.y20;
import com.fourthline.orca.internal.z20;
import com.fourthline.orca.internal.zl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes23.dex */
public final class jm implements ax, CoroutineScope {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f29948l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f29949m = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f29950n = "personal_details_nationality";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f29951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f29952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wr f29953c;
    private final im d;
    private final o40 e;
    private final fe1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wd1 f29954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final gl0 f29955h;
    private final il0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final qg0 f29956j;
    private final aq0 k;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[dm.values().length];
            try {
                iArr[dm.f27818a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public jm(mq0 presenter, wr effectHandler, im stateProvider, o40 nationalityViewStateManager, fe1 viewNavigator, wd1 viewCompletionHandler, gl0 repository, il0 resultRepository, qg0 analytics, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(nationalityViewStateManager, "nationalityViewStateManager");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f29951a = coroutineScope;
        this.f29952b = presenter;
        this.f29953c = effectHandler;
        this.d = stateProvider;
        this.e = nationalityViewStateManager;
        this.f = viewNavigator;
        this.f29954g = viewCompletionHandler;
        this.f29955h = repository;
        this.i = resultRepository;
        this.f29956j = analytics;
        this.k = popupHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(jm jmVar) {
        jmVar.e.a(true);
        jmVar.f29952b.a(jmVar.d.w());
        jmVar.f29953c.a(new wn1(10));
        return Unit.f186387a;
    }

    private final void f() {
        this.f29956j.track(zl.a.C0321a.f35630b);
        this.f.b(bm.c.a.f27159a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bm g() {
        return bm.b.f27158a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bm h() {
        return bm.a.f27157a;
    }

    private final void i() {
        fd fdVarK = this.f29955h.k();
        if (fdVarK != null) {
            this.f29956j.track(new zl.a.d(fdVarK));
        }
        a(em.f28186a);
    }

    private final void j() {
        this.f29956j.track(zl.a.c.f35632b);
        z20 z20VarA = this.e.a();
        z20.a aVar = z20VarA instanceof z20.a ? (z20.a) z20VarA : null;
        if (aVar != null) {
            a(aVar.a());
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f29951a.getF74819h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bm c() {
        return bm.d.f27162a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bm d() {
        return bm.b.f27158a;
    }

    public final mq0 b() {
        return this.f29952b;
    }

    public final wr a() {
        return this.f29953c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bm e() {
        return bm.d.f27162a;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(cm event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof cm.i) {
            j();
            return;
        }
        if (event instanceof cm.d) {
            cm.d dVar = (cm.d) event;
            a01 a01VarA = this.e.a(dVar.a());
            if (a01VarA != null) {
                a(a01VarA);
            } else {
                this.e.b(dVar.a());
                this.f29952b.a(this.d.w());
            }
            this.f29952b.a(this.d.w());
            return;
        }
        if (event instanceof cm.e) {
            this.e.a(true);
            this.f29952b.a(this.d.w());
            this.f29953c.a(new wn1(13));
            return;
        }
        if (!(event instanceof cm.f) && !Intrinsics.f(event, cm.b.f27505a)) {
            if (event instanceof cm.g) {
                a(((cm.g) event).a());
                return;
            }
            if (event instanceof cm.c) {
                a((cm.c) event);
                return;
            }
            if (event instanceof cm.j) {
                a((cm.j) event);
                return;
            } else if (event instanceof cm.h) {
                i();
                return;
            } else {
                if (!(event instanceof cm.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                f();
                return;
            }
        }
        this.e.a(false);
        this.f29952b.a(this.d.w());
        this.f29953c.a(new wn1(14));
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29957a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ em f29959c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(em emVar, Continuation continuation) {
            super(2, continuation);
            this.f29959c = emVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return jm.this.new c(this.f29959c, continuation);
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
                int r1 = r5.f29957a
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
                com.fourthline.orca.internal.jm r6 = com.fourthline.orca.internal.jm.this
                com.fourthline.orca.internal.wd1 r6 = com.fourthline.orca.internal.jm.c(r6)
                com.fourthline.orca.internal.em r1 = r5.f29959c
                r5.f29957a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L30
                goto L43
            L30:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.jm$c$a r1 = new com.fourthline.orca.internal.jm$c$a
                com.fourthline.orca.internal.jm r3 = com.fourthline.orca.internal.jm.this
                com.fourthline.orca.internal.em r4 = r5.f29959c
                r1.<init>(r3, r4)
                r5.f29957a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.jm.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ jm f29960a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ em f29961b;

            public a(jm jmVar, em emVar) {
                this.f29960a = jmVar;
                this.f29961b = emVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(xd1 xd1Var, Continuation continuation) {
                if (!(xd1Var instanceof xd1.d)) {
                    if (xd1Var instanceof xd1.c) {
                        this.f29960a.b().a(this.f29960a.d.d(true));
                    } else if (xd1Var instanceof xd1.a) {
                        this.f29960a.b().a(this.f29960a.d.d(false));
                        fe1 fe1Var = this.f29960a.f;
                        ky kyVarA = ((xd1.a) xd1Var).a();
                        ck0 ck0Var = (ck0) (!(kyVarA instanceof ck0) ? null : kyVarA);
                        if (ck0Var == null) {
                            throw new IllegalStateException(kyVarA.getClass().getSimpleName().concat(" are not accepted by this Coordinator.").toString());
                        }
                        fe1Var.b(new bm.c.C0171c(ck0Var));
                    } else {
                        if (!(xd1Var instanceof xd1.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f29960a.b().a(this.f29960a.d.d(false));
                        this.f29960a.k.a(new hq0.c(((xd1.b) xd1Var).a(), null, new rj1(this.f29960a, this.f29961b, 7), 2, null));
                    }
                }
                return Unit.f186387a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit a(jm jmVar, em emVar) {
                jmVar.a(emVar);
                return Unit.f186387a;
            }
        }
    }

    private final void a(a01 a01Var) {
        this.e.a(a01Var);
        this.f29952b.a(this.d.w());
        this.f29953c.a(new wn1(11));
        this.f29953c.a(new wn1(12));
        z20 z20VarA = this.e.a();
        z20.a aVar = z20VarA instanceof z20.a ? (z20.a) z20VarA : null;
        if (aVar != null) {
            a(aVar.a());
        } else if (a01Var instanceof kl0) {
            this.f29956j.track(new zl.a.b(((kl0) a01Var).b()));
        }
    }

    private final void a(y20 y20Var) {
        hq0.c cVar;
        if (y20Var instanceof y20.b.C0314b) {
            y20.b.C0314b c0314b = (y20.b.C0314b) y20Var;
            this.f29956j.track(new zl.a.e(c0314b.a()));
            cVar = new hq0.c(c0314b.b(), null, null, 6, null);
        } else if (y20Var instanceof y20.b.a) {
            y20.b.a aVar = (y20.b.a) y20Var;
            this.f29956j.track(new zl.a.e(aVar.a()));
            cVar = new hq0.c(aVar.b(), null, null, 6, null);
        } else {
            cVar = null;
        }
        hq0.c cVar2 = cVar;
        if (cVar2 != null) {
            aq0.a(this.k, cVar2, new ul1(this, 28), null, 4, null);
        }
    }

    private final void a(cm.j jVar) {
        if (b.$EnumSwitchMapping$0[jVar.a().ordinal()] == 1) {
            this.i.b(jVar.b());
            this.f29952b.a(this.d.a(jVar.b()));
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void a(cm.c cVar) {
        this.f29952b.a(this.d.a(cVar.b(), cVar.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(em emVar) {
        skm.e0.C(this, null, null, new c(emVar, null), 3);
    }
}
