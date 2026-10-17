package com.fourthline.orca.internal;

import com.fourthline.core.eid.EidAuthError;
import com.fourthline.core.eid.EidAuthEvent;
import com.fourthline.core.eid.EidAuthResult;
import com.fourthline.orca.internal.bf0;
import com.fourthline.orca.internal.cf0;
import com.fourthline.orca.internal.cv;
import com.fourthline.orca.internal.dv;
import com.fourthline.orca.internal.iv;
import com.fourthline.orca.internal.ru;
import com.fourthline.orca.internal.su;
import com.fourthline.orca.internal.tu;
import com.fourthline.orca.internal.uu;
import com.fourthline.orca.internal.vu;
import com.fourthline.orca.internal.wu;
import java.util.Objects;
import kotlin.Function;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes23.dex */
public final class jv implements ax, CoroutineScope {
    public static final a i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f30045j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ CoroutineScope f30046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mq0 f30047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wr f30048c;
    private final lf0 d;
    private final fe1 e;
    private final ev f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final iv f30049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final aq0 f30050h;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.i implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f30051a;

        public static final /* synthetic */ class a implements FlowCollector, kotlin.jvm.internal.n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ jv f30053a;

            public a(jv jvVar) {
                this.f30053a = jvVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(iv.a aVar, Continuation continuation) {
                Object objB = b.b(this.f30053a, aVar, continuation);
                return objB == fim.a.COROUTINE_SUSPENDED ? objB : Unit.f186387a;
            }

            public final boolean equals(Object obj2) {
                if ((obj2 instanceof FlowCollector) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    return Intrinsics.f(getFunctionDelegate(), ((kotlin.jvm.internal.n) obj2).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.n
            public final Function getFunctionDelegate() {
                return new kotlin.jvm.internal.a(2, 4, jv.class, this.f30053a, "onUseCaseEvent", "onUseCaseEvent(Lcom/fourthline/orca/kyc/internal/flow/eid/scanner/EidScannerUseCase$UseCaseEvent;)V");
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public b(Continuation continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object b(jv jvVar, iv.a aVar, Continuation continuation) {
            jvVar.a(aVar);
            return Unit.f186387a;
        }

        @Override // gim.a
        public final Continuation create(Object obj2, Continuation continuation) {
            return jv.this.new b(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            if (((kotlinx.coroutines.flow.Flow) r5).collect(r3, r4) == r0) goto L15;
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
                int r1 = r4.f30051a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                yhm.o.b(r5)
                goto L40
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                yhm.o.b(r5)
                goto L2e
            L1c:
                yhm.o.b(r5)
                com.fourthline.orca.internal.jv r5 = com.fourthline.orca.internal.jv.this
                com.fourthline.orca.internal.iv r5 = com.fourthline.orca.internal.jv.a(r5)
                r4.f30051a = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L2e
                goto L3f
            L2e:
                kotlinx.coroutines.flow.Flow r5 = (kotlinx.coroutines.flow.Flow) r5
                com.fourthline.orca.internal.jv r1 = com.fourthline.orca.internal.jv.this
                com.fourthline.orca.internal.jv$b$a r3 = new com.fourthline.orca.internal.jv$b$a
                r3.<init>(r1)
                r4.f30051a = r2
                java.lang.Object r5 = r5.collect(r3, r4)
                if (r5 != r0) goto L40
            L3f:
                return r0
            L40:
                kotlin.Unit r5 = kotlin.Unit.f186387a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.jv.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
        }
    }

    public jv(mq0 presenter, wr effectHandler, lf0 stateProvider, fe1 viewNavigator, ev repository, iv eidScannerUseCase, aq0 popupHandler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(effectHandler, "effectHandler");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(viewNavigator, "viewNavigator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(eidScannerUseCase, "eidScannerUseCase");
        Intrinsics.checkNotNullParameter(popupHandler, "popupHandler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f30046a = coroutineScope;
        this.f30047b = presenter;
        this.f30048c = effectHandler;
        this.d = stateProvider;
        this.e = viewNavigator;
        this.f = repository;
        this.f30049g = eidScannerUseCase;
        this.f30050h = popupHandler;
    }

    private final void e() {
        this.e.b(cv.a.f27557a);
    }

    private final void f() {
        i();
    }

    private final void g() {
        i();
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final bf0 h() {
        return bf0.e.f27114a;
    }

    private final void i() {
        this.f30047b.a(new lo1(this, 2));
    }

    private final void j() {
        skm.e0.C(this, null, null, new b(null), 3);
    }

    public final wr b() {
        return this.f30048c;
    }

    public final mq0 c() {
        return this.f30047b;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public CoroutineContext getF74819h() {
        return this.f30046a.getF74819h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(jv jvVar) {
        jvVar.j();
        return Unit.f186387a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ff0 c(jv jvVar, ff0 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return (ff0) jvVar.d.getInitialState();
    }

    private final void d() {
        i();
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ff0 b(jv jvVar, ff0 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return jvVar.d.m();
    }

    @Override // com.fourthline.orca.internal.ax
    public void a(cf0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof cf0.a) {
            d();
            return;
        }
        if (event instanceof cf0.d) {
            g();
            return;
        }
        if (event instanceof cf0.c) {
            f();
        } else if (event instanceof cf0.b) {
            e();
        } else {
            if (event instanceof cf0.e) {
                this.e.b(cv.d.f27560a);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void a() {
        if (this.f.c()) {
            j();
        } else {
            this.f30050h.a(dv.a.C0187a.f27930a);
        }
    }

    private final void a(EidAuthError eidAuthError) {
        hq0 hq0Var;
        Objects.toString(eidAuthError);
        boolean z = eidAuthError instanceof EidAuthError.IncorrectPin;
        if (z) {
            this.f.a(as.f26893b);
            ev evVar = this.f;
            evVar.a(evVar.e());
        } else if (!(eidAuthError instanceof EidAuthError.CardBlockedCanNeeded) && !(eidAuthError instanceof EidAuthError.IncorrectCan)) {
            if (eidAuthError instanceof EidAuthError.CardBlockedPukNeeded) {
                this.f.a(as.f26892a);
            } else if (!(eidAuthError instanceof EidAuthError.CardConnectionLost) && !(eidAuthError instanceof EidAuthError.ResultError) && !(eidAuthError instanceof EidAuthError.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            this.f.a(as.f26894c);
        }
        aq0 aq0Var = this.f30050h;
        if (eidAuthError instanceof EidAuthError.IncorrectCan) {
            hq0Var = vu.a.C0301a.f34458a;
        } else if (eidAuthError instanceof EidAuthError.CardBlockedCanNeeded) {
            hq0Var = tu.a.C0289a.f33878a;
        } else if (z) {
            hq0Var = wu.a.C0306a.f34798a;
        } else if (eidAuthError instanceof EidAuthError.CardBlockedPukNeeded) {
            hq0Var = ru.a.C0277a.f32837a;
        } else if (eidAuthError instanceof EidAuthError.CardConnectionLost) {
            hq0Var = su.a.C0282a.f33139a;
        } else {
            if (!(eidAuthError instanceof EidAuthError.ResultError) && !(eidAuthError instanceof EidAuthError.Generic)) {
                throw new NoWhenBranchMatchedException();
            }
            hq0Var = uu.a.C0294a.f34189a;
        }
        aq0.a(aq0Var, hq0Var, eidAuthError instanceof EidAuthError.CardConnectionLost ? new ko1(this, 1) : null, null, 4, null);
    }

    private final void a(EidAuthResult eidAuthResult) {
        Objects.toString(eidAuthResult);
        this.f.a(as.f26892a);
        this.f30048c.a(new wn1(15));
        this.f.b(eidAuthResult.getUrl());
        this.f30047b.a(new lo1(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(iv.a aVar) {
        Objects.toString(aVar);
        if (aVar instanceof iv.a.C0220a) {
            a(((iv.a.C0220a) aVar).a());
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void a(EidAuthEvent eidAuthEvent) {
        Objects.toString(eidAuthEvent);
        if (eidAuthEvent instanceof EidAuthEvent.CanGotReset) {
            this.f.a(as.f26893b);
            this.e.b(cv.e.f27561a);
            return;
        }
        if (eidAuthEvent instanceof EidAuthEvent.CardRequested) {
            this.f30047b.a(new lo1(this, 0));
            return;
        }
        if (eidAuthEvent instanceof EidAuthEvent.Completed) {
            a(((EidAuthEvent.Completed) eidAuthEvent).getResult());
            return;
        }
        if (!(eidAuthEvent instanceof EidAuthEvent.CompletedWithoutResult)) {
            if (eidAuthEvent instanceof EidAuthEvent.Error) {
                a(((EidAuthEvent.Error) eidAuthEvent).getError());
                return;
            } else {
                if (eidAuthEvent instanceof EidAuthEvent.Progress) {
                    this.f30047b.a(this.d.b(kotlin.ranges.f.g((int) (((EidAuthEvent.Progress) eidAuthEvent).getProgressPercent() / 10.0f), 0, 10)));
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        throw new NotImplementedError(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ff0 a(jv jvVar, ff0 present) {
        Intrinsics.checkNotNullParameter(present, "$this$present");
        return jvVar.d.b();
    }
}
