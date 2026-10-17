package com.revolut.core.ui_kit_core.displayers.image;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;

/* JADX INFO: loaded from: classes20.dex */
@Deprecated
public class AvatarByUserIdTextDrawable extends ShapeDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f59793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59795c;
    public final int d;
    public final int e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f59796a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f59797b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f59798c;
        public int d;
        public final Typeface e;
        public RectShape f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f59799g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f59800h;
        public boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f59801j;

        public /* synthetic */ a(int i) {
            this();
        }

        public final a a() {
            this.i = true;
            return this;
        }

        public final AvatarByUserIdTextDrawable b(int i, String str) {
            this.f = new OvalShape();
            this.f59797b = i;
            this.f59796a = str;
            return new AvatarByUserIdTextDrawable(this);
        }

        public final a c(int i) {
            this.f59800h = i;
            return this;
        }

        public final a d(int i) {
            this.d = i;
            return this;
        }

        public final a e(int i) {
            this.f59799g = i;
            return this;
        }

        public final a f() {
            this.f59801j = true;
            return this;
        }

        public final a g(int i) {
            this.f59798c = i;
            return this;
        }

        private a() {
            this.f59796a = "";
            this.f59797b = -7829368;
            this.f59799g = -1;
            this.f59798c = -1;
            this.d = -1;
            this.f = new RectShape();
            this.e = Typeface.create("sans-serif-light", 0);
            this.f59800h = -1;
            this.i = false;
            this.f59801j = false;
        }
    }

    public AvatarByUserIdTextDrawable(a aVar) {
        super(aVar.f);
        this.f59795c = aVar.d;
        this.d = aVar.f59798c;
        this.f59794b = aVar.f59801j ? aVar.f59796a.toUpperCase() : aVar.f59796a;
        int i = aVar.f59797b;
        this.e = aVar.f59800h;
        Paint paint = new Paint();
        this.f59793a = paint;
        paint.setColor(aVar.f59799g);
        paint.setAntiAlias(true);
        paint.setFakeBoldText(aVar.i);
        paint.setStyle(Paint.Style.FILL);
        paint.setTypeface(aVar.e);
        paint.setTextAlign(Paint.Align.CENTER);
        float f = 0;
        paint.setStrokeWidth(f);
        Paint paint2 = new Paint();
        paint2.setColor(Color.rgb((int) (Color.red(i) * 0.9f), (int) (Color.green(i) * 0.9f), (int) (Color.blue(i) * 0.9f)));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f);
        getPaint().setColor(i);
    }

    public static a a() {
        return new a(0);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Rect bounds = getBounds();
        int iSave = canvas.save();
        canvas.translate(bounds.left, bounds.top);
        int iWidth = this.d;
        if (iWidth < 0) {
            iWidth = bounds.width();
        }
        int iHeight = this.f59795c;
        if (iHeight < 0) {
            iHeight = bounds.height();
        }
        int iMin = this.e;
        if (iMin < 0) {
            iMin = Math.min(iWidth, iHeight) / 2;
        }
        Paint paint = this.f59793a;
        paint.setTextSize(iMin);
        canvas.drawText(this.f59794b, iWidth / 2, (iHeight / 2) - ((paint.ascent() + paint.descent()) / 2.0f), paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f59795c;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f59793a.setAlpha(i);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f59793a.setColorFilter(colorFilter);
    }
}
