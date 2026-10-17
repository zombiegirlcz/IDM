package com.onfido.android.sdk.capture.ui.camera.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import androidx.window.rxjava3.layout.WindowInfoTrackerRx;
import com.onfido.android.sdk.capture.ui.CaptureType;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002&'B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\tJ\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J\u000e\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"J\b\u0010#\u001a\u00020\u0011H\u0002J\b\u0010$\u001a\u00020\u0011H\u0002J\b\u0010%\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082.¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "captureType", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "docSide", "Lcom/onfido/api/client/data/DocSide;", "viewHolder", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$ViewHolder;", "isAddressPageCapture", "", "(Lcom/onfido/android/sdk/capture/ui/CaptureType;Lcom/onfido/api/client/data/DocSide;Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$ViewHolder;Z)V", "disposable", "Lio/reactivex/rxjava3/disposables/Disposable;", "windowLayoutObservable", "Lio/reactivex/rxjava3/core/Observable;", "Landroidx/window/layout/WindowLayoutInfo;", "adjustFlipArrowVisibility", "", "state", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State;", "adjustLayoutParams", "isOnConfirmationStep", "adjustTextOverlayVisibility", "applyState", "isWindowSpannedAcrossDisplays", "updatedWindow", "onDestroy", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStart", "onStop", "onUpdatedWindow", "setCaptureInstructionsAboveView", "view", "Landroid/view/View;", "setCaptureInstructionsBelowCaptureRect", "setCaptureInstructionsFreeToOverlayCaptureRect", "subscribeToWindowLayoutChange", "State", "ViewHolder", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CaptureLayoutAdjuster implements DefaultLifecycleObserver {

    @NotNull
    private final CaptureType captureType;
    private Disposable disposable;

    @NotNull
    private final DocSide docSide;
    private final boolean isAddressPageCapture;

    @NotNull
    private final ViewHolder viewHolder;
    private Observable windowLayoutObservable;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State;", "", "()V", "Confirmation", "LiveCapture", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State$Confirmation;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State$LiveCapture;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class State {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State$Confirmation;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State;", "()V", "DocumentConfirmation", "FaceConfirmation", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State$Confirmation$DocumentConfirmation;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State$Confirmation$FaceConfirmation;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class Confirmation extends State {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State$Confirmation$DocumentConfirmation;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State$Confirmation;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class DocumentConfirmation extends Confirmation {

                @NotNull
                public static final DocumentConfirmation INSTANCE = new DocumentConfirmation();

                private DocumentConfirmation() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State$Confirmation$FaceConfirmation;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State$Confirmation;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State$LiveCapture;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State;", "()V", "DocumentLiveCapture", "FaceLiveCapture", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State$LiveCapture$DocumentLiveCapture;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State$LiveCapture$FaceLiveCapture;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class LiveCapture extends State {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State$LiveCapture$DocumentLiveCapture;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State$LiveCapture;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class DocumentLiveCapture extends LiveCapture {

                @NotNull
                public static final DocumentLiveCapture INSTANCE = new DocumentLiveCapture();

                private DocumentLiveCapture() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State$LiveCapture$FaceLiveCapture;", "Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$State$LiveCapture;", "()V", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0012J\u0006\u00103\u001a\u000204R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/util/CaptureLayoutAdjuster$ViewHolder;", "", "activity", "Landroid/app/Activity;", "overlayTextContainer", "Lcom/onfido/android/sdk/capture/ui/camera/OverlayTextView;", "postCaptureValidationBubble", "Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble;", "confirmationStepButtons", "Lcom/onfido/android/sdk/capture/ui/camera/ConfirmationStepButtons;", "dummyAccessibilityView", "Landroid/view/View;", "captureButton", "flipArrow", "Landroid/widget/ImageView;", "watermarkView", "Lcom/onfido/android/sdk/capture/ui/widget/WatermarkView;", "documentVideoRecordingView", "(Landroid/app/Activity;Lcom/onfido/android/sdk/capture/ui/camera/OverlayTextView;Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble;Lcom/onfido/android/sdk/capture/ui/camera/ConfirmationStepButtons;Landroid/view/View;Landroid/view/View;Landroid/widget/ImageView;Lcom/onfido/android/sdk/capture/ui/widget/WatermarkView;Landroid/view/View;)V", "getActivity$onfido_capture_sdk_core_release", "()Landroid/app/Activity;", "setActivity$onfido_capture_sdk_core_release", "(Landroid/app/Activity;)V", "getCaptureButton$onfido_capture_sdk_core_release", "()Landroid/view/View;", "setCaptureButton$onfido_capture_sdk_core_release", "(Landroid/view/View;)V", "getConfirmationStepButtons$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/camera/ConfirmationStepButtons;", "setConfirmationStepButtons$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/ConfirmationStepButtons;)V", "getDocumentVideoRecordingView$onfido_capture_sdk_core_release", "setDocumentVideoRecordingView$onfido_capture_sdk_core_release", "getDummyAccessibilityView$onfido_capture_sdk_core_release", "setDummyAccessibilityView$onfido_capture_sdk_core_release", "getFlipArrow$onfido_capture_sdk_core_release", "()Landroid/widget/ImageView;", "setFlipArrow$onfido_capture_sdk_core_release", "(Landroid/widget/ImageView;)V", "getOverlayTextContainer$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/camera/OverlayTextView;", "setOverlayTextContainer$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/camera/OverlayTextView;)V", "getPostCaptureValidationBubble$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble;", "setPostCaptureValidationBubble$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble;)V", "getWatermarkView$onfido_capture_sdk_core_release", "()Lcom/onfido/android/sdk/capture/ui/widget/WatermarkView;", "setWatermarkView$onfido_capture_sdk_core_release", "(Lcom/onfido/android/sdk/capture/ui/widget/WatermarkView;)V", "clear", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ViewHolder {
        private Activity activity;
        private View captureButton;
        private ConfirmationStepButtons confirmationStepButtons;
        private View documentVideoRecordingView;
        private View dummyAccessibilityView;
        private ImageView flipArrow;
        private OverlayTextView overlayTextContainer;
        private OnfidoCaptureValidationBubble postCaptureValidationBubble;
        private WatermarkView watermarkView;

        public ViewHolder(Activity activity, OverlayTextView overlayTextView, OnfidoCaptureValidationBubble onfidoCaptureValidationBubble, ConfirmationStepButtons confirmationStepButtons, View view, View view2, ImageView imageView, WatermarkView watermarkView, View view3) {
            this.activity = activity;
            this.overlayTextContainer = overlayTextView;
            this.postCaptureValidationBubble = onfidoCaptureValidationBubble;
            this.confirmationStepButtons = confirmationStepButtons;
            this.dummyAccessibilityView = view;
            this.captureButton = view2;
            this.flipArrow = imageView;
            this.watermarkView = watermarkView;
            this.documentVideoRecordingView = view3;
        }

        public final void clear() {
            this.activity = null;
            this.watermarkView = null;
            this.overlayTextContainer = null;
            this.postCaptureValidationBubble = null;
            this.confirmationStepButtons = null;
            this.dummyAccessibilityView = null;
            this.captureButton = null;
            this.documentVideoRecordingView = null;
            this.flipArrow = null;
        }

        /* JADX INFO: renamed from: getActivity$onfido_capture_sdk_core_release, reason: from getter */
        public final Activity getActivity() {
            return this.activity;
        }

        /* JADX INFO: renamed from: getCaptureButton$onfido_capture_sdk_core_release, reason: from getter */
        public final View getCaptureButton() {
            return this.captureButton;
        }

        /* JADX INFO: renamed from: getConfirmationStepButtons$onfido_capture_sdk_core_release, reason: from getter */
        public final ConfirmationStepButtons getConfirmationStepButtons() {
            return this.confirmationStepButtons;
        }

        /* JADX INFO: renamed from: getDocumentVideoRecordingView$onfido_capture_sdk_core_release, reason: from getter */
        public final View getDocumentVideoRecordingView() {
            return this.documentVideoRecordingView;
        }

        /* JADX INFO: renamed from: getDummyAccessibilityView$onfido_capture_sdk_core_release, reason: from getter */
        public final View getDummyAccessibilityView() {
            return this.dummyAccessibilityView;
        }

        /* JADX INFO: renamed from: getFlipArrow$onfido_capture_sdk_core_release, reason: from getter */
        public final ImageView getFlipArrow() {
            return this.flipArrow;
        }

        /* JADX INFO: renamed from: getOverlayTextContainer$onfido_capture_sdk_core_release, reason: from getter */
        public final OverlayTextView getOverlayTextContainer() {
            return this.overlayTextContainer;
        }

        /* JADX INFO: renamed from: getPostCaptureValidationBubble$onfido_capture_sdk_core_release, reason: from getter */
        public final OnfidoCaptureValidationBubble getPostCaptureValidationBubble() {
            return this.postCaptureValidationBubble;
        }

        /* JADX INFO: renamed from: getWatermarkView$onfido_capture_sdk_core_release, reason: from getter */
        public final WatermarkView getWatermarkView() {
            return this.watermarkView;
        }

        public final void setActivity$onfido_capture_sdk_core_release(Activity activity) {
            this.activity = activity;
        }

        public final void setCaptureButton$onfido_capture_sdk_core_release(View view) {
            this.captureButton = view;
        }

        public final void setConfirmationStepButtons$onfido_capture_sdk_core_release(ConfirmationStepButtons confirmationStepButtons) {
            this.confirmationStepButtons = confirmationStepButtons;
        }

        public final void setDocumentVideoRecordingView$onfido_capture_sdk_core_release(View view) {
            this.documentVideoRecordingView = view;
        }

        public final void setDummyAccessibilityView$onfido_capture_sdk_core_release(View view) {
            this.dummyAccessibilityView = view;
        }

        public final void setFlipArrow$onfido_capture_sdk_core_release(ImageView imageView) {
            this.flipArrow = imageView;
        }

        public final void setOverlayTextContainer$onfido_capture_sdk_core_release(OverlayTextView overlayTextView) {
            this.overlayTextContainer = overlayTextView;
        }

        public final void setPostCaptureValidationBubble$onfido_capture_sdk_core_release(OnfidoCaptureValidationBubble onfidoCaptureValidationBubble) {
            this.postCaptureValidationBubble = onfidoCaptureValidationBubble;
        }

        public final void setWatermarkView$onfido_capture_sdk_core_release(WatermarkView watermarkView) {
            this.watermarkView = watermarkView;
        }

        public /* synthetic */ ViewHolder(Activity activity, OverlayTextView overlayTextView, OnfidoCaptureValidationBubble onfidoCaptureValidationBubble, ConfirmationStepButtons confirmationStepButtons, View view, View view2, ImageView imageView, WatermarkView watermarkView, View view3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(activity, overlayTextView, onfidoCaptureValidationBubble, confirmationStepButtons, view, view2, imageView, (i & 128) != 0 ? null : watermarkView, (i & 256) != 0 ? null : view3);
        }
    }

    public CaptureLayoutAdjuster(@NotNull CaptureType captureType, @NotNull DocSide docSide, @NotNull ViewHolder viewHolder, boolean z) {
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        Intrinsics.checkNotNullParameter(docSide, "docSide");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.captureType = captureType;
        this.docSide = docSide;
        this.viewHolder = viewHolder;
        this.isAddressPageCapture = z;
    }

    private final void adjustFlipArrowVisibility(State state) {
        ImageView flipArrow = this.viewHolder.getFlipArrow();
        if (flipArrow == null) {
            return;
        }
        flipArrow.setVisibility(((state instanceof State.LiveCapture.DocumentLiveCapture) && this.docSide == DocSide.BACK && !this.isAddressPageCapture) ? 0 : 8);
    }

    private final void adjustTextOverlayVisibility(State state) {
        boolean z;
        OnfidoCaptureValidationBubble postCaptureValidationBubble;
        OnfidoCaptureValidationBubble postCaptureValidationBubble2;
        OverlayTextView overlayTextContainer;
        Visibility visibility = ((!(state instanceof State.LiveCapture) || this.captureType == CaptureType.VIDEO) && (!((z = state instanceof State.Confirmation)) || (postCaptureValidationBubble2 = this.viewHolder.getPostCaptureValidationBubble()) == null || postCaptureValidationBubble2.isVisible$onfido_capture_sdk_core_release())) ? (z && (postCaptureValidationBubble = this.viewHolder.getPostCaptureValidationBubble()) != null && postCaptureValidationBubble.isVisible$onfido_capture_sdk_core_release() && this.captureType == CaptureType.FACE) ? Visibility.INVISIBLE : null : Visibility.VISIBLE;
        if (visibility == null || (overlayTextContainer = this.viewHolder.getOverlayTextContainer()) == null) {
            return;
        }
        visibility.changeVisibility$onfido_capture_sdk_core_release(overlayTextContainer, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007a A[PHI: r0 r1 r6
      0x007a: PHI (r0v15 android.widget.RelativeLayout$LayoutParams) = (r0v14 android.widget.RelativeLayout$LayoutParams), (r0v18 android.widget.RelativeLayout$LayoutParams) binds: [B:30:0x0078, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x007a: PHI (r1v6 android.view.View) = (r1v5 android.view.View), (r1v9 android.view.View) binds: [B:30:0x0078, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x007a: PHI (r6v13 com.onfido.android.sdk.capture.ui.camera.OverlayTextView) = 
      (r6v11 com.onfido.android.sdk.capture.ui.camera.OverlayTextView)
      (r6v16 com.onfido.android.sdk.capture.ui.camera.OverlayTextView)
     binds: [B:30:0x0078, B:19:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void applyState(com.onfido.android.sdk.capture.ui.camera.util.CaptureLayoutAdjuster.State r6) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.camera.util.CaptureLayoutAdjuster.applyState(com.onfido.android.sdk.capture.ui.camera.util.CaptureLayoutAdjuster$State):void");
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
        OverlayTextView overlayTextContainer = this.viewHolder.getOverlayTextContainer();
        if (overlayTextContainer != null) {
            ViewGroup.LayoutParams layoutParams = overlayTextContainer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            ImageView flipArrow = this.viewHolder.getFlipArrow();
            if (flipArrow != null) {
                layoutParams2.addRule(3, flipArrow.getId());
            }
            overlayTextContainer.setLayoutParams(layoutParams2);
        }
    }

    private final void setCaptureInstructionsFreeToOverlayCaptureRect() {
        OverlayTextView overlayTextContainer = this.viewHolder.getOverlayTextContainer();
        if (overlayTextContainer != null) {
            ViewGroup.LayoutParams layoutParams = overlayTextContainer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (this.viewHolder.getFlipArrow() != null) {
                layoutParams2.removeRule(3);
            }
            overlayTextContainer.setLayoutParams(layoutParams2);
        }
    }

    private final void subscribeToWindowLayoutChange() {
        WindowInfoTracker.Companion companion = WindowInfoTracker.INSTANCE;
        Activity activity = this.viewHolder.getActivity();
        Intrinsics.h(activity);
        WindowInfoTracker orCreate = companion.getOrCreate(activity);
        Activity activity2 = this.viewHolder.getActivity();
        Intrinsics.h(activity2);
        this.windowLayoutObservable = WindowInfoTrackerRx.windowLayoutInfoObservable(orCreate, activity2);
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
        Observable observable = this.windowLayoutObservable;
        if (observable != null) {
            this.disposable = observable.observeOn(b.a()).subscribe(new g() { // from class: com.onfido.android.sdk.capture.ui.camera.util.CaptureLayoutAdjuster.subscribeToWindowLayoutChange.1
                @Override // igm.g
                public final void accept(@NotNull WindowLayoutInfo p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    CaptureLayoutAdjuster.this.onUpdatedWindow(p0);
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

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        this.viewHolder.clear();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        subscribeToWindowLayoutChange();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public final void setCaptureInstructionsAboveView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        OverlayTextView overlayTextContainer = this.viewHolder.getOverlayTextContainer();
        if (overlayTextContainer != null) {
            ViewGroup.LayoutParams layoutParams = overlayTextContainer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(2, view.getId());
            overlayTextContainer.setLayoutParams(layoutParams2);
        }
    }

    public /* synthetic */ CaptureLayoutAdjuster(CaptureType captureType, DocSide docSide, ViewHolder viewHolder, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(captureType, docSide, viewHolder, (i & 8) != 0 ? false : z);
    }
}
