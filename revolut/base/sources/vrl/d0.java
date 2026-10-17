package vrl;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.feature.wealth.models.combined_buying_power.CombinedBuyingPowerConverted;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ppk.f f291621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f291622b;

    public d0(ppk.f ratesInteractor, o0 sourcePocketsSorter) {
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(sourcePocketsSorter, "sourcePocketsSorter");
        this.f291621a = ratesInteractor;
        this.f291622b = sourcePocketsSorter;
    }

    public static ArrayList a(List list, Map map, xi0.b bVar) {
        SourcePocket savings;
        SourcePocket investAccountCombinedBuyingPower;
        List<SourcePocket> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (SourcePocket sourcePocket : list2) {
            SourcePocket.Balance e = sourcePocket.getE();
            if (e != null) {
                if (!(e instanceof SourcePocket.Balance.MoneyBalance)) {
                    throw new NoWhenBranchMatchedException();
                }
                dj0.d dVarK = ((SourcePocket.Balance.MoneyBalance) e).f91775a;
                n9l.a aVar = (n9l.a) map.get(new Pair(dVarK.f115083b, bVar));
                if (!Intrinsics.f(dVarK.f115083b, bVar)) {
                    dVarK = aVar != null ? pyd.c.K(dVarK, aVar.f213663c, aVar.f213662b) : null;
                }
                dj0.d dVar = dVarK;
                if (sourcePocket instanceof SourcePocket.Holding) {
                    SourcePocket.Holding holding = (SourcePocket.Holding) sourcePocket;
                    kel.b cashHolding = holding.f91776a;
                    TradingAccount tradingAccount = holding.f91777b;
                    boolean z = holding.f91778c;
                    SourcePocket.Balance balance = holding.d;
                    l4l.a source = holding.f;
                    m4l.j jVar = holding.f91779g;
                    Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
                    Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
                    Intrinsics.checkNotNullParameter(balance, "balance");
                    Intrinsics.checkNotNullParameter(source, "source");
                    investAccountCombinedBuyingPower = new SourcePocket.Holding(cashHolding, tradingAccount, z, balance, dVar, source, jVar);
                } else if (sourcePocket instanceof SourcePocket.InvestAccountCombinedBuyingPower) {
                    SourcePocket.InvestAccountCombinedBuyingPower investAccountCombinedBuyingPower2 = (SourcePocket.InvestAccountCombinedBuyingPower) sourcePocket;
                    String id10 = investAccountCombinedBuyingPower2.f91780a;
                    TradingAccount tradingAccount2 = investAccountCombinedBuyingPower2.f91781b;
                    CombinedBuyingPowerConverted combinedBuyingPowerConverted = investAccountCombinedBuyingPower2.f91782c;
                    Clause name = investAccountCombinedBuyingPower2.d;
                    SourcePocket.Balance balance2 = investAccountCombinedBuyingPower2.e;
                    m4l.j jVar2 = investAccountCombinedBuyingPower2.f91783g;
                    xi0.b currency = investAccountCombinedBuyingPower2.f91784h;
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(tradingAccount2, "tradingAccount");
                    Intrinsics.checkNotNullParameter(combinedBuyingPowerConverted, "combinedBuyingPowerConverted");
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(balance2, "balance");
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    investAccountCombinedBuyingPower = new SourcePocket.InvestAccountCombinedBuyingPower(id10, tradingAccount2, combinedBuyingPowerConverted, name, balance2, dVar, jVar2, currency);
                } else {
                    if (sourcePocket instanceof SourcePocket.Pocket) {
                        SourcePocket.Pocket pocket = (SourcePocket.Pocket) sourcePocket;
                        io3.d pocket2 = pocket.f91785a;
                        l4l.a source2 = pocket.f91787c;
                        m4l.j jVar3 = pocket.d;
                        Intrinsics.checkNotNullParameter(pocket2, "pocket");
                        Intrinsics.checkNotNullParameter(source2, "source");
                        savings = new SourcePocket.Pocket(pocket2, dVar, source2, jVar3);
                    } else if (sourcePocket instanceof SourcePocket.VaultWrapper) {
                        SourcePocket.VaultWrapper vaultWrapper = (SourcePocket.VaultWrapper) sourcePocket;
                        pcd.s vault = vaultWrapper.f91791a;
                        l4l.a source3 = vaultWrapper.f91793c;
                        m4l.j jVar4 = vaultWrapper.d;
                        Intrinsics.checkNotNullParameter(vault, "vault");
                        Intrinsics.checkNotNullParameter(source3, "source");
                        savings = new SourcePocket.VaultWrapper(vault, dVar, source3, jVar4);
                    } else {
                        if (!(sourcePocket instanceof SourcePocket.Savings)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        SourcePocket.Savings savings2 = (SourcePocket.Savings) sourcePocket;
                        SavingsAccountDetails savingsAccountDetails = savings2.f91788a;
                        l4l.a source4 = savings2.f91790c;
                        m4l.j jVar5 = savings2.d;
                        Intrinsics.checkNotNullParameter(savingsAccountDetails, "savingsAccountDetails");
                        Intrinsics.checkNotNullParameter(source4, "source");
                        savings = new SourcePocket.Savings(savingsAccountDetails, dVar, source4, jVar5);
                    }
                    sourcePocket = savings;
                }
                sourcePocket = investAccountCombinedBuyingPower;
            }
            arrayList.add(sourcePocket);
        }
        return arrayList;
    }

    public final Flow b(List sourcePockets, xi0.b bVar, w4l.k loadingStrategy) {
        xi0.b bVar2;
        Intrinsics.checkNotNullParameter(sourcePockets, "sourcePockets");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        if (bVar == null) {
            return zi0.c.i(sourcePockets);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it8 = sourcePockets.iterator();
        while (it8.hasNext()) {
            SourcePocket.Balance e = ((SourcePocket) it8.next()).getE();
            Pair pair = null;
            if (e != null && (bVar2 = ((SourcePocket.Balance.MoneyBalance) e).f91775a.f115083b) != null) {
                if (bVar2.equals(bVar)) {
                    bVar2 = null;
                }
                if (bVar2 != null) {
                    pair = new Pair(bVar2, bVar);
                }
            }
            if (pair != null) {
                linkedHashSet.add(pair);
            }
        }
        List listD1 = zhm.d0.d1(linkedHashSet);
        return listD1.isEmpty() ? zi0.c.i(a(sourcePockets, zhm.r0.g(), bVar)) : nim.a.v(nim.a.v(rd0.e.b(this.f291621a.b(listD1, Intrinsics.f(loadingStrategy, w4l.i.f294643c))), new vq0.g(21)), new c9h.a(this, sourcePockets, bVar, 6));
    }

    public final ArrayList c(LinkedHashMap linkedHashMap, List list) {
        List<xdf.h> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (xdf.h hVar : list2) {
            List list3 = hVar.f304436c;
            ArrayList list4 = new ArrayList(zhm.w.t(list3, 10));
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                list4.add((SourcePocket) zhm.r0.h(((SourcePocket) it8.next()).getF91780a(), linkedHashMap));
            }
            Intrinsics.checkNotNullParameter(list4, "list");
            arrayList.add(xdf.h.a(hVar, zhm.d0.P0(list4, this.f291622b.f291667a)));
        }
        return arrayList;
    }
}
