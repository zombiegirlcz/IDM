package d6j;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f111563a = new i0();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        qta.f fVar = (qta.f) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (fVar == null) {
            return error;
        }
        return null;
    }
}
