package tx5;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.cryptocommodity_invest.impl.ui.activities.crypto.ui.trade.trending.timeframe.TimeframePickerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tx0.p4;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TimeframePickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TimeframePickerScreen timeframePickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = timeframePickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.M.getValue();
        Intrinsics.h(model);
        h hVar = (h) fVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f;
        cw5.e eVar = obj3 instanceof cw5.e ? (cw5.e) obj3 : null;
        if (eVar != null) {
            hVar.H2(hVar.o, new p4(eVar, 1));
            hVar.C2(new e(eVar));
        }
        return Unit.f186387a;
    }
}
