package kkk;

import aw0.m6;
import aw0.n6;
import com.revolut.feature.identity.auth.domain.model.RegisteredIdentityId;
import com.revolut.feature.wealth.models.robo.Template;
import ip0.gu;
import ip0.kg;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ox0.b0;
import tof.a3;
import tof.d7;
import tof.f5;
import tof.h3;
import tof.n5;
import tof.p5;
import tof.p6;
import zhm.d0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f185129a;

    public /* synthetic */ u(int i) {
        this.f185129a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        p6 p6Var;
        n5 n5Var;
        int i = this.f185129a;
        od0.i iVar = od0.i.f224256b;
        Object obj3 = null;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                List listC = zhm.u.c(new kg("loading_item_inviter", 14));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                nb0 nb0Var = pb0.Companion;
                List listK = zhm.v.k(nb0.a(nb0Var, "loading_item_1", false, 6), nb0.a(nb0Var, "loading_item_2", false, 6));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                ArrayList arrayListE0 = d0.E0(listK, listC);
                n6.Companion.getClass();
                return new p(arrayListE0, null, null, null, new aw0.h(true, m6.a(), m6.a(), null, b0.BELOW_BUTTONS, null, 96));
            case 1:
                koi.j it8 = (koi.j) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.getF55009b();
            case 2:
                a3 observeTransactionProperty = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty, "$this$observeTransactionProperty");
                h3 h3Var = observeTransactionProperty.A;
                if (h3Var == null || (p6Var = h3Var.f272780b) == null) {
                    return null;
                }
                return p6Var.f272991a;
            case 3:
                a3 observeTransactionProperty2 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty2, "$this$observeTransactionProperty");
                return Boolean.valueOf(observeTransactionProperty2.C0 != null);
            case 4:
                a3 it9 = (a3) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f272600m;
            case 5:
                a3 observeTransactionProperty3 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty3, "$this$observeTransactionProperty");
                return observeTransactionProperty3.I.f273161a;
            case 6:
                whf.p it10 = (whf.p) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it10);
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 8:
                a3 observeTransactionProperty4 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty4, "$this$observeTransactionProperty");
                return observeTransactionProperty4.f272600m;
            case 9:
                a3 observeTransactionProperty5 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty5, "$this$observeTransactionProperty");
                Set set = k71.k.f181789a;
                Intrinsics.checkNotNullParameter(observeTransactionProperty5, "<this>");
                return Boolean.valueOf(Intrinsics.f(observeTransactionProperty5.A.f272779a.e, "8398"));
            case 10:
                a3 observeTransactionProperty6 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty6, "$this$observeTransactionProperty");
                p5 p5Var = observeTransactionProperty6.f272612s0;
                if (p5Var == null || (n5Var = p5Var.d) == null) {
                    return null;
                }
                return n5Var.f272947a;
            case 11:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                od0.i iVar2 = (od0.i) pair.f186385a;
                od0.i iVar3 = (od0.i) pair.f186386b;
                ql4.i iVar4 = (ql4.i) iVar2.g();
                ql4.u uVar = (ql4.u) iVar3.g();
                return iVar4 != null ? new rnf.o(iVar4) : uVar != null ? new rnf.n(uVar.f247184a) : rnf.p.f255685a;
            case 12:
                a3 observeTransactionProperty7 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty7, "$this$observeTransactionProperty");
                return observeTransactionProperty7.O0;
            case 13:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 14:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 15:
                List coparents = (List) obj2;
                Intrinsics.checkNotNullParameter(coparents, "coparents");
                List list = coparents;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it11 = list.iterator();
                while (it11.hasNext()) {
                    arrayList.add(((vd8.a) it11.next()).e);
                }
                return arrayList;
            case 16:
                a3 observeTransactionProperty8 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty8, "$this$observeTransactionProperty");
                f5 f5Var = observeTransactionProperty8.y0;
                if (f5Var != null) {
                    return f5Var.f272749a;
                }
                return null;
            case 17:
                a3 observeTransactionProperty9 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty9, "$this$observeTransactionProperty");
                return observeTransactionProperty9.f272584c;
            case 18:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list2 = (List) pair2.f186385a;
                Set setKeySet = ((Map) pair2.f186386b).keySet();
                ArrayList arrayList2 = new ArrayList(zhm.w.t(setKeySet, 10));
                Iterator it12 = setKeySet.iterator();
                while (it12.hasNext()) {
                    arrayList2.add(((RegisteredIdentityId) it12.next()).f74764a);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : list2) {
                    if (arrayList2.contains(((fo3.c) ((Pair) obj4).f186385a).f136805h)) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList(zhm.w.t(arrayList3, 10));
                Iterator it13 = arrayList3.iterator();
                while (it13.hasNext()) {
                    arrayList4.add(((fo3.c) ((Pair) it13.next()).f186385a).f136801a);
                }
                return d0.i1(arrayList4);
            case 19:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                List list3 = (List) pair3.f186385a;
                Set setKeySet2 = ((Map) pair3.f186386b).keySet();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : list3) {
                    if (setKeySet2.contains(((fo3.c) ((Pair) obj5).f186385a).f136805h)) {
                        arrayList5.add(obj5);
                    }
                }
                ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                Iterator it14 = arrayList5.iterator();
                while (it14.hasNext()) {
                    arrayList6.add(((fo3.c) ((Pair) it14.next()).f186385a).f136801a);
                }
                return d0.i1(arrayList6);
            case 20:
                a3 observeTransactionProperty10 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty10, "$this$observeTransactionProperty");
                d7 d7Var = observeTransactionProperty10.S;
                if (d7Var != null) {
                    return d7Var.f272692a;
                }
                return null;
            case 21:
                a3 observeTransactionProperty11 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty11, "$this$observeTransactionProperty");
                return observeTransactionProperty11.f272581b;
            case 22:
                a3 observeTransactionProperty12 = (a3) obj2;
                Intrinsics.checkNotNullParameter(observeTransactionProperty12, "$this$observeTransactionProperty");
                ibd.i iVar5 = observeTransactionProperty12.C;
                if (iVar5 != null) {
                    return iVar5.getId();
                }
                return null;
            case 23:
                Function0 defaultFactory = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke();
            case 24:
                List scopeToData = (List) obj2;
                Intrinsics.checkNotNullParameter(scopeToData, "scopeToData");
                return r0.t(scopeToData);
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                IntRange intRange = new IntRange(1, 4, 1);
                ArrayList arrayList7 = new ArrayList(zhm.w.t(intRange, 10));
                vim.f it15 = intRange.iterator();
                while (it15.f289625c) {
                    arrayList7.add(new s7(a0.d.n("CELL_DETAILS_LOADING_ID_", it15.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList7, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList7);
                eVarB.add(new gu("SUBHEADER_LOADING_ID", 0, 0, 30));
                IntRange intRange2 = new IntRange(1, 2, 1);
                ArrayList arrayList8 = new ArrayList(zhm.w.t(intRange2, 10));
                vim.f it16 = intRange2.iterator();
                while (it16.f289625c) {
                    arrayList8.add(new pb0(a0.d.n("ROW_LOADING_ID_", it16.nextInt())));
                }
                yp0.b.k(arrayList8, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList8);
                return zhm.u.a(eVarB);
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB2 = zhm.u.b();
                IntRange intRange3 = new IntRange(1, 3, 1);
                ArrayList arrayList9 = new ArrayList(zhm.w.t(intRange3, 10));
                vim.f it17 = intRange3.iterator();
                while (it17.f289625c) {
                    arrayList9.add(new s7(a0.d.n("CELL_DETAILS_LOADING_ID_", it17.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList9, 0, 0, 0, 0, 31);
                eVarB2.addAll(arrayList9);
                eVarB2.add(new gu("SUBHEADER_LOADING_ID", 0, 0, 30));
                IntRange intRange4 = new IntRange(1, 3, 1);
                ArrayList arrayList10 = new ArrayList(zhm.w.t(intRange4, 10));
                vim.f it18 = intRange4.iterator();
                while (it18.f289625c) {
                    arrayList10.add(new pb0(a0.d.n("ROW_LOADING_ID_", it18.nextInt())));
                }
                yp0.b.k(arrayList10, 0, 0, 0, 0, 31);
                eVarB2.addAll(arrayList10);
                return zhm.u.a(eVarB2);
            case 27:
                Pair pair4 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair4, "<destruct>");
                alc.n nVar = (alc.n) pair4.f186385a;
                List list4 = (List) pair4.f186386b;
                String str = nVar.e;
                if (str == null) {
                    str = nVar.f;
                }
                if (nVar.f6208b == xdh.c.CREATED && str != null) {
                    Iterator it19 = list4.iterator();
                    while (true) {
                        if (it19.hasNext()) {
                            Object next = it19.next();
                            if (Intrinsics.f(((Template) next).f95706a, str)) {
                                obj3 = next;
                            }
                        }
                    }
                    Template template = (Template) obj3;
                    if (template != null) {
                        return new kmc.j(template);
                    }
                }
                return kmc.i.f185766a;
            case 28:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "[NfcErrorLog]", null, error, h0Var);
                return Unit.f186387a;
            default:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error2, h0Var2);
                od0.i.Companion.getClass();
                return iVar;
        }
    }

    public /* synthetic */ u(Object obj2, int i) {
        this.f185129a = i;
    }
}
