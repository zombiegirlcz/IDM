package fhj;

import dec.q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f135254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f135255b;

    public g(gte.a featureToggleInteractor, q paymentMethodsCommonMapper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(paymentMethodsCommonMapper, "paymentMethodsCommonMapper");
        this.f135254a = featureToggleInteractor;
        this.f135255b = paymentMethodsCommonMapper;
    }
}
