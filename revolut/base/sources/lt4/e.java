package lt4;

import aw0.m6;
import aw0.n6;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardLargeButtonModel;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardModelAction;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e {
    public static n6 a(CreditCardLargeButtonModel item) {
        Intrinsics.checkNotNullParameter(item, "item");
        m6 m6Var = n6.Companion;
        TextClause textClause = new TextClause(item.f68844a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButtonA = g.a(item.f68846c);
        CreditCardModelAction creditCardModelAction = item.f68845b;
        return m6.c(m6Var, textClause, defaultFilledButtonA, null, null, false, null, null, creditCardModelAction != null ? g.d(creditCardModelAction) : null, 508);
    }
}
