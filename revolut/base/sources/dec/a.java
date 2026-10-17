package dec;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static TextClause a(PaymentMethod.Card card) {
        Intrinsics.checkNotNullParameter(card, "card");
        return new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(card.d.a(), " ··", card.f84372c), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
