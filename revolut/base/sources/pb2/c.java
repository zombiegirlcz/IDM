package pb2;

import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import aw0.t0;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.payments_authorisations.DebtorAlias;
import com.revolut.feature.apm.payto.api.R$string;
import ip0.ak0;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {
    public static TextDelegate.Model a(Long l2, String creditorName) {
        Intrinsics.checkNotNullParameter(creditorName, "creditorName");
        TextClause textClause = new TextClause(creditorName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.mandate_details_authorisation_payto_footer_message_terms, null, new Click(30, (Integer) null, (Object) null, "FOOTER_CLICKABLE_ID", false), 10);
        Pair pair = l2 == null ? new Pair(Integer.valueOf(R$string.mandate_details_authorisation_payto_footer_message_no_expiration_date), zhm.v.k(textClause, textLocalisedClause)) : new Pair(Integer.valueOf(R$string.mandate_details_authorisation_payto_footer_message), zhm.v.k(textClause, new TimeClause(l2.longValue(), new TimeClause.Format.Pretty(q0.DATETIME_WITH_SECONDS), null, null, 12), textLocalisedClause));
        return new TextDelegate.Model("FOOTER_LIST_ID", new TextLocalisedClause(((Number) pair.f186385a).intValue(), (List) pair.f186386b, null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
    }

    public static aw0.h b(c cVar, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, int i) {
        TextLocalisedClause textLocalisedClause3 = (i & 1) != 0 ? null : textLocalisedClause;
        if ((i & 2) != 0) {
            textLocalisedClause2 = null;
        }
        cVar.getClass();
        return new aw0.h(false, new n6(textLocalisedClause3, LargeActionButton.ButtonStyle.f58725a, null, "MAIN_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), new n6(textLocalisedClause2, LargeActionButton.ButtonStyle.f58726b, null, "SECONDARY_BUTTON_TAG", false, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION), null, null, null, 113);
    }

    public static CellDetailsDelegate.Model e(bx1.a clauseDisplayInfo) {
        Intrinsics.checkNotNullParameter(clauseDisplayInfo, "clauseDisplayInfo");
        int i = 0;
        return new CellDetailsDelegate.Model("FREQUENCY_LIST_ID", new t0((Clause) new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_frequency_title, null, null, 14), (Image) null, 0, false, 30), clauseDisplayInfo.a(new a(i)), clauseDisplayInfo.b(new a(i)), null, null, null, 0, null, false, false, null, null, 32752);
    }

    public static Clause f(Clause moneyClause, boolean z) {
        Intrinsics.checkNotNullParameter(moneyClause, "moneyClause");
        return z ? new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_up_to_title, zhm.u.c(moneyClause), null, 12) : moneyClause;
    }

    public static CellDetailsDelegate.Model h(DebtorAlias debtorAlias) {
        if (debtorAlias == null) {
            return null;
        }
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("PAY_ID_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.mandate_details_PayID_title, null, null, 14), (Image) null, 0, false, 30), new TextClause(debtorAlias.f62018b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, 0, null, false, false, null, null, 32760);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static List i(tb2.a aVar) {
        RowDelegate.Model model;
        TextLocalisedClause textLocalisedClause;
        RowDelegate.Model model2 = null;
        if (aVar != null) {
            io3.d dVar = aVar.f269435a;
            int i = b.f234603a[aVar.f269436b.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_payment_from_joint, null, null, 14);
                }
                model = null;
            } else {
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_payment_from_personal, null, null, 14);
            }
            dj0.d dVarJ = z92.f.j(dVar);
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(dVar.f163147c, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, null, false, null, false, 62);
            Object[] elements = {textLocalisedClause, new CurrencyClause(dVarJ.f115083b, null, null, 6)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            model = new RowDelegate.Model("POCKET_LIST_ID", image40, new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12), null, 0, k(dVarJ), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
        } else {
            model = null;
        }
        ListSubheaderDelegate.Model model3 = model != null ? new ListSubheaderDelegate.Model("PAYMENT_FROM_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.mandate_details_payment_from_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530) : null;
        if (model != null) {
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            model2 = model;
        }
        koi.j[] elements2 = {model3, model2};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        return kotlin.collections.d.L(elements2);
    }

    public static ListSubheaderDelegate.Model j(boolean z) {
        return new ListSubheaderDelegate.Model("PAY_TO_DETAIL_SUBHEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.mandate_details_authorisation_payto_details_title, null, null, 14), z ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, z, false, (Clause) null, false, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 262114);
    }

    public static MoneyClause k(dj0.d dVar) {
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
    }

    public final CellDetailsDelegate.Model c(String listId, TextLocalisedClause title, bx1.a date) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(date, "date");
        return new CellDetailsDelegate.Model(listId, new t0((Clause) title, (Image) null, 0, false, 30), date.a(new a(this, 1)), date.b(new a(this, 2)), null, null, null, 0, null, false, false, null, null, 32752);
    }

    public final CellDetailsDelegate.Model d(bx1.a description) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new CellDetailsDelegate.Model("DESCRIPTION_LIST_ID", new t0((Clause) new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.mandate_details_description_title, null, null, 14), (Image) null, 0, false, 30), description.a(new p5a.m(this, 28)), description.b(new p5a.m(this, 29)), null, null, null, 0, null, false, false, null, null, 32752);
    }

    public final CellDetailsDelegate.Model g(bx1.a aVar) {
        if (aVar == null) {
            return null;
        }
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("LAST_PAYMENT_AMOUNT_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.mandate_details_last_payment_amount_title, null, null, 14), (Image) null, 0, false, 30), aVar.a(new p5a.m(this, 26)), aVar.b(new p5a.m(this, 27)), null, null, null, 0, null, false, false, null, null, 32752);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }
}
