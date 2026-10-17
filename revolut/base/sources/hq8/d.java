package hq8;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.screens.transfer.ChallengesReviewTransferController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ChallengesReviewTransferController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ChallengesReviewTransferController challengesReviewTransferController, Continuation continuation) {
        super(2, continuation);
        this.v = challengesReviewTransferController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVarE3 = this.v.d();
        Intrinsics.h(model);
        m mVar = (m) fVarE3;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51832a, "TAXES_ID")) {
            mVar.C2(new j(mVar.o.d));
        }
        return Unit.f186387a;
    }
}
