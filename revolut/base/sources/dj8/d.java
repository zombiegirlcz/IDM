package dj8;

import aw0.h;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.junior_payment_links.api.navigation.JuniorPaymentLinksConsentInput;
import com.revolut.feature.junior_payment_links.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorPaymentLinksConsentInput f115133a;

    public d(JuniorPaymentLinksConsentInput input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f115133a = input;
    }

    @Override // cli.n
    public final o c(j jVar) {
        RowDelegate.Model model;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.junior_payment_link_consent_sheet_title, null, null, 14), new TextLocalisedClause(R$string.junior_payment_link_consent_sheet_subtitle, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_link, null, null, 6)), null, false, 24);
        int i = R$string.junior_payment_link_consent_sheet_cells_request_money;
        JuniorPaymentLinksConsentInput juniorPaymentLinksConsentInput = this.f115133a;
        RowDelegate.Model model2 = new RowDelegate.Model("LIST_ID_ITEMS_PAYMENT_LINK", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_request, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(i, u.c(juniorPaymentLinksConsentInput.f77078c), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        if (juniorPaymentLinksConsentInput.f77077b) {
            model = new RowDelegate.Model("LIST_ID_ITEMS_FIND_VIA_REVTAG", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_users_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.junior_payment_link_consent_sheet_cells_find_via_revtag, v.k(juniorPaymentLinksConsentInput.f77078c, juniorPaymentLinksConsentInput.d), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        } else {
            model = null;
        }
        RowDelegate.Model[] elements = {model2, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new cii.b(new h(false, new n6(new TextLocalisedClause(R$string.junior_payment_link_consent_sheet_cells_buttons_turn_on, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "LOADING_TAG_PRIMARY_BUTTON", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), new n6(new TextLocalisedClause(R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), listL, aVar);
    }
}
