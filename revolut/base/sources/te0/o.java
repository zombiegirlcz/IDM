package te0;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class o extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String key, Stack stack) {
        super(key, stack);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(stack, "default");
    }

    @Override // te0.e
    public final Object d(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Serializable serializable = bundle.getSerializable(this.f270012c);
        Intrinsics.i(serializable, "null cannot be cast to non-null type java.util.ArrayList<T of com.revolut.core.data.state.BundleSerializableStackField>");
        Stack stack = new Stack();
        stack.addAll((ArrayList) serializable);
        return stack;
    }

    @Override // te0.e
    public final void e(Bundle bundle, Object obj2) {
        Stack value = (Stack) obj2;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        bundle.putSerializable(this.f270012c, new ArrayList(value));
    }
}
