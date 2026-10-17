package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.orca.internal.ei;
import com.fourthline.orca.internal.hi;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.ii;
import com.fourthline.orca.internal.xd1;
import java.util.Date;
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
public final class qi implements ax, CoroutineScope {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final a f32437j = new a(null);
    public static final int k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Date f32438l = new Date(253370815637000L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f32439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f32440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fe1 f32441c;
    private final mi d;
    private final oi e;
    private final qg0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimestampProvider f32442g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final wd1 f32443h;
    private final aq0 i;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public qi(mq0 presenter, fe1 viewNavigator, mi repository, oi stateProvider, qg0 analytics, TimestampProvider timestampProvider, wd1 viewCompletionHandler, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f32439a = coroutineScope;
        this.f32440b = presenter;
        this.f32441c = viewNavigator;
        this.d = repository;
        this.e = stateProvider;
        this.f = analytics;
        this.f32442g = timestampProvider;
        this.f32443h = viewCompletionHandler;
        this.i = popupHandler;
        repository.a(repository.d());
    }

    private final void e() {
        DocumentType documentTypeB = b();
        if (documentTypeB != null) {
            this.f.track(new ei.a.f(documentTypeB));
        }
        mi miVar = this.d;
        a(new ki(miVar.s(), miVar.m(), miVar.d()));
    }

    private final void f() {
        DocumentType documentTypeB = b();
        if (documentTypeB != null) {
            this.f.track(new ei.a.C0192a(documentTypeB));
        }
        this.f32441c.b(hi.b.f29267a);
    }

    private final void g() {
        DocumentType documentTypeB = b();
        if (documentTypeB != null) {
            this.f.track(new ei.a.d(documentTypeB));
        }
        this.f32440b.a(new mp1(this, 21));
        this.d.a(true);
    }

    private final void h() {
        this.f32440b.a(this.e.t());
    }

    private final void i() {
        this.f32440b.a(this.e.l());
    }

    private final void j() {
        this.f32440b.a(this.e.g());
    }

    private final void k() {
        this.f32440b.a(this.e.i());
    }

    private final void l() {
        this.f32440b.a(this.e.c());
    }

    private final void m() {
        this.f32440b.a(this.e.e());
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f32439a.getCoroutineContext();
    }

    private final void d() {
        this.f32440b.a(this.e.n());
    }

    public final mq0 c() {
        return this.f32440b;
    }

    private final DocumentType b() {
        di diVarC = this.d.c();
        if (diVarC != null) {
            return diVarC.c();
        }
        return null;
    }

    private final void c(String str) {
        Date dateA = oe.a(str, this.f32442g.getCurrentCalendar());
        if (dateA == null) {
            dateA = a(str);
        }
        this.d.b(dateA);
        this.f32440b.a(this.e.c(str));
    }

    private final void b(boolean z) {
        this.f32440b.a(this.e.c(z));
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(ii event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof ii.h) {
            e();
            return;
        }
        if (event instanceof ii.i) {
            f();
            return;
        }
        if (event instanceof ii.d) {
            a((ii.d) event);
            return;
        }
        if (event instanceof ii.f) {
            a((ii.f) event);
            return;
        }
        if (event instanceof ii.a) {
            a((ii.a) event);
            return;
        }
        if (event instanceof ii.e) {
            a((ii.e) event);
            return;
        }
        if (event instanceof ii.g) {
            c(((ii.g) event).a());
            return;
        }
        if (event instanceof ii.b) {
            b(((ii.b) event).a());
        } else if (event instanceof ii.c) {
            a(((ii.c) event).a());
        } else {
            if (!(event instanceof ii.j)) {
                throw new NoWhenBranchMatchedException();
            }
            g();
        }
    }

    private final void b(String str) {
        this.d.a(oe.a(str, this.f32442g.getCurrentCalendar()));
        this.f32440b.a(this.e.b(str));
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f32444a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ki f32446c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ki kiVar, Continuation continuation) {
            super(2, continuation);
            this.f32446c = kiVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return qi.this.new b(this.f32446c, continuation);
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
                int r1 = r5.f32444a
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
                com.fourthline.orca.internal.qi r6 = com.fourthline.orca.internal.qi.this
                com.fourthline.orca.internal.wd1 r6 = com.fourthline.orca.internal.qi.c(r6)
                com.fourthline.orca.internal.ki r1 = r5.f32446c
                r5.f32444a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L30
                goto L43
            L30:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.qi$b$a r1 = new com.fourthline.orca.internal.qi$b$a
                com.fourthline.orca.internal.qi r3 = com.fourthline.orca.internal.qi.this
                com.fourthline.orca.internal.ki r4 = r5.f32446c
                r1.<init>(r3, r4)
                r5.f32444a = r2
                java.lang.Object r6 = r6.collect(r1, r5)
                if (r6 != r0) goto L44
            L43:
                return r0
            L44:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.qi.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ qi f32447a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ki f32448b;

            public a(qi qiVar, ki kiVar) {
                this.f32447a = qiVar;
                this.f32448b = kiVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(xd1 xd1Var, Continuation continuation) {
                if (!(xd1Var instanceof xd1.d)) {
                    if (xd1Var instanceof xd1.c) {
                        this.f32447a.c().a(this.f32447a.e.d(true));
                    } else if (xd1Var instanceof xd1.a) {
                        this.f32447a.c().a(this.f32447a.e.d(false));
                        this.f32447a.f32441c.b(new hi.a(((xd1.a) xd1Var).a()));
                    } else {
                        if (!(xd1Var instanceof xd1.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f32447a.c().a(this.f32447a.e.d(false));
                        this.f32447a.i.a(new hq0.c(((xd1.b) xd1Var).a(), null, new rj1(this.f32447a, this.f32448b, 9), 2, null));
                    }
                }
                return Unit.f186387a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit a(qi qiVar, ki kiVar) {
                qiVar.a(kiVar);
                return Unit.f186387a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(ki kiVar) {
        skm.e0.C(this, null, null, new b(kiVar, null), 3);
    }

    private final void a(boolean z) {
        if (z) {
            this.d.b(f32438l);
        } else if (Intrinsics.f(this.d.m(), f32438l)) {
            this.d.b(null);
        }
        this.f32440b.a(this.e.b(z));
        b(this.e.a());
    }

    private final void a(ii.d dVar) {
        if (dVar.a() && a().q().getState() != l20.f30508b) {
            DocumentType documentTypeB = b();
            if (documentTypeB != null) {
                this.f.track(new ei.a.c(documentTypeB));
            }
            j();
            b(false);
            d();
            return;
        }
        if (dVar.a() || a().q().getState() != l20.f30508b) {
            return;
        }
        k();
        b(this.e.a());
    }

    private final void a(ii.f fVar) {
        if (fVar.a() && a().s().getState() != l20.f30508b) {
            DocumentType documentTypeB = b();
            if (documentTypeB != null) {
                this.f.track(new ei.a.e(documentTypeB));
            }
            l();
            b(false);
            d();
            return;
        }
        if (fVar.a() || a().s().getState() != l20.f30508b) {
            return;
        }
        m();
        b(this.e.a());
    }

    private final void a(ii.a aVar) {
        if (aVar.a() && a().o().getState() != l20.f30508b) {
            DocumentType documentTypeB = b();
            if (documentTypeB != null) {
                this.f.track(new ei.a.b(documentTypeB));
            }
            h();
            b(false);
            d();
            return;
        }
        if (aVar.a() || a().o().getState() != l20.f30508b) {
            return;
        }
        i();
        b(this.e.a());
    }

    private final void a(ii.e eVar) {
        this.d.a(eVar.a());
        this.f32440b.a(this.e.e(eVar.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final li a(qi qiVar, li present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return qiVar.e.getInitialState();
    }

    private final li a() {
        return (li) this.f32440b.b();
    }

    private final Date a(String str) {
        if (Intrinsics.f(str, "99/99/9999")) {
            return f32438l;
        }
        return null;
    }
}
