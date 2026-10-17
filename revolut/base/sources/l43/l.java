package l43;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.card_payment_method.impl.R$string;
import com.revolut.feature.security_hub.api.SecurityHubApi$Toggles;
import java.util.List;
import k8d.t;
import kotlin.jvm.internal.Intrinsics;
import l2c.v;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f192056a;

    public l(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f192056a = featureToggleInteractor;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        char c2;
        qv0.i model;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RowDelegate.Model model2 = new RowDelegate.Model("SUBACCOUNT_WEALTH_PROTECTION_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_secure_seal, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.card_link_card_to_pocket_warning_pocket_withdrawal_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.card_link_card_to_pocket_warning_pocket_withdrawal_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        if (((jte.d) this.f192056a).c(SecurityHubApi$Toggles.CardPaymentsWealthProtection.f85366c)) {
            c2 = 0;
            model = (qv0.i) iii.c.f(domainState.f192050a, new l2d.a(20), new v(8), new t(this, 22));
        } else {
            c2 = 0;
            model = new RowDelegate.Model("SUBACCOUNT_CARD_LIMIT_LIST_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_limit, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.card_link_card_to_pocket_warning_card_spend_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.card_link_card_to_pocket_warning_card_spend_description_template, u.c(new TextLocalisedClause(R$string.card_link_card_to_pocket_warning_card_spend_limit, null, new Click(30, (Integer) null, (Object) null, "CARD_LIMIT_INFO_ID", false), 10)), null, 12), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        }
        qv0.i iVar = model;
        if (iVar != null) {
            yp0.b.l(iVar, 0, 0, 0, 0, null, false, 63);
        } else {
            iVar = null;
        }
        qv0.i[] elements = new qv0.i[2];
        elements[c2] = model2;
        elements[1] = iVar;
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new j(kotlin.collections.d.L(elements));
    }
}
