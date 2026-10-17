package b47;

import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfileSchedule;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f12193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ FreelancerTaxProfile f12194x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f12195y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, FreelancerTaxProfile freelancerTaxProfile, boolean z, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f12193w = hVar;
        this.f12194x = freelancerTaxProfile;
        this.f12195y = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f12193w, this.f12194x, this.f12195y, continuation, 0);
            default:
                return new g(this.f12193w, this.f12194x, this.f12195y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                h hVar = this.f12193w;
                if (i == 0) {
                    o.b(obj2);
                    r10.f fVar = hVar.o;
                    FreelancerTaxProfile freelancerTaxProfile = this.f12194x;
                    String str = freelancerTaxProfile.f73474a;
                    FreelancerTaxProfileSchedule freelancerTaxProfileSchedule = freelancerTaxProfile.f73476c;
                    this.v = 1;
                    if (fVar.y0(str, freelancerTaxProfileSchedule, this.f12195y, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                hVar.C2(hr6.g.f154780a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    h hVar2 = this.f12193w;
                    g gVar = new g(hVar2, this.f12194x, this.f12195y, null, 0);
                    this.v = 1;
                    if (hVar2.p2(this, gVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
