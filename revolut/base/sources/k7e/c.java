package k7e;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f182041a = new c();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        h6e.d dVar = (h6e.d) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (dVar == null) {
            return error;
        }
        return null;
    }
}
