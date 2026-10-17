package mkf;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class q0 {

    @NotNull
    public static final p0 Companion = new p0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f206264b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f206265a;

    static {
        x1[] elements = {x1.SEPA_DIRECT_DEBIT_CORE, x1.BACS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f206264b = kotlin.collections.d.y0(elements);
    }

    public q0(gte.a featureToggleInteractor, ulf.f accountsMapper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(accountsMapper, "accountsMapper");
        this.f206265a = featureToggleInteractor;
    }
}
