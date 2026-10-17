package cv7;

import aw0.o9;
import cnc.t;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_embedded.api.models.RemoteDocument;
import com.revolut.feature.insurance_embedded.impl.R$string;
import com.revolut.feature.insurance_embedded.impl.ui.screen.detail.EmbeddedInsuranceDetailScreenContract$InputData;
import cul.n0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements jki.p {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EmbeddedInsuranceDetailScreenContract$InputData f109319a;

    public r(EmbeddedInsuranceDetailScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f109319a = inputData;
    }

    public static CdnImage b(dl7.a aVar) {
        switch (q.f109318a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return wu7.b.a(wu7.a.PurchaseProtection);
            case 4:
                return wu7.b.a(wu7.a.RefundProtection);
            case 5:
                return wu7.b.a(wu7.a.TicketCancellation);
            case 6:
                return wu7.b.a(wu7.a.CarHire);
            case 7:
                return wu7.b.a(wu7.a.PersonalLiability);
            case 8:
                return wu7.b.a(wu7.a.TravelInsurance);
            case 9:
                return wu7.b.a(wu7.a.WinterSport);
            case 10:
            case 11:
            case 12:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static RowDelegate.Model c(String str, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, RemoteDocument remoteDocument) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_document, Integer.valueOf(R$attr.uikit_colorAccent), R$attr.uikit_colorAccent_10, 8.0f, null, null, 48), null, null, false, null, false, 62), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false), false, null, false, null, null, null, null, null, null, new i(textLocalisedClause, remoteDocument), null, 0, 0, 0, 0, 532675544);
    }

    public static TextLocalisedClause d(wi0.b bVar) {
        wi0.b.Companion.getClass();
        return (Intrinsics.f(bVar, wi0.b.f297756l) || Intrinsics.f(bVar, wi0.b.l2)) ? new TextLocalisedClause(R$string.embedded_insurance_travel_details_product_summary_subtitle_au, null, null, 14) : new TextLocalisedClause(R$string.embedded_insurance_travel_details_product_summary_subtitle, null, null, 14);
    }

    public static TextLocalisedClause e(wi0.b bVar) {
        wi0.b.Companion.getClass();
        return (Intrinsics.f(bVar, wi0.b.f297756l) || Intrinsics.f(bVar, wi0.b.l2)) ? new TextLocalisedClause(R$string.embedded_insurance_travel_details_product_summary_title_au, null, null, 14) : new TextLocalisedClause(R$string.embedded_insurance_travel_details_product_summary_title, null, null, 14);
    }

    public static Clause f(dl7.a aVar) {
        switch (q.f109318a[aVar.ordinal()]) {
            case -1:
            case 10:
            case 11:
            case 12:
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
                return new TextLocalisedClause(R$string.embedded_insurance_details_purchase_protection_title, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.embedded_insurance_details_refund_protection_title, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.embedded_insurance_details_ticket_cancellation_title, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.embedded_insurance_details_car_hire_excess_title, null, null, 14);
            case 7:
                return new TextLocalisedClause(R$string.embedded_insurance_details_personal_liability_title, null, null, 14);
            case 8:
                return new TextLocalisedClause(R$string.embedded_insurance_details_travel_insurance_title, null, null, 14);
            case 9:
                return new TextLocalisedClause(R$string.embedded_insurance_details_winter_sports_cover_title, null, null, 14);
        }
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        j domainState = (j) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (m) iii.c.f(domainState.f109304a, new n0(this, 8), new t(this, 24), new cf1.h(this, domainState, 12));
    }
}
