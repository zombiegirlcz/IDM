package ajm;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class v extends t implements h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Method method) {
        super(method, false, 4);
        Intrinsics.checkNotNullParameter(method, "method");
    }

    @Override // ajm.t, ajm.i
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(args);
        return f(null, args);
    }
}
