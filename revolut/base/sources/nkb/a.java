package nkb;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.revolut.retail.common.ui.R$string;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import rp0.d0;
import rp0.y;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final y a(ProductGroup.ExplanationWithLabel explanationWithLabel) {
        Intrinsics.checkNotNullParameter(explanationWithLabel, "<this>");
        return d0.a(new TextClause(explanationWithLabel.f86552a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(explanationWithLabel.f86553b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, Unit.f186387a, 1000);
    }

    public static final CompositeClause b(ProductGroup.TextWithExplanation textWithExplanation, Object obj2) {
        TextClause textClause;
        Intrinsics.checkNotNullParameter(textWithExplanation, "<this>");
        HtmlClause htmlClause = new HtmlClause(0, 30, (Integer) null, (Object) null, textWithExplanation.f86588a);
        ProductGroup.ExplanationWithLabel explanationWithLabel = textWithExplanation.f86589b;
        if (explanationWithLabel != null) {
            textClause = new TextClause(explanationWithLabel.f86554c, (Style) new Click(28, (Integer) null, obj2, v0.a.i(v0.a.m("ExplanationWithLabel(title=", explanationWithLabel.f86552a, ", description=", explanationWithLabel.f86553b, ", actionLabel="), explanationWithLabel.f86554c, ")"), false), (Integer) null, false, (o9) null, (List) null, 124);
        } else {
            textClause = null;
        }
        Clause[] elements = {htmlClause, textClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = d.L(elements);
        m70.a.t(t0.f186434a);
        return new CompositeClause(listL, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
