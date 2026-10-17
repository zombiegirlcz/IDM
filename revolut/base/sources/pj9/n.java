package pj9;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.feature.trusted_merchants.impl.ui.merchant_details.TrustedMerchantDetailsActivity;
import com.revolut.feature.unified_transactions.models.UnifiedTransaction;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_summary.EsimMobilePlanSummaryScreenContract$ContractStatementData;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import com.revolut.sso.api.accounts.RevolutAccount;
import com.revolut.sso.impl.domain.models.RevolutAccountImpl;
import do3.q;
import hha.s;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import ip0.um0;
import ip0.w60;
import ip0.x60;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import pjl.h0;
import tof.a3;
import yhm.r;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236718a;

    public /* synthetic */ n(int i) {
        this.f236718a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3 = null;
        switch (this.f236718a) {
            case 0:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return u.c(new x60("LOADING_STATE_ID", w60.CIRCLE_ASSET, null));
            case 1:
                Function0 it9 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return f0.f322471a;
            case 2:
                um0 it10 = (um0) obj2;
                int i = TrustedMerchantDetailsActivity.y0;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.TRUE;
            case 3:
                um0 it11 = (um0) obj2;
                int i2 = TrustedMerchantDetailsActivity.y0;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.FALSE;
            case 4:
                Data it12 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return (Unit) it12.getContent();
            case 5:
                Boolean it13 = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                it13.booleanValue();
                return it13;
            case 6:
                k3l.j it14 = (k3l.j) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf(it14 instanceof k3l.g);
            case 7:
                rlm.f Json = (rlm.f) obj2;
                bkl.a aVar = h0.f236816a;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                return Unit.f186387a;
            case 8:
                RevolutAccount account = (RevolutAccount) obj2;
                Intrinsics.checkNotNullParameter(account, "account");
                return Boolean.valueOf(((RevolutAccountImpl) account).getF106158b() == null);
            case 9:
                Function0 it15 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return iii.c.c(5);
            case 10:
                l71.d it16 = (l71.d) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.a();
            case 11:
                ec5.b it17 = (ec5.b) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.f124429a;
            case 12:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                List list = transactions;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it18 = list.iterator();
                while (it18.hasNext()) {
                    arrayList.add(new UnifiedTransaction.Standard((a3) it18.next()));
                }
                return arrayList;
            case 13:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return new pkg.g((List) pair.f186385a, (List) pair.f186386b);
            case 14:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new pkh.h((Clause) rVar.f314201a, (od0.i) rVar.f314202b, (List) rVar.f314203c);
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return null;
            case 16:
                vlc.e it19 = (vlc.e) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return vlc.g.c(it19);
            case 17:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "params");
                throw new NoWhenBranchMatchedException();
            case 18:
                List settings = (List) obj2;
                Intrinsics.checkNotNullParameter(settings, "settings");
                od0.h hVar = od0.i.Companion;
                Iterator it20 = settings.iterator();
                while (true) {
                    if (it20.hasNext()) {
                        Object next = it20.next();
                        if (((soa.b) next).f264801a == soa.c.TRADING_STOCKS_VOLATILITY) {
                            obj3 = next;
                        }
                    }
                }
                hVar.getClass();
                return od0.h.a(obj3);
            case 19:
                Function0 it21 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return null;
            case 20:
                ybl.h it22 = (ybl.h) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return Boolean.valueOf(it22.d(TradingAccountType.Gia.f105270a));
            case 21:
                hha.d dVar = (hha.d) obj2;
                Intrinsics.h(dVar);
                return Boolean.valueOf(s.j(dVar));
            case 22:
                List<hha.d> list2 = (List) obj2;
                Intrinsics.h(list2);
                for (hha.d dVar2 : list2) {
                    if (s.j(dVar2)) {
                        return dVar2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 23:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 24:
                do3.n it23 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return q.y(it23);
            case 25:
                return pmb.d.a((pmb.d) obj2, null, null, 0, 11);
            case 26:
                a3 it24 = (a3) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                return Boolean.valueOf(k71.k.P(it24));
            case 27:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 2);
                for (int i3 = 0; i3 < 2; i3++) {
                    arrayListP.add(nb0.b(pb0.Companion, j6.a.l(i3, "all-funds-loading-item-", "-list-id"), false, 0, false, 30));
                }
                return yp0.b.h(arrayListP, new gu("all-funds-loading-subheader-list-id", 0, 0, 30), null, 0, 126);
            case 28:
                List instruments = (List) obj2;
                Intrinsics.checkNotNullParameter(instruments, "instruments");
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : instruments) {
                    nel.n nVar = (nel.n) obj4;
                    if (io3.h.l(nVar.f214597c) && nVar.f.d) {
                        arrayList2.add(obj4);
                    }
                }
                return arrayList2;
            default:
                CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) obj2;
                KProperty[] kPropertyArr = EsimMobilePlanSummaryScreen.T;
                Intrinsics.checkNotNullParameter(model, "model");
                Object obj5 = model.f51787l;
                if (obj5 instanceof EsimMobilePlanSummaryScreenContract$ContractStatementData) {
                    return (EsimMobilePlanSummaryScreenContract$ContractStatementData) obj5;
                }
                return null;
        }
    }

    public /* synthetic */ n(Object obj2, int i) {
        this.f236718a = i;
    }
}
