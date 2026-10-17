package u3a;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final class v {
    public final ufm.n a(List items, String str, Function1 createItemsContent) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(createItemsContent, "createItemsContent");
        ufm.b bVar = new ufm.b(new ag.p(this, str, items, createItemsContent), 0);
        Intrinsics.checkNotNullExpressionValue(bVar, "create(...)");
        return o70.a.i(w.e0(bVar));
    }
}
