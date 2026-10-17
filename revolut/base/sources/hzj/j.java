package hzj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class j {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f157212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f157213b;

    public j(e limitDetailsProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(limitDetailsProvider, "limitDetailsProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f157212a = limitDetailsProvider;
        this.f157213b = featureToggleInteractor;
    }
}
