package yhm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class o {
    public static final n a(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new n(exception);
    }

    public static final void b(Object obj2) {
        if (obj2 instanceof n) {
            throw ((n) obj2).f314194a;
        }
    }
}
