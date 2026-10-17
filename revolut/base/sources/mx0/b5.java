package mx0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.graphics.drawable.DrawableKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.CroppingLayoutView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b5 extends AppCompatImageView {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Matrix f209598r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f209599t;
    public float u;
    public final float[] v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ScaleGestureDetector f209600w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final GestureDetector f209601x;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b5(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return true;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return true;
    }

    public final Bitmap getCroppedImage() {
        Bitmap bitmap$default;
        ViewParent parent = getParent();
        Intrinsics.i(parent, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.CroppingLayoutView");
        View croppingAreaView$ui_kit_components_release = ((CroppingLayoutView) parent).getCroppingAreaView$ui_kit_components_release();
        float[] fArr = new float[9];
        getImageMatrix().getValues(fArr);
        float f = fArr[0];
        Drawable drawable = getDrawable();
        if (drawable == null || (bitmap$default = DrawableKt.toBitmap$default(drawable, (int) Math.ceil(getDrawable().getIntrinsicWidth() * f), (int) Math.ceil(getDrawable().getIntrinsicHeight() * f), null, 4, null)) == null) {
            return null;
        }
        return Bitmap.createBitmap(bitmap$default, croppingAreaView$ui_kit_components_release.getLeft() - ((int) fArr[2]), croppingAreaView$ui_kit_components_release.getTop() - ((int) fArr[5]), croppingAreaView$ui_kit_components_release.getWidth(), croppingAreaView$ui_kit_components_release.getHeight());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (getDrawable() == null) {
            return false;
        }
        this.f209600w.onTouchEvent(event);
        this.f209601x.onTouchEvent(event);
        ViewParent parent = getParent();
        Intrinsics.i(parent, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.CroppingLayoutView");
        View croppingAreaView$ui_kit_components_release = ((CroppingLayoutView) parent).getCroppingAreaView$ui_kit_components_release();
        Matrix matrix = this.f209598r;
        float[] fArr = this.v;
        matrix.getValues(fArr);
        float f = fArr[0];
        float f4 = fArr[2];
        float f5 = fArr[5];
        float intrinsicWidth = (getDrawable().getIntrinsicWidth() * f) + f4;
        float intrinsicHeight = (getDrawable().getIntrinsicHeight() * f) + f5;
        float left = croppingAreaView$ui_kit_components_release.getLeft();
        float bottom = BitmapDescriptorFactory.HUE_RED;
        float left2 = left < f4 ? f4 - croppingAreaView$ui_kit_components_release.getLeft() : intrinsicWidth < ((float) croppingAreaView$ui_kit_components_release.getRight()) ? intrinsicWidth - croppingAreaView$ui_kit_components_release.getRight() : 0.0f;
        if (croppingAreaView$ui_kit_components_release.getTop() < f5) {
            bottom = f5 - croppingAreaView$ui_kit_components_release.getTop();
        } else if (intrinsicHeight < croppingAreaView$ui_kit_components_release.getBottom()) {
            bottom = intrinsicHeight - croppingAreaView$ui_kit_components_release.getBottom();
        }
        matrix.postTranslate(-left2, -bottom);
        setImageMatrix(matrix);
        return true;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        float width;
        int intrinsicWidth;
        super.setImageDrawable(drawable);
        if (drawable != null) {
            ViewParent parent = getParent();
            Intrinsics.i(parent, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.CroppingLayoutView");
            View croppingAreaView$ui_kit_components_release = ((CroppingLayoutView) parent).getCroppingAreaView$ui_kit_components_release();
            if (getDrawable().getIntrinsicWidth() / getDrawable().getIntrinsicHeight() > croppingAreaView$ui_kit_components_release.getWidth() / croppingAreaView$ui_kit_components_release.getHeight()) {
                width = croppingAreaView$ui_kit_components_release.getHeight();
                intrinsicWidth = getDrawable().getIntrinsicHeight();
            } else {
                width = croppingAreaView$ui_kit_components_release.getWidth();
                intrinsicWidth = getDrawable().getIntrinsicWidth();
            }
            float f = width / intrinsicWidth;
            if (this.f209599t == f) {
                return;
            }
            this.f209599t = f;
            this.u = 4.0f * f;
            Matrix matrix = this.f209598r;
            matrix.postScale(f, f);
            matrix.postTranslate(m72.b.a(getDrawable().getIntrinsicWidth(), f, croppingAreaView$ui_kit_components_release.getRight() + croppingAreaView$ui_kit_components_release.getLeft(), 2.0f), m72.b.a(getDrawable().getIntrinsicHeight(), f, croppingAreaView$ui_kit_components_release.getBottom() + croppingAreaView$ui_kit_components_release.getTop(), 2.0f));
            setImageMatrix(matrix);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b5(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f209598r = new Matrix();
        this.f209599t = 1.0f;
        this.u = 4.0f;
        this.v = new float[9];
        this.f209600w = new ScaleGestureDetector(context, new c5(this));
        this.f209601x = new GestureDetector(context, new bx0.q(this, 7));
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public /* synthetic */ b5(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
