package cul;

import java.util.Optional;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class z0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f109209a = new z0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        k4l.e0 orderLimits = (k4l.e0) obj2;
        Intrinsics.checkNotNullParameter(orderLimits, "orderLimits");
        return Optional.ofNullable(orderLimits.f180953a);
    }
}
