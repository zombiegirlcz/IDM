package aa0;

import com.revolut.feature.backend_flow.domain.models.ChooserItem;
import com.revolut.feature.backend_flow.domain.models.ChooserOption;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        Object next;
        ChooserItem targetItem = (ChooserItem) inputItem;
        String updatedValue = (String) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        Iterator it8 = targetItem.e.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((ChooserOption) next).f63366a, updatedValue)) {
                break;
            }
        }
        if (((ChooserOption) next) == null) {
            throw new IllegalStateException(j6.a.q("Unknown optionId: ", updatedValue));
        }
        String id10 = targetItem.f63362a;
        String hint = targetItem.f63363b;
        String searchHint = targetItem.f63364c;
        String searchTitle = targetItem.d;
        List options = targetItem.e;
        boolean z = targetItem.f63365g;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(searchHint, "searchHint");
        Intrinsics.checkNotNullParameter(searchTitle, "searchTitle");
        Intrinsics.checkNotNullParameter(options, "options");
        return new ChooserItem(id10, hint, options, searchHint, searchTitle, updatedValue, z);
    }
}
