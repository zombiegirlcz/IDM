package com.fourthline.orca.internal;

import com.fourthline.orca.internal.bw0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.nw0;
import com.fourthline.orca.internal.ow0;
import com.fourthline.orca.internal.pw0;
import com.fourthline.orca.internal.qx0;
import com.fourthline.orca.internal.uw0;
import com.fourthline.orca.internal.xd1;
import com.fourthline.orca.qes.internal.error.QesError;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes23.dex */
public final class bx0 implements ax, CoroutineScope {
    private static final a o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f27249p = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f27250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f27251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wr f27252c;
    private final ax0 d;
    private final fe1 e;
    private final wd1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final xw0 f27253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final qx0 f27254h;
    private final bw0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final kw f27255j;
    private final kw k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final aq0 f27256l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final qg0 f27257m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Job f27258n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27259a;

        public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function0 {
            public a(Object obj2) {
                super(0, 0, bx0.class, obj2, "confirmOtp", "confirmOtp()V");
            }

            public final void a() {
                ((bx0) this.receiver).a();
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
            return bx0.this.new b(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object objA;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27259a;
            if (i == 0) {
                yhm.o.b(obj2);
                qx0 qx0Var = bx0.this.f27254h;
                qx0.a aVar2 = new qx0.a(bx0.this.f27253g.a(), ((rw0) bx0.this.c().b()).n().getText());
                this.f27259a = 1;
                objA = qx0Var.a(aVar2, this);
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
            bx0 bx0Var = bx0.this;
            Throwable thA = yhm.m.a(objA);
            if (thA == null) {
                qx0.b bVar = (qx0.b) objA;
                if (bVar instanceof qx0.b.c) {
                    bx0Var.p();
                    bx0Var.a(qw0.f32548a);
                } else if (bVar instanceof qx0.b.a) {
                    bx0Var.k.handleRecoverableError(uw0.a.f34209b, "sign", new qj1(bx0Var, 0));
                } else {
                    if (!(bVar instanceof qx0.b.C0275b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bx0Var.c().a(bx0Var.d.x());
                }
            } else {
                bx0Var.f27255j.handleRecoverableError(thA instanceof QesError ? (kh0) thA : se1.a(thA), "sign", new a(bx0Var));
            }
            return Unit.f186387a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit a(bx0 bx0Var) {
            bx0Var.e.b(ow0.c.a.f31779a);
            return Unit.f186387a;
        }
    }

    public static final class d extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f27266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f27267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f27268c;
        Object d;
        int e;
        int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f27269g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f27270h;

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
            return bx0.this.new d(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            bx0 bx0Var;
            Iterator it8;
            int i;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i2 = this.f27270h;
            if (i2 == 0) {
                yhm.o.b(obj2);
                kotlin.ranges.c cVarL = kotlin.ranges.f.l(((rw0) bx0.this.c().b()).p().c(), 1);
                bx0Var = bx0.this;
                it8 = cVarL.iterator();
                i = 0;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.e;
                it8 = (Iterator) this.f27268c;
                bx0Var = (bx0) this.f27267b;
                yhm.o.b(obj2);
            }
            while (it8.hasNext()) {
                int iIntValue = ((Number) it8.next()).intValue();
                bx0Var.c().a(bx0Var.d.d(iIntValue));
                long millis = TimeUnit.SECONDS.toMillis(1L);
                this.f27266a = null;
                this.f27267b = bx0Var;
                this.f27268c = it8;
                this.d = null;
                this.e = i;
                this.f = iIntValue;
                this.f27269g = 0;
                this.f27270h = 1;
                if (skm.k0.b(millis, this) == aVar) {
                    return aVar;
                }
            }
            bx0.this.c().a(bx0.this.d.k());
            bx0.this.p();
            return Unit.f186387a;
        }
    }

    public static final class e extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27271a;

        public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function0 {
            public a(Object obj2) {
                super(0, 0, bx0.class, obj2, "resendOtp", "resendOtp()V");
            }

            public final void a() {
                ((bx0) this.receiver).o();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f186387a;
            }
        }

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
            return bx0.this.new e(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object objA;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27271a;
            if (i == 0) {
                yhm.o.b(obj2);
                bw0 bw0Var = bx0.this.i;
                bw0.a aVar2 = new bw0.a(bx0.this.f27253g.a());
                this.f27271a = 1;
                objA = bw0Var.a(aVar2, this);
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
            bx0 bx0Var = bx0.this;
            Throwable thA = yhm.m.a(objA);
            if (thA == null) {
                bw0.b bVar = (bw0.b) objA;
                if (!(bVar instanceof bw0.b.C0173b)) {
                    if (bVar instanceof bw0.b.a) {
                        bx0Var.k.handleRecoverableError(uw0.a.f34209b, "sign", new qj1(bx0Var, 1));
                    } else {
                        if (!(bVar instanceof bw0.b.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bx0Var.f27255j.handleError(QesError.TooManyResendOtpAttempts.INSTANCE, "sign");
                    }
                }
            } else {
                bx0Var.f27255j.handleRecoverableError(thA instanceof QesError ? (kh0) thA : se1.a(thA), "sign", new a(bx0Var));
            }
            return Unit.f186387a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit a(bx0 bx0Var) {
            bx0Var.e.b(ow0.c.a.f31779a);
            return Unit.f186387a;
        }
    }

    public bx0(mq0 presenter, wr effectHandler, ax0 stateProvider, fe1 viewNavigator, wd1 viewCompletionHandler, xw0 qesSignRepository, qx0 qesUserConfirmationWorker, bw0 qesResendOtpWorker, kw errorHandler, kw qesSignErrorHandler, aq0 popupHandler, qg0 analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(qesSignRepository, "qesSignRepository");
        Intrinsics.checkNotNullParameter(qesUserConfirmationWorker, "qesUserConfirmationWorker");
        Intrinsics.checkNotNullParameter(qesResendOtpWorker, "qesResendOtpWorker");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(qesSignErrorHandler, "qesSignErrorHandler");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f27250a = coroutineScope;
        this.f27251b = presenter;
        this.f27252c = effectHandler;
        this.d = stateProvider;
        this.e = viewNavigator;
        this.f = viewCompletionHandler;
        this.f27253g = qesSignRepository;
        this.f27254h = qesUserConfirmationWorker;
        this.i = qesResendOtpWorker;
        this.f27255j = errorHandler;
        this.k = qesSignErrorHandler;
        this.f27256l = popupHandler;
        this.f27257m = analytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m() {
        return Unit.f186387a;
    }

    private final void n() {
        this.f27257m.track(nw0.a.g.f31496b);
        this.f27251b.a(this.d.z());
        d();
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        skm.e0.C(this, null, null, new e(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        Job job2 = this.f27258n;
        if (job2 != null) {
            job2.f(null);
        }
        this.f27258n = null;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f27250a.getF74819h();
    }

    private final void d() {
        p();
        this.f27258n = skm.e0.C(this, null, null, new d(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ow0 e() {
        return ow0.a.f31777a;
    }

    private final void f() {
        this.f27257m.track(new nw0.a.c(((rw0) this.f27251b.b()).n().getText().length()));
        this.f27251b.a(this.d.s());
        this.f27252c.a(new pj1(1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ow0 g() {
        return ow0.d.f31782a;
    }

    private final void h() {
        if (((rw0) this.f27251b.b()).n().getState() != l20.f30507a) {
            this.f27257m.track(new nw0.a.b(((rw0) this.f27251b.b()).n().getText().length()));
            this.f27252c.a(new vk1(29));
            this.f27251b.a(this.d.z());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ow0 i() {
        return ow0.b.f31778a;
    }

    private final void j() {
        this.f27257m.track(nw0.a.f.f31495b);
        this.f27251b.a(this.d.y());
        a();
    }

    private final void k() {
        this.f27257m.track(nw0.a.d.f31493b);
        d();
    }

    private final void l() {
        this.f27257m.track(nw0.a.C0252a.f31490b);
        this.f27255j.handleRecoverableError(QesError.Canceled.INSTANCE, "sign", new pj1(0));
        this.f27257m.track(nw0.a.e.f31494b);
    }

    public final wr b() {
        return this.f27252c;
    }

    public final mq0 c() {
        return this.f27251b;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(pw0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof pw0.a) {
            a(((pw0.a) event).a());
            return;
        }
        if (event instanceof pw0.b) {
            f();
            return;
        }
        if (event instanceof pw0.c) {
            h();
            return;
        }
        if (event instanceof pw0.d) {
            j();
            return;
        }
        if (event instanceof pw0.e) {
            k();
        } else if (event instanceof pw0.f) {
            l();
        } else {
            if (!(event instanceof pw0.g)) {
                throw new NoWhenBranchMatchedException();
            }
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        skm.e0.C(this, null, null, new b(null), 3);
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27261a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ qw0 f27263c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(qw0 qw0Var, Continuation continuation) {
            super(2, continuation);
            this.f27263c = qw0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return bx0.this.new c(this.f27263c, continuation);
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
                int r1 = r5.f27261a
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
                com.fourthline.orca.internal.bx0 r6 = com.fourthline.orca.internal.bx0.this
                com.fourthline.orca.internal.wd1 r6 = com.fourthline.orca.internal.bx0.i(r6)
                com.fourthline.orca.internal.qw0 r1 = r5.f27263c
                r5.f27261a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L30
                goto L43
            L30:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.bx0$c$a r1 = new com.fourthline.orca.internal.bx0$c$a
                com.fourthline.orca.internal.bx0 r3 = com.fourthline.orca.internal.bx0.this
                com.fourthline.orca.internal.qw0 r4 = r5.f27263c
                r1.<init>(r3, r4)
                r5.f27261a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.bx0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ bx0 f27264a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ qw0 f27265b;

            public a(bx0 bx0Var, qw0 qw0Var) {
                this.f27264a = bx0Var;
                this.f27265b = qw0Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(xd1 xd1Var, Continuation continuation) {
                if (!(xd1Var instanceof xd1.d) && !(xd1Var instanceof xd1.c)) {
                    if (xd1Var instanceof xd1.a) {
                        fe1 fe1Var = this.f27264a.e;
                        ky kyVarA = ((xd1.a) xd1Var).a();
                        gt0 gt0Var = (gt0) (!(kyVarA instanceof gt0) ? null : kyVarA);
                        if (gt0Var == null) {
                            throw new IllegalStateException(kyVarA.getClass().getSimpleName().concat(" are not accepted by this Coordinator.").toString());
                        }
                        fe1Var.b(new ow0.c.C0259c(gt0Var));
                    } else {
                        if (!(xd1Var instanceof xd1.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f27264a.f27256l.a(new hq0.c(((xd1.b) xd1Var).a(), null, new rj1(this.f27264a, this.f27265b, 0), 2, null));
                    }
                }
                return Unit.f186387a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit a(bx0 bx0Var, qw0 qw0Var) {
                bx0Var.a(qw0Var);
                return Unit.f186387a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(qw0 qw0Var) {
        skm.e0.C(this, null, null, new c(qw0Var, null), 3);
    }

    private final void a(String str) {
        StringBuilder sb6 = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb6.append(cCharAt);
            }
        }
        String string = sb6.toString();
        this.f27251b.a(this.d.a(string));
        if (string.length() == this.f27253g.c().a()) {
            this.f27252c.a(new vk1(28));
        }
    }
}
