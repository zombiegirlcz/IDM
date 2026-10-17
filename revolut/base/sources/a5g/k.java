package a5g;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.flights.models.domain.booking.BookingStatus;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.flights.impl.ui.screen.booking_details.a f1390w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, com.revolut.feature.travel.flights.impl.ui.screen.booking_details.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f1390w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                k kVar = new k(0, this.f1390w, continuation);
                kVar.v = obj2;
                return kVar;
            default:
                k kVar2 = new k(1, this.f1390w, continuation);
                kVar2.v = obj2;
                return kVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((k) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((k) create((BookingStatus) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.travel.flights.impl.ui.screen.booking_details.a aVar = this.f1390w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.f93281r, new a07.l(data, 9));
                break;
            default:
                BookingStatus bookingStatus = (BookingStatus) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                aVar.H2(aVar.f93281r, new a0.c(bookingStatus, 25));
                break;
        }
        return Unit.f186387a;
    }
}
