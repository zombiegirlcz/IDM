package nn8;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f217482a = new d();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        xc8.g gVar = (xc8.g) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (gVar == null) {
            return error;
        }
        return null;
    }
}
