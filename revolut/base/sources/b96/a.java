package b96;

import aw0.o9;
import ba7.k;
import bb2.j;
import bba.l;
import bbg.s;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.domain.models.login.ChannelType;
import com.revolut.feature.revolutpay.shared.R$string;
import com.revolut.feature.statements.api.models.StatementContent;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import com.youTransactor.uCube.rpc.Constants;
import h93.n;
import h93.o;
import ip0.gb0;
import ip0.gu;
import ip0.pb0;
import ip0.s7;
import ip0.zf0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import m1c.r0;
import od0.i;
import yhm.r;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13665a;

    public /* synthetic */ a(int i) {
        this.f13665a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f13665a) {
            case 0:
                StatementContent it8 = (StatementContent) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                od0.h hVar = i.Companion;
                String legalInfo = it8.getLegalInfo();
                hVar.getClass();
                return od0.h.a(legalInfo);
            case 1:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (Intrinsics.f(((n71.b) obj3).f212975b, e.e.f306286a)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new b9c.g(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new pb0("LOADING_AMOUNT_ITEM_EDIT_LIST_ID"), new pb0("LOADING_CASHBACK_ITEM_EDIT_LIST_ID")), false, new TextLocalisedClause(R$string.revolut_pay_common_action_pay, null, null, 14));
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listK = v.k(new gu("ACTIONS_LOADING_ITEM_ID", 0, 0, 30), new pb0("ACTIONS_LOADING_ITEM_ID"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 4:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listC = u.c(new pb0("CARD_LOADING_ITEM_ID"));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return listC;
            case 5:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Optional.empty();
            case 6:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                List list2 = (List) pair.f186385a;
                Optional optional = (Optional) pair.f186386b;
                if (!optional.isPresent()) {
                    return list2;
                }
                Object obj4 = optional.get();
                Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                List list3 = (List) obj4;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : list2) {
                    if (list3.contains(((hj0.f) obj5).getId())) {
                        arrayList2.add(obj5);
                    }
                }
                return arrayList2;
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Unit.f186387a;
            case 8:
                List it9 = (List) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                Map map = w93.a.f295690a;
                Intrinsics.checkNotNullParameter(it9, "<this>");
                ArrayList arrayList3 = new ArrayList();
                Iterator it10 = it9.iterator();
                while (it10.hasNext()) {
                    n93.d dVar = (n93.d) u1.v(((x93.a) it10.next()).getName(), w93.a.f295690a);
                    if (dVar != null) {
                        arrayList3.add(dVar);
                    }
                }
                return arrayList3;
            case 9:
                List list4 = (List) obj2;
                Intrinsics.checkNotNullParameter(list4, "list");
                List<y93.b> list5 = list4;
                ArrayList arrayList4 = new ArrayList(w.t(list5, 10));
                for (y93.b bVar : list5) {
                    Intrinsics.checkNotNullParameter(bVar, "<this>");
                    String cardId = bVar.getCardId();
                    y93.a contactlessCounter = bVar.getContactlessCounter();
                    Intrinsics.checkNotNullParameter(contactlessCounter, "<this>");
                    arrayList4.add(new o(cardId, new n(contactlessCounter.getCount(), mo3.a.o(contactlessCounter.getCurrent()), mo3.a.o(contactlessCounter.getLimit()))));
                }
                return arrayList4;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return k.b();
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return zf0.f167457a;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 13:
                List rates = (List) obj2;
                Intrinsics.checkNotNullParameter(rates, "rates");
                return (qta.c) d0.b0(rates);
            case 14:
                TradingAccounts tradingAccounts = (TradingAccounts) obj2;
                Intrinsics.checkNotNullParameter(tradingAccounts, "tradingAccounts");
                Iterator it11 = tradingAccounts.f105279b.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        next = it11.next();
                        if (com.revolut.shared.feature.wealth.models.trading_accounts.b.c((TradingAccountAvailableToOnboard) next)) {
                        }
                    } else {
                        next = null;
                    }
                }
                TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard = (TradingAccountAvailableToOnboard) next;
                if (tradingAccountAvailableToOnboard != null) {
                    return tradingAccountAvailableToOnboard.f105265a;
                }
                return null;
            case 15:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                boolean zBooleanValue = ((Boolean) rVar.f314201a).booleanValue();
                n89.a aVar = (n89.a) rVar.f314202b;
                String str = (String) rVar.f314203c;
                Object[] objArr = aVar == n89.a.SSN ? 1 : 0;
                if (!zBooleanValue) {
                    return (objArr == 0 || !(str == null || ch.qos.logback.core.util.a.x("^(000|666).*|^\\d{3}-?(00).*|^\\d{3}-?\\d{2}-?(0000)$", str))) ? p89.a.INVALID : p89.a.REQUEST_SHOWING_ERROR;
                }
                e0m.g gVar = e0m.g.f121750a;
                return ((Boolean) (objArr != 0 ? new ax9.d(1, gVar, e0m.g.class, "isValidSsn", "isValidSsn(Ljava/lang/String;)Z", 0, 6) : new ax9.d(1, gVar, e0m.g.class, "isValidItin", "isValidItin(Ljava/lang/String;)Z", 0, 7)).invoke(str)).booleanValue() ? p89.a.VALID : p89.a.REQUEST_SHOWING_ERROR;
            case 16:
                baf.i update = (baf.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return baf.i.a(update, null, null, null, !update.d, false, Constants.TAG_BLE_FIRMWARE_VERSION);
            case 17:
                bai.i update2 = (bai.i) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Data terms = new Data(null, null, true, 3, null);
                bai.h.Companion.getClass();
                update2.getClass();
                Intrinsics.checkNotNullParameter(terms, "terms");
                bai.h basicAccount = bai.h.d;
                Intrinsics.checkNotNullParameter(basicAccount, "basicAccount");
                return new bai.i(terms, basicAccount);
            case 18:
                bai.i update3 = (bai.i) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                bai.h hVar2 = update3.f14101b;
                return bai.i.a(update3, null, new bai.h(!hVar2.f14097a, hVar2.f14098b, hVar2.f14099c), 1);
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(3);
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(3);
            case 21:
                return j.a((j) obj2, null, new Data(null, null, true, 3, null), 1);
            case 22:
                return j.a((j) obj2, new Data(null, null, true, 3, null), null, 2);
            case 23:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                s7 s7Var = new s7("LOADING_1", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var, 0, 0, 0, 0, null, false, 63);
                s7 s7Var2 = new s7("LOADING_2", 0, 0, 0, 0, false, null, 126);
                yp0.b.l(s7Var2, 0, 0, 0, 0, null, false, 63);
                return new bb8.i(v.k(s7Var, s7Var2), false);
            case 24:
                Function0 defaultFactory = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return new l((List) defaultFactory.invoke());
            case 25:
                ChannelType it12 = (ChannelType) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                Intrinsics.checkNotNullParameter(it12, "<this>");
                switch (bbb.g.f14226a[it12.ordinal()]) {
                    case 1:
                        return tjg.e.PUSH;
                    case 2:
                        return tjg.e.SMS;
                    case 3:
                        return tjg.e.EMAIL;
                    case 4:
                        return tjg.e.CALL;
                    case 5:
                        return tjg.e.PASSCODE;
                    case 6:
                        return tjg.e.SESSION;
                    case 7:
                    case 8:
                        throw new IllegalStateException(("Channel can not be converted into auth method: " + it12).toString());
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 26:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return Boolean.valueOf(((tjg.e) pair2.f186386b) != tjg.e.PUSH);
            case 27:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                return (tjg.c) pair3.f186385a;
            case 28:
                r0 it13 = (r0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                i.Companion.getClass();
                return od0.h.a(it13);
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = u.b();
                gb0 gb0Var = new gb0("ROOM_PREVIEW_LOADING_ITEM_ID");
                yp0.b.l(gb0Var, 0, 0, 0, 0, null, false, 63);
                eVarB.add(gb0Var);
                eVarB.add(new gu("SUBHEADER_LOADING_ITEM_ID", 0, 0, 30));
                ArrayList arrayList5 = new ArrayList(4);
                for (int i = 0; i < 4; i++) {
                    arrayList5.add(new s7(a0.d.n("CELL_DETAILS_LOADING_ITEM_ID_", i), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList5, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList5);
                return new s(u.a(eVarB));
        }
    }

    public /* synthetic */ a(Object obj2, int i) {
        this.f13665a = i;
    }
}
