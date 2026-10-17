package r2d;

import com.revolut.chat.ui.chatlist.ChatListScreen;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import ip0.gu;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import tof.va;
import v20.d1;
import v20.l1;
import v30.l0;
import v30.m0;
import v30.n0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251099a;

    public /* synthetic */ d(int i) {
        this.f251099a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        io3.k kVar;
        Object bVar;
        boolean z = true;
        switch (this.f251099a) {
            case 0:
                Data it8 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8.getLoading() && it8.getContent() == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                throw new IllegalArgumentException("Crypto tab widget has no support of Loading state");
            case 2:
                v20.n message = (v20.n) obj2;
                Intrinsics.checkNotNullParameter(message, "message");
                return Boolean.valueOf(d8l.d.p(message));
            case 3:
                v20.n it9 = (v20.n) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9;
            case 4:
                v20.n it10 = (v20.n) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10 instanceof l1);
            case 5:
                v20.n it11 = (v20.n) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return (l1) it11;
            case 6:
                koi.b vh10 = (koi.b) obj2;
                Intrinsics.checkNotNullParameter(vh10, "vh");
                koi.j jVar = vh10.e;
                if (jVar instanceof ryl.a) {
                }
                return Unit.f186387a;
            case 7:
                koi.b vh11 = (koi.b) obj2;
                Intrinsics.checkNotNullParameter(vh11, "vh");
                koi.j jVar2 = vh11.e;
                if (jVar2 instanceof ryl.a) {
                }
                return Unit.f186387a;
            case 8:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new r37.d((ds6.k) pair.f186385a, (do3.n) pair.f186386b);
            case 9:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 2);
                for (int i = 0; i < 2; i++) {
                    arrayListP.add(new pb0(a0.d.n("LIST_ID_TAX_LOADER_", i)));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 10:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : pockets) {
                    io3.d dVar = (io3.d) obj3;
                    if (h30.l.D(xi0.b.Companion, dVar.f163147c) && ((kVar = dVar.f) == io3.k.ACTIVE || kVar == io3.k.INACTIVE)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 11:
                List pockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets2, "pockets");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : pockets2) {
                    if (((io3.d) obj4).e == io3.l.INHERITANCE) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 12:
                Intrinsics.checkNotNullParameter((ipa.j) obj2, "it");
                return w4l.i.f294643c;
            case 13:
                List pockets3 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets3, "pockets");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : pockets3) {
                    if (((io3.d) obj5).e == io3.l.CURRENT) {
                        arrayList3.add(obj5);
                    }
                }
                return arrayList3;
            case 14:
                List pockets4 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets4, "pockets");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it12 = pockets4.iterator();
                while (it12.hasNext()) {
                    linkedHashSet.add(((io3.d) it12.next()).f163145a);
                }
                return linkedHashSet;
            case 15:
                Set pocketsIds = (Set) obj2;
                Intrinsics.checkNotNullParameter(pocketsIds, "pocketsIds");
                return new va(pocketsIds);
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return pw5.a.f(new gu("ID_SUBHEADER_LOADING", 0, 0, 30), zhm.u.c(new pb0("ID_LIST_ITEM_LOADING")));
            case 17:
                r3b.i it13 = (r3b.i) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f251243c;
            case 18:
                r3b.h performance = (r3b.h) obj2;
                Intrinsics.checkNotNullParameter(performance, "performance");
                List list = performance.f251239a;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : list) {
                    if (((y49.h) obj6).f310853l.size() == 1) {
                        arrayList4.add(obj6);
                    }
                }
                ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                Iterator it14 = arrayList4.iterator();
                while (it14.hasNext()) {
                    arrayList5.add(((y49.h) it14.next()).f310847a.f214596b);
                }
                return arrayList5;
            case 19:
                RemittanceTransferData it15 = (RemittanceTransferData) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new yhm.r(it15.f102050b, it15.f102051c, it15.f102054j);
            case 20:
                String str = (String) obj2;
                ChatListScreen.a aVar = ChatListScreen.Companion;
                return prk.o.m(str, "it", str, "menu_download");
            case 21:
                d1 it16 = (d1) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(it16 instanceof d1.c);
            case 22:
                r40.a updateState = (r40.a) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return r40.a.a(updateState, null, false, null, null, null, null, 59);
            case 23:
                r40.a updateState2 = (r40.a) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return r40.a.a(updateState2, null, false, null, null, null, null, 59);
            case 24:
                r40.a updateState3 = (r40.a) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return r40.a.a(updateState3, r40.h.a(updateState3.f251319a, null, null, false, 11), false, null, null, null, null, 62);
            case 25:
                r40.a updateState4 = (r40.a) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                return r40.a.a(updateState4, r40.h.a(updateState4.f251319a, null, null, false, 11), false, null, null, null, null, 62);
            case 26:
                List detailedChats = (List) obj2;
                Intrinsics.checkNotNullParameter(detailedChats, "detailedChats");
                List<n0> list2 = detailedChats;
                ArrayList arrayList6 = new ArrayList(w.t(list2, 10));
                for (n0 n0Var : list2) {
                    Intrinsics.checkNotNullParameter(n0Var, "<this>");
                    if (n0Var instanceof l0) {
                        bVar = new u40.a(((l0) n0Var).f285805a);
                    } else {
                        if (!(n0Var instanceof m0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar = new u40.b(((m0) n0Var).f285807a);
                    }
                    arrayList6.add(bVar);
                }
                return arrayList6;
            case 27:
                r40.a updateState5 = (r40.a) obj2;
                Intrinsics.checkNotNullParameter(updateState5, "$this$updateState");
                return r40.a.a(updateState5, null, false, null, null, null, null, 39);
            case 28:
                r40.a updateState6 = (r40.a) obj2;
                Intrinsics.checkNotNullParameter(updateState6, "$this$updateState");
                return r40.a.a(updateState6, null, true, null, null, null, null, 61);
            default:
                r40.a aVar2 = (r40.a) obj2;
                return r40.a.a(aVar2, r40.h.a(aVar2.f251319a, zi0.c.P(f0.f322471a, false, null, 3), null, false, 14), false, null, null, null, null, 62);
        }
    }

    public /* synthetic */ d(cli.n nVar, int i) {
        this.f251099a = i;
    }
}
