package a0e;

import com.revolut.data.model.Data;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import com.revolut.feature.statements.api.models.StatementPeriod;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wxd.z;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class y {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static String a(r state) {
        xxd.b bVar;
        StatementPeriodSelection statementPeriodSelection;
        StatementPeriod statementPeriod;
        yxd.c cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        if (b(state.f367g) || b(state.e) || state.i != u.READY || (bVar = state.f369j) == null || (statementPeriodSelection = bVar.f309509b) == null || (statementPeriod = statementPeriodSelection.f88218b) == null || (cVar = state.f370l) == null) {
            return null;
        }
        aim.f builder = new aim.f();
        for (z zVar : cVar.f317662a) {
            if (zVar != z.SHOW_AMOUNTS_IN) {
                List list = (List) cVar.f317664c.get(zVar);
                if (list == null) {
                    list = f0.f322471a;
                }
                if (zVar == z.ACCOUNTS_FILTER) {
                    Set set = state.f;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (set.contains((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    builder.put(zVar.b(), list);
                } else {
                    if (list.isEmpty()) {
                        return null;
                    }
                    builder.put(zVar.b(), list);
                }
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        aim.f fVarB = builder.b();
        rlm.t tVar = new rlm.t();
        hx7.q.S(tVar, "productId", state.f364a);
        hx7.q.T(tVar, "period", new x(statementPeriod, 0));
        if (!fVarB.isEmpty()) {
            hx7.q.T(tVar, "settings", new a0.c(fVarB, 3));
        }
        String value = tVar.a().toString();
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    public static boolean b(Data data) {
        return data.getError() != null && pyd.c.E(data);
    }

    public static boolean c(r state) {
        List list;
        Intrinsics.checkNotNullParameter(state, "state");
        return b(state.e) || b(state.f367g) || !(state.f366c == null || (list = (List) state.e.getContent()) == null || !list.isEmpty());
    }
}
