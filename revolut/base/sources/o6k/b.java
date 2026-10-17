package o6k;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.payments.money_request.api.MoneyRequestApi$Toggles;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestActionNavigation$Destination;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$BridgeDetails$ById;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest;
import com.revolut.retail.core.flow.FlowExtras;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.action_dialog.MoneyRequestActionFlow;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsContract$InputData;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsNewScreen;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.MoneyRequestDetailsScreen;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.reject_reason.MoneyRequestRejectWithReasonContract$InputData;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.reject_reason.MoneyRequestRejectWithReasonScreen;
import java.util.List;
import jte.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f222635a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f222635a = featureToggleInteractor;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof yv9.b)) {
            return null;
        }
        yv9.b bVar = (yv9.b) descriptor;
        return bVar.a(new MoneyRequestActionFlow(bVar.b()));
    }

    @Override // nte.a
    public final List e() {
        return MoneyRequestApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        boolean z = destination instanceof MoneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest.BridgeDestination;
        gte.a aVar = this.f222635a;
        if (z) {
            MoneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest.BridgeDestination bridgeDestination = (MoneyRequestFeatureConfig$BridgeDetails$ByMoneyRequest.BridgeDestination) destination;
            MoneyRequest moneyRequest = bridgeDestination.f79608a;
            FlowExtras flowExtras = bridgeDestination.f79609b;
            MoneyRequestApi$Toggles.MoneyRequestDetailsRevamp moneyRequestDetailsRevamp = MoneyRequestApi$Toggles.MoneyRequestDetailsRevamp.f79589c;
            MoneyRequestDetailsContract$InputData.ByMoneyRequest byMoneyRequest = new MoneyRequestDetailsContract$InputData.ByMoneyRequest(moneyRequest, flowExtras, ((d) aVar).c(moneyRequestDetailsRevamp));
            return ((d) aVar).c(moneyRequestDetailsRevamp) ? new MoneyRequestDetailsNewScreen(byMoneyRequest) : new MoneyRequestDetailsScreen(byMoneyRequest);
        }
        if (!(destination instanceof MoneyRequestFeatureConfig$BridgeDetails$ById.BridgeDestination)) {
            if (destination instanceof MoneyRequestFeatureConfig.RejectWithReason.BridgeDestination) {
                return new MoneyRequestRejectWithReasonScreen(new MoneyRequestRejectWithReasonContract$InputData(((MoneyRequestFeatureConfig.RejectWithReason.BridgeDestination) destination).f79616a));
            }
            if (destination instanceof MoneyRequestActionNavigation$Destination) {
                return new MoneyRequestActionFlow(((MoneyRequestActionNavigation$Destination) destination).getF79598a());
            }
            return null;
        }
        MoneyRequestFeatureConfig$BridgeDetails$ById.BridgeDestination bridgeDestination2 = (MoneyRequestFeatureConfig$BridgeDetails$ById.BridgeDestination) destination;
        String str = bridgeDestination2.f79603a;
        FlowExtras flowExtras2 = bridgeDestination2.f79605c;
        MoneyRequestApi$Toggles.MoneyRequestDetailsRevamp moneyRequestDetailsRevamp2 = MoneyRequestApi$Toggles.MoneyRequestDetailsRevamp.f79589c;
        MoneyRequestDetailsContract$InputData.ById byId = new MoneyRequestDetailsContract$InputData.ById(str, flowExtras2, ((d) aVar).c(moneyRequestDetailsRevamp2));
        return ((d) aVar).c(moneyRequestDetailsRevamp2) ? new MoneyRequestDetailsNewScreen(byId) : new MoneyRequestDetailsScreen(byId);
    }
}
