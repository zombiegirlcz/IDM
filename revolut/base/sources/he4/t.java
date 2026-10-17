package he4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.address.confirmation.AddressConfirmationControllerContract$InputData;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class t implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddressConfirmationControllerContract$InputData f151593a;

    public t(AddressConfirmationControllerContract$InputData inputData, q74.b creditNavigationIconMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditNavigationIconMapper, "creditNavigationIconMapper");
        this.f151593a = inputData;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        AddressConfirmationControllerContract$InputData addressConfirmationControllerContract$InputData = this.f151593a;
        ResourceImage resourceImageA = q74.b.a(addressConfirmationControllerContract$InputData.f68002a);
        int i = R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_address_confirmation_title;
        xy3.d dVar = addressConfirmationControllerContract$InputData.f68003b;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(dVar.f309562a), null, 12);
        List list = (List) iii.c.f(domainState.f151579a, new r(1), new hb6.g(14), new gzb.d(13));
        Data data = domainState.f151579a;
        return new q(textLocalisedClause, pyd.c.G(data) ? new TextLocalisedClause(R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_address_confirmation_primary_button, u.c(dVar.f309563b), null, 12) : null, pyd.c.G(data) ? new TextLocalisedClause(R$string.credit_application_mortgage_refinancing_details_v2_questionnaire_address_confirmation_secondary_button, u.c(dVar.f309564c), null, 12) : null, resourceImageA, list);
    }
}
