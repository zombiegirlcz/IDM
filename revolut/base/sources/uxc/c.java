package uxc;

import aii.u;
import com.revolut.feature.selfserve.entity.config.shared.flow.EntityConfigFlow;
import com.revolut.feature.selfserve.entity.config.shared.flow.EntityConfigFlowContract$InputData;
import com.revolut.shared.feature.selfserve.entity.config.api.navigation.EntityConfigDestination;
import com.revolut.shared.feature.selfserve.entity.config.api.repository.EntityConfigRepository$Params;
import dki.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        EntityConfigFlowContract$InputData screenContent;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof EntityConfigDestination)) {
            return null;
        }
        EntityConfigDestination.InputData inputData = ((EntityConfigDestination) destination).f104885b;
        if (inputData instanceof EntityConfigDestination.InputData.Config) {
            EntityConfigDestination.InputData.Config config = (EntityConfigDestination.InputData.Config) inputData;
            screenContent = new EntityConfigFlowContract$InputData.Params(new EntityConfigRepository$Params.Config(config.getF104887b(), config.c()), config.getF104886a());
        } else if (inputData instanceof EntityConfigDestination.InputData.Ticket) {
            screenContent = new EntityConfigFlowContract$InputData.Params(new EntityConfigRepository$Params.Ticket(((EntityConfigDestination.InputData.Ticket) inputData).getF104891b()), inputData.getF104886a());
        } else {
            if (!(inputData instanceof EntityConfigDestination.InputData.ScreenContent)) {
                throw new NoWhenBranchMatchedException();
            }
            EntityConfigDestination.InputData.ScreenContent screenContent2 = (EntityConfigDestination.InputData.ScreenContent) inputData;
            screenContent = new EntityConfigFlowContract$InputData.ScreenContent(screenContent2.getF104889b(), screenContent2.getF104886a());
        }
        return new EntityConfigFlow(screenContent);
    }
}
