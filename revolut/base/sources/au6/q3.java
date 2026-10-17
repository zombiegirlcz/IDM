package au6;

import androidx.room.util.DBUtil;
import com.revolut.feature.freelancer.common.models.tax_hub.FreelancerTaxProfile;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class q3 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r3 f9605w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q3(r3 r3Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f9605w = r3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                q3 q3Var = new q3(this.f9605w, continuation, 0);
                q3Var.v = obj2;
                return q3Var;
            default:
                q3 q3Var2 = new q3(this.f9605w, continuation, 1);
                q3Var2.v = obj2;
                return q3Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q3) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        r3 r3Var = this.f9605w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                os6.d dVar = r3Var.f9614c;
                ps6.i iVar = (ps6.i) DBUtil.performBlocking(dVar.f229246a, true, false, new ood.k(dVar, str, 23));
                if (iVar == null) {
                    return null;
                }
                FreelancerTaxProfile freelancerTaxProfileA = bu6.f.a(iVar);
                od0.i.Companion.getClass();
                return od0.h.a(freelancerTaxProfileA);
            default:
                String str2 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                wt6.e eVar = (wt6.e) wp5.y.t(wt6.e.class, r3Var.d, j6.a.q("freelancer:taxProfile:taxCalendarEvents:eventVatSummary:", str2));
                if (eVar != null) {
                    return bu6.f.e(eVar);
                }
                return null;
        }
    }
}
