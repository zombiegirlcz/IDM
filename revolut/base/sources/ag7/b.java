package ag7;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import go.g;
import java.util.ArrayList;
import java.util.List;
import jf7.l1;
import jf7.n;
import jf7.o;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements xf7.b {

    @NotNull
    public static final a Companion = new a();

    @Override // xf7.b
    public final Flow a(l1 l1Var) {
        Object objG;
        o block = (o) l1Var;
        Intrinsics.checkNotNullParameter(block, "block");
        List list = block.f173699b;
        if (list.isEmpty()) {
            objG = f0.f322471a;
        } else {
            ListSubheaderDelegate.Model modelA = xf7.a.a(j6.a.q("CAROUSEL_TITLE_LIST_ID_", block.f173698a), new TextClause(block.f173698a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null);
            List<n> list2 = list;
            ArrayList arrayList = new ArrayList(w.t(list2, 10));
            for (n nVar : list2) {
                arrayList.add(new RewardDelegate.Model(j6.a.q("CAROUSEL_ITEM_LIST_ID_", nVar.f173693b), (Image) new UrlImage(nVar.f173692a, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation(Float.valueOf(1.0f), Integer.valueOf(R$attr.uikit_colorForeground_5), false, 8), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902), (Clause) new TextClause(nVar.f173693b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (CompositeClause) null, (RewardDelegate.a) null, false, (Object) null, (AnalyticsContext) null, 888));
            }
            int i = R$attr.uikit_dp8;
            objG = yp0.b.g(u.c(new eg("CAROUSEL_SCROLLER_LIST_ID", arrayList, null, BitmapDescriptorFactory.HUE_RED, true, null, i, i, 0, 0, 26604)), modelA, null, 0, 0, 126);
        }
        return new g(objG, 2);
    }
}
