package urj;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f282333a = new j();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        xi0.b bVar = (xi0.b) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (bVar == null) {
            return error;
        }
        return null;
    }
}
