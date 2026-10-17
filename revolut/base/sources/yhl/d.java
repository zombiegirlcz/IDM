package yhl;

import com.revolut.shared.feature.wealth_discovery.domain.api.CorporateEventsApi$Toggles$BondCouponEvents;
import com.revolut.shared.feature.wealth_discovery.domain.api.CorporateEventsApi$Toggles$NoteEvents;
import efm.r;
import iel.a0;
import iel.k;
import iel.m;
import iel.o;
import iel.p;
import iel.q;
import iel.x;
import iel.y;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import phl.j;
import s7a.m0;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f314175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f314176b;

    public d(j corporateEventsRepository, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(corporateEventsRepository, "corporateEventsRepository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f314175a = corporateEventsRepository;
        this.f314176b = featureToggleInteractor;
    }

    public static r c(d dVar, String str, LocalDate localDate, LocalDate localDate2, boolean z, Set eventsToInclude, String str2, Integer num, iel.f fVar, int i) {
        List listC;
        if ((i & 1) != 0) {
            str = null;
        }
        String str3 = str;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(eventsToInclude, "eventsToInclude");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = eventsToInclude.iterator();
        while (it8.hasNext()) {
            switch (c.f314174b[((iel.e) it8.next()).ordinal()]) {
                case 1:
                    listC = u.c(o0.f186429a.b(k.class));
                    break;
                case 2:
                    p0 p0Var = o0.f186429a;
                    listC = v.k(p0Var.b(iel.d.class), p0Var.b(x.class));
                    break;
                case 3:
                    listC = u.c(o0.f186429a.b(p.class));
                    break;
                case 4:
                    listC = u.c(o0.f186429a.b(o.class));
                    break;
                case 5:
                    listC = u.c(o0.f186429a.b(y.class));
                    break;
                case 6:
                    listC = u.c(o0.f186429a.b(a0.class));
                    break;
                case 7:
                    listC = u.c(o0.f186429a.b(iel.h.class));
                    break;
                case 8:
                    listC = u.c(o0.f186429a.b(iel.r.class));
                    break;
                case 9:
                    listC = u.c(o0.f186429a.b(iel.v.class));
                    break;
                case 10:
                    listC = u.c(o0.f186429a.b(iel.b.class));
                    break;
                case 11:
                    p0 p0Var2 = o0.f186429a;
                    listC = v.k(p0Var2.b(iel.c.class), p0Var2.b(m.class));
                    break;
                case 12:
                    listC = u.c(o0.f186429a.b(iel.g.class));
                    break;
                case 13:
                    listC = u.c(o0.f186429a.b(q.class));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            zhm.a0.x(listC, arrayList);
        }
        Set setI1 = d0.i1(arrayList);
        j jVar = dVar.f314175a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.w(jVar.f.e(new phl.a(str3, localDate, localDate2, z, str2, num, fVar), loadingStrategy), new m0(28, setI1));
    }

    public final Set a() {
        iel.e eVar;
        ArrayList arrayListB = b();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = arrayListB.iterator();
        while (it8.hasNext()) {
            switch (c.f314173a[((iel.j) it8.next()).ordinal()]) {
                case 1:
                    eVar = iel.e.MARKET_HOLIDAY;
                    break;
                case 2:
                    eVar = iel.e.DIVIDENDS;
                    break;
                case 3:
                    eVar = iel.e.DIVIDENDS;
                    break;
                case 4:
                    eVar = iel.e.STOCK_SPLIT;
                    break;
                case 5:
                    eVar = iel.e.LISTING_CHANGE;
                    break;
                case 6:
                    eVar = iel.e.SYMBOL_CHANGE;
                    break;
                case 7:
                    eVar = iel.e.COMPANY_MEETING;
                    break;
                case 8:
                    eVar = iel.e.EX_DIVIDEND;
                    break;
                case 9:
                    eVar = iel.e.MERGER;
                    break;
                case 10:
                    eVar = iel.e.SPINOFF;
                    break;
                case 11:
                    eVar = iel.e.BANKRUPTCY;
                    break;
                case 12:
                case 13:
                    eVar = iel.e.COUPON;
                    break;
                case 14:
                    eVar = iel.e.CALL;
                    break;
                case 15:
                    eVar = iel.e.PRINCIPAL;
                    break;
                case 16:
                    eVar = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (eVar != null) {
                arrayList.add(eVar);
            }
        }
        return d0.i1(arrayList);
    }

    public final ArrayList b() {
        Pair pair;
        EnumEntries<iel.j> enumEntriesA = iel.j.a();
        ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
        for (iel.j jVar : enumEntriesA) {
            int i = c.f314173a[jVar.ordinal()];
            gte.a aVar = this.f314176b;
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    pair = new Pair(jVar, Boolean.TRUE);
                    break;
                case 9:
                case 10:
                case 11:
                    pair = new Pair(jVar, Boolean.TRUE);
                    break;
                case 12:
                    pair = new Pair(jVar, Boolean.valueOf(((jte.d) aVar).c(CorporateEventsApi$Toggles$BondCouponEvents.f105363c)));
                    break;
                case 13:
                case 14:
                case 15:
                    pair = new Pair(jVar, Boolean.valueOf(((jte.d) aVar).c(CorporateEventsApi$Toggles$NoteEvents.f105365c)));
                    break;
                case 16:
                    pair = new Pair(jVar, Boolean.FALSE);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(pair);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Boolean) ((Pair) obj2).f186386b).booleanValue()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            arrayList3.add((iel.j) ((Pair) it8.next()).f186385a);
        }
        return arrayList3;
    }

    public final vkm.d d(String id10, boolean z, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        j jVar = this.f314175a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return jVar.f236358g.b(new phl.k(id10, z), loadingStrategy);
    }
}
