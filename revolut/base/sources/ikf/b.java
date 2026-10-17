package ikf;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.x5;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f161943a = new b();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        x5 x5Var = (x5) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (x5Var == null) {
            return error;
        }
        return null;
    }
}
