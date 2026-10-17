package wyc;

import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.selfserve.sot.impl.ui.evidencetypes.EvidenceTypesController;
import ip0.dg;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.z1;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EvidenceTypesController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(EvidenceTypesController evidenceTypesController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = evidenceTypesController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            case 1:
                return new h(this.v, continuation, 1);
            default:
                return new h(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((dg) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        EvidenceTypesController evidenceTypesController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                evidenceTypesController.m2().onBackPressed();
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar = (t) evidenceTypesController.T.getValue();
                tVar.H2(tVar.u, new p(0));
                z1 z1Var = tVar.f301230t;
                Unit unit = Unit.f186387a;
                z1Var.k(unit);
                return unit;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVar2 = (t) evidenceTypesController.T.getValue();
                IncomeSource incomeSource = tVar2.f301226p;
                if (incomeSource != null) {
                    tVar2.C2(new m(incomeSource));
                }
                return Unit.f186387a;
        }
    }
}
