package ajm;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class y extends t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5623g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Method method, int i) {
        super(method, false, 6);
        this.f5623g = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(method, "method");
                super(method, true, 4);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(method, "method");
                super(method, false, 6);
                break;
            default:
                Intrinsics.checkNotNullParameter(method, "method");
                break;
        }
    }

    @Override // ajm.t, ajm.i
    public final Object call(Object[] args) {
        switch (this.f5623g) {
            case 0:
                Intrinsics.checkNotNullParameter(args, "args");
                a(args);
                return f(args[0], args.length <= 1 ? new Object[0] : zhm.p.n(1, args.length, args));
            case 1:
                Intrinsics.checkNotNullParameter(args, "args");
                a(args);
                e(kotlin.collections.d.P(args));
                return f(null, args.length <= 1 ? new Object[0] : zhm.p.n(1, args.length, args));
            default:
                Intrinsics.checkNotNullParameter(args, "args");
                a(args);
                return f(null, args);
        }
    }
}
