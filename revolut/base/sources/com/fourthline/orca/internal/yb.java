package com.fourthline.orca.internal;

import com.fourthline.orca.internal.hb;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.ib;
import com.fourthline.orca.internal.rb;
import com.fourthline.orca.internal.xd1;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes23.dex */
public final class yb implements ax, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f35239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f35240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final gb f35241c;
    private final wr d;
    private final fb e;
    private final rx f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fe1 f35242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wd1 f35243h;
    private final qg0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final aq0 f35244j;

    public static final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
        public b(Object obj2) {
            super(1, 0, yb.class, obj2, "onCountryCodeSelected", "onCountryCodeSelected(Lcom/fourthline/orca/core/internal/composable/base_selector/SelectableItem;)V");
        }

        public final void a(a01 p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((yb) this.receiver).a(p0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            a((a01) obj2);
            return Unit.f186387a;
        }
    }

    public yb(mq0 presenter, gb stateProvider, wr effectHandler, fb repository, rx filterCountriesUseCase, fe1 viewNavigator, wd1 viewCompletionHandler, qg0 analytics, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(filterCountriesUseCase, "filterCountriesUseCase");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f35239a = coroutineScope;
        this.f35240b = presenter;
        this.f35241c = stateProvider;
        this.d = effectHandler;
        this.e = repository;
        this.f = filterCountriesUseCase;
        this.f35242g = viewNavigator;
        this.f35243h = viewCompletionHandler;
        this.i = analytics;
        this.f35244j = popupHandler;
    }

    private final void d() {
        this.i.track(hb.a.C0208a.f29204b);
        this.f35242g.b(ib.c.a.f29550a);
    }

    private final void e() {
        this.f35240b.a(this.f35241c.k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ib f() {
        return ib.b.f29549a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ib g() {
        return ib.a.f29548a;
    }

    private final void h() {
        this.f35240b.a(this.f35241c.s());
    }

    private final void i() {
        if (((wb) this.f35240b.b()).n().getState() == l20.f30508b) {
            this.f35240b.a(this.f35241c.E());
        }
    }

    private final void j() {
        this.d.a(new it1(6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ib k() {
        return ib.a.f29548a;
    }

    private final void l() {
        this.f35240b.a(this.f35241c.v());
    }

    private final void m() {
        if (((wb) this.f35240b.b()).o().getState() == l20.f30507a) {
            return;
        }
        r();
    }

    private final void n() {
        this.i.track(hb.a.c.f29206b);
        a(vb.f34287a);
    }

    private final void o() {
        this.f35240b.a(this.f35241c.w());
    }

    private final void p() {
        if (((wb) this.f35240b.b()).q().b().getState() == l20.f30507a) {
            return;
        }
        s();
    }

    private final void q() {
        this.i.track(hb.a.b.f29205b);
        if (!this.e.h()) {
            r();
        }
        if (this.e.c()) {
            return;
        }
        s();
    }

    private final void r() {
        if (this.e.h()) {
            this.f35240b.a(this.f35241c.A());
        } else if (this.e.e()) {
            this.f35240b.a(this.f35241c.F());
        } else {
            this.f35240b.a(this.f35241c.B());
        }
    }

    private final void s() {
        if (this.e.c()) {
            this.f35240b.a(this.f35241c.D());
        } else if (this.e.j()) {
            this.f35240b.a(this.f35241c.G());
        } else {
            this.f35240b.a(this.f35241c.C());
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f35239a.getF74819h();
    }

    public final mq0 b() {
        return this.f35240b;
    }

    public final gb c() {
        return this.f35241c;
    }

    private final void b(String str) {
        this.e.b(kotlin.text.d0.F0(str).toString());
        mq0 mq0Var = this.f35240b;
        mq0Var.a(this.f35241c.d(str));
        mq0Var.a(this.f35241c.z());
    }

    private final void c(String str) {
        this.e.a(kotlin.text.d0.F0(str).toString());
        mq0 mq0Var = this.f35240b;
        mq0Var.a(this.f35241c.f(str));
        mq0Var.a(this.f35241c.z());
    }

    public final wr a() {
        return this.d;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(rb event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof rb.a) {
            d();
            return;
        }
        if (event instanceof rb.c) {
            n();
            return;
        }
        if (event instanceof rb.b) {
            j();
            return;
        }
        if (event instanceof rb.d) {
            q();
            return;
        }
        if (event instanceof kb) {
            e();
            return;
        }
        if (event instanceof mb) {
            a(((mb) event).a());
            return;
        }
        if (event instanceof lb) {
            h();
            return;
        }
        if (event instanceof nb) {
            i();
            return;
        }
        if (event instanceof jb) {
            a(((jb) event).a());
            return;
        }
        if (event instanceof ob) {
            b(((ob) event).a());
            return;
        }
        if (event instanceof pb) {
            l();
            return;
        }
        if (event instanceof qb) {
            m();
            return;
        }
        if (event instanceof tb) {
            o();
        } else if (event instanceof ub) {
            p();
        } else {
            if (!(event instanceof sb)) {
                throw new NoWhenBranchMatchedException();
            }
            c(((sb) event).a());
        }
    }

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35245a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ vb f35247c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vb vbVar, Continuation continuation) {
            super(2, continuation);
            this.f35247c = vbVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return yb.this.new a(this.f35247c, continuation);
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
                int r1 = r5.f35245a
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
                com.fourthline.orca.internal.yb r6 = com.fourthline.orca.internal.yb.this
                com.fourthline.orca.internal.wd1 r6 = com.fourthline.orca.internal.yb.b(r6)
                com.fourthline.orca.internal.vb r1 = r5.f35247c
                r5.f35245a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L30
                goto L43
            L30:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.yb$a$a r1 = new com.fourthline.orca.internal.yb$a$a
                com.fourthline.orca.internal.yb r3 = com.fourthline.orca.internal.yb.this
                com.fourthline.orca.internal.vb r4 = r5.f35247c
                r1.<init>(r3, r4)
                r5.f35245a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.yb.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.yb$a$a, reason: collision with other inner class name */
        public static final class C0316a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ yb f35248a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ vb f35249b;

            public C0316a(yb ybVar, vb vbVar) {
                this.f35248a = ybVar;
                this.f35249b = vbVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(xd1 xd1Var, Continuation continuation) {
                if (!(xd1Var instanceof xd1.d)) {
                    if (xd1Var instanceof xd1.c) {
                        this.f35248a.b().a(this.f35248a.c().d(true));
                    } else if (xd1Var instanceof xd1.a) {
                        this.f35248a.b().a(this.f35248a.c().d(false));
                        fe1 fe1Var = this.f35248a.f35242g;
                        ky kyVarA = ((xd1.a) xd1Var).a();
                        ac acVar = (ac) (!(kyVarA instanceof ac) ? null : kyVarA);
                        if (acVar == null) {
                            throw new IllegalStateException(kyVarA.getClass().getSimpleName().concat(" are not accepted by this Coordinator.").toString());
                        }
                        fe1Var.b(new ib.c.b(acVar));
                    } else {
                        if (!(xd1Var instanceof xd1.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f35248a.b().a(this.f35248a.c().d(false));
                        this.f35248a.f35244j.a(new hq0.c(((xd1.b) xd1Var).a(), null, new rj1(this.f35248a, this.f35249b, 13), 2, null));
                    }
                }
                return Unit.f186387a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit a(yb ybVar, vb vbVar) {
                ybVar.a(vbVar);
                return Unit.f186387a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(vb vbVar) {
        skm.e0.C(this, null, null, new a(vbVar, null), 3);
    }

    private final void a(String str) {
        this.f35240b.a(this.f35241c.a(str));
        this.f.a(kotlin.text.d0.F0(str).toString(), this.e.b(), new b(this), new ss1(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(yb ybVar, List it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        ybVar.f35240b.a(ybVar.f35241c.a(it8));
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(a01 a01Var) {
        Object next;
        Iterator it8 = this.e.b().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f((fd) next, a01Var)) {
                    break;
                }
            }
        }
        fd fdVar = (fd) next;
        if (fdVar != null) {
            a(fdVar);
        }
    }

    private final void a(fd fdVar) {
        String strG = fdVar.g();
        fd fdVarD = this.e.d();
        if (!Intrinsics.f(strG, fdVarD != null ? fdVarD.g() : null)) {
            this.e.a("");
        }
        this.e.a(fdVar);
        mq0 mq0Var = this.f35240b;
        mq0Var.a(this.f35241c.a(fdVar));
        mq0Var.a(this.f35241c.z());
        wr wrVar = this.d;
        wrVar.a(new it1(7));
        wrVar.a(new it1(8));
    }
}
