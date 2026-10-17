package ewh;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature_autoinvest_ui_api.navigation.AutoInvestMoveControllerApi$Result;
import com.revolut.feature_autoinvest_ui_impl.ui.move.AutoInvestMoveController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AutoInvestMoveController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AutoInvestMoveController autoInvestMoveController, Continuation continuation) {
        super(2, continuation);
        this.v = autoInvestMoveController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVar = (i) this.v.P.getValue();
        Intrinsics.h(model);
        v vVar = (v) iVar;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f52613a, "MOVE_BUTTON_ID")) {
            yvh.b bVar = vVar.o.f96624a;
            if (bVar.e == yvh.h.LOYALTY_PROFILE) {
                vVar.n2(new ewa.d(vVar, null, 1), new whi.b(6));
            } else {
                vVar.C2(new AutoInvestMoveControllerApi$Result.Move(bVar));
            }
        } else {
            vVar.C2(AutoInvestMoveControllerApi$Result.Cancel.f96622a);
        }
        return Unit.f186387a;
    }
}
