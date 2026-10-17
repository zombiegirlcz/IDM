package bs9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentGroup f18097b;

    public /* synthetic */ d0(PaymentGroup paymentGroup, int i) {
        this.f18096a = i;
        this.f18097b = paymentGroup;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        String str2;
        hr9.c cVar;
        Object next;
        hr9.c cVar2;
        switch (this.f18096a) {
            case 0:
                PaymentGroup paymentGroup = this.f18097b;
                Intrinsics.h(paymentGroup);
                return o.a((o) obj2, paymentGroup, null, false, false, false, null, null, 0, null, null, null, 8190);
            case 1:
                List modifiedGroupMembers = (List) obj2;
                Intrinsics.checkNotNullParameter(modifiedGroupMembers, "modifiedGroupMembers");
                return PaymentGroup.a(this.f18097b, modifiedGroupMembers);
            case 2:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                zhm.f0 f0Var = zhm.f0.f322471a;
                return zi0.c.P(new mq9.c(this.f18097b, f0Var, f0Var), false, it8, 1);
            case 3:
                List<oq9.c0> settlements = (List) obj2;
                Intrinsics.checkNotNullParameter(settlements, "settlements");
                ArrayList arrayList = new ArrayList();
                for (oq9.c0 c0Var : settlements) {
                    sq9.b bVar = null;
                    oq9.y yVar = c0Var instanceof oq9.y ? (oq9.y) c0Var : null;
                    if (yVar != null && (str = yVar.f227868j) != null) {
                        bVar = new sq9.b(str, this.f18097b, c0Var);
                    }
                    if (bVar != null) {
                        arrayList.add(bVar);
                    }
                }
                return arrayList;
            case 4:
                List<oq9.i> bills = (List) obj2;
                Intrinsics.checkNotNullParameter(bills, "bills");
                ArrayList arrayList2 = new ArrayList();
                for (oq9.i iVar : bills) {
                    boolean z = iVar instanceof oq9.h;
                    sq9.a aVar = null;
                    oq9.h hVar = z ? (oq9.h) iVar : null;
                    if (hVar != null && (str2 = hVar.f227827l) != null) {
                        oq9.h hVar2 = z ? (oq9.h) iVar : null;
                        if (hVar2 != null) {
                            aVar = new sq9.a(str2, this.f18097b, hVar2);
                        }
                    }
                    if (aVar != null) {
                        arrayList2.add(aVar);
                    }
                }
                return arrayList2;
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                List list2 = (List) pair.f186386b;
                ArrayList arrayListJ = oc.c.j(this.f18097b);
                int iB = q0.b(zhm.w.t(arrayListJ, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : arrayListJ) {
                    linkedHashMap.put(obj3, Boolean.FALSE);
                }
                return new qs9.b(linkedHashMap, list, list2);
            case 6:
                PaymentGroup paymentGroup2 = this.f18097b;
                Intrinsics.h(paymentGroup2);
                return ps9.p.a((ps9.p) obj2, paymentGroup2, null, false, 14);
            case 7:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                do3.n user = (do3.n) pair2.f186385a;
                List groupDebts = (List) pair2.f186386b;
                PaymentGroup group = this.f18097b;
                Intrinsics.checkNotNullParameter(group, "group");
                Intrinsics.checkNotNullParameter(groupDebts, "groupDebts");
                Intrinsics.checkNotNullParameter(user, "user");
                Intrinsics.checkNotNullParameter(groupDebts, "<this>");
                Intrinsics.checkNotNullParameter(user, "user");
                Iterator it9 = groupDebts.iterator();
                while (true) {
                    cVar = null;
                    if (it9.hasNext()) {
                        next = it9.next();
                        if (oi0.d.G(((hr9.b) next).f154791a, user)) {
                        }
                    } else {
                        next = null;
                    }
                }
                hr9.b bVar2 = (hr9.b) next;
                if (bVar2 != null) {
                    List list3 = bVar2.f154793c;
                    hr9.a aVar2 = bVar2.f154792b;
                    int i = rr9.a.f256741a[aVar2.ordinal()];
                    if (i == 1 || i == 2) {
                        oq9.a aVar3 = group.f;
                        oq9.e eVar = aVar3 != null ? aVar3.f227798a : null;
                        List list4 = list3;
                        ArrayList arrayList3 = new ArrayList(zhm.w.t(list4, 10));
                        Iterator it10 = list4.iterator();
                        while (it10.hasNext()) {
                            arrayList3.add(edl.a.H((st9.e) it10.next(), user));
                        }
                        cVar2 = new hr9.c(aVar2, eVar, arrayList3);
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oq9.a aVar4 = group.f;
                        oq9.e eVar2 = aVar4 != null ? aVar4.f227798a : null;
                        List list5 = list3;
                        ArrayList arrayList4 = new ArrayList(zhm.w.t(list5, 10));
                        Iterator it11 = list5.iterator();
                        while (it11.hasNext()) {
                            arrayList4.add(edl.a.H((st9.e) it11.next(), user));
                        }
                        cVar2 = new hr9.c(aVar2, eVar2, arrayList4);
                    }
                    cVar = cVar2;
                }
                od0.i.Companion.getClass();
                return od0.h.a(cVar);
            case 8:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return jt0.b.V(this.f18097b, (do3.n) pair3.f186385a, (List) pair3.f186386b);
            case 9:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                return jt0.b.V(this.f18097b, (do3.n) pair4.f186385a, (List) pair4.f186386b);
            default:
                do3.n user2 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user2, "user");
                for (oq9.o oVar : this.f18097b.d) {
                    if (oi0.d.G(oVar, user2)) {
                        return oVar;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    public /* synthetic */ d0(jt0.b bVar, PaymentGroup paymentGroup, int i) {
        this.f18096a = i;
        this.f18097b = paymentGroup;
    }
}
