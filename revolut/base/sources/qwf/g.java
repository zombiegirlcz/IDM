package qwf;

import com.revolut.feature.transport.impl.ui.transit_checkout.TransitCheckoutScreen;
import com.revolut.feature.transport.models.fields.TransportCheckoutField;
import com.revolut.feature.transport.models.transit.TransitTicketRevPointOption;
import ip0.cl0;
import ip0.vd;
import java.time.LocalDate;
import java.time.LocalTime;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransitCheckoutScreen f249915w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(TransitCheckoutScreen transitCheckoutScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f249915w = transitCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f249915w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f249915w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
            default:
                g gVar3 = new g(this.f249915w, continuation, 2);
                gVar3.v = obj2;
                return gVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((TransitTicketRevPointOption) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransitCheckoutScreen transitCheckoutScreen = this.f249915w;
        switch (i) {
            case 0:
                vd vdVar = (vd) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVarH3 = transitCheckoutScreen.T2();
                LocalDate date = vdVar.f166807b;
                Object obj3 = vdVar.f166806a.f54192n;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.transport.models.fields.TransportCheckoutField");
                TransportCheckoutField field = (TransportCheckoutField) obj3;
                z zVar = (z) qVarH3;
                zVar.getClass();
                Intrinsics.checkNotNullParameter(date, "date");
                Intrinsics.checkNotNullParameter(field, "field");
                zVar.f249941s.b3(date, field);
                break;
            case 1:
                Pair pair = (Pair) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cl0 cl0Var = (cl0) pair.f186385a;
                LocalTime time = (LocalTime) pair.f186386b;
                q qVarH32 = transitCheckoutScreen.T2();
                Object obj4 = cl0Var.d;
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.transport.models.fields.TransportCheckoutField");
                TransportCheckoutField field2 = (TransportCheckoutField) obj4;
                z zVar2 = (z) qVarH32;
                zVar2.getClass();
                Intrinsics.checkNotNullParameter(time, "time");
                Intrinsics.checkNotNullParameter(field2, "field");
                zVar2.f249941s.g3(time, field2);
                break;
            default:
                TransitTicketRevPointOption parcel = (TransitTicketRevPointOption) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                z zVar3 = (z) transitCheckoutScreen.T2();
                zVar3.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                zVar3.x2(new qtb.c(parcel, 11));
                break;
        }
        return Unit.f186387a;
    }
}
