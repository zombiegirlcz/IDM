package pid;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import hjd.d;
import hjd.z;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mid.h;
import mid.k;
import mid.q;
import o97.r;
import o97.y;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public a(z shopsBadgeMapper) {
        Intrinsics.checkNotNullParameter(shopsBadgeMapper, "shopsBadgeMapper");
    }

    public static RowDelegate.Model a(q qVar, h hVar, String str, RowDelegate.Model.c.a aVar) {
        String str2 = qVar.f205746a;
        String str3 = qVar.f205747b;
        String str4 = qVar.f205748c;
        String str5 = qVar.d;
        Integer numValueOf = Integer.valueOf(qVar.f);
        StringBuilder sbM = v0.a.m("ShopsSearchElement(id=", str2, ", title=", str3, ", subtitle=");
        j6.a.D(sbM, str4, ", logoUrl=", str5, ", ");
        sbM.append(str);
        sbM.append(", position=");
        sbM.append(numValueOf);
        sbM.append(")");
        return new RowDelegate.Model(sbM.toString(), new RowDelegate.Model.MainImage.Image24(new UrlImage(qVar.d, null, null, null, 0L, null, null, null, null, null, false, d.f152705a, null, null, false, false, 507902), false, false, 6), new TextClause(qVar.f205747b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, str4 != null ? new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, aVar, false, null, false, null, null, null, null, null, null, new y(r.SHOPS_BRANDS, new k(qVar.e, hVar), null, 60), new AnalyticsContext(zid.a.b(hVar)), 0, 0, 0, 0, 524286936);
    }
}
