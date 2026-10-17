package uod;

import android.graphics.Color;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.spending_analytics.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kad.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.r;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        NumberClause numberClause;
        PercentageClause percentageClause;
        Iterator it8;
        PercentageClause percentageClause2;
        CdnImage cdnImage;
        CdnImage cdnImage2;
        char c2;
        r rVar;
        uod.a domainState = (uod.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CdnImage cdnImage3 = new CdnImage("story_bg", "mobile/analytics/globe", null, null, null, null, Constants.TAG_OS_VERSION);
        CdnImage cdnImage4 = new CdnImage("card_bg", "mobile/analytics/globe", null, null, null, null, Constants.TAG_OS_VERSION);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_travel, (Integer) null, Integer.valueOf(Color.parseColor("#1326FD")), (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, Constants.TAG_SUPPORTED_LOCALE_LIST);
        Image image = domainState.d;
        Integer num = domainState.f281621g;
        ResourceImage resourceImage2 = new ResourceImage(R$drawable.uikit_icn_revolut_logo, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.trips_share_card_user_name, u.c(domainState.f281618a), null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.trips_share_card_date_since, u.c(domainState.f281620c.toLocalDate().format(DateTimeFormatter.ofPattern("MM.yyyy"))), null, 12);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.trips_list_header_countries, null, null, 14);
        NumberClause numberClause2 = new NumberClause(domainState.f281619b.size(), (NumberClause.Format.Compact) null, (Custom) null, 6);
        Integer num2 = domainState.f;
        if (num2 != null) {
            numberClause = numberClause2;
            percentageClause = new PercentageClause(num2.intValue(), (PercentageClause.Format) null, (Custom) null, 6);
        } else {
            numberClause = numberClause2;
            percentageClause = null;
        }
        TextLocalisedClause textLocalisedClause4 = num2 != null ? new TextLocalisedClause(R$string.trips_list_header_percentage_world, null, null, 14) : null;
        TextClause textClause = new TextClause(String.valueOf(num.intValue()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        PercentageClause percentageClause3 = percentageClause;
        TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.trips_list_header_trips, null, null, 14);
        List list = domainState.e;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            kad.a aVar = (kad.a) it9.next();
            if (aVar instanceof kad.b) {
                it8 = it9;
                percentageClause2 = percentageClause3;
                cdnImage = cdnImage3;
                cdnImage2 = cdnImage4;
                c2 = 14;
                rVar = new r("INSTAGRAM", new TextLocalisedClause(R$string.trips_share_button_instagram, null, null, 14), Integer.valueOf(R$drawable.uikit_icn_24_logo_instagram));
            } else {
                it8 = it9;
                percentageClause2 = percentageClause3;
                cdnImage = cdnImage3;
                cdnImage2 = cdnImage4;
                c2 = 14;
                if (aVar instanceof kad.d) {
                    rVar = new r("X", new TextLocalisedClause(R$string.trips_share_button_x, null, null, 14), Integer.valueOf(R$drawable.uikit_icn_24_logo_twitter));
                } else if (aVar instanceof kad.c) {
                    rVar = new r("WHATSAPP", new TextLocalisedClause(R$string.trips_share_button_whatsapp, null, null, 14), Integer.valueOf(R$drawable.uikit_icn_24_logo_whatsapp));
                } else {
                    if (!(aVar instanceof a.C1040a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rVar = new r("MORE", new TextLocalisedClause(R$string.trips_share_button_more, null, null, 14), Integer.valueOf(R$drawable.uikit_icn_24_more));
                }
            }
            arrayList.add(new ActionsView.Item((String) rVar.f314201a, null, false, null, null, (TextLocalisedClause) rVar.f314202b, new ResourceImage(((Number) rVar.f314203c).intValue(), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, aVar, null, 24478));
            it9 = it8;
            percentageClause3 = percentageClause2;
            cdnImage3 = cdnImage;
            cdnImage4 = cdnImage2;
        }
        return new b(cdnImage3, cdnImage4, image, resourceImage, resourceImage2, textLocalisedClause, textLocalisedClause2, textLocalisedClause3, numberClause, percentageClause3, textLocalisedClause4, textClause, textLocalisedClause5, arrayList);
    }
}
