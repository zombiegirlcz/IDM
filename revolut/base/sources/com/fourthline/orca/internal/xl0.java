package com.fourthline.orca.internal;

import com.fourthline.core.Gender;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.ol0;
import com.fourthline.orca.internal.pl0;
import com.fourthline.orca.internal.ql0;
import com.fourthline.orca.internal.xd1;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes23.dex */
public final class xl0 implements ax, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f35022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f35023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wr f35024c;
    private final wl0 d;
    private final fe1 e;
    private final wd1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final tl0 f35025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final qg0 f35026h;
    private final TimestampProvider i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final aq0 f35027j;

    public xl0(mq0 presenter, wr effectHandler, wl0 stateProvider, fe1 viewNavigator, wd1 viewCompletionHandler, tl0 repository, qg0 analytics, TimestampProvider timestampProvider, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f35022a = coroutineScope;
        this.f35023b = presenter;
        this.f35024c = effectHandler;
        this.d = stateProvider;
        this.e = viewNavigator;
        this.f = viewCompletionHandler;
        this.f35025g = repository;
        this.f35026h = analytics;
        this.i = timestampProvider;
        this.f35027j = popupHandler;
        repository.a(repository.d());
    }

    private final void e() {
        this.f35026h.track(ol0.a.g.f31690b);
        a(rl0.f32766a);
    }

    private final void f() {
        this.f35026h.track(ol0.a.c.f31686b);
        this.f35025g.a(true);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f35022a.getF74819h();
    }

    private final void c() {
        this.f35026h.track(ol0.a.C0257a.f31684b);
        this.e.b(pl0.a.C0264a.f31992a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pl0 d() {
        return pl0.b.f31994a;
    }

    public final mq0 b() {
        return this.f35023b;
    }

    public final wr a() {
        return this.f35024c;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(ql0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof ql0.j) {
            e();
            return;
        }
        if (event instanceof ql0.a) {
            c();
            return;
        }
        if (event instanceof ql0.d) {
            a((ql0.d) event);
            return;
        }
        if (event instanceof ql0.h) {
            a((ql0.h) event);
            return;
        }
        if (event instanceof ql0.b) {
            a((ql0.b) event);
            return;
        }
        if (event instanceof ql0.f) {
            a((ql0.f) event);
            return;
        }
        if (event instanceof ql0.e) {
            a((ql0.e) event);
            return;
        }
        if (event instanceof ql0.i) {
            a((ql0.i) event);
            return;
        }
        if (event instanceof ql0.c) {
            a(((ql0.c) event).a());
        } else if (event instanceof ql0.g) {
            a((ql0.g) event);
        } else {
            if (!(event instanceof ql0.k)) {
                throw new NoWhenBranchMatchedException();
            }
            f();
        }
    }

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35028a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ rl0 f35030c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rl0 rl0Var, Continuation continuation) {
            super(2, continuation);
            this.f35030c = rl0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return xl0.this.new a(this.f35030c, continuation);
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
                int r1 = r5.f35028a
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
                com.fourthline.orca.internal.xl0 r6 = com.fourthline.orca.internal.xl0.this
                com.fourthline.orca.internal.wd1 r6 = com.fourthline.orca.internal.xl0.c(r6)
                com.fourthline.orca.internal.rl0 r1 = r5.f35030c
                r5.f35028a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L30
                goto L43
            L30:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.xl0$a$a r1 = new com.fourthline.orca.internal.xl0$a$a
                com.fourthline.orca.internal.xl0 r3 = com.fourthline.orca.internal.xl0.this
                com.fourthline.orca.internal.rl0 r4 = r5.f35030c
                r1.<init>(r3, r4)
                r5.f35028a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.xl0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.xl0$a$a, reason: collision with other inner class name */
        public static final class C0310a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ xl0 f35031a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ rl0 f35032b;

            public C0310a(xl0 xl0Var, rl0 rl0Var) {
                this.f35031a = xl0Var;
                this.f35032b = rl0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(xd1 xd1Var, Continuation continuation) {
                if (!(xd1Var instanceof xd1.d)) {
                    if (xd1Var instanceof xd1.c) {
                        this.f35031a.b().a(this.f35031a.d.d(true));
                    } else if (xd1Var instanceof xd1.a) {
                        this.f35031a.b().a(this.f35031a.d.d(false));
                        fe1 fe1Var = this.f35031a.e;
                        ky kyVarA = ((xd1.a) xd1Var).a();
                        ck0 ck0Var = (ck0) (!(kyVarA instanceof ck0) ? null : kyVarA);
                        if (ck0Var == null) {
                            throw new IllegalStateException(kyVarA.getClass().getSimpleName().concat(" are not accepted by this Coordinator.").toString());
                        }
                        fe1Var.b(new pl0.a.b(ck0Var));
                    } else {
                        if (!(xd1Var instanceof xd1.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f35031a.b().a(this.f35031a.d.d(false));
                        this.f35031a.f35027j.a(new hq0.c(((xd1.b) xd1Var).a(), null, new rj1(this.f35031a, this.f35032b, 12), 2, null));
                    }
                }
                return Unit.f186387a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit a(xl0 xl0Var, rl0 rl0Var) {
                xl0Var.a(rl0Var);
                return Unit.f186387a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(rl0 rl0Var) {
        skm.e0.C(this, null, null, new a(rl0Var, null), 3);
    }

    private final void a(ql0.d dVar) {
        if (dVar.a() && ((sl0) this.f35023b.b()).r().getState() != l20.f30508b) {
            this.f35026h.track(ol0.a.d.f31687b);
            this.f35023b.a(this.d.v());
        } else {
            if (dVar.a() || ((sl0) this.f35023b.b()).r().getState() != l20.f30508b) {
                return;
            }
            this.f35023b.a(this.d.w());
        }
    }

    private final void a(ql0.h hVar) {
        if (hVar.a() && ((sl0) this.f35023b.b()).v().getState() != l20.f30508b) {
            this.f35026h.track(ol0.a.f.f31689b);
            this.f35023b.a(this.d.z());
        } else {
            if (hVar.a() || ((sl0) this.f35023b.b()).v().getState() != l20.f30508b) {
                return;
            }
            this.f35023b.a(this.d.A());
        }
    }

    private final void a(ql0.b bVar) {
        if (bVar.a() && ((sl0) this.f35023b.b()).p().getState() != l20.f30508b) {
            this.f35026h.track(ol0.a.b.f31685b);
            this.f35023b.a(this.d.t());
        } else {
            if (bVar.a() || ((sl0) this.f35023b.b()).p().getState() != l20.f30508b) {
                return;
            }
            this.f35023b.a(this.d.l());
        }
    }

    private final void a(ql0.f fVar) {
        if (fVar.a() && ((sl0) this.f35023b.b()).s().c() != l20.f30508b) {
            this.f35026h.track(ol0.a.e.f31688b);
            this.f35023b.a(this.d.x());
        } else {
            if (fVar.a() || ((sl0) this.f35023b.b()).s().c() != l20.f30508b) {
                return;
            }
            this.f35023b.a(this.d.y());
        }
    }

    private final void a(ql0.e eVar) {
        this.f35025g.b(eVar.a());
        this.f35023b.a(this.d.a(eVar.a()));
    }

    private final void a(ql0.i iVar) {
        this.f35025g.a(iVar.a());
        this.f35023b.a(this.d.d(iVar.a()));
    }

    private final void a(String str) {
        this.f35025g.a(oe.a(str, this.i.getCurrentCalendar()));
        this.f35023b.a(this.d.b(str));
    }

    private final void a(ql0.g gVar) {
        Map.Entry entryA = gVar.a();
        this.f35025g.a((Gender) entryA.getKey());
        this.f35023b.a(this.d.a((c81) entryA.getValue()));
        this.f35024c.a(new it1(4));
    }
}
