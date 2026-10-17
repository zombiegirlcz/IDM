package gyg;

import aw0.l1;
import com.revolut.data.model.Data;
import gzg.a0;
import ip0.jm0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kp0.q;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kxg.e f147861a;

    public o(kxg.e complexAnalyticsMoneyLineChartMapper) {
        Intrinsics.checkNotNullParameter(complexAnalyticsMoneyLineChartMapper, "complexAnalyticsMoneyLineChartMapper");
        this.f147861a = complexAnalyticsMoneyLineChartMapper;
    }

    public final ArrayList a(String listId, Data data, Function1 minSelector, Function1 maxSelector, Function1 dataSelector, a0 a0Var) {
        List list;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(minSelector, "minSelector");
        Intrinsics.checkNotNullParameter(maxSelector, "maxSelector");
        Intrinsics.checkNotNullParameter(dataSelector, "dataSelector");
        l1.c interpolation = new l1.c(2.0f);
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(interpolation, "interpolation");
        Intrinsics.checkNotNullParameter(minSelector, "minSelector");
        Intrinsics.checkNotNullParameter(maxSelector, "maxSelector");
        Intrinsics.checkNotNullParameter(dataSelector, "dataSelector");
        if (data != null) {
            kxg.e eVar = this.f147861a;
            list = (List) iii.c.f(data, new q(eVar, listId, 25), new kp0.m(eVar, listId, 2), new kxg.c(eVar, listId, interpolation, minSelector, maxSelector, dataSelector, a0Var, 0));
        } else {
            list = null;
        }
        if (list == null) {
            list = f0.f322471a;
        }
        List<qv0.o> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (qv0.o oVarE : list2) {
            if (oVarE instanceof jm0) {
                jm0 jm0Var = (jm0) oVarE;
                oVarE = jm0.e(jm0Var, hyg.a.a(jm0Var), f0.f322471a, 0, 0, 0, 0, -67587);
            }
            arrayList.add(oVarE);
        }
        return arrayList;
    }
}
