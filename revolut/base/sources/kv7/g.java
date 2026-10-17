package kv7;

import a83.o0;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.o9;
import bw0.k;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.domain.models.externalcards.CardholderVerificationStatus;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.health.api.models.CreditScore;
import com.revolut.feature.credit.health.impl.domain.model.CreditScoreDetails;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$Details$ByMoneyRequest;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.api.userauth.navigation.UserAuthFeatureConfig;
import d67.p;
import d67.q;
import d67.r;
import d67.s;
import d67.t;
import d67.u;
import dx4.c5;
import dx4.m4;
import dx4.w1;
import ip0.br;
import ip0.cr;
import ip0.s7;
import j03.c;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import kvg.j;
import kw4.a0;
import kw4.l;
import kw4.m;
import kw4.n;
import kye.x3;
import zhm.f0;
import zhm.h0;
import zhm.q0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f189989b;

    public /* synthetic */ g(Object obj2, int i) {
        this.f189988a = i;
        this.f189989b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Map mapQ;
        Map mapQ2;
        Map mapQ3;
        int i = this.f189988a;
        int i2 = 25;
        int i3 = 3;
        boolean z = false;
        int i5 = 0;
        z = false;
        int i6 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object obj3 = this.f189989b;
        switch (i) {
            case 0:
                i iVar = (i) obj3;
                f9i.c request = (f9i.c) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                iVar.A1(new kq5.d(iVar, request, objArr == true ? 1 : 0, 15), new yi5.b(i2));
                return Unit.f186387a;
            case 1:
                com.revolut.feature.kyc.impl.external.app.flow.a aVar = (com.revolut.feature.kyc.impl.external.app.flow.a) obj3;
                u outputData = (u) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof t) {
                    aVar.C2(ts8.d.f274055a);
                } else if (outputData instanceof s) {
                    aVar.C2(ts8.c.f274054a);
                } else {
                    if (!(outputData instanceof p) && !(outputData instanceof q) && !(outputData instanceof r)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("ExternalKycPrompt has unexpected type: " + outputData);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            case 2:
                kw4.i update = (kw4.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return kw4.i.a(update, Data.copy$default(update.f190230b, (kw4.h) obj3, null, false, 6, null));
            case 3:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                m mVarA = a0.a(f0.f322471a);
                aim.e eVarB = zhm.u.b();
                m70.a.c(t0.f186434a);
                TextClause textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                bw0.h.Companion.getClass();
                bw0.h hVarA = bw0.b.a();
                bw0.m.Companion.getClass();
                AmountEditDelegate.Model model = new AmountEditDelegate.Model("id_topup_loading_item", textClause, hVarA, null, null, k.a(), k.a(), false, null, null, 1944);
                yp0.b.r(model, 0, 0, 0, 0, 15);
                eVarB.add(model);
                cr crVar = new cr("id_slider_loading", br.CENTER);
                yp0.b.l(crVar, 0, 0, 0, 0, null, false, 63);
                eVarB.add(crVar);
                ((wq4.c) ((a0) obj3).d).getClass();
                IntRange intRange = new IntRange(1, 3, 1);
                ArrayList arrayList = new ArrayList(w.t(intRange, 10));
                vim.f it9 = intRange.iterator();
                while (it9.f289625c) {
                    arrayList.add(new s7(a0.d.n("id_cc_payments_loading_", it9.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList);
                return new n(mVarA, zhm.u.a(eVarB), new l(new TextLocalisedClause(R$string.credit_topup_pay_button_title, null, null, 14), false));
            case 4:
                gw7.a aVar2 = (gw7.a) obj3;
                com.revolut.feature.insurance_home.impl.data.model.f content = (com.revolut.feature.insurance_home.impl.data.model.f) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                Iterable iterable = content.f76213c;
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                ArrayList<com.revolut.feature.insurance_home.impl.data.model.d> arrayList2 = new ArrayList();
                Iterator it10 = iterable.iterator();
                while (it10.hasNext()) {
                    zhm.a0.x(((lw7.d) it10.next()).f200420b, arrayList2);
                }
                if (!arrayList2.isEmpty()) {
                    for (com.revolut.feature.insurance_home.impl.data.model.d dVar : arrayList2) {
                        int i21 = kw7.b.f190298a[aVar2.ordinal()];
                        if (i21 != 1) {
                            if (i21 != 2) {
                                if (i21 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (dVar.e.f76167a == lw7.a.EMBEDDED_INSURANCE) {
                                    z = true;
                                }
                            } else if (dVar.e.f76167a == lw7.a.PET_INSURANCE) {
                                z = true;
                            }
                        } else if (dVar.e.f76167a == lw7.a.CAR_INSURANCE) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                String planId = (String) obj2;
                Intrinsics.checkNotNullParameter(planId, "planId");
                mw7.c cVar = ((kw7.e) obj3).f190301a;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(planId, "planId");
                return cVar.d.c(new mw7.b(planId), false);
            case 6:
                kw7.h hVar = (kw7.h) obj3;
                if (((Boolean) obj2).booleanValue()) {
                    return nim.a.v(new t38.e(kw7.e.a(hVar.f190305b), 24, rd0.e.b(hVar.f190306c.q()), new o0(i3, 11, objArr2 == true ? 1 : 0)), new j(hVar, 13));
                }
                return new go.g(new Data(null, null, false, 6, null), 2);
            case 7:
                iwg.a aVar3 = (iwg.a) obj3;
                mwg.a allocation = (mwg.a) obj2;
                Intrinsics.checkNotNullParameter(allocation, "allocation");
                if (aVar3 != iwg.a.ROBO) {
                    return allocation;
                }
                List list = allocation.e;
                if (list.isEmpty()) {
                    return allocation;
                }
                BigDecimal ONE = BigDecimal.ONE;
                Intrinsics.checkNotNullExpressionValue(ONE, "ONE");
                List list2 = list;
                dj0.d.Companion.getClass();
                dj0.d dVar2 = dj0.d.e;
                dj0.d dVarO = dVar2;
                for (Object obj4 : list2) {
                    int i22 = i5 + 1;
                    if (i5 < 0) {
                        v.s();
                        throw null;
                    }
                    dVarO = i5 == 0 ? ((mwg.c) obj4).f209444c : pyd.c.O(dVarO, ((mwg.c) obj4).f209444c);
                    i5 = i22;
                }
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
                Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
                Iterator it11 = list2.iterator();
                while (it11.hasNext()) {
                    bigDecimalValueOf = bigDecimalValueOf.add(new BigDecimal(String.valueOf(((mwg.c) it11.next()).d)));
                    Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
                }
                return mwg.a.a(allocation, null, f0.f322471a, zhm.u.c(new mwg.c("", ONE, dVarO, bigDecimalValueOf.floatValue(), null, null, null, null, null)), 7);
            case 8:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return (efm.r) ((a0i.a) obj3).invoke(((do3.n) rVar.f314201a).f116408a, gj7.b.m((Optional) rVar.f314202b), (xi0.b) rVar.f314203c);
            case 9:
                til.r workflowResult = (til.r) obj2;
                Intrinsics.checkNotNullParameter(workflowResult, "workflowResult");
                ((nx2.h) obj3).invoke(workflowResult);
                return Unit.f186387a;
            case 10:
                String country = (String) obj2;
                Intrinsics.checkNotNullParameter(country, "country");
                return ((kx2.a) obj3).f190375b.f(kx2.a.a(country));
            case 11:
                m4 item = (m4) obj3;
                ax4.b updateState = (ax4.b) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                updateState.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                Map map = updateState.k;
                String str = item.f120680a;
                if (map.containsKey(str)) {
                    mapQ = new LinkedHashMap(q0.b(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        String str2 = (String) entry.getKey();
                        ax4.m mVarA2 = (ax4.m) entry.getValue();
                        if (Intrinsics.f(str2, str)) {
                            mVarA2 = ax4.m.a(mVarA2, !mVarA2.f10891b);
                        }
                        mapQ.put(key, mVarA2);
                    }
                } else {
                    mapQ = r0.q(map, new Pair(str, new ax4.m(item.e, !item.d)));
                }
                return ax4.b.a(updateState, null, null, null, null, null, null, null, null, null, null, mapQ, null, null, 7167);
            case 12:
                c5 item2 = (c5) obj3;
                ax4.b updateState2 = (ax4.b) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                updateState2.getClass();
                Intrinsics.checkNotNullParameter(item2, "item");
                Map map2 = updateState2.k;
                String str3 = item2.f120569a;
                if (map2.containsKey(str3)) {
                    mapQ2 = new LinkedHashMap(q0.b(map2.size()));
                    for (Map.Entry entry2 : map2.entrySet()) {
                        Object key2 = entry2.getKey();
                        String str4 = (String) entry2.getKey();
                        ax4.m mVarA3 = (ax4.m) entry2.getValue();
                        if (Intrinsics.f(str4, str3)) {
                            mVarA3 = ax4.m.a(mVarA3, !mVarA3.f10891b);
                        }
                        mapQ2.put(key2, mVarA3);
                    }
                } else {
                    mapQ2 = r0.q(map2, new Pair(str3, new ax4.m(item2.f120572g, !item2.e)));
                }
                return ax4.b.a(updateState2, null, null, null, null, null, null, null, null, null, null, mapQ2, null, null, 7167);
            case 13:
                w1 item3 = (w1) obj3;
                ax4.b updateState3 = (ax4.b) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                updateState3.getClass();
                Intrinsics.checkNotNullParameter(item3, "item");
                Map map3 = updateState3.f10858c;
                String str5 = item3.f120809a;
                if (map3.containsKey(str5)) {
                    mapQ3 = new LinkedHashMap(q0.b(map3.size()));
                    for (Map.Entry entry3 : map3.entrySet()) {
                        Object key3 = entry3.getKey();
                        String str6 = (String) entry3.getKey();
                        ax4.a aVar4 = (ax4.a) entry3.getValue();
                        if (Intrinsics.f(str6, str5)) {
                            aVar4 = new ax4.a(!aVar4.f10854a, aVar4.f10855b);
                        }
                        mapQ3.put(key3, aVar4);
                    }
                } else {
                    mapQ3 = r0.q(map3, new Pair(str5, new ax4.a(!item3.f, true)));
                }
                return ax4.b.a(updateState3, null, null, mapQ3, null, null, null, null, null, null, null, null, null, null, 8187);
            case 14:
                kx7.f0 params = (kx7.f0) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (zw7.r) v1.c.s("CACHE_KEY_PET_EDIT_QUOTES_", params.f190457a, ((kx7.h0) obj3).f190462b);
            case 15:
                jx9.a aVar5 = ((kx9.a) obj3).f190509c;
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) obj2).prepare("SELECT * FROM payments_recent_v2");
                try {
                    int columnIndexOrThrow = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recipientId");
                    int columnIndexOrThrow2 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "recipientType");
                    int columnIndexOrThrow3 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "itemId");
                    int columnIndexOrThrow4 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "itemType");
                    int columnIndexOrThrow5 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unreadCounter");
                    int columnIndexOrThrow6 = SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "unreadSyncTimestamp");
                    ArrayList arrayList3 = new ArrayList();
                    while (sQLiteStatementPrepare.step()) {
                        arrayList3.add(new nx9.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow), jx9.a.b(sQLiteStatementPrepare.isNull(columnIndexOrThrow2) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow2)), sQLiteStatementPrepare.isNull(columnIndexOrThrow3) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow3), jx9.a.a(sQLiteStatementPrepare.isNull(columnIndexOrThrow4) ? null : sQLiteStatementPrepare.getText(columnIndexOrThrow4)), (int) sQLiteStatementPrepare.getLong(columnIndexOrThrow5), sQLiteStatementPrepare.getLong(columnIndexOrThrow6)));
                        break;
                    }
                    return arrayList3;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 16:
                UserAuthFeatureConfig userAuthFeatureConfig = (UserAuthFeatureConfig) obj2;
                sri.m mVar = ((kxj.d) obj3).f190585a;
                Intrinsics.h(userAuthFeatureConfig);
                mVar.c(new FeatureCommand(userAuthFeatureConfig));
                return Unit.f186387a;
            case 17:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (List) ((kya.b) obj3).f190639c.get("REF_TROUBLESHOOTER_KEY");
            case 18:
                return kye.m.a((kye.m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, (fb3.d) obj3, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -65537, 63);
            case 19:
                return kye.m.a((kye.m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, (jye.a) obj3, null, null, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -32769, 63);
            case 20:
                CardholderVerificationStatus cardholderVerificationStatus = (CardholderVerificationStatus) obj3;
                kye.m mVar2 = (kye.m) obj2;
                SelectedMethod selectedMethod = mVar2.f190786s;
                SelectedMethod.StoredMethod.Card card = selectedMethod instanceof SelectedMethod.StoredMethod.Card ? (SelectedMethod.StoredMethod.Card) selectedMethod : null;
                return kye.m.a(mVar2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, card != null ? SelectedMethod.StoredMethod.Card.c(card, null, cardholderVerificationStatus, 1023) : null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -524289, 63);
            case 21:
                return kye.m.a((kye.m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, false, false, (qte.g) obj3, false, null, false, false, null, null, null, null, null, null, null, null, null, -16777217, 63);
            case 22:
                return kye.m.a((kye.m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, (bue.b) obj3, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -2097153, 63);
            case 23:
                return kye.m.a((kye.m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, (TopupMethod.SuggestedMethod) obj3, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -1048577, 63);
            case 24:
                x3 x3Var = (x3) obj3;
                return kye.m.a((kye.m) obj2, false, null, null, null, null, null, null, x3Var.f190875b, null, false, null, null, false, null, null, null, null, null, null, null, false, x3Var.f190874a, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -8388737, 63);
            case 25:
                return kye.m.a((kye.m) obj2, false, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, (jye.b) obj3, null, null, null, false, false, null, false, null, false, false, null, null, null, null, null, null, null, null, null, -131073, 63);
            case 26:
                MoneyRequest request2 = (MoneyRequest) obj2;
                Intrinsics.checkNotNullParameter(request2, "request");
                ((kz1.g) obj3).f191049b.c(new FeatureCommand(new MoneyRequestFeatureConfig$Details$ByMoneyRequest(request2, null)));
                return Boolean.TRUE;
            case 27:
                com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.a aVar6 = (com.revolut.feature.card_management.impl.ui.kompot.replace.expectations.a) obj3;
                j03.c result = (j03.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, c.b.f169934a)) {
                    aVar6.A1(new l03.i(aVar6, objArr3 == true ? 1 : 0, i6), new yi5.b(i2));
                } else if (!Intrinsics.f(result, c.a.f169933a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 28:
                Unit it12 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (CreditScoreDetails) ((l05.c) obj3).f191175b.get("credit-score-details-data");
            default:
                Unit it13 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return (CreditScore) ((l05.i) obj3).f191185b.get("credit-score-data");
        }
    }
}
