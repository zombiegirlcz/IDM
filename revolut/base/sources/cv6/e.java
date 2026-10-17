package cv6;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.FreelancerAcquiringPaymentFiltersScreen;
import cul.n2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerAcquiringPaymentFiltersScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FreelancerAcquiringPaymentFiltersScreen freelancerAcquiringPaymentFiltersScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerAcquiringPaymentFiltersScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        String id10 = model.f52708a;
        Object obj3 = model.f52715m;
        com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.a aVar2 = (com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.a) lVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        switch (id10.hashCode()) {
            case -1443309464:
                if (id10.equals("ITEM_ID_DATE_RANGE_HEADER")) {
                    aVar2.H2(aVar2.f73726t, new n2(15));
                }
                break;
            case -631270397:
                if (id10.equals("ITEM_ID_CURRENCY_HEADER")) {
                    aVar2.I2(new n2(13), new n2(14), obj3);
                }
                break;
            case -224427262:
                if (id10.equals("ITEM_ID_STATUS_HEADER")) {
                    aVar2.I2(new n2(6), new n2(7), obj3);
                }
                break;
            case 1466737818:
                if (id10.equals("ITEM_ID_PAYMENT_METHOD_HEADER")) {
                    aVar2.I2(new n2(8), new n2(9), obj3);
                }
                break;
        }
        return Unit.f186387a;
    }
}
