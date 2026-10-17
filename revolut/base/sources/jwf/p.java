package jwf;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.transport.api.R$string;
import com.revolut.feature.transport.impl.common.TransportHubLocation;
import ip0.gu;
import ip0.zj;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements jki.p {

    @NotNull
    public static final o Companion = new o();

    public static ResourceImage b(int i) {
        return new ResourceImage(i, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, null, null, 52, 52, 31), (Clause) null, 190);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        List listK;
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TransportHubLocation transportHubLocation = domainState.f178977a;
        if (transportHubLocation instanceof TransportHubLocation.Unknown) {
            listK = v.k(new gu("LOADING_HEADER", 0, 0, 30), nvf.h.a(3));
        } else if (transportHubLocation instanceof TransportHubLocation.NoLocation) {
            FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("WIDGET_NO_LOCATION_ID", new TextLocalisedClause(R$string.transport_hub_tab_transit_widget_no_location_subtitle, null, null, 14), null, new ComplexImage.Regular(b(R$drawable.uikit_icn_24_location_pin)), new l6(12, new TextLocalisedClause(R$string.transport_hub_tab_transit_no_location_cta_title, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, d.CHOOSE_CITY, null, null, 1604);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            listK = v.k(model, nvf.l.a());
        } else {
            if (!(transportHubLocation instanceof TransportHubLocation.Selected)) {
                throw new NoWhenBranchMatchedException();
            }
            listK = (List) iii.c.f(domainState.f178979c, new jt2.d(this, 26), new jul.c(this, 8), new j75.i(this, domainState, 19));
        }
        return new i(listK);
    }
}
