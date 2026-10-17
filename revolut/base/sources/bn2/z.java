package bn2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class z implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f17053a = new z();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        String str = (String) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (str == null) {
            return error;
        }
        return null;
    }
}
