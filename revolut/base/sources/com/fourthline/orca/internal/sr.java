package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.gr;
import com.fourthline.orca.internal.hr;
import com.fourthline.orca.internal.ir;
import com.fourthline.orca.internal.xd1;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class sr implements ax, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f33112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f33113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fe1 f33114c;
    private final wd1 d;
    private final rr e;
    private final or f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final qg0 f33115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private fr f33116h;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33117a;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.sr$a$a, reason: collision with other inner class name */
        public static final class C0281a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f33119a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f33120b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ sr f33121c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0281a(sr srVar, Continuation continuation) {
                super(2, continuation);
                this.f33121c = srVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(xd1 xd1Var, Continuation continuation) {
                return ((C0281a) create(xd1Var, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0281a c0281a = new C0281a(this.f33121c, continuation);
                c0281a.f33120b = obj2;
                return c0281a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                boolean z;
                xd1 xd1Var = (xd1) this.f33120b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f33119a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (xd1Var instanceof xd1.a) {
                    fe1 fe1Var = this.f33121c.f33114c;
                    ky kyVarA = ((xd1.a) xd1Var).a();
                    fp fpVar = (fp) (!(kyVarA instanceof fp) ? null : kyVarA);
                    if (fpVar == null) {
                        throw new IllegalStateException(kyVarA.getClass().getSimpleName().concat(" are not accepted by this Coordinator.").toString());
                    }
                    fe1Var.b(new hr.b(fpVar));
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return sr.this.new a(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (vkm.q.y((kotlinx.coroutines.flow.Flow) r6, r1, r5) == r0) goto L15;
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
                int r1 = r5.f33117a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                yhm.o.b(r6)
                goto L43
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
                com.fourthline.orca.internal.sr r6 = com.fourthline.orca.internal.sr.this
                com.fourthline.orca.internal.wd1 r6 = com.fourthline.orca.internal.sr.a(r6)
                com.fourthline.orca.internal.jr r1 = com.fourthline.orca.internal.jr.f30016a
                r5.f33117a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L30
                goto L42
            L30:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.sr$a$a r1 = new com.fourthline.orca.internal.sr$a$a
                com.fourthline.orca.internal.sr r3 = com.fourthline.orca.internal.sr.this
                r4 = 0
                r1.<init>(r3, r4)
                r5.f33117a = r2
                java.lang.Object r6 = vkm.q.y(r6, r1, r5)
                if (r6 != r0) goto L43
            L42:
                return r0
            L43:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.sr.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public sr(mq0 presenter, fe1 viewNavigator, wd1 viewCompletionHandler, rr stateProvider, or repository, qg0 analytics, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f33112a = coroutineScope;
        this.f33113b = presenter;
        this.f33114c = viewNavigator;
        this.d = viewCompletionHandler;
        this.e = stateProvider;
        this.f = repository;
        this.f33115g = analytics;
    }

    private final void c() {
        this.f33115g.track(gr.a.c.f28973b);
        or orVar = this.f;
        fr frVar = this.f33116h;
        if (frVar != null) {
            orVar.a(frVar.b());
            skm.e0.C(this, null, null, new a(null), 3);
            return;
        }
        throw new IllegalArgumentException(("FL Developer error. " + ((Object) ("Value " + frVar + " must not be null."))).toString());
    }

    private final void d() {
        this.f33115g.track(gr.a.b.f28972b);
        this.f33116h = null;
        this.f33113b.a(this.e.b(null));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f33112a.getF74819h();
    }

    private final void b() {
        this.f33115g.track(gr.a.C0205a.f28971b);
        this.f33114c.b(hr.a.f29382a);
    }

    public final mq0 a() {
        return this.f33113b;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(ir event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof ir.d) {
            d();
            return;
        }
        if (event instanceof ir.a) {
            b();
        } else if (event instanceof ir.b) {
            c();
        } else {
            if (!(event instanceof ir.c)) {
                throw new NoWhenBranchMatchedException();
            }
            a(((ir.c) event).a());
        }
    }

    private final void a(DocumentType documentType) {
        Object next;
        Iterator it8 = this.f.a().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((fr) next).b().c() == documentType) {
                    break;
                }
            }
        }
        fr frVar = (fr) next;
        if (frVar != null) {
            this.f33115g.track(new gr.a.d(frVar.c(), frVar.a()));
            a(frVar);
        }
    }

    private final void a(fr frVar) {
        this.f33116h = frVar;
        this.f33113b.a(this.e.b(frVar));
    }
}
