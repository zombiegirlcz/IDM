package z8h;

import com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import r10.r;
import x8h.k;
import ybl.i;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements uzg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f320144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wzg.a f320145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f320146c;
    public final k d;
    public final ppk.f e;
    public final Map f;

    public g(r wealthMarginInteractor, wzg.a cashHoldingsInteractor, i productGroupAvailabilityInteractor, k displayCurrencyInteractor, ppk.f ratesInteractor, Map productsProviders, a availableToInvestForInstrumentBalanceResolver) {
        Intrinsics.checkNotNullParameter(wealthMarginInteractor, "wealthMarginInteractor");
        Intrinsics.checkNotNullParameter(cashHoldingsInteractor, "cashHoldingsInteractor");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(displayCurrencyInteractor, "displayCurrencyInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(productsProviders, "productsProviders");
        Intrinsics.checkNotNullParameter(availableToInvestForInstrumentBalanceResolver, "availableToInvestForInstrumentBalanceResolver");
        this.f320144a = wealthMarginInteractor;
        this.f320145b = cashHoldingsInteractor;
        this.f320146c = productGroupAvailabilityInteractor;
        this.d = displayCurrencyInteractor;
        this.e = ratesInteractor;
        this.f = productsProviders;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [dj0.d] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static dj0.d d(ArrayList arrayList, xi0.b bVar) throws Throwable {
        Object objA;
        dj0.d dVar = new dj0.d(0L, bVar);
        Iterator it8 = arrayList.iterator();
        ?? r06 = dVar;
        while (it8.hasNext()) {
            dj0.d dVar2 = (dj0.d) it8.next();
            try {
                m.Companion companion = m.INSTANCE;
                objA = pyd.c.O(r06, dVar2);
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            Throwable thA = m.a(objA);
            if (thA == null) {
                r06 = objA;
            } else {
                hx7.e.n(thA);
            }
            r06 = (dj0.d) r06;
        }
        return r06;
    }

    public final CombinedBuyingPowerConverted c(List list, dj0.d dVar, CombinedBuyingPowerConverted.MarginBorrowingLimit marginBorrowingLimit, xi0.b selectedCurrency, List list2) throws Throwable {
        dj0.d dVar2;
        List list3 = list;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = list3.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            kel.c cashHolding = (kel.c) it8.next();
            Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
            Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
            if (list2 == null) {
                Intrinsics.checkNotNullParameter(cashHolding, "<this>");
                dVar2 = Intrinsics.f(cashHolding.getCurrency(), selectedCurrency != null ? selectedCurrency.f306286a : null) ? cashHolding.f183155c : cashHolding.d;
            } else {
                dVar2 = list2.contains(yoj.b.f(cashHolding)) ? cashHolding.d : cashHolding.f183155c;
            }
            if (dVar2 != null) {
                arrayList.add(dVar2);
            }
        }
        dj0.d dVarD = d(arrayList, selectedCurrency);
        dj0.d f95665a = marginBorrowingLimit != null ? marginBorrowingLimit.getF95665a() : null;
        if (f95665a == null) {
            f95665a = new dj0.d(0L, selectedCurrency);
        }
        dj0.d dVarO = pyd.c.O(dVarD, f95665a);
        ArrayList arrayList2 = new ArrayList();
        Iterator it9 = list3.iterator();
        while (it9.hasNext()) {
            dj0.d dVar3 = ((kel.c) it9.next()).f183154b;
            if (dVar3 != null) {
                arrayList2.add(dVar3);
            }
        }
        dj0.d dVarD2 = d(arrayList2, selectedCurrency);
        if (dVar == null) {
            dVar = pyd.c.O(dVarD2, marginBorrowingLimit != null ? marginBorrowingLimit.getF95665a() : null);
        }
        return new CombinedBuyingPowerConverted(marginBorrowingLimit, list, new CombinedBuyingPowerConverted.Breakdown(dVarO, arrayList), dVarD2, dVar);
    }
}
