package k5l;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.globalsearch.api.R$string;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k50.a4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import o97.e0;
import o97.g0;
import o97.y;
import te0.w;
import tjf.l0;
import tof.a3;
import tof.db;
import zhm.d0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f181583b;

    public /* synthetic */ k(n nVar, int i) {
        this.f181582a = i;
        this.f181583b = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f181582a;
        int i2 = 1;
        int i3 = 2;
        n nVar = this.f181583b;
        switch (i) {
            case 0:
                Boolean featureEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(featureEnabled, "featureEnabled");
                if (!Intrinsics.f(featureEnabled, Boolean.TRUE)) {
                    if (Intrinsics.f(featureEnabled, Boolean.FALSE)) {
                        return w.h(new Data(f0.f322471a, null, false, 6, null));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                wsg.n nVar2 = nVar.f181587b;
                r rVarH0 = nVar2.h0(w4l.h.f294642c);
                r map = nVar2.E(AccountId.Personal.f51414a).x().map(new k3k.l(new a4(15), 14));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return pd.b.r(nim.a.w(mif.a.d(rVarH0, map), new a4(11)), new k(nVar, i2));
            case 1:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                l0 l0Var = nVar.d;
                List list = pockets;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((io3.d) it8.next()).f163145a);
                }
                db dbVar = new db(d0.i1(arrayList));
                m70.a.c(t0.f186434a);
                return nim.a.w(nim.a.w(shf.a.a(l0Var, dbVar, "", 4, null, null, SyslogConstants.LOG_CLOCK), new a4(14)), new k(nVar, i3));
            default:
                m transactions = (m) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                List list2 = transactions.f181584a;
                if (list2.isEmpty()) {
                    return f0.f322471a;
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.search_block_recent_transactions_title, null, null, 14);
                o97.d0 g0Var = list2.size() > 3 ? new g0(textLocalisedClause, new TextLocalisedClause(R$string.search_block_header_see_all, null, null, 14), "JUNIOR_RECENT_PARENT_TRANSACTION_SECTION_LIST_ID", new y(o97.r.JUNIOR_RECENT_TRANSACTIONS, transactions, null, 60)) : new o97.f0(textLocalisedClause, "JUNIOR_RECENT_PARENT_TRANSACTION_SECTION_LIST_ID");
                List<a3> listV0 = d0.V0(list2, 3);
                ArrayList arrayList2 = new ArrayList(zhm.w.t(listV0, 10));
                for (a3 a3Var : listV0) {
                    arrayList2.add(RowDelegate.Model.x(((anf.k) nVar.f181588c).p(a3Var, transactions.f181585b, new thf.f(false, 3)), null, null, null, null, null, 0, null, false, null, new y(o97.r.JUNIOR_RECENT_TRANSACTIONS, a3Var, null, 60), 0, 0, 0, 0, null, -4194305, 15));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return v.k(g0Var, new e0(arrayList2));
        }
    }
}
