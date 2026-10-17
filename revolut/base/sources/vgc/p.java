package vgc;

import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.models.RevPointsTransaction;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import m1c.t1;
import nkm.y;
import nyb.m0;
import org.jetbrains.annotations.NotNull;
import tof.i1;
import tof.i7;
import tof.mb;
import tof.oa;
import tof.v6;
import zhm.d0;
import zhm.r0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    @NotNull
    public static final n Companion = new n();
    public static final Set d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nyb.k f288836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f288837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f288838c;

    static {
        t1[] elements = {t1.REWARD, t1.REWARD_RETURN};
        Intrinsics.checkNotNullParameter(elements, "elements");
        d = kotlin.collections.d.y0(elements);
    }

    public p(nyb.k revPointsInteractor, m0 revPointsTransactionsInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(revPointsTransactionsInteractor, "revPointsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f288836a = revPointsInteractor;
        this.f288837b = revPointsTransactionsInteractor;
        this.f288838c = transactionsInteractor;
    }

    public static double a(Map map, List list, List list2) {
        nkm.g gVar = new nkm.g(y.n(y.n(y.x(d0.Q(list), new vga.g(6)), new vga.g(7)), new d3g.y(list2, map, 3)));
        double dJ = 0.0d;
        while (gVar.hasNext()) {
            dJ += ((RevPointsTransaction) gVar.next()).f84056c.J();
        }
        return dJ;
    }

    public static oa d(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((RentAndBillsLinkedPayments.Category.LinkedPayment) it8.next()).f84792b.f84794a);
        }
        List<String> listU = d0.U(arrayList);
        ArrayList arrayList2 = new ArrayList(w.t(listU, 10));
        for (String str : listU) {
            i7.c cVar = i7.Companion;
            mb mbVar = new mb(str);
            v6[] v6VarArr = {v6.COMPLETED};
            cVar.getClass();
            arrayList2.add(i7.c.a(mbVar, i7.c.c(v6VarArr)));
        }
        return new oa(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vgc.p.b(java.util.List, gim.c):java.lang.Object");
    }

    public final vkm.y c(RentAndBillsLinkedPayments linkedPayments, w4l.k loadingStrategy) {
        Flow flowV;
        Intrinsics.checkNotNullParameter(linkedPayments, "linkedPayments");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        List listC = bkc.c.c(linkedPayments, egc.a.RENT);
        List listC2 = bkc.c.c(linkedPayments, egc.a.BILLS);
        ArrayList arrayListE0 = d0.E0(listC2, listC);
        if (arrayListE0.isEmpty()) {
            flowV = new go.g(new Data(r0.g(), null, false, 6, null), 2);
        } else {
            flowV = nim.a.v(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(this.f288838c, d(arrayListE0), u.c(i1.f272794a), null, null, null, 28)), new vdl.a(this, 23));
        }
        return new vkm.y(new vfg.m(this, loadingStrategy, null, 1), boh.f.e(flowV, new sc7.b(this, loadingStrategy, listC, listC2, 17)));
    }
}
