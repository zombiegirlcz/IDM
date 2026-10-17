package com.revolut.core.ui_kit.internal.drawables;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import c8g.c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.internal.drawables.CursorDrawable;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u0001:\u0002\u0005\u0006B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/internal/drawables/TextSelectHandleDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "Companion", "b", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TextSelectHandleDrawable extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f56017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f56018b = new Paint(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56019c = 1;
    public Bitmap d;

    public static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f56020a;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new TextSelectHandleDrawable(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new TextSelectHandleDrawable(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            return new TextSelectHandleDrawable(this);
        }
    }

    public TextSelectHandleDrawable() {
        CursorDrawable.a aVar = a.f56028a;
        this.f56017a = a.f56029b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(this.f56017a.f56020a, PorterDuff.Mode.SRC_IN);
        Paint paint = this.f56018b;
        paint.setColorFilter(porterDuffColorFilter);
        int i = this.f56019c;
        if (i == 0) {
            Bitmap bitmap = this.d;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
                return;
            } else {
                Intrinsics.r("bitmap");
                throw null;
            }
        }
        if (i != 1) {
            if (i != 2) {
                return;
            }
            Bitmap bitmap2 = this.d;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
                return;
            } else {
                Intrinsics.r("bitmap");
                throw null;
            }
        }
        Bitmap bitmap3 = this.d;
        if (bitmap3 == null) {
            Intrinsics.r("bitmap");
            throw null;
        }
        if (bitmap3 != null) {
            canvas.drawBitmap(bitmap3, bitmap3.getWidth() / 2.0f, BitmapDescriptorFactory.HUE_RED, paint);
        } else {
            Intrinsics.r("bitmap");
            throw null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        Intrinsics.r("bitmap");
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        Intrinsics.r("bitmap");
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources r2, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) throws XmlPullParserException, IOException {
        Bitmap bitmapF;
        Intrinsics.checkNotNullParameter(r2, "r");
        Intrinsics.checkNotNullParameter(parser, "parser");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainAttributes = theme == null ? r2.obtainAttributes(attrs, R$styleable.SelectHandleDrawable) : theme.obtainStyledAttributes(attrs, R$styleable.SelectHandleDrawable, 0, 0);
        int i = typedArrayObtainAttributes.getInt(R$styleable.SelectHandleDrawable_internal_position, 1);
        this.f56019c = i;
        if (i == 0) {
            bitmapF = c.f(r2, R$drawable.internal_input_text_select_handle_left_raw, theme, null);
        } else if (i == 1) {
            bitmapF = c.f(r2, R$drawable.internal_input_text_select_handle_middle_raw, theme, null);
        } else {
            if (i != 2) {
                throw new IllegalStateException(("not resource declared for position: " + this.f56019c).toString());
            }
            bitmapF = c.f(r2, R$drawable.internal_input_text_select_handle_right_raw, theme, null);
        }
        this.d = bitmapF;
        typedArrayObtainAttributes.recycle();
        super.inflate(r2, parser, attrs, theme);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f56018b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f56018b.setColorFilter(colorFilter);
    }

    public TextSelectHandleDrawable(b bVar) {
        this.f56017a = bVar;
    }
}
