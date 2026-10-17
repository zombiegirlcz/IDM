package o55;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class e0 extends kotlin.jvm.internal.q implements Function1 {
    public static final e0 f = new e0();

    public e0() {
        super(1, f55.a.class, "toDomain", "toDomain(Ljava/util/Map;)Ljava/util/Map;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Map p0 = (Map) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return f55.a.a(p0);
    }
}
