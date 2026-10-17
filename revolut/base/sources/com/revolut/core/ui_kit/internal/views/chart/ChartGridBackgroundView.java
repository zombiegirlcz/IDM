package com.revolut.core.ui_kit.internal.views.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ts0.j;
import ts0.k;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0002\n\u0010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/chart/ChartGridBackgroundView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lts0/j;", "model", "", "setModel", "(Lts0/j;)V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChartGridBackgroundView extends View {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ct0.c f56599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f56601c;
    public final RectF d;
    public final RectF e;
    public j f;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChartGridBackgroundView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        ts0.g gVar = this.f.f273876b;
        boolean zEquals = gVar.equals(ts0.f.f273866a);
        ct0.c cVar = this.f56599a;
        RectF viewport = this.d;
        if (zEquals) {
            int i = k.f273879a[this.f.f273875a.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                viewport.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight());
                cVar.a(canvas, viewport);
                return;
            }
            float width = getWidth();
            float height = getHeight();
            int iSave = canvas.save();
            canvas.translate(BitmapDescriptorFactory.HUE_RED, height);
            try {
                this.f56599a.b(canvas, this.f56601c, width, height, -height, BitmapDescriptorFactory.HUE_RED, this.f56600b, null);
                return;
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        if (!(gVar instanceof ts0.e)) {
            throw new NoWhenBranchMatchedException();
        }
        ts0.h hVar = ((ts0.e) gVar).f273865a;
        viewport.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight());
        float f = hVar.f273867a;
        float f4 = hVar.f273868b;
        float f5 = hVar.f273869c;
        float f6 = hVar.d;
        RectF plotBounds = this.e;
        plotBounds.set(f, f4, f5, f6);
        boolean zA = this.f.f273875a.a();
        Paint paint = cVar.e;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        Intrinsics.checkNotNullParameter(plotBounds, "plotBounds");
        float fWidth = plotBounds.width();
        float fHeight = plotBounds.height();
        if (fWidth < 1.0f || fHeight < 1.0f || viewport.width() < 1.0f || viewport.height() < 1.0f) {
            return;
        }
        if (zA) {
            ir0.g.Companion.getClass();
        }
        paint.setShader(cVar.e(viewport.left, viewport.top, viewport.right, viewport.bottom));
        float f32 = 4;
        float f35 = fHeight / f32;
        if (f35 > BitmapDescriptorFactory.HUE_RED) {
            float f36 = plotBounds.top;
            while (f36 > viewport.top) {
                f36 -= f35;
            }
            while (f36 < viewport.top) {
                f36 += f35;
            }
            for (float f37 = f36; f37 <= viewport.bottom; f37 += f35) {
                canvas.drawLine(viewport.left, f37, viewport.right, f37, paint);
            }
        }
        if (zA) {
            float f41 = fWidth / f32;
            if (f41 > BitmapDescriptorFactory.HUE_RED) {
                float f42 = plotBounds.left;
                while (f42 > viewport.left) {
                    f42 -= f41;
                }
                while (f42 < viewport.left) {
                    f42 += f41;
                }
                for (float f57 = f42; f57 <= viewport.right; f57 += f41) {
                    canvas.drawLine(f57, viewport.top, f57, viewport.bottom, paint);
                }
            }
        }
        paint.setShader(null);
    }

    public final void setModel(@NotNull j model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(this.f, model)) {
            return;
        }
        this.f = model;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChartGridBackgroundView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChartGridBackgroundView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56599a = new ct0.c(context);
        this.f56600b = kli.a.s(R$attr.uikit_colorForeground, context);
        this.f56601c = f0.f322471a;
        this.d = new RectF();
        this.e = new RectF();
        this.f = new j(ts0.i.FULL, ts0.f.f273866a);
    }

    public /* synthetic */ ChartGridBackgroundView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
