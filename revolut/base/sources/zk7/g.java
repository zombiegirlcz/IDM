package zk7;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.feature.insurance.impl.R$string;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import mx0.v5;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(i iVar) {
        com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.a domainState = (com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState instanceof d;
        TextLocalisedClause textLocalisedClause = !z ? new TextLocalisedClause(R$string.cfac_my_claims_status_update_more_information_needed, null, null, 14) : null;
        if (textLocalisedClause == null) {
            textLocalisedClause = new TextLocalisedClause(R$string.cfac_my_claims_status_update_claim_declined, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        Clause textLocalisedClause3 = !z ? new TextLocalisedClause(R$string.cfac_my_claims_status_update_claims_team_requires_more_info, null, null, 14) : null;
        if (textLocalisedClause3 == null) {
            Intrinsics.i(domainState, "null cannot be cast to non-null type com.revolut.feature.insurance.impl.ui.cfac.my_claims.status_update.CFACClaimStatusUpdateScreenContract.DomainState.DeclinedProgress");
            textLocalisedClause3 = new TextClause(((d) domainState).f322913a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        PlainTextDelegate.Model model = new PlainTextDelegate.Model("MORE INFO NEEDED", (UrlImage) null, textLocalisedClause2, textLocalisedClause3, (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.cfac_my_claims_status_update_your_actions, null, null, 14);
        TextLocalisedClause textLocalisedClause5 = !z ? new TextLocalisedClause(R$string.cfac_my_claims_status_update_please_contact_claims_team, null, null, 14) : null;
        if (textLocalisedClause5 == null) {
            textLocalisedClause5 = new TextLocalisedClause(R$string.cfac_my_claims_status_update_contact_claims_team_for_appeal, null, null, 14);
        }
        PlainTextDelegate.Model model2 = new PlainTextDelegate.Model("YOUR ACTIONS", (UrlImage) null, textLocalisedClause4, textLocalisedClause5, (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        PlainTextDelegate.Model[] elements = {model, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new f(kotlin.collections.d.L(elements));
    }
}
