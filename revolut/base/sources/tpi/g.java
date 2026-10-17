package tpi;

import aw0.a5;
import aw0.e5;
import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.internal.views.chart.HistogramView;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bizum.impl.ui.area.homescreen.BizumAreaHomescreenScreen;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.freelancer.common.models.FreelancerPermissions;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.tickets.api.extensions.TicketsWidgetContract$State;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.w40;
import ip0.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ql4.a0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f273404a;

    public /* synthetic */ g(int i) {
        this.f273404a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z = true;
        Object obj3 = null;
        switch (this.f273404a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "pair");
                return pair.f186385a;
            case 1:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "<unused var>", 2);
                for (int i = 0; i < 2; i++) {
                    arrayListP.add(new w40(a0.d.n("DISPUTE_LOADING_STEP_", i)));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                return new tqc.d(null, arrayListP);
            case 2:
                SavingsProductData product = (SavingsProductData) obj2;
                Intrinsics.checkNotNullParameter(product, "product");
                return Boolean.valueOf(x5d.b.l(product.f86683a));
            case 3:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 4:
                od0.i it8 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((ql4.a) it8.c()).i;
            case 5:
                od0.i it9 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return ((ql4.e) it9.c()).f247119h;
            case 6:
                od0.i it10 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                a0 a0Var = (a0) it10.f224257a;
                return a0Var != null ? a0Var.d : f0.f322471a;
            case 7:
                Intrinsics.checkNotNullParameter((trb.b) obj2, "<unused var>");
                return null;
            case 8:
                Intrinsics.checkNotNullParameter((tre.e) obj2, "$this$update");
                return new tre.e(0);
            case 9:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return new tre.d((List) pair2.f186385a, (List) pair2.f186386b);
            case 10:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new tre.g((List) getDefaultLoadingItems.invoke());
            case 11:
                a5 it11 = (a5) obj2;
                HistogramView.Companion companion = HistogramView.INSTANCE;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Float.valueOf(it11.f10230a);
            case 12:
                e5 item = (e5) obj2;
                HistogramView.Companion companion2 = HistogramView.INSTANCE;
                Intrinsics.checkNotNullParameter(item, "item");
                return Float.valueOf(HistogramView.i(item));
            case 13:
                y it12 = (y) obj2;
                KProperty[] kPropertyArr = BizumAreaHomescreenScreen.m0;
                Intrinsics.checkNotNullParameter(it12, "it");
                Object obj4 = it12.f167226b.f58324n;
                if (obj4 instanceof ts1.a) {
                    return (ts1.a) obj4;
                }
                return null;
            case 14:
                ReferralContactDelegate.Model it13 = (ReferralContactDelegate.Model) obj2;
                KProperty[] kPropertyArr2 = BizumAreaHomescreenScreen.m0;
                Intrinsics.checkNotNullParameter(it13, "it");
                Object obj5 = it13.f53167l;
                if (obj5 instanceof BizumContact) {
                    return (BizumContact) obj5;
                }
                return null;
            case 15:
                ReferralContactDelegate.Model it14 = (ReferralContactDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = BizumAreaHomescreenScreen.m0;
                Intrinsics.checkNotNullParameter(it14, "it");
                Object obj6 = it14.f53167l;
                if (obj6 instanceof ts1.a) {
                    return (ts1.a) obj6;
                }
                return null;
            case 16:
                ts1.b updateState = (ts1.b) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return ts1.b.a(updateState, Data.copy$default(updateState.f273920a, null, null, true, 3, null), false, 2);
            case 17:
                return ts1.b.a((ts1.b) obj2, null, false, 1);
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("ID_LOADING_HEADER", 0, 0, 30);
                pb0 pb0VarB = nb0.b(pb0.Companion, "ID_LOADING_ITEM", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                return v.k(guVar, pb0VarB);
            case 19:
                yoj.a feature = (yoj.a) obj2;
                Intrinsics.checkNotNullParameter(feature, "feature");
                if (!yoj.b.k(feature) && !yoj.b.l(feature)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 20:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return f0.f322471a;
            case 21:
                Intrinsics.checkNotNullParameter((ParcelableDestination) obj2, "it");
                return Boolean.TRUE;
            case 22:
                FreelancerPermissions it15 = (FreelancerPermissions) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                if (!it15.f73321a || (!it15.f73323c && !it15.f73322b)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                FreelancerPermissions it16 = (FreelancerPermissions) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(it16.f73321a);
            case 24:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                od0.h hVar = od0.i.Companion;
                Iterator it17 = cards.iterator();
                while (true) {
                    if (it17.hasNext()) {
                        Object next = it17.next();
                        h93.f0 f0Var = (h93.f0) next;
                        if (f0Var.v && !f0Var.f150124w && f0Var.w()) {
                            obj3 = next;
                        }
                    }
                }
                hVar.getClass();
                return od0.h.a(obj3);
            case 25:
                io3.d it18 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it18);
            case 26:
                Data update = (Data) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                try {
                    Object content = update.getContent();
                    return new Data(content != null ? TicketsWidgetContract$State.a((TicketsWidgetContract$State) content, null, null, null, 1) : null, update.getError(), update.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, update.getLoading());
                }
            case 27:
                Data data = (Data) obj2;
                try {
                    Object content2 = data.getContent();
                    return new Data(content2 != null ? TicketsWidgetContract$State.a((TicketsWidgetContract$State) content2, null, null, null, 1) : null, data.getError(), data.getLoading());
                } catch (Throwable th11) {
                    return new Data(null, th11, data.getLoading());
                }
            case 28:
                List assets = (List) obj2;
                Intrinsics.checkNotNullParameter(assets, "assets");
                ArrayList arrayList = new ArrayList();
                for (Object obj7 : assets) {
                    if (((CustomAsset) obj7).f99220h == vzi.c.ACTIVE) {
                        arrayList.add(obj7);
                    }
                }
                return arrayList;
            default:
                List assets2 = (List) obj2;
                Intrinsics.checkNotNullParameter(assets2, "assets");
                return c8g.a.F(assets2);
        }
    }

    public /* synthetic */ g(Object obj2, int i) {
        this.f273404a = i;
    }
}
