package aa0;

import com.revolut.feature.backend_flow.domain.models.FiltersInputItem;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        FiltersInputItem targetItem = (FiltersInputItem) inputItem;
        FiltersInputItem.Option updatedValue = (FiltersInputItem.Option) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        Set setA = gc0.c.A(targetItem.f, updatedValue.f63465a);
        if (!targetItem.f63461c && setA.size() > 1) {
            setA = zhm.y0.b(updatedValue.f63465a);
        }
        Set selected = setA;
        String id10 = targetItem.f63459a;
        boolean z = targetItem.f63460b;
        boolean z3 = targetItem.f63461c;
        List list = targetItem.d;
        List items = targetItem.e;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(selected, "selected");
        return new FiltersInputItem(id10, z, z3, list, items, selected);
    }
}
