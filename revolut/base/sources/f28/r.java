package f28;

import java.util.Optional;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f131480a = new r();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Optional content = (Optional) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        q function = q.f131479a;
        Intrinsics.checkNotNullParameter(function, "function");
        Optional map = content.map(new m());
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return (Boolean) gj7.b.l(map, Boolean.FALSE);
    }
}
