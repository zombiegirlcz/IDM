package i2l;

import com.revolut.data.model.Data;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreenContract$ConverterHistory;
import com.revolut.feature.shared_separate_favourites.domain.converter.SharedConverterItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class e0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f158010b;

    public /* synthetic */ e0(List list, int i) {
        this.f158009a = i;
        this.f158010b = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        dj0.d dVar;
        switch (this.f158009a) {
            case 0:
                return q.a((q) obj2, null, null, this.f158010b, false, null, 27);
            case 1:
                ((i7f.b) obj2).getClass();
                return new i7f.b(this.f158010b);
            case 2:
                List rooms = (List) obj2;
                Intrinsics.checkNotNullParameter(rooms, "rooms");
                return i2b.a.t(this.f158010b, rooms);
            case 3:
                ich.l update = (ich.l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return ich.l.a(update, null, null, null, false, null, null, null, null, this.f158010b, 255);
            case 4:
                ich.l update2 = (ich.l) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ich.l.a(update2, null, null, null, false, null, null, null, null, this.f158010b, 255);
            case 5:
                ich.l update3 = (ich.l) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return ich.l.a(update3, null, null, null, false, null, null, null, null, this.f158010b, 255);
            case 6:
                return ich.l.a((ich.l) obj2, null, null, null, false, null, this.f158010b, null, null, null, 479);
            case 7:
                return new ij4.g(new Data(this.f158010b, null, false, 6, null), null, false);
            case 8:
                return imh.d.a((imh.d) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.f158010b, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            case 9:
                return iqf.a.a((iqf.a) obj2, this.f158010b, null, null, 14);
            case 10:
                return iuf.l.a((iuf.l) obj2, null, null, null, null, null, this.f158010b, 63);
            case 11:
                return iyg.a.a((iyg.a) obj2, this.f158010b, null, null, false, null, null, null, null, null, null, null, null, null, null, 16382);
            case 12:
                return j0i.a.a((j0i.a) obj2, null, null, null, null, null, this.f158010b, null, null, null, null, 991);
            case 13:
                return j3b.a.a((j3b.a) obj2, null, this.f158010b, 3);
            case 14:
                Map contactsMap = (Map) obj2;
                Intrinsics.checkNotNullParameter(contactsMap, "contactsMap");
                List list = this.f158010b;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(j6k.c.b((MoneyRequest) it8.next(), contactsMap));
                }
                return arrayList;
            case 15:
                jch.j update4 = (jch.j) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return jch.j.a(update4, this.f158010b);
            case 16:
                jch.j update5 = (jch.j) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return jch.j.a(update5, this.f158010b);
            case 17:
                List amenities = this.f158010b;
                Intrinsics.h(amenities);
                ((jeg.d) obj2).getClass();
                Intrinsics.checkNotNullParameter(amenities, "amenities");
                return new jeg.d(amenities);
            case 18:
                return jfh.d.a((jfh.d) obj2, null, this.f158010b, 1);
            case 19:
                jgd.j jVar = (jgd.j) obj2;
                SharedConverterScreenContract$ConverterHistory sharedConverterScreenContract$ConverterHistory = jVar.f173970a;
                List list2 = sharedConverterScreenContract$ConverterHistory.f86856b;
                ArrayList arrayList2 = null;
                if (list2 != null) {
                    List<SharedConverterItem> list3 = list2;
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
                    for (SharedConverterItem sharedConverterItemA : list3) {
                        Iterator it9 = this.f158010b.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next = it9.next();
                                if (Intrinsics.f(((SharedConverterItem) next).f86893b, sharedConverterItemA.f86893b)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        SharedConverterItem sharedConverterItem = (SharedConverterItem) next;
                        if (sharedConverterItem != null && (dVar = sharedConverterItem.d) != null) {
                            sharedConverterItemA = SharedConverterItem.a(sharedConverterItemA, dVar);
                        }
                        arrayList3.add(sharedConverterItemA);
                    }
                    arrayList2 = arrayList3;
                }
                return jgd.j.a(jVar, new SharedConverterScreenContract$ConverterHistory(sharedConverterScreenContract$ConverterHistory.f86855a, arrayList2), false, 14);
            case 20:
                List assets = (List) obj2;
                Intrinsics.checkNotNullParameter(assets, "assets");
                ArrayList<vel.d> arrayList4 = new ArrayList();
                for (Object obj3 : assets) {
                    if (obj3 instanceof vel.d) {
                        arrayList4.add(obj3);
                    }
                }
                ArrayList arrayList5 = new ArrayList(zhm.w.t(arrayList4, 10));
                for (vel.d dVar2 : arrayList4) {
                    arrayList5.add(new jih.a(dVar2.f288352a, dVar2));
                }
                Iterator it10 = this.f158010b.iterator();
                while (it10.hasNext()) {
                    jih.a aVar = new jih.a((xi0.b) it10.next(), null);
                    if (!arrayList5.isEmpty()) {
                        Iterator it11 = arrayList5.iterator();
                        while (it11.hasNext()) {
                            if (Intrinsics.f(aVar.f174489a, ((jih.a) it11.next()).f174489a)) {
                            }
                            break;
                        }
                    }
                    arrayList5 = zhm.d0.F0(aVar, arrayList5);
                }
                return arrayList5;
            case 21:
                Throwable it12 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                List list4 = this.f158010b;
                ArrayList arrayList6 = new ArrayList(zhm.w.t(list4, 10));
                Iterator it13 = list4.iterator();
                while (it13.hasNext()) {
                    arrayList6.add(new jih.a((xi0.b) it13.next(), null));
                }
                return arrayList6;
            case 22:
                return jq4.h.a((jq4.h) obj2, null, this.f158010b, 1);
            case 23:
                return jsl.p.a((jsl.p) obj2, null, this.f158010b, 1);
            case 24:
                return jvc.i.a((jvc.i) obj2, false, null, null, null, null, this.f158010b, false, null, null, false, null, 65407);
            case 25:
                return jvc.i.a((jvc.i) obj2, false, null, null, null, null, null, false, null, null, this.f158010b.isEmpty(), null, 63487);
            case 26:
                return jxi.r.a((jxi.r) obj2, null, null, null, null, null, null, null, null, null, new Data(this.f158010b, null, false, 6, null), null, null, null, null, 15871);
            case 27:
                return jzh.r.a((jzh.r) obj2, null, null, null, null, null, this.f158010b, null, 95);
            case 28:
                return jzh.r.a((jzh.r) obj2, null, null, null, null, null, null, this.f158010b, 63);
            default:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                List list5 = pockets;
                ArrayList arrayList7 = new ArrayList(zhm.w.t(list5, 10));
                Iterator it14 = list5.iterator();
                while (it14.hasNext()) {
                    arrayList7.add(((io3.d) it14.next()).f163147c);
                }
                ArrayList arrayList8 = new ArrayList(zhm.w.t(arrayList7, 10));
                int i = 0;
                for (Object obj4 : arrayList7) {
                    int i2 = i + 1;
                    if (i < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    arrayList8.add(new Pair((String) obj4, Integer.valueOf(i)));
                    i = i2;
                }
                ArrayList arrayListF1 = zhm.d0.f1(zhm.d0.P0(this.f158010b, new h6l.a(cim.b.g(cim.b.e()), zhm.r0.t(arrayList8), 1)));
                List listV0 = zhm.d0.V0(arrayListF1, 3);
                arrayListF1.removeAll(listV0);
                zhm.z.w(arrayListF1, new k2j.d(new k2j.c(), 0));
                arrayListF1.addAll(0, listV0);
                return arrayListF1;
        }
    }

    public /* synthetic */ e0(List list, j6k.c cVar) {
        this.f158009a = 14;
        this.f158010b = list;
    }

    public /* synthetic */ e0(jgd.x xVar, List list) {
        this.f158009a = 19;
        this.f158010b = list;
    }
}
