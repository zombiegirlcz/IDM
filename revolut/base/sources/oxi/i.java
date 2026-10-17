package oxi;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.airportlounges.impl.R$string;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.modals.help.AirportLoungesHomeHelpScreenContract$InputData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import svi.l;
import svi.p0;
import svi.w;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AirportLoungesHomeHelpScreenContract$InputData f230849a;

    public i(AirportLoungesHomeHelpScreenContract$InputData inputData, qxi.a refundItemMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(refundItemMapper, "refundItemMapper");
        this.f230849a = inputData;
    }

    public static RowDelegate.Model a(int i, TextLocalisedClause textLocalisedClause, String str) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(i, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorGreyTone10), null, null, false, null, false, 60), textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
    }

    @Override // cli.n
    public final o c(j jVar) {
        p0 p0VarV;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        eVarB.add(a(R$drawable.uikit_icn_24_question, new TextLocalisedClause(R$string.airport_lounges_get_help_faq, null, null, 14), "ID_HELP_ITEM_FAQ"));
        eVarB.add(a(R$drawable.uikit_icn_24_document, new TextLocalisedClause(R$string.airport_lounges_get_help_terms_of_use, null, null, 14), "ID_MODAL_HELP_ITEM_TERMS"));
        AirportLoungesHomeHelpScreenContract$InputData airportLoungesHomeHelpScreenContract$InputData = this.f230849a;
        svi.k pass = airportLoungesHomeHelpScreenContract$InputData.f99101a;
        w wVar = airportLoungesHomeHelpScreenContract$InputData.f99102b;
        if (!cp5.d.x(pass) && wVar != null) {
            ArrayList refunds = wVar.f266012a;
            if (!refunds.isEmpty() || cp5.d.v(pass) == null || ((p0VarV = cp5.d.v(pass)) != null && p0VarV.e)) {
                Intrinsics.checkNotNullParameter(pass, "pass");
                Intrinsics.checkNotNullParameter(refunds, "refunds");
                int i = refunds.isEmpty() ? R$string.airport_lounges_get_help_refund_not_available_title : R$string.airport_lounges_get_help_request_a_refund_title;
                int i2 = ((pass instanceof l) && refunds.isEmpty()) ? R$string.airport_lounges_get_help_refund_not_available_no_entries_subtitle : ((pass instanceof svi.j) && refunds.isEmpty()) ? R$string.airport_lounges_get_help_refund_not_available_no_eligible_entries_subtitle : R$string.airport_lounges_get_help_request_a_refund_subtitle;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, null, 14);
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i2, null, null, 14);
                boolean zIsEmpty = refunds.isEmpty();
                eVarB.add(new RowDelegate.Model("ID_MODAL_HELP_ITEM_REFUND", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_revert_left, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorGreyTone10), null, null, false, null, false, 60), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, !zIsEmpty, null, false, !zIsEmpty ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a, null, null, null, null, null, null, null, 0, 0, 0, 0, 536852440));
            }
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return new f(eVarA);
    }
}
