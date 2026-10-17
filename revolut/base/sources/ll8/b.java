package ll8;

import aii.e;
import aii.g;
import android.os.Parcelable;
import aw0.f;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.junior_remote_login.impl.R$string;
import com.revolut.feature.junior_remote_login.impl.ui.flow.create_phone_number.JuniorCreatePhoneNumberFlow;
import com.revolut.feature.junior_remote_login.impl.ui.flow.invite_creation.JuniorInviteCreationFlow;
import com.revolut.feature.junior_remote_login.impl.ui.flow.invite_creation.JuniorInviteCreationFlowContract$InputData;
import com.revolut.feature.junior_remote_login.impl.ui.flow.update_phone_number.JuniorUpdatePhoneNumberFlow;
import com.revolut.feature.junior_remote_login.navigation.JuniorCreatePhoneNumberDestination;
import com.revolut.feature.junior_remote_login.navigation.JuniorInviteCreationDestination;
import com.revolut.feature.junior_remote_login.navigation.JuniorUpdatePhoneNumberDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof kl8.a)) {
            return null;
        }
        kl8.a aVar = (kl8.a) descriptor;
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.junior_consent_personal_data_title, u.c(aVar.b()), null, 12), new TextLocalisedClause(R$string.junior_consent_personal_data_description, u.c(aVar.b()), null, 12), null, null, false, 28);
        aw0.g gVar = new aw0.g(new n6(new TextLocalisedClause(R$string.junior_consent_personal_data_action_go_back, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.junior_consent_personal_data_action_add_phone_number, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), (Clause) null, (f) null, 25);
        k9 k9Var = k9.Junior;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return aVar.a(new ActionsBottomSheetController(new dii.a(aVar2, gVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof JuniorInviteCreationDestination) {
            return new JuniorInviteCreationFlow(new JuniorInviteCreationFlowContract$InputData(((JuniorInviteCreationDestination) destination).getF77228a()));
        }
        if (destination instanceof JuniorCreatePhoneNumberDestination) {
            return new JuniorCreatePhoneNumberFlow(((JuniorCreatePhoneNumberDestination) destination).getF77226b());
        }
        if (destination instanceof JuniorUpdatePhoneNumberDestination) {
            return new JuniorUpdatePhoneNumberFlow(((JuniorUpdatePhoneNumberDestination) destination).getF77229b());
        }
        return null;
    }
}
