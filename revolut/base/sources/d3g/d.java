package d3g;

import com.revolut.feature.travel.experiences.api.models.booking.TravelExperiencesBookingQuestionAnswer;
import com.revolut.feature.travel.experiences.impl.ui.screen.questions.TravelExperienceQuestionsScreen;
import com.revolut.feature.travel.experiences.impl.ui.screen.questions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelExperienceQuestionsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(TravelExperienceQuestionsScreen travelExperienceQuestionsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelExperienceQuestionsScreen;
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
        aii.r c0563a;
        int i = this.u;
        TravelExperienceQuestionsScreen travelExperienceQuestionsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                travelExperienceQuestionsScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.travel.experiences.impl.ui.screen.questions.b bVar = (com.revolut.feature.travel.experiences.impl.ui.screen.questions.b) travelExperienceQuestionsScreen.i3();
                int i2 = d0.f111113a[((k) bVar.t2()).f111120a.ordinal()];
                if (i2 == 1) {
                    List list = ((k) bVar.t2()).e;
                    ArrayList arrayList = new ArrayList();
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        zhm.a0.x(((h3g.c) it8.next()).f149122c, arrayList);
                    }
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                    Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        arrayList2.add(((h3g.a) it9.next()).f149114a);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : arrayList2) {
                        if (!kotlin.text.d0.W(((TravelExperiencesBookingQuestionAnswer) obj3).f92762b)) {
                            arrayList3.add(obj3);
                        }
                    }
                    c0563a = new a.C0563a(arrayList3);
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list2 = ((k) bVar.t2()).e;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it10 = list2.iterator();
                    while (it10.hasNext()) {
                        zhm.a0.x(((h3g.c) it10.next()).f149122c, arrayList4);
                    }
                    ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                    Iterator it11 = arrayList4.iterator();
                    while (it11.hasNext()) {
                        arrayList5.add(((h3g.a) it11.next()).f149114a);
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj4 : arrayList5) {
                        if (!kotlin.text.d0.W(((TravelExperiencesBookingQuestionAnswer) obj4).f92762b)) {
                            arrayList6.add(obj4);
                        }
                    }
                    c0563a = new l(arrayList6, ((k) bVar.t2()).f111123g, ((k) bVar.t2()).f111124h);
                }
                bVar.v2(c0563a);
                return Unit.f186387a;
        }
    }
}
