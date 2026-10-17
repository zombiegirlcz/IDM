package ebh;

import a0.d;
import android.os.Parcelable;
import cbh.j;
import cbh.z;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.wealth.api.domain.model.transactions.InvestTransaction;
import f1h.e;
import h30.l;
import ip0.pb0;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import zhm.a0;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f124358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f124359b;

    public c(e investTransactionsCommonMapper, z transactionsScrollingHandler) {
        Intrinsics.checkNotNullParameter(investTransactionsCommonMapper, "investTransactionsCommonMapper");
        Intrinsics.checkNotNullParameter(transactionsScrollingHandler, "transactionsScrollingHandler");
        this.f124358a = investTransactionsCommonMapper;
        this.f124359b = transactionsScrollingHandler;
    }

    public static ArrayList a(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new pb0(d.n("LOADING_PREFIX_ID_", i2)));
        }
        return arrayList;
    }

    public final ArrayList b(List list, boolean z, j jVar) {
        int i;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (hashSet.add(((InvestTransaction) obj2).getF85125a().getId())) {
                arrayList.add(obj2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList) {
            LocalDate localDate = Instant.ofEpochMilli(q.o(((InvestTransaction) obj3).getF85125a())).atZone(ZoneId.systemDefault()).toLocalDate();
            Object objU = linkedHashMap.get(localDate);
            if (objU == null) {
                objU = l.u(linkedHashMap, localDate);
            }
            ((List) objU).add(obj3);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = linkedHashMap.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it8.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it8.next();
            LocalDate localDate2 = (LocalDate) entry.getKey();
            List<InvestTransaction> list2 = (List) entry.getValue();
            String strS = l.s("TRANSACTIONS_DATE_HEADER_ID_", localDate2);
            Intrinsics.h(localDate2);
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(strS, (Image) null, (Clause) new TimeClause(ebm.a.P(localDate2), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
            ArrayList arrayList3 = new ArrayList();
            for (InvestTransaction investTransaction : list2) {
                RowDelegate.Model modelA = this.f124358a.a(investTransaction, new q1h.b(q1h.a.ONLY_TIME), new f1h.d(investTransaction, jVar.f22818a, false));
                if (modelA != null) {
                    arrayList3.add(modelA);
                }
            }
            Pair pair = arrayList3.isEmpty() ? null : new Pair(model, arrayList3);
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayList2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            Pair pair2 = (Pair) obj4;
            ListSubheaderDelegate.Model model2 = (ListSubheaderDelegate.Model) pair2.f186385a;
            List listO = (List) pair2.f186386b;
            if (i == v.j(arrayList2) && z) {
                listO = i2b.a.o(listO, a(3));
            }
            a0.x(yp0.b.g(listO, model2, null, 0, 0, 126), arrayList4);
            i = i2;
        }
        return arrayList4;
    }
}
