package kh5;

import aw0.m6;
import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.common.ui.R$string;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements n {
    public static n9l.a a(List list, eh5.b bVar) {
        Object next;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((n9l.a) next).f213661a, bVar.f125736a)) {
                break;
            }
        }
        return (n9l.a) next;
    }

    @Override // cli.n
    public final o c(j jVar) {
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), null, null, 55), (List) iii.c.f(domainState.f184065a, new kh4.b(this, 2), new kd8.f(16), new joa.j(this, domainState, 20)), new lw0.a(new TextLocalisedClause(com.revolut.feature.crypto.locked.balance.impl.R$string.crypto_locked_balances_bottom_sheet_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.crypto.locked.balance.impl.R$string.crypto_locked_balances_bottom_sheet_description, null, null, 14), null, null, false, 28));
    }
}
