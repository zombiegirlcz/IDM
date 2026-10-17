package j0a;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.core.R$string;
import hx7.q;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zm3.l;
import zm3.p;

/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public static Clause a(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        if (contact instanceof l) {
            l lVar = (l) contact;
            return q.K(lVar) ? yoj.b.w(yoj.b.w(new TextClause(j6.a.q("@", lVar.N0()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new DotDividerClause((Integer) null)), new TextLocalisedClause(R$string.revolut_user_kind_business, null, null, 14)) : new TextClause(j6.a.q("@", lVar.N0()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (contact instanceof zm3.f) {
            return new TextClause(((zm3.f) contact).f323345a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (contact instanceof zm3.e) {
            return new TextClause(((zm3.e) contact).f323340a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (contact instanceof p) {
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        throw new NoWhenBranchMatchedException();
    }
}
