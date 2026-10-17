package j7b;

import androidx.sqlite.SQLiteConnection;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.card_screen.impl.kompot.reactivate.chargeback.TerminatedCardChargebackScreen;
import com.revolut.feature.cash_topup.api.models.BarcodeDetails;
import com.revolut.feature_travel_hotels_models.dropoff.TravelHotelsDropoff;
import com.revolut.feature_travel_hotels_models.location.HotelsLocation;
import ip0.nb0;
import ip0.pb0;
import ip0.v7;
import j9k.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import qua.p;
import tof.a3;
import yhm.r;
import zhm.a1;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171897a;

    public /* synthetic */ l(int i) {
        this.f171897a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        w89.d dVar = null;
        switch (this.f171897a) {
            case 0:
                i update = (i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return i.a(update, null, null, 3);
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = u.b();
                v7.C("list_id_header_rewards", 0, 0, 30, eVarB);
                nb0 nb0Var = pb0.Companion;
                List listK = v.k(nb0.a(nb0Var, "list_id_reward_0", false, 6), nb0.a(nb0Var, "list_id_reward_1", false, 6), nb0.a(nb0Var, "list_id_reward_2", false, 6), nb0.a(nb0Var, "list_id_reward_3", false, 6), nb0.a(nb0Var, "list_id_reward_4", false, 6));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB.addAll(listK);
                return u.a(eVarB);
            case 2:
                j82.i update2 = (j82.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Data data = Data.copy$default(update2.f172090a, null, null, true, 3, null);
                Intrinsics.checkNotNullParameter(data, "data");
                return new j82.i(data);
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new j82.l(iii.c.c(1), false);
            case 4:
                RowDelegate.Model it8 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = TerminatedCardChargebackScreen.f65492e0;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object obj3 = it8.u;
                if (obj3 instanceof a3) {
                    return (a3) obj3;
                }
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 6:
                Function0 defaultFactory = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke();
            case 7:
                j87.f update3 = (j87.f) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return j87.f.a(update3, j87.e.a(update3.f172140b, null, null, null, null, 15), null, 5);
            case 8:
                j96.a it9 = (j96.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new Pair(it9.f172290a, it9.f172291b);
            case 9:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                e7l.f fVar = (e7l.f) pair.f186385a;
                Set set = (Set) pair.f186386b;
                Set set2 = fVar.f123385o1;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : set2) {
                    if (set.contains((String) obj4)) {
                        arrayList.add(obj4);
                    }
                }
                Set setI1 = d0.i1(arrayList);
                Set set3 = fVar.U;
                HashSet hashSet = new HashSet();
                Iterator it10 = set3.iterator();
                while (it10.hasNext()) {
                    hashSet.add(((xi0.b) it10.next()).f306286a);
                }
                return a1.k(set, a1.k(hashSet, setI1));
            case 10:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : pockets) {
                    io3.d dVar2 = (io3.d) obj5;
                    xi0.a aVar = xi0.b.Companion;
                    String str = dVar2.f163147c;
                    aVar.getClass();
                    if (uj3.b.p(xi0.a.a(str)) && dVar2.i > 0) {
                        arrayList2.add(obj5);
                    }
                }
                List listP0 = d0.P0(arrayList2, new o());
                ArrayList arrayList3 = new ArrayList(w.t(listP0, 10));
                Iterator it11 = listP0.iterator();
                while (it11.hasNext()) {
                    arrayList3.add(((io3.d) it11.next()).f163147c);
                }
                return d0.i1(arrayList3);
            case 11:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                return config.N1;
            case 12:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                pfm.m mVar = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            case 13:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM charity_campaigns").step();
                    return null;
                } finally {
                }
            case 14:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM charity_collections").step();
                    return null;
                } finally {
                }
            case 15:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM charity").step();
                    return null;
                } finally {
                }
            case 16:
                jb0.d update4 = (jb0.d) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return jb0.d.a(update4, null, null, null, 3);
            case 17:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 18:
                od0.i it12 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                od0.h hVar = od0.i.Companion;
                ib3.a aVar2 = (ib3.a) it12.g();
                BarcodeDetails barcodeDetailsB = aVar2 != null ? jb3.a.b(aVar2) : null;
                hVar.getClass();
                return od0.h.a(barcodeDetailsB);
            case 19:
                jb9.a update5 = (jb9.a) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return jb9.a.a(update5, true);
            case 20:
                jb9.a update6 = (jb9.a) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return jb9.a.a(update6, false);
            case 21:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 22:
                List recurringPayments = (List) obj2;
                Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
                return (p) d0.d0(recurringPayments);
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 24:
                hc9.c prompts = (hc9.c) obj2;
                Intrinsics.checkNotNullParameter(prompts, "prompts");
                Map map = ic9.a.f160221a;
                Intrinsics.checkNotNullParameter(prompts, "<this>");
                boolean skipIntro = prompts.getSkipIntro();
                w89.c cVarA = ic9.a.a(prompts.getMainAction());
                hc9.a secondaryAction = prompts.getSecondaryAction();
                w89.c cVarA2 = secondaryAction != null ? ic9.a.a(secondaryAction) : null;
                hc9.b screenDetails = prompts.getScreenDetails();
                if (screenDetails != null) {
                    Intrinsics.checkNotNullParameter(screenDetails, "<this>");
                    dVar = new w89.d(screenDetails.getTitle(), screenDetails.getContent(), screenDetails.getImage());
                }
                return new w89.a(skipIntro, dVar, cVarA, cVarA2);
            case 25:
                List dropOffList = (List) obj2;
                Intrinsics.checkNotNullParameter(dropOffList, "dropOffList");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : dropOffList) {
                    if (((TravelHotelsDropoff) obj6).f97918h != null) {
                        arrayList4.add(obj6);
                    }
                }
                ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                Iterator it13 = arrayList4.iterator();
                while (it13.hasNext()) {
                    arrayList5.add(new jcg.d((TravelHotelsDropoff) it13.next()));
                }
                return arrayList5;
            case 26:
                List popularLocations = (List) obj2;
                Intrinsics.checkNotNullParameter(popularLocations, "popularLocations");
                List list = popularLocations;
                ArrayList arrayList6 = new ArrayList(w.t(list, 10));
                Iterator it14 = list.iterator();
                while (it14.hasNext()) {
                    arrayList6.add(new jcg.e((HotelsLocation) it14.next()));
                }
                return arrayList6;
            case 27:
                jch.j update7 = (jch.j) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return jch.j.a(update7, update7.f172801a);
            case 28:
                ko5.g it15 = (ko5.g) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f186227a.f71089a;
            default:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return hx7.i.B((dj0.d) rVar.f314201a, (List) rVar.f314202b, (xi0.b) rVar.f314203c);
        }
    }

    public /* synthetic */ l(Object obj2, int i) {
        this.f171897a = i;
    }
}
