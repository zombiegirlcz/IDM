package aa0;

import com.revolut.feature.backend_flow.domain.models.DocumentItem;
import com.revolut.feature.backend_flow.domain.models.InputItem;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends c {
    @Override // aa0.c
    public final InputItem a(InputItem inputItem, Object obj2) {
        DocumentItem targetItem = (DocumentItem) inputItem;
        Unit updatedValue = (Unit) obj2;
        Intrinsics.checkNotNullParameter(targetItem, "targetItem");
        Intrinsics.checkNotNullParameter(updatedValue, "updatedValue");
        String id10 = targetItem.f63393a;
        String title = targetItem.f63394b;
        String subtitle = targetItem.f63395c;
        boolean z = targetItem.e;
        String buttonTitle = targetItem.f;
        String url2 = targetItem.f63396g;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(url2, "url");
        return new DocumentItem(id10, title, subtitle, true, z, buttonTitle, url2);
    }
}
