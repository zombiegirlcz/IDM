package vg2;

import android.os.Parcelable;
import aw0.h;
import aw0.n6;
import aw0.o9;
import aw0.t0;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationAmount;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import com.revolut.feature.apm.core.models.payments_authorisations.Identification;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static h a(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3) {
        return new h(false, new n6(textLocalisedClause, LargeActionButton.ButtonStyle.f58725a, null, "BUTTON_TAG_PRIMARY", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), new n6(textLocalisedClause2, LargeActionButton.ButtonStyle.f58726b, null, "BUTTON_TAG_SECONDARY", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), textLocalisedClause3, null, null, 113);
    }

    public static CellDetailsDelegate.Model b(ApmPaymentAuthorisationSummary summary) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(summary, "summary");
        ApmPaymentAuthorisationAmount apmPaymentAuthorisationAmount = summary.f62005t;
        if (apmPaymentAuthorisationAmount == null || (dVar = apmPaymentAuthorisationAmount.f61989c) == null) {
            return null;
        }
        return new CellDetailsDelegate.Model("LIST_ID_MAX_AMOUNT", new t0((Clause) new TextLocalisedClause(R$string.mandate_details_mandate_maxixum_amount_title, null, null, 14), (Image) null, 0, false, 30), d.a(dVar), null, null, null, null, 0, null, false, false, null, null, 32760);
    }

    public static ListSubheaderDelegate.Model c() {
        return new ListSubheaderDelegate.Model("LIST_ID_SUBHEADER_DETAILS", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.upi_subscription_confirmation_payment_details, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
    }

    public static RowDelegate.Model d(Identification identification) {
        String str;
        if (identification == null || (str = identification.f62023b) == null) {
            return null;
        }
        RowDelegate.Model model = new RowDelegate.Model("LIST_ID_UPI_ID", null, new TextLocalisedClause(com.revolut.feature.apm.upi.api.R$string.upi_payment_confirmation_upi_id, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new TextClause(str, (Style) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), false, (o9) null, (List) null, 122), null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static IconDelegate.Model e() {
        return new IconDelegate.Model("LIST_ID_UPI_LOGO", new CdnImage("autopay_logo", "mobile/payments/upi", null, new ImageTransformations(null, null, null, null, null, null, 40, 63), null, null, Constants.TAG_F4), null, null, 124);
    }
}
