package ood;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.widgets.v4;
import com.revolut.data.model.Data;
import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.feature.wallets.api.module.WalletLimit;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class o0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227064a;

    public /* synthetic */ o0(int i) {
        this.f227064a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        kr2.b bVar;
        switch (this.f227064a) {
            case 0:
                return jli.b.g((DateTime) obj2);
            case 1:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return rod.g.d(rod.h.TRIPS_LIST, 3);
            case 2:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return null;
            case 3:
                Function0 it10 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new e();
            case 4:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return null;
            case 5:
                oog.g update = (oog.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return oog.g.a(update, null, "", oog.h.INPUT, 1);
            case 6:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new oog.j((List) getDefaultLoadingItems.invoke(), false, false);
            case 7:
                gok.b it12 = (gok.b) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.name();
            case 8:
                gok.b it13 = (gok.b) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.name();
            case 9:
                RecyclerView.ViewHolder holder = (RecyclerView.ViewHolder) obj2;
                Intrinsics.checkNotNullParameter(holder, "holder");
                return Boolean.valueOf(holder instanceof op0.y);
            case 10:
                v4 it14 = (v4) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Unit.f186387a;
            case 11:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "action");
                throw null;
            case 12:
                Collection collection = (Collection) ((Data) obj2).getContent();
                return Boolean.valueOf(collection == null || collection.isEmpty());
            case 13:
                Throwable it15 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return zhm.f0.f322471a;
            case 14:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                return new CountryProfile(user.f116408a, do3.q.y(user), true);
            case 15:
                return zhm.u.c((CountryProfile) obj2);
            case 16:
                cr0.h it16 = (cr0.h) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(it16 != cr0.h.SETTLING);
            case 17:
                qq1.d it17 = (qq1.d) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return n14.e.E(it17);
            case 18:
                qq1.d it18 = (qq1.d) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return n14.e.E(it18);
            case 19:
                qq1.a it19 = (qq1.a) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.getTransactionId();
            case 20:
                qq1.d it20 = (qq1.d) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return n14.e.E(it20);
            case 21:
                List facilities = (List) obj2;
                Intrinsics.checkNotNullParameter(facilities, "facilities");
                return ((yw4.p) zhm.d0.b0(facilities)).f317325a;
            case 22:
                return h30.l.q("it", (od0.i) obj2);
            case 23:
                String facilityId = (String) obj2;
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                return new ft3.r(facilityId);
            case 24:
                List limitList = (List) obj2;
                Intrinsics.checkNotNullParameter(limitList, "limitList");
                Iterator it21 = limitList.iterator();
                while (true) {
                    if (it21.hasNext()) {
                        next = it21.next();
                        WalletLimit walletLimit = (WalletLimit) next;
                        WalletLimit.CounterLimit counterLimit = walletLimit instanceof WalletLimit.CounterLimit ? (WalletLimit.CounterLimit) walletLimit : null;
                        if ((counterLimit != null ? counterLimit.f94844a : null) == com.revolut.feature.wallets.api.module.a.MX_FCY_BALANCE) {
                        }
                    } else {
                        next = null;
                    }
                }
                WalletLimit.CounterLimit counterLimit2 = next instanceof WalletLimit.CounterLimit ? (WalletLimit.CounterLimit) next : null;
                return counterLimit2 != null ? new oq6.c(counterLimit2.f94846c, counterLimit2.e) : oq6.b.f227753a;
            case 25:
                Function0 it22 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                int size = zhm.d0.A0(oqe.f.a(), oqe.f.TERMS_AND_CONDITIONS).size();
                pb0[] pb0VarArr = new pb0[size];
                for (int i = 0; i < size; i++) {
                    pb0 pb0VarO = t61.a.o("LIST_ID_LOADING_", i, pb0.Companion, false, 4);
                    yp0.b.l(pb0VarO, 0, 0, 0, 0, null, false, 63);
                    pb0VarArr[i] = pb0VarO;
                }
                return new oqe.m(oqe.k.f227895a, kotlin.collections.d.v0(pb0VarArr));
            case 26:
                Data it23 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                Integer num = (Integer) it23.getContent();
                return !it23.getLoading() ? (num == null || num.intValue() < 1) ? Data.copy$default(it23, 2, null, false, 6, null) : it23 : it23;
            case 27:
                return Boolean.valueOf(((oqk.t) obj2).f227988a);
            case 28:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                List list2 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it24 = list2.iterator();
                while (it24.hasNext()) {
                    arrayList.add(or2.a.a((qr2.l) it24.next()));
                }
                return arrayList;
            default:
                qr2.k it25 = (qr2.k) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                od0.h hVar = od0.i.Companion;
                Intrinsics.checkNotNullParameter(it25, "<this>");
                String str = it25.f248620a;
                String str2 = it25.f248621b;
                List<qr2.f> list3 = it25.f248622c;
                ArrayList arrayList2 = new ArrayList();
                for (qr2.f fVar : list3) {
                    Intrinsics.checkNotNullParameter(fVar, "<this>");
                    if (fVar instanceof qr2.d) {
                        qr2.d dVar = (qr2.d) fVar;
                        bVar = new kr2.b(dVar.f248613a, dVar.f248614b);
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        arrayList2.add(bVar);
                    }
                }
                qr2.j jVar = it25.d;
                Intrinsics.checkNotNullParameter(jVar, "<this>");
                kr2.c cVar = new kr2.c(str, str2, arrayList2, new kr2.a(jVar.f248618a, jVar.f248619b));
                hVar.getClass();
                return od0.h.a(cVar);
        }
    }
}
