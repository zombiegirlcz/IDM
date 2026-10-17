package et6;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w0 extends kotlin.jvm.internal.q implements Function1 {
    public static final w0 f = new w0();

    public w0() {
        super(1, zhm.t.class, "isNotEmpty", "isNotEmpty(Ljava/util/Collection;)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List p0 = (List) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Boolean.valueOf(!p0.isEmpty());
    }
}
