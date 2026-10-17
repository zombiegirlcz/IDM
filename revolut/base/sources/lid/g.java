package lid;

import com.revolut.feature.rev_points.models.EarningBadge;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mid.y;
import mid.z;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g {
    public static final ArrayList a(String placementId, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i = 0;
        for (Object obj2 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            z zVar = (z) obj2;
            Intrinsics.checkNotNullParameter(zVar, "<this>");
            Intrinsics.checkNotNullParameter(placementId, "placementId");
            EarningBadge earningBadgeA = b.a(zVar.getBadge());
            arrayList.add(new y(zVar.getId(), zVar.getTitle(), zVar.getSubtitle(), zVar.getLogoUrl(), earningBadgeA, c.a(zVar.getCampaignOffer(), placementId, Integer.valueOf(i), earningBadgeA)));
            i = i2;
        }
        return arrayList;
    }
}
