package pg8;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_graduation.api.navigation.JuniorGraduationFeatureConfig;
import com.revolut.feature.junior_graduation.api.navigation.JuniorGraduationFeatureConfig$AssetsMigrationV2$Destination;
import com.revolut.feature.junior_graduation.api.navigation.JuniorGraduationFeatureConfig$Identification$Destination;
import com.revolut.feature.junior_graduation.api.navigation.JuniorGraduationIdentificationControllerDescriptor;
import com.revolut.feature.junior_graduation.impl.ui.flow.identification.IdentificationFlow;
import com.revolut.feature.junior_graduation.impl.ui.flow.identification.IdentificationFlowContract$InputData;
import com.revolut.feature.junior_graduation.impl.ui.screen.asset_details.JuniorMigrationAssetDetailsScreen;
import com.revolut.feature.junior_graduation.impl.ui.screen.asset_details.JuniorMigrationAssetDetailsScreenContract$InputData;
import com.revolut.feature.junior_graduation.impl.ui.screen.asset_details_v2.AssetsMigrationScreen;
import com.revolut.feature.junior_graduation.impl.ui.screen.personalised.JuniorPersonalisedGraduationScreen;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f235824a;

    public b(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f235824a = deeplinkGateways;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof JuniorGraduationIdentificationControllerDescriptor) {
            JuniorGraduationIdentificationControllerDescriptor juniorGraduationIdentificationControllerDescriptor = (JuniorGraduationIdentificationControllerDescriptor) descriptor;
            return juniorGraduationIdentificationControllerDescriptor.a(new IdentificationFlow(new IdentificationFlowContract$InputData(juniorGraduationIdentificationControllerDescriptor.getF76921a(), juniorGraduationIdentificationControllerDescriptor.getF76922b(), juniorGraduationIdentificationControllerDescriptor.getF76923c())));
        }
        if (!(descriptor instanceof lg8.e)) {
            return null;
        }
        lg8.e eVar = (lg8.e) descriptor;
        return eVar.a(new JuniorPersonalisedGraduationScreen(eVar.b()));
    }

    @Override // nte.a
    public final List e() {
        return gg8.a.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof JuniorGraduationFeatureConfig$Identification$Destination) {
            JuniorGraduationFeatureConfig$Identification$Destination juniorGraduationFeatureConfig$Identification$Destination = (JuniorGraduationFeatureConfig$Identification$Destination) destination;
            return new IdentificationFlow(new IdentificationFlowContract$InputData(juniorGraduationFeatureConfig$Identification$Destination.f76914a, juniorGraduationFeatureConfig$Identification$Destination.f76915b, juniorGraduationFeatureConfig$Identification$Destination.f76916c));
        }
        if (destination instanceof JuniorGraduationFeatureConfig.MigrationAssetDetails.Destination) {
            return new JuniorMigrationAssetDetailsScreen(new JuniorMigrationAssetDetailsScreenContract$InputData(((JuniorGraduationFeatureConfig.MigrationAssetDetails.Destination) destination).f76920a));
        }
        if (destination instanceof JuniorGraduationFeatureConfig$AssetsMigrationV2$Destination) {
            return new AssetsMigrationScreen();
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f235824a;
    }
}
