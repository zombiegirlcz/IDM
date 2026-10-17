package s57;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f260030a = new l();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        Boolean bool = (Boolean) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (bool == null) {
            return error;
        }
        return null;
    }
}
