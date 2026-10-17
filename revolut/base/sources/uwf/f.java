package uwf;

import com.revolut.feature.transport.impl.ui.transit_checkout.passenger_details.PassengerDetailsScreen;
import com.revolut.feature.transport.models.fields.TransportCheckoutField;
import ip0.vd;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ PassengerDetailsScreen f283657w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(PassengerDetailsScreen passengerDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f283657w = passengerDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f283657w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f283657w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((ruf.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        PassengerDetailsScreen passengerDetailsScreen = this.f283657w;
        switch (i) {
            case 0:
                ruf.e eVar = (ruf.e) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE3 = passengerDetailsScreen.e3();
                ruf.e model = new ruf.e(eVar.f257546a, eVar.f257547b);
                l lVar = (l) jVarE3;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                lVar.o.f3(model);
                break;
            default:
                vd vdVar = (vd) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE32 = passengerDetailsScreen.e3();
                LocalDate date = vdVar.f166807b;
                Object obj3 = vdVar.f166806a.f54192n;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.transport.models.fields.TransportCheckoutField");
                TransportCheckoutField field = (TransportCheckoutField) obj3;
                l lVar2 = (l) jVarE32;
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullParameter(field, "field");
                lVar2.o.b3(date, field);
                break;
        }
        return Unit.f186387a;
    }
}
