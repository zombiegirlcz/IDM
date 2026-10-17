package b0b;

import aii.u;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.restricted_access.R$string;
import com.revolut.feature.restricted_access.api.FeatureNotAvailableDestination;
import com.revolut.feature.restricted_access.api.RestrictedAccessDestination;
import com.revolut.feature.restricted_access.impl.ui.flow.FeatureNotAvailableFlow;
import com.revolut.feature.restricted_access.impl.ui.flow.FeatureNotAvailableFlowContract$InputData;
import com.revolut.feature.restricted_access.impl.ui.flow.RestrictedAccessPromptFlow;
import com.revolut.feature.restricted_access.impl.ui.flow.RestrictedAccessPromptFlowContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RestrictedAccessDestination) {
            return new RestrictedAccessPromptFlow(new RestrictedAccessPromptFlowContract$InputData(((RestrictedAccessDestination) destination).f82024b));
        }
        if (!(destination instanceof FeatureNotAvailableDestination)) {
            return null;
        }
        FeatureNotAvailableDestination featureNotAvailableDestination = (FeatureNotAvailableDestination) destination;
        Clause textLocalisedClause = featureNotAvailableDestination.f82016b;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.restricted_feature_title, null, null, 14);
        }
        Clause textLocalisedClause2 = featureNotAvailableDestination.f82017c;
        if (textLocalisedClause2 == null) {
            textLocalisedClause2 = new TextLocalisedClause(R$string.restricted_feature_subtitle, null, null, 14);
        }
        Clause textLocalisedClause3 = featureNotAvailableDestination.d;
        if (textLocalisedClause3 == null) {
            textLocalisedClause3 = new TextLocalisedClause(R$string.restricted_feature_confirm, null, null, 14);
        }
        FeatureNotAvailableDestination.Action action = featureNotAvailableDestination.e;
        FeatureNotAvailableDestination.Action.NavigateToMain navigateToMain = FeatureNotAvailableDestination.Action.NavigateToMain.f82021a;
        if (action == null) {
            action = navigateToMain;
        }
        FeatureNotAvailableDestination.Action action2 = featureNotAvailableDestination.f;
        return new FeatureNotAvailableFlow(new FeatureNotAvailableFlowContract$InputData(textLocalisedClause, textLocalisedClause2, textLocalisedClause3, action, action2 == null ? navigateToMain : action2));
    }
}
