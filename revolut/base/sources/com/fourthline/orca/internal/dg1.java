package com.fourthline.orca.internal;

import com.fourthline.core.DeviceMetadataKt;
import com.fourthline.orca.internal.cf1;
import com.fourthline.orca.internal.fg1;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.re1;
import com.fourthline.orca.internal.tf1;
import com.fourthline.orca.internal.wf1;
import com.fourthline.orca.qes.internal.error.QesError;
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
public final class dg1 implements ax, CoroutineScope {
    private static final a k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f27726l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f27727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f27728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final cg1 f27729c;
    private final aq0 d;
    private final fe1 e;
    private final zf1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ch1 f27730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ij0 f27731h;
    private final fg1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final qg0 f27732j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27733a;

        public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function0 {
            public a(Object obj2) {
                super(0, 0, dg1.class, obj2, "getSession", "getSession()V");
            }

            public final void a() {
                ((dg1) this.receiver).a();
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
            return dg1.this.new b(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object objA;
            hq0.c cVar;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f27733a;
            if (i == 0) {
                yhm.o.b(obj2);
                fg1 fg1Var = dg1.this.i;
                zf1 zf1Var = dg1.this.f;
                fg1.a aVar2 = new fg1.a(zf1Var.a(), zf1Var.b());
                this.f27733a = 1;
                objA = fg1Var.a(aVar2, this);
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
            dg1 dg1Var = dg1.this;
            Throwable thA = yhm.m.a(objA);
            if (thA == null) {
                fg1.b bVar = (fg1.b) objA;
                if (bVar instanceof fg1.b.C0198b) {
                    dg1Var.a(((fg1.b.C0198b) bVar).a());
                } else {
                    if (!(bVar instanceof fg1.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fg1.b.a aVar3 = (fg1.b.a) bVar;
                    cf1 cf1VarA = aVar3.a();
                    if (cf1VarA instanceof cf1.h) {
                        cf1.h hVar = (cf1.h) cf1VarA;
                        cVar = hVar.getCause() instanceof QesError.QtspInvalidSession ? new hq0.c((kh0) hVar.getCause(), "workflow_start_session", null, 4, null) : new hq0.c(new re1.b(hVar.getMessage()), "workflow_start_session", null, 4, null);
                    } else {
                        cVar = new hq0.c(aVar3.a(), "workflow_start_session", null, 4, null);
                    }
                    dg1Var.d.a(cVar);
                }
            } else {
                dg1Var.d.a(new hq0.c(se1.a(thA), "workflow_start_session", new a(dg1Var)));
            }
            return Unit.f186387a;
        }
    }

    public dg1(mq0 presenter, cg1 stateProvider, aq0 popupHandler, fe1 viewNavigator, zf1 repository, ch1 sessionRepository, ij0 themeRepository, fg1 workflowMobileSessionWorker, qg0 analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(themeRepository, "themeRepository");
        Intrinsics.checkNotNullParameter(workflowMobileSessionWorker, "workflowMobileSessionWorker");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f27727a = coroutineScope;
        this.f27728b = presenter;
        this.f27729c = stateProvider;
        this.d = popupHandler;
        this.e = viewNavigator;
        this.f = repository;
        this.f27730g = sessionRepository;
        this.f27731h = themeRepository;
        this.i = workflowMobileSessionWorker;
        this.f27732j = analytics;
    }

    private final void e() {
        ib.h hVar = hb.a.f150532a;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f27727a.getF74819h();
    }

    private final void b() {
        this.f27732j.track(tf1.a.c.f33768b);
        a();
    }

    private final void c() {
        this.f27732j.track(tf1.a.C0285a.f33766b);
        this.e.b(new uf1(cf1.a.d));
    }

    private final void d() {
        c();
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(wf1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof wf1.a) {
            b();
        } else {
            if (!(event instanceof wf1.b)) {
                throw new NoWhenBranchMatchedException();
            }
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        e();
        skm.e0.C(this, null, null, new b(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(eg1 eg1Var) {
        this.f27732j.track(new tf1.a.d(eg1Var));
        if (DeviceMetadataKt.isDeviceRooted()) {
            this.f27732j.track(tf1.a.b.f33767b);
            this.e.b(new uf1(cf1.h.a.a(cf1.h.f, "notSupportedOnCompromisedDevice", null, 2, null)));
            return;
        }
        this.f27730g.a(eg1Var);
        af1 tenant = eg1Var.c().getTenant();
        if (tenant.getRemoteStyles().getEnabled() || tenant.getBackButtonOnTop().getEnabled()) {
            this.f27731h.a(tenant.getRemoteStyles().getEnabled(), tenant.getBackButtonOnTop().getEnabled());
        }
        this.e.b(new vf1(new df1(eg1Var.a())));
    }
}
