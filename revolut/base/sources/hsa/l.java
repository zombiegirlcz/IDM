package hsa;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import aw0.i3;
import aw0.n6;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.BigTileDelegate;
import com.revolut.core.ui_kit.delegates.EsimDetailsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.NewRevolutCardsCarouselDelegate;
import com.revolut.core.ui_kit.delegates.RateOneClickDelegate;
import com.revolut.core.ui_kit.delegates.he;
import com.revolut.core.ui_kit.delegates.o9;
import com.revolut.core.ui_kit.delegates.t9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardSecurityDeposit;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.credit.impl.ui.account.collateral.CollateralPocketMapperImpl;
import com.revolut.feature.kyc.impl.idnow.video_ident.flow.IdnowVideoIdentFlowContract$InputData;
import com.revolut.feature.kyc.impl.idnow.video_ident.flow.IdnowVideoIdentFlowContract$Step;
import com.revolut.feature.payments.api.PaymentsToggles$ShowIncomingBankTransfer;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.ReservationCreationScreenContract$SlotSelection;
import com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsScreenContract$Configuration;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_travel_hotels_models.search.TravelHotelsSortingOption;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import dv5.p;
import efm.d0;
import efm.r;
import g1i.m0;
import grl.k9;
import hul.v;
import ip0.c90;
import ip0.d90;
import ip0.e90;
import ip0.f90;
import ip0.h90;
import ip0.hg;
import ip0.j90;
import ip0.t4;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kp0.w0;
import nel.n;
import org.joda.time.DateTime;
import pfm.t;
import r10.q;
import skm.p0;
import te0.w;
import tof.ac;
import tof.cc;
import tof.d8;
import tof.fc;
import tof.i7;
import tof.l2;
import tof.l3;
import tof.na;
import tof.ob;
import tof.q7;
import tof.u9;
import tof.v6;
import tof.w6;
import tof.x9;
import tof.y6;
import yhm.m;
import yhm.o;
import yp0.j0;
import zhm.a0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f155023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f155024c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l(Object obj2, int i, Object obj3, Object obj4) {
        this.f155022a = i;
        this.f155023b = obj2;
        this.f155024c = obj3;
        this.d = obj4;
    }

    /* JADX WARN: Type inference failed for: r0v130, types: [java.lang.Object, java.time.LocalDateTime] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object objA;
        int i;
        q7 q7VarA;
        int i2;
        String comment;
        Data data;
        Data data2;
        Data data3;
        Data data4;
        Data data5;
        ReservationCreationScreenContract$SlotSelection reservationCreationScreenContract$SlotSelection;
        LocalTime localTime;
        Duration interval;
        d90 j90Var;
        dj0.d dVarO;
        int i3;
        int i5 = this.f155022a;
        int i6 = 6;
        int i21 = 12;
        int i22 = 14;
        Object obj3 = null;
        ReservationCreationScreenContract$SlotSelection reservationCreationScreenContract$SlotSelection2 = null;
        int i32 = 0;
        Object obj4 = this.d;
        Object obj5 = this.f155024c;
        Object obj6 = this.f155023b;
        switch (i5) {
            case 0:
                f4h.a aVar = ((m) obj5).f155025p;
                String text = (String) obj4;
                e domainState = (e) obj2;
                Intrinsics.checkNotNullParameter(domainState, "$this$update");
                String str = ((InputTextDelegate.TextData) obj6).f52597a;
                int iHashCode = str.hashCode();
                if (iHashCode == -309561815) {
                    if (!str.equals("LIST_ITEM_LAST_NAME")) {
                        return domainState;
                    }
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(domainState, "domainState");
                    Intrinsics.checkNotNullParameter(text, "text");
                    return e.a(domainState, null, text, null, aVar.t(domainState.f155015b, text, domainState.d), 11);
                }
                if (iHashCode == -36325915) {
                    if (!str.equals("LIST_ITEM_FIRST_NAME")) {
                        return domainState;
                    }
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(domainState, "domainState");
                    Intrinsics.checkNotNullParameter(text, "text");
                    return e.a(domainState, text, null, null, aVar.t(text, domainState.f155016c, domainState.d), 13);
                }
                if (iHashCode != 258542993 || !str.equals("LIST_ITEM_EMAIL")) {
                    return domainState;
                }
                aVar.getClass();
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                Intrinsics.checkNotNullParameter(text, "text");
                return e.a(domainState, null, null, text, aVar.t(domainState.f155015b, domainState.f155016c, text), 7);
            case 1:
                xi0.b bVar = (xi0.b) obj4;
                List exchangeRates = (List) obj2;
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                d0 d0VarB = ((hsd.f) obj6).f155036b.B((List) obj5, bVar, exchangeRates, false);
                hp5.b bVar2 = new hp5.b(new p(28, bVar), 15);
                d0VarB.getClass();
                ufm.i iVar = new ufm.i(d0VarB, bVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 2:
                yki.l lVar = (yki.l) obj6;
                com.revolut.feature.kyc.impl.idnow.video_ident.flow.a aVar2 = (com.revolut.feature.kyc.impl.idnow.video_ident.flow.a) obj5;
                IdnowVideoIdentFlowContract$InputData idnowVideoIdentFlowContract$InputData = (IdnowVideoIdentFlowContract$InputData) obj4;
                r7a.i result = (r7a.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!(result instanceof r7a.e) && !(result instanceof r7a.f)) {
                    if (result instanceof r7a.g) {
                        try {
                            m.Companion companion = yhm.m.INSTANCE;
                            objA = new IllegalStateException("Result: " + result + " is not handled");
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable th10) {
                            m.Companion companion2 = yhm.m.INSTANCE;
                            objA = o.a(th10);
                        }
                        Throwable thA = yhm.m.a(objA);
                        if (thA != null) {
                            hx7.e.n(thA);
                        }
                    } else {
                        if (!(result instanceof r7a.h)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.t2(aVar2, lVar, new IdnowVideoIdentFlowContract$Step.WebPortal(idnowVideoIdentFlowContract$InputData.f77783a, idnowVideoIdentFlowContract$InputData.f77784b), false, null, false, 12);
                    }
                    break;
                }
                return Unit.f186387a;
            case 3:
                com.revolut.feature.topup_screen.impl.flow.topup_methods.d dVar = (com.revolut.feature.topup_screen.impl.flow.topup_methods.d) obj6;
                xi0.b bVar3 = (xi0.b) obj5;
                AccountId accountId = (AccountId) obj4;
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (it8 instanceof NoSuchElementException) {
                    ufm.i iVar2 = new ufm.i(z71.a.c(dVar.f90663s, bVar3, accountId, 4), new hw3.d(3, new v(dVar, accountId, 7)), 0);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                    return iVar2;
                }
                ufm.c cVarL = d0.l(it8);
                Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
                return cVarL;
            case 4:
                Long l2 = (Long) obj5;
                String str2 = (String) obj4;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Data data6 = (Data) pair.f186385a;
                od0.i iVar3 = (od0.i) pair.f186386b;
                i7 i7Var = (i7) data6.getContent();
                i7.c cVar = i7.Companion;
                cc ccVar = new cc(zhm.v.k(y6.TRANSFER, y6.CRYPTO_WITHDRAWAL));
                y6 y6Var = y6.TOPUP;
                i7[] i7VarArr = {new cc(u.c(y6Var)), new ac(w6.CRYPTO_WALLET)};
                cVar.getClass();
                q7 q7VarA2 = i7.c.a(i7VarArr);
                if (((jte.d) ((hx9.a) obj6).d).c(PaymentsToggles$ShowIncomingBankTransfer.f79165c)) {
                    i = 2;
                    q7VarA = i7.c.a(new cc(u.c(y6Var)), i7.c.b(new ac(w6.EXTERNAL_ACCOUNT), new ac(w6.OPEN_BANKING)), i7.h.f272814a);
                } else {
                    i = 2;
                    q7VarA = null;
                }
                d8 d8Var = new d8(l3.b(l2.DONATION));
                i7[] i7VarArr2 = new i7[i];
                i7VarArr2[0] = i7.n.f272820a;
                i7VarArr2[1] = d8Var;
                q7 q7VarA3 = i7.c.a(i7VarArr2);
                i7[] i7VarArr3 = new i7[4];
                i7VarArr3[0] = ccVar;
                i7VarArr3[1] = q7VarA2;
                i7VarArr3[i] = q7VarA;
                i7VarArr3[3] = q7VarA3;
                return fc.c(i7.c.a(i7.c.b(i7VarArr3), new u9(false), i7.c.c(v6.COMPLETED, v6.PENDING, v6.REVERTED, v6.DECLINED, v6.FAILED), new ob(new DateTime(l2.longValue()), true), fc.a(new na(i7.z.f272831a), fc.c(new x9(str2), new x9(null))), i7Var), (i7) iVar3.g());
            case 5:
                hxk.b bVar4 = (hxk.b) obj6;
                List list = (List) obj2;
                gxk.a aVarA = hxk.b.a(bVar4, list, (gxk.f) obj5);
                n nVar = (n) ((od0.i) obj4).f224257a;
                return new gxk.h(aVarA, nVar != null ? hxk.b.a(bVar4, list, new gxk.f(nVar)) : null);
            case 6:
                List designs = (List) obj2;
                Intrinsics.checkNotNullParameter(designs, "designs");
                return w.o0(p0.f264003c, new a9h.a(designs, (hy2.f) obj6, (hha.d) obj5, (b93.b) obj4, null, 12));
            case 7:
                hz8.h hVar = (hz8.h) obj6;
                u09.v domain = (u09.v) obj5;
                ArrayList coursesWithLessons = (ArrayList) obj4;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(domain, "domain");
                Intrinsics.checkNotNullParameter(coursesWithLessons, "coursesWithLessons");
                RoomDatabase roomDatabase = hVar.f157071a;
                DBUtil.performBlocking(roomDatabase, false, true, new hz8.e(hVar, domain, i32));
                DBUtil.performBlocking(roomDatabase, false, true, new v(hVar, coursesWithLessons, i22));
                return Unit.f186387a;
            case 8:
                hz8.k kVar = (hz8.k) obj6;
                u09.v vVar = (u09.v) obj5;
                ArrayList entities = (ArrayList) obj4;
                RoomDatabase roomDatabase2 = kVar.f157078a;
                Intrinsics.checkNotNullParameter(entities, "entities");
                if (vVar != null) {
                    DBUtil.performBlocking(roomDatabase2, false, true, new hz8.i(kVar, vVar, 1));
                    i2 = 16;
                } else {
                    i2 = 16;
                    DBUtil.performBlocking(roomDatabase2, false, true, new hy2.k(i2));
                }
                DBUtil.performBlocking(roomDatabase2, false, true, new v(kVar, entities, i2));
                return Unit.f186387a;
            case 9:
                i25.g gVar = (i25.g) obj5;
                od0.i iVar4 = (od0.i) obj4;
                CreditCardSecurityDeposit securityDeposit = (CreditCardSecurityDeposit) obj2;
                Intrinsics.checkNotNullParameter(securityDeposit, "securityDeposit");
                List list2 = (List) obj6;
                ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList.add(((CollateralPocketMapperImpl) gVar.f157849b).a((io3.d) it9.next(), ((CreditCard) iVar4.c()).f69792a, securityDeposit));
                }
                return arrayList;
            case 10:
                CreditCardSecurityDeposit securityDeposit2 = (CreditCardSecurityDeposit) obj2;
                Intrinsics.checkNotNullParameter(securityDeposit2, "securityDeposit");
                return ((CollateralPocketMapperImpl) ((i25.g) obj6).f157849b).a((io3.d) obj5, ((CreditCard) ((od0.i) obj4).c()).f69792a, securityDeposit2);
            case 11:
                com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a aVar3 = (com.revolut.feature_exchange.impl.ui.exchange_v2.market_order.a) obj6;
                Float f = (Float) obj5;
                ExchangeOrderDraft draft = (ExchangeOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft, "draft");
                xi0.b bVar5 = draft.f96880b.f96897a;
                w80.b bVar6 = aVar3.f96949n;
                String string = new BigDecimal(String.valueOf(f.floatValue())).setScale(bVar5.c(), RoundingMode.HALF_DOWN).toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                String str3 = bVar5.f306286a;
                long jB = bVar6.b(string, str3);
                g1i.d0 d0Var = (g1i.d0) aVar3.k;
                t tVarN3 = d0Var.N3((wd6.h) obj4);
                double dFloatValue = f.floatValue();
                String formattedRate = aVar3.f96949n.d(jB, str3);
                Intrinsics.checkNotNullParameter(formattedRate, "formattedRate");
                return tVarN3.e(w.z0(((m0) d0Var.e).z0(), new Pair(Double.valueOf(dFloatValue), formattedRate))).e(d0Var.k3());
            case 12:
                i4g.h hVar2 = (i4g.h) obj5;
                String searchSessionId = (String) obj2;
                Intrinsics.checkNotNullParameter(searchSessionId, "searchSessionId");
                return r.just((b4g.c) obj6).mergeWith(hVar2.e).switchMapCompletable(new i31.e(20, new l(hVar2, (r) obj4, searchSessionId, 13)));
            case 13:
                i4g.h hVar3 = (i4g.h) obj6;
                String str4 = (String) obj4;
                b4g.c params = (b4g.c) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                hVar3.f.onNext(new lk0.g(f0.f322471a));
                ihm.b bVar7 = hVar3.f158434g;
                od0.i.Companion.getClass();
                bVar7.onNext(od0.i.f224256b);
                Intrinsics.h(str4);
                lk0.d dVar2 = new lk0.d(new fb.c(hVar3, str4, 16), new hq1.f(hVar3, 18), new i30.a(hVar3, 10), params, new i4g.g(1, hVar3, i4g.h.class, "downPageParams", "downPageParams$feature_travel_flights_impl_release(Lcom/revolut/core/pagination/Page;)Lcom/revolut/feature/travel/flights/impl/data/repository/FlightSearchPageParams;", 0, 0), new i3k.h(i21), yk0.d.a());
                r rVarMergeWith = ((r) obj5).mergeWith(hVar3.d);
                Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
                return dVar2.b(rVarMergeWith);
            case 14:
                return i7h.c.h((i7h.c) obj6, (String) obj4, (ArrayList) obj5);
            case 15:
                List tags = (List) obj6;
                Set chosenTags = (Set) obj5;
                CharSequence charSequence = (CharSequence) obj4;
                i8d.a aVar4 = (i8d.a) obj2;
                if (charSequence instanceof String) {
                    comment = (String) charSequence;
                } else {
                    StringBuilder sb6 = new StringBuilder(charSequence.length());
                    sb6.append(charSequence);
                    comment = sb6.toString();
                }
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(tags, "tags");
                Intrinsics.checkNotNullParameter(chosenTags, "chosenTags");
                Intrinsics.checkNotNullParameter(comment, "comment");
                return new i8d.a(comment, tags, chosenTags);
            case 16:
                o9g.a aVar5 = (o9g.a) obj5;
                zfi.c cVar2 = (zfi.c) obj4;
                od0.i sortingOption = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(sortingOption, "sortingOption");
                TravelHotelsSortingOption travelHotelsSortingOption = (TravelHotelsSortingOption) sortingOption.f224257a;
                ((i9g.c) obj6).getClass();
                ffi.e eVar = aVar5.f223270a;
                List list3 = aVar5.f223271b;
                dgi.e eVar2 = aVar5.f223272c;
                List list4 = aVar5.d;
                return new dgi.i(eVar, list3, eVar2, list4, list4 != null ? i9g.a.a(cVar2, list4) : null, travelHotelsSortingOption, aVar5.f, aVar5.f223273g);
            case 17:
                q qVar = (q) obj5;
                i9h.v vVar2 = (i9h.v) obj4;
                List mostTradedAssets = (List) obj2;
                Intrinsics.checkNotNullParameter(mostTradedAssets, "mostTradedAssets");
                return ((MostTradedAssetsScreenContract$Configuration) obj6).getD() ? ((d9h.a) qVar.d).b(mostTradedAssets, n14.k.g(vVar2)) : zi0.c.j(mostTradedAssets);
            case 18:
                com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a aVar6 = (com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a) obj6;
                Data data7 = (Data) obj5;
                ieb.i iVarA = (ieb.i) obj4;
                ieb.g gVar2 = (ieb.g) obj2;
                try {
                    Object content = data7.getContent();
                    data = new Data(content != null ? ((xdb.b) content).f304382a : null, data7.getError(), data7.getLoading());
                    break;
                } catch (Throwable th11) {
                    data = new Data(null, th11, data7.getLoading());
                }
                Data dataI2 = com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a.I2(aVar6, data, gVar2.f160685b);
                try {
                    Object content2 = data7.getContent();
                    data2 = new Data(content2 != null ? ((xdb.b) content2).f304383b : null, data7.getError(), data7.getLoading());
                    break;
                } catch (Throwable th12) {
                    data2 = new Data(null, th12, data7.getLoading());
                }
                Data dataI22 = com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a.I2(aVar6, data2, gVar2.f160686c);
                try {
                    Object content3 = data7.getContent();
                    data3 = new Data(content3 != null ? ((xdb.b) content3).f304384c : null, data7.getError(), data7.getLoading());
                    break;
                } catch (Throwable th13) {
                    data3 = new Data(null, th13, data7.getLoading());
                }
                Data dataI23 = com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a.I2(aVar6, data3, gVar2.d);
                try {
                    Object content4 = data7.getContent();
                    data4 = new Data(content4 != null ? ((xdb.b) content4).d : null, data7.getError(), data7.getLoading());
                    break;
                } catch (Throwable th14) {
                    data4 = new Data(null, th14, data7.getLoading());
                }
                Data dataI24 = com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a.I2(aVar6, data4, gVar2.e);
                try {
                    Object content5 = data7.getContent();
                    data5 = new Data(content5 != null ? ((xdb.b) content5).e : null, data7.getError(), data7.getLoading());
                    break;
                } catch (Throwable th15) {
                    data5 = new Data(null, th15, data7.getLoading());
                }
                Data dataI25 = com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a.I2(aVar6, data5, gVar2.f);
                xdb.b bVar8 = (xdb.b) data7.getContent();
                if (bVar8 != null && (localTime = bVar8.f) != null) {
                    iVarA = ieb.i.a(iVarA, null, localTime, 0, 5);
                }
                ieb.i iVar5 = iVarA;
                ReservationCreationScreenContract$SlotSelection reservationCreationScreenContract$SlotSelection3 = gVar2.f160688h;
                List list5 = (List) dataI24.getContent();
                List list6 = (List) dataI25.getContent();
                if (reservationCreationScreenContract$SlotSelection3 == null) {
                    reservationCreationScreenContract$SlotSelection = reservationCreationScreenContract$SlotSelection2;
                } else if (list5 == null) {
                    reservationCreationScreenContract$SlotSelection = reservationCreationScreenContract$SlotSelection3;
                } else {
                    if (list6 == null) {
                        list6 = f0.f322471a;
                    }
                    nkm.i iVar6 = new nkm.i(com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a.L2(list5, list6));
                    while (true) {
                        if (iVar6.hasNext()) {
                            Object next = iVar6.next();
                            ReservationCreationScreenContract$SlotSelection reservationCreationScreenContract$SlotSelection4 = (ReservationCreationScreenContract$SlotSelection) next;
                            if (Intrinsics.f(reservationCreationScreenContract$SlotSelection4, reservationCreationScreenContract$SlotSelection3) && reservationCreationScreenContract$SlotSelection4.f82859a.d) {
                                obj3 = next;
                            }
                        }
                    }
                    reservationCreationScreenContract$SlotSelection2 = (ReservationCreationScreenContract$SlotSelection) obj3;
                    reservationCreationScreenContract$SlotSelection = reservationCreationScreenContract$SlotSelection2;
                }
                return ieb.g.a(gVar2, null, dataI2, dataI22, dataI23, dataI24, dataI25, iVar5, reservationCreationScreenContract$SlotSelection, 1);
            case 19:
                ieb.i iVar7 = (ieb.i) obj6;
                com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a aVar7 = (com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a) obj5;
                xdb.v vVar3 = (xdb.v) obj4;
                ieb.g gVar3 = (ieb.g) obj2;
                if (iVar7 == null) {
                    ?? localDateTime = ((l80.f) aVar7.f82862q).b().atZone(vVar3.f304411c.a()).toLocalDateTime();
                    long nanoOfDay = vVar3.d.toNanoOfDay();
                    Long lValueOf = nanoOfDay > 0 ? Long.valueOf(nanoOfDay) : null;
                    if (lValueOf == null || (interval = Duration.ofNanos(lValueOf.longValue())) == null) {
                        interval = Duration.ofMinutes(15L);
                    }
                    Intrinsics.h(localDateTime);
                    Intrinsics.h(interval);
                    Intrinsics.checkNotNullParameter(localDateTime, "<this>");
                    Intrinsics.checkNotNullParameter(interval, "interval");
                    if (interval.isZero() || interval.isNegative()) {
                        throw new IllegalArgumentException("Rounding interval must be positive");
                    }
                    long nanoOfDay2 = localDateTime.toLocalTime().toNanoOfDay();
                    long nanos = interval.toNanos();
                    long j2 = nanoOfDay2 % nanos;
                    LocalDateTime localDateTimePlusNanos = localDateTime.plusNanos(j2 != 0 ? nanos - j2 : 0L);
                    Intrinsics.checkNotNullExpressionValue(localDateTimePlusNanos, "plusNanos(...)");
                    LocalDate localDate = localDateTimePlusNanos.toLocalDate();
                    Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
                    LocalTime localTime2 = localDateTimePlusNanos.toLocalTime();
                    Intrinsics.checkNotNullExpressionValue(localTime2, "toLocalTime(...)");
                    iVar7 = new ieb.i(localDate, localTime2, 2);
                }
                return ieb.g.a(gVar3, new Data(vVar3, null, false, 6, null), null, null, null, null, null, iVar7, null, 190);
            case 20:
                Data data8 = (Data) obj6;
                ieg.m mVar = (ieg.m) obj2;
                Intrinsics.h(data8);
                return ieg.m.a(mVar, data8, (Data) obj5, null, (xag.c) obj4, 4);
            case 21:
                inh.k kVar2 = (inh.k) obj6;
                LocalDate localDate2 = (LocalDate) obj5;
                LocalDate localDate3 = (LocalDate) obj4;
                List events = (List) obj2;
                Intrinsics.checkNotNullParameter(events, "events");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj7 : events) {
                    if (((kp3.b) obj7).a() instanceof iel.h) {
                        arrayList2.add(obj7);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    return new go.g(new Data(new inh.f(arrayList2), null, false, 6, null), 2);
                }
                r rVarCompose = yhl.d.c(kVar2.f162950b, null, localDate2, localDate3, false, inh.k.d, null, null, null, 256).compose(kVar2.f162951c);
                Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
                return nim.a.v(rd0.e.b(rVarCompose), new im3.e(21));
            case 22:
                t4 t4Var = (t4) obj6;
                Integer num = (Integer) obj5;
                BigTileDelegate.Model model = (BigTileDelegate.Model) obj4;
                Drawable drawable = (Drawable) obj2;
                ArrayList arrayList3 = t4Var.F;
                int size = arrayList3.size();
                while (i32 < size) {
                    ((Function1) arrayList3.get(i32)).invoke(drawable);
                    i32++;
                }
                if (num != null && drawable != null) {
                    ro0.u uVar = t4Var.E;
                    ImageView target = t4Var.f166431h;
                    String cacheKey = model.f51730a;
                    int iIntValue = num.intValue();
                    uVar.getClass();
                    Intrinsics.checkNotNullParameter(target, "target");
                    Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
                    Intrinsics.checkNotNullParameter(drawable, "drawable");
                    Context context = target.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    if (jo0.m.e) {
                        if (!uVar.f255780g) {
                            uVar.f = (j70.a) uVar.f255777a.invoke(context);
                            uVar.f255780g = true;
                        }
                        j70.a aVar8 = uVar.f;
                        if (aVar8 != null && w0.n(aVar8)) {
                            uVar.f255778b.invoke(target, new ro0.t(uVar, iIntValue, target, drawable, cacheKey));
                        }
                    }
                }
                return Unit.f186387a;
            case 23:
                hg hgVar = (hg) obj6;
                EsimDetailsDelegate.Model model2 = (EsimDetailsDelegate.Model) obj5;
                EsimDetailsDelegate esimDetailsDelegate = (EsimDetailsDelegate) obj4;
                ty0.a clickData = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                View itemView = hgVar.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                py0.f fVarN0 = or0.u.k(itemView).n0();
                View itemView2 = hgVar.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                Clause clause = clickData.f275447c;
                fVarN0.a(itemView2, model2, clause != null ? new py0.c(clause) : null);
                esimDetailsDelegate.f.onNext(clickData);
                return Unit.f186387a;
            case 24:
                NewRevolutCardsCarouselDelegate newRevolutCardsCarouselDelegate = (NewRevolutCardsCarouselDelegate) obj6;
                t9 t9Var = (t9) obj5;
                Intrinsics.checkNotNullParameter((Configuration) obj2, "<unused var>");
                newRevolutCardsCarouselDelegate.f52819c = 0;
                newRevolutCardsCarouselDelegate.d = 0;
                t9Var.I();
                Context context2 = ((View) obj4).getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int iP = newRevolutCardsCarouselDelegate.p(context2);
                t9Var.f54759g.e = iP;
                RecyclerView recyclerViewA = j0.a(t9Var.f);
                int childCount = recyclerViewA.getChildCount();
                while (i32 < childCount) {
                    RecyclerView.ViewHolder childViewHolder = recyclerViewA.getChildViewHolder(recyclerViewA.getChildAt(i32));
                    o9 o9Var = childViewHolder instanceof o9 ? (o9) childViewHolder : null;
                    if (o9Var != null && iP != o9Var.k) {
                        o9Var.k = iP;
                        o9Var.f54535h.setCardWidth(iP);
                    }
                    i32++;
                }
                return Unit.f186387a;
            case 25:
                f90 f90Var = (f90) obj6;
                he heVar = (he) obj5;
                RateOneClickDelegate rateOneClickDelegate = (RateOneClickDelegate) obj4;
                Integer num2 = (Integer) obj2;
                int iIntValue2 = num2.intValue();
                d90 d90Var = f90Var.f164221b;
                if (d90Var instanceof h90) {
                    List items = ((h90) d90Var).f164522a;
                    Intrinsics.checkNotNullParameter(items, "items");
                    j90Var = new h90(items, num2);
                } else {
                    if (!(d90Var instanceof j90)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List items2 = ((j90) d90Var).f164806a;
                    Intrinsics.checkNotNullParameter(items2, "items");
                    j90Var = new j90(items2, num2);
                }
                heVar.F(j90Var);
                rateOneClickDelegate.d.onNext(new c90(iIntValue2, (e90) f90Var.f164221b.getItems().get(iIntValue2), f90Var));
                return Unit.f186387a;
            case 26:
                is0.a aVar9 = (is0.a) obj5;
                Typeface typeface = (Typeface) obj2;
                Intrinsics.checkNotNullParameter(typeface, "typeface");
                ((Ref$BooleanRef) obj6).f186407a = true;
                if (Intrinsics.f(aVar9.f168078c, (i3) obj4)) {
                    aVar9.f168076a.setTypeface(typeface);
                }
                return Unit.f186387a;
            case 27:
                String juniorId = (String) obj4;
                xi0.b bVar9 = (xi0.b) obj5;
                List exchangeRates2 = (List) obj2;
                Intrinsics.checkNotNullParameter(exchangeRates2, "exchangeRates");
                amd.e eVar3 = amd.e.PERSONAL;
                List list7 = (List) obj6;
                ArrayList arrayList4 = new ArrayList();
                Iterator it10 = list7.iterator();
                while (it10.hasNext()) {
                    io3.d pocket = (io3.d) it10.next();
                    Intrinsics.checkNotNullParameter(pocket, "pocket");
                    Intrinsics.checkNotNullParameter(juniorId, "juniorId");
                    xi0.a aVar10 = xi0.b.Companion;
                    String str5 = pocket.f163147c;
                    aVar10.getClass();
                    xi0.b bVarA = xi0.a.a(str5);
                    a0.x(u.c(new amd.f(new CurrencyClause(bVarA, null, null, i6), null, new MoneyClause(new dj0.d(pocket.i, bVarA), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, new CurrencyImage(pocket.f163147c, (ImageTransformations) null, (TextLocalisedClause) null, 14), null, new amd.v(juniorId, pocket.f163145a), 160)), arrayList4);
                    it10 = it10;
                    i6 = 6;
                }
                f0 f0Var = f0.f322471a;
                dj0.d.Companion.getClass();
                dj0.d dVar3 = dj0.d.e;
                for (Object obj8 : list7) {
                    int i33 = i32 + 1;
                    if (i32 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    if (i32 == 0) {
                        io3.d dVar4 = (io3.d) obj8;
                        long j3 = dVar4.i;
                        xi0.a aVar11 = xi0.b.Companion;
                        String str6 = dVar4.f163147c;
                        aVar11.getClass();
                        dVarO = uc0.b.j(new dj0.d(j3, xi0.a.a(str6)), exchangeRates2, bVar9);
                    } else {
                        io3.d dVar5 = (io3.d) obj8;
                        long j5 = dVar5.i;
                        xi0.a aVar12 = xi0.b.Companion;
                        String str7 = dVar5.f163147c;
                        aVar12.getClass();
                        dVarO = pyd.c.O(dVar3, uc0.b.j(new dj0.d(j5, xi0.a.a(str7)), exchangeRates2, bVar9));
                    }
                    dVar3 = dVarO;
                    i32 = i33;
                }
                return new amd.d(eVar3, arrayList4, f0Var, dVar3);
            case 28:
                com.revolut.feature_crypto_picker.impl.ui.picker.a aVar13 = (com.revolut.feature_crypto_picker.impl.ui.picker.a) obj5;
                List list8 = (List) obj4;
                j0i.a update = (j0i.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                ArrayList arrayList5 = new ArrayList();
                for (Object obj9 : (List) obj6) {
                    if (!aVar13.o.f96806b.contains((xi0.b) obj9)) {
                        arrayList5.add(obj9);
                    }
                }
                return j0i.a.a(update, null, null, arrayList5, list8, aVar13.J2(arrayList5, list8, update.f170040b), null, null, null, null, null, 995);
            default:
                j12.b bVar10 = (j12.b) obj6;
                Alias alias = (Alias) obj5;
                Function1 function1 = (Function1) obj4;
                eii.k result2 = (eii.k) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if ((result2 instanceof eii.i ? (eii.i) result2 : null) != null) {
                    j12.d dVar6 = (j12.d) bVar10.f170112l;
                    dVar6.getClass();
                    Intrinsics.checkNotNullParameter(alias, "alias");
                    AliasType aliasType = alias.f61878a;
                    if (Intrinsics.f(aliasType, AliasType.PHONE.f61895b)) {
                        i3 = R$string.apm_alias_deregister_dialog_confirm_phone_title;
                    } else if (Intrinsics.f(aliasType, AliasType.EMAIL.f61894b) || Intrinsics.f(aliasType, AliasType.REVTAG_EMAIL.f61896b)) {
                        i3 = R$string.apm_alias_deregister_dialog_confirm_email_title;
                    } else {
                        if (!Intrinsics.f(aliasType, AliasType.TAX_NUMBER.f61897b) && !Intrinsics.f(aliasType, AliasType.DOCUMENT_ID.f61893b) && !Intrinsics.f(aliasType, AliasType.ALPHANUMERIC.f61892b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = R$string.apm_alias_deregister_dialog_confirm_generic_title;
                    }
                    lw0.a aVar14 = new lw0.a(new TextLocalisedClause(i3, null, null, 14), new TextLocalisedClause(R$string.apm_alias_deregister_dialog_confirm_subtitle_generic, u.c(((j12.a) dVar6.f170113a).d(alias)), null, 12), null, null, false, 28);
                    aw0.h hVar4 = new aw0.h(false, new n6(new TextLocalisedClause(R$string.apm_alias_deregister_dialog_confirm_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.apm_alias_deregister_dialog_confirm_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121);
                    k9 k9Var = k9.Payments;
                    Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                    bVar10.N2(new ActionsBottomSheetController(new dii.a(aVar14, hVar4, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new is6.t(function1, alias, 22));
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ l(Object obj2, Object obj3, String str, int i) {
        this.f155022a = i;
        this.f155023b = obj2;
        this.d = str;
        this.f155024c = obj3;
    }

    public /* synthetic */ l(List list, a5h.g gVar, String str, xi0.b bVar) {
        this.f155022a = 27;
        this.f155023b = list;
        this.d = str;
        this.f155024c = bVar;
    }

    public /* synthetic */ l(List list, Set set, i8d.e eVar, CharSequence charSequence) {
        this.f155022a = 15;
        this.f155023b = list;
        this.f155024c = set;
        this.d = charSequence;
    }
}
