package nyb;

import android.content.Context;
import androidx.compose.foundation.text.contextmenu.ProcessTextApi23Impl;
import aw0.o9;
import com.onfido.android.sdk.capture.ui.OnfidoActivity;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.insurance_pet.impl.ui.hub.screen.PetHubFragment;
import com.revolut.feature.payments.social.api.model.StartAction;
import com.revolut.feature.payments.social.api.navigation.SocialPaymentsFeatureConfig;
import com.revolut.feature.rev_points.models.RevPointsProductRate;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.core.navigation.FeatureCommand;
import ip0.gu;
import ip0.pb0;
import ip0.s7;
import java.time.Instant;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.a1;
import m1c.g1;
import m1c.r0;
import m1c.r1;
import m1c.u1;
import m1c.x0;
import m1c.z;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220811a;

    public /* synthetic */ m(int i) {
        this.f220811a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        hha.d dVar;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        Object objA;
        int i = this.f220811a;
        nz9.b bVar = nz9.b.f221005a;
        z = false;
        z = false;
        boolean z = false;
        z = false;
        z = false;
        boolean z3 = false;
        z = false;
        z = false;
        boolean z4 = false;
        switch (i) {
            case 0:
                r0 optInInfo = (r0) obj2;
                Intrinsics.checkNotNullParameter(optInInfo, "optInInfo");
                return Boolean.valueOf(optInInfo.f201447a == x0.OPTED_OUT);
            case 1:
                Boolean hasTriggered = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(hasTriggered, "hasTriggered");
                return Boolean.valueOf(!hasTriggered.booleanValue());
            case 2:
                e7l.f config = (e7l.f) obj2;
                Intrinsics.checkNotNullParameter(config, "config");
                return Boolean.valueOf(config.K1);
            case 3:
                m1c.z pointsAccountStatus = (m1c.z) obj2;
                Intrinsics.checkNotNullParameter(pointsAccountStatus, "pointsAccountStatus");
                if (pointsAccountStatus instanceof m1c.y) {
                    return x0.OPTED_IN;
                }
                if (Intrinsics.f(pointsAccountStatus, z.a.f201476a)) {
                    return x0.OPTED_OUT;
                }
                throw new NoWhenBranchMatchedException();
            case 4:
                return h30.l.q("it", (od0.i) obj2);
            case 5:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                boolean zBooleanValue = ((Boolean) rVar.f314201a).booleanValue();
                bla.c cVar = (bla.c) rVar.f314202b;
                boolean zBooleanValue2 = ((Boolean) rVar.f314203c).booleanValue();
                if (zBooleanValue && cVar == bla.c.ENABLED && zBooleanValue2) {
                    z4 = true;
                }
                return Boolean.valueOf(z4);
            case 6:
                return h30.l.q("it", (od0.i) obj2);
            case 7:
                yhm.r rVar2 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar2, "<destruct>");
                boolean zBooleanValue3 = ((Boolean) rVar2.f314201a).booleanValue();
                bla.c cVar2 = (bla.c) rVar2.f314202b;
                boolean zBooleanValue4 = ((Boolean) rVar2.f314203c).booleanValue();
                if (zBooleanValue3 && cVar2 == bla.c.ENABLED && zBooleanValue4) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 8:
                return h30.l.q("it", (od0.i) obj2);
            case 9:
                yhm.r rVar3 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar3, "<destruct>");
                boolean zBooleanValue5 = ((Boolean) rVar3.f314201a).booleanValue();
                bla.c cVar3 = (bla.c) rVar3.f314202b;
                boolean zBooleanValue6 = ((Boolean) rVar3.f314203c).booleanValue();
                if (zBooleanValue5 && cVar3 == bla.c.ENABLED && zBooleanValue6) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                g1 it8 = (g1) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f201367b;
            case 11:
                return ((Boolean) obj2).booleanValue() ? new b39.a(b39.d.SPARE_CHANGE_FOR_REV_POINTS) : b39.b.f12015a;
            case 12:
                List timestamps = (List) obj2;
                Intrinsics.checkNotNullParameter(timestamps, "timestamps");
                List list = timestamps;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    LocalDate localDate = Instant.ofEpochMilli(((Number) it9.next()).longValue()).atZone(ZoneId.systemDefault()).toLocalDate();
                    arrayList.add(YearMonth.of(localDate.getYear(), localDate.getMonth()));
                }
                return zhm.d0.U(arrayList);
            case 13:
                Intrinsics.checkNotNullParameter((lk0.e) obj2, "it");
                return null;
            case 14:
                lk0.e previousPage = (lk0.e) obj2;
                Intrinsics.checkNotNullParameter(previousPage, "previousPage");
                List list2 = previousPage.f196171a;
                if (list2.isEmpty()) {
                    return null;
                }
                int size = list2.size();
                RevPointsTransactionPageParams revPointsTransactionPageParams = (RevPointsTransactionPageParams) previousPage.f196172b;
                if (size < revPointsTransactionPageParams.f84104a) {
                    return null;
                }
                return RevPointsTransactionPageParams.b(revPointsTransactionPageParams, Long.valueOf(((r1) zhm.d0.m0(list2)).f201449a.d), 505);
            case 15:
                vf0.k kVar = (vf0.k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                RevPointsProductRate revPointsProductRate = (RevPointsProductRate) kVar.f288454a;
                List list3 = (List) kVar.f288455b;
                List list4 = (List) kVar.f288456c;
                hha.d dVar2 = (hha.d) kVar.d;
                xi0.b bVar2 = (xi0.b) kVar.e;
                ArrayList<a1> arrayList2 = new ArrayList();
                for (Object obj3 : list3) {
                    if (((a1) obj3).f201334b < revPointsProductRate.d) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (a1 a1Var : arrayList2) {
                    switch (o0.f220825a[a1Var.f201333a.ordinal()]) {
                        case 1:
                            Iterator it10 = list4.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    next2 = it10.next();
                                    if (hha.s.o((hha.d) next2)) {
                                    }
                                } else {
                                    next2 = null;
                                }
                            }
                            dVar = (hha.d) next2;
                            break;
                        case 2:
                            Iterator it11 = list4.iterator();
                            while (true) {
                                if (it11.hasNext()) {
                                    next3 = it11.next();
                                    if (hha.s.p((hha.d) next3)) {
                                    }
                                } else {
                                    next3 = null;
                                }
                            }
                            dVar = (hha.d) next3;
                            break;
                        case 3:
                            Iterator it12 = list4.iterator();
                            while (true) {
                                if (it12.hasNext()) {
                                    next4 = it12.next();
                                    if (hha.s.j((hha.d) next4)) {
                                    }
                                } else {
                                    next4 = null;
                                }
                            }
                            dVar = (hha.d) next4;
                            break;
                        case 4:
                            Iterator it13 = list4.iterator();
                            while (true) {
                                if (it13.hasNext()) {
                                    next5 = it13.next();
                                    if (hha.s.n((hha.d) next5)) {
                                    }
                                } else {
                                    next5 = null;
                                }
                            }
                            dVar = (hha.d) next5;
                            break;
                        case 5:
                            Iterator it14 = list4.iterator();
                            while (true) {
                                if (it14.hasNext()) {
                                    next6 = it14.next();
                                    if (hha.s.m((hha.d) next6)) {
                                    }
                                } else {
                                    next6 = null;
                                }
                            }
                            dVar = (hha.d) next6;
                            break;
                        case 6:
                            dVar = (hha.d) zhm.d0.d0(list4);
                            break;
                        case 7:
                            dVar = null;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    Pair pair = new Pair(a1Var, dVar);
                    if (dVar == null) {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList3.add(pair);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : arrayList3) {
                    if (((hha.d) ((Pair) obj4).f186386b) != null) {
                        arrayList4.add(obj4);
                    }
                }
                Iterator it15 = arrayList4.iterator();
                if (it15.hasNext()) {
                    next = it15.next();
                    if (it15.hasNext()) {
                        double d = ((a1) ((Pair) next).f186385a).f201334b;
                        do {
                            Object next7 = it15.next();
                            double d5 = ((a1) ((Pair) next7).f186385a).f201334b;
                            if (Double.compare(d, d5) > 0) {
                                next = next7;
                                d = d5;
                            }
                        } while (it15.hasNext());
                    }
                } else {
                    next = null;
                }
                Pair pair2 = (Pair) next;
                if (pair2 == null) {
                    pair2 = new Pair(null, null);
                }
                a1 a1Var2 = (a1) pair2.f186385a;
                hha.d dVar3 = (hha.d) pair2.f186386b;
                long j2 = 1;
                Iterator<Long> it16 = new kotlin.ranges.e(1L, bVar2.c()).iterator();
                while (((vim.g) it16).f289628c) {
                    ((zhm.m0) it16).nextLong();
                    j2 *= (long) 10;
                }
                return new u1(dVar2, revPointsProductRate, dVar3, dVar3 != null ? a1Var2 : null, new dj0.d(j2, bVar2), new dj0.d((long) (j2 * (a1Var2 != null ? a1Var2.f201334b : revPointsProductRate.d)), bVar2));
            case 16:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "<unused var>", 4);
                for (int i2 = 0; i2 < 4; i2++) {
                    arrayListP.add(new SuggestionsBarDelegate.Suggestion(a0.d.n("ID_SUGGESTION_", i2), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, null, null, OnfidoActivity.RESULT_EXIT_BACKGROUND_STOP));
                }
                return nyi.a.a(arrayListP);
            case 17:
                LargeActionButtonDelegate.Model it17 = (LargeActionButtonDelegate.Model) obj2;
                int i3 = PetHubFragment.p0;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(Intrinsics.f(it17.f52613a, "REMINDER_DATE_PICKER_LARGE_ACTION_BUTTON_ITEM_LIST_ID"));
            case 18:
                yhm.r rVar4 = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar4, "<destruct>");
                return new oz7.b((List) rVar4.f314201a, (List) rVar4.f314202b, (od0.i) rVar4.f314203c);
            case 19:
                nz9.c route = (nz9.c) obj2;
                Intrinsics.checkNotNullParameter(route, "route");
                if (route instanceof nz9.a) {
                    objA = com.revolut.retail.core.navigation.a.c(jbb.a.a(ibb.c.f160142c, null, null, null, 14), new FeatureCommand(new SocialPaymentsFeatureConfig.PaymentsProfileChat((zm3.a) ((nz9.a) route).f221004a, (TransferMoneyPocket) null, (StartAction.ShowBottomDialog) null, true, 22)));
                } else {
                    if (!Intrinsics.f(route, bVar)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objA = jbb.a.a(ibb.c.f160142c, null, null, null, 14);
                }
                ufm.b bVarM = efm.d0.m(objA);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 20:
                od0.i contactOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(contactOptional, "contactOptional");
                zm3.l lVar = (zm3.l) contactOptional.g();
                return lVar != null ? new nz9.a(lVar) : bVar;
            case 21:
                zm3.a contact = (zm3.a) obj2;
                Intrinsics.checkNotNullParameter(contact, "contact");
                if (contact instanceof zm3.l) {
                    od0.i.Companion.getClass();
                    return od0.h.a(contact);
                }
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 22:
                List evidenceTypesDto = (List) obj2;
                Intrinsics.checkNotNullParameter(evidenceTypesDto, "evidenceTypesDto");
                Intrinsics.checkNotNullParameter(evidenceTypesDto, "evidenceTypesDto");
                List<jzc.m> list5 = evidenceTypesDto;
                ArrayList arrayList5 = new ArrayList(zhm.w.t(list5, 10));
                for (jzc.m mVar : list5) {
                    String strG = mVar.getType();
                    String strF = mVar.getTitle();
                    String strA = mVar.getDescription();
                    boolean zC = mVar.getPrimary();
                    gzc.m mVarB = lzc.a.b(mVar.getSubTypes().getDefaultSubType());
                    List listA = mVar.getSubTypes().getAvailableSubTypes();
                    ArrayList arrayList6 = new ArrayList(zhm.w.t(listA, 10));
                    Iterator it18 = listA.iterator();
                    while (it18.hasNext()) {
                        arrayList6.add(lzc.a.b((jzc.k) it18.next()));
                    }
                    gzc.l lVar2 = new gzc.l(mVarB, arrayList6);
                    List<List> listB = mVar.getDocumentTypes();
                    ArrayList arrayList7 = new ArrayList(zhm.w.t(listB, 10));
                    for (List<jzc.h> list6 : listB) {
                        ArrayList arrayList8 = new ArrayList(zhm.w.t(list6, 10));
                        for (jzc.h hVar : list6) {
                            arrayList8.add(new gzc.i(hVar.getType(), hVar.getTitle(), hVar.getDescription(), (String) null, 24));
                        }
                        arrayList7.add(arrayList8);
                    }
                    List<jzc.p> listD = mVar.getQuestionTypes();
                    ArrayList arrayList9 = new ArrayList(zhm.w.t(listD, 10));
                    for (jzc.p pVar : listD) {
                        String strF2 = pVar.getType();
                        arrayList9.add(new gzc.r(Intrinsics.f(strF2, "TEXT") ? gzc.d.TEXT : Intrinsics.f(strF2, "SELECT") ? gzc.d.SELECT : gzc.d.UNKNOWN, pVar.getQuestion(), pVar.getDescription(), pVar.getTitle(), pVar.getIsRequired(), pVar.getFieldName(), pVar.getDefaultAnswer(), pVar.getValueToTitle()));
                    }
                    arrayList5.add(new gzc.n(strF, strG, strA, zC, lVar2, arrayList7, arrayList9));
                }
                return arrayList5;
            case 23:
                jzc.j response = (jzc.j) obj2;
                Intrinsics.checkNotNullParameter(response, "response");
                return response.getId();
            case 24:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 25:
                LargeActionButtonDelegate.Model it19 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return Boolean.valueOf(Intrinsics.f(it19.f52613a, "ITEM_BUTTON_UPDATE_LIMITS"));
            case 26:
                LargeActionButtonDelegate.Model it20 = (LargeActionButtonDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.valueOf(Intrinsics.f(it20.f52613a, "ITEM_BUTTON_NOT_NOW"));
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                pb0 pb0Var = new pb0("loading");
                yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
                return zhm.u.c(pb0Var);
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                for (int i5 = 0; i5 < 4; i5++) {
                    eVarB.add(new gu(a0.d.n("ID_LIST_LOADING_", i5), 0, 0, 30));
                    int i6 = 0;
                    int i21 = 0;
                    int i22 = 0;
                    List listK = zhm.v.k(new s7(a0.d.n("ID_LIST_LOADING_", i5), 0, i6, i21, i22, false, null, 126), new s7(a0.d.n("ID_LIST_LOADING_", i5), i6, i21, i22, 0 == true ? 1 : 0, false, null, 126));
                    yp0.b.k(listK, 0, 0, 0, 0, 31);
                    eVarB.addAll(listK);
                }
                return zhm.u.a(eVarB);
            default:
                return ProcessTextApi23Impl.processTextActivitiesQuery$lambda$0((Context) obj2);
        }
    }

    public /* synthetic */ m(Object obj2, int i) {
        this.f220811a = i;
    }
}
