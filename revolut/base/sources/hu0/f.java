package hu0;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import bx0.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import dki.v;

/* JADX INFO: loaded from: classes19.dex */
public final class f implements View.OnTouchListener, View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f155493h;
    public final GestureDetector i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c f155494j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View.OnClickListener f155498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View.OnLongClickListener f155499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v f155500r;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f61.a f155503w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccelerateDecelerateInterpolator f155489a = new AccelerateDecelerateInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f155490b = 200;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f155491c = 1.0f;
    public float d = 1.75f;
    public float e = 3.0f;
    public boolean f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f155492g = false;
    public final Matrix k = new Matrix();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Matrix f155495l = new Matrix();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Matrix f155496m = new Matrix();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RectF f155497n = new RectF();
    public final float[] o = new float[9];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f155501s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f155502t = 2;
    public boolean u = true;
    public ImageView.ScaleType v = ImageView.ScaleType.FIT_CENTER;

    public f(g gVar) {
        f61.a aVar = new f61.a(this, 14);
        this.f155503w = aVar;
        this.f155493h = gVar;
        gVar.setOnTouchListener(this);
        gVar.addOnLayoutChangeListener(this);
        if (gVar.isInEditMode()) {
            return;
        }
        this.f155494j = new c(gVar.getContext(), aVar);
        GestureDetector gestureDetector = new GestureDetector(gVar.getContext(), new q(this, 3), new Handler(Looper.getMainLooper()));
        this.i = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new d(this));
    }

    public final void a() {
        if (b()) {
            this.f155493h.setImageMatrix(c());
        }
    }

    public final boolean b() {
        RectF rectF;
        float f;
        float f4;
        float f5;
        float f6;
        float f32;
        Matrix matrixC = c();
        g gVar = this.f155493h;
        Drawable drawable = gVar.getDrawable();
        float f35 = BitmapDescriptorFactory.HUE_RED;
        if (drawable != null) {
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            rectF = this.f155497n;
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, intrinsicWidth, intrinsicHeight);
            matrixC.mapRect(rectF);
        } else {
            rectF = null;
        }
        if (rectF == null) {
            return false;
        }
        float fHeight = rectF.height();
        float fWidth = rectF.width();
        float height = (gVar.getHeight() - gVar.getPaddingTop()) - gVar.getPaddingBottom();
        if (fHeight <= height) {
            int i = a.f155476a[this.v.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    f6 = (height - fHeight) / 2.0f;
                    f32 = rectF.top;
                } else {
                    f6 = height - fHeight;
                    f32 = rectF.top;
                }
                f = f6 - f32;
            } else {
                f = -rectF.top;
            }
            this.f155502t = 2;
        } else {
            float f36 = rectF.top;
            if (f36 > BitmapDescriptorFactory.HUE_RED) {
                this.f155502t = 0;
                f = -f36;
            } else {
                float f37 = rectF.bottom;
                if (f37 < height) {
                    this.f155502t = 1;
                    f = height - f37;
                } else {
                    this.f155502t = -1;
                    f = 0.0f;
                }
            }
        }
        float width = (gVar.getWidth() - gVar.getPaddingLeft()) - gVar.getPaddingRight();
        if (fWidth <= width) {
            int i2 = a.f155476a[this.v.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f4 = (width - fWidth) / 2.0f;
                    f5 = rectF.left;
                } else {
                    f4 = width - fWidth;
                    f5 = rectF.left;
                }
                f35 = f4 - f5;
            } else {
                f35 = -rectF.left;
            }
            this.f155501s = 2;
        } else {
            float f41 = rectF.left;
            if (f41 > BitmapDescriptorFactory.HUE_RED) {
                this.f155501s = 0;
                f35 = -f41;
            } else {
                float f42 = rectF.right;
                if (f42 < width) {
                    f35 = width - f42;
                    this.f155501s = 1;
                } else {
                    this.f155501s = -1;
                }
            }
        }
        this.f155496m.postTranslate(f35, f);
        return true;
    }

    public final Matrix c() {
        Matrix matrix = this.k;
        Matrix matrix2 = this.f155495l;
        matrix2.set(matrix);
        matrix2.postConcat(this.f155496m);
        return matrix2;
    }

    public final float d() {
        Matrix matrix = this.f155496m;
        float[] fArr = this.o;
        matrix.getValues(fArr);
        float fPow = (float) Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(fPow + ((float) Math.pow(fArr[3], 2.0d)));
    }

    public final void e(float f, float f4, float f5, boolean z) {
        if (f < this.f155491c || f > this.e) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z) {
            this.f155493h.post(new e(this, d(), f, f4, f5));
        } else {
            this.f155496m.setScale(f, f, f4, f5);
            a();
        }
    }

    public final void f() {
        boolean z = this.u;
        g gVar = this.f155493h;
        if (z) {
            g(gVar.getDrawable());
            return;
        }
        Matrix matrix = this.f155496m;
        matrix.reset();
        matrix.postRotate(BitmapDescriptorFactory.HUE_RED);
        a();
        gVar.setImageMatrix(c());
        b();
    }

    public final void g(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        g gVar = this.f155493h;
        float width = (gVar.getWidth() - gVar.getPaddingLeft()) - gVar.getPaddingRight();
        float height = (gVar.getHeight() - gVar.getPaddingTop()) - gVar.getPaddingBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Matrix matrix = this.k;
        matrix.reset();
        float f = intrinsicWidth;
        float f4 = width / f;
        float f5 = intrinsicHeight;
        float f6 = height / f5;
        ImageView.ScaleType scaleType = this.v;
        if (scaleType == ImageView.ScaleType.CENTER) {
            matrix.postTranslate((width - f) / 2.0f, (height - f5) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float fMax = Math.max(f4, f6);
            matrix.postScale(fMax, fMax);
            matrix.postTranslate((width - (f * fMax)) / 2.0f, m72.b.a(f5, fMax, height, 2.0f));
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float fMin = Math.min(1.0f, Math.min(f4, f6));
            matrix.postScale(fMin, fMin);
            matrix.postTranslate((width - (f * fMin)) / 2.0f, m72.b.a(f5, fMin, height, 2.0f));
        } else {
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f5);
            RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
            if (((int) BitmapDescriptorFactory.HUE_RED) % 180 != 0) {
                rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f5, f);
            }
            int i = a.f155476a[this.v.ordinal()];
            if (i == 1) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i == 2) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i == 3) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i == 4) {
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        Matrix matrix2 = this.f155496m;
        matrix2.reset();
        matrix2.postRotate(BitmapDescriptorFactory.HUE_RED);
        a();
        gVar.setImageMatrix(c());
        b();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        if (i == i6 && i2 == i21 && i3 == i22 && i5 == i32) {
            return;
        }
        g(this.f155493h.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hu0.f.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
