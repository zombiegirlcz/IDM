package apd;

import com.revolut.feature.spending_analytics.api.models.NetWorthAccount;
import com.revolut.retail.feature.api.balance_history.models.BalancePendingError;
import com.revolut.rxdata.core.CompositeException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;
import zod.h0;
import zod.l0;
import zod.n0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8158a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f8159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f8160c;
    public final /* synthetic */ xi0.b d;

    public /* synthetic */ c(f fVar, List list, List list2, xi0.b bVar) {
        this.f8159b = list;
        this.f8160c = list2;
        this.d = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        List list;
        switch (this.f8158a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                CompositeException compositeException = error instanceof CompositeException ? (CompositeException) error : null;
                if (compositeException == null || (list = compositeException.f104678a) == null) {
                    z = error instanceof BalancePendingError;
                } else {
                    List list2 = list;
                    z = false;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it8 = list2.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                if (((Throwable) it8.next()) instanceof BalancePendingError) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                if (!z) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                n0 n0Var = new n0(this.f8159b, this.f8160c, this.d, h0.f323995a, l0.f324007a, NetWorthAccount.Personal.f87455a);
                od0.i.Companion.getClass();
                return od0.h.a(n0Var);
            default:
                Map vestingPockets = (Map) obj2;
                Intrinsics.checkNotNullParameter(vestingPockets, "vestingPockets");
                List<io3.d> list3 = this.f8159b;
                ArrayList arrayList = new ArrayList(w.t(list3, 10));
                for (io3.d dVar : list3) {
                    arrayList.add(wsg.n.I(dVar, this.f8160c, (io3.d) vestingPockets.get(dVar), this.d));
                }
                return arrayList;
        }
    }

    public /* synthetic */ c(List list, wsg.n nVar, List list2, xi0.b bVar) {
        this.f8159b = list;
        this.f8160c = list2;
        this.d = bVar;
    }
}
