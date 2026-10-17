package o2e;

import android.os.Parcelable;
import aw0.o9;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.store.api.R$string;
import i26.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    public static List a(String subheaderListId, String rowListIdPrefix, List list) {
        List listN;
        Intrinsics.checkNotNullParameter(subheaderListId, "subheaderListId");
        Intrinsics.checkNotNullParameter(rowListIdPrefix, "rowListIdPrefix");
        return (list == null || (listN = c6d.b.N(list)) == null) ? f0.f322471a : yp0.b.g(c(rowListIdPrefix, listN), new ListSubheaderDelegate.Model(subheaderListId, (Image) null, (Clause) new TextLocalisedClause(R$string.store_mega_offer_details_shops_campaign_instructions_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }

    public static List b(List list, boolean z, String controlListId, String rowListIdPrefix) {
        List listN;
        Intrinsics.checkNotNullParameter(controlListId, "controlListId");
        Intrinsics.checkNotNullParameter(rowListIdPrefix, "rowListIdPrefix");
        if (list == null || (listN = c6d.b.N(list)) == null) {
            return f0.f322471a;
        }
        aim.e eVarB = u.b();
        eVarB.add(new CellDetailsDelegate.Model(controlListId, new t0((Clause) new TextLocalisedClause(R$string.store_mega_offer_details_shops_campaign_instructions_title, null, null, 14), (Image) null, 0, false, 30), null, null, m2e.d.f201960a, null, null, 0, new ResourceImage(z ? R$drawable.uikit_icn_24_chevron_up : R$drawable.uikit_icn_24_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), false, true, null, null, 27576));
        if (z) {
            ArrayList arrayListC = c(rowListIdPrefix, listN);
            l.E(arrayListC);
            eVarB.addAll(arrayListC);
        }
        return u.a(eVarB);
    }

    public static ArrayList c(String rowListIdPrefix, List instructions) {
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        Intrinsics.checkNotNullParameter(rowListIdPrefix, "rowListIdPrefix");
        List list = instructions;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList.add(new RowDelegate.Model(p.a.o(rowListIdPrefix, i), new RowDelegate.Model.MainImage.Image24(com.revolut.core.ui_kit_core.displayers.image.models.a.b(i2, Integer.valueOf(R$attr.uikit_colorBackground), Integer.valueOf(R$attr.uikit_colorForeground), null, 8), false, false, 6), new TextClause((String) obj2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868856));
            i = i2;
        }
        return arrayList;
    }
}
