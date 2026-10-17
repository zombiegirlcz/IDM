package apd;

import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f8175a = new k();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        Set set = (Set) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (set == null) {
            return error;
        }
        return null;
    }
}
