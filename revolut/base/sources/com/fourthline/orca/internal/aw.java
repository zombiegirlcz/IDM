package com.fourthline.orca.internal;

import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.pv;
import com.fourthline.orca.internal.qs;
import com.fourthline.orca.internal.wb1;
import com.fourthline.orca.internal.wv;
import com.fourthline.orca.internal.xd1;
import com.fourthline.orca.internal.zv;
import com.fourthline.orca.kyc.internal.error.KycError;
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
public final class aw implements ax, CoroutineScope {
    public static final a i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f26918j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f26919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f26920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fe1 f26921c;
    private final yv d;
    private final qs e;
    private final Function0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final wd1 f26922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final aq0 f26923h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26924a;

        public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function0 {
            public a(Object obj2) {
                super(0, 0, aw.class, obj2, "finishEidUpload", "finishEidUpload()V");
            }

            public final void a() {
                ((aw) this.receiver).a();
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
            return aw.this.new b(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            Object objA;
            fim.a aVar = fim.a.COROUTINE_SUSPENDED;
            int i = this.f26924a;
            if (i == 0) {
                yhm.o.b(obj2);
                qs qsVar = aw.this.e;
                qs.a aVar2 = new qs.a((String) aw.this.f.invoke());
                this.f26924a = 1;
                objA = qsVar.a(aVar2, this);
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
            aw awVar = aw.this;
            Throwable thA = yhm.m.a(objA);
            if (thA == null) {
                qs.b bVar = (qs.b) objA;
                if (Intrinsics.f(bVar, qs.b.C0274b.f32526a)) {
                    awVar.b();
                } else {
                    if (!(bVar instanceof qs.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (((qs.b.a) bVar).a()) {
                        awVar.d.a(true);
                        awVar.f26923h.a(zv.a.C0322a.f35728a);
                    } else {
                        awVar.d.a(false);
                        awVar.f26923h.a(pv.a.C0266a.f32054a);
                    }
                }
            } else {
                awVar.f26923h.a(new hq0.c(se1.a(thA), "eid_upload", new a(awVar)));
            }
            return Unit.f186387a;
        }
    }

    public aw(mq0 presenter, fe1 viewNavigator, yv resultRepository, qs eidFinishWorker, Function0 workflowIdProvider, wd1 viewCompletionHandler, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(eidFinishWorker, "eidFinishWorker");
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f26919a = coroutineScope;
        this.f26920b = presenter;
        this.f26921c = viewNavigator;
        this.d = resultRepository;
        this.e = eidFinishWorker;
        this.f = workflowIdProvider;
        this.f26922g = viewCompletionHandler;
        this.f26923h = popupHandler;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f26919a.getF74819h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        skm.e0.C(this, null, null, new c(null), 3);
    }

    private final void d() {
        this.f26921c.b(new wv.a(KycError.Canceled.INSTANCE));
    }

    private final void e() {
        a();
    }

    private final void f() {
        d();
    }

    public final mq0 c() {
        return this.f26920b;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(wb1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof wb1.b) {
            e();
        } else if (event instanceof wb1.a) {
            d();
        } else {
            if (!(event instanceof wb1.c)) {
                throw new NoWhenBranchMatchedException();
            }
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        skm.e0.C(this, null, null, new b(null), 3);
    }

    public static final class c extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26926a;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return aw.this.new c(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (((kotlinx.coroutines.flow.Flow) r5).collect(r1, r4) == r0) goto L15;
         */
        @Override // gim.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                fim.a r0 = fim.a.COROUTINE_SUSPENDED
                int r1 = r4.f26926a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                yhm.o.b(r5)
                goto L42
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                yhm.o.b(r5)
                goto L30
            L1c:
                yhm.o.b(r5)
                com.fourthline.orca.internal.aw r5 = com.fourthline.orca.internal.aw.this
                com.fourthline.orca.internal.wd1 r5 = com.fourthline.orca.internal.aw.f(r5)
                com.fourthline.orca.internal.xb1 r1 = com.fourthline.orca.internal.xb1.f34945a
                r4.f26926a = r3
                java.lang.Object r5 = r5.a(r1, r4)
                if (r5 != r0) goto L30
                goto L41
            L30:
                kotlinx.coroutines.flow.Flow r5 = (kotlinx.coroutines.flow.Flow) r5
                com.fourthline.orca.internal.aw$c$a r1 = new com.fourthline.orca.internal.aw$c$a
                com.fourthline.orca.internal.aw r3 = com.fourthline.orca.internal.aw.this
                r1.<init>(r3)
                r4.f26926a = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L42
            L41:
                return r0
            L42:
                kotlin.Unit r5 = kotlin.Unit.f186387a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.aw.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ aw f26928a;

            public a(aw awVar) {
                this.f26928a = awVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(xd1 xd1Var, Continuation continuation) {
                if (!(xd1Var instanceof xd1.d) && !(xd1Var instanceof xd1.c)) {
                    if (xd1Var instanceof xd1.a) {
                        fe1 fe1Var = this.f26928a.f26921c;
                        ky kyVarA = ((xd1.a) xd1Var).a();
                        ky kyVar = kyVarA == null ? null : kyVarA;
                        if (kyVar == null) {
                            throw new IllegalStateException(kyVarA.getClass().getSimpleName().concat(" are not accepted by this Coordinator.").toString());
                        }
                        fe1Var.b(new wv.b(kyVar));
                    } else {
                        if (!(xd1Var instanceof xd1.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f26928a.f26923h.a(new hq0.c(((xd1.b) xd1Var).a(), null, new gj1(this.f26928a, 0), 2, null));
                    }
                }
                return Unit.f186387a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit a(aw awVar) {
                awVar.b();
                return Unit.f186387a;
            }
        }
    }
}
