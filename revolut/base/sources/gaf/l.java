package gaf;

import aw0.m6;
import aw0.n6;
import com.revolut.core.chaosmanagement.domain.model.ChaosManagementIncidentItem;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.a;
import com.revolut.feature.apm.services.ideal.impl.ui.accounts.IDealAccountsListController;
import com.revolut.feature.cashback.api.models.CashbackByCurrencies;
import com.revolut.feature.cashback.api.models.CashbackBySources;
import com.revolut.feature.cashback.api.models.CashbackCurrency;
import com.revolut.feature.cashback.api.models.CashbackSource;
import com.revolut.feature.wealth.impl.ui.extensions.remote_disclaimers.MissingWealthRemoteDisclaimersException;
import efm.d0;
import gc6.q;
import ip0.ij;
import ip0.w60;
import ip0.x60;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kd0.b;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import le.u1;
import org.joda.time.DateTime;
import ox0.b0;
import qua.p;
import retrofit2.HttpException;
import uc3.c;
import zhm.f0;
import zhm.q0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142169a;

    public /* synthetic */ l(int i) {
        this.f142169a = i;
    }

    /* JADX WARN: Type inference failed for: r9v21, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Iterator it8;
        ChaosManagementIncidentItem.Banner.ActionButton actionButton;
        xi0.b bVarA = null;
        switch (this.f142169a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                b0 b0Var = b0.ABOVE_BUTTONS;
                n6.Companion.getClass();
                return new aw0.e(false, null, b0Var, m6.a(), null, null, 51);
            case 1:
                rdh.b it9 = (rdh.b) obj2;
                int i = MissingWealthRemoteDisclaimersException.f95535a;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.name();
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(new ij("WEALTH_DISCLAIMER_LOADING_LIST_ID"));
            case 3:
                e7l.f it10 = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                List list = it10.f123380m;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it11 = list.iterator();
                while (it11.hasNext()) {
                    kii.e.B(wi0.b.Companion, (String) it11.next(), arrayList);
                }
                return arrayList;
            case 4:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 5:
                com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.a outputData = (com.revolut.feature.acquiring.card_reader.ui.impl.ui.flow.connection.a) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (Intrinsics.f(outputData, a.C0448a.f60624a) || Intrinsics.f(outputData, a.b.f60625a)) {
                    return Unit.f186387a;
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                Intrinsics.checkNotNullParameter((gc4.e) obj2, "$this$update");
                return new gc4.e(new Data(null, null, true, 3, null));
            case 7:
                rlm.f Json = (rlm.f) obj2;
                Lazy lazy = gc5.a.f142335a;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                Json.f255100b = false;
                return Unit.f186387a;
            case 8:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return q.b(1);
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return q.b(0);
            case 12:
                xi0.b.Companion.getClass();
                return new dj0.d(0L, xi0.b.D);
            case 13:
                List merchants = (List) obj2;
                Intrinsics.checkNotNullParameter(merchants, "merchants");
                List list2 = merchants;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it12 = list2.iterator();
                while (it12.hasNext()) {
                    arrayList2.add(ecc.a.a((fcc.e) it12.next()));
                }
                return arrayList2;
            case 14:
                gcc.e params = (gcc.e) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                params.getClass();
                return com.google.android.gms.internal.mlkit_vision_face.a.r("PROMOTED_MERCHANTS_PREVIEW_KEY:9_", params.f142398a);
            case 15:
                ((Boolean) obj2).getClass();
                return "PROMOTED_MERCHANTS_ELIGIBILITY_KEY";
            case 16:
                p recurringPayment = (p) obj2;
                Intrinsics.checkNotNullParameter(recurringPayment, "recurringPayment");
                return new hce.c(new hce.b(recurringPayment, new Data(null, null, false, 7, null), null), false);
            case 17:
                RowDelegate.Model it13 = (RowDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                Object obj3 = it13.u;
                if (obj3 instanceof gch.a) {
                    return (gch.a) obj3;
                }
                return null;
            case 18:
                gck.l update = (gck.l) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                od0.i.Companion.getClass();
                return gck.l.a(update, null, new Data(od0.i.f224256b, null, false, 6, null), 5);
            case 19:
                return gck.l.a((gck.l) obj2, null, new Data(null, null, true, 3, null), 5);
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(new x60("receivedGiftIntroLoadingId", w60.BACKGROUND_ASSET, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
            case 21:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return Boolean.FALSE;
            case 22:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                List list3 = it14;
                ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                Iterator it15 = list3.iterator();
                while (it15.hasNext()) {
                    kd0.b bVar = (kd0.b) it15.next();
                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                    String strB = bVar.getId();
                    nd0.a aVarA = jd0.a.a(bVar.getState());
                    Map mapA = bVar.getBanners();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapA.size()));
                    for (Map.Entry entry : mapA.entrySet()) {
                        linkedHashMap.put(jd0.a.a((String) entry.getKey()), entry.getValue());
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        Object key = entry2.getKey();
                        b.a aVar = (b.a) entry2.getValue();
                        String strD = aVar.getTitle();
                        String strC = aVar.getSubtitle();
                        String strB2 = aVar.getIconUrl();
                        b.a.C1044a c1044aA = aVar.getActionButton();
                        if (c1044aA != null) {
                            String strB3 = c1044aA.getLabel();
                            String strA = c1044aA.getDeeplink();
                            String strC2 = c1044aA.getType();
                            it8 = it15;
                            actionButton = new ChaosManagementIncidentItem.Banner.ActionButton(strB3, strA, strC2 != null ? strC2.equals("dismiss") ? com.revolut.core.chaosmanagement.domain.model.a.DISMISS : strC2.equals("subscribe") ? com.revolut.core.chaosmanagement.domain.model.a.SUBSCRIBE : com.revolut.core.chaosmanagement.domain.model.a.UNKNOWN : null);
                        } else {
                            it8 = it15;
                            actionButton = null;
                        }
                        linkedHashMap2.put(key, new ChaosManagementIncidentItem.Banner(strD, strC, strB2, actionButton));
                        it15 = it8;
                    }
                    arrayList3.add(new ChaosManagementIncidentItem(strB, aVarA, linkedHashMap2));
                }
                return arrayList3;
            case 23:
                SelectableDelegate.Model it16 = (SelectableDelegate.Model) obj2;
                KProperty[] kPropertyArr = IDealAccountsListController.U;
                Intrinsics.checkNotNullParameter(it16, "it");
                Object obj4 = ((RowDelegate.Model) it16.f53305b).u;
                if (obj4 instanceof String) {
                    return (String) obj4;
                }
                return null;
            case 24:
                gd2.e update2 = (gd2.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return gd2.e.a(update2, null, null, 14);
            case 25:
                fd3.c cashbackBySourcesDto = (fd3.c) obj2;
                Intrinsics.checkNotNullParameter(cashbackBySourcesDto, "cashbackBySourcesDto");
                Object obj5 = cd3.a.f23165a;
                Intrinsics.checkNotNullParameter(cashbackBySourcesDto, "<this>");
                dj0.d dVarO = mo3.a.o(cashbackBySourcesDto.getEarned());
                List<fd3.g> sources = cashbackBySourcesDto.getSources();
                ArrayList arrayList4 = new ArrayList(w.t(sources, 10));
                for (fd3.g gVar : sources) {
                    arrayList4.add(new CashbackSource(mo3.a.o(gVar.getEarned()), (uc3.d) u1.t(gVar.getType(), uc3.d.UNKNOWN, cd3.a.f23165a), gVar.getAvailable()));
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj6 : arrayList4) {
                    if (((CashbackSource) obj6).f65689b != uc3.d.UNKNOWN) {
                        arrayList5.add(obj6);
                    }
                }
                return new CashbackBySources(dVarO, arrayList5);
            case 26:
                fd3.f limitDto = (fd3.f) obj2;
                Intrinsics.checkNotNullParameter(limitDto, "limitDto");
                Intrinsics.checkNotNullParameter(limitDto, "<this>");
                xi0.a aVar2 = xi0.b.Companion;
                String currency = limitDto.getCurrency();
                aVar2.getClass();
                xi0.b bVarA2 = xi0.a.a(currency);
                return new uc3.b(new dj0.d(limitDto.getLimit(), bVarA2), new dj0.d(limitDto.getUsage(), bVarA2), new DateTime(limitDto.getResetDate()));
            case 27:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                if (!(error instanceof HttpException) || ((HttpException) error).code() != 404) {
                    return d0.l(error);
                }
                ufm.b bVarM = d0.m(c.a.f278978a);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 28:
                fd3.b cashbackByCurrenciesDto = (fd3.b) obj2;
                Intrinsics.checkNotNullParameter(cashbackByCurrenciesDto, "cashbackByCurrenciesDto");
                Intrinsics.checkNotNullParameter(cashbackByCurrenciesDto, "<this>");
                List earned = cashbackByCurrenciesDto.getEarned();
                ArrayList arrayList6 = new ArrayList(w.t(earned, 10));
                Iterator it17 = earned.iterator();
                while (it17.hasNext()) {
                    arrayList6.add(mo3.a.o((jo3.a) it17.next()));
                }
                return new CashbackByCurrencies(arrayList6);
            default:
                fd3.e cashbackCurrencyDto = (fd3.e) obj2;
                Intrinsics.checkNotNullParameter(cashbackCurrencyDto, "cashbackCurrencyDto");
                Intrinsics.checkNotNullParameter(cashbackCurrencyDto, "<this>");
                String currency2 = cashbackCurrencyDto.getCurrency();
                if (currency2 != null) {
                    xi0.b.Companion.getClass();
                    bVarA = xi0.a.a(currency2);
                }
                return new CashbackCurrency(bVarA);
        }
    }
}
