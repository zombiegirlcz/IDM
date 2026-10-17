package wk6;

import com.revolut.feature.external_accounts.api.PseFeatureApi$Toggles$PseAuthorisation;
import com.revolut.feature.external_accounts.api.navigation.PseNavigation$Destination$AuthorisationRequest;
import com.revolut.feature.external_accounts.api.navigation.PseNavigation$Destination$VerificationCode;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.PseFlow;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.PseFlowContract$InputData;
import com.revolut.feature.external_accounts.impl.ui.colombia.pse.PseFlowContract$Step;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return u.c(PseFeatureApi$Toggles$PseAuthorisation.f72209c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, g flowModel) {
        PseFlowContract$Step verificationCode;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PseNavigation$Destination$AuthorisationRequest) {
            verificationCode = new PseFlowContract$Step.AuthorisationRequest(((PseNavigation$Destination$AuthorisationRequest) destination).f72356a);
        } else {
            if (!(destination instanceof PseNavigation$Destination$VerificationCode)) {
                return null;
            }
            verificationCode = new PseFlowContract$Step.VerificationCode(((PseNavigation$Destination$VerificationCode) destination).f72357a);
        }
        return new PseFlow(new PseFlowContract$InputData(verificationCode));
    }
}
