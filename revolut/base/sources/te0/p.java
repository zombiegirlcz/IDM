package te0;

import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p extends f {
    @Override // te0.f
    public final e a(Object obj2, String key) {
        Stack stack = (Stack) obj2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(stack, "default");
        return new o(key, stack);
    }

    @Override // te0.f
    public final e b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new o(key, new Stack());
    }
}
