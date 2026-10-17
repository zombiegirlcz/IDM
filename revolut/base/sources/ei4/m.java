package ei4;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.credit.application.plugins.impl.ui.solicitor_selection.partner_solicitor_details.PartnerSolicitorDetailsControllerContract$InputData;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import mx4.z;
import org.jmrtd.cbeff.ISO781611;
import tx0.r3;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PartnerSolicitorDetailsControllerContract$InputData f126408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f126409b;

    public m(PartnerSolicitorDetailsControllerContract$InputData inputData, z creditScreenConstructorMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditScreenConstructorMapper, "creditScreenConstructorMapper");
        this.f126408a = inputData;
        this.f126409b = creditScreenConstructorMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        int i = R$string.credit_application_solicitor_selection_partner_solicitor_details_title;
        PartnerSolicitorDetailsControllerContract$InputData partnerSolicitorDetailsControllerContract$InputData = this.f126408a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(partnerSolicitorDetailsControllerContract$InputData.f68405a.f130898b), null, 12);
        int i2 = R$string.credit_application_solicitor_selection_partner_solicitor_details_description;
        ez3.j jVar2 = partnerSolicitorDetailsControllerContract$InputData.f68405a;
        return new j(this.f126409b.b(jVar2.e, new ax4.b(0)), textLocalisedClause, new TextLocalisedClause(i2, u.c(jVar2.f130899c), null, 12), new r3(new yy0.j(new UrlImage(jVar2.d, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902))), new TextLocalisedClause(R$string.credit_application_solicitor_selection_partner_solicitor_details_button, u.c(jVar2.f), null, 12));
    }
}
