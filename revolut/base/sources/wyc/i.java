package wyc;

import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.selfserve.sot.impl.ui.evidencetypes.EvidenceTypesController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EvidenceTypesController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(EvidenceTypesController evidenceTypesController, Continuation continuation) {
        super(2, continuation);
        this.v = evidenceTypesController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.k;
        IncomeSource incomeSource = obj3 instanceof IncomeSource ? (IncomeSource) obj3 : null;
        if (incomeSource == null) {
            return Unit.f186387a;
        }
        t tVar = (t) this.v.T.getValue();
        tVar.getClass();
        Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
        IncomeSource incomeSource2 = tVar.f301226p;
        if (incomeSource2 == null || Intrinsics.f(incomeSource.f85873a, incomeSource2.f85873a) || !tVar.f301227q) {
            tVar.C2(new m(incomeSource));
        } else {
            tVar.C2(new l(incomeSource));
        }
        return Unit.f186387a;
    }
}
