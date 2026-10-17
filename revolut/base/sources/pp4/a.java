package pp4;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class a {
    public static CompositeClause a(el4.e eVar) {
        dj0.d dVar = eVar.f;
        CompositeClause compositeClause = dVar != null ? new CompositeClause(v.k(new TextLocalisedClause(R$string.additional_cards_details_cardholder_spent, null, null, 14), new TextLocalisedClause(R$string.additional_cards_details_cardholder_spent_amount, u.c(sx4.f.b(3, null, null, dVar)), null, 12)), sx4.g.e(1), null, null, 12) : null;
        dj0.d dVar2 = eVar.f127252g;
        CompositeClause[] elements = {compositeClause, dVar2 != null ? new CompositeClause(v.k(new TextLocalisedClause(R$string.additional_cards_details_cardholder_available, null, null, 14), new TextLocalisedClause(R$string.additional_cards_details_cardholder_available_amount, u.c(sx4.f.b(3, null, null, dVar2)), null, 12)), sx4.g.e(1), null, null, 12) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        if (listL.isEmpty()) {
            return null;
        }
        return new CompositeClause(listL, new DotDividerClause((Integer) null), null, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList b(java.util.List r32) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pp4.a.b(java.util.List):java.util.ArrayList");
    }
}
