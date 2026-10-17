package fb6;

import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.DonateWithPointsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DonateWithPointsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(DonateWithPointsScreen donateWithPointsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = donateWithPointsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((AttributeSelectorSmallDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AttributeSelectorSmallDelegate.Model model = (AttributeSelectorSmallDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVar = (i) this.v.T.getValue();
        Object obj3 = model.f51674g;
        com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a aVar2 = (com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a) iVar;
        if (obj3 instanceof Integer) {
            aVar2.H2(aVar2.f72003t, new av8.o(obj3, 17));
        } else {
            aVar2.getClass();
        }
        return Unit.f186387a;
    }
}
