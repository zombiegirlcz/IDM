package d6j;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f111561a = new h0();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        y5j.b bVar = (y5j.b) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (bVar == null) {
            return error;
        }
        return null;
    }
}
