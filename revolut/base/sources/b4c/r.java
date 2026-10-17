package b4c;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f12276a = new r();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List products = (List) obj2;
        Intrinsics.checkNotNullParameter(products, "products");
        return d0.P0(products, new q());
    }
}
