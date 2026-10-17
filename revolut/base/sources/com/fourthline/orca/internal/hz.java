package com.fourthline.orca.internal;

import com.fourthline.orca.internal.uy;
import com.fourthline.orca.internal.wy;
import com.fourthline.orca.internal.yy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class hz implements ax, CoroutineScope {
    public static final a k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f29441l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f29442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f29443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fe1 f29444c;
    private final gz d;
    private final ez e;
    private final pu f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final jz f29445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final qg0 f29446h;
    private final aq0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private yk f29447j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29448a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29449b;

        public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function0 {
            public a(Object obj2) {
                super(0, 0, hz.class, obj2, "makeReadyAndGetConsent", "makeReadyAndGetConsent()V");
            }

            public final void a() {
                ((hz) this.receiver).b();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f186387a;
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.hz$b$b, reason: collision with other inner class name */
        public static final /* synthetic */ class C0214b {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[yk.values().length];
                try {
                    iArr[yk.f35367a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[yk.f35368b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
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
            return hz.this.new b(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0150  */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 527
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.hz.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public hz(mq0 presenter, fe1 viewNavigator, gz stateProvider, ez repository, pu eidReadyWorker, jz flowVariantWorker, qg0 analytics, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(eidReadyWorker, "eidReadyWorker");
        Intrinsics.checkNotNullParameter(flowVariantWorker, "flowVariantWorker");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f29442a = coroutineScope;
        this.f29443b = presenter;
        this.f29444c = viewNavigator;
        this.d = stateProvider;
        this.e = repository;
        this.f = eidReadyWorker;
        this.f29445g = flowVariantWorker;
        this.f29446h = analytics;
        this.i = popupHandler;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f29442a.getF74819h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        skm.e0.C(this, null, null, new b(null), 3);
    }

    private final void c() {
        this.f29446h.track(uy.a.C0296a.f34215b);
        this.f29444c.b(wy.a.f34811a);
    }

    private final void d() {
        this.f29446h.track(uy.a.d.f34218b);
        b();
    }

    private final void e() {
        this.f29446h.track(uy.a.c.f34217b);
        this.f29447j = null;
        this.f29443b.a(gz.a(this.d, null, false, 2, null));
    }

    public final mq0 a() {
        return this.f29443b;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(yy event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof yy.d) {
            e();
            return;
        }
        if (event instanceof yy.a) {
            c();
        } else if (event instanceof yy.b) {
            d();
        } else {
            if (!(event instanceof yy.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((yy.c) event).a());
        }
    }

    private final void a(yk ykVar) {
        this.f29446h.track(new uy.a.e(ykVar));
        this.f29447j = ykVar;
        this.f29443b.a(gz.a(this.d, ykVar, false, 2, null));
    }
}
