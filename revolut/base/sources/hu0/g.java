package hu0;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes19.dex */
public class g extends AppCompatImageView {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f155504r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView.ScaleType f155505t;

    public static class a {
        public static void a(float f, float f4, float f5) {
            if (f >= f4) {
                throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
            }
            if (f4 >= f5) {
                throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
            }
        }
    }

    public g(Context context) {
        this(context, null);
    }

    public f getAttacher() {
        return this.f155504r;
    }

    public RectF getDisplayRect() {
        f fVar = this.f155504r;
        fVar.b();
        Matrix matrixC = fVar.c();
        RectF rectF = fVar.f155497n;
        if (fVar.f155493h.getDrawable() == null) {
            return null;
        }
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
        matrixC.mapRect(rectF);
        return rectF;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f155504r.f155495l;
    }

    public float getMaximumScale() {
        return this.f155504r.e;
    }

    public float getMediumScale() {
        return this.f155504r.d;
    }

    public float getMinimumScale() {
        return this.f155504r.f155491c;
    }

    public float getScale() {
        return this.f155504r.d();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f155504r.v;
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f155504r.f = z;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i5) {
        boolean frame = super.setFrame(i, i2, i3, i5);
        if (frame) {
            this.f155504r.f();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        f fVar = this.f155504r;
        if (fVar != null) {
            fVar.g(fVar.f155493h.getDrawable());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        f fVar = this.f155504r;
        if (fVar != null) {
            fVar.g(fVar.f155493h.getDrawable());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri2) {
        super.setImageURI(uri2);
        f fVar = this.f155504r;
        if (fVar != null) {
            fVar.g(fVar.f155493h.getDrawable());
        }
    }

    public void setMaximumScale(float f) {
        f fVar = this.f155504r;
        a.a(fVar.f155491c, fVar.d, f);
        fVar.e = f;
    }

    public void setMediumScale(float f) {
        f fVar = this.f155504r;
        a.a(fVar.f155491c, f, fVar.e);
        fVar.d = f;
    }

    public void setMinimumScale(float f) {
        f fVar = this.f155504r;
        a.a(f, fVar.d, fVar.e);
        fVar.f155491c = f;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (!this.f155504r.u || onClickListener == null) {
            super.setOnClickListener(onClickListener);
        }
        this.f155504r.f155498p = onClickListener;
        setClickable(onClickListener != null);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f155504r.i.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f155504r.f155499q = onLongClickListener;
    }

    public void setRotationBy(float f) {
        f fVar = this.f155504r;
        fVar.f155496m.postRotate(f % 360.0f);
        fVar.a();
    }

    public void setRotationTo(float f) {
        f fVar = this.f155504r;
        fVar.f155496m.setRotate(f % 360.0f);
        fVar.a();
    }

    public void setScale(float f, float f4, float f5, boolean z) {
        this.f155504r.e(f, f4, f5, z);
    }

    public void setScaleLevels(float f, float f4, float f5) {
        f fVar = this.f155504r;
        fVar.getClass();
        a.a(f, f4, f5);
        fVar.f155491c = f;
        fVar.d = f4;
        fVar.e = f5;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        f fVar = this.f155504r;
        if (fVar == null) {
            this.f155505t = scaleType;
            return;
        }
        fVar.getClass();
        if (scaleType == null) {
            return;
        }
        if (hu0.a.f155476a[scaleType.ordinal()] == 5) {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        if (scaleType != fVar.v) {
            fVar.v = scaleType;
            fVar.f();
        }
    }

    public void setZoomTransitionDuration(int i) {
        this.f155504r.f155490b = i;
    }

    public void setZoomable(boolean z) {
        super.setOnClickListener(z ? null : this.f155504r.f155498p);
        f fVar = this.f155504r;
        fVar.u = z;
        fVar.f();
    }

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setScale(float f) {
        f fVar = this.f155504r;
        g gVar = fVar.f155493h;
        fVar.e(f, gVar.getRight() / 2, gVar.getBottom() / 2, false);
    }

    public g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f155504r = new f(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f155505t;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f155505t = null;
        }
    }

    public void setScale(float f, boolean z) {
        f fVar = this.f155504r;
        g gVar = fVar.f155493h;
        fVar.e(f, gVar.getRight() / 2, gVar.getBottom() / 2, z);
    }
}
