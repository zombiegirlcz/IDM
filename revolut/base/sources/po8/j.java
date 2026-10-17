package po8;

import aw0.n6;
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
import com.revolut.feature.junior_settings.impl.R$string;
import com.revolut.feature.junior_settings.impl.ui_kompot.payments_settings_explanatory.JuniorPaymentsSettingsExplanatoryControllerContract$Input;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorPaymentsSettingsExplanatoryControllerContract$Input f237908a;

    public j(JuniorPaymentsSettingsExplanatoryControllerContract$Input input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f237908a = input;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        JuniorPaymentsSettingsExplanatoryControllerContract$Input juniorPaymentsSettingsExplanatoryControllerContract$Input = this.f237908a;
        f fVar = juniorPaymentsSettingsExplanatoryControllerContract$Input.f77308b;
        String str = juniorPaymentsSettingsExplanatoryControllerContract$Input.f77309c;
        int i = i.f237907a[fVar.ordinal()];
        if (i == 1) {
            lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.youth_settings_disable_contact_discoverability_sheet_title, null, null, 14), new TextLocalisedClause(R$string.youth_settings_disable_contact_discoverability_sheet_subtitle, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_users_search, null, null, 6)), null, false, 24);
            RowDelegate.Model[] elements = {new RowDelegate.Model("LIST_ID_ITEMS_REQUEST_MONEY", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_arrow_request, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.youth_settings_disable_contact_discoverability_sheet_cells_request_money, u.c(str), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("LIST_ID_ITEMS_PENDING_REQUESTS", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_16_sand_watch, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, gz0.b.FitCenter, null, null, null, LDSFile.EF_SOD_TAG), (Clause) null, 190), false, false, 6), new TextLocalisedClause(R$string.youth_settings_disable_contact_discoverability_sheet_cells_pending_requests, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            return new cii.b(new aw0.h(false, new n6(new TextLocalisedClause(R$string.youth_settings_disable_contact_discoverability_sheet_buttons_disable, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "LOADING_TAG_PRIMARY_BUTTON", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), new n6(new TextLocalisedClause(R$string.youth_settings_disable_contact_discoverability_sheet_buttons_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), listL, aVar);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        lw0.a aVar2 = new lw0.a(new TextLocalisedClause(R$string.youth_settings_disable_revtag_discoverability_sheet_title, null, null, 14), new TextLocalisedClause(R$string.youth_settings_disable_revtag_discoverability_sheet_subtitle, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_handle, null, null, 6)), null, false, 24);
        RowDelegate.Model[] elements2 = {new RowDelegate.Model("LIST_ID_ITEMS_FIND_VIA_REVTAG", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_users_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.youth_settings_disable_revtag_discoverability_sheet_cells_find_via_revtag, v.k(str, juniorPaymentsSettingsExplanatoryControllerContract$Input.d), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("LIST_ID_ITEMS_REQUEST_MONEY", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_link, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(R$string.youth_settings_disable_revtag_discoverability_sheet_cells_request_money, u.c(str), null, 12), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        List listL2 = kotlin.collections.d.L(elements2);
        yp0.b.k(listL2, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.h(false, new n6(new TextLocalisedClause(R$string.youth_settings_disable_revtag_discoverability_sheet_buttons_disable, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "LOADING_TAG_PRIMARY_BUTTON", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), new n6(new TextLocalisedClause(R$string.youth_settings_disable_revtag_discoverability_sheet_buttons_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), listL2, aVar2);
    }
}
