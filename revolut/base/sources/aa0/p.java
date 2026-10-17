package aa0;

import com.revolut.feature.backend_flow.domain.models.InputItem;
import com.revolut.feature.backend_flow.domain.models.YesNoInputItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        YesNoInputItem targetItem = (YesNoInputItem) inputItem;
        Boolean bool = (Boolean) obj2;
        bool.getClass();
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        String id10 = targetItem.f63726a;
        boolean z = targetItem.f63727b;
        String yesTitle = targetItem.f63728c;
        String noTitle = targetItem.d;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(yesTitle, "yesTitle");
        Intrinsics.checkNotNullParameter(noTitle, "noTitle");
        return new YesNoInputItem(id10, z, yesTitle, noTitle, bool);
    }
}
