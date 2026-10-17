package yoi;

import android.os.Build;
import cpi.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements phi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f315681a;

    public b(h featureToggleInteractorProvider, a kompotBridgeStorageApiDependencyHelper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractorProvider, "featureToggleInteractorProvider");
        Intrinsics.checkNotNullParameter(kompotBridgeStorageApiDependencyHelper, "kompotBridgeStorageApiDependencyHelper");
        String FINGERPRINT = Build.FINGERPRINT;
        Intrinsics.checkNotNullExpressionValue(FINGERPRINT, "FINGERPRINT");
        this.f315681a = FINGERPRINT;
    }

    public final String a() {
        return this.f315681a;
    }
}
