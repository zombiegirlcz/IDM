package aa0;

import com.revolut.feature.backend_flow.domain.models.CurrencySelectionItem;
import com.revolut.feature.backend_flow.domain.models.CurrencySelectionOption;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        CurrencySelectionItem targetItem = (CurrencySelectionItem) inputItem;
        CurrencySelectionOption updatedValue = (CurrencySelectionOption) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        String id10 = targetItem.f63374a;
        String searchHint = targetItem.f63375b;
        List currencies = targetItem.f63376c;
        boolean z = targetItem.e;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        return new CurrencySelectionItem(id10, searchHint, currencies, updatedValue, z);
    }
}
