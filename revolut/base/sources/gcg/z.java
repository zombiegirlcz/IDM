package gcg;

import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.feature_travel_hotels_models.campaign.TravelHotelsCampaign;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class z extends gim.i implements Function1 {
    public final /* synthetic */ BigTileDelegate.Model u;
    public final /* synthetic */ e0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(BigTileDelegate.Model model, e0 e0Var, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new z(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((z) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = this.u.f51742s;
        if (obj3 instanceof TravelHotelsCampaign) {
            this.v.C2(new o((TravelHotelsCampaign) obj3));
        }
        return Unit.f186387a;
    }
}
