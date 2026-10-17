package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import org.jmrtd.lds.LDSFile;
import p8.b;
import p8.e;
import y8.f;

/* JADX INFO: loaded from: classes.dex */
public class GifDrawable extends Drawable implements e, Animatable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f26125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26127c;
    public boolean d;
    public int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f26129h;
    public Paint i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Rect f26130j;
    public boolean e = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f26128g = -1;

    public GifDrawable(b bVar) {
        this.f26125a = bVar;
    }

    public final void a() {
        f.a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.d);
        b bVar = this.f26125a;
        if (bVar.f233797a.d() == 1) {
            invalidateSelf();
        } else {
            if (this.f26126b) {
                return;
            }
            this.f26126b = true;
            bVar.f233797a.j(this);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.d) {
            return;
        }
        if (this.f26129h) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f26130j == null) {
                this.f26130j = new Rect();
            }
            Gravity.apply(LDSFile.EF_SOD_TAG, intrinsicWidth, intrinsicHeight, bounds, this.f26130j);
            this.f26129h = false;
        }
        Bitmap bitmapB = this.f26125a.f233797a.b();
        if (this.f26130j == null) {
            this.f26130j = new Rect();
        }
        Rect rect = this.f26130j;
        if (this.i == null) {
            this.i = new Paint(2);
        }
        canvas.drawBitmap(bitmapB, (Rect) null, rect, this.i);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f26125a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f26125a.f233797a.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f26125a.f233797a.f();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f26126b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f26129h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        this.i.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        this.i.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z3) {
        f.a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.d);
        this.e = z;
        if (!z) {
            this.f26126b = false;
            this.f26125a.f233797a.k(this);
        } else if (this.f26127c) {
            a();
        }
        return super.setVisible(z, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f26127c = true;
        this.f = 0;
        if (this.e) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f26127c = false;
        this.f26126b = false;
        this.f26125a.f233797a.k(this);
    }
}
