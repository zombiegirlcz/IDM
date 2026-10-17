package com.fourthline.vision.internal;

import com.fourthline.core.DocumentType;
import com.fourthline.core.VideoRecording;
import com.fourthline.core.internal.TimestampProvider;
import com.fourthline.core.internal.Try;
import com.fourthline.core.location.Coordinate;
import com.fourthline.core.location.LocationProvider;
import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.vision.ScannerMetadata;
import com.fourthline.vision.document.DocumentScannerCallback;
import com.fourthline.vision.document.DocumentScannerConfig;
import com.fourthline.vision.document.DocumentScannerError;
import com.fourthline.vision.document.DocumentScannerResult;
import com.fourthline.vision.document.DocumentScannerStep;
import com.fourthline.vision.document.DocumentScannerStepError;
import com.fourthline.vision.document.DocumentScannerStepMetadata;
import com.fourthline.vision.document.DocumentScannerStepResult;
import com.fourthline.vision.document.DocumentScannerStepWarning;
import com.fourthline.vision.internal.r5;
import com.fourthline.vision.internal.ra;
import java.net.URI;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class h5 extends d {
    private final Function0 d;
    private final DocumentScannerCallback e;
    private final TimestampProvider f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final LocationProvider f36312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final qa f36313h;
    private final qa i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MrzInfo f36314j;
    private DocumentScannerStepResult k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List f36315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f36316m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(@NotNull Function0<DocumentScannerConfig> configFactory, @NotNull DocumentScannerCallback callback, @NotNull TimestampProvider timestampProvider, @NotNull LocationProvider locationProvider, @NotNull qa scannerErrorMapper, @NotNull qa stepErrorMapper, @NotNull ne analytics) {
        super(analytics);
        Intrinsics.checkNotNullParameter(configFactory, "configFactory");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(scannerErrorMapper, "scannerErrorMapper");
        Intrinsics.checkNotNullParameter(stepErrorMapper, "stepErrorMapper");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        this.d = configFactory;
        this.e = callback;
        this.f = timestampProvider;
        this.f36312g = locationProvider;
        this.f36313h = scannerErrorMapper;
        this.i = stepErrorMapper;
        this.f36315l = new ArrayList();
        this.f36316m = true;
    }

    private final DocumentScannerConfig getConfig() {
        return (DocumentScannerConfig) this.d.invoke();
    }

    private final void onFail(pa paVar) {
        if (getScannerLevelCallbacksAllowed()) {
            setScannerLevelCallbacksAllowed(false);
            this.e.onFail((DocumentScannerError) this.f36313h.convertError(paVar));
        }
    }

    private final void onStepFail(pa paVar) {
        DocumentScannerError documentScannerError;
        if (getScannerLevelCallbacksAllowed()) {
            try {
                documentScannerError = (DocumentScannerError) this.f36313h.convertError(paVar);
            } catch (IllegalArgumentException unused) {
                documentScannerError = null;
            }
            if (documentScannerError == DocumentScannerError.TIMEOUT) {
                this.e.onFail(documentScannerError);
                setScannerLevelCallbacksAllowed(false);
            } else {
                this.e.onStepFail((DocumentScannerStepError) this.i.convertError(paVar));
            }
            this.f36316m = false;
        }
    }

    private final void onStepSuccess(ud udVar) {
        DocumentScannerStep documentScannerStep;
        if (udVar instanceof r5) {
            if (udVar instanceof r5.b) {
                this.f36314j = ((r5.b) udVar).getMrz();
            }
            if (!getScannerLevelCallbacksAllowed() || (documentScannerStep = (DocumentScannerStep) getCurrentStep()) == null) {
                return;
            }
            DocumentScannerStepResult documentScannerStepResult = new DocumentScannerStepResult(udVar.getImage(), new DocumentScannerStepMetadata(this.f.getCurrentTime(), this.f36312g.getLocation(), documentScannerStep.getFileSide(), documentScannerStep.isAngled()), ((r5) udVar).getValidationErrors());
            this.k = documentScannerStepResult;
            this.e.onStepSuccess(documentScannerStepResult);
        }
    }

    private final void onSuccess(ua uaVar) {
        if (getScannerLevelCallbacksAllowed()) {
            setScannerLevelCallbacksAllowed(false);
            MrzInfo mrzInfo = this.f36314j;
            URI videoUrl = uaVar.getVideoUrl();
            Coordinate coordinate = null;
            VideoRecording videoRecording = videoUrl != null ? new VideoRecording(videoUrl, getConfig().getVideoDuration(), this.f36312g.getLocation()) : null;
            List list = this.f36315l;
            DocumentType type = getConfig().getType();
            Date currentTime = this.f.getCurrentTime();
            Iterator it8 = this.f36315l.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Coordinate location = uaVar.getMetadata().getLocation();
                if (location != null) {
                    coordinate = location;
                    break;
                }
            }
            this.e.onSuccess(new DocumentScannerResult(videoRecording, mrzInfo, type, list, new ScannerMetadata(currentTime, coordinate, uaVar.getMetadata().getMotionData())));
        }
    }

    private final void onWarnings(List<? extends DocumentScannerStepWarning> list) {
        if (getScannerLevelCallbacksAllowed() && this.f36316m) {
            this.e.onWarnings(list);
        }
    }

    @Override // com.fourthline.vision.internal.d, com.fourthline.vision.internal.ka
    public void onMoveToNextStep() {
        super.onMoveToNextStep();
        DocumentScannerStepResult documentScannerStepResult = this.k;
        if (documentScannerStepResult != null) {
            this.f36315l.add(documentScannerStepResult);
        }
        this.k = null;
    }

    @Override // com.fourthline.vision.internal.d, com.fourthline.vision.internal.ka
    public void onScannerResult(@NotNull Try<ua> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (getScannerLevelCallbacksAllowed()) {
            super.onScannerResult(result);
            if (!(result instanceof Try.Failure)) {
                if (!(result instanceof Try.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                onSuccess((ua) ((Try.Success) result).getValue());
                return;
            }
            Throwable exception = ((Try.Failure) result).getException();
            if (exception instanceof ra.a) {
                onFail(((ra.a) exception).getError());
            } else if (exception instanceof ra.g) {
                List<Enum<?>> warnings = ((ra.g) exception).getWarnings();
                Intrinsics.i(warnings, "null cannot be cast to non-null type kotlin.collections.List<com.fourthline.vision.document.DocumentScannerStepWarning>");
                onWarnings(warnings);
            }
        }
    }

    @Override // com.fourthline.vision.internal.d, com.fourthline.vision.internal.ka
    public void onStart() {
        super.onStart();
        this.f36315l.clear();
    }

    @Override // com.fourthline.vision.internal.d, com.fourthline.vision.internal.ka
    public void onStepResult(@NotNull Try<? extends ud> result) throws Throwable {
        Intrinsics.checkNotNullParameter(result, "result");
        if (getScannerLevelCallbacksAllowed()) {
            super.onStepResult(result);
            if (!(result instanceof Try.Failure)) {
                if (!(result instanceof Try.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                onStepSuccess((ud) ((Try.Success) result).getValue());
                return;
            }
            Throwable exception = ((Try.Failure) result).getException();
            if (exception instanceof ra.a) {
                onStepFail(((ra.a) exception).getError());
            } else {
                if (!(exception instanceof ra.g)) {
                    throw exception;
                }
                List<Enum<?>> warnings = ((ra.g) exception).getWarnings();
                Intrinsics.i(warnings, "null cannot be cast to non-null type kotlin.collections.List<com.fourthline.vision.document.DocumentScannerStepWarning>");
                onWarnings(warnings);
            }
        }
    }

    @Override // com.fourthline.vision.internal.d, com.fourthline.vision.internal.ka
    public void onStepsSizeUpdate(int i) {
        if (getScannerLevelCallbacksAllowed()) {
            this.e.onStepsCountUpdate(i);
        }
    }

    @Override // com.fourthline.vision.internal.d, com.fourthline.vision.internal.ka
    public void reset() {
        super.reset();
        this.f36316m = true;
        setScannerLevelCallbacksAllowed(true);
        this.f36314j = null;
        this.k = null;
        this.f36315l.clear();
    }

    @Override // com.fourthline.vision.internal.d, com.fourthline.vision.internal.ka
    public void onResetCurrentStep(@NotNull DocumentScannerStep step) {
        Intrinsics.checkNotNullParameter(step, "step");
        super.onResetCurrentStep((Object) step);
        this.k = null;
        if (step.isAutoDetectAvailable()) {
            this.f36314j = null;
        }
    }

    @Override // com.fourthline.vision.internal.d, com.fourthline.vision.internal.ka
    public void onStepUpdate(@NotNull DocumentScannerStep step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.k = null;
        if (getScannerLevelCallbacksAllowed()) {
            super.onStepUpdate((Object) step);
            this.f36316m = true;
            this.e.onStepUpdate(step);
        }
    }
}
