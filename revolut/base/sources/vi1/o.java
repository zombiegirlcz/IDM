package vi1;

import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.address.common.api.R$string;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import s7a.c0;
import vdl.c1;
import vi1.n;
import vkm.z1;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class o extends x7a.d {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rh1.b f289511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1 f289512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wkm.l f289513c;

    public o(rh1.b addressFlowInteractor) {
        Intrinsics.checkNotNullParameter(addressFlowInteractor, "addressFlowInteractor");
        this.f289511a = addressFlowInteractor;
        z1 z1VarB = vkm.q.b(0, 6, null);
        this.f289512b = z1VarB;
        this.f289513c = vkm.q.Q(t1.d(z1VarB, 500L), new c1((Continuation) null, this, 8));
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        return new j((String) d0.J0(ids));
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        qv0.o model;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        Object content = data.getContent();
        List list2 = content instanceof List ? (List) content : null;
        if (list2 == null) {
            return f0.f322471a;
        }
        List<n> list3 = list2;
        ArrayList arrayList = new ArrayList(w.t(list3, 10));
        for (n nVar : list3) {
            if (nVar instanceof m) {
                m mVar = (m) nVar;
                String str = mVar.f289509a;
                model = new RowDelegate.Model(str, null, new TextClause(str, (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), null, 0, null, null, null, 0, null, false, null, selectedModelIds.contains(mVar.f289509a), null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536862714);
            } else {
                if (!(nVar instanceof n.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                model = new FullScreenStateDelegate.Model("LIST_ID_EMPTY_SEARCH_QUERY", new TextLocalisedClause(R$string.shared_address_flow_address_search_results, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, null, null, null, false, null, null, false, R$attr.uikit_dp8, 0, 30716);
            }
            arrayList.add(model);
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        wi0.b bVar = obj2 instanceof wi0.b ? (wi0.b) obj2 : null;
        if (bVar != null) {
            if (query.length() < 3) {
                return zi0.c.i(u.c(n.a.f289510a));
            }
            this.f289512b.k(new l(bVar, query));
            return this.f289513c;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a0.d.m(obj2, "Country is mandatory, "));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return zi0.c.i(f0.f322471a);
    }
}
