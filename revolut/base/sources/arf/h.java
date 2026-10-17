package arf;

import com.revolut.core.ui_kit.internal.views.navbar.ConstraintHeaderLayout;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteRate;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import jel.l1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import z9h.n;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8699a;

    public /* synthetic */ h(int i) {
        this.f8699a = i;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        io3.d dVar;
        ApmQuoteRate apmQuoteRate;
        boolean z = false;
        Double dValueOf = null;
        switch (this.f8699a) {
            case 0:
                d updateState = (d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return d.a(updateState, new Data(null, null, true, 3, null));
            case 1:
                as0.c it8 = (as0.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.e);
            case 2:
                as1.g it9 = (as1.g) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                ur1.a aVar = it9.d;
                if (aVar != null) {
                    return new Pair(it9.f8760a, aVar.f282231b.f163145a);
                }
                return null;
            case 3:
                as1.g it10 = (as1.g) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ur1.a aVar2 = it10.d;
                if (aVar2 == null || (dVar = aVar2.f282231b) == null) {
                    return null;
                }
                ApmQuote apmQuote = it10.e;
                if (apmQuote != null && (apmQuoteRate = apmQuote.f62209a) != null) {
                    dValueOf = Double.valueOf(apmQuoteRate.f62228a);
                }
                return new Pair(dVar, dValueOf);
            case 4:
                io3.d.Companion.getClass();
                return io3.d.f163144x;
            case 5:
                io3.d.Companion.getClass();
                return io3.d.f163144x;
            case 6:
                Throwable th10 = (Throwable) obj2;
                Intrinsics.h(th10);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, "Error while loading sender name from address book for push message", th10, h0Var);
                return Unit.f186387a;
            case 7:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return Boolean.TRUE;
            case 8:
                return Boolean.TRUE;
            case 9:
                List walletsWithPockets = (List) obj2;
                Intrinsics.checkNotNullParameter(walletsWithPockets, "walletsWithPockets");
                List list = walletsWithPockets;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it11 = list.iterator();
                while (it11.hasNext()) {
                    arrayList.add((fo3.c) ((Pair) it11.next()).f186385a);
                }
                int iB = q0.b(w.t(arrayList, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                for (Object obj3 : arrayList) {
                    linkedHashMap.put(((fo3.c) obj3).b(), obj3);
                }
                return linkedHashMap;
            case 10:
                List walletsWithPockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(walletsWithPockets2, "walletsWithPockets");
                List list2 = walletsWithPockets2;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it12 = list2.iterator();
                while (it12.hasNext()) {
                    arrayList2.add((List) ((Pair) it12.next()).f186386b);
                }
                ArrayList arrayListU = w.u(arrayList2);
                int iB2 = q0.b(w.t(arrayListU, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
                for (Object obj4 : arrayListU) {
                    linkedHashMap2.put(((io3.d) obj4).f163145a, obj4);
                }
                return linkedHashMap2;
            case 11:
                List jointWalletsWithPockets = (List) obj2;
                Intrinsics.checkNotNullParameter(jointWalletsWithPockets, "jointWalletsWithPockets");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : jointWalletsWithPockets) {
                    fo3.c cVar = (fo3.c) ((Pair) obj5).f186385a;
                    fo3.e[] elements = {fo3.e.ACTIVE, fo3.e.LOCKED};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    if (kotlin.collections.d.y0(elements).contains(cVar.f136802b)) {
                        arrayList3.add(obj5);
                    }
                }
                if (arrayList3.isEmpty()) {
                    od0.i.Companion.getClass();
                    return od0.i.f224256b;
                }
                fo3.c cVar2 = (fo3.c) ((Pair) d0.b0(arrayList3)).f186385a;
                od0.h hVar = od0.i.Companion;
                String str = cVar2.f136801a;
                hVar.getClass();
                return od0.h.a(str);
            case 12:
                List walletsWithPockets3 = (List) obj2;
                Intrinsics.checkNotNullParameter(walletsWithPockets3, "walletsWithPockets");
                List list3 = walletsWithPockets3;
                ArrayList arrayList4 = new ArrayList(w.t(list3, 10));
                Iterator it13 = list3.iterator();
                while (it13.hasNext()) {
                    arrayList4.add((List) ((Pair) it13.next()).f186386b);
                }
                ArrayList arrayListU2 = w.u(arrayList4);
                int iB3 = q0.b(w.t(arrayListU2, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB3 >= 16 ? iB3 : 16);
                for (Object obj6 : arrayListU2) {
                    linkedHashMap3.put(((io3.d) obj6).f163145a, obj6);
                }
                return linkedHashMap3;
            case 13:
                List<zsg.d> dto = (List) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                ArrayList arrayList5 = new ArrayList();
                for (zsg.d dVar2 : dto) {
                    Object obj7 = xsg.c.f308488a;
                    Intrinsics.checkNotNullParameter(dVar2, "<this>");
                    Object objV = u1.v(dVar2.getRole(), xsg.c.f308488a);
                    Object objV2 = u1.v(dVar2.getWallet().getState(), xsg.c.f308489b);
                    psg.a aVar3 = (objV == null || objV2 == null) ? null : new psg.a(dVar2.getWallet().getId(), dVar2.getWallet().getOwnerId(), (fo3.e) objV2, (psg.b) objV);
                    if (aVar3 != null) {
                        arrayList5.add(aVar3);
                    }
                }
                return arrayList5;
            case 14:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return ue8.c.D(it14);
            case 15:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list4 = (List) pair.f186385a;
                List list5 = (List) pair.f186386b;
                List list6 = list4;
                ArrayList arrayList6 = new ArrayList(w.t(list6, 10));
                Iterator it15 = list6.iterator();
                while (it15.hasNext()) {
                    arrayList6.add(((psg.a) it15.next()).f239484a);
                }
                Set setI1 = d0.i1(arrayList6);
                ArrayList arrayList7 = new ArrayList();
                for (Object obj8 : list5) {
                    if (setI1.contains(((fo3.c) ((Pair) obj8).f186385a).f136801a)) {
                        arrayList7.add(obj8);
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator it16 = arrayList7.iterator();
                while (it16.hasNext()) {
                    a0.x((List) ((Pair) it16.next()).f186386b, arrayList8);
                }
                return arrayList8;
            case 16:
                List it17 = (List) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return ue8.c.D(it17);
            case 17:
                Pair it18 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return u.c(ue8.c.E(it18));
            case 18:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list7 = (List) pair2.f186385a;
                List list8 = (List) pair2.f186386b;
                List list9 = list7;
                ArrayList arrayList9 = new ArrayList(w.t(list9, 10));
                Iterator it19 = list9.iterator();
                while (it19.hasNext()) {
                    arrayList9.add(((psg.a) it19.next()).getId());
                }
                Set setI12 = d0.i1(arrayList9);
                ArrayList arrayList10 = new ArrayList();
                for (Object obj9 : list8) {
                    if (setI12.contains(((fo3.c) ((Pair) obj9).f186385a).b())) {
                        arrayList10.add(obj9);
                    }
                }
                return arrayList10;
            case 19:
                Pair it20 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return (fo3.c) it20.f186385a;
            case 20:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                List list10 = (List) pair3.f186385a;
                List list11 = (List) pair3.f186386b;
                List list12 = list10;
                ArrayList arrayList11 = new ArrayList(w.t(list12, 10));
                Iterator it21 = list12.iterator();
                while (it21.hasNext()) {
                    arrayList11.add(((psg.a) it21.next()).getId());
                }
                Set setI13 = d0.i1(arrayList11);
                ArrayList arrayList12 = new ArrayList();
                for (Object obj10 : list11) {
                    if (setI13.contains(((fo3.c) ((Pair) obj10).f186385a).b())) {
                        arrayList12.add(obj10);
                    }
                }
                ArrayList arrayList13 = new ArrayList(w.t(arrayList12, 10));
                Iterator it22 = arrayList12.iterator();
                while (it22.hasNext()) {
                    arrayList13.add((fo3.c) ((Pair) it22.next()).f186385a);
                }
                return arrayList13;
            case 21:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                return (fo3.c) pair4.f186385a;
            case 22:
                Pair walletWithPockets = (Pair) obj2;
                Intrinsics.checkNotNullParameter(walletWithPockets, "walletWithPockets");
                return (List) ue8.c.E(walletWithPockets).f186386b;
            case 23:
                Throwable it23 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                r rVarF = n.f(null, it23, false, 5, null);
                Intrinsics.checkNotNullExpressionValue(rVarF, "just(...)");
                return rVarF;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 25:
                l1 it24 = (l1) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                int i = atk.j.f9090a[it24.ordinal()];
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 26:
                au.h update = (au.h) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return new au.d(update.getDocumentType(), update.k0(), update.T(), update.J());
            case 27:
                au.h update2 = (au.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return new au.d(update2.getDocumentType(), update2.k0(), update2.T(), update2.J());
            case 28:
                au.h update3 = (au.h) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return new au.e(update3.getDocumentType(), update3.k0(), update3.T(), update3.J());
            default:
                ConstraintHeaderLayout.Companion aVar4 = ConstraintHeaderLayout.INSTANCE;
                Intrinsics.checkNotNullParameter((ty0.a) obj2, "it");
                return Unit.f186387a;
        }
    }
}
