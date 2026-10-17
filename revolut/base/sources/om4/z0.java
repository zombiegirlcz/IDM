package om4;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class z0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f226764a = new z0();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List instalmentPlans = (List) obj2;
        Intrinsics.checkNotNullParameter(instalmentPlans, "instalmentPlans");
        return zhm.w.u(instalmentPlans);
    }
}
