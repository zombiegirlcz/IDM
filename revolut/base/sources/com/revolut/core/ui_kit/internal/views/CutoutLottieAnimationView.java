package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import ix0.e0;
import ix0.e1;
import ix0.h0;
import ix0.j0;
import ix0.l0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/CutoutLottieAnimationView;", "Lcom/airbnb/lottie/LottieAnimationView;", "Lix0/h0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/drawable/Drawable;", "drawable", "", "setImageDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Lix0/j0;", "t", "Lix0/j0;", "getCutoutReceiverController", "()Lix0/j0;", "cutoutReceiverController", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CutoutLottieAnimationView extends LottieAnimationView implements h0 {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final j0 cutoutReceiverController;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CutoutLottieAnimationView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        e0 e0Var = l0.Companion;
        j0 cutoutReceiverController = getCutoutReceiverController();
        List list = cutoutReceiverController.f169246c;
        e0Var.getClass();
        e0.b(canvas, list);
        super.onDraw(canvas);
        e0.a(cutoutReceiverController, canvas);
    }

    @Override // com.airbnb.lottie.LottieAnimationView, androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        getCutoutReceiverController().f169245b.a(e1.MASKED_DRAWABLE, drawable instanceof yy0.n);
        super.setImageDrawable(drawable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CutoutLottieAnimationView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ix0.h0
    @NotNull
    public j0 getCutoutReceiverController() {
        return this.cutoutReceiverController;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutoutLottieAnimationView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.cutoutReceiverController = new j0(this);
    }

    public /* synthetic */ CutoutLottieAnimationView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
