package yhm;

import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class j {
    public static Lazy a(Object obj2, Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        return new q(initializer, obj2);
    }

    public static Lazy b(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        DefaultConstructorMarker defaultConstructorMarker = null;
        return new q(initializer, defaultConstructorMarker, 2, defaultConstructorMarker);
    }

    public static Lazy c(k mode, Function0 initializer) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        int i = i.f314192a[mode.ordinal()];
        int i2 = 2;
        if (i == 1) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new q(initializer, defaultConstructorMarker, i2, defaultConstructorMarker);
        }
        if (i == 2) {
            Intrinsics.checkNotNullParameter(initializer, "initializer");
            p pVar = new p();
            pVar.f314196a = initializer;
            pVar._value = y.f314210a;
            return pVar;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        b0 b0Var = new b0();
        b0Var.f314183a = initializer;
        b0Var.f314184b = y.f314210a;
        return b0Var;
    }
}
