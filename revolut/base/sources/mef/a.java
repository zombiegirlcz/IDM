package mef;

import aii.u;
import com.revolut.feature.transaction.recogniser.api.navigation.TransactionRecogniserDestination;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.TransactionRecogniserFlow;
import com.revolut.feature.transaction.recogniser.impl.ui.flow.TransactionRecogniserFlowContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof TransactionRecogniserDestination)) {
            return null;
        }
        TransactionRecogniserDestination.InputData inputData = ((TransactionRecogniserDestination) destination).f91806b;
        return new TransactionRecogniserFlow(new TransactionRecogniserFlowContract$InputData(inputData.getF91807a(), inputData.a()));
    }
}
