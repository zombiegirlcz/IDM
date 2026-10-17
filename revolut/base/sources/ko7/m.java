package ko7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.e9;
import com.revolut.core.ui_kit.delegates.w8;
import com.revolut.core.ui_kit.delegates.x8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.location.api.domain.models.location.LocationDomain;
import java.util.List;
import jki.p;
import kkf.b4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl7.n;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static g b() {
        e9 e9Var = new e9("MAP_ADDRESS_ITEM_LOADING_ID", null, true, yv0.j.DP_120, 486);
        yp0.b.l(e9Var, 0, 0, 0, 0, null, false, 63);
        return new g(u.c(e9Var));
    }

    public static g c(boolean z, Address address, LocationDomain locationDomain, boolean z3) {
        RowDelegate.Model model;
        RowDelegate.Model model2;
        if (z) {
            model = new RowDelegate.Model("POST_CODE_ID", n.i(R$drawable.uikit_icn_24_warning, Integer.valueOf(R$attr.uikit_colorOrange)), new TextLocalisedClause(R$string.car_insurance_address_confirmation_cell_no_eircode_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.car_insurance_address_confirmation_cell_no_eircode_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        } else {
            model = null;
        }
        qv0.i model3 = locationDomain == null ? new RowDelegate.Model("ADDRESS_FALLBACK_ITEM_ID", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_utilities, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextClause(o51.a.b(address, null), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856) : new w8("MAP_ADDRESS_ITEM_ID", new TextClause(o51.a.b(address, null), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new x8(locationDomain.f78066a, locationDomain.f78067b), null, null, null, null, null, 0, 0, 64500);
        yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
        if (z3) {
            model2 = new RowDelegate.Model("RENEWAL_HINT_ID", n.k(R$drawable.uikit_icn_24_lightbulb, false, null, 15), new TextLocalisedClause(R$string.car_insurance_address_confirmation_renewal_hint, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        } else {
            model2 = null;
        }
        qv0.i[] elements = {model, model3, model2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new g(z ? new TextLocalisedClause(R$string.car_insurance_address_confirmation_primary_action_button_no_eircode_title, null, null, 14) : new TextLocalisedClause(R$string.car_insurance_common_yes_continue, null, null, 14), new TextLocalisedClause(R$string.car_insurance_address_confirmation_secondary_action_button_title, null, null, 14), kotlin.collections.d.L(elements), true, !z);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f186252a, new knd.a(this, 18), new b4(29), new joa.j(domainState, this, 29));
    }
}
