package hbg;

import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new y(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((y) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.bookings.details.b bVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ufm.i iVarA = com.revolut.feature.rev_points.api.navigation.a.a(bVar.F, RevPointsOptInSource.Stays.f84006a);
            this.u = 1;
            obj2 = nim.a.b(iVarA, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        FeatureCommand featureCommand = (FeatureCommand) obj2;
        Intrinsics.h(featureCommand);
        return bVar.C1(new BridgeDestination(featureCommand));
    }
}
