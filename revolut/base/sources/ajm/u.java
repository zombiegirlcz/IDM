package ajm;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class u extends t implements h {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f5619g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Method method, Object obj2) {
        super(method, false, 4);
        Intrinsics.checkNotNullParameter(method, "method");
        this.f5619g = obj2;
    }

    @Override // ajm.t, ajm.i
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(args);
        return f(this.f5619g, args);
    }
}
