package sgg;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import com.revolut.feature.travel.miles.impl.ui.screen.account_registration_tax_id.TravelMilesAccountRegistrationTaxIdScreenContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements n {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelMilesAccountRegistrationTaxIdScreenContract$InputData f262659a;

    public l(TravelMilesAccountRegistrationTaxIdScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f262659a = inputData;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        cli.k domainState = (cli.k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.miles_airline_details_account_linking_tax_id_label, null, null, 14);
        TravelMilesAccountRegistrationTaxIdScreenContract$InputData travelMilesAccountRegistrationTaxIdScreenContract$InputData = this.f262659a;
        List listC = u.c(new CellDetailsDelegate.Model("TAX_ID_ITEM_ID", textLocalisedClause, new TextClause(travelMilesAccountRegistrationTaxIdScreenContract$InputData.f94262a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 0, null, null, null, null, null, false, 0, 0, 32760));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        String str = travelMilesAccountRegistrationTaxIdScreenContract$InputData.d;
        TravelMilesProvider travelMilesProvider = travelMilesAccountRegistrationTaxIdScreenContract$InputData.f94263b;
        if (str == null) {
            str = travelMilesProvider.f94104b;
        }
        return new g(listC, new lw0.a(new TextLocalisedClause(R$string.miles_airline_details_account_linking_tax_id_title, u.c(str), null, 12), new CompositeClause(v.k(new TextLocalisedClause(R$string.miles_airline_details_account_linking_tax_id_description, v.k(str, str), null, 12), new TextLocalisedClause(R$string.miles_airline_details_account_linking_tax_id_sign_up, null, new Click(30, (Integer) null, (Object) null, "SIGN_UP_TEXT_CLICK_ID", false), 10)), new TextClause(m70.a.o(t0.f186434a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), new lw0.b(new UrlImage(travelMilesProvider.d, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (ez0.h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090), null), null, false, 24));
    }
}
