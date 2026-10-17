package jyk;

import com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillLink;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import com.revolut.feature.trade_rev_points.models.TradeRevPointsAccount;
import com.revolut.feature.travel.experiences.impl.ui.flow.tabs.TravelExperiencesTabsFlowContract$PagerItem;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.trading_onboarding.impl.ui.onboarding_otp_dialog.OnboardingOtpDialogDestination;
import ip0.ce;
import ip0.gu;
import ip0.xk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k0e.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class d0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179467a;

    public /* synthetic */ d0(int i) {
        this.f179467a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2 = null;
        switch (this.f179467a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.TRUE;
            case 1:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.TRUE;
            case 2:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                ufm.b bVarM = efm.d0.m(Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 3:
                Boolean isScucess = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isScucess, "isScucess");
                return vhi.c.c(new OnboardingOtpDialogDestination(isScucess.booleanValue()), yhi.b.BOTTOM_DIALOG, null, false, 12);
            case 4:
                FeatureCommand it11 = (FeatureCommand) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.TRUE;
            case 5:
                Unit it12 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.TRUE;
            case 6:
                Throwable it13 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return Boolean.FALSE;
            case 7:
                Unit it14 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.TRUE;
            case 8:
                hv.e event = (hv.e) obj2;
                Intrinsics.checkNotNullParameter(event, "event");
                return Boolean.valueOf(event instanceof hv.d);
            case 9:
                jz.b update = (jz.b) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return new jz.b(update.f179535a + 1);
            case 10:
                RevPointsEarningRate earningRate = (RevPointsEarningRate) obj2;
                Intrinsics.checkNotNullParameter(earningRate, "earningRate");
                return Boolean.valueOf(earningRate.f83975a == f1.CREDIT_CARD);
            case 11:
                Function0 it15 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new hzb.v(zhm.f0.f322471a);
            case 12:
                Function0 it16 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                Float fValueOf = Float.valueOf(8.0f);
                gu guVar = new gu("TOP_BRANDS_TITLE_ID", 0, 0, 30);
                ArrayList arrayList = new ArrayList(6);
                for (int i = 0; i < 6; i++) {
                    ce ceVar = new ce(a0.d.n("TOP_BRANDS_SECTION_ID_loading_", i));
                    yp0.b.l(ceVar, 0, 0, 0, 0, null, false, 63);
                    arrayList.add(ceVar);
                }
                return zhm.v.k(guVar, new xk("TOP_BRANDS_SECTION_ID", arrayList, 3, fValueOf, fValueOf, 32));
            case 13:
                Function0 it17 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return zhm.f0.f322471a;
            case 14:
                Function0 it18 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return zhm.f0.f322471a;
            case 15:
                jzh.r it19 = (jzh.r) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.f179847a;
            case 16:
                jzh.r it20 = (jzh.r) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f179848b;
            case 17:
                do3.n it21 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return do3.q.y(it21);
            case 18:
                jzh.r it22 = (jzh.r) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.f179847a;
            case 19:
                do3.n it23 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return do3.q.y(it23);
            case 20:
                Function0 it24 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return h.b.f180029a;
            case 21:
                Function0 it25 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return null;
            case 22:
                Object f53364p = ((qv0.p) obj2).getF55256g();
                if (f53364p instanceof k0h.f) {
                    return (k0h.f) f53364p;
                }
                return null;
            case 23:
                List links = (List) obj2;
                Intrinsics.checkNotNullParameter(links, "links");
                long jCurrentTimeMillis = System.currentTimeMillis();
                List list = links;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (fnc.s.k((SplitBillLink) obj3, jCurrentTimeMillis)) {
                        arrayList2.add(obj3);
                    }
                }
                Iterator it26 = arrayList2.iterator();
                if (it26.hasNext()) {
                    next = it26.next();
                    if (it26.hasNext()) {
                        long j2 = ((SplitBillLink) next).d;
                        do {
                            Object next3 = it26.next();
                            long j3 = ((SplitBillLink) next3).d;
                            if (j2 < j3) {
                                next = next3;
                                j2 = j3;
                            }
                        } while (it26.hasNext());
                    }
                } else {
                    next = null;
                }
                SplitBillLink splitBillLink = (SplitBillLink) next;
                if (splitBillLink != null) {
                    return splitBillLink;
                }
                Iterator it27 = list.iterator();
                if (it27.hasNext()) {
                    next2 = it27.next();
                    if (it27.hasNext()) {
                        long j5 = ((SplitBillLink) next2).d;
                        do {
                            Object next4 = it27.next();
                            long j16 = ((SplitBillLink) next4).d;
                            if (j5 < j16) {
                                next2 = next4;
                                j5 = j16;
                            }
                        } while (it27.hasNext());
                    }
                }
                return (SplitBillLink) next2;
            case 24:
                j1f.j response = (j1f.j) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                List list2 = response.f170389a;
                ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
                Iterator it28 = list2.iterator();
                while (it28.hasNext()) {
                    arrayList3.add(ofm.q.Q((j1f.c) it28.next()));
                }
                return arrayList3;
            case 25:
                j1f.c response2 = (j1f.c) obj2;
                Intrinsics.checkNotNullParameter(response2, "response");
                od0.h hVar = od0.i.Companion;
                TradeRevPointsAccount tradeRevPointsAccountQ = ofm.q.Q(response2);
                hVar.getClass();
                return od0.h.a(tradeRevPointsAccountQ);
            case 26:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                if (!(error instanceof HttpException) || ((HttpException) error).code() != 404) {
                    return efm.d0.l(error);
                }
                od0.i.Companion.getClass();
                return efm.d0.m(od0.i.f224256b);
            case 27:
                j1f.n it29 = (j1f.n) obj2;
                Intrinsics.checkNotNullParameter(it29, "it");
                return h1f.a.c(it29);
            case 28:
                j1f.o response3 = (j1f.o) obj2;
                Intrinsics.checkNotNullParameter(response3, "response");
                List list3 = response3.f170419a;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list3, 10));
                Iterator it30 = list3.iterator();
                while (it30.hasNext()) {
                    arrayList4.add(h1f.a.c((j1f.n) it30.next()));
                }
                return arrayList4;
            default:
                k1g.e update2 = (k1g.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return k1g.e.a(update2, new TravelExperiencesTabsFlowContract$PagerItem.Discover(0).getF94249a(), null, 5);
        }
    }

    public /* synthetic */ d0(Object obj2, int i) {
        this.f179467a = i;
    }
}
