package sy;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public interface u extends cli.o {
    @Override // cli.o
    default cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof u)) {
            return null;
        }
        if (this instanceof s) {
            return new l(!(oldState instanceof s));
        }
        if (this instanceof t) {
            return new l(!(oldState instanceof t));
        }
        throw new NoWhenBranchMatchedException();
    }

    p f();
}
