package ad9;

import aii.u;
import com.revolut.feature.onboarding.api.user_migration.UserMigrationFeatureConfig;
import com.revolut.feature.onboarding.impl.user_migration.UserMigrationFlow;
import com.revolut.feature.onboarding.impl.user_migration.UserMigrationFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof UserMigrationFeatureConfig.UserMigrationDestination)) {
            return null;
        }
        UserMigrationFeatureConfig.UserMigrationDestination userMigrationDestination = (UserMigrationFeatureConfig.UserMigrationDestination) destination;
        return new UserMigrationFlow(new UserMigrationFlowContract$InputData(userMigrationDestination.f78223a, userMigrationDestination.f78224b));
    }
}
