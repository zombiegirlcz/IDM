package com.fourthline.orca.internal;

import com.fourthline.orca.internal.a4;
import com.fourthline.orca.internal.b7;
import com.fourthline.orca.internal.f3;
import com.fourthline.orca.internal.g3;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.i5;
import com.fourthline.orca.internal.k3;
import com.fourthline.orca.internal.o3;
import com.fourthline.orca.internal.q3;
import com.fourthline.orca.internal.v3;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes23.dex */
public final class u3 implements ax, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f33932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final t3 f33933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i3 f33934c;
    private final r3 d;
    private final f3 e;
    private final fe1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Function0 f33935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b7 f33936h;
    private final v3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final j5 f33937j;
    private final wr k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final mq0 f33938l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final aq0 f33939m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f33940n;
    private Job o;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b7.a.values().length];
            try {
                iArr[b7.a.f27011c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b7.a.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b7.a.d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b7.a.f27010b.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f33941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f33942b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation continuation) {
            super(2, continuation);
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return u3.this.new b(this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object objA;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f33942b;
            try {
                if (i == 0) {
                    yhm.o.b(obj2);
                    v3.b bVar = new v3.b((String) u3.this.f33935g.invoke(), this.d);
                    v3 v3Var = u3.this.i;
                    this.f33941a = null;
                    this.f33942b = 1;
                    objA = v3Var.a(bVar, this);
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
                u3 u3Var = u3.this;
                Throwable thA = yhm.m.a(objA);
                if (thA == null) {
                    u3Var.c().a(u3Var.f33933b.d(false));
                    u3Var.f.b(new n3(a4.c.f26701a));
                } else {
                    se1.a(thA);
                    u3Var.c().a(u3Var.f33933b.d(false));
                }
                return Unit.f186387a;
            } catch (CancellationException e) {
                u3.this.c().a(u3.this.f33933b.d(false));
                throw e;
            }
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f33944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f33945b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation continuation) {
            super(2, continuation);
            this.d = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return u3.this.new c(this.d, continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object objA;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f33945b;
            if (i == 0) {
                yhm.o.b(obj2);
                b7.c cVar = new b7.c((String) u3.this.f33935g.invoke(), this.d);
                b7 b7Var = u3.this.f33936h;
                this.f33944a = null;
                this.f33945b = 1;
                objA = b7Var.a(cVar, this);
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
            u3 u3Var = u3.this;
            Throwable thA = yhm.m.a(objA);
            if (thA == null) {
                u3Var.a(((b7.d) objA).a());
            } else {
                u3Var.c().a(u3Var.f33933b.b(new q3.b(se1.a(thA))));
            }
            return Unit.f186387a;
        }
    }

    public u3(t3 stateProvider, i3 resultRepository, r3 repository, f3 analytics, fe1 viewNavigator, Function0 workflowIdProvider, b7 validateIbanWorker, v3 confirmIbanWorker, j5 localValidator, wr effectHandler, mq0 presenter, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(validateIbanWorker, "validateIbanWorker");
        Intrinsics.checkNotNullParameter(confirmIbanWorker, "confirmIbanWorker");
        Intrinsics.checkNotNullParameter(localValidator, "localValidator");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f33932a = coroutineScope;
        this.f33933b = stateProvider;
        this.f33934c = resultRepository;
        this.d = repository;
        this.e = analytics;
        this.f = viewNavigator;
        this.f33935g = workflowIdProvider;
        this.f33936h = validateIbanWorker;
        this.i = confirmIbanWorker;
        this.f33937j = localValidator;
        this.k = effectHandler;
        this.f33938l = presenter;
        this.f33939m = popupHandler;
        this.f33940n = ((p3) presenter.b()).o().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k3 f() {
        return k3.c.f30119a;
    }

    private final void i() {
        this.f33939m.a(d6.f27653a);
    }

    private final void j() {
        String str = this.f33940n;
        if (str != null) {
            this.e.track(f3.a.d.f28328b);
            i3 i3Var = this.f33934c;
            String str2 = this.f33940n;
            if (str2 == null) {
                throw new IllegalStateException("FL developer error! The account number must be filled in by user by this moment.");
            }
            i3Var.a(new h3(str2));
            a(str);
        }
    }

    private final void k() {
        String str = this.f33940n;
        if (str == null || str.length() == 0) {
            this.f33938l.a(new mp1(this, 29));
        }
        this.e.track(f3.a.c.f28327b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k3 l() {
        return k3.b.f30118a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k3 m() {
        return k3.a.f30117a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f33932a.getF74819h();
    }

    private final void d() {
        this.e.track(f3.a.b.f28326b);
        this.f.b(l3.f30510a);
        Unit unit = Unit.f186387a;
        a();
    }

    private final void e() {
        this.e.track(f3.a.C0194a.f28325b);
        if (this.f33940n == null) {
            this.f33940n = "";
        }
        this.f33938l.a(t3.a(this.f33933b, false, 1, (Object) null));
        this.k.a(new nr1(17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(u3 u3Var) {
        u3Var.f33938l.a(u3Var.f33933b.e(true));
        return Unit.f186387a;
    }

    private final void g() {
        this.k.a(new nr1(16));
        this.f33938l.a(this.f33933b.w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k3 h() {
        return k3.b.f30118a;
    }

    public final wr b() {
        return this.k;
    }

    public final mq0 c() {
        return this.f33938l;
    }

    private final void b(String str) {
        this.f33938l.a(this.f33933b.b(q3.d.f32186a));
        this.o = skm.e0.C(this, null, null, new c(str, null), 3);
    }

    private final void c(String str) {
        a();
        this.f33940n = str;
        i5 i5VarA = this.f33937j.a(str);
        this.f33938l.a(this.f33933b.a(str, i5VarA));
        if (i5VarA instanceof i5.g) {
            this.k.a(new nr1(18));
            this.k.a(new nr1(19));
            b(str);
        }
    }

    private final void a() {
        Job job2 = this.o;
        if (job2 != null) {
            job2.f(null);
        }
        this.o = null;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(o3 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof o3.a) {
            d();
            return;
        }
        if (event instanceof o3.d) {
            j();
            return;
        }
        if (event instanceof o3.c) {
            i();
            return;
        }
        if (event instanceof o3.e) {
            k();
            return;
        }
        if (!(event instanceof o3.b)) {
            if (!(event instanceof o3.f)) {
                throw new NoWhenBranchMatchedException();
            }
            c(((o3.f) event).a());
        } else if (((o3.b) event).a()) {
            e();
        } else {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(b7.b bVar) {
        kh0 kh0Var;
        this.f33938l.a(this.f33933b.b(new q3.a(bVar)));
        b7.a aVarC = bVar.getError();
        int i = aVarC == null ? -1 : a.$EnumSwitchMapping$0[aVarC.ordinal()];
        if (i == 2) {
            kh0Var = g3.c.f28740a;
        } else if (i != 3) {
            kh0Var = i != 4 ? null : g3.a.f28736a;
        } else {
            kh0Var = g3.b.f28738a;
        }
        kh0 kh0Var2 = kh0Var;
        if (kh0Var2 != null) {
            aq0.a(this.f33939m, new hq0.c(kh0Var2, null, null, 6, null), new xr1(this, 12), null, 4, null);
        }
    }

    private final void a(String str) {
        this.f33938l.a(this.f33933b.d(true));
        skm.e0.C(this, null, null, new b(str, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p3 a(u3 u3Var, p3 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return u3Var.f33933b.getInitialState();
    }
}
