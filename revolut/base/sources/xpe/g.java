package xpe;

import com.revolut.feature.tax_residency.api.BackNavigationType;
import com.revolut.feature.tax_residency.impl.v2.models.Requirements;
import com.revolut.feature.tax_residency.impl.v2.models.TaxResidencyFlowContext;
import com.revolut.feature.tax_residency.impl.v2.ui.crs_flow.CrsFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.TaxResidencyFlowContract$InputData;
import com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.TaxResidencyFlowContract$State;
import com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.TaxResidencyFlowContract$Step;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function1 {
    public int A;
    public final /* synthetic */ com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a B;
    public final /* synthetic */ Requirements.Step.Crs C;
    public final /* synthetic */ int D;
    public final /* synthetic */ TaxResidencyFlowContract$State E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ BackNavigationType G;
    public com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a u;
    public Requirements.Step.Crs v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TaxResidencyFlowContract$State f307943w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public BackNavigationType f307944x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f307945y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a aVar, Requirements.Step.Crs crs, int i, TaxResidencyFlowContract$State taxResidencyFlowContract$State, boolean z, BackNavigationType backNavigationType, Continuation continuation) {
        super(1, continuation);
        this.B = aVar;
        this.C = crs;
        this.D = i;
        this.E = taxResidencyFlowContract$State;
        this.F = z;
        this.G = backNavigationType;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g(this.B, this.C, this.D, this.E, this.F, this.G, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.tax_residency.impl.v2.ui.tax_residency_flow.a aVar;
        Requirements.Step.Crs crs;
        TaxResidencyFlowContract$State taxResidencyFlowContract$State;
        Object objP2;
        BackNavigationType backNavigationType;
        int i;
        boolean z;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i2 = this.A;
        if (i2 == 0) {
            o.b(obj2);
            aVar = this.B;
            this.u = aVar;
            crs = this.C;
            this.v = crs;
            taxResidencyFlowContract$State = this.E;
            this.f307943w = taxResidencyFlowContract$State;
            BackNavigationType backNavigationType2 = this.G;
            this.f307944x = backNavigationType2;
            int i3 = this.D;
            this.f307945y = i3;
            boolean z3 = this.F;
            this.z = z3;
            this.A = 1;
            aVar.getClass();
            objP2 = aVar.p2(this, new e(aVar, null, 2));
            if (objP2 == aVar2) {
                return aVar2;
            }
            backNavigationType = backNavigationType2;
            i = i3;
            z = z3;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z4 = this.z;
            i = this.f307945y;
            BackNavigationType backNavigationType3 = this.f307944x;
            taxResidencyFlowContract$State = this.f307943w;
            crs = this.v;
            aVar = this.u;
            o.b(obj2);
            z = z4;
            backNavigationType = backNavigationType3;
            objP2 = obj2;
        }
        yki.i iVar = aVar.u;
        wi0.b bVar = crs.f90172a;
        boolean z6 = crs.f90173b;
        Map map = taxResidencyFlowContract$State.f90292a;
        Map map2 = taxResidencyFlowContract$State.f90293b;
        ArrayList arrayList = crs.f90174c;
        TaxResidencyFlowContract$InputData taxResidencyFlowContract$InputData = aVar.o;
        TaxResidencyFlowContext taxResidencyFlowContext = taxResidencyFlowContract$InputData.f90290b;
        String str = taxResidencyFlowContract$InputData.f90289a;
        oki.h.t2(aVar, iVar, new TaxResidencyFlowContract$Step.Crs(new CrsFlowContract$InputData(taxResidencyFlowContract$InputData.d, backNavigationType, taxResidencyFlowContext, str, arrayList, (List) objP2, map, map2, bVar, z6), i), z, null, false, 12);
        return Unit.f186387a;
    }
}
