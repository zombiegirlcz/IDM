package c0c;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.impl.ui.redeem.RevPointsRedeemScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RevPointsRedeemScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(RevPointsRedeemScreen revPointsRedeemScreen, Continuation continuation) {
        super(2, continuation);
        this.v = revPointsRedeemScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d dVar;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.d();
        Intrinsics.h(model);
        s sVar = (s) lVarE3;
        sVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        c cVar = obj3 instanceof c ? (c) obj3 : null;
        if (cVar != null && (dVar = (d) sVar.f20227s.get(cVar.f20205a)) != null) {
            dVar.Z2(cVar);
        }
        return Unit.f186387a;
    }
}
