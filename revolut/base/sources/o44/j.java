package o44;

import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.core.R$string;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ListCellDelegate.Model b(String listId, Clause title, gv3.b bVar) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        int i = R$attr.uikit_dp0;
        return new ListCellDelegate.Model(listId, null, title, null, true, bVar, null, 0, 0, i, i, 968);
    }

    public static List c() {
        return u.c(b("ID_SEARCH_RESULT_PLACEHOLDER_LIST", new TextLocalisedClause(R$string.credit_application_address_plugin_search_hint_results_will_appear_here, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null));
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        i iVar2;
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f221995b;
        return (data == null || (iVar2 = (i) iii.c.f(data, new o2g.f(this, 15), new nz7.g(this, 28), new nrd.i(this, domainState, 12))) == null) ? new i(c()) : iVar2;
    }
}
