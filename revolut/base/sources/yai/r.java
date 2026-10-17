package yai;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import vkm.v1;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature_retail_user_declarations.email.screen.a f312044w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.feature_retail_user_declarations.email.screen.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f312044w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f312044w, continuation, 0);
            case 1:
                return new r(this.f312044w, continuation, 1);
            default:
                return new r(this.f312044w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        skm.r rVar;
        Object objB0;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature_retail_user_declarations.email.screen.a aVar2 = this.f312044w;
                    ang.f fVar = aVar2.f97591s;
                    wi0.b bVar = aVar2.o.f97583a;
                    hng.q qVar = (hng.q) fVar.f7769a;
                    qVar.getClass();
                    w4l.h loadingStrategy = w4l.h.f294642c;
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    vkm.d dVarB = qVar.f154119j.b(new hng.n(bVar), loadingStrategy);
                    q qVar2 = new q(aVar2, 0);
                    this.v = 1;
                    if (dVarB.collect(qVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature_retail_user_declarations.email.screen.a aVar4 = this.f312044w;
                    yva.a aVar5 = aVar4.f97588p;
                    boolean z = aVar4.o.d;
                    cwa.j jVar = (cwa.j) aVar5;
                    jVar.getClass();
                    v1 v1Var = new v1(new cwa.h(z, jVar, null));
                    q qVar3 = new q(aVar4, 1);
                    this.v = 1;
                    if (v1Var.collect(qVar3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    com.revolut.feature_retail_user_declarations.email.screen.a aVar6 = this.f312044w;
                    String f81680a = ((k) ((j2) aVar6.f97593w.f22677a).getValue()).e.getF81680a();
                    if (f81680a != null || (rVar = aVar6.v) == null || rVar.isCompleted()) {
                        aVar6.J2(f81680a);
                        objB0 = Unit.f186387a;
                    } else {
                        objB0 = u0.b0(aVar6.X(), "EMAIL_SCREEN_CTA_BUTTON_TAG", new xb4.g(rVar, aVar6, null, 24), this);
                        if (objB0 != obj3) {
                            objB0 = Unit.f186387a;
                        }
                    }
                    if (objB0 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
