package fs9;

import aw0.j8;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.groups.api.R$string;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class g {
    public static j8 a(PaymentGroup group) {
        Clause textLocalisedClause;
        Intrinsics.checkNotNullParameter(group, "group");
        TextClause textClause = new TextClause(group.f79286b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        oq9.a aVar = group.f;
        oq9.e eVar = aVar != null ? aVar.f227798a : null;
        oq9.d dVarC = eVar != null ? eVar.c() : null;
        int i = dVarC == null ? -1 : f.f137659a[dVarC.ordinal()];
        if (i == -1) {
            textLocalisedClause = new TextLocalisedClause(R$string.payments_groups_details_transactions_empty_state_title, null, null, 14);
        } else if (i == 1) {
            textLocalisedClause = new CompositeClause(v.k(new ImageClause(R$drawable.uikit_icn_16_check, Integer.valueOf(R$attr.uikit_colorGreen), (Float) null, (Float) null, 28), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.group_details_header_subtitle_balance_settled_up, null, null, 14)), null, new Custom(Integer.valueOf(R$attr.uikit_colorGreen), false, null, false, null, 254), null, 10);
        } else if (i == 2) {
            textLocalisedClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.payments_groups_widget_common_owe, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(eVar.a(), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), null, 8)), null, null, null, 14);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new CompositeClause(v.k(new TextLocalisedClause(R$string.payments_groups_widget_common_owed, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new MoneyClause(eVar.b(), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(R$attr.uikit_colorGreen), false, null, false, null, 254), null, 8)), null, null, null, 14);
        }
        String str = group.f79287c;
        Image urlImage = str == null ? lq9.a.f199213b : new UrlImage(str, null, null, null, 0L, null, null, null, null, lq9.a.f199213b, true, new ImageTransformations(new CircleTransformation((Float) null, (Integer) null, false, 15), true, false, (Integer) null, (Integer) null, (Integer) null, 505), null, null, false, false, 502782);
        tr9.c.Companion.getClass();
        return new j8(textClause, textLocalisedClause, urlImage, (Image) tr9.c.f273764b.getValue(), 16);
    }
}
