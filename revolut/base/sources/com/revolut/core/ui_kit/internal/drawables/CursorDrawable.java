package com.revolut.core.ui_kit.internal.drawables;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.revolut.core.ui_kit.R$dimen;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/CursorDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CursorDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f55946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f55947b = new Paint(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f55948c = new RectF();

    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f55949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f55950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f55951c;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new CursorDrawable(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new CursorDrawable(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            return new CursorDrawable(this);
        }
    }

    public CursorDrawable() {
        a aVar = com.revolut.core.ui_kit.internal.drawables.a.f56028a;
        this.f55946a = com.revolut.core.ui_kit.internal.drawables.a.f56028a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        a aVar = this.f55946a;
        int i = aVar.f55949a;
        Paint paint = this.f55947b;
        paint.setColor(i);
        int i2 = aVar.f55951c;
        canvas.drawRoundRect(this.f55948c, i2, i2, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f55946a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f55946a.f55950b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources r2, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws XmlPullParserException, IOException {
        Intrinsics.checkNotNullParameter(r2, "r");
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        a aVar = com.revolut.core.ui_kit.internal.drawables.a.f56028a;
        int i = com.revolut.core.ui_kit.internal.drawables.a.f56028a.f55949a;
        a aVar2 = this.f55946a;
        aVar2.f55949a = i;
        aVar2.f55950b = r2.getDimensionPixelSize(R$dimen.internal_input_text_cursor_width);
        aVar2.f55951c = r2.getDimensionPixelSize(R$dimen.internal_input_text_cursor_corners);
        super.inflate(r2, parser, attrs, theme);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f55948c.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55947b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f55947b.setColorFilter(colorFilter);
    }

    public CursorDrawable(a aVar) {
        this.f55946a = aVar;
    }
}
