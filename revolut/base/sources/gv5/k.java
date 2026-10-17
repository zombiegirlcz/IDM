package gv5;

import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements rt5.a {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public final ArrayList b(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = items.iterator();
        while (it8.hasNext()) {
            it5.d dVar = (it5.d) it8.next();
            SplitAccountsItemGroup.RowItem[] elements = {dVar.f168344a, dVar.f168346c};
            Intrinsics.checkNotNullParameter(elements, "elements");
            a0.x(kotlin.collections.d.L(elements), arrayList);
        }
        return arrayList;
    }

    public final List c(ArrayList items, CryptoInvestmentsSortingType sortingType) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        int i = l.f147069a[sortingType.getF71410a().ordinal()];
        if (i == 1) {
            if (sortingType instanceof CryptoInvestmentsSortingType.Alphabetical) {
                return d0.P0(items, new fad.i(new m(), 9));
            }
            if (sortingType instanceof CryptoInvestmentsSortingType.MarketCap) {
                return d0.P0(items, new q());
            }
            if (sortingType instanceof CryptoInvestmentsSortingType.Performance) {
                return d0.P0(items, new r());
            }
            if (sortingType instanceof CryptoInvestmentsSortingType.TotalValue) {
                return d0.P0(items, new fad.i(new fad.i(new n(), 10), 11));
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (sortingType instanceof CryptoInvestmentsSortingType.Alphabetical) {
            return d0.P0(items, new fad.i(new o(), 14));
        }
        if (sortingType instanceof CryptoInvestmentsSortingType.MarketCap) {
            return d0.P0(items, new s());
        }
        if (sortingType instanceof CryptoInvestmentsSortingType.Performance) {
            return d0.P0(items, new t());
        }
        if (sortingType instanceof CryptoInvestmentsSortingType.TotalValue) {
            return d0.P0(items, new fad.i(new fad.i(new p(), 12), 13));
        }
        throw new NoWhenBranchMatchedException();
    }
}
