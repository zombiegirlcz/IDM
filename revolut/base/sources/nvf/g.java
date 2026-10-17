package nvf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.Base64Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.models.TransportTicketLogo;
import com.revolut.feature.transport.models.TransportTicketProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    @NotNull
    public static final e Companion = new e();

    public g(k transportDetailsFieldMapper) {
        Intrinsics.checkNotNullParameter(transportDetailsFieldMapper, "transportDetailsFieldMapper");
    }

    public final aim.e a(String str, wi0.b bVar, TransportTicketProvider transportTicketProvider, List list) {
        Image base64Image;
        ArrayList arrayListA = null;
        CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("TRANSIT_LOCATION_INFO_CITY_ID", new TextLocalisedClause(R$string.transport_ticket_details_city_title, null, null, 14), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, new CountryImage(bVar.f297794a, (Integer) null, (ez0.e) null, 14), false, null, 0, 0, 0, 0, 1040360);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.transport_ticket_details_provider_title, null, null, 14);
        TextClause textClause = new TextClause(transportTicketProvider.f92598a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TransportTicketLogo transportTicketLogo = transportTicketProvider.f92599b;
        int i = f.f219586a[transportTicketLogo.f92596a.ordinal()];
        if (i == 1) {
            base64Image = new Base64Image(transportTicketLogo.f92597b, (ImageTransformations) null, 6);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            base64Image = new UrlImage(transportTicketLogo.f92597b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
        }
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("TRANSIT_LOCATION_INFO_PROVIDER_ID", textLocalisedClause, textClause, null, null, false, 0, null, null, null, null, 0, base64Image, false, null, 0, 0, 0, 0, 1040360);
        if (list != null) {
            arrayListA = k.a(list);
        }
        aim.e eVarB = u.b();
        eVarB.add(model);
        eVarB.add(model2);
        if (arrayListA != null) {
            eVarB.addAll(arrayListA);
        }
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }
}
