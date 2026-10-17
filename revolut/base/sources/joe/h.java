package joe;

import com.revolut.feature.tax_residency.impl.services.TaxResidencyService;
import com.revolut.feature.tax_residency.impl.v2.models.DeclaredTaxResidency;
import com.revolut.feature.tax_residency.impl.v2.models.ExemptionReason;
import com.revolut.feature.tax_residency.impl.v2.models.TaxResidencyFlowContext;
import com.revolut.shared.feature.workflow.engine.api.models.WorkflowStepConfiguration;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function3 {
    public int u;
    public /* synthetic */ TaxResidencyFlowContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f176937w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(o oVar, Continuation continuation) {
        super(3, continuation);
        this.f176937w = oVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        h hVar = new h(this.f176937w, (Continuation) obj4);
        hVar.v = (TaxResidencyFlowContext) obj3;
        return hVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object declaredTaxResidencies;
        ExemptionReason exemptionReason;
        kpe.b bVar;
        kpe.b bVar2;
        ExemptionReason exemptionReason2;
        TaxResidencyFlowContext taxResidencyFlowContext = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            TaxResidencyService taxResidencyService = this.f176937w.f176939a;
            String str = taxResidencyFlowContext.f90179a;
            WorkflowStepConfiguration.Screen.TaxResidenciesCollection.ProductConfigurationKey productConfigurationKey = taxResidencyFlowContext.f90180b;
            String str2 = productConfigurationKey.f105555b;
            String str3 = productConfigurationKey.f105556c;
            String str4 = productConfigurationKey.f105554a.f297794a;
            String str5 = productConfigurationKey.d;
            String str6 = taxResidencyFlowContext.f90181c;
            this.v = null;
            this.u = 1;
            declaredTaxResidencies = taxResidencyService.getDeclaredTaxResidencies(str, str2, str3, str4, str5, str6, this);
            if (declaredTaxResidencies == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            declaredTaxResidencies = obj2;
        }
        Iterable<ioe.d> iterable = (Iterable) declaredTaxResidencies;
        ArrayList arrayList = new ArrayList(w.t(iterable, 10));
        for (ioe.d dVar : iterable) {
            Object obj3 = a.f176928a;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            wi0.a aVar2 = wi0.b.Companion;
            String country = dVar.getCountry();
            aVar2.getClass();
            wi0.b bVarA = wi0.a.a(country);
            Boolean isResident = dVar.getIsResident();
            String exemption = dVar.getExemption();
            int i2 = 0;
            if (exemption != null) {
                ExemptionReason[] exemptionReasonArrValues = ExemptionReason.values();
                int length = exemptionReasonArrValues.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        exemptionReason2 = null;
                        break;
                    }
                    exemptionReason2 = exemptionReasonArrValues[i3];
                    if (a0.z(exemptionReason2.name(), exemption, true)) {
                        break;
                    }
                    i3++;
                }
                exemptionReason = exemptionReason2;
            } else {
                exemptionReason = null;
            }
            String status = dVar.getStatus();
            if (status != null) {
                kpe.b[] bVarArrValues = kpe.b.values();
                int length2 = bVarArrValues.length;
                while (true) {
                    if (i2 >= length2) {
                        bVar2 = null;
                        break;
                    }
                    bVar2 = bVarArrValues[i2];
                    if (a0.z(bVar2.name(), status, true)) {
                        break;
                    }
                    i2++;
                }
                bVar = bVar2;
            } else {
                bVar = null;
            }
            arrayList.add(new DeclaredTaxResidency(bVarA, isResident, exemptionReason, bVar, dVar.getStatusTitle(), dVar.getModifiable(), dVar.getDeletable(), dVar.getTinValue()));
        }
        return arrayList;
    }
}
