package q97;

import com.revolut.feature.junior_core.models.configuration.JuniorPlanConfiguration;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class x0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0 f243819a = new x0();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Throwable error = (Throwable) obj2;
        JuniorPlanConfiguration juniorPlanConfiguration = (JuniorPlanConfiguration) obj3;
        Intrinsics.checkNotNullParameter(error, "error");
        if (juniorPlanConfiguration == null) {
            return error;
        }
        return null;
    }
}
