package h1g;

import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingContactDetails;
import do3.n;
import gim.i;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.experiences.impl.ui.flow.checkout.a f148570w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.feature.travel.experiences.impl.ui.flow.checkout.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f148570w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f148570w, continuation, 0);
                gVar.v = obj2;
                return gVar;
            default:
                g gVar2 = new g(this.f148570w, continuation, 1);
                gVar2.v = obj2;
                return gVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.travel.experiences.impl.ui.flow.checkout.a aVar = this.f148570w;
        switch (i) {
            case 0:
                n nVar = (n) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = aVar.f92973w;
                d dVar = hVar.f148571a;
                TravelExperiencesBookingContactDetails travelExperiencesBookingContactDetails = dVar.f148558c;
                String firstName = nVar.f116410c;
                String userEmail = "";
                if (firstName == null) {
                    m70.a.c(t0.f186434a);
                    firstName = "";
                }
                String lastName = nVar.e;
                if (lastName == null) {
                    m70.a.c(t0.f186434a);
                    lastName = "";
                }
                String userPhone = nVar.i;
                String str = nVar.f116411g;
                if (str == null) {
                    m70.a.c(t0.f186434a);
                } else {
                    userEmail = str;
                }
                travelExperiencesBookingContactDetails.getClass();
                Intrinsics.checkNotNullParameter(firstName, "firstName");
                Intrinsics.checkNotNullParameter(lastName, "lastName");
                Intrinsics.checkNotNullParameter(userPhone, "userPhone");
                Intrinsics.checkNotNullParameter(userEmail, "userEmail");
                d dVarA = d.a(dVar, null, null, new TravelExperiencesBookingContactDetails(firstName, lastName, userPhone, userEmail), null, null, null, null, null, null, null, null, null, null, 16379);
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                hVar.f148571a = dVarA;
                break;
            default:
                Pair pair = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                io3.d dVar2 = (io3.d) pair.f186385a;
                xi0.b bVar = (xi0.b) pair.f186386b;
                h hVar2 = aVar.f92973w;
                d dVarA2 = d.a(hVar2.f148571a, null, null, null, dVar2, bVar, null, null, null, null, null, null, null, null, 16359);
                Intrinsics.checkNotNullParameter(dVarA2, "<set-?>");
                hVar2.f148571a = dVarA2;
                break;
        }
        return Unit.f186387a;
    }
}
