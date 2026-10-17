package dx8;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.kyc.api.R$string;
import ip0.yt;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        yt ytVar = yt.TOP;
        ListCellDelegate.Model model = new ListCellDelegate.Model("LIST_ID_FIRST_CONDITION", new j8(resourceImage, ytVar), null, new TextLocalisedClause(R$string.kyc_incode_us_consent_detailed_conditions_first, null, null, 14), false, null, null, 0, 0, 0, 0, 4084);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        ListCellDelegate.Model model2 = new ListCellDelegate.Model("LIST_ID_SECOND_CONDITION", new j8(new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), ytVar), null, new TextLocalisedClause(R$string.kyc_incode_us_consent_detailed_conditions_second, v.k(new TextLocalisedClause(R$string.kyc_incode_us_consent_detailed_links_bipa, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_BIPA_POLICY", false), 10), new TextLocalisedClause(R$string.kyc_incode_us_consent_detailed_links_revolut_privacy_policy, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_REVOLUT_PRIVACY_POLICY", false), 10), new TextLocalisedClause(R$string.kyc_incode_us_consent_detailed_links_incode_privacy_policy, null, new Click(30, (Integer) null, (Object) null, "CLICK_ID_INCODE_PRIVACY_POLICY", false), 10)), null, 12), false, null, null, 0, 0, 0, 0, 4068);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new g(v.k(model, model2));
    }
}
