package nqa;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.push_to_card.api.data.Card;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import wpa.b;
import wpa.c;
import wpa.d;
import wpa.e;
import wpa.f;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static final CompositeClause a(String scheme, Integer num, String lastFour) {
        Object textClause;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        f.Companion.getClass();
        f fVarA = b.a(scheme);
        if (fVarA instanceof e) {
            textClause = new TextLocalisedClause(R.string.card_brand_visa, null, null, 14);
        } else if (fVarA instanceof c) {
            textClause = new TextLocalisedClause(R.string.card_brand_mastercard, null, null, 14);
        } else {
            if (!(fVarA instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            textClause = new TextClause(scheme, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new CompositeClause(v.k(textClause, new TextClause(" ··", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(lastFour, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, num != null ? new Custom(num, false, null, false, null, 254) : null, null, 10);
    }

    public static final String b(Card card) {
        Intrinsics.checkNotNullParameter(card, "<this>");
        return j6.a.q("••", card.f81485a);
    }
}
