package com.fourthline.vision.internal;

import com.fourthline.core.VideoDuration;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.internal.Try;
import com.fourthline.core.internal.TryKt;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.vision.ScannerImage;
import com.fourthline.vision.ScannerMetadata;
import com.fourthline.vision.internal.ra;
import com.fourthline.vision.selfie.SelfieScannerCallback;
import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerResult;
import com.fourthline.vision.selfie.SelfieScannerStep;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import java.net.URI;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class nc extends d {
    private final SelfieScannerCallback d;
    private final qa e;
    private final LocationProvider f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36602g;

    public static final /* synthetic */ class a extends kotlin.jvm.internal.q implements Function1 {
        public a(Object obj2) {
            super(1, 0, nc.class, obj2, "onScannerException", "onScannerException(Ljava/lang/Throwable;)V");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((Throwable) obj2);
            return Unit.f186387a;
        }

        public final void invoke(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((nc) this.receiver).onScannerException(p0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(@NotNull SelfieScannerCallback callback, @NotNull qa errorMapper, @NotNull LocationProvider locationProvider, @NotNull ne analytics) {
        super(analytics);
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(errorMapper, "errorMapper");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.d = callback;
        this.e = errorMapper;
        this.f = locationProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScannerException(Throwable th10) {
        if (th10 instanceof ra.a) {
            onFail(((ra.a) th10).getError());
        } else if (th10 instanceof ra.g) {
            List<Enum<?>> warnings = ((ra.g) th10).getWarnings();
            Intrinsics.i(warnings, "null cannot be cast to non-null type kotlin.collections.List<com.fourthline.vision.selfie.SelfieScannerWarning>");
            onWarnings(warnings);
        }
    }

    public final void onFail(@NotNull pa error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (getScannerLevelCallbacksAllowed()) {
            setScannerLevelCallbacksAllowed(false);
            this.d.onFail((SelfieScannerError) this.e.convertError(error));
        }
    }

    @Override // com.fourthline.vision.internal.d, com.fourthline.vision.internal.ka
    public void onScannerResult(@NotNull Try<ua> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (getScannerLevelCallbacksAllowed()) {
            super.onScannerResult(result);
            if (result instanceof Try.Failure) {
                onScannerException(((Try.Failure) result).getException());
            } else {
                if (!(result instanceof Try.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                onSuccess((ua) ((Try.Success) result).getValue());
            }
        }
    }

    @Override // com.fourthline.vision.internal.d, com.fourthline.vision.internal.ka
    public void onStepResult(@NotNull Try<? extends ud> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (getScannerLevelCallbacksAllowed()) {
            super.onStepResult(result);
            TryKt.handleError(result, new a(this));
        }
    }

    @Override // com.fourthline.vision.internal.d, com.fourthline.vision.internal.ka
    public void onStepsSizeUpdate(int i) {
    }

    public final void onSuccess(@NotNull ua result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (getScannerLevelCallbacksAllowed()) {
            setScannerLevelCallbacksAllowed(false);
            ud udVar = (ud) zhm.d0.d0(result.getStepResults());
            if (udVar == null) {
                this.d.onFail(SelfieScannerError.UNKNOWN);
                return;
            }
            SelfieScannerCallback selfieScannerCallback = this.d;
            ScannerImage image = udVar.getImage();
            ScannerMetadata metadata = result.getMetadata();
            ScannerMetadata scannerMetadata = new ScannerMetadata(metadata.getTimestamp(), metadata.getLocation(), metadata.getMotionData());
            URI videoUrl = result.getVideoUrl();
            selfieScannerCallback.onSuccess(new SelfieScannerResult(image, scannerMetadata, videoUrl != null ? new VideoRecording(videoUrl, VideoDuration.DEFAULT.INSTANCE, this.f.getLocation()) : null, null, 8, null));
        }
    }

    public final void onWarnings(@NotNull List<? extends SelfieScannerWarning> warnings) {
        Intrinsics.checkNotNullParameter(warnings, "warnings");
        if (this.f36602g && getScannerLevelCallbacksAllowed()) {
            this.d.onWarnings(warnings);
        }
    }

    @Override // com.fourthline.vision.internal.d, com.fourthline.vision.internal.ka
    public void reset() {
        super.reset();
        this.f36602g = true;
    }

    @Override // com.fourthline.vision.internal.d, com.fourthline.vision.internal.ka
    public void onStepUpdate(@NotNull SelfieScannerStep step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f36602g = step == SelfieScannerStep.SELFIE;
        if (getScannerLevelCallbacksAllowed()) {
            super.onStepUpdate((Object) step);
            this.d.onStepUpdate(step);
        }
    }
}
