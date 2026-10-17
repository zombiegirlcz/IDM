package l2d;

import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.address.flow.CreditAddressFlowContract$State;
import com.revolut.feature.credit.application.plugins.impl.ui.autopay.card.flow.CreditCardApplicationAutopayFlowContract$State;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.store.api.model.StoreMegaFilter;
import com.revolut.feature.transfer.models.config.AdditionalInformationInput;
import com.revolut.feature.transfer.models.config.AdditionalInformationInputMaskConfig;
import d9.t0;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l3e.o;
import m2k.r;
import tof.i3;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191766a;

    public /* synthetic */ a(int i) {
        this.f191766a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LinkedHashMap linkedHashMap;
        xi0.b bVar;
        ?? arrayList;
        switch (this.f191766a) {
            case 0:
                List listOfPairs = (List) obj2;
                Intrinsics.checkNotNullParameter(listOfPairs, "listOfPairs");
                List<i> list = listOfPairs;
                int iB = q0.b(w.t(list, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
                for (i iVar : list) {
                    FavouritesAssetTypeKey favouritesAssetTypeKey = iVar.f191782a;
                    List list2 = iVar.f191783b;
                    if (list2 != null) {
                        List list3 = list2;
                        int iB2 = q0.b(w.t(list3, 10));
                        if (iB2 < 16) {
                            iB2 = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iB2);
                        for (Object obj3 : list3) {
                            linkedHashMap.put(((u3d.a) obj3).f276920a, obj3);
                        }
                    } else {
                        linkedHashMap = null;
                    }
                    linkedHashMap2.put(favouritesAssetTypeKey, linkedHashMap);
                }
                return linkedHashMap2;
            case 1:
                Data it8 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.getContent() != null);
            case 2:
                StoreMegaFilter.StoreMegaFilterValue it9 = (StoreMegaFilter.StoreMegaFilterValue) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f88540a;
            case 3:
                l2k.b params = (l2k.b) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                String strD = cp5.d.d(params.f191810a);
                long j2 = params.f191811b;
                dj0.d dVar = params.f191812c;
                Long lValueOf = dVar != null ? Long.valueOf(dVar.f115082a) : null;
                String str = (dVar == null || (bVar = dVar.f115083b) == null) ? null : bVar.f306286a;
                String str2 = params.d;
                String str3 = params.e;
                String str4 = params.f;
                String str5 = str4 != null ? str4 : null;
                StringBuilder sb6 = new StringBuilder("pair=");
                sb6.append(strD);
                sb6.append(", transferAmount=");
                sb6.append(j2);
                sb6.append(", transferFeeAmount=");
                sb6.append(lValueOf);
                sb6.append(", transferFeeCurrency=");
                sb6.append(str);
                j6.a.D(sb6, ", recipientCountry=", str2, ", sourcePocketId=", str3);
                return a0.d.u(sb6, ", walletId=", str5, ", taxTreatment=null");
            case 4:
                List listParams = (List) obj2;
                Intrinsics.checkNotNullParameter(listParams, "listParams");
                return (l2k.b) d0.b0(listParams);
            case 5:
                m2k.a it10 = (m2k.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Intrinsics.checkNotNullParameter(it10, "<this>");
                m2k.b inputConfig = it10.getInputConfig();
                krf.b bVar2 = inputConfig != null ? new krf.b(inputConfig.getType(), inputConfig.getLabel()) : null;
                List inputs = it10.getInputs();
                if (inputs != null) {
                    List<m2k.c> list4 = inputs;
                    arrayList = new ArrayList(w.t(list4, 10));
                    for (m2k.c cVar : list4) {
                        String type = cVar.getType();
                        String label = cVar.getLabel();
                        String validationPattern = cVar.getValidationPattern();
                        String initialValue = cVar.getInitialValue();
                        if (initialValue == null) {
                            initialValue = "";
                        }
                        String str6 = initialValue;
                        m2k.d format = cVar.getFormat();
                        arrayList.add(new AdditionalInformationInput(type, label, validationPattern, str6, format != null ? new AdditionalInformationInputMaskConfig(format.getType(), format.getMask()) : null));
                    }
                } else {
                    arrayList = f0.f322471a;
                }
                return new krf.a(bVar2, arrayList);
            case 6:
                List it11 = (List) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return t0.w((m2k.e) d0.b0(it11));
            case 7:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                List<r> list5 = transactions;
                ArrayList arrayList2 = new ArrayList(w.t(list5, 10));
                for (r rVar : list5) {
                    Intrinsics.checkNotNullParameter(rVar, "<this>");
                    arrayList2.add(new kq2.b(rVar.getGroupId(), null));
                }
                return arrayList2;
            case 8:
                z3d.d watchlist = (z3d.d) obj2;
                Intrinsics.checkNotNullParameter(watchlist, "watchlist");
                return Boolean.valueOf(watchlist.d);
            case 9:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return r0.t(w.u(it12));
            case 10:
                List it13 = (List) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return w.u(it13);
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new ogd.k(ogd.m.MANUAL, null);
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                IntRange intRangeO = kotlin.ranges.f.o(0, 3);
                ArrayList arrayList3 = new ArrayList(w.t(intRangeO, 10));
                vim.f it14 = intRangeO.iterator();
                while (it14.f289625c) {
                    arrayList3.add(nb0.b(pb0.Companion, a0.d.n("STORE_ORDERS_LOADING_", it14.nextInt()), false, 0, false, 30));
                }
                return yp0.b.g(arrayList3, o.b(), null, 0, 0, 126);
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                IntRange intRangeO2 = kotlin.ranges.f.o(0, 3);
                ArrayList arrayList4 = new ArrayList(w.t(intRangeO2, 10));
                vim.f it15 = intRangeO2.iterator();
                while (it15.f289625c) {
                    arrayList4.add(nb0.b(pb0.Companion, a0.d.n("STORE_ORDERS_GIFT_CARDS_LOADING_", it15.nextInt()), false, 0, false, 30));
                }
                return yp0.b.g(arrayList4, o.a(), null, 0, 0, 126);
            case 14:
                List list6 = (List) obj2;
                Intrinsics.checkNotNullParameter(list6, "list");
                List<qta.a> list7 = list6;
                ArrayList arrayList5 = new ArrayList(w.t(list7, 10));
                for (qta.a aVar : list7) {
                    arrayList5.add(n9l.a.a(n14.k.I(aVar), aVar.f249041c.doubleValue()));
                }
                return arrayList5;
            case 15:
                List it16 = (List) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return (qta.a) d0.o0(it16);
            case 16:
                qta.a it17 = (qta.a) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return n9l.a.a(n14.k.I(it17), it17.f249041c.doubleValue());
            case 17:
                List it18 = (List) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return (n9l.a) d0.o0(it18);
            case 18:
                CharSequence it19 = (CharSequence) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return it19.toString();
            case 19:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new l42.d((List) getDefaultLoadingItems.invoke(), null);
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return nb0.a(pb0.Companion, "CARD_LIMIT_LOADING_ID", false, 6);
            case 21:
                CreditAddressFlowContract$State update = (CreditAddressFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return CreditAddressFlowContract$State.a(update, null, null, null, 3);
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 23:
                CreditCardApplicationAutopayFlowContract$State update2 = (CreditCardApplicationAutopayFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return CreditCardApplicationAutopayFlowContract$State.a(update2, null, null, null, null, null, l54.b.REVOLUT, 31);
            case 24:
                CreditCardApplicationAutopayFlowContract$State update3 = (CreditCardApplicationAutopayFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return CreditCardApplicationAutopayFlowContract$State.a(update3, null, null, null, null, null, l54.b.EXTERNAL, 31);
            case 25:
                rlm.f Json = (rlm.f) obj2;
                Lazy lazy = l57.a.f192185a;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                return Unit.f186387a;
            case 26:
                xi0.b it20 = (xi0.b) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return it20.f306286a;
            case 27:
                i3 it21 = (i3) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.getId();
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(b5a.d.a());
            default:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f191766a = i;
    }
}
