package x8h;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d0 extends kotlin.jvm.internal.q implements Function1 {
    public static final d0 f = new d0();

    public d0() {
        super(1, zhm.o0.class, "toMap", "toMap(Ljava/lang/Iterable;)Ljava/util/Map;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List p0 = (List) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return zhm.r0.t(p0);
    }
}
