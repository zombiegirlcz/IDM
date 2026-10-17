package com.fourthline.orca.internal;

import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.p81;
import com.fourthline.orca.internal.q81;
import com.fourthline.orca.internal.t81;
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
public final class e91 implements ax, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f28081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x81 f28082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d91 f28083c;
    private final a91 d;
    private final qg0 e;
    private final fe1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wd1 f28084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ab1 f28085h;
    private final wr i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final mq0 f28086j;
    private final aq0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f28087l;

    public e91(x81 repository, d91 stateProvider, a91 resultRepository, qg0 analytics, fe1 viewNavigator, wd1 viewCompletionHandler, ab1 tinValidator, wr effectHandler, mq0 presenter, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(tinValidator, "tinValidator");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f28081a = coroutineScope;
        this.f28082b = repository;
        this.f28083c = stateProvider;
        this.d = resultRepository;
        this.e = analytics;
        this.f = viewNavigator;
        this.f28084g = viewCompletionHandler;
        this.f28085h = tinValidator;
        this.i = effectHandler;
        this.f28086j = presenter;
        this.k = popupHandler;
        this.f28087l = ((v81) presenter.b()).o().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q81 e() {
        return q81.b.f32353a;
    }

    private final void f() {
        this.i.a(new dl1(3));
        String str = this.f28087l;
        if (str == null || ((v81) this.f28086j.b()).o().getState() != l20.f30508b) {
            return;
        }
        b(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q81 g() {
        return q81.a.f32352a;
    }

    private final void h() {
        this.e.track(p81.a.c.f31886b);
        a91 a91Var = this.d;
        x71 x71VarA = this.f28082b.a();
        String str = this.f28087l;
        if (str == null) {
            throw new IllegalStateException("FL developer error! The tax number must be filled in by user by this moment.");
        }
        a91Var.a(new z81(x71VarA, str));
        a(u81.f33977a);
    }

    private final void i() {
        String str = this.f28087l;
        if (str == null || str.length() == 0) {
            this.f28086j.a(new mp1(this, 4));
        }
        this.e.track(p81.a.b.f31885b);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f28081a.getCoroutineContext();
    }

    private final void c() {
        this.e.track(p81.a.C0261a.f31884b);
        this.f.b(r81.f32646a);
    }

    private final void d() {
        this.e.track(p81.a.d.f31887b);
        if (this.f28087l == null) {
            this.f28087l = "";
        }
        this.f28086j.a(this.f28083c.k());
        this.i.a(new dl1(4));
    }

    public final mq0 b() {
        return this.f28086j;
    }

    private final void b(String str) {
        this.f28086j.a(this.f28083c.a(this.f28085h.a(str)));
    }

    public final wr a() {
        return this.i;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(t81 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof t81.a) {
            c();
            return;
        }
        if (event instanceof t81.c) {
            h();
            return;
        }
        if (event instanceof t81.d) {
            i();
            return;
        }
        if (!(event instanceof t81.b)) {
            if (!(event instanceof t81.e)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((t81.e) event).a());
        } else if (((t81.b) event).a()) {
            d();
        } else {
            f();
        }
    }

    private final void a(String str) {
        this.f28087l = str;
        this.f28086j.a(this.f28083c.a(str, this.f28085h.a(str) == za1.f35552a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(u81 u81Var) {
        skm.e0.C(this, null, null, new a(u81Var, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v81 a(e91 e91Var, v81 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return e91Var.f28083c.getInitialState();
    }

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28088a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ u81 f28090c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u81 u81Var, Continuation continuation) {
            super(2, continuation);
            this.f28090c = u81Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return e91.this.new a(this.f28090c, continuation);
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
                int r1 = r5.f28088a
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
                com.fourthline.orca.internal.e91 r6 = com.fourthline.orca.internal.e91.this
                com.fourthline.orca.internal.wd1 r6 = com.fourthline.orca.internal.e91.c(r6)
                com.fourthline.orca.internal.u81 r1 = r5.f28090c
                r5.f28088a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L30
                goto L43
            L30:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.e91$a$a r1 = new com.fourthline.orca.internal.e91$a$a
                com.fourthline.orca.internal.e91 r3 = com.fourthline.orca.internal.e91.this
                com.fourthline.orca.internal.u81 r4 = r5.f28090c
                r1.<init>(r3, r4)
                r5.f28088a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.e91.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.e91$a$a, reason: collision with other inner class name */
        public static final class C0191a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e91 f28091a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u81 f28092b;

            public C0191a(e91 e91Var, u81 u81Var) {
                this.f28091a = e91Var;
                this.f28092b = u81Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(xd1 xd1Var, Continuation continuation) {
                if (!(xd1Var instanceof xd1.d)) {
                    if (xd1Var instanceof xd1.c) {
                        this.f28091a.b().a(this.f28091a.f28083c.d(true));
                    } else if (xd1Var instanceof xd1.a) {
                        this.f28091a.b().a(this.f28091a.f28083c.d(false));
                        fe1 fe1Var = this.f28091a.f;
                        ky kyVarA = ((xd1.a) xd1Var).a();
                        i91 i91Var = (i91) (!(kyVarA instanceof i91) ? null : kyVarA);
                        if (i91Var == null) {
                            throw new IllegalStateException(kyVarA.getClass().getSimpleName().concat(" are not accepted by this Coordinator.").toString());
                        }
                        fe1Var.b(new s81(i91Var));
                    } else {
                        if (!(xd1Var instanceof xd1.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f28091a.b().a(this.f28091a.f28083c.d(false));
                        this.f28091a.k.a(new hq0.c(((xd1.b) xd1Var).a(), null, new rj1(this.f28091a, this.f28092b, 2), 2, null));
                    }
                }
                return Unit.f186387a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit a(e91 e91Var, u81 u81Var) {
                e91Var.a(u81Var);
                return Unit.f186387a;
            }
        }
    }
}
