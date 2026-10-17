package com.fourthline.vision.selfie.compose;

import com.fourthline.vision.selfie.SelfieScannerError;
import com.fourthline.vision.selfie.SelfieScannerResult;
import com.fourthline.vision.selfie.SelfieScannerStep;
import com.fourthline.vision.selfie.SelfieScannerWarning;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent;", "", "OnFail", "OnSuccess", "OnWarnings", "OnStepUpdate", "Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent$OnFail;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent$OnStepUpdate;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent$OnSuccess;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent$OnWarnings;", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SelfieScannerEvent {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent$OnFail;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent;", "Lcom/fourthline/vision/selfie/SelfieScannerError;", "error", "<init>", "(Lcom/fourthline/vision/selfie/SelfieScannerError;)V", "component1", "()Lcom/fourthline/vision/selfie/SelfieScannerError;", "copy", "(Lcom/fourthline/vision/selfie/SelfieScannerError;)Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent$OnFail;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/vision/selfie/SelfieScannerError;", "getError", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnFail implements SelfieScannerEvent {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final SelfieScannerError error;

        public OnFail(@NotNull SelfieScannerError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public static /* synthetic */ OnFail copy$default(OnFail onFail, SelfieScannerError selfieScannerError, int i, Object obj2) {
            if ((i & 1) != 0) {
                selfieScannerError = onFail.error;
            }
            return onFail.copy(selfieScannerError);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SelfieScannerError getError() {
            return this.error;
        }

        @NotNull
        public final OnFail copy(@NotNull SelfieScannerError error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new OnFail(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnFail) && this.error == ((OnFail) other).error;
        }

        @NotNull
        public final SelfieScannerError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnFail(error=" + this.error + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent$OnStepUpdate;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent;", "Lcom/fourthline/vision/selfie/SelfieScannerStep;", "step", "<init>", "(Lcom/fourthline/vision/selfie/SelfieScannerStep;)V", "component1", "()Lcom/fourthline/vision/selfie/SelfieScannerStep;", "copy", "(Lcom/fourthline/vision/selfie/SelfieScannerStep;)Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent$OnStepUpdate;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/vision/selfie/SelfieScannerStep;", "getStep", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnStepUpdate implements SelfieScannerEvent {
        public static final int $stable = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final SelfieScannerStep step;

        public OnStepUpdate(@NotNull SelfieScannerStep step) {
            Intrinsics.checkNotNullParameter(step, "step");
            this.step = step;
        }

        public static /* synthetic */ OnStepUpdate copy$default(OnStepUpdate onStepUpdate, SelfieScannerStep selfieScannerStep, int i, Object obj2) {
            if ((i & 1) != 0) {
                selfieScannerStep = onStepUpdate.step;
            }
            return onStepUpdate.copy(selfieScannerStep);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SelfieScannerStep getStep() {
            return this.step;
        }

        @NotNull
        public final OnStepUpdate copy(@NotNull SelfieScannerStep step) {
            Intrinsics.checkNotNullParameter(step, "step");
            return new OnStepUpdate(step);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnStepUpdate) && this.step == ((OnStepUpdate) other).step;
        }

        @NotNull
        public final SelfieScannerStep getStep() {
            return this.step;
        }

        public int hashCode() {
            return this.step.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnStepUpdate(step=" + this.step + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent$OnSuccess;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent;", "Lcom/fourthline/vision/selfie/SelfieScannerResult;", "result", "<init>", "(Lcom/fourthline/vision/selfie/SelfieScannerResult;)V", "component1", "()Lcom/fourthline/vision/selfie/SelfieScannerResult;", "copy", "(Lcom/fourthline/vision/selfie/SelfieScannerResult;)Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent$OnSuccess;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/vision/selfie/SelfieScannerResult;", "getResult", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnSuccess implements SelfieScannerEvent {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final SelfieScannerResult result;

        public OnSuccess(@NotNull SelfieScannerResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
        }

        public static /* synthetic */ OnSuccess copy$default(OnSuccess onSuccess, SelfieScannerResult selfieScannerResult, int i, Object obj2) {
            if ((i & 1) != 0) {
                selfieScannerResult = onSuccess.result;
            }
            return onSuccess.copy(selfieScannerResult);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final SelfieScannerResult getResult() {
            return this.result;
        }

        @NotNull
        public final OnSuccess copy(@NotNull SelfieScannerResult result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new OnSuccess(result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnSuccess) && Intrinsics.f(this.result, ((OnSuccess) other).result);
        }

        @NotNull
        public final SelfieScannerResult getResult() {
            return this.result;
        }

        public int hashCode() {
            return this.result.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnSuccess(result=" + this.result + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent$OnWarnings;", "Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent;", "", "Lcom/fourthline/vision/selfie/SelfieScannerWarning;", "warnings", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/fourthline/vision/selfie/compose/SelfieScannerEvent$OnWarnings;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getWarnings", "fourthline-vision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OnWarnings implements SelfieScannerEvent {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final List warnings;

        public OnWarnings(@NotNull List<? extends SelfieScannerWarning> warnings) {
            Intrinsics.checkNotNullParameter(warnings, "warnings");
            this.warnings = warnings;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OnWarnings copy$default(OnWarnings onWarnings, List list, int i, Object obj2) {
            if ((i & 1) != 0) {
                list = onWarnings.warnings;
            }
            return onWarnings.copy(list);
        }

        @NotNull
        public final List<SelfieScannerWarning> component1() {
            return this.warnings;
        }

        @NotNull
        public final OnWarnings copy(@NotNull List<? extends SelfieScannerWarning> warnings) {
            Intrinsics.checkNotNullParameter(warnings, "warnings");
            return new OnWarnings(warnings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnWarnings) && Intrinsics.f(this.warnings, ((OnWarnings) other).warnings);
        }

        @NotNull
        public final List<SelfieScannerWarning> getWarnings() {
            return this.warnings;
        }

        public int hashCode() {
            return this.warnings.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnWarnings(warnings=" + this.warnings + ")";
        }
    }
}
