package com.onfido.android.sdk.capture.ui.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.databinding.OnfidoConfirmationStepButtonsHorizontalBinding;
import com.onfido.android.sdk.capture.databinding.OnfidoConfirmationStepButtonsVerticalBinding;
import com.onfido.android.sdk.capture.ui.CaptureType;
import com.onfido.android.sdk.capture.ui.model.DocumentTypeUIModel;
import com.onfido.android.sdk.capture.ui.widget.OnfidoButton;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 E2\u00020\u0001:\u0002EFB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J\u0006\u0010%\u001a\u00020#J\u0018\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\nH\u0002J\u0006\u0010)\u001a\u00020#J\b\u0010*\u001a\u00020\u001dH\u0002J\b\u0010+\u001a\u00020#H\u0002J\b\u0010,\u001a\u00020#H\u0002J!\u0010-\u001a\u00020#2\b\b\u0001\u0010.\u001a\u00020\u00072\b\b\u0001\u0010/\u001a\u00020\u0007H\u0000¢\u0006\u0002\b0J\u001c\u00101\u001a\u00020#2\b\b\u0001\u0010.\u001a\u00020\u00072\b\b\u0001\u0010/\u001a\u00020\u0007H\u0002J$\u00102\u001a\u00020#2\b\b\u0001\u00103\u001a\u00020\u00072\b\b\u0001\u00104\u001a\u00020\u00072\b\b\u0002\u00105\u001a\u00020\u001dJ\"\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020\u001d2\b\b\u0001\u0010.\u001a\u00020\u00072\b\b\u0001\u0010/\u001a\u00020\u0007J3\u00108\u001a\u00020#2\u0006\u00107\u001a\u00020\u001d2\u0006\u00109\u001a\u00020:2\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010;J\u0006\u0010<\u001a\u00020#J\b\u0010=\u001a\u00020#H\u0002J\u0015\u0010>\u001a\u00020#2\u0006\u0010 \u001a\u00020!H\u0000¢\u0006\u0002\b?J\u000e\u0010@\u001a\u00020#2\u0006\u00107\u001a\u00020\u001dJ\u0018\u0010A\u001a\u00020#2\u0006\u0010B\u001a\u00020\u001d2\b\u0010C\u001a\u0004\u0018\u00010DR\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u00020\u0015X\u0086.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006G"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/ConfirmationStepButtons;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "buttonConfirmation", "Lcom/onfido/android/sdk/capture/ui/widget/OnfidoButton;", "buttonDiscard", "confirmButtonHeight", "discardButtonHeight", "documentCaptureBinding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoConfirmationStepButtonsVerticalBinding;", "getDocumentCaptureBinding", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoConfirmationStepButtonsVerticalBinding;", "setDocumentCaptureBinding", "(Lcom/onfido/android/sdk/capture/databinding/OnfidoConfirmationStepButtonsVerticalBinding;)V", "horizontalDocumentCaptureButtons", "Lcom/onfido/android/sdk/capture/databinding/OnfidoConfirmationStepButtonsHorizontalBinding;", "getHorizontalDocumentCaptureButtons$annotations", "()V", "getHorizontalDocumentCaptureButtons", "()Lcom/onfido/android/sdk/capture/databinding/OnfidoConfirmationStepButtonsHorizontalBinding;", "setHorizontalDocumentCaptureButtons", "(Lcom/onfido/android/sdk/capture/databinding/OnfidoConfirmationStepButtonsHorizontalBinding;)V", "isConfirmationButtonsHorizontal", "", "isConfirmationButtonsHorizontal$onfido_capture_sdk_core_release", "()Z", "listener", "Lcom/onfido/android/sdk/capture/ui/camera/ConfirmationStepButtons$Listener;", "alignHorizontalButtonsHeight", "", "disableAdaptableHorizontalButtonHeight", "enableAdaptableHorizontalButtonHeight", "forceButtonHeight", "height", "button", "forceInnerButtonsMeasurement", "hasConfirmationButtonHeightCalculated", "observeHorizontalButtonsHeight", "setButtonsMaxHeight", "setDocumentCapture", "readabilityDiscardResId", "readabilityConfirmationLabel", "setDocumentCapture$onfido_capture_sdk_core_release", "setDocumentCaptureActions", "setDocumentCaptureCopy", "confirmationResId", "discardResId", "isGenericMessage", "setDocumentErrorState", "isError", "setErrorState", "captureType", "Lcom/onfido/android/sdk/capture/ui/CaptureType;", "(ZLcom/onfido/android/sdk/capture/ui/CaptureType;Ljava/lang/Integer;Ljava/lang/Integer;)V", "setFaceCapture", "setFaceCaptureActions", "setListener", "setListener$onfido_capture_sdk_core_release", "setSelfieErrorState", "setWarningState", "isWarning", "documentTypeUIModel", "Lcom/onfido/android/sdk/capture/ui/model/DocumentTypeUIModel;", "Companion", "Listener", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ConfirmationStepButtons extends LinearLayout {
    private static final long ANIMATION_LAYOUT_CHANGE_DELAY = 300;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int NUM_ACTION_BUTTONS = 2;
    private OnfidoButton buttonConfirmation;
    private OnfidoButton buttonDiscard;
    private int confirmButtonHeight;
    private int discardButtonHeight;
    public OnfidoConfirmationStepButtonsVerticalBinding documentCaptureBinding;
    public OnfidoConfirmationStepButtonsHorizontalBinding horizontalDocumentCaptureButtons;
    private final boolean isConfirmationButtonsHorizontal;
    private Listener listener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/ConfirmationStepButtons$Companion;", "", "()V", "ANIMATION_LAYOUT_CHANGE_DELAY", "", "NUM_ACTION_BUTTONS", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/camera/ConfirmationStepButtons$Listener;", "", "onCaptureConfirmed", "", "onCaptureDiscarded", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Listener {
        void onCaptureConfirmed();

        void onCaptureDiscarded();
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CaptureType.values().length];
            try {
                iArr[CaptureType.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CaptureType.FACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConfirmationStepButtons(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void alignHorizontalButtonsHeight() {
        OnfidoButton onfidoButton;
        int iMax = Math.max(this.confirmButtonHeight, this.discardButtonHeight);
        if (this.confirmButtonHeight != iMax) {
            onfidoButton = this.buttonConfirmation;
            if (onfidoButton == null) {
                Intrinsics.r("buttonConfirmation");
                throw null;
            }
        } else {
            if (this.discardButtonHeight == iMax) {
                return;
            }
            onfidoButton = this.buttonDiscard;
            if (onfidoButton == null) {
                Intrinsics.r("buttonDiscard");
                throw null;
            }
        }
        forceButtonHeight(iMax, onfidoButton);
    }

    private final void disableAdaptableHorizontalButtonHeight() {
        if (this.isConfirmationButtonsHorizontal) {
            OnfidoButton onfidoButton = this.buttonDiscard;
            if (onfidoButton == null) {
                Intrinsics.r("buttonDiscard");
                throw null;
            }
            onfidoButton.setEnableForceHeight$onfido_capture_sdk_core_release(false);
            OnfidoButton onfidoButton2 = this.buttonConfirmation;
            if (onfidoButton2 != null) {
                onfidoButton2.setEnableForceHeight$onfido_capture_sdk_core_release(false);
            } else {
                Intrinsics.r("buttonConfirmation");
                throw null;
            }
        }
    }

    private final void forceButtonHeight(int height, OnfidoButton button) {
        button.setForcedHeight$onfido_capture_sdk_core_release(height);
        button.post(new e(2, button));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void forceButtonHeight$lambda$24(OnfidoButton button) {
        Intrinsics.checkNotNullParameter(button, "$button");
        button.requestLayout();
        button.invalidate();
    }

    public static /* synthetic */ void getHorizontalDocumentCaptureButtons$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasConfirmationButtonHeightCalculated() {
        return (this.discardButtonHeight == 0 || this.confirmButtonHeight == 0) ? false : true;
    }

    private final void observeHorizontalButtonsHeight() {
        OnfidoButton onfidoButton = this.buttonConfirmation;
        if (onfidoButton == null) {
            Intrinsics.r("buttonConfirmation");
            throw null;
        }
        onfidoButton.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.onfido.android.sdk.capture.ui.camera.ConfirmationStepButtons.observeHorizontalButtonsHeight.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                OnfidoButton onfidoButton2 = ConfirmationStepButtons.this.buttonConfirmation;
                if (onfidoButton2 == null) {
                    Intrinsics.r("buttonConfirmation");
                    throw null;
                }
                onfidoButton2.removeOnLayoutChangeListener(this);
                ConfirmationStepButtons.this.confirmButtonHeight = bottom - top;
                if (ConfirmationStepButtons.this.hasConfirmationButtonHeightCalculated()) {
                    ConfirmationStepButtons.this.alignHorizontalButtonsHeight();
                }
            }
        });
        OnfidoButton onfidoButton2 = this.buttonDiscard;
        if (onfidoButton2 != null) {
            onfidoButton2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.onfido.android.sdk.capture.ui.camera.ConfirmationStepButtons.observeHorizontalButtonsHeight.2
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    OnfidoButton onfidoButton3 = ConfirmationStepButtons.this.buttonDiscard;
                    if (onfidoButton3 == null) {
                        Intrinsics.r("buttonDiscard");
                        throw null;
                    }
                    onfidoButton3.removeOnLayoutChangeListener(this);
                    ConfirmationStepButtons.this.discardButtonHeight = bottom - top;
                    if (ConfirmationStepButtons.this.hasConfirmationButtonHeightCalculated()) {
                        ConfirmationStepButtons.this.alignHorizontalButtonsHeight();
                    }
                }
            });
        } else {
            Intrinsics.r("buttonDiscard");
            throw null;
        }
    }

    private final void setButtonsMaxHeight() {
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        int iScreenHeight = (int) ((ContextUtilsKt.screenHeight(r0) * 0.5f) / 2);
        OnfidoButton onfidoButton = this.buttonConfirmation;
        if (onfidoButton == null) {
            Intrinsics.r("buttonConfirmation");
            throw null;
        }
        onfidoButton.setMaxHeight$onfido_capture_sdk_core_release(iScreenHeight);
        OnfidoButton onfidoButton2 = this.buttonDiscard;
        if (onfidoButton2 != null) {
            onfidoButton2.setMaxHeight$onfido_capture_sdk_core_release(iScreenHeight);
        } else {
            Intrinsics.r("buttonDiscard");
            throw null;
        }
    }

    private final void setDocumentCaptureActions(int readabilityDiscardResId, int readabilityConfirmationLabel) {
        OnfidoButton buttonPrimary = getDocumentCaptureBinding().buttonPrimary;
        Intrinsics.checkNotNullExpressionValue(buttonPrimary, "buttonPrimary");
        buttonPrimary.setOnClickListener(new d(this, 5));
        buttonPrimary.setText(buttonPrimary.getResources().getString(readabilityConfirmationLabel));
        this.buttonConfirmation = buttonPrimary;
        OnfidoButton buttonSecondary = getDocumentCaptureBinding().buttonSecondary;
        Intrinsics.checkNotNullExpressionValue(buttonSecondary, "buttonSecondary");
        buttonSecondary.setOnClickListener(new d(this, 6));
        buttonSecondary.setText(buttonSecondary.getResources().getString(readabilityDiscardResId));
        ViewExtensionsKt.toVisible$default(buttonSecondary, false, 1, null);
        this.buttonDiscard = buttonSecondary;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDocumentCaptureActions$lambda$1$lambda$0(ConfirmationStepButtons this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Listener listener = this$0.listener;
        if (listener != null) {
            listener.onCaptureConfirmed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDocumentCaptureActions$lambda$3$lambda$2(ConfirmationStepButtons this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Listener listener = this$0.listener;
        if (listener != null) {
            listener.onCaptureDiscarded();
        }
    }

    public static /* synthetic */ void setDocumentCaptureCopy$default(ConfirmationStepButtons confirmationStepButtons, int i, int i2, boolean z, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        confirmationStepButtons.setDocumentCaptureCopy(i, i2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDocumentErrorState$lambda$21$lambda$20(ConfirmationStepButtons this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Listener listener = this$0.listener;
        if (listener != null) {
            listener.onCaptureDiscarded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDocumentErrorState$lambda$23$lambda$22(OnfidoButton this_with) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        ViewExtensionsKt.toGone$default(this_with, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setErrorState$lambda$13$lambda$12(ConfirmationStepButtons this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Listener listener = this$0.listener;
        if (listener != null) {
            listener.onCaptureDiscarded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setErrorState$lambda$15$lambda$14(OnfidoButton this_with) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        ViewExtensionsKt.toGone$default(this_with, false, 1, null);
    }

    private final void setFaceCaptureActions() {
        OnfidoButton buttonSecondary;
        if (this.documentCaptureBinding != null) {
            OnfidoButton buttonPrimary = getDocumentCaptureBinding().buttonPrimary;
            Intrinsics.checkNotNullExpressionValue(buttonPrimary, "buttonPrimary");
            this.buttonConfirmation = buttonPrimary;
            buttonSecondary = getDocumentCaptureBinding().buttonSecondary;
            Intrinsics.checkNotNullExpressionValue(buttonSecondary, "buttonSecondary");
        } else {
            View viewFindViewById = findViewById(R.id.button_primary);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.buttonConfirmation = (OnfidoButton) viewFindViewById;
            View viewFindViewById2 = findViewById(R.id.button_secondary);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            buttonSecondary = (OnfidoButton) viewFindViewById2;
        }
        this.buttonDiscard = buttonSecondary;
        OnfidoButton onfidoButton = this.buttonConfirmation;
        if (onfidoButton == null) {
            Intrinsics.r("buttonConfirmation");
            throw null;
        }
        onfidoButton.setText(onfidoButton.getResources().getString(R.string.onfido_selfie_confirmation_button_primary));
        onfidoButton.setOnClickListener(new d(this, 3));
        OnfidoButton onfidoButton2 = this.buttonDiscard;
        if (onfidoButton2 == null) {
            Intrinsics.r("buttonDiscard");
            throw null;
        }
        onfidoButton2.setText(onfidoButton2.getResources().getString(R.string.onfido_selfie_confirmation_button_secondary));
        onfidoButton2.setOnClickListener(new d(this, 4));
        ViewExtensionsKt.toVisible$default(onfidoButton2, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFaceCaptureActions$lambda$5$lambda$4(ConfirmationStepButtons this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Listener listener = this$0.listener;
        if (listener != null) {
            listener.onCaptureConfirmed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFaceCaptureActions$lambda$7$lambda$6(ConfirmationStepButtons this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Listener listener = this$0.listener;
        if (listener != null) {
            listener.onCaptureDiscarded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSelfieErrorState$lambda$17$lambda$16(ConfirmationStepButtons this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Listener listener = this$0.listener;
        if (listener != null) {
            listener.onCaptureDiscarded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSelfieErrorState$lambda$19$lambda$18(OnfidoButton this_with) {
        Intrinsics.checkNotNullParameter(this_with, "$this_with");
        ViewExtensionsKt.toGone$default(this_with, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setWarningState$lambda$11$lambda$10(ConfirmationStepButtons this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Listener listener = this$0.listener;
        if (listener != null) {
            listener.onCaptureDiscarded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setWarningState$lambda$9$lambda$8(ConfirmationStepButtons this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Listener listener = this$0.listener;
        if (listener != null) {
            listener.onCaptureConfirmed();
        }
    }

    public final void enableAdaptableHorizontalButtonHeight() {
        if (this.isConfirmationButtonsHorizontal) {
            OnfidoButton onfidoButton = this.buttonDiscard;
            if (onfidoButton == null) {
                Intrinsics.r("buttonDiscard");
                throw null;
            }
            onfidoButton.setEnableForceHeight$onfido_capture_sdk_core_release(true);
            OnfidoButton onfidoButton2 = this.buttonConfirmation;
            if (onfidoButton2 != null) {
                onfidoButton2.setEnableForceHeight$onfido_capture_sdk_core_release(true);
            } else {
                Intrinsics.r("buttonConfirmation");
                throw null;
            }
        }
    }

    public final void forceInnerButtonsMeasurement() {
        OnfidoButton onfidoButton = this.buttonDiscard;
        if (onfidoButton == null) {
            Intrinsics.r("buttonDiscard");
            throw null;
        }
        onfidoButton.requestLayout();
        OnfidoButton onfidoButton2 = this.buttonConfirmation;
        if (onfidoButton2 != null) {
            onfidoButton2.requestLayout();
        } else {
            Intrinsics.r("buttonConfirmation");
            throw null;
        }
    }

    @NotNull
    public final OnfidoConfirmationStepButtonsVerticalBinding getDocumentCaptureBinding() {
        OnfidoConfirmationStepButtonsVerticalBinding onfidoConfirmationStepButtonsVerticalBinding = this.documentCaptureBinding;
        if (onfidoConfirmationStepButtonsVerticalBinding != null) {
            return onfidoConfirmationStepButtonsVerticalBinding;
        }
        Intrinsics.r("documentCaptureBinding");
        throw null;
    }

    @NotNull
    public final OnfidoConfirmationStepButtonsHorizontalBinding getHorizontalDocumentCaptureButtons() {
        OnfidoConfirmationStepButtonsHorizontalBinding onfidoConfirmationStepButtonsHorizontalBinding = this.horizontalDocumentCaptureButtons;
        if (onfidoConfirmationStepButtonsHorizontalBinding != null) {
            return onfidoConfirmationStepButtonsHorizontalBinding;
        }
        Intrinsics.r("horizontalDocumentCaptureButtons");
        throw null;
    }

    /* JADX INFO: renamed from: isConfirmationButtonsHorizontal$onfido_capture_sdk_core_release, reason: from getter */
    public final boolean getIsConfirmationButtonsHorizontal() {
        return this.isConfirmationButtonsHorizontal;
    }

    public final void setDocumentCapture$onfido_capture_sdk_core_release(int readabilityDiscardResId, int readabilityConfirmationLabel) {
        OnfidoConfirmationStepButtonsVerticalBinding onfidoConfirmationStepButtonsVerticalBindingInflate = OnfidoConfirmationStepButtonsVerticalBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(onfidoConfirmationStepButtonsVerticalBindingInflate, "inflate(...)");
        setDocumentCaptureBinding(onfidoConfirmationStepButtonsVerticalBindingInflate);
        setDocumentCaptureActions(readabilityDiscardResId, readabilityConfirmationLabel);
        setButtonsMaxHeight();
        if (this.isConfirmationButtonsHorizontal) {
            enableAdaptableHorizontalButtonHeight();
            observeHorizontalButtonsHeight();
        }
    }

    public final void setDocumentCaptureBinding(@NotNull OnfidoConfirmationStepButtonsVerticalBinding onfidoConfirmationStepButtonsVerticalBinding) {
        Intrinsics.checkNotNullParameter(onfidoConfirmationStepButtonsVerticalBinding, "<set-?>");
        this.documentCaptureBinding = onfidoConfirmationStepButtonsVerticalBinding;
    }

    public final void setDocumentCaptureCopy(int confirmationResId, int discardResId, boolean isGenericMessage) {
        if (isGenericMessage) {
            confirmationResId = R.string.onfido_doc_confirmation_button_primary_barcode;
        }
        OnfidoButton onfidoButton = this.buttonConfirmation;
        if (onfidoButton == null) {
            Intrinsics.r("buttonConfirmation");
            throw null;
        }
        onfidoButton.setText(getResources().getString(confirmationResId));
        OnfidoButton onfidoButton2 = this.buttonDiscard;
        if (onfidoButton2 == null) {
            Intrinsics.r("buttonDiscard");
            throw null;
        }
        onfidoButton2.setText(getResources().getString(discardResId));
        if (this.isConfirmationButtonsHorizontal) {
            enableAdaptableHorizontalButtonHeight();
            observeHorizontalButtonsHeight();
        }
    }

    public final void setDocumentErrorState(boolean isError, int readabilityDiscardResId, int readabilityConfirmationLabel) {
        if (!isError) {
            setDocumentCaptureActions(readabilityDiscardResId, readabilityConfirmationLabel);
            return;
        }
        disableAdaptableHorizontalButtonHeight();
        OnfidoButton onfidoButton = this.buttonConfirmation;
        if (onfidoButton == null) {
            Intrinsics.r("buttonConfirmation");
            throw null;
        }
        onfidoButton.setEnableForceHeight$onfido_capture_sdk_core_release(false);
        onfidoButton.setText(onfidoButton.getResources().getString(R.string.onfido_selfie_confirmation_button_secondary));
        onfidoButton.setOnClickListener(new d(this, 8));
        OnfidoButton onfidoButton2 = this.buttonDiscard;
        if (onfidoButton2 == null) {
            Intrinsics.r("buttonDiscard");
            throw null;
        }
        onfidoButton2.setEnableForceHeight$onfido_capture_sdk_core_release(false);
        onfidoButton2.setText("");
        if (this.documentCaptureBinding != null) {
            onfidoButton2.postDelayed(new e(0, onfidoButton2), 300L);
        } else {
            ViewExtensionsKt.toGone$default(onfidoButton2, false, 1, null);
        }
    }

    public final void setErrorState(boolean isError, @NotNull CaptureType captureType, Integer readabilityDiscardResId, Integer readabilityConfirmationLabel) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(captureType, "captureType");
        if (!isError) {
            if (captureType != CaptureType.DOCUMENT) {
                setFaceCaptureActions();
                return;
            }
            Intrinsics.h(readabilityDiscardResId);
            int iIntValue2 = readabilityDiscardResId.intValue();
            Intrinsics.h(readabilityConfirmationLabel);
            setDocumentCaptureActions(iIntValue2, readabilityConfirmationLabel.intValue());
            return;
        }
        disableAdaptableHorizontalButtonHeight();
        OnfidoButton onfidoButton = this.buttonConfirmation;
        if (onfidoButton == null) {
            Intrinsics.r("buttonConfirmation");
            throw null;
        }
        onfidoButton.setEnableForceHeight$onfido_capture_sdk_core_release(false);
        int i = WhenMappings.$EnumSwitchMapping$0[captureType.ordinal()];
        if (i != 1) {
            iIntValue = i != 2 ? 0 : R.string.onfido_selfie_confirmation_button_secondary;
        } else {
            Intrinsics.h(readabilityDiscardResId);
            iIntValue = readabilityDiscardResId.intValue();
        }
        onfidoButton.setText(onfidoButton.getResources().getString(iIntValue));
        onfidoButton.setOnClickListener(new d(this, 7));
        OnfidoButton onfidoButton2 = this.buttonDiscard;
        if (onfidoButton2 == null) {
            Intrinsics.r("buttonDiscard");
            throw null;
        }
        onfidoButton2.setEnableForceHeight$onfido_capture_sdk_core_release(false);
        onfidoButton2.setText("");
        if (this.documentCaptureBinding != null) {
            onfidoButton2.postDelayed(new e(3, onfidoButton2), 300L);
        } else {
            ViewExtensionsKt.toGone$default(onfidoButton2, false, 1, null);
        }
    }

    public final void setFaceCapture() {
        OnfidoConfirmationStepButtonsVerticalBinding onfidoConfirmationStepButtonsVerticalBindingBind = OnfidoConfirmationStepButtonsVerticalBinding.bind(View.inflate(getContext(), R.layout.onfido_confirmation_step_buttons, this));
        Intrinsics.checkNotNullExpressionValue(onfidoConfirmationStepButtonsVerticalBindingBind, "bind(...)");
        setDocumentCaptureBinding(onfidoConfirmationStepButtonsVerticalBindingBind);
        setFaceCaptureActions();
        setButtonsMaxHeight();
        if (this.isConfirmationButtonsHorizontal) {
            enableAdaptableHorizontalButtonHeight();
            observeHorizontalButtonsHeight();
        }
    }

    public final void setHorizontalDocumentCaptureButtons(@NotNull OnfidoConfirmationStepButtonsHorizontalBinding onfidoConfirmationStepButtonsHorizontalBinding) {
        Intrinsics.checkNotNullParameter(onfidoConfirmationStepButtonsHorizontalBinding, "<set-?>");
        this.horizontalDocumentCaptureButtons = onfidoConfirmationStepButtonsHorizontalBinding;
    }

    public final void setListener$onfido_capture_sdk_core_release(@NotNull Listener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
    }

    public final void setSelfieErrorState(boolean isError) {
        if (!isError) {
            setFaceCaptureActions();
            return;
        }
        disableAdaptableHorizontalButtonHeight();
        OnfidoButton onfidoButton = this.buttonConfirmation;
        if (onfidoButton == null) {
            Intrinsics.r("buttonConfirmation");
            throw null;
        }
        onfidoButton.setEnableForceHeight$onfido_capture_sdk_core_release(false);
        onfidoButton.setText(onfidoButton.getResources().getString(R.string.onfido_selfie_confirmation_button_secondary));
        onfidoButton.setOnClickListener(new d(this, 1));
        OnfidoButton onfidoButton2 = this.buttonDiscard;
        if (onfidoButton2 == null) {
            Intrinsics.r("buttonDiscard");
            throw null;
        }
        onfidoButton2.setEnableForceHeight$onfido_capture_sdk_core_release(false);
        onfidoButton2.setText("");
        if (this.documentCaptureBinding != null) {
            onfidoButton2.postDelayed(new e(1, onfidoButton2), 300L);
        } else {
            ViewExtensionsKt.toGone$default(onfidoButton2, false, 1, null);
        }
    }

    public final void setWarningState(boolean isWarning, DocumentTypeUIModel documentTypeUIModel) {
        OnfidoButton buttonSecondary;
        if (documentTypeUIModel == null) {
            return;
        }
        if (isWarning) {
            OnfidoButton buttonSecondary2 = getDocumentCaptureBinding().buttonSecondary;
            Intrinsics.checkNotNullExpressionValue(buttonSecondary2, "buttonSecondary");
            this.buttonConfirmation = buttonSecondary2;
            buttonSecondary = getDocumentCaptureBinding().buttonPrimary;
            Intrinsics.checkNotNullExpressionValue(buttonSecondary, "buttonPrimary");
        } else {
            OnfidoButton buttonPrimary = getDocumentCaptureBinding().buttonPrimary;
            Intrinsics.checkNotNullExpressionValue(buttonPrimary, "buttonPrimary");
            this.buttonConfirmation = buttonPrimary;
            buttonSecondary = getDocumentCaptureBinding().buttonSecondary;
            Intrinsics.checkNotNullExpressionValue(buttonSecondary, "buttonSecondary");
        }
        this.buttonDiscard = buttonSecondary;
        int readabilityConfirmationLabel = documentTypeUIModel.getReadabilityConfirmationLabel();
        int readabilityDiscardLabel = documentTypeUIModel.getReadabilityDiscardLabel();
        OnfidoButton onfidoButton = this.buttonConfirmation;
        if (onfidoButton == null) {
            Intrinsics.r("buttonConfirmation");
            throw null;
        }
        onfidoButton.setOnClickListener(new d(this, 0));
        onfidoButton.setText(onfidoButton.getResources().getString(readabilityConfirmationLabel));
        OnfidoButton onfidoButton2 = this.buttonDiscard;
        if (onfidoButton2 == null) {
            Intrinsics.r("buttonDiscard");
            throw null;
        }
        onfidoButton2.setOnClickListener(new d(this, 2));
        onfidoButton2.setText(onfidoButton2.getResources().getString(readabilityDiscardLabel));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConfirmationStepButtons(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmationStepButtons(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isConfirmationButtonsHorizontal = context.getResources().getBoolean(R.bool.onfido_show_confirmation_buttons_horizontally);
    }

    public /* synthetic */ ConfirmationStepButtons(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
