package a1g;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.feature.travel.experiences.api.R$plurals;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public abstract class d {
    public static final CompositeClause a(int i, Integer num) {
        Object[] elements = {new TextClause("(", (Style) null, num, false, (o9) null, (List) null, 122), new TextLocalisedQuantityClause(R$plurals.experiences_common_reviews, Integer.valueOf(i), u.c(new NumberClause(i, (NumberClause.Format) new NumberClause.Format.Compact(true), (Style) new Custom(num, false, null, false, null, 254))), new Custom(num, false, null, false, null, 254), 8), new TextClause(")", (Style) null, num, false, (o9) null, (List) null, 122)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
    }
}
