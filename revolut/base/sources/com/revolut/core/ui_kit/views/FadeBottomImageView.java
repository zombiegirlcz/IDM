package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/revolut/core/ui_kit/views/FadeBottomImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "value", "v", "F", "getFadeRatio", "()F", "setFadeRatio", "(F)V", "fadeRatio", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FadeBottomImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final PorterDuffXfermode f58537w = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final LinearGradient f58538r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f58539t;
    public final Matrix u;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public float fadeRatio;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FadeBottomImageView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void c() {
        float height = getHeight() * this.fadeRatio;
        Matrix matrix = this.u;
        matrix.setScale(1.0f, getHeight() - height);
        matrix.postTranslate(BitmapDescriptorFactory.HUE_RED, height);
        this.f58538r.setLocalMatrix(matrix);
    }

    public final float getFadeRatio() {
        return this.fadeRatio;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iSaveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), null);
        super.onDraw(canvas);
        PorterDuffXfermode porterDuffXfermode = f58537w;
        Paint paint = this.f58539t;
        paint.setXfermode(porterDuffXfermode);
        canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), paint);
        paint.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        c();
    }

    public final void setFadeRatio(float f) {
        if (this.fadeRatio == f) {
            return;
        }
        this.fadeRatio = f;
        c();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FadeBottomImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FadeBottomImageView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LinearGradient linearGradient = new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, -16777216, 0, Shader.TileMode.CLAMP);
        this.f58538r = linearGradient;
        Paint paint = new Paint();
        paint.setShader(linearGradient);
        this.f58539t = paint;
        this.u = new Matrix();
        this.fadeRatio = 0.86f;
    }

    public /* synthetic */ FadeBottomImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
