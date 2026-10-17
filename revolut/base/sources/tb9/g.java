package tb9;

import com.revolut.feature.onboarding.impl.onboarding.selfie.OnboardingSelfieFlowContract$InputData;
import com.revolut.feature.onboarding.impl.onboarding.selfie.OnboardingSelfieFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zhm.f0;
import zr.l;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends h implements b {
    public final bs.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f269511p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final mw.a f269512q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ds.a f269513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mt8.d f269514s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final py.d f269515t;
    public final yki.a u;

    public g(OnboardingSelfieFlowContract$InputData inputData, bs.b biometricVerificationSelfieStepFlowProvider, l biometricVerificationMediaManager, mw.a cameraKitMediaCleaner, ds.a biometricVerificationDialogMapper, mt8.d kycInteractor, py.d cameraKitFlowStateHandler) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(biometricVerificationSelfieStepFlowProvider, "biometricVerificationSelfieStepFlowProvider");
        Intrinsics.checkNotNullParameter(biometricVerificationMediaManager, "biometricVerificationMediaManager");
        Intrinsics.checkNotNullParameter(cameraKitMediaCleaner, "cameraKitMediaCleaner");
        Intrinsics.checkNotNullParameter(biometricVerificationDialogMapper, "biometricVerificationDialogMapper");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(cameraKitFlowStateHandler, "cameraKitFlowStateHandler");
        this.o = biometricVerificationSelfieStepFlowProvider;
        this.f269511p = biometricVerificationMediaManager;
        this.f269512q = cameraKitMediaCleaner;
        this.f269513r = biometricVerificationDialogMapper;
        this.f269514s = kycInteractor;
        this.f269515t = cameraKitFlowStateHandler;
        this.u = cp5.d.a(this, new OnboardingSelfieFlowContract$Step(inputData.f78486a), f0.f322471a, new ta8.a(this, 4));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
