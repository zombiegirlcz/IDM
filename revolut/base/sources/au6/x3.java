package au6;

import androidx.room.util.DBUtil;
import com.revolut.feature.freelancer.common.models.vat_reminders.FreelancerVatSummary;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x3 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y3 f9661w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x3(y3 y3Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f9661w = y3Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x3 x3Var = new x3(this.f9661w, continuation, 0);
                x3Var.v = obj2;
                return x3Var;
            default:
                x3 x3Var2 = new x3(this.f9661w, continuation, 1);
                x3Var2.v = obj2;
                return x3Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((x3) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        y3 y3Var = this.f9661w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                os6.f fVar = y3Var.e;
                ps6.o oVar = (ps6.o) DBUtil.performBlocking(fVar.f229251a, true, false, new ood.k(fVar, str, 27));
                FreelancerVatSummary.TaxRateSummary taxRateSummary = null;
                com.revolut.feature.freelancer.common.models.vat_reminders.a aVar2 = null;
                if (oVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(oVar, "<this>");
                String str2 = oVar.f239423a;
                fs6.b bVarA = bu6.h.a(oVar.f239424b);
                ps6.k kVar = oVar.f239425c;
                ps6.m mVar = kVar.f239414a;
                long j2 = mVar.f239419a;
                xi0.a aVar3 = xi0.b.Companion;
                String str3 = mVar.f239420b;
                aVar3.getClass();
                FreelancerVatSummary.TotalSalesSummary totalSalesSummary = new FreelancerVatSummary.TotalSalesSummary(new dj0.d(j2, xi0.a.a(str3)));
                ps6.l lVar = kVar.f239415b;
                if (lVar != null) {
                    String str4 = lVar.f239417a;
                    com.revolut.feature.freelancer.common.models.vat_reminders.a[] aVarArrValues = com.revolut.feature.freelancer.common.models.vat_reminders.a.values();
                    int length = aVarArrValues.length;
                    while (true) {
                        if (i2 < length) {
                            com.revolut.feature.freelancer.common.models.vat_reminders.a aVar4 = aVarArrValues[i2];
                            if (kotlin.text.a0.z(aVar4.name(), str4, true)) {
                                aVar2 = aVar4;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (aVar2 == null) {
                        aVar2 = com.revolut.feature.freelancer.common.models.vat_reminders.a.UNKNOWN;
                    }
                    taxRateSummary = new FreelancerVatSummary.TaxRateSummary(aVar2, lVar.f239418b);
                }
                ps6.n nVar = kVar.f239416c;
                long j3 = nVar.f239421a;
                xi0.a aVar5 = xi0.b.Companion;
                String str5 = nVar.f239422b;
                aVar5.getClass();
                return new FreelancerVatSummary(str2, bVarA, new FreelancerVatSummary.Summary(totalSalesSummary, taxRateSummary, new FreelancerVatSummary.TotalTaxSummary(new dj0.d(j3, xi0.a.a(str5)))), oVar.d);
            default:
                String str6 = (String) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y3Var.f9668b.remove("MEMORY_CACHE_KEY_VAT_SUMMARY_" + str6);
                DBUtil.performBlocking(y3Var.e.f229251a, false, true, new om4.t3(str6, 7));
                return Unit.f186387a;
        }
    }
}
