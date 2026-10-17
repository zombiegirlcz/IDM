package vy8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f293261a;

    public d(bs.a biometricVerificationFlowProvider, a revolutVisionModelExtension) {
        Intrinsics.checkNotNullParameter(biometricVerificationFlowProvider, "biometricVerificationFlowProvider");
        Intrinsics.checkNotNullParameter(revolutVisionModelExtension, "revolutVisionModelExtension");
        this.f293261a = revolutVisionModelExtension;
    }
}
