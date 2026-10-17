package vge;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t0 implements s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f289005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f289006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u3 f289007c;

    public t0(wsg.n walletInteractor, ppk.f ratesInteractor, u3 productDataSourcesMediator) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(productDataSourcesMediator, "productDataSourcesMediator");
        this.f289005a = walletInteractor;
        this.f289006b = ratesInteractor;
        this.f289007c = productDataSourcesMediator;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    public static final ArrayList a(t0 t0Var, List list, r0 r0Var) {
        t0Var.getClass();
        List<ohe.a> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (ohe.a aVarA : list2) {
            if (r0Var.f288988b.containsKey(aVarA.f225352b.getF89504c())) {
                aVarA = ohe.a.a(aVarA, c(aVarA.f225352b, r0Var.f288987a, r0Var.f288989c), 5);
            }
            arrayList.add(aVarA);
        }
        return arrayList;
    }

    public static final LinkedHashMap b(t0 t0Var, ArrayList arrayList) {
        boolean zB;
        t0Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            Pair pair = (Pair) it8.next();
            ProductAccount productAccount = (ProductAccount) pair.f186385a;
            ProductId productId = (ProductId) pair.f186386b;
            if (productAccount instanceof ProductAccount.ValueItem) {
                ProductAccount.ValueItem valueItem = (ProductAccount.ValueItem) productAccount;
                if (valueItem.getD() instanceof ProductAccountValue.Balance) {
                    ProductAccountValue d = valueItem.getD();
                    Intrinsics.i(d, "null cannot be cast to non-null type com.revolut.feature.tab.accounts.api.model.ProductAccountValue.Balance");
                    ProductAccountValue.Balance balance = (ProductAccountValue.Balance) d;
                    dj0.d dVar = balance.f89532b;
                    if (balance.f89533c == null && !dVar.k()) {
                        u3 u3Var = t0Var.f289007c;
                        u3Var.getClass();
                        Intrinsics.checkNotNullParameter(productId, "productId");
                        if (productId == ProductId.FAVORITE) {
                            zB = true;
                        } else {
                            g1 g1Var = (g1) u3Var.f289033a;
                            g1Var.getClass();
                            Intrinsics.checkNotNullParameter(productId, "productId");
                            zB = g1Var.b(productId).b();
                        }
                        if (zB) {
                            linkedHashMap.put(valueItem.getF89504c(), dVar.f115083b);
                        }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static ProductAccount c(ProductAccount productAccount, xi0.b bVar, Map map) {
        if (productAccount instanceof ProductAccount.ValueItem.Main) {
            ProductAccount.ValueItem.Main main = (ProductAccount.ValueItem.Main) productAccount;
            ProductAccountValue productAccountValue = main.d;
            if (productAccountValue instanceof ProductAccountValue.Balance) {
                ProductAccountValue.Balance balance = (ProductAccountValue.Balance) productAccountValue;
                dj0.d money = balance.f89532b;
                n9l.a aVar = (n9l.a) map.get(money.f115083b);
                dj0.d dVar = aVar != null ? new dj0.d(pyd.c.J(money, aVar.f213663c, aVar.f213662b), bVar) : null;
                if (dVar == null) {
                    return main;
                }
                MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                ProductAccountValue.ProductAccountIcon productAccountIcon = balance.d;
                Intrinsics.checkNotNullParameter(money, "money");
                return ProductAccount.ValueItem.Main.T(main, new ProductAccountValue.Balance(money, moneyClause, productAccountIcon), null, null, null, 509);
            }
        }
        return productAccount;
    }
}
