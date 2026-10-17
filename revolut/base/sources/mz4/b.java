package mz4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.forbearance.application.api.models.ForbearanceApplicationPayload;
import com.revolut.feature.credit.forbearance.application.api.navigation.ForbearanceFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import it3.f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import sz4.d;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public interface b {
    static FeatureCommand a(b bVar, String applicationId, gs3.a forbearanceType, String str, int i) {
        if ((i & 8) != 0) {
            str = null;
        }
        List states = v.k(f.AGREEMENT_SIGNED, f.VALIDATION_PASSED);
        ((d) bVar).getClass();
        Intrinsics.checkNotNullParameter("LOAN_FORBEARANCE_APPLICATION_FLOW", "flowName");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(forbearanceType, "forbearanceType");
        Intrinsics.checkNotNullParameter(states, "states");
        return new FeatureCommand(new ForbearanceFeatureConfig.ForbearanceSpinner(u.c(new TextLocalisedClause(R$string.credit_forbearance_doc_waiting_title, null, null, 14)), u.c(new TextLocalisedClause(R$string.credit_forbearance_doc_waiting_subtitle, null, null, 14)), str != null ? new ForbearanceApplicationPayload(str, applicationId, forbearanceType, null) : null, states, "LOAN_FORBEARANCE_APPLICATION_FLOW", applicationId));
    }
}
