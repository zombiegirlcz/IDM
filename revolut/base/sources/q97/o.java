package q97;

import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f243753a = new o();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        List list = (List) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (list == null) {
            return error;
        }
        return null;
    }
}
