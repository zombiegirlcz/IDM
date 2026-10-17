package k8c;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.revolutpay.impl.ui.bottom_sheet.ramp_fees.RampFeesExplainerScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RampFeesExplainerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RampFeesExplainerScreen rampFeesExplainerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = rampFeesExplainerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = (b) this.v.T.getValue();
        String id10 = model.f52613a;
        g gVar = (g) bVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        if (Intrinsics.f(id10, "ID_GOT_IT_BUTTON")) {
            gVar.B2();
        }
        return Unit.f186387a;
    }
}
