package bp4;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {
    public static Clause a(String str, wi0.b bVar) {
        if (str != null) {
            return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVar, wi0.b.f297756l) ? new TextLocalisedClause(R$string.credit_card_back_up_card_add_popup_description_au, null, null, 14) : new TextLocalisedClause(R$string.credit_card_back_up_card_add_popup_description, null, null, 14);
    }

    public static TextLocalisedClause b(wi0.b bVar) {
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVar, wi0.b.f297756l) ? new TextLocalisedClause(R$string.credit_management_backup_card_au, null, null, 14) : new TextLocalisedClause(R$string.credit_management_backup_card, null, null, 14);
    }
}
