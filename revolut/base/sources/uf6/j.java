package uf6;

import aii.u;
import com.revolut.feature.external_accounts.api.model.Mandate;
import com.revolut.feature.external_accounts.api.navigation.CreateMandateDestination;
import com.revolut.feature.external_accounts.api.navigation.InstitutionData;
import com.revolut.feature.external_accounts.api.navigation.MandateDetailsDestination;
import com.revolut.feature.external_accounts.api.navigation.MandateUpdateLimitsDestination;
import com.revolut.feature.external_accounts.impl.destinations.CreateMandateResultDestination;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateSetupBottomSheetContract$InputData;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateSetupBottomSheetController;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreen;
import com.revolut.feature.external_accounts.impl.mandate.create_mandate.CreateMandateScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.mandate.mandate_details.MandateDetailsScreen;
import com.revolut.feature.external_accounts.impl.mandate.mandate_details.MandateDetailsScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.mandate.mandate_result.MandateResultScreen;
import com.revolut.feature.external_accounts.impl.mandate.mandate_result.MandateResultScreenContract$InputData;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsMode;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsScreen;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import we6.a1;
import we6.n;
import we6.s0;

/* JADX INFO: loaded from: classes13.dex */
public final class j implements ohi.a, nte.a {
    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof a1) {
            a1 a1Var = (a1) descriptor;
            return a1Var.a(new UpdateLimitsScreen(new UpdateLimitsScreenContract$InputData(new UpdateLimitsMode.UpdateStoredMethodLimits(a1Var.b().a()), a1Var.b().c(), a1Var.b().b())));
        }
        if (descriptor instanceof n) {
            n nVar = (n) descriptor;
            InstitutionData.InstitutionId institutionId = new InstitutionData.InstitutionId(nVar.b().a());
            nVar.b().getClass();
            return nVar.a(new CreateMandateScreen(new CreateMandateScreenContract$InputData(institutionId, null, true)));
        }
        if (!(descriptor instanceof s0)) {
            return null;
        }
        s0 s0Var = (s0) descriptor;
        return s0Var.a(new MandateSetupBottomSheetController(new MandateSetupBottomSheetContract$InputData(new InstitutionData.InstitutionId(s0Var.b().a()), s0Var.b().b())));
    }

    @Override // nte.a
    public final List e() {
        return i.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CreateMandateDestination) {
            CreateMandateDestination createMandateDestination = (CreateMandateDestination) destination;
            return new CreateMandateScreen(new CreateMandateScreenContract$InputData(createMandateDestination.f72250a, createMandateDestination.f72251b, false));
        }
        if (destination instanceof CreateMandateResultDestination) {
            return new MandateResultScreen(new MandateResultScreenContract$InputData(((CreateMandateResultDestination) destination).f72363a));
        }
        if (destination instanceof MandateDetailsDestination) {
            return new MandateDetailsScreen(new MandateDetailsScreenContract$InputData(((MandateDetailsDestination) destination).f72336a));
        }
        if (!(destination instanceof MandateUpdateLimitsDestination)) {
            return null;
        }
        MandateUpdateLimitsDestination mandateUpdateLimitsDestination = (MandateUpdateLimitsDestination) destination;
        dj0.d dVar = mandateUpdateLimitsDestination.f72338b;
        Mandate mandate = mandateUpdateLimitsDestination.f72337a;
        dj0.d dVar2 = (dj0.d) kotlin.ranges.f.c(dVar, mandate.getF72226c().getF72227a());
        return new UpdateLimitsScreen(new UpdateLimitsScreenContract$InputData(new UpdateLimitsMode.UpdateMandate(mandate.getF72225b()), dVar2, (dj0.d) kotlin.ranges.f.c(pyd.c.U(dVar2, 4L), mandate.getF72226c().getF72228b()), dVar));
    }
}
