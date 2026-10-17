package xpe;

import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.models.CountryRule;
import com.revolut.feature.tax_residency.impl.v2.models.Requirements;
import com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow.FatcaFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.TaxResidencyFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.TaxResidencyFlowContract$State;
import com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.TaxResidencyFlowContract$Step;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function1 {
    public int A;
    public final /* synthetic */ com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a B;
    public final /* synthetic */ Requirements.Step.Fatca C;
    public final /* synthetic */ int D;
    public final /* synthetic */ TaxResidencyFlowContract$State E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ BackNavigationType G;
    public com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a u;
    public Requirements.Step.Fatca v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TaxResidencyFlowContract$State f307940w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public BackNavigationType f307941x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f307942y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a aVar, Requirements.Step.Fatca fatca, int i, TaxResidencyFlowContract$State taxResidencyFlowContract$State, boolean z, BackNavigationType backNavigationType, Continuation continuation) {
        super(1, continuation);
        this.B = aVar;
        this.C = fatca;
        this.D = i;
        this.E = taxResidencyFlowContract$State;
        this.F = z;
        this.G = backNavigationType;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.B, this.C, this.D, this.E, this.F, this.G, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a aVar;
        Requirements.Step.Fatca fatca;
        int i;
        BackNavigationType backNavigationType;
        TaxResidencyFlowContract$State taxResidencyFlowContract$State;
        boolean z;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i2 = this.A;
        if (i2 == 0) {
            o.b(obj2);
            aVar = this.B;
            this.u = aVar;
            fatca = this.C;
            this.v = fatca;
            TaxResidencyFlowContract$State taxResidencyFlowContract$State2 = this.E;
            this.f307940w = taxResidencyFlowContract$State2;
            BackNavigationType backNavigationType2 = this.G;
            this.f307941x = backNavigationType2;
            i = this.D;
            this.f307942y = i;
            boolean z3 = this.F;
            this.z = z3;
            this.A = 1;
            aVar.getClass();
            Object objP2 = aVar.p2(this, new e(aVar, null, 2));
            if (objP2 == aVar2) {
                return aVar2;
            }
            backNavigationType = backNavigationType2;
            obj2 = objP2;
            taxResidencyFlowContract$State = taxResidencyFlowContract$State2;
            z = z3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z4 = this.z;
            i = this.f307942y;
            BackNavigationType backNavigationType3 = this.f307941x;
            TaxResidencyFlowContract$State taxResidencyFlowContract$State3 = this.f307940w;
            fatca = this.v;
            aVar = this.u;
            o.b(obj2);
            z = z4;
            taxResidencyFlowContract$State = taxResidencyFlowContract$State3;
            backNavigationType = backNavigationType3;
        }
        com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a aVar3 = aVar;
        List list = (List) obj2;
        int i3 = i;
        yki.i iVar = aVar3.u;
        boolean z6 = fatca.f90178a;
        TaxResidencyFlowContract$InputData taxResidencyFlowContract$InputData = aVar3.o;
        String str = taxResidencyFlowContract$InputData.f90289a;
        String str2 = taxResidencyFlowContract$InputData.f90290b.f90181c;
        Map map = taxResidencyFlowContract$State.f90292a;
        wi0.b.Companion.getClass();
        wi0.b bVar = wi0.b.f297770q3;
        CountryRule countryRule = (CountryRule) map.get(bVar);
        if (countryRule == null) {
            aVar3.I2("Rule for US is required for FATCA");
        } else {
            oki.h.t2(aVar3, iVar, new TaxResidencyFlowContract$Step.Fatca(new FatcaFlowContract$InputData(z6, str, str2, countryRule, com.revolut.feature.tax_residency.impl.v2.models.a.a(taxResidencyFlowContract$State.f90293b, bVar), list, taxResidencyFlowContract$InputData.d, backNavigationType), i3), z, null, false, 12);
        }
        return Unit.f186387a;
    }
}
