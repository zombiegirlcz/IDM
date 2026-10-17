package cre;

import com.revolut.feature.terminated_users.api.config.TerminatedUsersFeatureConfig;
import com.revolut.feature.terminated_users.api.declaration.TerminatedUsersApi$Toggles$OpenTerminatedPromptOnLogin;
import com.revolut.feature.terminated_users.impl.ui.flow.TerminatedAccountFlow;
import com.revolut.feature.terminated_users.impl.ui.flow.TerminatedAccountFlowContract$InputData;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return u.c(TerminatedUsersApi$Toggles$OpenTerminatedPromptOnLogin.f90341c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof TerminatedUsersFeatureConfig.Dashboard) {
            return new TerminatedAccountFlow(new TerminatedAccountFlowContract$InputData(((TerminatedUsersFeatureConfig.Dashboard) destination).f90339a));
        }
        return null;
    }
}
