package ieg;

import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsRoomsInformation;
import com.revolut.feature_travel_hotels_models.property.room.BedOption;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoomOccupancyRatesSelection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class x extends gim.i implements Function2 {
    public HotelsPropertyRoomOccupancyRatesSelection u;
    public BedOption v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f160739w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ nag.b f160740x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b f160741y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b bVar, Continuation continuation, nag.b bVar2) {
        super(2, continuation);
        this.f160740x = bVar2;
        this.f160741y = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x(this.f160741y, continuation, this.f160740x);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        HotelsPropertyRoomOccupancyRatesSelection hotelsPropertyRoomOccupancyRatesSelection;
        BedOption bedOption;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f160739w;
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b bVar = this.f160741y;
        if (i == 0) {
            yhm.o.b(obj2);
            hotelsPropertyRoomOccupancyRatesSelection = this.f160740x.f213902a;
            BedOption bedOption2 = (BedOption) zhm.d0.b0(hotelsPropertyRoomOccupancyRatesSelection.f98106c.f98113b);
            pfm.h hVar = new pfm.h(bVar.I2(hotelsPropertyRoomOccupancyRatesSelection, bedOption2), 4);
            Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
            this.u = hotelsPropertyRoomOccupancyRatesSelection;
            this.v = bedOption2;
            this.f160739w = 1;
            if (nim.a.a(hVar, this) == aVar) {
                return aVar;
            }
            bedOption = bedOption2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bedOption = this.v;
            hotelsPropertyRoomOccupancyRatesSelection = this.u;
            yhm.o.b(obj2);
        }
        bVar.C2(new o(hotelsPropertyRoomOccupancyRatesSelection, hotelsPropertyRoomOccupancyRatesSelection.b(), new TravelHotelsRoomsInformation(hotelsPropertyRoomOccupancyRatesSelection.f98104a.f98098a, bedOption.f98087a, hotelsPropertyRoomOccupancyRatesSelection.f98105b.f98115a, v04.b.M(hotelsPropertyRoomOccupancyRatesSelection.f98106c.f98112a))));
        return Unit.f186387a;
    }
}
