package j0a;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.social.impl.R$string;
import hx7.q;
import ip0.ak0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.u;
import zhm.v;
import zm3.j;
import zm3.l;
import zm3.p;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static TextDelegate.Model a(zm3.a contact, boolean z) {
        TextClause textClause;
        Intrinsics.checkNotNullParameter(contact, "contact");
        if ((contact instanceof zm3.g) || (contact instanceof p)) {
            return null;
        }
        if (!(contact instanceof l)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!z) {
            return null;
        }
        int i = R$string.social_payments_chat_user_blocked_footer;
        l lVar = (l) contact;
        if (lVar instanceof j) {
            textClause = new TextClause(q.y((j) lVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            if (!(lVar instanceof zm3.i)) {
                throw new NoWhenBranchMatchedException();
            }
            textClause = new TextClause(q.x(((zm3.i) lVar).e), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        List listK = v.k(new TextLocalisedClause(i, u.c(textClause), null, 12), new TextLocalisedClause(R$string.social_payments_chat_user_blocked_footer_unblock, null, new Click(30, (Integer) null, (Object) null, "UNBLOCK_CLAUSE_LIST_ID", false), 10));
        m70.a.t(t0.f186434a);
        return new TextDelegate.Model("USER_COMPLETELY_BLOCKED_LIST_ID", new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
    }
}
