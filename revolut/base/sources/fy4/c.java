package fy4;

import com.revolut.feature.credit.core.ui.info.CreditInfoController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CreditInfoController f138891w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(CreditInfoController creditInfoController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f138891w = creditInfoController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f138891w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f138891w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c(this.f138891w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
            default:
                c cVar4 = new c(this.f138891w, continuation, 3);
                cVar4.v = obj2;
                return cVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ty0.a aVar = (ty0.a) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(aVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        CreditInfoController creditInfoController = this.f138891w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE3 = creditInfoController.e3();
                Intrinsics.h(aVar);
                ((com.revolut.feature.credit.core.ui.info.a) gVarE3).J2(new l(aVar));
                break;
            case 1:
                ty0.a aVar3 = (ty0.a) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE32 = creditInfoController.e3();
                Intrinsics.h(aVar3);
                ((com.revolut.feature.credit.core.ui.info.a) gVarE32).J2(new h(aVar3));
                break;
            case 2:
                ty0.a aVar5 = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE33 = creditInfoController.e3();
                Intrinsics.h(aVar5);
                ((com.revolut.feature.credit.core.ui.info.a) gVarE33).J2(new m(aVar5));
                break;
            default:
                ty0.a aVar7 = (ty0.a) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVarE34 = creditInfoController.e3();
                Intrinsics.h(aVar7);
                ((com.revolut.feature.credit.core.ui.info.a) gVarE34).J2(new n(aVar7));
                break;
        }
        return Unit.f186387a;
    }
}
