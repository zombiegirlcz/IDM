package tz6;

import com.revolut.feature.freelancer.impl.ui.perks.details.FreelancerPerksDetailsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FreelancerPerksDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(FreelancerPerksDetailsScreen freelancerPerksDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = freelancerPerksDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            case 1:
                return new c(this.v, continuation, 1);
            default:
                return new c(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        String str2;
        int i = this.u;
        Continuation continuation = null;
        FreelancerPerksDetailsScreen freelancerPerksDetailsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o) freelancerPerksDetailsScreen.R2()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) freelancerPerksDetailsScreen.R2();
                ggc.l lVar = (ggc.l) ((h) ((j2) oVar.f275888r.f22677a).getValue()).f275876a.getContent();
                if (lVar != null && (str = lVar.f143640a) != null) {
                    oVar.l2(new n(oVar, str, continuation, 0), new yi5.b(26));
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar2 = (o) freelancerPerksDetailsScreen.R2();
                ggc.l lVar2 = (ggc.l) ((h) ((j2) oVar2.f275888r.f22677a).getValue()).f275876a.getContent();
                if (lVar2 != null && (str2 = lVar2.f143640a) != null) {
                    oVar2.l2(new n(oVar2, str2, continuation, 1), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
