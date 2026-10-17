package ghk;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f143992a = new w();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        yhm.r rVar = (yhm.r) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (rVar == null) {
            return error;
        }
        return null;
    }
}
