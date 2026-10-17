package w9m;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class a extends q implements Function1 {
    public static final a f = new a(1, c.class, "<init>", "<init>(Landroidx/compose/foundation/lazy/LazyListItemInfo;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        LazyListItemInfo p0 = (LazyListItemInfo) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return new c(p0);
    }
}
