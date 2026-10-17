package klf;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1 f185610a = new y1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        pcd.q qVar = (pcd.q) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (qVar == null) {
            return error;
        }
        return null;
    }
}
