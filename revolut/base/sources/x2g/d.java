package x2g;

import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import com.revolut.feature.travel.experiences.impl.ui.screen.pickup_details.TravelExperiencesPickupDetailsScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.a0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelExperiencesPickupDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TravelExperiencesPickupDetailsScreen travelExperiencesPickupDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelExperiencesPickupDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelExperiencesPickupDetailsScreen travelExperiencesPickupDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                travelExperiencesPickupDetailsScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) travelExperiencesPickupDetailsScreen.h3();
                List list = ((j) oVar.t2()).d;
                ArrayList arrayList = new ArrayList();
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    a0.x(((h3g.c) it8.next()).f149122c, arrayList);
                }
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                Iterator it9 = arrayList.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(((h3g.a) it9.next()).f149114a);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (!d0.W(((TravelExperiencesBookingQuestionAnswer) obj3).f92762b)) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayListF1 = zhm.d0.f1(oVar.f302564p.f93105b);
                for (Object obj4 : arrayList3) {
                    Iterator it10 = arrayListF1.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it10.hasNext()) {
                            i2 = -1;
                        } else if (!Intrinsics.f(((TravelExperiencesBookingQuestionAnswer) it10.next()).b(), ((TravelExperiencesBookingQuestionAnswer) obj4).b())) {
                            i2++;
                        }
                    }
                    if (i2 >= 0) {
                        arrayListF1.set(i2, obj4);
                    } else {
                        arrayListF1.add(obj4);
                    }
                }
                oVar.v2(new k(arrayListF1));
                break;
        }
        return Unit.f186387a;
    }
}
