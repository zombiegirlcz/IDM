package com.onfido.android.sdk.capture.ui.camera.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.rxjava3.layout.WindowInfoTrackerRx;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.ui.camera.CaptureActivity;
import com.onfido.android.sdk.capture.ui.camera.ConfirmationStepButtons;
import com.onfido.android.sdk.capture.ui.camera.OverlayTextView;
import com.onfido.android.sdk.capture.ui.widget.WatermarkView;
import com.onfido.android.sdk.capture.utils.Visibility;
import com.onfido.android.sdk.capture.validation.OnfidoCaptureValidationBubble;
import com.onfido.api.client.data.DocSide;
import egm.b;
import igm.g;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001:\u00010B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u001bH\u0002J\b\u0010'\u001a\u00020\u001dH\u0007J\b\u0010(\u001a\u00020\u001dH\u0007J\b\u0010)\u001a\u00020\u001dH\u0007J\u0010\u0010*\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001bH\u0002J\u000e\u0010+\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\nJ\b\u0010-\u001a\u00020\u001dH\u0002J\b\u0010.\u001a\u00020\u001dH\u0002J\b\u0010/\u001a\u00020\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082.¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster;", "Landroidx/lifecycle/LifecycleObserver;", "captureActivity", "Lcom/onfido/android/sdk/capture/ui/camera/CaptureActivity;", "captureType", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "docSide", "Lcom/onfido/api/client/data/DocSide;", "(Lcom/onfido/android/sdk/capture/ui/camera/CaptureActivity;Lcom/onfido/android/sdk/capture/ui/CaptureType;Lcom/onfido/api/client/data/DocSide;)V", "captureButton", "Landroid/view/View;", "confirmationStepButtons", "Lcom/onfido/android/sdk/capture/ui/camera/ConfirmationStepButtons;", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "documentVideoRecordingView", "dummyAccessibilityView", "flipArrow", "Landroid/widget/ImageView;", "overlayTextContainer", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayTextView;", "postCaptureValidationBubble", "Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble;", "watermarkView", "Lcom/onfido/android/sdk/capture/ui/widget/WatermarkView;", "windowLayoutObservable", "Lio/reactivex/rxjava3/core/Observable;", "Landroidx/window/layout/WindowLayoutInfo;", "adjustFlipArrowVisibility", "", "state", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State;", "adjustLayoutParams", "isOnConfirmationStep", "", "adjustTextOverlayVisibility", "applyState", "isWindowSpannedAcrossDisplays", "updatedWindow", "onCreate", "onDestroy", "onStop", "onUpdatedWindow", "setCaptureInstructionsAboveView", "view", "setCaptureInstructionsBelowCaptureRect", "setCaptureInstructionsFreeToOverlayCaptureRect", "subscribeToWindowLayoutChange", "State", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CaptureActivityLayoutAdjuster implements LifecycleObserver {

    @NotNull
    private final CaptureActivity captureActivity;
    private View captureButton;

    @NotNull
    private final CaptureType captureType;
    private ConfirmationStepButtons confirmationStepButtons;
    private Disposable disposable;

    @NotNull
    private final DocSide docSide;
    private View documentVideoRecordingView;
    private View dummyAccessibilityView;
    private ImageView flipArrow;
    private OverlayTextView overlayTextContainer;
    private OnfidoCaptureValidationBubble postCaptureValidationBubble;
    private WatermarkView watermarkView;
    private Observable windowLayoutObservable;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State;", "", "()V", "Confirmation", "LiveCapture", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State$Confirmation;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State$LiveCapture;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State$Confirmation;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State;", "()V", "DocumentConfirmation", "FaceConfirmation", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State$Confirmation$DocumentConfirmation;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State$Confirmation$FaceConfirmation;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class Confirmation extends State {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State$Confirmation$DocumentConfirmation;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State$Confirmation;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class DocumentConfirmation extends Confirmation {

                @NotNull
                public static final DocumentConfirmation INSTANCE = new DocumentConfirmation();

                private DocumentConfirmation() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State$Confirmation$FaceConfirmation;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State$Confirmation;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class FaceConfirmation extends Confirmation {

                @NotNull
                public static final FaceConfirmation INSTANCE = new FaceConfirmation();

                private FaceConfirmation() {
                    super(null);
                }
            }

            private Confirmation() {
                super(null);
            }

            public /* synthetic */ Confirmation(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State$LiveCapture;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State;", "()V", "DocumentLiveCapture", "FaceLiveCapture", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State$LiveCapture$DocumentLiveCapture;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State$LiveCapture$FaceLiveCapture;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class LiveCapture extends State {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State$LiveCapture$DocumentLiveCapture;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State$LiveCapture;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class DocumentLiveCapture extends LiveCapture {

                @NotNull
                public static final DocumentLiveCapture INSTANCE = new DocumentLiveCapture();

                private DocumentLiveCapture() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State$LiveCapture$FaceLiveCapture;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureActivityLayoutAdjuster$State$LiveCapture;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class FaceLiveCapture extends LiveCapture {

                @NotNull
                public static final FaceLiveCapture INSTANCE = new FaceLiveCapture();

                private FaceLiveCapture() {
                    super(null);
                }
            }

            private LiveCapture() {
                super(null);
            }

            public /* synthetic */ LiveCapture(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private State() {
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CaptureActivityLayoutAdjuster(@NotNull CaptureActivity captureActivity, @NotNull CaptureType captureType, @NotNull DocSide docSide) {
        Intrinsics.checkNotNullParameter(captureActivity, "captureActivity");
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(docSide, "docSide");
        this.captureActivity = captureActivity;
        this.captureType = captureType;
        this.docSide = docSide;
    }

    private final void adjustFlipArrowVisibility(State state) {
        ImageView imageView = this.flipArrow;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(((state instanceof State.LiveCapture.DocumentLiveCapture) && this.docSide == DocSide.BACK) ? 0 : 8);
    }

    private final void adjustTextOverlayVisibility(State state) {
        boolean z;
        OnfidoCaptureValidationBubble onfidoCaptureValidationBubble;
        OnfidoCaptureValidationBubble onfidoCaptureValidationBubble2;
        OverlayTextView overlayTextView;
        Visibility visibility = ((!(state instanceof State.LiveCapture) || this.captureType == CaptureType.VIDEO) && (!((z = state instanceof State.Confirmation)) || (onfidoCaptureValidationBubble2 = this.postCaptureValidationBubble) == null || onfidoCaptureValidationBubble2.isVisible$onfido_capture_sdk_core_release())) ? (z && (onfidoCaptureValidationBubble = this.postCaptureValidationBubble) != null && onfidoCaptureValidationBubble.isVisible$onfido_capture_sdk_core_release() && this.captureType == CaptureType.FACE) ? Visibility.INVISIBLE : null : Visibility.VISIBLE;
        if (visibility == null || (overlayTextView = this.overlayTextContainer) == null) {
            return;
        }
        visibility.changeVisibility$onfido_capture_sdk_core_release(overlayTextView, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0062 A[PHI: r0 r1 r6
      0x0062: PHI (r0v14 android.widget.RelativeLayout$LayoutParams) = (r0v13 android.widget.RelativeLayout$LayoutParams), (r0v17 android.widget.RelativeLayout$LayoutParams) binds: [B:30:0x0060, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r1v4 android.view.View) = (r1v3 android.view.View), (r1v6 android.view.View) binds: [B:30:0x0060, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r6v10 com.onfido.android.sdk.capture.ui.camera.OverlayTextView) = 
      (r6v8 com.onfido.android.sdk.capture.ui.camera.OverlayTextView)
      (r6v12 com.onfido.android.sdk.capture.ui.camera.OverlayTextView)
     binds: [B:30:0x0060, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void applyState(com.onfido.android.sdk.capture.ui.camera.util.CaptureActivityLayoutAdjuster.State r6) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.util.CaptureActivityLayoutAdjuster.applyState(com.onfido.android.sdk.capture.ui.camera.util.CaptureActivityLayoutAdjuster$State):void");
    }

    private final boolean isWindowSpannedAcrossDisplays(WindowLayoutInfo updatedWindow) {
        return !updatedWindow.getDisplayFeatures().isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdatedWindow(WindowLayoutInfo updatedWindow) {
        if (isWindowSpannedAcrossDisplays(updatedWindow) && this.captureType == CaptureType.VIDEO) {
            setCaptureInstructionsFreeToOverlayCaptureRect();
        } else {
            setCaptureInstructionsBelowCaptureRect();
        }
    }

    private final void setCaptureInstructionsBelowCaptureRect() {
        OverlayTextView overlayTextView = this.overlayTextContainer;
        if (overlayTextView != null) {
            ViewGroup.LayoutParams layoutParams = overlayTextView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            ImageView imageView = this.flipArrow;
            if (imageView != null) {
                layoutParams2.addRule(3, imageView.getId());
            }
            overlayTextView.setLayoutParams(layoutParams2);
        }
    }

    private final void setCaptureInstructionsFreeToOverlayCaptureRect() {
        OverlayTextView overlayTextView = this.overlayTextContainer;
        if (overlayTextView != null) {
            ViewGroup.LayoutParams layoutParams = overlayTextView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (this.flipArrow != null) {
                layoutParams2.removeRule(3);
            }
            overlayTextView.setLayoutParams(layoutParams2);
        }
    }

    private final void subscribeToWindowLayoutChange() {
        this.windowLayoutObservable = WindowInfoTrackerRx.windowLayoutInfoObservable(WindowInfoTracker.INSTANCE.getOrCreate(this.captureActivity), (Activity) this.captureActivity);
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable observable = this.windowLayoutObservable;
        if (observable != null) {
            this.disposable = observable.observeOn(b.a()).subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.camera.util.CaptureActivityLayoutAdjuster.subscribeToWindowLayoutChange.1
                @Override // igm.g
                public final void accept(@NotNull WindowLayoutInfo p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    CaptureActivityLayoutAdjuster.this.onUpdatedWindow(p0);
                }
            });
        } else {
            Intrinsics.r("windowLayoutObservable");
            throw null;
        }
    }

    public final void adjustLayoutParams(boolean isOnConfirmationStep) {
        applyState((isOnConfirmationStep && this.captureType == CaptureType.DOCUMENT) ? State.Confirmation.DocumentConfirmation.INSTANCE : (isOnConfirmationStep || this.captureType != CaptureType.DOCUMENT) ? (!isOnConfirmationStep || this.captureType == CaptureType.DOCUMENT) ? State.LiveCapture.FaceLiveCapture.INSTANCE : State.Confirmation.FaceConfirmation.INSTANCE : State.LiveCapture.DocumentLiveCapture.INSTANCE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        subscribeToWindowLayoutChange();
        this.watermarkView = this.captureActivity.getBinding$onfido_capture_sdk_core_release().watermark;
        this.overlayTextContainer = this.captureActivity.getBinding$onfido_capture_sdk_core_release().overlayTextContainer;
        this.postCaptureValidationBubble = this.captureActivity.getBinding$onfido_capture_sdk_core_release().postCaptureValidationBubble;
        this.dummyAccessibilityView = this.captureActivity.findViewById(R.id.dummyAccessibility);
        this.confirmationStepButtons = this.captureActivity.getBinding$onfido_capture_sdk_core_release().confirmationButtons;
        this.captureButton = this.captureActivity.findViewById(R.id.captureButton);
        this.documentVideoRecordingView = this.captureActivity.getBinding$onfido_capture_sdk_core_release().videoRecordingContainer.getRoot();
        this.flipArrow = this.captureActivity.getBinding$onfido_capture_sdk_core_release().flipArrow;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.watermarkView = null;
        this.overlayTextContainer = null;
        this.postCaptureValidationBubble = null;
        this.captureButton = null;
        this.dummyAccessibilityView = null;
        this.confirmationStepButtons = null;
        this.documentVideoRecordingView = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public final void setCaptureInstructionsAboveView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OverlayTextView overlayTextView = this.overlayTextContainer;
        if (overlayTextView != null) {
            ViewGroup.LayoutParams layoutParams = overlayTextView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(2, view.getId());
            overlayTextView.setLayoutParams(layoutParams2);
        }
    }
}
