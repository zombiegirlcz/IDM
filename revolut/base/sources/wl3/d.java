package wl3;

import aw0.o9;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.recipients.settings.models.RecipientPaymentsSettings;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.portfolio.StockBuyBlock;
import ip0.gu;
import ip0.pb0;
import ip0.u20;
import ip0.w20;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.joda.time.LocalDate;
import rp0.a0;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298375a;

    public /* synthetic */ d(int i) {
        this.f298375a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f298375a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                ArrayList arrayListE0 = d0.E0((List) pair.f186386b, (List) pair.f186385a);
                int iB = q0.b(w.t(arrayListE0, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : arrayListE0) {
                    linkedHashMap.put(((zm3.l) obj3).getCode(), obj3);
                }
                return linkedHashMap;
            case 1:
                return Boolean.valueOf(((bl3.b) obj2) == bl3.b.GRANTED);
            case 2:
                List<RecipientPaymentsSettings> recipientSettings = (List) obj2;
                Intrinsics.checkNotNullParameter(recipientSettings, "recipientSettings");
                ArrayList arrayList = new ArrayList();
                for (RecipientPaymentsSettings recipientPaymentsSettings : recipientSettings) {
                    Iterator it8 = recipientPaymentsSettings.f79674c.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            next = it8.next();
                            if (((RecipientPaymentsSettings.Setting) next).f79675a == iy9.c.HIDE_P2P_CHAT_HISTORY) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    RecipientPaymentsSettings.Setting setting = (RecipientPaymentsSettings.Setting) next;
                    RecipientPaymentsSettings.Setting.Value value = setting != null ? setting.f79676b : null;
                    RecipientPaymentsSettings.Setting.Value.LongNumber longNumber = value instanceof RecipientPaymentsSettings.Setting.Value.LongNumber ? (RecipientPaymentsSettings.Setting.Value.LongNumber) value : null;
                    Long lValueOf = longNumber != null ? Long.valueOf(longNumber.f79678a) : null;
                    Pair pair2 = lValueOf != null ? new Pair(recipientPaymentsSettings.f79672a, lValueOf) : null;
                    if (pair2 != null) {
                        arrayList.add(pair2);
                    }
                }
                return r0.t(arrayList);
            case 3:
                wl5.g updateState = (wl5.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return wl5.g.a(updateState, null, null, null, null, null, false, null, 95);
            case 4:
                wl5.g updateState2 = (wl5.g) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return wl5.g.a(updateState2, null, null, null, null, null, false, null, 63);
            case 5:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return iii.c.c(5);
            case 6:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return d0.E0((Iterable) getDefaultLoadingItems.invoke(), zhm.u.c(new gu("LOADING_HEADER", 0, 0, 30)));
            case 7:
                return new TextLocalisedClause(R$string.wealth_action_close_joint_invest_account, null, null, 14);
            case 8:
                hel.b bVar = (hel.b) obj2;
                switch (bVar == null ? -1 : wlh.e.f298488a[bVar.ordinal()]) {
                    case -1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return new TextLocalisedClause(R$string.wealth_invest_settings_stocks_closeAccount, null, null, 14);
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        return new TextLocalisedClause(R$string.wealth_action_close_brokerage_account, null, null, 14);
                }
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                m70.a.c(t0.f186434a);
                return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 10:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return cfl.t.f23750a;
            case 11:
                StockBuyBlock it11 = (StockBuyBlock) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it11);
            case 12:
                rp0.q it12 = (rp0.q) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return new wm.g(it12);
            case 13:
                a0 it13 = (a0) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new wm.h(it13);
            case 14:
                rp0.p it14 = (rp0.p) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return new wm.f(it14);
            case 15:
                wm.i callback = (wm.i) obj2;
                Intrinsics.checkNotNullParameter(callback, "callback");
                throw null;
            case 16:
                Function0 defaultFactory = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke();
            case 17:
                List it15 = (List) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : it15) {
                    if (qua.u.l((qua.p) obj4)) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return w.u(v.k(yp0.b.g(v.k(new pb0("PAYEES_LOADING_LIST_ID_1"), new pb0("PAYEES_LOADING_LIST_ID_2"), new pb0("PAYEES_LOADING_LIST_ID_3")), wm9.m.b(com.revolut.feature.security_hub.api.R$string.security_hub_payees_section_header_requires_authentication, "PAYEES_REQUIRE_AUTHENTICATION_SUBHEADER_ITEM_ID"), null, 0, 0, 126), yp0.b.g(v.k(new pb0("PAYEES_LOADING_LIST_ID_4"), new pb0("PAYEES_LOADING_LIST_ID_5"), new pb0("PAYEES_LOADING_LIST_ID_6")), wm9.m.b(com.revolut.feature.security_hub.api.R$string.security_hub_payees_section_header_blocked, "PAYEES_BLOCKED_SUBHEADER_ITEM_ID"), null, 0, 0, 126)));
            case 19:
                Pair pair3 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair3, "<destruct>");
                fo3.c cVar = (fo3.c) pair3.f186385a;
                String id10 = cVar.f136801a;
                Intrinsics.checkNotNullParameter(id10, "id");
                return new wmd.a(AccountId.Personal.f51414a, id10, cVar.d);
            case 20:
                LocalDate date = (LocalDate) obj2;
                Intrinsics.checkNotNullParameter(date, "date");
                return jli.b.e(date);
            case 21:
                Function0 it16 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return f0.f322471a;
            case 22:
                xmh.a it17 = (xmh.a) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f307263c.f224648b;
            case 23:
                xmh.a it18 = (xmh.a) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f307262b;
            case 24:
                Function0 it19 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                f0 f0Var = f0.f322471a;
                gu guVar = new gu("LOADING_SUBHEADER_ITEM", 0, R$attr.uikit_dp12, 26);
                w20 w20Var = w20.PICTURE_80DP;
                u20 u20Var = new u20("LOADING_ROW_ITEM_1", w20Var);
                yp0.b.l(u20Var, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
                u20 u20Var2 = new u20("LOADING_ROW_ITEM_2", w20Var);
                yp0.b.l(u20Var2, R$attr.uikit_dp0, 0, 0, 0, null, false, 62);
                return new wn7.j(v.k(guVar, u20Var, u20Var2), f0Var);
            case 25:
                wna.c it20 = (wna.c) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return Boolean.valueOf(it20.f298741a.getContent() == qla.a.REVOLUT_X);
            case 26:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return f0.f322471a;
            case 27:
                wc6.d it21 = (wc6.d) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it21);
            case 28:
                Throwable it22 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            default:
                snb.b it23 = (snb.b) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it23);
        }
    }
}
