package xd2;

import androidx.room.util.SQLiteConnectionUtil;
import androidx.sqlite.SQLiteConnection;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.shipping.shared.ui.shipping_contacts.ShippingContactsScreen;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceAccountItem;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.onboarding.RevPointsPocketOnboardingScreen;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.impl.ui.flows.home.EsimHomeFlowContract$Step;
import ip0.gs;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.w60;
import ip0.x60;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import xga.z;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304242a;

    public /* synthetic */ n(int i) {
        this.f304242a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        ZonedDateTime zonedDateTime;
        boolean z = false;
        switch (this.f304242a) {
            case 0:
                k update = (k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data data = Data.copy$default(update.f304240a, null, null, true, 3, null);
                Intrinsics.checkNotNullParameter(data, "data");
                return new k(data);
            case 1:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return iii.c.c(3);
            case 2:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                List listK = v.k(new pb0("ITEM_0"), new pb0("ITEM_1"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 3:
                gs gsVar = (gs) obj2;
                KProperty[] kPropertyArr = RevPointsPocketOnboardingScreen.V;
                Intrinsics.checkNotNullParameter(gsVar, "<destruct>");
                return Boolean.valueOf(gsVar.f164466b.f110015b);
            case 4:
                ve7.n it10 = (ve7.n) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f288144a;
            case 5:
                String str = (String) obj2;
                KProperty[] kPropertyArr2 = ShippingContactsScreen.U;
                return prk.o.m(str, "it", str, "ADD_CONTACT_METHOD_MENU_ITEM_ID");
            case 6:
                Function0 it11 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return u.c(nb0.b(pb0.Companion, "SHIPPING_CONTACTS_LOADING_LIST_ID", false, 0, false, 30));
            case 7:
                Function0 it12 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return u.c(nb0.b(pb0.Companion, "SHIPPING_CONTACTS_LOADING_LIST_ID", false, 0, false, 30));
            case 8:
                try {
                    ((SQLiteConnection) obj2).prepare("DELETE FROM pricing_plan").step();
                    return null;
                } finally {
                }
            case 9:
                SQLiteConnection sQLiteConnection = (SQLiteConnection) obj2;
                try {
                    sQLiteConnection.prepare("DELETE FROM faq").step();
                    return Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection));
                } finally {
                }
            case 10:
                SQLiteConnection sQLiteConnection2 = (SQLiteConnection) obj2;
                try {
                    sQLiteConnection2.prepare("DELETE FROM settings").step();
                    return Integer.valueOf(SQLiteConnectionUtil.getTotalChangedRows(sQLiteConnection2));
                } finally {
                }
            case 11:
                FlowStep step = (FlowStep) obj2;
                Intrinsics.checkNotNullParameter(step, "step");
                return Boolean.valueOf(step instanceof EsimHomeFlowContract$Step.Subscriptions);
            case 12:
                FlowStep step2 = (FlowStep) obj2;
                Intrinsics.checkNotNullParameter(step2, "step");
                return Boolean.valueOf(step2 instanceof EsimHomeFlowContract$Step.Subscriptions);
            case 13:
                return Unit.f186387a;
            case 14:
                String token = (String) obj2;
                Intrinsics.checkNotNullParameter(token, "token");
                return xg6.q.b(token, null);
            case 15:
                Data it13 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.valueOf(!it13.getLoading());
            case 16:
                Function0 it14 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new xg7.f(u.c(new x60("LOTTERY_LOADING_PROMPT_ITEM_ID", w60.CIRCLE_ASSET, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254))));
            case 17:
                od0.i optional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optional, "optional");
                ig8.i iVar = (ig8.i) optional.f224257a;
                if (iVar != null && iVar.e) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                return z.INSTANCE.serializer();
            case 19:
                xgd.m update2 = (xgd.m) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return xgd.m.a(update2, null, null, null, 3);
            case 20:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 3);
                for (int i = 0; i < 3; i++) {
                    arrayListP.add(t61.a.o("loading-watchlist-row-", i, pb0.Companion, false, 6));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return arrayListP;
            case 21:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return (List) pair.f186385a;
            case 22:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                List list = (List) pair2.f186385a;
                List<ProductAccountId> list2 = (List) pair2.f186386b;
                if (list2.isEmpty() || list.isEmpty()) {
                    return new Pair(list, null);
                }
                if (list.size() == 1) {
                    return new Pair(list, f0.f322471a);
                }
                ArrayList<SubSpaceAccountItem> arrayList = new ArrayList(list.size());
                ArrayList arrayListF1 = d0.f1(list);
                for (ProductAccountId productAccountId : list2) {
                    Iterator it15 = arrayListF1.iterator();
                    while (true) {
                        if (it15.hasNext()) {
                            SubSpaceAccountItem subSpaceAccountItem = (SubSpaceAccountItem) it15.next();
                            ProductAccount productAccount = subSpaceAccountItem.f89560b;
                            if (Intrinsics.f(productAccount.getF89504c().f89729a, productAccountId.f89729a) && productAccount.getF89499a()) {
                                arrayList.add(subSpaceAccountItem);
                                it15.remove();
                            }
                        }
                    }
                }
                arrayList.addAll(arrayListF1);
                ArrayList arrayList2 = new ArrayList();
                for (SubSpaceAccountItem subSpaceAccountItem2 : arrayList) {
                    ProductAccountId f89504c = subSpaceAccountItem2.f89560b.getF89499a() ? subSpaceAccountItem2.f89560b.getF89504c() : null;
                    if (f89504c != null) {
                        arrayList2.add(f89504c);
                    }
                }
                return new Pair(arrayList, arrayList2);
            case 23:
                List cardsWithAvailability = (List) obj2;
                Intrinsics.checkNotNullParameter(cardsWithAvailability, "cardsWithAvailability");
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : cardsWithAvailability) {
                    zh9.k kVar = ((zh9.j) obj3).f322292b;
                    Intrinsics.checkNotNullParameter(kVar, "<this>");
                    if (kVar == zh9.k.ReadyToUse) {
                        arrayList3.add(obj3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                Iterator it16 = arrayList3.iterator();
                while (it16.hasNext()) {
                    arrayList4.add(((zh9.j) it16.next()).f322291a);
                }
                return arrayList4;
            case 24:
                Throwable it17 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.FALSE;
            case 25:
                return ((xhj.e) obj2).f306259b;
            case 26:
                Function0 it18 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                IntRange intRangeO = kotlin.ranges.f.o(1, 3);
                ArrayList arrayList5 = new ArrayList(w.t(intRangeO, 10));
                vim.f it19 = intRangeO.iterator();
                while (it19.f289625c) {
                    arrayList5.add(t61.a.o("loadingItemId", it19.nextInt(), pb0.Companion, false, 4));
                }
                yp0.b.k(arrayList5, 0, 0, 0, 0, 31);
                return arrayList5;
            case 27:
                xid.c it20 = (xid.c) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                fvb.a aVar = (fvb.a) it20.f306323b.getContent();
                if (aVar == null || (zonedDateTime = aVar.e) == null) {
                    return null;
                }
                return zonedDateTime.toInstant();
            case 28:
                Function0 it21 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                List listK2 = v.k(nb0.b(pb0.Companion, "LOADING_LIST_ID_0", false, 0, false, 30), new s7("LOADING_LIST_ID_1", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                IntRange intRangeO2 = kotlin.ranges.f.o(0, 3);
                ArrayList arrayList6 = new ArrayList(w.t(intRangeO2, 10));
                vim.f it22 = intRangeO2.iterator();
                while (it22.f289625c) {
                    arrayList6.add(new s7(a0.d.n("LOADING_LIST_ID_", it22.nextInt() + 2), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList6, 0, 0, 0, 0, 31);
                List listK3 = v.k(new s7("LOADING_LIST_ID_5", 0, 0, 0, 0, false, null, 126), new s7("LOADING_LIST_ID_6", 0, 0, 0, 0, false, null, 126));
                yp0.b.k(listK3, 0, 0, 0, 0, 31);
                return w.u(v.k(listK2, arrayList6, listK3));
            default:
                efm.i it23 = (efm.i) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return it23.b(30L, TimeUnit.SECONDS);
        }
    }

    public /* synthetic */ n(Object obj2, int i) {
        this.f304242a = i;
    }
}
