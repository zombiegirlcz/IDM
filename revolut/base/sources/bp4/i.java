package bp4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {
    public static TextLocalisedClause a(wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        wi0.b.Companion.getClass();
        return Intrinsics.f(countryCode, wi0.b.O) ? new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_title_co, null, null, 14) : new TextLocalisedClause(R$string.credit_card_details_dialog_overdue_title, null, null, 14);
    }
}
