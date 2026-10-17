package com.fourthline.orca.internal;

import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.core.location.LocationProviderError;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.re1;
import com.fourthline.orca.internal.w60;
import com.fourthline.orca.internal.x60;
import com.fourthline.orca.internal.xd1;
import com.fourthline.orca.internal.y60;
import com.fourthline.orca.internal.z60;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes23.dex */
public class f70 implements ax, CoroutineScope {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f28359l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f28360m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f28361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f28362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wr f28363c;
    private final fe1 d;
    private final wd1 e;
    private final e70 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final aq0 f28364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final LocationProvider f28365h;
    private final c70 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final qg0 f28366j;
    private Job k;

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
            int[] iArr = new int[LocationProvider.AuthorizationStatus.values().length];
            try {
                iArr[LocationProvider.AuthorizationStatus.NOT_DETERMINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocationProvider.AuthorizationStatus.AUTHORIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocationProvider.AuthorizationStatus.DENIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final /* synthetic */ class d extends kotlin.jvm.internal.q implements Function0 {
        public d(Object obj2) {
            super(0, 0, f70.class, obj2, "onTryAgainClicked", "onTryAgainClicked()V");
        }

        public final void a() {
            ((f70) this.receiver).m();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class e extends kotlin.jvm.internal.q implements Function0 {
        public e(Object obj2) {
            super(0, 0, f70.class, obj2, "requestFullAccuracy", "requestFullAccuracy()V");
        }

        public final void a() {
            ((f70) this.receiver).n();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class f extends kotlin.jvm.internal.q implements Function0 {
        public f(Object obj2) {
            super(0, 0, f70.class, obj2, "requestFullAccuracy", "requestFullAccuracy()V");
        }

        public final void a() {
            ((f70) this.receiver).n();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class g extends kotlin.jvm.internal.q implements Function0 {
        public g(Object obj2) {
            super(0, 0, f70.class, obj2, "startTheLocationFlow", "startTheLocationFlow()V");
        }

        public final void a() {
            ((f70) this.receiver).t();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class h extends kotlin.jvm.internal.q implements Function1 {
        public h(Object obj2) {
            super(1, 0, f70.class, obj2, "onRequestAuthorizationSuccess", "onRequestAuthorizationSuccess(Lcom/fourthline/core/location/LocationProvider$AuthorizationStatus;)V");
        }

        public final void a(LocationProvider.AuthorizationStatus p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((f70) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((LocationProvider.AuthorizationStatus) obj2);
            return Unit.f186387a;
        }
    }

    public static final /* synthetic */ class i extends kotlin.jvm.internal.q implements Function1 {
        public i(Object obj2) {
            super(1, 0, f70.class, obj2, "onRequestAuthorizationFail", "onRequestAuthorizationFail(Lcom/fourthline/core/location/LocationProviderError;)V");
        }

        public final void a(LocationProviderError p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((f70) this.receiver).b(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((LocationProviderError) obj2);
            return Unit.f186387a;
        }
    }

    public static final class j extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28372a;

        public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
            public a(Object obj2) {
                super(1, 0, f70.class, obj2, "finishLocationFlow", "finishLocationFlow(Lcom/fourthline/core/location/Coordinate;)V");
            }

            public final void a(Coordinate p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((f70) this.receiver).a(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                a((Coordinate) obj2);
                return Unit.f186387a;
            }
        }

        public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
            public b(Object obj2) {
                super(1, 0, f70.class, obj2, "onLocationRequestFail", "onLocationRequestFail(Lcom/fourthline/core/location/LocationProviderError;)V");
            }

            public final void a(LocationProviderError p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((f70) this.receiver).a(p0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                a((LocationProviderError) obj2);
                return Unit.f186387a;
            }
        }

        public j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return f70.this.new j(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            if (this.f28372a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            f70.this.f28365h.requestLocation(new a(f70.this), new b(f70.this));
            return Unit.f186387a;
        }
    }

    public f70(mq0 presenter, wr effectHandler, fe1 viewNavigator, wd1 viewCompletionHandler, e70 stateProvider, aq0 popupHandler, LocationProvider locationProvider, c70 repository, qg0 analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f28361a = coroutineScope;
        this.f28362b = presenter;
        this.f28363c = effectHandler;
        this.d = viewNavigator;
        this.e = viewCompletionHandler;
        this.f = stateProvider;
        this.f28364g = popupHandler;
        this.f28365h = locationProvider;
        this.i = repository;
        this.f28366j = analytics;
    }

    private final void h() {
        if (this.f28365h.getLocationServicesEnabled()) {
            s();
        }
    }

    private final void i() {
        if (this.f28365h.getAuthorizationStatus() == LocationProvider.AuthorizationStatus.AUTHORIZED) {
            if (this.f28365h.getAccuracyAuthorization() == LocationProvider.AccuracyAuthorization.FULL) {
                t();
            } else {
                q();
            }
        }
    }

    private final void j() {
        if (this.i.getLocation() != null) {
            Coordinate location = this.i.getLocation();
            Intrinsics.h(location);
            a(location);
        } else if (this.f28365h.getAuthorizationStatus() == LocationProvider.AuthorizationStatus.NOT_DETERMINED) {
            aq0.a(this.f28364g, w60.b.f34529a, new e(this), null, 4, null);
        } else {
            r();
        }
    }

    private final void k() {
        b();
    }

    private final void l() {
        this.f28366j.track(x60.a.b.f34900b);
        this.f28362b.a(new vl1(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        this.f28362b.a(new vl1(this, 0));
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        this.f28365h.requestFullAccuracy(new vl1(this, 2), new vl1(this, 3));
    }

    private final void o() {
        this.f28364g.a(w60.d.f34533a);
    }

    private final void p() {
        this.f28364g.a(w60.c.f34531a);
    }

    private final void q() {
        this.f28364g.a(w60.e.f34535a, new f(this), new g(this));
    }

    private final void r() {
        if (this.f28365h.getLocationServicesEnabled()) {
            s();
        } else {
            o();
        }
    }

    private final void s() {
        LocationProvider locationProvider = this.f28365h;
        int i2 = b.$EnumSwitchMapping$0[locationProvider.getAuthorizationStatus().ordinal()];
        if (i2 == 1) {
            locationProvider.requestAuthorization(new h(this), new i(this));
        } else if (i2 == 2) {
            a();
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        this.f28362b.a(this.f.s());
        b();
        this.k = skm.e0.C(this, null, null, new j(null), 3);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f28361a.getF74819h();
    }

    public final wr c() {
        return this.f28363c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(LocationProviderError locationProviderError) {
        if (locationProviderError instanceof LocationProviderError.LocationPermissionsNotGranted) {
            p();
        } else if (locationProviderError instanceof LocationProviderError.LocationServicesNotEnabled) {
            o();
        } else if (!(locationProviderError instanceof LocationProviderError.AnotherRequestInProgress) && !(locationProviderError instanceof LocationProviderError.Unknown)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(f70 f70Var, LocationProviderError it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        f70Var.r();
        return Unit.f186387a;
    }

    private final void g() {
        this.f28366j.track(x60.a.C0308a.f34899b);
        this.d.b(y60.a.C0315a.f35173a);
    }

    public final mq0 d() {
        return this.f28362b;
    }

    public final wd1 e() {
        return this.e;
    }

    public final fe1 f() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(z60 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof z60.f) {
            l();
            return;
        }
        if (event instanceof z60.e) {
            k();
            return;
        }
        if (event instanceof z60.c) {
            i();
            return;
        }
        if (event instanceof z60.b) {
            h();
        } else if (event instanceof z60.d) {
            j();
        } else {
            if (!(event instanceof z60.a)) {
                throw new NoWhenBranchMatchedException();
            }
            g();
        }
    }

    private final void b() {
        this.f28365h.cancelLocationRequest();
        Job job2 = this.k;
        if (job2 != null) {
            job2.f(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b70 b(f70 f70Var, b70 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return f70Var.f.getInitialState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b70 a(f70 f70Var, b70 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return f70Var.f.getInitialState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LocationProvider.AuthorizationStatus authorizationStatus) {
        int i2 = b.$EnumSwitchMapping$0[authorizationStatus.ordinal()];
        if (i2 == 1) {
            this.f28366j.track(x60.a.c.f34901b);
            return;
        }
        if (i2 == 2) {
            this.f28366j.track(x60.a.e.f34903b);
            a();
        } else {
            if (i2 == 3) {
                this.f28366j.track(x60.a.d.f34902b);
                p();
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f28368b;
        final /* synthetic */ Coordinate d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Coordinate coordinate, Continuation continuation) {
            super(2, continuation);
            this.d = coordinate;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return f70.this.new c(this.d, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
        
            if (((kotlinx.coroutines.flow.Flow) r8).collect(r1, r7) != r0) goto L23;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r7.f28368b
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L2c
                if (r1 == r5) goto L28
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                java.lang.Object r0 = r7.f28367a
                com.fourthline.orca.internal.a70 r0 = (com.fourthline.orca.internal.a70) r0
                yhm.o.b(r8)
                goto L72
            L18:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L20:
                java.lang.Object r1 = r7.f28367a
                com.fourthline.orca.internal.a70 r1 = (com.fourthline.orca.internal.a70) r1
                yhm.o.b(r8)
                goto L5c
            L28:
                yhm.o.b(r8)
                goto L3a
            L2c:
                yhm.o.b(r8)
                r7.f28368b = r5
                r5 = 2000(0x7d0, double:9.88E-321)
                java.lang.Object r8 = skm.k0.b(r5, r7)
                if (r8 != r0) goto L3a
                goto L71
            L3a:
                com.fourthline.orca.internal.a70 r8 = new com.fourthline.orca.internal.a70
                com.fourthline.orca.internal.f70 r1 = com.fourthline.orca.internal.f70.this
                com.fourthline.orca.internal.c70 r1 = com.fourthline.orca.internal.f70.c(r1)
                com.fourthline.core.location.Coordinate r1 = r1.getLocation()
                if (r1 == 0) goto L75
                r8.<init>(r1)
                com.fourthline.orca.internal.f70 r1 = com.fourthline.orca.internal.f70.this
                com.fourthline.orca.internal.wd1 r1 = r1.e()
                r7.f28367a = r2
                r7.f28368b = r4
                java.lang.Object r8 = r1.a(r8, r7)
                if (r8 != r0) goto L5c
                goto L71
            L5c:
                kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
                com.fourthline.orca.internal.f70$c$a r1 = new com.fourthline.orca.internal.f70$c$a
                com.fourthline.orca.internal.f70 r4 = com.fourthline.orca.internal.f70.this
                com.fourthline.core.location.Coordinate r5 = r7.d
                r1.<init>(r4, r5)
                r7.f28367a = r2
                r7.f28368b = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L72
            L71:
                return r0
            L72:
                kotlin.Unit r8 = kotlin.Unit.f186387a
                return r8
            L75:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Location must be present at this moment"
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.f70.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ f70 f28370a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Coordinate f28371b;

            public a(f70 f70Var, Coordinate coordinate) {
                this.f28370a = f70Var;
                this.f28371b = coordinate;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(xd1 xd1Var, Continuation continuation) {
                if (!(xd1Var instanceof xd1.d)) {
                    if (xd1Var instanceof xd1.c) {
                        this.f28370a.d().a(this.f28370a.f.d(true));
                    } else {
                        if (xd1Var instanceof xd1.a) {
                            this.f28370a.d().a(this.f28370a.f.d(false));
                            fe1 fe1VarF = this.f28370a.f();
                            ky kyVarA = ((xd1.a) xd1Var).a();
                            c60 c60Var = (c60) (kyVarA instanceof c60 ? kyVarA : null);
                            if (c60Var == null) {
                                throw new IllegalStateException(kyVarA.getClass().getSimpleName().concat(" are not accepted by this Coordinator.").toString());
                            }
                            fe1VarF.b(new y60.a.b(c60Var));
                        } else {
                            if (!(xd1Var instanceof xd1.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.f28370a.d().a(this.f28370a.f.d(false));
                            xd1.b bVar = (xd1.b) xd1Var;
                            hq0.c cVar = new hq0.c(bVar.a(), "location_scanner", null, 4, null);
                            aq0 aq0Var = this.f28370a.f28364g;
                            kh0 kh0VarA = bVar.a();
                            aq0.a(aq0Var, cVar, ((kh0VarA instanceof re1.a) || (kh0VarA instanceof re1.c)) ? new rj1(this.f28370a, this.f28371b, 3) : null, null, 4, null);
                        }
                    }
                }
                return Unit.f186387a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit a(f70 f70Var, Coordinate coordinate) {
                f70Var.a(coordinate);
                return Unit.f186387a;
            }
        }
    }

    private final void a() {
        if (this.f28365h.getAccuracyAuthorization() == LocationProvider.AccuracyAuthorization.FULL) {
            t();
        } else {
            q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(LocationProviderError locationProviderError) {
        Objects.toString(locationProviderError);
        aq0.a(this.f28364g, w60.a.f34527a, new d(this), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Coordinate coordinate) {
        this.f28366j.track(x60.a.f.f34904b);
        this.i.a(coordinate);
        skm.e0.C(this, null, null, new c(coordinate, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(f70 f70Var, LocationProvider.AccuracyAuthorization it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        f70Var.r();
        return Unit.f186387a;
    }
}
