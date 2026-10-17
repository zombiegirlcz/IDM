package lh9;

import com.revolut.feature.apm.bills.core.api.model.BillTransferDataV2;
import com.revolut.feature.apm.bills.core.api.model.BillTransferResultV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f195188w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(r rVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f195188w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f195188w, continuation, 0);
            case 1:
                return new p(this.f195188w, continuation, 1);
            default:
                return new p(this.f195188w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((p) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        r rVar = this.f195188w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                wo1.b bVar = rVar.o;
                BillTransferDataV2 billTransferDataV2 = rVar.f195192r.f78788b;
                this.v = 1;
                rm6.c cVar = new rm6.c(((vp1.c) bVar).f291042a, billTransferDataV2, continuation, 9);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, cVar, this);
                return objJ == aVar ? aVar : objJ;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    p pVar = new p(rVar, continuation, 0);
                    this.v = 1;
                    obj2 = do3.q.t(rVar, pVar, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                rVar.C2(new l(((BillTransferResultV2) obj2).f61344a));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    p pVar2 = new p(rVar, continuation, i2);
                    this.v = 1;
                    if (u0.b0(rVar.X(), "FORM_REVIEW_CTA_BUTTON_TAG", pVar2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
