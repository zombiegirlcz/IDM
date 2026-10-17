package lyd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.statements.R$string;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s7a.c0;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends x7a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kdh.b f200788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f200789b;

    public f(kdh.b providerResolver, e mapperResolver) {
        Intrinsics.checkNotNullParameter(providerResolver, "providerResolver");
        Intrinsics.checkNotNullParameter(mapperResolver, "mapperResolver");
        this.f200788a = providerResolver;
        this.f200789b = mapperResolver;
    }

    @Override // x7a.d
    public final Clause a(Set preSelectedModelIds, Set ids) {
        Intrinsics.checkNotNullParameter(preSelectedModelIds, "preSelectedModelIds");
        Intrinsics.checkNotNullParameter(ids, "ids");
        return ids.isEmpty() ? new TextLocalisedClause(R$string.documents_hub_custom_form_filter_action_select, null, null, 14) : new TextLocalisedClause(R$string.statement_switcher_selected_action, zhm.u.c(Integer.valueOf(ids.size())), null, 12);
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new h(ids);
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        g gVar = obj2 instanceof g ? (g) obj2 : null;
        if (gVar == null) {
            return f0.f322471a;
        }
        String str = gVar.f200790a;
        Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-statements-api-navigation-DocumentsHubProduct$-product$0");
        phm.a aVar = (phm.a) this.f200789b.f200787a.get(str);
        d dVar = aVar != null ? (d) aVar.get() : null;
        return dVar == null ? f0.f322471a : (List) iii.c.f(data, new b(1), new lxi.g(6), new lk7.p(dVar, 2, query, selectedModelIds));
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        g gVar = obj2 instanceof g ? (g) obj2 : null;
        if (gVar == null) {
            return new go.g(new Data(null, new IllegalArgumentException("Custom content picker params are required"), false, 5, null), 2);
        }
        String str = gVar.f200790a;
        i iVarM0 = this.f200788a.m0(str, k.FILTER);
        return iVarM0 == null ? new go.g(new Data(null, new IllegalStateException("Custom content provider is not registered for ".concat(str)), false, 5, null), 2) : iVarM0.c();
    }
}
