package cpd;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f107933a = new d();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        jnd.d dVar = (jnd.d) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (dVar == null) {
            return error;
        }
        return null;
    }
}
