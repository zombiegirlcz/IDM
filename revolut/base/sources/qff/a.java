package qff;

import aii.u;
import com.revolut.feature.transaction.troubleshooter.api.deps.TransactionTroubleshooterApi$Toggles$TransactionTroubleshooterImprovementBusinessDefinition;
import com.revolut.feature.transaction.troubleshooter.api.deps.TransactionTroubleshooterApi$Toggles$TransactionTroubleshooterImprovementDefinition;
import com.revolut.feature.transaction.troubleshooter.api.navigation.TransactionTroubleshooterDestination;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.TroubleshooterFlow;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.TroubleshooterFlowContract$InputData;
import dki.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return v.k(TransactionTroubleshooterApi$Toggles$TransactionTroubleshooterImprovementDefinition.f91839c, TransactionTroubleshooterApi$Toggles$TransactionTroubleshooterImprovementBusinessDefinition.f91838c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        TroubleshooterFlowContract$InputData details;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof TransactionTroubleshooterDestination)) {
            return null;
        }
        TransactionTroubleshooterDestination.InputData inputData = ((TransactionTroubleshooterDestination) destination).f91854b;
        if (inputData instanceof TransactionTroubleshooterDestination.TroubleshooterList) {
            TransactionTroubleshooterDestination.TroubleshooterList troubleshooterList = (TransactionTroubleshooterDestination.TroubleshooterList) inputData;
            details = new TroubleshooterFlowContract$InputData.TroubleshooterList(troubleshooterList.getF91858a(), troubleshooterList.getF91859b(), troubleshooterList.getF91860c(), troubleshooterList.getD(), troubleshooterList.getE(), troubleshooterList.getF(), troubleshooterList.getF91861g());
        } else {
            if (!(inputData instanceof TransactionTroubleshooterDestination.Details)) {
                throw new NoWhenBranchMatchedException();
            }
            TransactionTroubleshooterDestination.Details details2 = (TransactionTroubleshooterDestination.Details) inputData;
            details = new TroubleshooterFlowContract$InputData.Details(details2.getF91855a(), details2.getF91856b(), details2.getF91857c());
        }
        return new TroubleshooterFlow(details);
    }
}
