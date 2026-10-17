package f28;

import java.util.Optional;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f131481a = new s();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        Optional optional = (Optional) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (optional == null) {
            return error;
        }
        return null;
    }
}
