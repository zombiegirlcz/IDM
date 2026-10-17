package com.onfido.android.sdk.capture.ui.userconsent.htmlutil;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006Jj\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/onfido/android/sdk/capture/ui/userconsent/htmlutil/ImprovedBulletSpan;", "Landroid/text/style/LeadingMarginSpan;", "bulletRadius", "", "gapWidth", "color", "(III)V", "getBulletRadius", "()I", "getColor", "getGapWidth", "mBulletPath", "Landroid/graphics/Path;", "drawLeadingMargin", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "x", "dir", "top", "baseline", "bottom", "text", "", "start", "end", "first", "", "layout", "Landroid/text/Layout;", "getLeadingMargin", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ImprovedBulletSpan implements LeadingMarginSpan {
    private static final int STANDARD_BULLET_RADIUS = 4;
    private static final int STANDARD_COLOR = 0;
    private static final int STANDARD_GAP_WIDTH = 2;
    private final int bulletRadius;
    private final int color;
    private final int gapWidth;
    private Path mBulletPath;

    public ImprovedBulletSpan() {
        this(0, 0, 0, 7, null);
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(@NotNull Canvas canvas, @NotNull Paint paint, int x3, int dir, int top, int baseline, int bottom, @NotNull CharSequence text, int start, int end2, boolean first, Layout layout) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        if (((Spanned) text).getSpanStart(this) == start) {
            Paint.Style style = paint.getStyle();
            paint.setStyle(Paint.Style.FILL);
            float lineBaseline = layout != null ? layout.getLineBaseline(layout.getLineForOffset(start)) - (this.bulletRadius * 2.0f) : (top + bottom) / 2.0f;
            float f = (dir * this.bulletRadius) + x3;
            if (canvas.isHardwareAccelerated()) {
                if (this.mBulletPath == null) {
                    Path path = new Path();
                    this.mBulletPath = path;
                    path.addCircle(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.bulletRadius, Path.Direction.CW);
                }
                canvas.save();
                canvas.translate(f, lineBaseline);
                Path path2 = this.mBulletPath;
                Intrinsics.h(path2);
                canvas.drawPath(path2, paint);
                canvas.restore();
            } else {
                canvas.drawCircle(f, lineBaseline, this.bulletRadius, paint);
            }
            paint.setStyle(style);
        }
    }

    public final int getBulletRadius() {
        return this.bulletRadius;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getGapWidth() {
        return this.gapWidth;
    }

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean first) {
        return (this.bulletRadius * 2) + this.gapWidth;
    }

    public ImprovedBulletSpan(int i, int i2, int i3) {
        this.bulletRadius = i;
        this.gapWidth = i2;
        this.color = i3;
    }

    public /* synthetic */ ImprovedBulletSpan(int i, int i2, int i3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 4 : i, (i5 & 2) != 0 ? 2 : i2, (i5 & 4) != 0 ? 0 : i3);
    }
}
