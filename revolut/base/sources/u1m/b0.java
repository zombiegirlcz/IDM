package u1m;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b0 {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.trustdockekyc.core.backend.domain.model.d f276451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f276452c;
    public final q d;
    public final n2m.i e;

    public b0(String verificationId, com.trustdockekyc.core.backend.domain.model.d selectedPackage, e0 coreUseCaseContainer, q params, n2m.i activityLauncher) {
        Intrinsics.checkNotNullParameter(verificationId, "verificationId");
        Intrinsics.checkNotNullParameter(selectedPackage, "selectedPackage");
        Intrinsics.checkNotNullParameter(coreUseCaseContainer, "coreUseCaseContainer");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(activityLauncher, "activityLauncher");
        this.f276450a = verificationId;
        this.f276451b = selectedPackage;
        this.f276452c = coreUseCaseContainer;
        this.d = params;
        this.e = activityLauncher;
    }
}
