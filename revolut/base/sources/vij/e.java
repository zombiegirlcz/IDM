package vij;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f289607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.a f289608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f289609c;

    public e(l80.e dateProvider, com.revolut.retail.feature.esim.impl.ui.screens.checkout.mappers.a esimDynamicTermsMapper, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(esimDynamicTermsMapper, "esimDynamicTermsMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f289607a = dateProvider;
        this.f289608b = esimDynamicTermsMapper;
        this.f289609c = featureToggleInteractor;
    }
}
