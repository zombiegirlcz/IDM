package wd8;

import aii.u;
import com.revolut.feature.junior_coparent.api.navigation.CoparentFeatureConfig$ConfirmCoparent;
import com.revolut.feature.junior_coparent.api.navigation.CoparentFeatureConfig$InviteCoparent;
import com.revolut.feature.junior_coparent.impl.ui.confirmation.flow.CoparentConfirmationFlow;
import com.revolut.feature.junior_coparent.impl.ui.invitation.CoparentInvitationFlow;
import com.revolut.feature.junior_coparent.impl.ui.invitation.CoparentInvitationFlowContract$InputData;
import dki.g;
import he8.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return f0.f322471a;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CoparentFeatureConfig$InviteCoparent) {
            return new CoparentInvitationFlow(new CoparentInvitationFlowContract$InputData(((CoparentFeatureConfig$InviteCoparent) destination).f76872a));
        }
        if (destination instanceof CoparentFeatureConfig$ConfirmCoparent) {
            return new CoparentConfirmationFlow(new c(((CoparentFeatureConfig$ConfirmCoparent) destination).f76871a));
        }
        return null;
    }
}
