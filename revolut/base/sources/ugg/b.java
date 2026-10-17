package ugg;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImageDrawable;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.miles.api.R$string;
import com.revolut.feature.travel.miles.api.model.TravelMilesAccount;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import com.youTransactor.uCube.rpc.Constants;
import ez0.h;
import hfg.b0;
import ip0.xh0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import qv0.l;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static l a(TravelMilesAirline airline) {
        Clause textClause;
        Intrinsics.checkNotNullParameter(airline, "airline");
        TravelMilesProvider travelMilesProvider = airline.f94091g;
        String str = airline.f94088a;
        List list = airline.i;
        TravelMilesAccount travelMilesAccount = travelMilesProvider.f;
        boolean z = (travelMilesAccount == null || Intrinsics.f(travelMilesAccount.f94083b, "GIFT_CARD")) ? false : true;
        b0 b0Var = list.size() == 1 ? (b0) d0.b0(list) : b0.MILES;
        String strQ = j6.a.q("AIRLINE_ITEM_ID_", str);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(new UrlImage(airline.e, (String) null, (UrlImageDrawable) UrlImageDrawable.Shimmering.INSTANCE, 0L, 0L, (UrlImage.CustomHeaders) null, (Integer) null, (Integer) null, (h) null, (Image) null, false, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), (Integer) null, (Integer) null, false, false, (Clause) null, 516090), z ? new AccentCircleBadge(dw0.a.Link) : null, null, false, null, false, 60);
        TextClause textClause2 = new TextClause(airline.f94089b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = a.f280033a[b0Var.ordinal()];
        if (i == 1 || i == 2) {
            textClause = new TextClause(airline.f94090c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else if (i == 3) {
            textClause = new TextLocalisedClause(R$string.miles_airline_details_header_revpay_subtitle, null, null, 14);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            textClause = new TextLocalisedClause(R$string.miles_airline_details_header_giftcards_subtitle, null, null, 14);
        }
        RowDelegate.Model model = new RowDelegate.Model(strQ, image40, textClause2, null, 0, textClause, null, null, 0, null, false, null, false, null, null, null, null, null, null, airline, null, 0, 0, 0, 0, 532676568);
        if (z) {
            return new wh(j6.a.q("AIRLINE_ITEM_ID_", str), model, u.c(new SwipeToActionDelegate.SwipeAction("ACCOUNT_UNLINK_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_logout_door, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.miles_providers_action_unlink_account, null, null, 14), xh0.PRIMARY, null, null, null, 112)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        }
        return model;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static qv0.l b(u2f.d r52, java.util.List r53) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ugg.b.b(u2f.d, java.util.List):qv0.l");
    }
}
