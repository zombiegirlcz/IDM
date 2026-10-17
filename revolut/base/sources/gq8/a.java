package gq8;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.junior_tasks.api.models.JuniorTaskTaxBreakdownType;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.taxes_breakdown.ChallengesTaxesBreakdownScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChallengesTaxesBreakdownScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ChallengesTaxesBreakdownScreen challengesTaxesBreakdownScreen, Continuation continuation) {
        super(2, continuation);
        this.v = challengesTaxesBreakdownScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = this.v.T;
        Intrinsics.h(model);
        dVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (model.o instanceof JuniorTaskTaxBreakdownType.Gmf) {
            dVar.C2(new c(dVar.o.f145593a));
        }
        return Unit.f186387a;
    }
}
