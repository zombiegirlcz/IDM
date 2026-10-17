package fij;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanAttributes;
import com.revolut.retail.feature.esim.api.model.EsimDataPlanOption;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$DomainState;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$ModalStep;
import com.revolut.retail.feature.esim.impl.ui.screens.home.plan_selection.duration.EsimPlanDurationPickerBottomSheetScreen;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135440a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f f135441b;

    public /* synthetic */ c0(com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f fVar) {
        this.f135441b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        List list;
        Object next;
        switch (this.f135440a) {
            case 0:
                hhj.d it8 = (hhj.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                EsimDataPlanOption esimDataPlanOption = it8.f152414a;
                boolean z = esimDataPlanOption instanceof EsimDataPlanOption.CountryOption;
                boolean z3 = z && !((EsimDataPlanOption.CountryOption) esimDataPlanOption).d;
                com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f fVar = this.f135441b;
                if (((efj.d) fVar.f101013w).a() && z3) {
                    obj3 = n.f135450a;
                } else if (z) {
                    obj3 = m.COUNTRY;
                } else if (esimDataPlanOption instanceof EsimDataPlanOption.RegionalOption) {
                    obj3 = m.REGIONAL;
                } else {
                    if (!(esimDataPlanOption instanceof EsimDataPlanOption.GlobalOption)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj3 = m.GLOBAL;
                }
                fVar.H2(fVar.B, new eed.i(fVar, 18, obj3, esimDataPlanOption.getF100244a()));
                return Unit.f186387a;
            default:
                lij.d output = (lij.d) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f fVar2 = this.f135441b;
                p pVarE = ((EsimGetPlanScreenContract$DomainState) ((j2) fVar2.B.f22677a).getValue()).e();
                if (pVarE != null && (list = pVarE.f135453c) != null) {
                    Iterator it9 = list.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (Intrinsics.f(((EsimDataPlan) next).f100212a, output.f195534a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    EsimDataPlan esimDataPlan = (EsimDataPlan) next;
                    if (esimDataPlan != null) {
                        EsimDataPlanAttributes esimDataPlanAttributes = esimDataPlan.f100225t;
                        wi0.b bVar = esimDataPlanAttributes != null ? esimDataPlanAttributes.d : null;
                        if (bVar != null) {
                            oki.h.v2(fVar2.C, new EsimGetPlanScreenContract$ModalStep.AbroadWarning(esimDataPlan, bVar), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                        } else {
                            fVar2.J2(esimDataPlan);
                        }
                        return Unit.f186387a;
                    }
                }
                com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f.K2("Cannot proceed to checkout: selected plan not found");
                return Unit.f186387a;
        }
    }

    public /* synthetic */ c0(com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.f fVar, EsimPlanDurationPickerBottomSheetScreen esimPlanDurationPickerBottomSheetScreen) {
        this.f135441b = fVar;
    }
}
