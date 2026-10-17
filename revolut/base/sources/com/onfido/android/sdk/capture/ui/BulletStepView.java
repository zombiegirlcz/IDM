package com.onfido.android.sdk.capture.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.databinding.OnfidoBulletStepViewBinding;
import com.onfido.android.sdk.capture.ui.userconsent.htmlutil.TextViewExtensionKt;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J(\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0002J\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0015J\u0006\u0010\u001d\u001a\u00020\u0013J\u0006\u0010\u001e\u001a\u00020\u0013J\u0010\u0010\u001f\u001a\u00020\u00132\b\b\u0001\u0010 \u001a\u00020\u0007J\u0016\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020$J\u0018\u0010!\u001a\u00020\u00132\u0006\u0010#\u001a\u00020$2\b\b\u0001\u0010 \u001a\u00020\u0007J\u000e\u0010%\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006&"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/BulletStepView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoBulletStepViewBinding;", "stepNumberHorizontalPadding", "getStepNumberHorizontalPadding", "()I", "stepNumberLayoutParams", "Landroid/widget/RelativeLayout$LayoutParams;", "getStepNumberLayoutParams", "()Landroid/widget/RelativeLayout$LayoutParams;", "adjustInfoAlignment", "", "isIcon", "", "changeBottomSeparatorDimensions", "width", "height", "marginTop", "marginLeft", "hideSeparator", "isTop", "hideSeparators", "setHtmlTitle", "setIcon", "iconRes", "setStepInfo", "number", "title", "", "setStepNumber", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BulletStepView extends RelativeLayout {

    @NotNull
    private final OnfidoBulletStepViewBinding binding;

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.BulletStepView$adjustInfoAlignment$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/ViewGroup$LayoutParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<ViewGroup.LayoutParams, Unit> {
        final /* synthetic */ int $stepBulletContainerDimensions;
        final /* synthetic */ BulletStepView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, BulletStepView bulletStepView) {
            super(1);
            this.$stepBulletContainerDimensions = i;
            this.this$0 = bulletStepView;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((ViewGroup.LayoutParams) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull ViewGroup.LayoutParams it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            int i = this.$stepBulletContainerDimensions;
            new RelativeLayout.LayoutParams(i, i).addRule(3, this.this$0.binding.topSeparator.getId());
        }
    }

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.BulletStepView$adjustInfoAlignment$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/ViewGroup$LayoutParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 extends u implements Function1<ViewGroup.LayoutParams, Unit> {
        final /* synthetic */ int $marginTop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(1);
            this.$marginTop = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
            invoke((ViewGroup.LayoutParams) obj2);
            return Unit.f186387a;
        }

        public final void invoke(@NotNull ViewGroup.LayoutParams it8) {
            Intrinsics.checkNotNullParameter(it8, "it");
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) it8;
            layoutParams.setMargins(layoutParams.leftMargin, this.$marginTop, layoutParams.rightMargin, layoutParams.bottomMargin);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BulletStepView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void adjustInfoAlignment(boolean isIcon) {
        int textPixelsWidth$default;
        int iRound;
        View view;
        String str;
        if (isIcon) {
            ViewGroup.LayoutParams layoutParams = this.binding.stepIcon.getLayoutParams();
            int i = layoutParams.width;
            int i2 = layoutParams.height;
            double d = 2;
            textPixelsWidth$default = (int) Math.ceil((Math.sqrt((i2 * i2) + (i * i)) / d) * d);
        } else {
            TextView stepNumber = this.binding.stepNumber;
            Intrinsics.checkNotNullExpressionValue(stepNumber, "stepNumber");
            textPixelsWidth$default = ViewExtensionsKt.getTextPixelsWidth$default(stepNumber, BitmapDescriptorFactory.HUE_RED, 1, null) + getStepNumberHorizontalPadding();
        }
        TextView stepNumber2 = this.binding.stepNumber;
        Intrinsics.checkNotNullExpressionValue(stepNumber2, "stepNumber");
        ViewExtensionsKt.changeLayoutParams(stepNumber2, new AnonymousClass1(textPixelsWidth$default, this));
        float f = this.binding.stepTitle.getPaint().getFontMetrics().descent - this.binding.stepTitle.getPaint().getFontMetrics().ascent;
        float f4 = textPixelsWidth$default;
        if (f > f4) {
            iRound = Math.round((f - f4) / 2.0f);
            view = this.binding.stepNumberContainer;
            str = "stepNumberContainer";
        } else {
            iRound = Math.round((f4 - f) / 2.0f);
            view = this.binding.stepTitle;
            str = "stepTitle";
        }
        Intrinsics.checkNotNullExpressionValue(view, str);
        ViewExtensionsKt.changeLayoutParams(view, new AnonymousClass2(iRound));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeBottomSeparatorDimensions(int width, int height, int marginTop, int marginLeft) {
        View view = this.binding.bottomSeparator;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
        layoutParams.addRule(3, this.binding.stepNumberContainer.getId());
        layoutParams.setMargins(marginLeft, marginTop, 0, 0);
        view.setLayoutParams(layoutParams);
    }

    private final int getStepNumberHorizontalPadding() {
        return getStepNumberLayoutParams().leftMargin + getStepNumberLayoutParams().rightMargin;
    }

    private final RelativeLayout.LayoutParams getStepNumberLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.binding.stepNumber.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        return (RelativeLayout.LayoutParams) layoutParams;
    }

    public final void hideSeparator(boolean isTop) {
        View view;
        String str;
        if (isTop) {
            view = this.binding.topSeparator;
            str = "topSeparator";
        } else {
            view = this.binding.bottomSeparator;
            str = "bottomSeparator";
        }
        Intrinsics.checkNotNullExpressionValue(view, str);
        ViewExtensionsKt.toGone$default(view, false, 1, null);
    }

    public final void hideSeparators() {
        hideSeparator(true);
        hideSeparator(false);
    }

    public final void setHtmlTitle() {
        TextView stepTitle = this.binding.stepTitle;
        Intrinsics.checkNotNullExpressionValue(stepTitle, "stepTitle");
        CharSequence text = this.binding.stepTitle.getText();
        Intrinsics.i(text, "null cannot be cast to non-null type kotlin.String");
        TextViewExtensionKt.setTextFromHtml(stepTitle, (String) text);
    }

    public final void setIcon(int iconRes) {
        TextView stepNumber = this.binding.stepNumber;
        Intrinsics.checkNotNullExpressionValue(stepNumber, "stepNumber");
        ViewExtensionsKt.toGone$default(stepNumber, false, 1, null);
        ImageView stepIcon = this.binding.stepIcon;
        Intrinsics.checkNotNullExpressionValue(stepIcon, "stepIcon");
        ViewExtensionsKt.toVisible$default(stepIcon, false, 1, null);
        this.binding.stepIcon.setImageDrawable(ContextCompat.getDrawable(getContext(), iconRes));
    }

    public final void setStepInfo(int number, @NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.binding.stepNumber.setText(String.valueOf(number));
        this.binding.stepTitle.setText(title);
        adjustInfoAlignment(false);
    }

    public final void setStepNumber(int number) {
        this.binding.stepNumber.setText(String.valueOf(number));
        TextView stepNumber = this.binding.stepNumber;
        Intrinsics.checkNotNullExpressionValue(stepNumber, "stepNumber");
        ViewExtensionsKt.toVisible$default(stepNumber, false, 1, null);
        ImageView stepIcon = this.binding.stepIcon;
        Intrinsics.checkNotNullExpressionValue(stepIcon, "stepIcon");
        ViewExtensionsKt.toGone$default(stepIcon, false, 1, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BulletStepView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setStepInfo(@NotNull String title, int iconRes) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.binding.stepTitle.setText(title);
        setIcon(iconRes);
        hideSeparators();
        adjustInfoAlignment(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulletStepView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        OnfidoBulletStepViewBinding onfidoBulletStepViewBindingInflate = OnfidoBulletStepViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(onfidoBulletStepViewBindingInflate, "inflate(...)");
        this.binding = onfidoBulletStepViewBindingInflate;
        View bottomSeparator = onfidoBulletStepViewBindingInflate.bottomSeparator;
        Intrinsics.checkNotNullExpressionValue(bottomSeparator, "bottomSeparator");
        ViewExtensionsKt.runOnMeasured(bottomSeparator, new BulletStepView$1$1(onfidoBulletStepViewBindingInflate, this));
    }

    public /* synthetic */ BulletStepView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
