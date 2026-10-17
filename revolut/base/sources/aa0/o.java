package aa0;

import com.revolut.feature.backend_flow.domain.models.DropDownItem;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        DropDownItem targetItem = (DropDownItem) inputItem;
        String updatedValue = (String) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        String id10 = targetItem.f63397a;
        boolean z = targetItem.f63398b;
        String hint = targetItem.f63399c;
        String str = targetItem.d;
        List options = targetItem.e;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(options, "options");
        return new DropDownItem(id10, hint, options, str, updatedValue, z);
    }
}
