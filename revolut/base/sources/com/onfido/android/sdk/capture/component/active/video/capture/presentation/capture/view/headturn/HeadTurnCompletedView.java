package com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.headturn;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.onfido.android.sdk.capture.component.active.video.capture.presentation.capture.view.util.ViewExtensionsKt;
import com.onfido.android.sdk.capture.databinding.OnfidoAvcViewHeadTurnCompletedBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/onfido/android/sdk/capture/component/active/video/capture/presentation/capture/view/headturn/HeadTurnCompletedView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoAvcViewHeadTurnCompletedBinding;", "onSizeChanged", "", "w", "h", "oldw", "oldh", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HeadTurnCompletedView extends FrameLayout {

    @NotNull
    private final OnfidoAvcViewHeadTurnCompletedBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadTurnCompletedView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        OnfidoAvcViewHeadTurnCompletedBinding onfidoAvcViewHeadTurnCompletedBindingInflate = OnfidoAvcViewHeadTurnCompletedBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(onfidoAvcViewHeadTurnCompletedBindingInflate, "inflate(...)");
        this.binding = onfidoAvcViewHeadTurnCompletedBindingInflate;
        onfidoAvcViewHeadTurnCompletedBindingInflate.watermark.setDarkBackground();
    }

    @Override // android.view.View
    public void onSizeChanged(int w3, int h2, int oldw, int oldh) {
        TextView instructionTextView = this.binding.instructionTextView;
        Intrinsics.checkNotNullExpressionValue(instructionTextView, "instructionTextView");
        ViewExtensionsKt.setOvalMargin$default(instructionTextView, getWidth(), getHeight(), 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadTurnCompletedView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        OnfidoAvcViewHeadTurnCompletedBinding onfidoAvcViewHeadTurnCompletedBindingInflate = OnfidoAvcViewHeadTurnCompletedBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(onfidoAvcViewHeadTurnCompletedBindingInflate, "inflate(...)");
        this.binding = onfidoAvcViewHeadTurnCompletedBindingInflate;
        onfidoAvcViewHeadTurnCompletedBindingInflate.watermark.setDarkBackground();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeadTurnCompletedView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        OnfidoAvcViewHeadTurnCompletedBinding onfidoAvcViewHeadTurnCompletedBindingInflate = OnfidoAvcViewHeadTurnCompletedBinding.inflate(LayoutInflater.from(getContext()), this, true);
        Intrinsics.checkNotNullExpressionValue(onfidoAvcViewHeadTurnCompletedBindingInflate, "inflate(...)");
        this.binding = onfidoAvcViewHeadTurnCompletedBindingInflate;
        onfidoAvcViewHeadTurnCompletedBindingInflate.watermark.setDarkBackground();
    }
}
