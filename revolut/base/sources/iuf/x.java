package iuf;

import i2l.e0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a f168585w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i, com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f168585w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x xVar = new x(0, this.f168585w, continuation);
                xVar.v = obj2;
                return xVar;
            case 1:
                x xVar2 = new x(1, this.f168585w, continuation);
                xVar2.v = obj2;
                return xVar2;
            case 2:
                x xVar3 = new x(2, this.f168585w, continuation);
                xVar3.v = obj2;
                return xVar3;
            default:
                x xVar4 = new x(3, this.f168585w, continuation);
                xVar4.v = obj2;
                return xVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((x) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((x) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((x) create((m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((x) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.review.a aVar = this.f168585w;
        switch (i) {
            case 0:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f92495y, new djc.z(7, iVar));
                break;
            case 1:
                r rVar = (r) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f92495y, new is2.t(rVar, 14));
                break;
            case 2:
                m mVar = (m) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f92495y, new is2.t(mVar, 16));
                break;
            default:
                List list = (List) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f92495y, new e0(list, 10));
                break;
        }
        return Unit.f186387a;
    }
}
