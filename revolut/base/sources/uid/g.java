package uid;

import aw0.n6;
import aw0.o9;
import aw0.t0;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shops.impl.R$plurals;
import com.revolut.feature.shops.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.b9;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import mx0.f3;
import mx0.h3;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Double d = domainState.f280378a;
        double d5 = domainState.f280380c;
        double d6 = domainState.d;
        boolean z = d != null && d.doubleValue() > d6;
        boolean z3 = d5 >= (d != null ? d.doubleValue() : 0.0d);
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.shops_screens_auction_details_section_details_next_bid_title, null, null, 14), null, null, null, false, 30);
        List list = domainState.f280379b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            double dDoubleValue = ((Number) obj2).doubleValue();
            arrayList.add(new bw0.d(4, new TextClause(String.valueOf((long) dDoubleValue), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), nub.a.h(dDoubleValue, null, null, 7)));
            i = i2;
            z = z;
        }
        boolean z4 = z;
        String str = (d == null || d.doubleValue() <= 0.0d) ? "" : NumberFormat.getIntegerInstance().format((long) d.doubleValue());
        Intrinsics.h(str);
        boolean z6 = domainState.e;
        int i3 = R$plurals.shops_screens_custom_input_points_suffix_plain;
        Long lN = z.n(str);
        bw0.h hVar = new bw0.h(str, null, new TextLocalisedQuantityClause(i3, Long.valueOf(lN != null ? lN.longValue() : 0L), (List) null, (Style) null, 28), z4, null, Boolean.valueOf(z6), false, false, bw0.e.SuggestionsElseCalculator, new bw0.f(arrayList), null, null, 29650);
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_rev_points_default, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        TextLocalisedQuantityClause textLocalisedQuantityClauseP = nub.a.p(d5, null, new nub.b(0), 5);
        h3 h3Var = h3.ACTIVE;
        if (!z3) {
            h3Var = null;
        }
        if (h3Var == null) {
            h3Var = h3.ERROR;
        }
        CenteredAmountDelegate.Model model = new CenteredAmountDelegate.Model("AMOUNT_ITEM_ID", null, hVar, new f3(resourceImage, textLocalisedQuantityClauseP, null, false, h3Var, true), null, null, b9.WRAP_CONTENT, null, null, null, null, null, null, 8114);
        CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("CURRENT_BID_ITEM_ID", new t0((Clause) new TextLocalisedClause(R$string.shops_screens_custom_input_current_bid_title, null, null, 14), (Image) null, 0, false, 30), nub.a.p(d6, null, null, 7), null, null, null, null, 0, null, false, false, null, null, 32760);
        yp0.b.l(model2, R$attr.uikit_dp32, 0, 0, 0, null, false, 62);
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, "CONTINUE_BUTTON_TAG", z4, null, null, 972), null, null, 55), v.k(model, model2), aVar);
    }
}
