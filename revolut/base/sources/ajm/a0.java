package ajm;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class a0 extends c0 implements h {
    public final Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Method unboxMethod, Object obj2) {
        super(unboxMethod, zhm.f0.f322471a);
        Intrinsics.checkNotNullParameter(unboxMethod, "unboxMethod");
        this.d = obj2;
    }

    @Override // ajm.i
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        a(args);
        Intrinsics.checkNotNullParameter(args, "args");
        return this.f5598a.invoke(this.d, Arrays.copyOf(args, args.length));
    }
}
