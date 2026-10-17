package aa0;

import com.revolut.feature.backend_flow.domain.models.CountrySelectionItem;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        CountrySelectionItem targetItem = (CountrySelectionItem) inputItem;
        String updatedValue = (String) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        wi0.b.Companion.getClass();
        wi0.b bVarA = wi0.a.a(updatedValue);
        String id10 = targetItem.f63368a;
        String str = targetItem.f63369b;
        String searchHint = targetItem.f63370c;
        List countries = targetItem.d;
        boolean z = targetItem.f;
        xl2.n style = targetItem.f63371g;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intrinsics.checkNotNullParameter(style, "style");
        return new CountrySelectionItem(id10, str, searchHint, countries, bVarA, z, style);
    }
}
