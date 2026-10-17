package com.onfido.android.sdk.capture.ui.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.databinding.OnfidoBulletViewBinding;
import com.onfido.android.sdk.capture.utils.ContextUtilsKt;
import com.onfido.android.sdk.capture.utils.ViewExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/onfido/android/sdk/capture/ui/widget/BulletView;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lcom/onfido/android/sdk/capture/databinding/OnfidoBulletViewBinding;", "setMaxLines", "", "line", "", "setStepTitle", "title", "", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BulletView extends RelativeLayout {

    @NotNull
    private final OnfidoBulletViewBinding binding;

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.widget.BulletView$setStepTitle$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/ViewGroup$LayoutParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<ViewGroup.LayoutParams, Unit> {
        final /* synthetic */ int $marginTop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulletView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        OnfidoBulletViewBinding onfidoBulletViewBindingInflate = OnfidoBulletViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(onfidoBulletViewBindingInflate, "inflate(...)");
        this.binding = onfidoBulletViewBindingInflate;
    }

    public final void setMaxLines(int line) {
        this.binding.bulletTitle.setMaxLines(line);
    }

    public final void setStepTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.binding.bulletTitle.setText(title);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iDimenInt = ContextUtilsKt.dimenInt(context, R.dimen.onfido_liveness_intro_video_bullet_size);
        int lineSpacingExtra = (((int) (this.binding.bulletTitle.getLineSpacingExtra() + this.binding.bulletTitle.getTextSize())) / 2) - (iDimenInt / 2);
        View bullet = this.binding.bullet;
        Intrinsics.checkNotNullExpressionValue(bullet, "bullet");
        ViewExtensionsKt.changeLayoutParams(bullet, new AnonymousClass1(lineSpacingExtra));
    }
}
