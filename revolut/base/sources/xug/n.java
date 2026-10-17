package xug;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.review_closure_conditions.ReviewClosureConditionsBottomSheetController;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReviewClosureConditionsBottomSheetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ReviewClosureConditionsBottomSheetController reviewClosureConditionsBottomSheetController, Continuation continuation) {
        super(2, continuation);
        this.v = reviewClosureConditionsBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVarM3 = this.v.R2();
        Object obj3 = model.i;
        if (obj3 instanceof b) {
            qVarM3.H2(qVarM3.o, new sx4.b(obj3, 15));
        } else {
            qVarM3.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "ReviewClosureConditionsBottomSheetControllerModel", a0.d.m(obj3, "unsupported parcel="), null, null, 16);
        }
        return Unit.f186387a;
    }
}
