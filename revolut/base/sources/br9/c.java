package br9;

import cr9.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oq9.n;
import oq9.o;
import org.joda.time.DateTime;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {
    public static final ArrayList a(List list, String str, LinkedHashMap linkedHashMap) {
        String str2;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap2;
        String str3;
        o nVar;
        String str4;
        int i;
        dj0.d dVar;
        dj0.d dVar2;
        oq9.i gVar;
        o nVar2;
        dj0.d dVar3;
        dj0.d dVar4;
        String groupId = str;
        LinkedHashMap members = linkedHashMap;
        String str5 = "<this>";
        Intrinsics.checkNotNullParameter(list, "<this>");
        String str6 = "groupId";
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        String str7 = "members";
        Intrinsics.checkNotNullParameter(members, "members");
        List<cr9.l> list2 = list;
        int i2 = 10;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (cr9.l lVar : list2) {
            Intrinsics.checkNotNullParameter(lVar, str5);
            Intrinsics.checkNotNullParameter(groupId, str6);
            Intrinsics.checkNotNullParameter(members, str7);
            if (lVar instanceof l.b) {
                l.b bVar = (l.b) lVar;
                Intrinsics.checkNotNullParameter(bVar, str5);
                Intrinsics.checkNotNullParameter(groupId, str6);
                Intrinsics.checkNotNullParameter(members, str7);
                String id10 = bVar.getId();
                String title = bVar.getTitle();
                long amount = bVar.getAmount();
                xi0.a aVar = xi0.b.Companion;
                String currencyCode = bVar.getCurrencyCode();
                aVar.getClass();
                dj0.d dVar5 = new dj0.d(amount, xi0.a.a(currencyCode));
                jo3.a exchanged = bVar.getExchanged();
                dj0.d dVarO = exchanged != null ? mo3.a.o(exchanged) : null;
                DateTime dateTime = new DateTime(bVar.getCreatedDate());
                o nVar3 = (o) members.get(bVar.getOwnerId());
                if (nVar3 == null) {
                    nVar3 = new n(bVar.getOwnerId(), groupId);
                }
                o oVar = nVar3;
                String createdBy = bVar.getCreatedBy();
                if (createdBy == null || createdBy.length() == 0) {
                    nVar2 = (o) members.get(bVar.getOwnerId());
                    if (nVar2 == null) {
                        nVar2 = new n(bVar.getOwnerId(), groupId);
                    }
                } else {
                    nVar2 = (o) members.get(bVar.getCreatedBy());
                    if (nVar2 == null) {
                        nVar2 = new n(bVar.getCreatedBy(), groupId);
                    }
                }
                o oVar2 = nVar2;
                Intrinsics.checkNotNullParameter(bVar, str5);
                Intrinsics.checkNotNullParameter(groupId, str6);
                Intrinsics.checkNotNullParameter(members, str7);
                String strR = a0.d.r(bVar.getId(), groupId);
                String id11 = bVar.getId();
                long amount2 = bVar.getAmount();
                List splits = bVar.getSplits();
                ArrayList arrayList3 = new ArrayList(w.t(splits, i2));
                Iterator it8 = splits.iterator();
                while (it8.hasNext()) {
                    arrayList3.add(Long.valueOf(((cr9.o) it8.next()).getAmount()));
                }
                long jU0 = amount2 - d0.U0(arrayList3);
                xi0.a aVar2 = xi0.b.Companion;
                String currencyCode2 = bVar.getCurrencyCode();
                aVar2.getClass();
                dj0.d dVar6 = new dj0.d(jU0, xi0.a.a(currencyCode2));
                jo3.a exchanged2 = bVar.getExchanged();
                if (exchanged2 != null) {
                    long amount3 = exchanged2.getAmount();
                    List splits2 = bVar.getSplits();
                    dVar3 = dVar5;
                    ArrayList arrayList4 = new ArrayList(w.t(splits2, i2));
                    Iterator it9 = splits2.iterator();
                    while (it9.hasNext()) {
                        jo3.a exchanged3 = ((cr9.o) it9.next()).getExchanged();
                        arrayList4.add(Long.valueOf(exchanged3 != null ? exchanged3.getAmount() : 0L));
                    }
                    long jU02 = amount3 - d0.U0(arrayList4);
                    xi0.a aVar3 = xi0.b.Companion;
                    String currency = exchanged2.getCurrency();
                    aVar3.getClass();
                    dVar4 = new dj0.d(jU02, xi0.a.a(currency));
                } else {
                    dVar3 = dVar5;
                    dVar4 = null;
                }
                o nVar4 = (o) members.get(bVar.getOwnerId());
                if (nVar4 == null) {
                    nVar4 = new n(bVar.getOwnerId(), groupId);
                }
                dj0.d dVar7 = dVar4;
                String str8 = groupId;
                ArrayList arrayListJ = ue0.e.J(new oq9.j(strR, id11, str8, nVar4, dVar6, dVar7), x5d.b.s(bVar.getId(), str8, members, bVar.getSplits()));
                List lineItems = bVar.getLineItems();
                ArrayList arrayListX = lineItems != null ? vc.o.x(lineItems) : null;
                arrayList = arrayList2;
                str2 = str5;
                str4 = str6;
                dj0.d dVar8 = dVar3;
                gVar = new oq9.h(id10, str8, title, dVar8, dVarO, dateTime, oVar, oVar2, arrayListJ, arrayListX, bVar.getReceiptImageUri(), bVar.getTransactionId(), bVar.getTransactionCategory(), bVar.getTransactionLogo());
                linkedHashMap2 = linkedHashMap;
                str3 = str7;
                i = 10;
            } else {
                str2 = str5;
                String str9 = str6;
                String str10 = str7;
                arrayList = arrayList2;
                if (!(lVar instanceof l.a)) {
                    if (lVar instanceof l.c) {
                        throw new IllegalStateException("Unknown type is not supported");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                l.a aVar4 = (l.a) lVar;
                Intrinsics.checkNotNullParameter(aVar4, str2);
                Intrinsics.checkNotNullParameter(groupId, str9);
                linkedHashMap2 = linkedHashMap;
                str3 = str10;
                Intrinsics.checkNotNullParameter(linkedHashMap2, str3);
                String id12 = aVar4.getId();
                String title2 = aVar4.getTitle();
                long amount4 = aVar4.getAmount();
                xi0.a aVar5 = xi0.b.Companion;
                String currencyCode3 = aVar4.getCurrencyCode();
                aVar5.getClass();
                dj0.d dVar9 = new dj0.d(amount4, xi0.a.a(currencyCode3));
                jo3.a exchanged4 = aVar4.getExchanged();
                dj0.d dVarO2 = exchanged4 != null ? mo3.a.o(exchanged4) : null;
                DateTime dateTime2 = new DateTime(aVar4.getCreatedDate());
                o nVar5 = (o) linkedHashMap2.get(aVar4.getOwnerId());
                if (nVar5 == null) {
                    nVar5 = new n(aVar4.getOwnerId(), groupId);
                }
                o oVar3 = nVar5;
                String createdBy2 = aVar4.getCreatedBy();
                if (createdBy2 == null || createdBy2.length() == 0) {
                    nVar = (o) linkedHashMap2.get(aVar4.getOwnerId());
                    if (nVar == null) {
                        nVar = new n(aVar4.getOwnerId(), groupId);
                    }
                } else {
                    nVar = (o) linkedHashMap2.get(aVar4.getCreatedBy());
                    if (nVar == null) {
                        nVar = new n(aVar4.getCreatedBy(), groupId);
                    }
                }
                o oVar4 = nVar;
                Intrinsics.checkNotNullParameter(aVar4, str2);
                Intrinsics.checkNotNullParameter(groupId, str9);
                Intrinsics.checkNotNullParameter(linkedHashMap2, str3);
                String strR2 = a0.d.r(aVar4.getId(), groupId);
                String id13 = aVar4.getId();
                long amount5 = aVar4.getAmount();
                List splits3 = aVar4.getSplits();
                str4 = str9;
                i = 10;
                ArrayList arrayList5 = new ArrayList(w.t(splits3, 10));
                Iterator it10 = splits3.iterator();
                while (it10.hasNext()) {
                    arrayList5.add(Long.valueOf(((cr9.o) it10.next()).getAmount()));
                }
                long jU03 = amount5 - d0.U0(arrayList5);
                xi0.a aVar6 = xi0.b.Companion;
                String currencyCode4 = aVar4.getCurrencyCode();
                aVar6.getClass();
                dj0.d dVar10 = new dj0.d(jU03, xi0.a.a(currencyCode4));
                jo3.a exchanged5 = aVar4.getExchanged();
                if (exchanged5 != null) {
                    long amount6 = exchanged5.getAmount();
                    List splits4 = aVar4.getSplits();
                    dVar = dVar10;
                    ArrayList arrayList6 = new ArrayList(w.t(splits4, 10));
                    Iterator it11 = splits4.iterator();
                    while (it11.hasNext()) {
                        jo3.a exchanged6 = ((cr9.o) it11.next()).getExchanged();
                        arrayList6.add(Long.valueOf(exchanged6 != null ? exchanged6.getAmount() : 0L));
                    }
                    long jU04 = amount6 - d0.U0(arrayList6);
                    xi0.a aVar7 = xi0.b.Companion;
                    String currency2 = exchanged5.getCurrency();
                    aVar7.getClass();
                    dVar2 = new dj0.d(jU04, xi0.a.a(currency2));
                } else {
                    dVar = dVar10;
                    dVar2 = null;
                }
                o nVar6 = (o) linkedHashMap2.get(aVar4.getOwnerId());
                if (nVar6 == null) {
                    nVar6 = new n(aVar4.getOwnerId(), groupId);
                }
                String str11 = groupId;
                ArrayList arrayListJ2 = ue0.e.J(new oq9.j(strR2, id13, str11, nVar6, dVar, dVar2), x5d.b.s(aVar4.getId(), str11, linkedHashMap2, aVar4.getSplits()));
                List lineItems2 = aVar4.getLineItems();
                gVar = new oq9.g(id12, str11, title2, dVar9, dVarO2, dateTime2, oVar3, oVar4, arrayListJ2, lineItems2 != null ? vc.o.x(lineItems2) : null, aVar4.getReceiptImageUri());
            }
            ArrayList arrayList7 = arrayList;
            arrayList7.add(gVar);
            groupId = str;
            arrayList2 = arrayList7;
            i2 = i;
            str7 = str3;
            str5 = str2;
            str6 = str4;
            members = linkedHashMap2;
        }
        return arrayList2;
    }
}
