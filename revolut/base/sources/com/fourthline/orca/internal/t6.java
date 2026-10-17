package com.fourthline.orca.internal;

import android.net.Uri;
import com.fourthline.orca.bav.internal.error.BavError;
import com.fourthline.orca.internal.a6;
import com.fourthline.orca.internal.c6;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.i6;
import com.fourthline.orca.internal.m6;
import com.fourthline.orca.internal.rp0;
import com.fourthline.orca.internal.u6;
import com.fourthline.orca.internal.xd1;
import com.fourthline.orca.internal.z5;
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
public final class t6 implements ax, re, CoroutineScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f33211n = new c(null);
    public static final int o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f33212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f33213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s6 f33214c;
    private final qe1 d;
    private final aq0 e;
    private final rp0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a6 f33215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c6 f33216h;
    private final fe1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final wd1 f33217j;
    private final p6 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final q6 f33218l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final qg0 f33219m;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function0 {
        public a(Object obj2) {
            super(0, 0, t6.class, obj2, "checkStatus", "checkStatus()V");
        }

        public final void a() {
            ((t6) this.receiver).b();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function0 {
        public b(Object obj2) {
            super(0, 0, t6.class, obj2, "checkStatus", "checkStatus()V");
        }

        public final void a() {
            ((t6) this.receiver).b();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f186387a;
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c7.values().length];
            try {
                iArr[c7.f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c7.f27389c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c7.e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c7.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c7.f27387a.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c7.f27388b.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c7.f27390g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class e extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f33220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f33221b;

        public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function0 {
            public a(Object obj2) {
                super(0, 0, t6.class, obj2, "checkStatus", "checkStatus()V");
            }

            public final void a() {
                ((t6) this.receiver).b();
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
            return t6.this.new e(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object objA;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f33221b;
            if (i == 0) {
                yhm.o.b(obj2);
                String strA = t6.this.k.a();
                c7[] elements = {c7.e, c7.f, c7.f27389c, c7.d, c7.f27387a, c7.f27388b};
                Intrinsics.checkNotNullParameter(elements, "elements");
                rp0.a aVar2 = new rp0.a(strA, kotlin.collections.d.y0(elements));
                rp0 rp0Var = t6.this.f;
                this.f33220a = null;
                this.f33221b = 1;
                objA = rp0Var.a(aVar2, this);
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
            t6 t6Var = t6.this;
            Throwable thA = yhm.m.a(objA);
            if (thA == null) {
                t6Var.a((u6.b) objA);
            } else {
                t6Var.e.a(new hq0.c(se1.a(thA), "bav_status", new a(t6Var)));
            }
            return Unit.f186387a;
        }
    }

    public static final class f extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f33223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f33224b;

        public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function0 {
            public a(Object obj2) {
                super(0, 0, t6.class, obj2, "checkStatus", "checkStatus()V");
            }

            public final void a() {
                ((t6) this.receiver).b();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f186387a;
            }
        }

        public static final /* synthetic */ class b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[w5.values().length];
                try {
                    iArr[w5.d.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return t6.this.new f(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object objA;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f33224b;
            if (i == 0) {
                yhm.o.b(obj2);
                String strA = t6.this.k.a();
                w5[] elements = {w5.f34519c, w5.d};
                Intrinsics.checkNotNullParameter(elements, "elements");
                a6.a aVar2 = new a6.a(strA, kotlin.collections.d.y0(elements));
                a6 a6Var = t6.this.f33215g;
                this.f33223a = null;
                this.f33224b = 1;
                objA = a6Var.a(aVar2, this);
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
            t6 t6Var = t6.this;
            Throwable thA = yhm.m.a(objA);
            if (thA == null) {
                z5.b bVar = (z5.b) objA;
                if (b.$EnumSwitchMapping$0[bVar.a().getStatus().ordinal()] == 1) {
                    t6Var.a(n6.f31337a);
                } else {
                    t6Var.e.a(x5.a(bVar.a()));
                }
            } else {
                t6Var.e.a(new hq0.c(se1.a(thA), "bav_status", new a(t6Var)));
            }
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class h extends kotlin.jvm.internal.q implements Function0 {
        public h(Object obj2) {
            super(0, 0, t6.class, obj2, "checkStatus", "checkStatus()V");
        }

        public final void a() {
            ((t6) this.receiver).b();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f186387a;
        }
    }

    public static final class i extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33231a;

        public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function0 {
            public a(Object obj2) {
                super(0, 0, t6.class, obj2, "checkStatus", "checkStatus()V");
            }

            public final void a() {
                ((t6) this.receiver).b();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f186387a;
            }
        }

        public i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return t6.this.new i(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object objA;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f33231a;
            if (i == 0) {
                yhm.o.b(obj2);
                c6 c6Var = t6.this.f33216h;
                c6.a aVar2 = new c6.a(t6.this.k.a());
                this.f33231a = 1;
                objA = c6Var.a(aVar2, this);
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
            t6 t6Var = t6.this;
            Throwable thA = yhm.m.a(objA);
            if (thA == null) {
                t6Var.a(((c6.b) objA).a());
            } else {
                t6Var.e.a(new hq0.c(se1.a(thA), "bav_status", new a(t6Var)));
            }
            return Unit.f186387a;
        }
    }

    public t6(mq0 presenter, s6 stateProvider, qe1 webSdkLauncher, aq0 popupHandler, rp0 statusWorker, a6 transferStatusWorker, c6 redirectUrlWorker, fe1 viewNavigator, wd1 viewCompletionHandler, p6 repository, q6 resultRepository, qg0 analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(webSdkLauncher, "webSdkLauncher");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(statusWorker, "statusWorker");
        Intrinsics.checkNotNullParameter(transferStatusWorker, "transferStatusWorker");
        Intrinsics.checkNotNullParameter(redirectUrlWorker, "redirectUrlWorker");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f33212a = coroutineScope;
        this.f33213b = presenter;
        this.f33214c = stateProvider;
        this.d = webSdkLauncher;
        this.e = popupHandler;
        this.f = statusWorker;
        this.f33215g = transferStatusWorker;
        this.f33216h = redirectUrlWorker;
        this.i = viewNavigator;
        this.f33217j = viewCompletionHandler;
        this.k = repository;
        this.f33218l = resultRepository;
        this.f33219m = analytics;
        if (!lh0.f30621a.d()) {
            webSdkLauncher.a(repository.getUrl(), new a(this));
        } else if (repository.b().getName() == v6.f34254b) {
            webSdkLauncher.a(repository.getUrl(), new b(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(t6 t6Var) {
        t6Var.i();
        return Unit.f186387a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f33212a.getF74819h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        if (this.k.b().getName() == v6.f34254b && this.k.c()) {
            c();
        } else {
            a();
        }
    }

    private final void c() {
        skm.e0.C(this, null, null, new f(null), 3);
    }

    private final void f() {
        this.f33219m.track(i6.a.b.f29512b);
        if (lh0.f30621a.d() && this.k.b().getName() == v6.f34255c) {
            b();
        }
    }

    private final void g() {
        this.f33219m.track(i6.a.C0215a.f29511b);
        this.i.b(new j6(BavError.Canceled.INSTANCE));
    }

    private final void h() {
        g();
    }

    private final void i() {
        skm.e0.C(this, null, null, new i(null), 3);
    }

    public final mq0 d() {
        return this.f33213b;
    }

    public final s6 e() {
        return this.f33214c;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(m6 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof m6.a) {
            f();
        } else if (event instanceof m6.b) {
            g();
        } else {
            if (!(event instanceof m6.c)) {
                throw new NoWhenBranchMatchedException();
            }
            h();
        }
    }

    @Override // com.fourthline.orca.internal.re
    public void a(Uri deepLink) {
        Intrinsics.checkNotNullParameter(deepLink, "deepLink");
        String strA = se.a(deepLink, "bav_status");
        if (this.k.c()) {
            return;
        }
        if (kotlin.text.d0.J(strA, "success", false)) {
            a(n6.f31337a);
        } else {
            if (kotlin.text.d0.J(strA, "failure", false)) {
                b();
                return;
            }
            throw new IllegalStateException("FL Developer error. The Deep Link doesn't have the right keys!");
        }
    }

    public static final class g extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33226a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n6 f33228c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(n6 n6Var, Continuation continuation) {
            super(2, continuation);
            this.f33228c = n6Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return t6.this.new g(this.f33228c, continuation);
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
                int r1 = r5.f33226a
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
                com.fourthline.orca.internal.t6 r6 = com.fourthline.orca.internal.t6.this
                com.fourthline.orca.internal.wd1 r6 = com.fourthline.orca.internal.t6.g(r6)
                com.fourthline.orca.internal.n6 r1 = r5.f33228c
                r5.f33226a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L30
                goto L43
            L30:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.t6$g$a r1 = new com.fourthline.orca.internal.t6$g$a
                com.fourthline.orca.internal.t6 r3 = com.fourthline.orca.internal.t6.this
                com.fourthline.orca.internal.n6 r4 = r5.f33228c
                r1.<init>(r3, r4)
                r5.f33226a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.t6.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ t6 f33229a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n6 f33230b;

            public a(t6 t6Var, n6 n6Var) {
                this.f33229a = t6Var;
                this.f33230b = n6Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(xd1 xd1Var, Continuation continuation) {
                if (!(xd1Var instanceof xd1.d)) {
                    if (xd1Var instanceof xd1.c) {
                        this.f33229a.d().a(this.f33229a.e().d(true));
                    } else if (xd1Var instanceof xd1.a) {
                        this.f33229a.d().a(this.f33229a.e().d(false));
                        fe1 fe1Var = this.f33229a.i;
                        ky kyVarA = ((xd1.a) xd1Var).a();
                        a4 a4Var = (a4) (!(kyVarA instanceof a4) ? null : kyVarA);
                        if (a4Var == null) {
                            throw new IllegalStateException(kyVarA.getClass().getSimpleName().concat(" are not accepted by this Coordinator.").toString());
                        }
                        fe1Var.b(new k6(a4Var));
                    } else {
                        if (!(xd1Var instanceof xd1.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f33229a.d().a(this.f33229a.e().d(false));
                        this.f33229a.e.a(new hq0.c(((xd1.b) xd1Var).a(), null, new rj1(this.f33229a, this.f33230b, 10), 2, null));
                    }
                }
                return Unit.f186387a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit a(t6 t6Var, n6 n6Var) {
                t6Var.a(n6Var);
                return Unit.f186387a;
            }
        }
    }

    private final void a() {
        skm.e0.C(this, null, null, new e(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(u6.b bVar) {
        switch (d.$EnumSwitchMapping$0[bVar.a().getStatus().ordinal()]) {
            case 1:
            case 2:
                a(n6.f31337a);
                return;
            case 3:
                this.i.b(new j6(BavError.Generic.INSTANCE));
                return;
            case 4:
                this.e.a(new hq0.c(BavError.KycRequired.INSTANCE, "bav_status", null, 4, null));
                return;
            case 5:
                this.e.a(new hq0.c(BavError.InvalidStatus.INSTANCE, "bav_status", null, 4, null));
                return;
            case 6:
                this.e.a(new hq0.c(BavError.Generic.INSTANCE, "bav_status", new xr1(this, 8)));
                return;
            case 7:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(n6 n6Var) {
        skm.e0.C(this, null, null, new g(n6Var, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(String str) {
        this.f33218l.a(str);
        this.d.a(this.k.getUrl(), new h(this));
    }
}
