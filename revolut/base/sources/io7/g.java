package io7;

import android.os.Parcelable;
import aw0.ka;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.Survey;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        Answer.PenaltyPoints penaltyPoints;
        Answer.ClaimsState claimsState;
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextClause textClause = new TextClause(domainState.f163196a.a(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        AdditionalDriver additionalDriver = domainState.f163196a;
        ContactImage contactImage = new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, additionalDriver.a(), (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063);
        aim.e eVarB = u.b();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_driver_details_cells_date_of_birth, null, null, 14);
        LocalDate localDate = additionalDriver.d;
        ZonedDateTime zonedDateTime = additionalDriver.f75165h;
        ZonedDateTime zonedDateTime2 = additionalDriver.f75164g;
        a0.x(yp0.b.g(v.k(new CellDetailsDelegate.Model("BIRTH_DATE_ID", textLocalisedClause, xl7.n.h(localDate), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("RELATIONSHIP_ID", new TextLocalisedClause(R$string.car_insurance_driver_details_cells_relationship, null, null, 14), xl7.b.a(additionalDriver.e), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552)), new ListSubheaderDelegate.Model("DETAILS_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.car_insurance_driver_details_headers_details, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), eVarB);
        Survey survey = additionalDriver.f;
        Survey.Licence licence = survey.f75314a;
        if (licence != null) {
            List listK = v.k(new CellDetailsDelegate.Model("LICENCE_TYPE_ID", new TextLocalisedClause(R$string.car_insurance_driver_details_cells_driving_licence, null, null, 14), xl7.d.g(licence.f75327a), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552), new CellDetailsDelegate.Model("LICENCE_PERIOD_ID", new TextLocalisedClause(R$string.car_insurance_driver_details_cells_licence_years, null, null, 14), xl7.d.b(licence.f75328b), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            a0.x(listK, eVarB);
        }
        Survey.Claims claims = survey.d;
        CellDetailsDelegate.Model model = (claims == null || (claimsState = claims.f75317a) == null) ? null : new CellDetailsDelegate.Model("CLAIMS_ID", new TextLocalisedClause(R$string.car_insurance_driver_details_cells_claims_or_accidents, null, null, 14), xl7.d.a(claimsState), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
        Survey.LicencePenalties licencePenalties = survey.e;
        CellDetailsDelegate.Model[] elements = {model, (licencePenalties == null || (penaltyPoints = licencePenalties.f75329a) == null) ? null : new CellDetailsDelegate.Model("PENALTY_POINTS_ID", new TextLocalisedClause(R$string.car_insurance_driver_details_cells_penalty_points, null, null, 14), xl7.d.c(penaltyPoints), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        a0.x(listL, eVarB);
        if (zonedDateTime2 != null) {
            CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("EFFECTIVE_DATE_ID", zonedDateTime == null ? new TextLocalisedClause(R$string.car_insurance_driver_details_cells_effective_date, null, null, 14) : new TextLocalisedClause(R$string.car_insurance_driver_details_cells_effective_period, null, null, 14), zonedDateTime == null ? xl7.n.f(zonedDateTime2, new TimeClause.Format.DayAndMonth(ka.SHORT), true, 4) : xl7.n.a(zonedDateTime2, zonedDateTime, true), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model2);
        }
        return new e(u.a(eVarB), textClause, contactImage);
    }
}
