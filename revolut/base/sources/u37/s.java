package u37;

import au6.r3;
import cli.y;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfileSchedule;
import com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.TaxHubCreateProfileScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a f276811w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f276811w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f276811w, continuation, 0);
            default:
                return new s(this.f276811w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((s) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.freelancer.impl.ui.tax_hub.profile.create.a aVar = this.f276811w;
        switch (i) {
            case 0:
                TaxHubCreateProfileScreenContract$InputData taxHubCreateProfileScreenContract$InputData = aVar.v;
                r10.f fVar = aVar.f74345p;
                y yVar = aVar.f74351x;
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ds6.a aVar2 = ((g) ((j2) yVar.f22677a).getValue()).f276794c;
                    if (aVar2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    FreelancerTaxProfileSchedule freelancerTaxProfileSchedule = new FreelancerTaxProfileSchedule(aVar2, ((g) ((j2) yVar.f22677a).getValue()).d, ((g) ((j2) yVar.f22677a).getValue()).e);
                    l lVar = (l) ((g) ((j2) yVar.f22677a).getValue()).f276792a.getContent();
                    FreelancerTaxProfile freelancerTaxProfile = lVar != null ? lVar.f276799c : null;
                    if (freelancerTaxProfile != null) {
                        String str = freelancerTaxProfile.f73474a;
                        boolean z = ((g) ((j2) yVar.f22677a).getValue()).f;
                        this.v = 1;
                        if (fVar.y0(str, freelancerTaxProfileSchedule, z, this) == obj3) {
                            return obj3;
                        }
                    } else {
                        ds6.c cVar = new ds6.c(taxHubCreateProfileScreenContract$InputData.f74340c, freelancerTaxProfileSchedule);
                        this.v = 2;
                        r3 r3Var = (r3) fVar.b;
                        r3Var.getClass();
                        ald.l lVar2 = new ald.l(r3Var, cVar, continuation, 25);
                        p0 p0Var = p0.f264001a;
                        Object objJ = e0.J(elm.f.f127540b, lVar2, this);
                        if (objJ != obj3) {
                            objJ = Unit.f186387a;
                        }
                        if (objJ != obj3) {
                            objJ = Unit.f186387a;
                        }
                        if (objJ == obj3) {
                            return obj3;
                        }
                    }
                } else {
                    if (i2 != 1 && i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar.C2(new i(taxHubCreateProfileScreenContract$InputData.f74340c));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                s sVar = new s(aVar, continuation, 0);
                this.v = 1;
                Object objB = pu7.a.B(aVar.k, "submit_tax_profile", sVar, this);
                return objB == aVar3 ? aVar3 : objB;
        }
    }
}
