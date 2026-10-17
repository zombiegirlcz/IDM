package fp8;

import aii.p;
import aii.u;
import com.revolut.feature.junior_tasks.api.navigation.JuniorTasksEditDestination;
import com.revolut.feature.junior_tasks.api.navigation.JuniorTasksListDestination;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.edit.flow.ChallengesEditFlow;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.ChallengesOverviewContract$InputData;
import com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow.ChallengesOverviewFlow;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements p, nte.a {
    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof JuniorTasksListDestination) {
            return new ChallengesOverviewFlow(new ChallengesOverviewContract$InputData(((JuniorTasksListDestination) destination).f77358b));
        }
        if (!(destination instanceof JuniorTasksEditDestination)) {
            return null;
        }
        JuniorTasksEditDestination juniorTasksEditDestination = (JuniorTasksEditDestination) destination;
        return new ChallengesEditFlow(new np8.b(juniorTasksEditDestination.f77356b, juniorTasksEditDestination.f77357c, juniorTasksEditDestination.e));
    }
}
