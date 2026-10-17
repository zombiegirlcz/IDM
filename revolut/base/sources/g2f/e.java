package g2f;

import android.os.Parcelable;
import aw0.o9;
import aw0.x4;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.trade_rev_points.api.R$string;
import grl.b4;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    public static List a(u2f.d agent) {
        List listN;
        String str;
        Intrinsics.checkNotNullParameter(agent, "agent");
        u2f.e eVar = agent.f276629s;
        if (eVar != null) {
            ArrayList arrayList = eVar.f276631a;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            int i = 0;
            for (Object obj2 : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                u2f.f fVar = (u2f.f) obj2;
                arrayList2.add(new ReferralContactDelegate.Model(a0.d.n("BRAND_ITEM_ID", i), new AvatarModel.Default(new UrlImage(fVar.f276634b, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, null, null, null, 126), new TextClause(fVar.f276633a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, null, 8184));
                i = i2;
            }
            listN = c6d.b.N(arrayList2);
        } else {
            listN = null;
        }
        if (listN != null) {
            List list = listN;
            u2f.e eVar2 = agent.f276629s;
            ArrayList arrayListE0 = d0.E0(v.l((eVar2 == null || (str = eVar2.f276632b) == null) ? null : new ReferralContactDelegate.Model("MORE_BRANDS_ITEM_ID", new AvatarModel.Default(new GlyphImage(R$drawable.uikit_icn_24_ellipsis, null, null, 6), null, null, null, null, null, 126), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, agent, null, 6136)), list);
            gg.b bVar = new gg.b(false, 3);
            int i3 = R$attr.uikit_dp16;
            List listI = yp0.b.i(new hg("BRANDS_SCROLLER_ITEM_ID", arrayListE0, 4, x4.c.f10604a, null, bVar, false, false, null, null, i3, i3, i3, i3, b4.EXPIRED_OR_INVALID_KEY_VALUE), new ListSubheaderDelegate.Model("BRANDS_SUB_HEADER_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.trade_rev_points_agent_details_brands_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            if (listI != null) {
                return listI;
            }
        }
        return f0.f322471a;
    }
}
