package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.e0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/views/FocusOverlayView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FocusOverlayView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f58594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f58595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f58596c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FocusOverlayView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        f0 f0Var = this.f58594a;
        if (f0Var == null) {
            f0Var.getClass();
            e0.f322469a.getClass();
        }
        if (event.getAction() != 1 && event.getAction() != 3) {
            return true;
        }
        this.f58595b.onNext(Unit.f186387a);
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawPaint(this.f58596c);
        this.f58594a.getClass();
        e0.f322469a.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FocusOverlayView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusOverlayView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58594a = f0.f322471a;
        this.f58595b = v0.a.d("create(...)");
        Paint paint = new Paint();
        paint.setColor(kli.a.s(R$attr.uikit_windowBackground, context));
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f58596c = paint;
        Paint paint2 = new Paint();
        paint2.setColor(0);
        paint2.setStyle(style);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setVisibility(4);
        setAlpha(0.4f);
        setElevation(Float.MAX_VALUE);
        setLayerType(1, null);
    }

    public /* synthetic */ FocusOverlayView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
