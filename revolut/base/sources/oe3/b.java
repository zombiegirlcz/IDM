package oe3;

import anf.o;
import aw0.j0;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.categorization.impl.R$string;
import dj0.d;
import he3.e;
import he3.g;
import he3.h;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k71.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import thf.k;
import thf.l;
import tof.a3;
import tof.v6;
import zhm.a0;
import zhm.d0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f224520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9l.a f224521b;

    public b(l transactionMapper, j9l.a moneyCalculator) {
        Intrinsics.checkNotNullParameter(transactionMapper, "transactionMapper");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        this.f224520a = transactionMapper;
        this.f224521b = moneyCalculator;
    }

    public final ArrayList a(ie3.a content, boolean z) {
        Object next;
        b bVar = this;
        Intrinsics.checkNotNullParameter(content, "content");
        List list = content.f160626a;
        List rates = content.f160627b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : list) {
            h hVar = (h) obj2;
            Integer numValueOf = Integer.valueOf(hVar.f151559a.f272593h.getDayOfYear() + (hVar.f151559a.f272593h.getYear() * 1000));
            Object objU = linkedHashMap.get(numValueOf);
            if (objU == null) {
                objU = v7.u(linkedHashMap, numValueOf);
            }
            ((List) objU).add(obj2);
        }
        ArrayList arrayList = new ArrayList();
        Set setEntrySet = linkedHashMap.entrySet();
        ArrayList arrayList2 = new ArrayList(w.t(setEntrySet, 10));
        Iterator it8 = setEntrySet.iterator();
        while (it8.hasNext()) {
            List list2 = (List) ((Map.Entry) it8.next()).getValue();
            xi0.b bVar2 = content.d;
            h hVar2 = (h) d0.b0(list2);
            ArrayList arrayList3 = new ArrayList();
            List<h> list3 = list2;
            for (h hVar3 : list3) {
                v6 v6Var = hVar3.f151559a.f;
                if (v6Var == v6.PENDING || v6Var == v6.COMPLETED) {
                    a0.x(hVar3.a(bVar2, true), arrayList3);
                }
            }
            j9l.a aVar = bVar.f224521b;
            d dVarA = z ? aVar.a(bVar2, arrayList3, rates) : null;
            arrayList.add(new ListSubheaderDelegate.Model(j6.a.q("ITEM_GROUP_TITLE_LIST_ID_PREFIX", hVar2.f151559a.f272579a), null, new TimeClause(hVar2.f151559a.f272593h.getMillis(), TimeClause.Format.DateLong.f57962b, null, null, 12), null, dVarA != null ? new MoneyClause(dVarA, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, null, j0.TRANSPARENT, null, null, false, false, null, null, R$attr.uikit_dp32, R$attr.uikit_dp16, 0, 0, 13631402));
            q extraData = content.f160628c;
            ArrayList arrayList4 = new ArrayList();
            for (h txn : list3) {
                Intrinsics.checkNotNullParameter(txn, "txn");
                Intrinsics.checkNotNullParameter(rates, "rates");
                Intrinsics.checkNotNullParameter(extraData, "extraData");
                k kVar = new k(1006, false, false, false, false, false);
                a3 a3Var = txn.f151559a;
                q qVar = extraData;
                wh whVarP = ((o) bVar.f224520a).p(a3Var, qVar, kVar, null, null);
                Iterator it9 = txn.f151560b.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it9.next();
                    if (((g) next) instanceof e) {
                        break;
                    }
                }
                e eVar = (e) next;
                if (eVar != null) {
                    xi0.b bVar3 = k71.k.b(a3Var).f115083b;
                    d dVarA2 = aVar.a(bVar3, d0.F0(k71.k.b(a3Var), eVar.f151557a), rates);
                    d dVarA3 = dVarA2 != null ? dVarA2.a() : new d(0L, bVar3);
                    RowDelegate.Model modelX = (RowDelegate.Model) whVarP.f54925b;
                    RowDelegate.Model.c cVar = modelX.k;
                    RowDelegate.Model.c.b bVar4 = cVar instanceof RowDelegate.Model.c.b ? (RowDelegate.Model.c.b) cVar : null;
                    if (bVar4 != null) {
                        modelX = RowDelegate.Model.x(modelX, null, null, null, null, null, 0, RowDelegate.Model.c.b.a(bVar4, new TextLocalisedClause(R$string.transaction_group_bill_your_share_format, u.c(new MoneyClause(dVarA3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), ISO781611.SMT_TAG), false, null, null, 0, 0, 0, 0, null, -1025, 15);
                    }
                    whVarP = wh.a(whVarP, modelX, null, null, 16381);
                }
                a0.x(u.c(whVarP), arrayList4);
                bVar = this;
                extraData = qVar;
            }
            yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
            arrayList2.add(Boolean.valueOf(arrayList.addAll(arrayList4)));
            bVar = this;
        }
        return arrayList;
    }
}
