package g27;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f139928a = new r();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List orders = (List) obj2;
        Intrinsics.checkNotNullParameter(orders, "orders");
        return new m(orders);
    }
}
