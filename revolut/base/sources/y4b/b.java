package y4b;

import cli.j;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.api.models.birth_place.BirthCity;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.travel.flights.api.R$string;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import efl.d;
import ij8.h;
import ip0.co;
import ip0.gu;
import ip0.nb0;
import ip0.p10;
import ip0.pb0;
import ip0.s7;
import ip0.t10;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import jel.b0;
import jel.h1;
import jel.k2;
import jel.l;
import jel.m;
import jel.m1;
import jel.n;
import jel.w2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.t0;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import retrofit2.Response;
import w5b.j0;
import y4f.i;
import y4f.q;
import y58.e;
import y65.i;
import y66.s;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310856a;

    public /* synthetic */ b(int i) {
        this.f310856a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f310856a) {
            case 0:
                TradingAccount it8 = (TradingAccount) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (xi0.b) d0.b0(it8.e());
            case 1:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 2:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                IconSelectorDelegate.SelectableIconModel.INSTANCE.getClass();
                return u.c(new IconSelectorDelegate.Model("iconSelectorDelegate_displayCurrencySelector", u.c(IconSelectorDelegate.SelectableIconModel.Companion.b("CURRENCY_LIST_ID_loading")), null, null, null, 60));
            case 3:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(new co("homeScreenPreviewLoadingDelegate"));
            case 4:
                jel.c it9 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (it9 instanceof w2) {
                    return (w2) it9;
                }
                return null;
            case 5:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 6:
                i domainState = (i) obj2;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                return t1.t(domainState.f310905a, domainState.f310906b);
            case 7:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                d dVar = (d) pair.f186385a;
                del.c cVar = (del.c) pair.f186386b;
                return new y4f.a(cVar.f113711a, cVar.f113712b, cVar.f113713c, dVar.f125364a, cVar.d, dVar.f125365b);
            case 8:
                od0.i optionalTradingAccount = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(optionalTradingAccount, "optionalTradingAccount");
                TradingAccount tradingAccount = (TradingAccount) optionalTradingAccount.f224257a;
                if (tradingAccount != null) {
                    return com.revolut.shared.feature.wealth.models.trading_accounts.d.l(tradingAccount);
                }
                return null;
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar = new gu("LOADING_PREFIX_BANK_BALANCES_HEADER", 0, 0, 30);
                int i = 0;
                yp0.b.r(guVar, 0, 0, 0, 0, 15);
                int i2 = 0;
                List listK = v.k(new s7("LOADING_PREFIX_TOTAL_CASH_ITEM", 0, i, 0, i2, false, null, 126), new s7("LOADING_PREFIX_UNSETTLED_BUYS_ITEM", i, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0, false, null, 126), new s7("LOADING_PREFIX_AVAILABLE_TO_WITHDRAW_ITEM", 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, null, 126));
                int i3 = 0;
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                List listQ = i2b.a.q(guVar, listK);
                gu guVar2 = new gu("LOADING_PREFIX_BROKERAGE_HOLDINGS_HEADER", 0, 0, 30);
                int i5 = 0;
                yp0.b.r(guVar2, 0, 0, 0, 0, 15);
                List listP = i2b.a.p(listQ, guVar2);
                int i6 = 0;
                List listK2 = v.k(new s7("LOADING_PREFIX_NET_CREDITS_DEBTS_ITEM", 0, i5, i3, i6, 0 == true ? 1 : 0, null, 126), new s7("LOADING_PREFIX_SECURITIES_ITEM", i5, i3, i6, 0 == true ? 1 : 0, false, null, 126));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                List listO = i2b.a.o(listP, listK2);
                gu guVar3 = new gu("LOADING_PREFIX_ADDITIONAL_INFORMATION", 0, 0, 30);
                yp0.b.r(guVar3, 0, 0, 0, 0, 15);
                List listP2 = i2b.a.p(listO, guVar3);
                List listC = u.c(new s7("LOADING_PREFIX_ON_MARGIN_CALL_ITEM", 0, 0, i3, 0, false, null, 126));
                yp0.b.k(listC, 0, 0, 0, 0, 31);
                return i2b.a.o(i2b.a.o(listP2, listC), q.a());
            case 10:
                y4g.i update = (y4g.i) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return y4g.i.a(update, null, true, null, 7);
            case 11:
                return y4g.i.a((y4g.i) obj2, null, false, new TextLocalisedClause(R$string.travel_flights_checkout_error_generic_title, null, null, 14), 7);
            case 12:
                jel.c details = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(details, "details");
                if (details instanceof m) {
                    l lVar = ((m) details).f173502h;
                    if (lVar == null) {
                        return null;
                    }
                    if (lVar.f173493a != 1) {
                        lVar = null;
                    }
                    if (lVar != null) {
                        return lVar.f173494b;
                    }
                    return null;
                }
                if (details instanceof w2) {
                    k2 k2Var = ((w2) details).f173591l.f173584c;
                    if (k2Var != null) {
                        return k2Var.f173492a;
                    }
                    return null;
                }
                if ((details instanceof n) || (details instanceof jel.q) || (details instanceof b0) || (details instanceof m1) || (details instanceof h1)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 13:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                gu guVar4 = new gu("RATINGS_LOADING_RATINGS_TITLE", 0, 0, 30);
                IntRange intRangeO = f.o(0, 3);
                ArrayList arrayList = new ArrayList(w.t(intRangeO, 10));
                vim.f it10 = intRangeO.iterator();
                while (it10.f289625c) {
                    arrayList.add(new s7(a0.d.n("RATINGS_LOADING_RATINGS_ITEM_", it10.nextInt()), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                List listQ2 = i2b.a.q(guVar4, arrayList);
                t10 t10Var = new t10("RATINGS_LOADING_COMMENTARY_TITLE", p10.f165755a);
                yp0.b.l(t10Var, 0, 0, 0, 0, null, false, 63);
                return i2b.a.p(listQ2, t10Var);
            case 14:
                j it11 = (j) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11;
            case 15:
                y54.f updateState = (y54.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                BirthCity birthCity = updateState.f310983b;
                m70.a.c(t0.f186434a);
                return y54.f.a(updateState, BirthCity.a(birthCity, ""));
            case 16:
                do3.n it12 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return do3.q.y(it12);
            case 17:
                Map profilesMap = (Map) obj2;
                Intrinsics.checkNotNullParameter(profilesMap, "profilesMap");
                Collection collectionValues = profilesMap.values();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : collectionValues) {
                    if (((JuniorBankingProfile) obj3).f77104l == h.CREATED) {
                        arrayList2.add(obj3);
                    }
                }
                return d0.P0(arrayList2, new e());
            case 18:
                return Unit.f186387a;
            case 19:
                Object objBody = ((Response) obj2).body();
                if (objBody == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                j0 j0Var = (j0) objBody;
                Intrinsics.checkNotNullParameter(j0Var, "<this>");
                return new r5b.h(j0Var.f294882a, j0Var.f294883b);
            case 20:
                Intrinsics.checkNotNullParameter((Pair) obj2, "it");
                return null;
            case 21:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return null;
            case 22:
                Intrinsics.checkNotNullParameter((od0.i) obj2, "it");
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((Unit) obj2, "it");
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                List listC2 = u.c(nb0.a(pb0.Companion, "FLIGHTS_RECEIPTS_LOADING", false, 6));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                return listC2;
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB = u.b();
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                y65.q.a(eVarB, ref$IntRef, 2);
                y65.q.a(eVarB, ref$IntRef, 1);
                y65.q.a(eVarB, ref$IntRef, 2);
                y65.q.a(eVarB, ref$IntRef, 1);
                return new y65.j(i.a.f311163a, u.a(eVarB));
            case 26:
                y66.a update2 = (y66.a) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return y66.a.a(update2, new Data(null, null, true, 3, null), null, null, null, 14);
            case 27:
                y66.a update3 = (y66.a) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return y66.a.a(update3, null, null, null, null, 13);
            case 28:
                y66.a update4 = (y66.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return y66.a.a(update4, null, null, null, "", 7);
            default:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ArrayList arrayListA = s.a(10, "defi_balances_picker_loading_");
                yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
                return arrayListA;
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f310856a = i;
    }
}
