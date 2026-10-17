package om4;

import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f226688a = new s0();

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
