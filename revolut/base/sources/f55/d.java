package f55;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k55.h;
import k55.u;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import m55.i;
import p35.h0;
import p35.i0;
import p35.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f132271a = r0.k(new Pair("SCHEDULED", i0.SCHEDULED), new Pair("PAID", i0.PAID), new Pair("CANCELED", i0.CANCELED), new Pair("LATE", i0.LATE), new Pair("OUTSTANDING", i0.OUTSTANDING), new Pair("CLAIMED", i0.CLAIMED), new Pair("UNKNOWN", i0.UNKNOWN));

    public static final ArrayList a(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(c((m55.b) it8.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    public static final h0 b(h hVar) {
        long jF;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        String id10 = hVar.getId();
        i0 i0Var = (i0) u1.u(hVar.getState(), f132271a);
        Long repaymentTime = hVar.getRepaymentTime();
        if (repaymentTime != null) {
            jF = repaymentTime.longValue();
        } else {
            LocalDate localDate = LocalDate.parse(hVar.getRepaymentDate());
            Intrinsics.checkNotNullExpressionValue(localDate, "parse(...)");
            jF = oc.c.F(localDate);
        }
        q0 q0Var = (q0) u1.u(hVar.getLoanRepaymentType(), c.f132270c);
        String transactionId = hVar.getTransactionId();
        u amountBreakdown = hVar.getAmountBreakdown();
        Intrinsics.checkNotNullParameter(amountBreakdown, "<this>");
        return new h0(id10, i0Var, jF, q0Var, transactionId, new p35.r0(mo3.a.o(amountBreakdown.getPrincipalAmount()), mo3.a.o(amountBreakdown.getLoanAmount()), mo3.a.o(amountBreakdown.getInterestAmount()), mo3.a.o(amountBreakdown.getTotalAmount())), hVar.getPaymentRequired());
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    public static final h0 c(m55.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        String id10 = bVar.getId();
        i0 i0Var = (i0) u1.u(bVar.getState(), f132271a);
        long repaymentDate = bVar.getRepaymentDate();
        q0 q0Var = (q0) u1.u(bVar.getLoanRepaymentType(), c.f132270c);
        String transactionId = bVar.getTransactionId();
        i amountBreakdown = bVar.getAmountBreakdown();
        Intrinsics.checkNotNullParameter(amountBreakdown, "<this>");
        return new h0(id10, i0Var, repaymentDate, q0Var, transactionId, new p35.r0(mo3.a.o(amountBreakdown.getPrincipalAmount()), mo3.a.o(amountBreakdown.getLoanAmount()), mo3.a.o(amountBreakdown.getInterestAmount()), mo3.a.o(amountBreakdown.getTotalAmount())), bVar.getPaymentRequired());
    }

    public static final ArrayList d(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(e((h0) it8.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    public static final m55.b e(h0 h0Var) {
        Intrinsics.checkNotNullParameter(h0Var, "<this>");
        String str = h0Var.f232642a;
        String strG = u1.g(h0Var.f232643b, f132271a);
        long j2 = h0Var.f232644c;
        String strG2 = u1.g(h0Var.d, c.f132270c);
        String str2 = h0Var.e;
        p35.r0 r0Var = h0Var.f;
        Intrinsics.checkNotNullParameter(r0Var, "<this>");
        return new m55.b(str, strG, j2, strG2, str2, new i(mo3.a.p(r0Var.f232667a), mo3.a.p(r0Var.f232668b), mo3.a.p(r0Var.f232669c), mo3.a.p(r0Var.d)), h0Var.f232645g);
    }
}
