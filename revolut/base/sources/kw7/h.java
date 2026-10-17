package kw7;

import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements iw7.b {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f190304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f190305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f190306c;

    public h(fk3.a configurationInteractor, e insuranceHomeLayoutInteractor, t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(insuranceHomeLayoutInteractor, "insuranceHomeLayoutInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f190304a = configurationInteractor;
        this.f190305b = insuranceHomeLayoutInteractor;
        this.f190306c = pricingPlanInteractor;
    }
}
