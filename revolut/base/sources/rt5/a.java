package rt5;

import android.os.Parcelable;
import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import com.revolut.feature.crypto_investments.models.SplitAccountsItemGroup;
import gv5.k;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public interface a {
    static SplitAccountsItemGroup a(k kVar, ArrayList items, st5.b itemsLimit, boolean z, CryptoInvestmentsSortingType sortingType, Parcelable parcelable) {
        f0 extraItems = f0.f322471a;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemsLimit, "itemsLimit");
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        Intrinsics.checkNotNullParameter(extraItems, "extraItems");
        ArrayList arrayListE0 = d0.E0(kVar.b(kVar.c(items, sortingType)), extraItems);
        return arrayListE0.isEmpty() ? SplitAccountsItemGroup.Empty.f71455a : new SplitAccountsItemGroup.ItemsGroup(arrayListE0, !z, itemsLimit.b(), parcelable);
    }
}
