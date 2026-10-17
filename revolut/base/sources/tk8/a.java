package tk8;

import com.revolut.feature.junior_referrals.api.JuniorReferralsApi$Toggles$JuniorReferralsRevamp;
import com.revolut.feature.junior_referrals.api.navigation.AllowReferralsPromptDestination;
import com.revolut.feature.junior_referrals.impl.ui.allow_referrals_prompt.AllowReferralsPromptFlow;
import com.revolut.feature.junior_referrals.impl.ui.allow_referrals_prompt.AllowReferralsPromptFlowContract$InputData;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return u.c(JuniorReferralsApi$Toggles$JuniorReferralsRevamp.f77156c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof AllowReferralsPromptDestination)) {
            return null;
        }
        AllowReferralsPromptDestination allowReferralsPromptDestination = (AllowReferralsPromptDestination) destination;
        return new AllowReferralsPromptFlow(new AllowReferralsPromptFlowContract$InputData(allowReferralsPromptDestination.f77157a, allowReferralsPromptDestination.f77158b, allowReferralsPromptDestination.f77159c));
    }
}
