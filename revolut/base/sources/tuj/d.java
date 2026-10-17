package tuj;

import com.revolut.retail.feature.impl.travel_trips.data.network.TravelTripsService;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f274611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f274612x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ puj.f f274613y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(g gVar, String str, puj.f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f274611w = gVar;
        this.f274612x = str;
        this.f274613y = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f274611w, this.f274612x, this.f274613y, continuation, 0);
            default:
                return new d(this.f274611w, this.f274612x, this.f274613y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    TravelTripsService travelTripsService = this.f274611w.f274617a;
                    quj.c cVarB = ifk.b.B(this.f274613y);
                    this.v = 1;
                    if (travelTripsService.addCustomEvent(this.f274612x, cVarB, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    TravelTripsService travelTripsService2 = this.f274611w.f274617a;
                    quj.c cVarB2 = ifk.b.B(this.f274613y);
                    this.v = 1;
                    if (travelTripsService2.editCustomEvent(this.f274612x, cVarB2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
