package kkf;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.api.PaymentsToggles$ScanBill;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitLineItem;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData;
import com.revolut.feature.transactions.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p1 extends gim.i implements oim.o {
    public /* synthetic */ sq9.a u;
    public /* synthetic */ do3.n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ tof.a3 f184875w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ klf.j1 f184876x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e84.e f184877y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(e84.e eVar, boolean z, Continuation continuation) {
        super(5, continuation);
        this.f184877y = eVar;
        this.z = z;
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        p1 p1Var = new p1(this.f184877y, this.z, (Continuation) obj6);
        p1Var.u = (sq9.a) obj2;
        p1Var.v = (do3.n) obj3;
        p1Var.f184875w = (tof.a3) obj4;
        p1Var.f184876x = (klf.j1) obj5;
        return p1Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List listC;
        Iterator it8;
        Iterator it9;
        SplitMemberType.GroupMember groupMember;
        sq9.a groupBill = this.u;
        do3.n user = this.v;
        tof.a3 a3Var = this.f184875w;
        klf.j1 j1Var = this.f184876x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (k71.k.q0(a3Var) || k71.k.T(a3Var) || j1Var.c()) {
            return zhm.f0.f322471a;
        }
        aim.e eVarB = zhm.u.b();
        if (groupBill != null) {
            oq9.h groupBill2 = groupBill.f265031c;
            PaymentGroup group = groupBill.f265030b;
            oq9.o oVar = groupBill2.f227824g;
            String str = groupBill2.k;
            e84.e eVar = this.f184877y;
            vlf.b bVar = (vlf.b) eVar.f;
            Intrinsics.checkNotNullParameter(groupBill, "<this>");
            boolean zS = ofm.q.s(groupBill2, group);
            bVar.getClass();
            Intrinsics.checkNotNullParameter(groupBill2, "groupBill");
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(user, "user");
            wnf.e eVar2 = (wnf.e) bVar.f290427a;
            eVar2.getClass();
            Intrinsics.checkNotNullParameter(groupBill2, "groupBill");
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(user, "user");
            ArrayList arrayListA = ((tr9.i) eVar2.d).a(groupBill2.i, oVar, user, zS);
            CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("ID_GO_TO_PAYMENT_GROUP_ITEM", new TextLocalisedClause(R$string.transactionUI_transaction_details_split_bill_go_to_group, zhm.u.c(group.f79286b), null, 12), 0, true, group, null, null, 2020);
            if (!this.z) {
                model = null;
            }
            List listP = i2b.a.p(arrayListA, model);
            yp0.b.k(listP, 0, 0, 0, 0, 31);
            eVarB.addAll(listP);
            r1 r1Var = (r1) eVar.i;
            Intrinsics.checkNotNullParameter(groupBill, "groupBill");
            Intrinsics.checkNotNullParameter(user, "user");
            if (((jte.d) r1Var.f184915b).c(PaymentsToggles$ScanBill.f79163c)) {
                List list = groupBill2.f227826j;
                if (list == null) {
                    list = zhm.f0.f322471a;
                }
                if (list.isEmpty() && str == null) {
                    listC = zhm.f0.f322471a;
                } else {
                    m1a.q qVar = r1Var.f184914a;
                    ArrayList arrayListJ = oc.c.j(group);
                    int iB = zhm.q0.b(zhm.w.t(arrayListJ, 10));
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                    for (Object obj3 : arrayListJ) {
                        linkedHashMap.put(((oq9.o) obj3).b(), obj3);
                    }
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                    Iterator it10 = list2.iterator();
                    while (it10.hasNext()) {
                        oq9.k kVar = (oq9.k) it10.next();
                        String str2 = kVar.f227833a;
                        long j2 = kVar.f227834b;
                        String str3 = kVar.f227835c;
                        ArrayList arrayList2 = kVar.d;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it11 = arrayList2.iterator();
                        while (it11.hasNext()) {
                            oq9.o oVar2 = (oq9.o) linkedHashMap.get((String) it11.next());
                            if (oVar2 != null) {
                                groupMember = new SplitMemberType.GroupMember(oVar2);
                                it8 = it10;
                                it9 = it11;
                            } else {
                                IllegalStateException illegalStateException = new IllegalStateException("Payer member not found");
                                zhm.h0 h0Var = zhm.h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                it8 = it10;
                                it9 = it11;
                                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                                groupMember = null;
                            }
                            if (groupMember != null) {
                                arrayList3.add(groupMember);
                            }
                            it10 = it8;
                            it11 = it9;
                        }
                        arrayList.add(new SplitLineItem(str2, j2, str3, arrayList3));
                    }
                    ItemizationReceiptDeletionData.GroupBill groupBill3 = null;
                    if (str != null && oi0.d.G(oVar, user)) {
                        groupBill3 = new ItemizationReceiptDeletionData.GroupBill(groupBill2.f227822b, groupBill2.f227821a);
                    }
                    listC = qVar.c(new w0a.e(str, arrayList, groupBill3));
                }
            } else {
                listC = zhm.f0.f322471a;
            }
            eVarB.addAll(listC);
        }
        return zhm.u.a(eVarB);
    }
}
