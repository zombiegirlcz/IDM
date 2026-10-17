package mag;

import android.os.Parcelable;
import aw0.o9;
import aw0.x4;
import com.revolut.core.ui_kit.delegates.AttributeSelectorSmallDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.delegates.r0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.travel.hotels.api.R$string;
import com.revolut.feature_travel_hotels_models.property.HotelsPointsRedeemOption;
import ip0.nc0;
import ip0.qc0;
import ip0.tc0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;
import qv0.i;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class g {
    public final List a(List list, HotelsPointsRedeemOption hotelsPointsRedeemOption) {
        char c2;
        tc0 tc0Var;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return f0.f322471a;
        }
        qc0 qc0Var = null;
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("REV_POINTS_REDEEM_OPTIONS_SECTION_SUBTITLE_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.hotels_checkout_points_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
        List list3 = list;
        ArrayList items = new ArrayList(w.t(list3, 10));
        String str = null;
        int i = 0;
        for (Object obj2 : list3) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            HotelsPointsRedeemOption hotelsPointsRedeemOption2 = (HotelsPointsRedeemOption) obj2;
            String strN = a0.d.n("REV_POINTS_REDEEM_OPTION_ITEM_ID", i);
            if (Intrinsics.f(hotelsPointsRedeemOption, hotelsPointsRedeemOption2)) {
                str = strN;
            }
            int i3 = R$string.hotels_checkout_points_section_discount_value;
            dj0.d dVar = hotelsPointsRedeemOption2.f97977c;
            MoneyClause.Format.Shorts shorts = new MoneyClause.Format.Shorts(false, 63);
            o9 o9Var = o9.NON_SENSITIVE;
            AttributeSelectorSmallDelegate.Model model2 = new AttributeSelectorSmallDelegate.Model(strN, new TextLocalisedClause(i3, u.c(new MoneyClause(dVar, shorts, null, o9Var, 4)), null, 12), nub.a.l(hotelsPointsRedeemOption2.f97976b, o9Var, nub.d.f219277a, Integer.valueOf(R$attr.uikit_colorForeground), 12.0f, 34), Intrinsics.f(strN, str) ? new r0(v.k(Integer.valueOf(nub.a.f219273b), Integer.valueOf(nub.a.f219274c))) : null, null, false, hotelsPointsRedeemOption2, null, 432);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            items.add(model2);
            i = i2;
            qc0Var = null;
        }
        gg bVar = new gg.b(false, 3);
        int i5 = R$attr.uikit_dp16;
        if ((28624 & 32) != 0) {
            bVar = new gg.c(0);
        }
        gg snapStyle = bVar;
        boolean z = (28624 & 256) != 0;
        qc0 pageTransformation = (28624 & 512) != 0 ? qc0.f165963a : qc0Var;
        int i6 = (28624 & 2048) != 0 ? R$attr.uikit_dp0 : 0;
        if ((28624 & 4096) != 0) {
            i5 = R$attr.uikit_dp0;
        }
        int i21 = i5;
        int i22 = (28624 & 8192) != 0 ? R$attr.uikit_dp0 : 0;
        int i32 = (28624 & 16384) != 0 ? R$attr.uikit_dp0 : 0;
        Intrinsics.checkNotNullParameter("REV_POINTS_REDEEM_OPTIONS_SECTION_ITEM_ID", "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        x4.c heightMode = x4.c.f10604a;
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        Intrinsics.checkNotNullParameter(snapStyle, "snapStyle");
        Intrinsics.checkNotNullParameter(pageTransformation, "pageTransformation");
        if (str != null) {
            c2 = 1;
            tc0Var = new tc0(str, false, 6);
        } else {
            c2 = 1;
            tc0Var = null;
        }
        if ((4194287 & 2) == 0) {
            items = null;
        }
        if ((4194287 & 16) != 0) {
            tc0Var = null;
        }
        Intrinsics.checkNotNullParameter("REV_POINTS_REDEEM_OPTIONS_SECTION_ITEM_ID", "listId");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(heightMode, "heightMode");
        Intrinsics.checkNotNullParameter(snapStyle, "snapStyle");
        nc0 autoPlay = nc0.f165491a;
        Intrinsics.checkNotNullParameter(autoPlay, "autoPlay");
        Intrinsics.checkNotNullParameter(pageTransformation, "pageTransformation");
        c.d positionInBox = c.d.f249513a;
        Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
        hg hgVar = new hg("REV_POINTS_REDEEM_OPTIONS_SECTION_ITEM_ID", items, 3, heightMode, tc0Var, snapStyle, false, autoPlay, null, false, z, pageTransformation, null, null, null, null, i6, i21, i22, i32, positionInBox);
        i[] iVarArr = new i[2];
        iVarArr[0] = model;
        iVarArr[c2] = hgVar;
        return v.k(iVarArr);
    }
}
