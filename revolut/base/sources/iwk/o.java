package iwk;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import zhm.t;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class o extends q implements Function1 {
    public static final o f = new o();

    public o() {
        super(1, t.class, "flatten", "flatten(Ljava/lang/Iterable;)Ljava/util/List;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List p0 = (List) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return w.u(p0);
    }
}
