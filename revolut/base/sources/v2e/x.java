package v2e;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.feature.payments.profile.impl.ui_kompot.flow.PaymentProfileFlowContract$State;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$FlowState;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.family_plan.FamilyPlanFlowContract$State;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f285731b;

    public /* synthetic */ x(Object obj2, boolean z, int i) {
        this.f285730a = i;
        this.f285731b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f285730a) {
            case 0:
                l update = (l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                break;
            case 1:
                l update2 = (l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                break;
            case 2:
                v4a.e updateState = (v4a.e) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                break;
            case 3:
                NaviCommand command = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command, "command");
                break;
            case 4:
                dj0.d dVar = (dj0.d) obj2;
                if (dVar != null) {
                    MoneyClause moneyClauseA = vg2.d.a(dVar);
                    if (this.f285731b) {
                    }
                }
                break;
            case 8:
                FamilyPlanFlowContract$State update3 = (FamilyPlanFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                update3.getClass();
                break;
            case 11:
                PaymentProfileFlowContract$State update4 = (PaymentProfileFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                break;
            case 12:
                wbg.g0 update5 = (wbg.g0) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                break;
            case 13:
                wj7.i update6 = (wj7.i) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                break;
            case 16:
                x23.j update7 = (x23.j) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                break;
            case 17:
                NaviCommand command2 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(command2, "command");
                if (this.f285731b) {
                }
                break;
            case 18:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 25:
                xpk.h updateState2 = (xpk.h) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                break;
            case 27:
                List recents = (List) obj2;
                Intrinsics.checkNotNullParameter(recents, "recents");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : recents) {
                    jq9.k kVar = (jq9.k) obj3;
                    if (this.f285731b || !fc.g.c(kVar)) {
                        arrayList.add(obj3);
                    }
                }
                break;
        }
        return SotFlowContract$FlowState.a((SotFlowContract$FlowState) obj2, this.f285731b, null, null, null, null, null, null, null, null, null, null, null, null, false, 16382);
    }

    public /* synthetic */ x(boolean z, int i) {
        this.f285730a = i;
        this.f285731b = z;
    }

    public /* synthetic */ x(boolean z, fc.g gVar) {
        this.f285730a = 27;
        this.f285731b = z;
    }
}
