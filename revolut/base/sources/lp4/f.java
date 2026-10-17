package lp4;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import ip0.tm0;
import ip0.um0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements n {
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.additional_cards_cardholder_removed_title, null, null, 14), null, null, null, false, 30);
        aim.e eVarB = u.b();
        List listK = v.k(new RowDelegate.Model("additional_cardholder_remove_purchases", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_lock, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.additional_cards_cardholder_removed_purchases_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.additional_cards_cardholder_removed_purchases_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new RowDelegate.Model("additional_cardholder_remove_still_need_card", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_credit_card, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.additional_cards_cardholder_removed_card_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.additional_cards_cardholder_removed_card_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        eVarB.addAll(listK);
        eVarB.add(new um0("additional_cardholder_remove_twin_button", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.additional_cards_cardholder_removed_secondary_button, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.additional_cards_cardholder_removed_primary_button, null, null, 14), false, null, null, 56), (Object) null, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1016));
        return new d(aVar, u.a(eVarB));
    }
}
