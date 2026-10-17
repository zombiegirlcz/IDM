package com.fourthline.orca.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.orca.internal.mq;
import com.fourthline.orca.internal.oq;
import com.fourthline.orca.internal.pq;
import com.fourthline.orca.internal.xd1;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class ar implements ax, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f26873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f26874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fe1 f26875c;
    private final wd1 d;
    private final vq e;
    private final zq f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final qg0 f26876g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final aq0 f26877h;
    private final fd i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private di f26878j;

    public static final class a extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26879a;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.ar$a$a, reason: collision with other inner class name */
        public static final class C0165a extends gim.i implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f26881a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f26882b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ar f26883c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0165a(ar arVar, Continuation continuation) {
                super(2, continuation);
                this.f26883c = arVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(xd1 xd1Var, Continuation continuation) {
                return ((C0165a) create(xd1Var, continuation)).invokeSuspend(Unit.f186387a);
            }

            @Override // gim.a
            public final Continuation create(Object obj2, Continuation continuation) {
                C0165a c0165a = new C0165a(this.f26883c, continuation);
                c0165a.f26882b = obj2;
                return c0165a;
            }

            @Override // gim.a
            public final Object invokeSuspend(Object obj2) {
                boolean z;
                xd1 xd1Var = (xd1) this.f26882b;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                if (this.f26881a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yhm.o.b(obj2);
                if (xd1Var instanceof xd1.a) {
                    fe1 fe1Var = this.f26883c.f26875c;
                    ky kyVarA = ((xd1.a) xd1Var).a();
                    fp fpVar = (fp) (!(kyVarA instanceof fp) ? null : kyVarA);
                    if (fpVar == null) {
                        throw new IllegalStateException(kyVarA.getClass().getSimpleName().concat(" are not accepted by this Coordinator.").toString());
                    }
                    fe1Var.b(new oq.c(fpVar));
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
            return ar.this.new a(continuation);
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
                int r1 = r5.f26879a
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
                com.fourthline.orca.internal.ar r6 = com.fourthline.orca.internal.ar.this
                com.fourthline.orca.internal.wd1 r6 = com.fourthline.orca.internal.ar.a(r6)
                com.fourthline.orca.internal.rq r1 = com.fourthline.orca.internal.rq.f32799a
                r5.f26879a = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L30
                goto L42
            L30:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                com.fourthline.orca.internal.ar$a$a r1 = new com.fourthline.orca.internal.ar$a$a
                com.fourthline.orca.internal.ar r3 = com.fourthline.orca.internal.ar.this
                r4 = 0
                r1.<init>(r3, r4)
                r5.f26879a = r2
                java.lang.Object r6 = vkm.q.y(r6, r1, r5)
                if (r6 != r0) goto L43
            L42:
                return r0
            L43:
                kotlin.Unit r6 = kotlin.Unit.f186387a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ar.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ar(mq0 presenter, fe1 viewNavigator, wd1 viewCompletionHandler, vq repository, zq stateProvider, qg0 analytics, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(viewCompletionHandler, "viewCompletionHandler");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f26873a = coroutineScope;
        this.f26874b = presenter;
        this.f26875c = viewNavigator;
        this.d = viewCompletionHandler;
        this.e = repository;
        this.f = stateProvider;
        this.f26876g = analytics;
        this.f26877h = popupHandler;
        this.i = repository.a();
    }

    private final void c() {
        this.f26877h.a(qq.f32508a);
    }

    private final void d() {
        di diVar = this.f26878j;
        if (diVar != null) {
            this.f26876g.track(new mq.a.e(diVar.c()));
            this.e.a(diVar);
        }
        skm.e0.C(this, null, null, new a(null), 3);
    }

    private final void e() {
        this.f26876g.track(new mq.a.d(this.i));
        zq zqVar = this.f;
        mq0 mq0Var = this.f26874b;
        List listB = this.e.b();
        String strC = this.i.c();
        di diVarC = this.e.c();
        mq0Var.a(zqVar.a(listB, strC, diVarC != null ? diVarC.c() : null));
        this.f26878j = this.e.c();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f26873a.getF74819h();
    }

    private final void b(DocumentType documentType) {
        Object next;
        Iterator it8 = this.e.b().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((di) next).c() == documentType) {
                    break;
                }
            }
        }
        this.f26878j = (di) next;
        this.f26874b.a(this.f.a(documentType));
        this.f26876g.track(new mq.a.c(documentType));
    }

    public final mq0 a() {
        return this.f26874b;
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(pq event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof pq.e) {
            e();
            return;
        }
        if (event instanceof pq.d) {
            a(((pq.d) event).a());
            return;
        }
        if (event instanceof pq.c) {
            d();
        } else if (event instanceof pq.a) {
            b();
        } else {
            if (!(event instanceof pq.b)) {
                throw new NoWhenBranchMatchedException();
            }
            c();
        }
    }

    private final void b() {
        this.f26876g.track(mq.a.C0251a.f31247b);
        this.f26875c.b(oq.a.f31712a);
    }

    private final void a(DocumentType documentType) {
        b(documentType);
    }
}
