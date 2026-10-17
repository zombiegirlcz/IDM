package ajm;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class b0 extends c0 {
    @Override // ajm.i
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(args);
        Object obj2 = args[0];
        Object[] args2 = args.length <= 1 ? new Object[0] : zhm.p.n(1, args.length, args);
        Intrinsics.checkNotNullParameter(args2, "args");
        return this.f5598a.invoke(obj2, Arrays.copyOf(args2, args2.length));
    }
}
