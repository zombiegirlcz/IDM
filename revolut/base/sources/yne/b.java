package yne;

import com.revolut.feature.tax_residency.impl.flows.edit.EditTaxResidenciesFlowContract$State;
import com.revolut.feature.tax_residency.impl.flows.submit.SubmitTaxResidencyFlow;
import com.revolut.feature.tax_residency.impl.flows.submit.SubmitTaxResidencyFlowContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import eoe.c;
import eoe.d;
import eoe.e;
import eoe.f;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tax_residency.impl.flows.edit.a f315465b;

    public /* synthetic */ b(com.revolut.feature.tax_residency.impl.flows.edit.a aVar, int i) {
        this.f315464a = i;
        this.f315465b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f315464a) {
            case 0:
                zne.b outputData = (zne.b) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                com.revolut.feature.tax_residency.impl.flows.edit.a aVar = this.f315465b;
                EditTaxResidenciesFlowContract$State editTaxResidenciesFlowContract$State = (EditTaxResidenciesFlowContract$State) aVar.A2().f98429a;
                wi0.b bVar = outputData.f323806a;
                List list = outputData.f323807b;
                List list2 = outputData.f323808c;
                editTaxResidenciesFlowContract$State.getClass();
                aVar.L2(new EditTaxResidenciesFlowContract$State(bVar, list, list2));
                f0 f0Var = f0.f322471a;
                wi0.b bVar2 = ((EditTaxResidenciesFlowContract$State) aVar.A2().f98429a).f90015a;
                if (bVar2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                List list3 = ((EditTaxResidenciesFlowContract$State) aVar.A2().f98429a).f90016b;
                if (list3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                List list4 = ((EditTaxResidenciesFlowContract$State) aVar.A2().f98429a).f90017c;
                if (list4 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                aVar.d2(new SubmitTaxResidencyFlow(new SubmitTaxResidencyFlowContract$InputData(bVar2, list3, list4, (List) f0Var, (List) f0Var, true, true, "PRIMARY_BUTTON_LOADING_TAG")), ModalDestination.Style.FULLSCREEN_FADE.f98307a, new b(aVar, 1));
                return Unit.f186387a;
            default:
                f outputData2 = (f) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (!(outputData2 instanceof c) && !(outputData2 instanceof d)) {
                    if (!(outputData2 instanceof e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.revolut.feature.tax_residency.impl.flows.edit.a aVar2 = this.f315465b;
                    if (aVar2.f90019t.f90014c == null) {
                        aVar2.I2();
                    } else {
                        aVar2.C1(new BridgeDestination(new FinishCommand(-1, null, null, 6)));
                    }
                }
                return Unit.f186387a;
        }
    }
}
