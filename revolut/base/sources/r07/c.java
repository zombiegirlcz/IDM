package r07;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.freelancer.impl.ui.profile.tax.screen.dates.FreelancerTaxDatesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FreelancerTaxDatesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FreelancerTaxDatesScreen freelancerTaxDatesScreen, Continuation continuation) {
        super(2, continuation);
        this.v = freelancerTaxDatesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FreelancerTaxProfile freelancerTaxProfile;
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.P.getValue();
        Object obj3 = model.u;
        if (obj3 instanceof ds6.j) {
            f fVar = (f) ((d) ((j2) hVar.f250719t.f22677a).getValue()).f250708a.getContent();
            hVar.C2(new e((ds6.j) obj3, (fVar == null || (freelancerTaxProfile = (FreelancerTaxProfile) fVar.f250712b.get(obj3)) == null) ? null : freelancerTaxProfile.f73474a));
        } else {
            hVar.getClass();
        }
        return Unit.f186387a;
    }
}
