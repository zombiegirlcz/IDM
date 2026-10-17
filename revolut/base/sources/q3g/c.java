package q3g;

import aqd.o1;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAgeBand;
import com.revolut.feature.travel.experiences.impl.ui.screen.selection.visitors.TravelExperiencesVisitorsSelectionScreen;
import gim.i;
import ip0.u8;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelExperiencesVisitorsSelectionScreen f241964w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelExperiencesVisitorsSelectionScreen travelExperiencesVisitorsSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f241964w = travelExperiencesVisitorsSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f241964w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f241964w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        u8 u8Var = (u8) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(u8Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int iIntValue;
        int i = this.u;
        TravelExperiencesVisitorsSelectionScreen travelExperiencesVisitorsSelectionScreen = this.f241964w;
        switch (i) {
            case 0:
                u8 u8Var = (u8) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVar = (g) travelExperiencesVisitorsSelectionScreen.f93169d0.getValue();
                Object obj3 = u8Var.k;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAgeBand");
                TravelExperienceAgeBand ageBand = (TravelExperienceAgeBand) obj3;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(ageBand, "ageBand");
                Map map = ((d) gVar.t2()).f241966b.f92916a;
                myf.b bVar = ageBand.f92783a;
                Integer num = (Integer) map.get(bVar);
                iIntValue = num != null ? num.intValue() : 0;
                if (iIntValue < ageBand.f) {
                    gVar.x2(new o1(((d) gVar.t2()).f241966b.f92916a.containsKey(bVar) ? foh.i.w(bVar, Integer.valueOf(iIntValue + 1), ((d) gVar.t2()).f241966b.f92916a) : r0.q(((d) gVar.t2()).f241966b.f92916a, new Pair(bVar, 1)), 18));
                }
                break;
            default:
                u8 u8Var2 = (u8) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVar2 = (g) travelExperiencesVisitorsSelectionScreen.f93169d0.getValue();
                Object obj4 = u8Var2.k;
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceAgeBand");
                TravelExperienceAgeBand ageBand2 = (TravelExperienceAgeBand) obj4;
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(ageBand2, "ageBand");
                Map map2 = ((d) gVar2.t2()).f241966b.f92916a;
                myf.b bVar2 = ageBand2.f92783a;
                Integer num2 = (Integer) map2.get(bVar2);
                iIntValue = num2 != null ? num2.intValue() : 0;
                if (iIntValue > ageBand2.e) {
                    gVar2.x2(new o1((!((d) gVar2.t2()).f241966b.f92916a.containsKey(bVar2) || iIntValue == 1) ? r0.l(bVar2, ((d) gVar2.t2()).f241966b.f92916a) : foh.i.w(bVar2, Integer.valueOf(iIntValue - 1), ((d) gVar2.t2()).f241966b.f92916a), 19));
                }
                break;
        }
        return Unit.f186387a;
    }
}
