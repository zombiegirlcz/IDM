package md0;

import aw0.v1;
import com.revolut.core.chaosmanagement.domain.model.ChaosManagementIncidentItem;
import com.revolut.core.chaosmanagement.ui.model.ChaosManagementIncidentUiItem;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.domain.models.openbanking.OpenBankingConsent;
import com.revolut.domain.models.openbanking.OutboundOpenBankingClient;
import com.revolut.feature.acquiring.card_reader.order.api.model.PaymentMethod;
import com.revolut.feature.incentive_reward.impl.ui.incentive_selection.screen.selection.NoIncentiveSelectionException;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature_tiles_api.models.TileCarouselType;
import com.revolut.shared.feature.wealth.statements.impl.costchargesreport.CostChargesController;
import com.youTransactor.uCube.rpc.Constants;
import io3.h;
import ip0.gu;
import ip0.i70;
import ip0.p10;
import ip0.q60;
import ip0.s;
import ip0.s7;
import ip0.sx;
import ip0.t10;
import ip0.yl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import jq9.k;
import jq9.q;
import kei.f;
import kei.g;
import kei.i;
import kei.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import le.u1;
import org.jmrtd.PassportService;
import org.joda.time.DateTime;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204463a;

    public /* synthetic */ c(int i) {
        this.f204463a = i;
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        Object objA;
        ChaosManagementIncidentUiItem chaosManagementIncidentUiItem;
        Object obj3;
        gei.e eVar;
        Iterator it8;
        List list;
        gei.b bVar;
        int i;
        int i2 = 10;
        boolean z = false;
        String str = null;
        switch (this.f204463a) {
            case 0:
                List<ChaosManagementIncidentItem> incidents = (List) obj2;
                Intrinsics.checkNotNullParameter(incidents, "incidents");
                ArrayList arrayList = new ArrayList();
                for (ChaosManagementIncidentItem chaosManagementIncidentItem : incidents) {
                    nd0.a aVar = chaosManagementIncidentItem.f51344b;
                    int i3 = d.f204464a[aVar.ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        try {
                            m.Companion companion = m.INSTANCE;
                            obj3 = chaosManagementIncidentItem.f51345c.get(aVar);
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable th10) {
                            m.Companion companion2 = m.INSTANCE;
                            objA = o.a(th10);
                        }
                        if (obj3 == null) {
                            throw new IllegalStateException(("No banner for " + aVar + " state").toString());
                        }
                        objA = new ChaosManagementIncidentUiItem(chaosManagementIncidentItem.f51343a, aVar, (ChaosManagementIncidentItem.Banner) obj3);
                        Throwable thA = m.a(objA);
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                        if (objA instanceof n) {
                            objA = null;
                        }
                        chaosManagementIncidentUiItem = (ChaosManagementIncidentUiItem) objA;
                    } else {
                        if (i3 != 3 && i3 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        chaosManagementIncidentUiItem = null;
                    }
                    if (chaosManagementIncidentUiItem != null) {
                        arrayList.add(chaosManagementIncidentUiItem);
                    }
                }
                return arrayList;
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                s sVar = new s("revPointsLoadingItem");
                yp0.b.l(sVar, 0, 0, 0, 0, null, false, 63);
                return u.c(sVar);
            case 2:
                JuniorBankingProfile it9 = (JuniorBankingProfile) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f77099b;
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(new q60("PROMPT_CONTENT_LOADING_ID"));
            case 4:
                md9.e update = (md9.e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return md9.e.a(update, new Data(null, null, true, 3, null), false, 2);
            case 5:
                Boolean isLocked = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isLocked, "isLocked");
                return Boolean.valueOf(!isLocked.booleanValue());
            case 6:
                Intrinsics.checkNotNullParameter((Boolean) obj2, "it");
                return Unit.f186387a;
            case 7:
                me1.d update2 = (me1.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return me1.d.a(update2, update2.f204594b + 1);
            case 8:
                me1.d update3 = (me1.d) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return me1.d.a(update3, update3.f204594b - 1);
            case 9:
                List carousels = (List) obj2;
                Intrinsics.checkNotNullParameter(carousels, "carousels");
                List list2 = carousels;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it10 = list2.iterator();
                while (it10.hasNext()) {
                    j jVar = (j) it10.next();
                    Intrinsics.checkNotNullParameter(jVar, "<this>");
                    String title = jVar.getTitle();
                    TileCarouselType.Companion companion3 = TileCarouselType.INSTANCE;
                    String type = jVar.getType();
                    companion3.getClass();
                    Intrinsics.checkNotNullParameter(type, "type");
                    TileCarouselType miscellaneous = Intrinsics.f(type, "TO_DO") ? TileCarouselType.ToDo.f97832a : Intrinsics.f(type, "TO_DO_WIDE") ? TileCarouselType.ToDoWide.f97833a : Intrinsics.f(type, "FINCRIME_TO_DO") ? TileCarouselType.FincrimeToDo.f97829a : Intrinsics.f(type, "FINCRIME_IN_REVIEW") ? TileCarouselType.FincrimeInReview.f97828a : Intrinsics.f(type, "SUGGESTED_FOR_YOU") ? TileCarouselType.SuggestedForYou.f97831a : new TileCarouselType.Miscellaneous(type);
                    List<f> tiles = jVar.getTiles();
                    ArrayList arrayList3 = new ArrayList(w.t(tiles, i2));
                    for (f fVar : tiles) {
                        Object obj4 = lei.a.f194556a;
                        Intrinsics.checkNotNullParameter(fVar, "<this>");
                        String id10 = fVar.getId();
                        gei.f fVar2 = (gei.f) u1.v(fVar.getState(), lei.a.f194557b);
                        if (fVar2 == null) {
                            fVar2 = gei.f.UNKNOWN;
                        }
                        gei.f fVar3 = fVar2;
                        String mandatoryLevel = fVar.getMandatoryLevel();
                        if (mandatoryLevel == null || (eVar = (gei.e) u1.v(mandatoryLevel, lei.a.f194556a)) == null) {
                            eVar = gei.e.Optional;
                        }
                        gei.e eVar2 = eVar;
                        kei.e content = fVar.getContent();
                        g messageMetadata = fVar.getMessageMetadata();
                        Intrinsics.checkNotNullParameter(content, "<this>");
                        String title2 = content.getTitle();
                        String subtitle = content.getSubtitle();
                        String backgroundImage = content.getBackgroundImage();
                        String icon = content.getIcon();
                        String deepLink = content.getDeepLink();
                        String strA = deepLink != null ? lei.a.a(deepLink, messageMetadata) : str;
                        List buttons = content.getButtons();
                        if (buttons != null) {
                            List<kei.c> list3 = buttons;
                            ArrayList arrayList4 = new ArrayList(w.t(list3, i2));
                            for (kei.c cVar : list3) {
                                Intrinsics.checkNotNullParameter(cVar, "<this>");
                                arrayList4.add(new gei.c(cVar.getLabel(), lei.a.a(cVar.getDeeplink(), messageMetadata)));
                                it10 = it10;
                            }
                            it8 = it10;
                            list = arrayList4;
                        } else {
                            it8 = it10;
                            list = f0.f322471a;
                        }
                        List list4 = list;
                        i style = content.getStyle();
                        Intrinsics.checkNotNullParameter(style, "<this>");
                        gei.d dVar = new gei.d(title2, subtitle, backgroundImage, icon, list4, new gei.g((v1) u1.u(style.getDefaultColorScheme(), lei.a.f194558c)), strA);
                        kei.b applicationData = fVar.getApplicationData();
                        if (applicationData != null) {
                            Intrinsics.checkNotNullParameter(applicationData, "<this>");
                            Long countdownEndDate = applicationData.getCountdownEndDate();
                            bVar = new gei.b(countdownEndDate != null ? new DateTime(countdownEndDate.longValue()) : null);
                        } else {
                            bVar = null;
                        }
                        arrayList3.add(new gei.a(id10, fVar3, eVar2, dVar, bVar));
                        it10 = it8;
                        i2 = 10;
                        str = null;
                    }
                    arrayList2.add(new com.revolut.feature_tiles_api.models.a(title, miscellaneous, arrayList3));
                    it10 = it10;
                    i2 = 10;
                    str = null;
                }
                return arrayList2;
            case 10:
                String str2 = (String) obj2;
                return prk.o.m(str2, "params", str2, "TILES");
            case 11:
                String str3 = (String) obj2;
                return prk.o.m(str3, "params", str3, "TILES");
            case 12:
                mek.g it11 = (mek.g) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11;
            case 13:
                mek.g update4 = (mek.g) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return mek.g.a(update4, null, null, null, null, null, !update4.f, null, PassportService.DEFAULT_MAX_BLOCKSIZE);
            case 14:
                mek.g it12 = (mek.g) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f204702c;
            case 15:
                List<k> list5 = (List) obj2;
                Intrinsics.checkNotNullParameter(list5, "list");
                ArrayList arrayList5 = new ArrayList();
                for (k kVar : list5) {
                    q qVar = kVar instanceof q ? (q) kVar : null;
                    PaymentCounterpartyInfo paymentCounterpartyInfo = qVar != null ? qVar.f177516b : null;
                    if (paymentCounterpartyInfo != null) {
                        arrayList5.add(paymentCounterpartyInfo);
                    }
                }
                return arrayList5;
            case 16:
                do3.n it13 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.k;
            case 17:
                List pockets = (List) obj2;
                Intrinsics.checkNotNullParameter(pockets, "pockets");
                List<io3.d> list6 = pockets;
                ArrayList arrayList6 = new ArrayList(w.t(list6, 10));
                for (io3.d dVar2 : list6) {
                    arrayList6.add(new PaymentMethod.Wallet(dVar2.f163145a, ya1.m.MERCHANT, h.e(dVar2)));
                }
                return arrayList6;
            case 18:
                List it14 = (List) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(!it14.isEmpty());
            case 19:
                RowDelegate.Model it15 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = CostChargesController.R;
                Intrinsics.checkNotNullParameter(it15, "it");
                Object obj5 = it15.u;
                mfl.j jVar2 = obj5 instanceof mfl.j ? (mfl.j) obj5 : null;
                if (jVar2 != null) {
                    return jVar2.f205029a;
                }
                return null;
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                i70 i70Var = new i70("ID_QR_CODE", null, 6);
                yp0.b.r(i70Var, R$attr.uikit_dp72, 0, 0, 0, 14);
                return u.c(i70Var);
            case 21:
                return mg2.d.a((mg2.d) obj2, new Data(null, null, true, 3, null), null, 2);
            case 22:
                List clients = (List) obj2;
                Intrinsics.checkNotNullParameter(clients, "clients");
                List list7 = clients;
                if (!(list7 instanceof Collection) || !list7.isEmpty()) {
                    Iterator it16 = list7.iterator();
                    while (true) {
                        if (it16.hasNext()) {
                            if (!((OutboundOpenBankingClient.Default) it16.next()).d.isEmpty()) {
                                z = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 23:
                List consents = (List) obj2;
                Intrinsics.checkNotNullParameter(consents, "consents");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj6 : consents) {
                    String str4 = ((OpenBankingConsent.Australia) obj6).e.f60404a;
                    Object objO = linkedHashMap.get(str4);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, str4);
                    }
                    ((List) objO).add(obj6);
                }
                ArrayList arrayList7 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str5 = (String) entry.getKey();
                    List list8 = (List) entry.getValue();
                    List list9 = list8;
                    if ((list9 instanceof Collection) && list9.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it17 = list9.iterator();
                        int i5 = 0;
                        while (it17.hasNext()) {
                            if (((OpenBankingConsent.Australia) it17.next()).f == OpenBankingConsent.Australia.ConsentState.ACTIVE && (i5 = i5 + 1) < 0) {
                                v.r();
                                throw null;
                            }
                        }
                        i = i5;
                    }
                    arrayList7.add(new OutboundOpenBankingClient.Australia(i, str5, ((OpenBankingConsent.Australia) d0.b0(list8)).e.f60405b, ((OpenBankingConsent.Australia) d0.b0(list8)).e.f60406c, list8));
                }
                return d0.P0(arrayList7, new k2j.d(new mg6.b(), 9));
            case 24:
                Data contentData = new Data(null, new NoIncentiveSelectionException(), false, 5, null);
                ((mg7.j) obj2).getClass();
                Intrinsics.checkNotNullParameter(contentData, "contentData");
                return new mg7.j(contentData);
            case 25:
                IntRange intRangeU = t61.a.u((Function0) obj2, "<unused var>", 0, 2, 1);
                ArrayList arrayList8 = new ArrayList(w.t(intRangeU, 10));
                vim.f it18 = intRangeU.iterator();
                while (it18.f289625c) {
                    arrayList8.add(new s7(a0.d.n("FUND_PERFORMANCE_ABOUT_ITEM_LOADING", it18.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                return yp0.b.h(arrayList8, new gu("FUND_PERFORMANCE_ABOUT_GROUP_HEADER_LOADING", 0, 0, 30), null, 0, 126);
            case 26:
                IntRange intRangeU2 = t61.a.u((Function0) obj2, "<unused var>", 0, 3, 1);
                ArrayList arrayList9 = new ArrayList(w.t(intRangeU2, 10));
                vim.f it19 = intRangeU2.iterator();
                while (it19.f289625c) {
                    arrayList9.add(new s7(a0.d.n("FUND_PERFORMANCE_FEES_ITEM_LOADING", it19.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                return yp0.b.h(arrayList9, new gu("FUND_PERFORMANCE_FEES_GROUP_HEADER_LOADING", 0, 0, 30), null, 0, 126);
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return yp0.b.h(v.k(new yl("FUND_PERFORMANCE_RISK_HEADER_LOADING", 0, 30), new t10("FUND_PERFORMANCE_RISK_FOOTER_LOADING", p10.f165755a)), new gu("FUND_PERFORMANCE_RISK_GROUP_HEADER_LOADING", 0, 0, 30), null, 0, 126);
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                sx sxVar = new sx("FUND_PERFORMANCE_SCENARIOS_CHART_LOADING");
                yp0.b.l(sxVar, 0, 0, 0, 0, null, false, 63);
                return yp0.b.h(u.c(sxVar), new gu("FUND_PERFORMANCE_SCENARIOS_GROUP_HEADER_LOADING", 0, 0, 30), null, 0, 126);
            default:
                mh4.k update5 = (mh4.k) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return mh4.k.a(update5, null, Data.copy$default(update5.d, null, null, true, 3, null), null, null, null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f204463a = i;
    }
}
