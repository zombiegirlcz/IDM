package syk;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f266688a = new h();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        alc.n nVar = (alc.n) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (nVar == null) {
            return error;
        }
        return null;
    }
}
