package fb6;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.DonateWithPointsContract$ModalStep;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.DonateWithPointsScreen;
import com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donationbreakdown.DonationBreakdownContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DonateWithPointsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(DonateWithPointsScreen donateWithPointsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = donateWithPointsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        l lVar = new l(this.v, continuation);
        lVar.u = obj2;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((TextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextDelegate.Model model = (TextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        i iVar = (i) this.v.T.getValue();
        Object obj3 = model.f53534g;
        com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a aVar2 = (com.revolut.feature.donations.impl.ui.kompot.bottomsheet.donatewithpoints.a) iVar;
        if (obj3 instanceof qa6.f) {
            qa6.f fVar = (qa6.f) obj3;
            oki.h.v2(aVar2.u, new DonateWithPointsContract$ModalStep.Breakdown(new DonationBreakdownContract$InputData(fVar.f243969b, fVar.f243968a)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            aVar2.getClass();
        }
        return Unit.f186387a;
    }
}
