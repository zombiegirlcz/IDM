package lsl;

import com.revolut.data.model.Data;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.statements.api.models.ProductStatementPeriods;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsArticle;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import ggc.g0;
import ggc.h0;
import ip0.nb0;
import ip0.pb0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jsl.v;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;
import zhm.d0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f199698b;

    public /* synthetic */ d(int i, Object obj2, List list) {
        this.f199697a = i;
        this.f199698b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        switch (this.f199697a) {
            case 0:
                return v.a((v) obj2, null, null, null, this.f199698b, 7);
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                List list = this.f199698b;
                IntRange intRange = new IntRange(1, 3, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                vim.f it8 = intRange.iterator();
                while (it8.f289625c) {
                    arrayList.add(nb0.b(pb0.Companion, a0.d.n("id_credit_card_statement_details_transaction_loading_", it8.nextInt()), false, 0, false, 30));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                ArrayList arrayListE0 = d0.E0(arrayList, list);
                yp0.b.k(arrayListE0, 0, 0, 0, 0, 31);
                return arrayListE0;
            case 2:
                av3.j revolut = (av3.j) obj2;
                Intrinsics.checkNotNullParameter(revolut, "revolut");
                return d0.F0(revolut, this.f199698b);
            case 3:
                return m5e.h.c((m5e.h) obj2, null, null, null, null, null, null, null, null, null, null, this.f199698b, null, null, null, null, 31743);
            case 4:
                return m5e.h.c((m5e.h) obj2, null, null, null, null, null, null, null, null, null, null, null, this.f199698b, null, null, null, 30719);
            case 5:
                List list2 = this.f199698b;
                Intrinsics.h(list2);
                return ma.g.a((ma.g) obj2, null, list2, 1);
            case 6:
                ((mbg.b) obj2).getClass();
                List bookings = this.f199698b;
                Intrinsics.checkNotNullParameter(bookings, "bookings");
                return new mbg.b(bookings);
            case 7:
                return mhd.n.a((mhd.n) obj2, null, this.f199698b, null, null, null, false, null, ISO781611.SMT_TAG);
            case 8:
                return mle.h.a((mle.h) obj2, null, false, null, null, this.f199698b, null, 47);
            case 9:
                List rewards = (List) obj2;
                Intrinsics.checkNotNullParameter(rewards, "rewards");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : rewards) {
                    ArrayList arrayList3 = ((g0) obj3).e;
                    if (!arrayList3.isEmpty()) {
                        Iterator it9 = arrayList3.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                if (this.f199698b.contains(((h0) it9.next()).f143631a)) {
                                    arrayList2.add(obj3);
                                }
                            }
                        }
                    }
                }
                return arrayList2;
            case 10:
                return mwk.i.f((mwk.i) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f199698b, null, 25165823);
            case 11:
                return mwk.i.f((mwk.i) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f199698b, null, null, null, null, null, null, null, null, 33488895);
            case 12:
                return mwk.i.f((mwk.i) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f199698b, null, null, null, null, null, null, null, 33423359);
            case 13:
                return mwk.i.f((mwk.i) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f199698b, 16777215);
            case 14:
                return mwk.i.f((mwk.i) obj2, null, null, null, null, null, null, null, null, null, null, null, null, this.f199698b, null, null, null, null, null, null, null, null, null, null, null, null, 33550335);
            case 15:
                Boolean expanded = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(expanded, "expanded");
                return new Pair(this.f199698b, expanded);
            case 16:
                Boolean expanded2 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(expanded2, "expanded");
                return new Pair(this.f199698b, expanded2);
            case 17:
                Boolean expanded3 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(expanded3, "expanded");
                return new Pair(this.f199698b, expanded3);
            case 18:
                Boolean expanded4 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(expanded4, "expanded");
                return new Pair(this.f199698b, expanded4);
            case 19:
                List instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                List<WealthNewsArticle> list3 = this.f199698b;
                ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                for (WealthNewsArticle wealthNewsArticle : list3) {
                    ArrayList arrayListC = n0k.f.c(wealthNewsArticle);
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj4 : instruments) {
                        if (arrayListC.contains(((InstrumentTicker) obj4).f105112b)) {
                            arrayList5.add(obj4);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(w.t(arrayList5, 10));
                    Iterator it10 = arrayList5.iterator();
                    while (it10.hasNext()) {
                        arrayList6.add(new rzj.h((InstrumentTicker) it10.next()));
                    }
                    arrayList4.add(new rzj.a(wealthNewsArticle, d0.P0(arrayList6, new n0k.e())));
                }
                return arrayList4;
            case 20:
                return n1j.m.e((n1j.m) obj2, null, null, null, null, null, null, null, null, this.f199698b, 255);
            case 21:
                return n23.g.a((n23.g) obj2, this.f199698b, null, 2);
            case 22:
                return n3j.n.a((n3j.n) obj2, null, null, 0, null, this.f199698b, 31);
            case 23:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                ProductStatementPeriods productStatementPeriods = (ProductStatementPeriods) pair.f186385a;
                LocalDate localDate = (LocalDate) pair.f186386b;
                List list4 = this.f199698b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it11 = list4.iterator();
                while (it11.hasNext()) {
                    linkedHashSet.add(z92.f.l((io3.d) it11.next()));
                }
                return new n47.f(linkedHashSet, localDate, productStatementPeriods);
            case 24:
                List serviceConfigs = (List) obj2;
                Intrinsics.checkNotNullParameter(serviceConfigs, "serviceConfigs");
                List<FavouritesAssetTypeKey> list5 = this.f199698b;
                ArrayList arrayList7 = new ArrayList(w.t(list5, 10));
                for (FavouritesAssetTypeKey favouritesAssetTypeKey : list5) {
                    Iterator it12 = serviceConfigs.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            next = it12.next();
                            if (Intrinsics.f(((z3d.b) next).f319246a, favouritesAssetTypeKey)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    z3d.b bVar = (z3d.b) next;
                    if (bVar == null) {
                        bVar = new z3d.b(favouritesAssetTypeKey, 300);
                    }
                    arrayList7.add(bVar);
                }
                return arrayList7;
            case 25:
                ((naf.d) obj2).getClass();
                List positions = this.f199698b;
                Intrinsics.checkNotNullParameter(positions, "positions");
                return new naf.d(positions);
            case 26:
                ba0.d transactions = (ba0.d) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return new Pair(this.f199698b, transactions);
            case 27:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                e7l.f fVar = (e7l.f) pair2.f186385a;
                List list6 = (List) pair2.f186386b;
                LinkedHashSet linkedHashSet2 = fVar.M;
                ArrayList arrayList8 = new ArrayList(w.t(linkedHashSet2, 10));
                Iterator it13 = linkedHashSet2.iterator();
                while (it13.hasNext()) {
                    arrayList8.add(new p5d.b((String) it13.next(), "commodity", null));
                }
                Set setH0 = d0.h0(this.f199698b, d0.i1(arrayList8));
                int iB = q0.b(w.t(setH0, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj5 : setH0) {
                    p5d.b bVar2 = (p5d.b) obj5;
                    Iterator it14 = list6.iterator();
                    while (true) {
                        if (it14.hasNext()) {
                            next2 = it14.next();
                            if (Intrinsics.f(((io3.d) next2).f163147c, bVar2.f233095a)) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    io3.d dVar = (io3.d) next2;
                    linkedHashMap.put(obj5, new p5d.c(true, (dVar != null ? dVar.i : 0L) > 0));
                }
                return linkedHashMap;
            case 28:
                Data dataP = zi0.c.P(this.f199698b, false, null, 3);
                String postalCode = ((ni1.f) obj2).f215623a;
                Intrinsics.checkNotNullParameter(postalCode, "postalCode");
                return new ni1.f(dataP, postalCode);
            default:
                return nje.f.a((nje.f) obj2, null, null, null, null, this.f199698b, null, null, LDSFile.EF_DG15_TAG);
        }
    }

    public /* synthetic */ d(List list, int i) {
        this.f199697a = i;
        this.f199698b = list;
    }
}
