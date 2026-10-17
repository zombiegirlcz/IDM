package vuc;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.security_hub.api.R$string;
import com.revolut.feature.security_hub.impl.ui.linked_wallets.host.LinkedWalletsScreenContract$TabItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements cli.n {
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        Clause textLocalisedClause;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean z = domainState.d;
        List list = domainState.f292318a;
        TextLocalisedClause textLocalisedClause2 = z ? new TextLocalisedClause(R$string.security_hub_home_card_connections, null, null, 14) : new TextLocalisedClause(R$string.security_hub_linked_wallets_header_title, null, null, 14);
        if (z) {
            List listK = v.k(new TextLocalisedClause(R$string.security_hub_home_card_connections_subtitle, null, null, 14), new TextLocalisedClause(R$string.security_hub_home_card_connections_learn_more, null, new Click(30, (Integer) null, (Object) null, "LINKED_WALLETS_DESCRIPTION_LEARN_MORE_ID", false), 10));
            m70.a.t(t0.f186434a);
            textLocalisedClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        } else {
            textLocalisedClause = new TextLocalisedClause(R$string.security_hub_linked_wallets_header_subtitle, null, null, 14);
        }
        Clause clause = textLocalisedClause;
        List<LinkedWalletsScreenContract$TabItem> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (LinkedWalletsScreenContract$TabItem linkedWalletsScreenContract$TabItem : list2) {
            arrayList.add(new com.revolut.core.ui_kit.views.q(linkedWalletsScreenContract$TabItem.getF94249a(), new com.revolut.core.ui_kit.views.t(linkedWalletsScreenContract$TabItem.getE().b()), 58));
        }
        return new o(textLocalisedClause2, clause, arrayList, z ? domainState.f292320c.getId() : null, list.size() < 2);
    }
}
