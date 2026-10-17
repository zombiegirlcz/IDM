package u37;

import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfileSchedule;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a f276810w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f276810w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                r rVar = new r(this.f276810w, continuation, 0);
                rVar.v = obj2;
                return rVar;
            default:
                r rVar2 = new r(this.f276810w, continuation, 1);
                rVar2.v = obj2;
                return rVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((r) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FreelancerTaxProfile freelancerTaxProfile;
        ds6.i iVar;
        FreelancerTaxProfile freelancerTaxProfile2;
        int i = this.u;
        com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a aVar = this.f276810w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVar = (l) data.getContent();
                ds6.a aVar3 = null;
                FreelancerTaxProfileSchedule freelancerTaxProfileSchedule = (lVar == null || (freelancerTaxProfile2 = lVar.f276799c) == null) ? null : freelancerTaxProfile2.f73476c;
                if (lVar != null && (iVar = lVar.f276797a) != null) {
                    aVar3 = iVar.f117240a;
                }
                aVar.H2(aVar.f74351x, new ard.t(freelancerTaxProfileSchedule, aVar3, data, (lVar == null || (freelancerTaxProfile = lVar.f276799c) == null) ? true : freelancerTaxProfile.d, 29));
                break;
            default:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                aVar.H2(aVar.f74351x, new tvc.i(data2, 20));
                break;
        }
        return Unit.f186387a;
    }
}
