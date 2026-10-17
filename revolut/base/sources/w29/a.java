package w29;

import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import com.revolut.feature.joint.impl.ui.deeplink.JointDeeplinkFlowContract$State;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.feature.retail.cfd.impl.flows.order.CfdOrderData;
import i93.h;
import ip0.co;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.qi;
import ip0.s7;
import ip0.u90;
import j19.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.t0;
import n38.o;
import rlm.f;
import tlm.d;
import tlm.e;
import w2a.g;
import w2a.j;
import w2a.l;
import w38.i;
import w5b.q5;
import wp5.y;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293980a;

    public /* synthetic */ a(int i) {
        this.f293980a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String str;
        List list;
        h hVar;
        i93.c cVar;
        int i = 0;
        Object obj3 = null;
        switch (this.f293980a) {
            case 0:
                f Json = (f) obj2;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255100b = false;
                e eVar = Json.f255103h;
                tlm.f fVar = new tlm.f();
                p0 p0Var = o0.f186429a;
                fVar.h(p0Var.b(k.class), new w2.c(28));
                fVar.h(p0Var.b(l19.b.class), new w2.c(29));
                fVar.h(p0Var.b(j19.c.class), new q09.a(20));
                fVar.f(p0Var.b(k19.h.class), c.f293982a);
                Unit unit = Unit.f186387a;
                d dVarA = tlm.h.a(eVar, fVar.a());
                Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
                Json.f255103h = dVarA;
                return Unit.f186387a;
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB = u.b();
                while (i < 21) {
                    eVarB.add(new u90(null, 1, 1, false, false, a0.d.n("LOADING_ITEM_", i), null));
                    i++;
                }
                return new l(u.a(eVarB), w2a.k.GRID);
            case 2:
                j update = (j) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                m70.a.c(t0.f186434a);
                return j.a(update, null, new w2a.h(""), null, 11);
            case 3:
                j update2 = (j) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return j.a(update2, null, new g(update2.d.f159882a), null, 11);
            case 4:
                CfdOrderData it8 = (CfdOrderData) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f82169a;
            case 5:
                MarginQuote it9 = (MarginQuote) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f.f104792a;
            case 6:
                CfdOrderData it10 = (CfdOrderData) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f82169a;
            case 7:
                w2e.a update3 = (w2e.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return w2e.a.c(update3, f0.f322471a);
            case 8:
                List list2 = w2e.j.f294037a;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return w2e.j.f294037a;
            case 9:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                io3.d dVar = (io3.d) d0.M0(pockets);
                if (dVar == null || (str = dVar.f163145a) == null) {
                    return null;
                }
                return new i(new o(str), 0, false);
            case 10:
                return u38.d.a((List) obj2);
            case 11:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list3 = (List) pair.f186385a;
                xi0.b bVar = (xi0.b) pair.f186386b;
                Iterator it11 = list3.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next = it11.next();
                        if (Intrinsics.f(((io3.d) next).f163147c, bVar.f306286a)) {
                            obj3 = next;
                        }
                    }
                }
                od0.i.Companion.getClass();
                return od0.h.a((io3.d) obj3);
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                lw0.h hVar2 = new lw0.h(lw0.i.TITLE_SUBTITLE);
                ArrayList arrayList = new ArrayList(3);
                while (i < 3) {
                    arrayList.add(new s7(a0.d.n("cfd-margin-breakdown-loading-", i), 0, 0, 0, 0, false, null, 126));
                    i++;
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                s7 s7Var = new s7("cfd-margin-breakdown-loading-margin-item", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                return new cii.b(null, d0.F0(s7Var, arrayList), hVar2);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB2 = u.b();
                nb0 nb0Var = pb0.Companion;
                pb0 pb0VarB = nb0.b(nb0Var, "PAYMENT_METHOD_LOADING_ITEM_LIST_ID", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(pb0VarB);
                List listK = v.k(nb0.b(nb0Var, "DELIVERY_ADDRESS_LOADING_ITEM_LIST_ID", false, 0, false, 30), nb0.b(nb0Var, "DELIVERY_METHOD_LOADING_ITEM_LIST_ID", false, 0, false, 30));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                eVarB2.addAll(listK);
                gu guVar = new gu("ORDER_SUMMARY_SUBHEADER_LOADING_ITEM_LIST_ID", 0, 0, 30);
                pb0 pb0VarB2 = nb0.b(nb0Var, "PRODUCT_LOADING_ITEM_LIST_ID", false, 0, false, 30);
                yp0.b.l(pb0VarB2, 0, 0, 0, 0, null, false, 63);
                eVarB2.addAll(v.k(guVar, pb0VarB2));
                return new w3c.k(u.a(eVarB2), 62);
            case 14:
                yoj.a aVar = (yoj.a) obj2;
                return y.s(aVar, "cryptoFeature", aVar);
            case 15:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : cards) {
                    h93.f0 f0Var = (h93.f0) obj4;
                    if (((f0Var == null || (cVar = f0Var.f150113g) == null) ? null : cVar.f159553h) == i93.d.POCKETS) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it12 = arrayList2.iterator();
                while (it12.hasNext()) {
                    i93.c cVar2 = ((h93.f0) it12.next()).f150113g;
                    String str2 = (cVar2 == null || (list = cVar2.f) == null || (hVar = (h) d0.d0(list)) == null) ? null : hVar.f159559a;
                    if (str2 != null) {
                        arrayList3.add(str2);
                    }
                }
                return d0.i1(arrayList3);
            case 16:
                List pockets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets2, "pockets");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : pockets2) {
                    if (!cp5.d.y(z92.f.l((io3.d) obj5))) {
                        arrayList4.add(obj5);
                    }
                }
                ArrayList arrayList5 = new ArrayList(w.t(arrayList4, 10));
                Iterator it13 = arrayList4.iterator();
                while (it13.hasNext()) {
                    arrayList5.add(new PocketWithSubaccount((io3.d) it13.next(), (String) null, (xi0.b) null, (List) null, false, 62));
                }
                return arrayList5;
            case 17:
                JointDeeplinkFlowContract$State update4 = (JointDeeplinkFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                update4.getClass();
                return new JointDeeplinkFlowContract$State("JOINT_PENDING_INVITATION_PRODUCT_ID");
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return Boolean.FALSE;
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return Boolean.FALSE;
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(new co("homeScreenPreviewLoadingDelegate"));
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(new qi("selectionOptionLoadingTabs", 2));
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 24:
                CellDetailsNoteDelegate.Model it14 = (CellDetailsNoteDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(Intrinsics.f(it14.f51871a, "ID_TRANSFER_REVIEW_ARRIVING_ON"));
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 26:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 27:
                return q5.INSTANCE.serializer();
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return x6b.b.f303054a;
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return x6b.f.f303059a;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f293980a = i;
    }
}
