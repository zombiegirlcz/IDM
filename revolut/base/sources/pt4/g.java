package pt4;

import com.revolut.feature.credit.card.impl.ui.limit_hub.limit_increase_preference.CreditCardLimitIncreasePreferenceController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CreditCardLimitIncreasePreferenceController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(CreditCardLimitIncreasePreferenceController creditCardLimitIncreasePreferenceController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = creditCardLimitIncreasePreferenceController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            default:
                return new g(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CreditCardLimitIncreasePreferenceController creditCardLimitIncreasePreferenceController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((h) creditCardLimitIncreasePreferenceController.R.getValue()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) creditCardLimitIncreasePreferenceController.R.getValue();
                xp3.d dVar = ((a) ((j2) hVar.f239611q.f22677a).getValue()).f239600b;
                if (dVar != null) {
                    hVar.n2(new pnf.f(hVar, dVar, null, 12), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
