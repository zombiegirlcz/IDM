package nij;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cej.b f216263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f216264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f216265c;

    public f(cej.b mobilePlansFeatureAvailabilityInteractor, k dataPlansMapper, m mobilePlansMapper) {
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(dataPlansMapper, "dataPlansMapper");
        Intrinsics.checkNotNullParameter(mobilePlansMapper, "mobilePlansMapper");
        this.f216263a = mobilePlansFeatureAvailabilityInteractor;
        this.f216264b = dataPlansMapper;
        this.f216265c = mobilePlansMapper;
    }
}
