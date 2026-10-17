package vzk;

import com.revolut.data.model.Data;
import com.revolut.kompot.navigable.screen.ScreenStates$RetainedDomain;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.model.NationalitiesInput;
import com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.nationalities_screen.NationalitiesScreenContract$RetainedState;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends kki.a {
    @Override // kki.a
    public final ScreenStates$RetainedDomain a(jki.i iVar) {
        List list;
        g currentState = (g) iVar;
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        Data data = currentState.f293548b;
        NationalitiesInput nationalitiesInput = (NationalitiesInput) data.getContent();
        if (nationalitiesInput == null || (list = nationalitiesInput.f104193a) == null || !(!list.isEmpty())) {
            return null;
        }
        return new NationalitiesScreenContract$RetainedState((NationalitiesInput) zi0.c.I(data));
    }

    @Override // kki.a
    public final jki.i b(jki.i iVar, ScreenStates$RetainedDomain screenStates$RetainedDomain) {
        g initialState = (g) iVar;
        NationalitiesScreenContract$RetainedState retainedState = (NationalitiesScreenContract$RetainedState) screenStates$RetainedDomain;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(retainedState, "retainedState");
        return new g(zi0.c.P(retainedState.f104205a, false, null, 3), new Data(null, null, false, 7, null), true, false);
    }
}
