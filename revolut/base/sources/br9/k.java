package br9;

import cr9.c0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oq9.a0;
import oq9.b0;
import oq9.c0;
import oq9.n;
import oq9.o;
import oq9.y;
import oq9.z;
import org.joda.time.DateTime;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public abstract class k {
    public static final ArrayList a(List list, String str, LinkedHashMap linkedHashMap) {
        b0 b0Var;
        o nVar;
        c0 a0Var;
        ArrayList arrayList;
        b0 b0Var2;
        o nVar2;
        b0 b0Var3;
        o nVar3;
        String groupId = str;
        LinkedHashMap members = linkedHashMap;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(members, "members");
        List<cr9.c0> list2 = list;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (cr9.c0 c0Var : list2) {
            Intrinsics.checkNotNullParameter(c0Var, "<this>");
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(members, "members");
            if (c0Var instanceof c0.a) {
                c0.a aVar = (c0.a) c0Var;
                String id10 = aVar.getId();
                String type = aVar.getType();
                if (Intrinsics.f(type, "MARK_AS_PAID")) {
                    b0Var3 = b0.MARK_AS_PAID;
                } else {
                    if (!Intrinsics.f(type, "TRANSFER")) {
                        throw new IllegalStateException(j6.a.q("Unknown settlement type: ", aVar.getType()));
                    }
                    b0Var3 = b0.TRANSFER;
                }
                String transactionId = aVar.getTransactionId();
                o nVar4 = (o) members.get(aVar.getPayerId());
                if (nVar4 == null) {
                    nVar4 = new n(aVar.getPayerId(), groupId);
                }
                o nVar5 = (o) members.get(aVar.getPayeeId());
                if (nVar5 == null) {
                    nVar5 = new n(aVar.getPayeeId(), groupId);
                }
                String createdBy = aVar.getCreatedBy();
                if (createdBy == null || createdBy.length() == 0) {
                    nVar3 = (o) members.get(aVar.getPayerId());
                    if (nVar3 == null) {
                        nVar3 = new n(aVar.getPayerId(), groupId);
                    }
                } else {
                    nVar3 = (o) members.get(aVar.getCreatedBy());
                    if (nVar3 == null) {
                        nVar3 = new n(aVar.getCreatedBy(), groupId);
                    }
                }
                o oVar = nVar4;
                long amount = aVar.getAmount();
                xi0.a aVar2 = xi0.b.Companion;
                String currencyCode = aVar.getCurrencyCode();
                aVar2.getClass();
                dj0.d dVar = new dj0.d(amount, xi0.a.a(currencyCode));
                jo3.a exchanged = aVar.getExchanged();
                a0Var = new y(id10, groupId, b0Var3, oVar, nVar5, nVar3, dVar, exchanged != null ? mo3.a.o(exchanged) : null, new DateTime(aVar.getCreatedDate()), transactionId);
            } else if (c0Var instanceof c0.b) {
                c0.b bVar = (c0.b) c0Var;
                String id11 = bVar.getId();
                String type2 = bVar.getType();
                if (Intrinsics.f(type2, "MARK_AS_PAID")) {
                    b0Var2 = b0.MARK_AS_PAID;
                } else {
                    if (!Intrinsics.f(type2, "TRANSFER")) {
                        throw new IllegalStateException(j6.a.q("Unknown settlement type: ", bVar.getType()));
                    }
                    b0Var2 = b0.TRANSFER;
                }
                String transactionId2 = bVar.getTransactionId();
                o nVar6 = (o) members.get(bVar.getPayerId());
                if (nVar6 == null) {
                    nVar6 = new n(bVar.getPayerId(), groupId);
                }
                o nVar7 = (o) members.get(bVar.getPayeeId());
                if (nVar7 == null) {
                    nVar7 = new n(bVar.getPayeeId(), groupId);
                }
                String createdBy2 = bVar.getCreatedBy();
                if (createdBy2 == null || createdBy2.length() == 0) {
                    nVar2 = (o) members.get(bVar.getPayerId());
                    if (nVar2 == null) {
                        nVar2 = new n(bVar.getPayerId(), groupId);
                    }
                } else {
                    nVar2 = (o) members.get(bVar.getCreatedBy());
                    if (nVar2 == null) {
                        nVar2 = new n(bVar.getCreatedBy(), groupId);
                    }
                }
                long amount2 = bVar.getAmount();
                xi0.a aVar3 = xi0.b.Companion;
                String currencyCode2 = bVar.getCurrencyCode();
                aVar3.getClass();
                dj0.d dVar2 = new dj0.d(amount2, xi0.a.a(currencyCode2));
                jo3.a exchanged2 = bVar.getExchanged();
                a0Var = new z(id11, groupId, b0Var2, nVar6, nVar7, nVar2, dVar2, exchanged2 != null ? mo3.a.o(exchanged2) : null, new DateTime(bVar.getCreatedDate()), transactionId2);
            } else {
                if (!(c0Var instanceof c0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                c0.c cVar = (c0.c) c0Var;
                String id12 = cVar.getId();
                String type3 = cVar.getType();
                if (Intrinsics.f(type3, "MARK_AS_PAID")) {
                    b0Var = b0.MARK_AS_PAID;
                } else {
                    if (!Intrinsics.f(type3, "TRANSFER")) {
                        throw new IllegalStateException(j6.a.q("Unknown settlement type: ", cVar.getType()));
                    }
                    b0Var = b0.TRANSFER;
                }
                String transactionId3 = cVar.getTransactionId();
                ArrayList arrayList3 = arrayList2;
                String paymentLinkId = cVar.getPaymentLinkId();
                o nVar8 = (o) members.get(cVar.getPayerId());
                if (nVar8 == null) {
                    nVar8 = new n(cVar.getPayerId(), groupId);
                }
                o nVar9 = (o) members.get(cVar.getPayeeId());
                if (nVar9 == null) {
                    nVar9 = new n(cVar.getPayeeId(), groupId);
                }
                String createdBy3 = cVar.getCreatedBy();
                if (createdBy3 == null || createdBy3.length() == 0) {
                    nVar = (o) members.get(cVar.getPayerId());
                    if (nVar == null) {
                        nVar = new n(cVar.getPayerId(), groupId);
                    }
                } else {
                    nVar = (o) members.get(cVar.getCreatedBy());
                    if (nVar == null) {
                        nVar = new n(cVar.getCreatedBy(), groupId);
                    }
                }
                long amount3 = cVar.getAmount();
                xi0.a aVar4 = xi0.b.Companion;
                String currencyCode3 = cVar.getCurrencyCode();
                aVar4.getClass();
                dj0.d dVar3 = new dj0.d(amount3, xi0.a.a(currencyCode3));
                jo3.a exchanged3 = cVar.getExchanged();
                arrayList = arrayList3;
                a0Var = new a0(id12, str, b0Var, nVar8, nVar9, nVar, dVar3, exchanged3 != null ? mo3.a.o(exchanged3) : null, new DateTime(cVar.getCreatedDate()), transactionId3, paymentLinkId);
                arrayList.add(a0Var);
                groupId = str;
                arrayList2 = arrayList;
                members = linkedHashMap;
            }
            arrayList = arrayList2;
            arrayList.add(a0Var);
            groupId = str;
            arrayList2 = arrayList;
            members = linkedHashMap;
        }
        return arrayList2;
    }
}
