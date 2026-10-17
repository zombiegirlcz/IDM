package vwb;

import com.revolut.feature.rev_points.api.navigation.RevPointsOptInDestination;
import com.revolut.feature.rev_points.api.navigation.RevPointsOptInNextDestination;
import com.revolut.feature.rev_points.api.navigation.descriptor.LifestyleRevPointsOptInController$InputData;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ n u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Continuation continuation) {
        super(2, continuation);
        this.u = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        aub.a aVar2 = this.u.f292697r;
        LifestyleRevPointsOptInController$InputData inputData = new LifestyleRevPointsOptInController$InputData((RevPointsOptInSource) RevPointsOptInSource.GiftCard.f83991a, false, 6);
        fyb.a aVar3 = (fyb.a) aVar2;
        aVar3.getClass();
        RevPointsOptInNextDestination.GiftCardsHome nextDestination = RevPointsOptInNextDestination.GiftCardsHome.f83529a;
        Intrinsics.checkNotNullParameter(nextDestination, "nextDestination");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        aVar3.A2(new RevPointsOptInDestination(nextDestination, RevPointsOptInNextDestination.Default.f83526a, inputData));
        return Unit.f186387a;
    }
}
