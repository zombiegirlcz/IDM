package mic;

import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.feature.rewards.impl.ui.details.screen.PerkDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PerkDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PerkDetailsScreen perkDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = perkDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CounterTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CounterTextDelegate.Model model = (CounterTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f52159a;
        Object obj3 = model.f52164j;
        if (Intrinsics.f(str, "PROMO_CODE_ITEM_ID") && (obj3 instanceof String)) {
            String promoCode = (String) obj3;
            g0 g0Var = (g0) this.v.R2();
            g0Var.getClass();
            Intrinsics.checkNotNullParameter(promoCode, "promoCode");
            g0Var.C2(new l(promoCode));
        }
        return Unit.f186387a;
    }
}
