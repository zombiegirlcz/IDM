package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/views/CircleClipView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class CircleClipView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f58481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f58482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58483c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleClipView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Path path = this.f58482b;
        path.reset();
        path.addOval(getPaddingStart() + BitmapDescriptorFactory.HUE_RED, getPaddingTop() + BitmapDescriptorFactory.HUE_RED, getWidth() - getPaddingEnd(), getHeight() - getPaddingBottom(), Path.Direction.CW);
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        canvas.drawPath(path, this.f58481a);
        canvas.clipPath(path);
        canvas.drawColor(this.f58483c);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleClipView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleClipView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.f58481a = paint;
        this.f58482b = new Path();
        paint.setColor(0);
        this.f58483c = kli.a.s(R$attr.uikit_windowBackground, context);
    }

    public /* synthetic */ CircleClipView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
