package njf;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.retail.feature.esim.api.model.EsimDataPlan;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.EsimMobilePlanCheckoutScreen;
import com.youTransactor.uCube.rpc.Constants;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import kotlin.text.MatchResult;
import njj.a0;
import njj.b0;
import njj.k0;
import nl0.f;
import ql4.u;
import zhm.f0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216485a;

    public /* synthetic */ d(int i) {
        this.f216485a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f216485a) {
            case 0:
                bla.c it8 = (bla.c) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8 == bla.c.ENABLED);
            case 1:
                List walletIdsToNames = (List) obj2;
                Intrinsics.checkNotNullParameter(walletIdsToNames, "walletIdsToNames");
                return r0.t(walletIdsToNames);
            case 2:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list = (List) pair.f186385a;
                Map map = (Map) pair.f186386b;
                List<io3.d> list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (io3.d dVar : list2) {
                    arrayList.add(new Pair(dVar, map.get(dVar.f163146b)));
                }
                return arrayList;
            case 3:
                List it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                List list3 = it9;
                ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
                Iterator it10 = list3.iterator();
                while (it10.hasNext()) {
                    arrayList2.add(((u) it10.next()).f247185b);
                }
                return w.u(arrayList2);
            case 4:
                ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) obj2;
                KProperty[] kPropertyArr = EsimMobilePlanCheckoutScreen.Y;
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj3 = model.f52715m;
                if (obj3 instanceof EsimDataPlan) {
                    return (EsimDataPlan) obj3;
                }
                return null;
            case 5:
                od0.i optionalPaymentMethod = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalPaymentMethod, "optionalPaymentMethod");
                PaymentMethod paymentMethod = (PaymentMethod) optionalPaymentMethod.g();
                if (paymentMethod != null) {
                    PaymentMethod.Pocket pocket = (PaymentMethod.Pocket) (!(paymentMethod instanceof PaymentMethod.Pocket) ? null : paymentMethod);
                    if (pocket != null) {
                        return pocket;
                    }
                }
                throw new IllegalStateException(j6.a.q("Unable to get default pocket. Default payment method type is: ", paymentMethod != null ? paymentMethod.getClass().getName() : null).toString());
            case 6:
                b0 currentState = (b0) obj2;
                Intrinsics.checkNotNullParameter(currentState, "currentState");
                return t1.u(currentState.d, currentState.e, zi0.c.P(Boolean.valueOf(currentState.f216547h), false, null, 3));
            case 7:
                b0 update = (b0) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return b0.a(update, null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, new Data(null, null, true, 3, null), null, null, false, null, Constants.TAG_USB_CAPABILITY);
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                List listK = v.k(new s7("loadingItemId1", 0, i, i2, i3, false, null, 126), new s7("loadingItemId2", i, i2, i3, 0 == true ? 1 : 0, false, null, 126), new s7("loadingItemId3", i2, i3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, null, 126), new s7("loadingItemId4", i3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, null, 126), new s7("loadingItemId5", 0, 0, 0, 0, false, null, 126));
                int i5 = 0;
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                int i6 = 0;
                List listC = zhm.u.c(nb0.b(pb0.Companion, "loadingItemId6", false, 0, false, 30));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                List listO = i2b.a.o(listK, listC);
                List listK2 = v.k(new s7("loadingItemId7", 0, i5, i3, i6, false, null, 126), new s7("loadingItemId8", i5, i3, i6, 0 == true ? 1 : 0, false, null, 126));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                List listO2 = i2b.a.o(listO, listK2);
                a0.Companion.getClass();
                return new k0(null, null, listO2, a0.f216537c);
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return nb0.b(pb0.Companion, "PAYMENT_METHOD_PAYMENT_METHODS_LIST_ID", false, 0, false, 30);
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 11:
                nk2.f update2 = (nk2.f) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return nk2.f.a(update2, new Data(null, null, false, 6, null), null, 11);
            case 12:
                return nk2.f.a((nk2.f) obj2, new Data(null, null, false, 6, null), null, 11);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new cii.b(null, f0.f322471a, new lw0.h(lw0.i.TITLE_SUBTITLE));
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new cii.b(null, f0.f322471a, new lw0.h(lw0.i.TITLE_SUBTITLE));
            case 15:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 17:
                List repaymentsWithPlan = (List) obj2;
                Intrinsics.checkNotNullParameter(repaymentsWithPlan, "repaymentsWithPlan");
                return new nk9.f(repaymentsWithPlan);
            case 18:
                Sequence it11 = (Sequence) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.iterator();
            case 19:
                return obj2;
            case 20:
                Iterable it12 = (Iterable) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.iterator();
            case 21:
                IndexedValue it13 = (IndexedValue) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f186392b;
            case 22:
                MatchResult it14 = (MatchResult) obj2;
                f.a aVar = nl0.f.Companion;
                Intrinsics.checkNotNullParameter(it14, "it");
                f.a aVar2 = nl0.f.Companion;
                String str = (String) it14.c().get(4);
                aVar2.getClass();
                return " <a href=\"https://sc.revolut.com/chargebacks" + f.a.b(str) + "\">" + it14.c().get(0) + "</a> ";
            case 23:
                MatchResult matchResult = (MatchResult) obj2;
                f.a aVar3 = nl0.f.Companion;
                if (((CharSequence) a10.b.n(matchResult, "match", 1)).length() > 0) {
                    return (CharSequence) matchResult.c().get(1);
                }
                String str2 = (String) matchResult.c().get(2);
                Object obj4 = matchResult.c().get(3);
                Object obj5 = matchResult.c().get(4);
                StringBuilder sb6 = new StringBuilder();
                sb6.append(obj4);
                sb6.append(obj5);
                String string = sb6.toString();
                nl0.f.Companion.getClass();
                String strB = f.a.b(string);
                String strSubstring = string.substring(strB.length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return v0.a.i(p.a.t(str2, "<a href=\"", strB, "\">", strB), "</a>", strSubstring);
            case 24:
                MatchResult match = (MatchResult) obj2;
                f.a aVar4 = nl0.f.Companion;
                Intrinsics.checkNotNullParameter(match, "match");
                return p.a.p("<ul>", match.getValue(), "</ul>");
            case 25:
                Intrinsics.checkNotNullParameter((MatchResult) obj2, "it");
                return "";
            case 26:
                return (CharSequence) a10.b.n((MatchResult) obj2, "it", 1);
            case 27:
                Intrinsics.checkNotNullParameter((MatchResult) obj2, "it");
                return "";
            case 28:
                MatchResult matchResult2 = (MatchResult) obj2;
                Object objN = a10.b.n(matchResult2, "it", 2);
                f.a aVar5 = nl0.f.Companion;
                String str3 = (String) matchResult2.c().get(4);
                aVar5.getClass();
                String strB2 = f.a.b(str3);
                Object obj6 = matchResult2.c().get(2);
                Object obj7 = matchResult2.c().get(4);
                StringBuilder sb9 = new StringBuilder(" <a href=\"");
                sb9.append(objN);
                sb9.append(strB2);
                sb9.append("\">");
                sb9.append(obj6);
                return com.revolut.data.database.models.openbanking.d.t(sb9, obj7, "</a> ");
            default:
                MatchResult matchResult3 = (MatchResult) obj2;
                Object objN2 = a10.b.n(matchResult3, "it", 2);
                Object obj8 = matchResult3.c().get(4);
                StringBuilder sb10 = new StringBuilder();
                sb10.append(objN2);
                sb10.append(obj8);
                return sb10.toString();
        }
    }

    public /* synthetic */ d(com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_checkout.b bVar, int i) {
        this.f216485a = i;
    }
}
