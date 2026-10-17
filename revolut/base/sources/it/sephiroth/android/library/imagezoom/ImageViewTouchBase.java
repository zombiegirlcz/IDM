package it.sephiroth.android.library.imagezoom;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import it.sephiroth.android.library.imagezoom.graphics.FastBitmapDrawable;
import it.sephiroth.android.library.imagezoom.utils.IDisposable;
import m72.b;

/* JADX INFO: loaded from: classes14.dex */
public abstract class ImageViewTouchBase extends ImageView implements IDisposable {
    protected static boolean DEBUG = false;
    public static final float MIN_SCALE_DIFF = 0.1f;
    public static final float ZOOM_INVALID = -1.0f;
    protected Matrix mBaseMatrix;
    protected boolean mBitmapChanged;
    protected RectF mBitmapRect;
    protected RectF mBitmapRectTmp;
    protected PointF mCenter;
    protected RectF mCenterRect;
    private Animator mCurrentAnimation;
    protected int mDefaultAnimationDuration;
    protected final Matrix mDisplayMatrix;
    private OnDrawableChangeListener mDrawableChangeListener;
    protected Runnable mLayoutRunnable;
    protected final float[] mMatrixValues;
    protected int mMaxFlingVelocity;
    protected float mMaxZoom;
    protected boolean mMaxZoomDefined;
    protected int mMinFlingVelocity;
    protected float mMinZoom;
    protected boolean mMinZoomDefined;
    protected Matrix mNextMatrix;
    private OnLayoutChangeListener mOnLayoutChangeListener;
    protected DisplayType mScaleType;
    protected boolean mScaleTypeChanged;
    protected PointF mScrollPoint;
    protected Matrix mSuppMatrix;
    protected boolean mUserScaled;
    protected RectF mViewPort;
    protected RectF mViewPortOld;
    public static final String VERSION = "2.2.5";
    public static final String TAG = "ImageViewTouchBase";

    public enum DisplayType {
        NONE,
        FIT_TO_SCREEN,
        FIT_IF_BIGGER
    }

    public interface OnDrawableChangeListener {
        void onDrawableChanged(Drawable drawable);
    }

    public interface OnLayoutChangeListener {
        void onLayoutChanged(boolean z, int i, int i2, int i3, int i5);
    }

    public ImageViewTouchBase(Context context) {
        this(context, null);
    }

    public void center(boolean z, boolean z3) {
        if (getDrawable() == null) {
            return;
        }
        RectF center = getCenter(this.mSuppMatrix, z, z3);
        float f = center.left;
        if (f == BitmapDescriptorFactory.HUE_RED && center.top == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        postTranslate(f, center.top);
    }

    public void clear() {
        setImageBitmap(null);
    }

    public float computeMaxZoom() {
        if (getDrawable() == null) {
            return 1.0f;
        }
        float fMax = Math.max(this.mBitmapRect.width() / this.mViewPort.width(), this.mBitmapRect.height() / this.mViewPort.height()) * 4.0f;
        if (DEBUG) {
            String str = "computeMaxZoom: " + fMax;
        }
        return fMax;
    }

    public float computeMinZoom() {
        if (DEBUG) {
        }
        if (getDrawable() == null) {
            return 1.0f;
        }
        float fMin = Math.min(1.0f, 1.0f / getScale(this.mBaseMatrix));
        if (DEBUG) {
            String str = "computeMinZoom: " + fMin;
        }
        return fMin;
    }

    @Override // it.sephiroth.android.library.imagezoom.utils.IDisposable
    public void dispose() {
        clear();
    }

    public void fireOnDrawableChangeListener(Drawable drawable) {
        OnDrawableChangeListener onDrawableChangeListener = this.mDrawableChangeListener;
        if (onDrawableChangeListener != null) {
            onDrawableChangeListener.onDrawableChanged(drawable);
        }
    }

    public void fireOnLayoutChangeListener(int i, int i2, int i3, int i5) {
        OnLayoutChangeListener onLayoutChangeListener = this.mOnLayoutChangeListener;
        if (onLayoutChangeListener != null) {
            onLayoutChangeListener.onLayoutChanged(true, i, i2, i3, i5);
        }
    }

    public float getBaseScale() {
        return getScale(this.mBaseMatrix);
    }

    public boolean getBitmapChanged() {
        return this.mBitmapChanged;
    }

    public RectF getBitmapRect() {
        return getBitmapRect(this.mSuppMatrix);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.RectF getCenter(android.graphics.Matrix r7, boolean r8, boolean r9) {
        /*
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.getDrawable()
            r1 = 0
            if (r0 != 0) goto Ld
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>(r1, r1, r1, r1)
            return r7
        Ld:
            android.graphics.RectF r0 = r6.mCenterRect
            r0.set(r1, r1, r1, r1)
            android.graphics.RectF r7 = r6.getBitmapRect(r7)
            float r0 = r7.height()
            float r2 = r7.width()
            r3 = 1073741824(0x40000000, float:2.0)
            if (r9 == 0) goto L55
            android.graphics.RectF r9 = r6.mViewPort
            float r9 = r9.height()
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 >= 0) goto L3d
            android.graphics.RectF r9 = r6.mViewPort
            float r9 = r9.height()
            float r9 = r9 - r0
            float r9 = r9 / r3
            float r0 = r7.top
            android.graphics.RectF r4 = r6.mViewPort
            float r4 = r4.top
            float r0 = r0 - r4
            float r9 = r9 - r0
            goto L56
        L3d:
            float r9 = r7.top
            android.graphics.RectF r0 = r6.mViewPort
            float r4 = r0.top
            int r5 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r5 <= 0) goto L4a
            float r9 = r9 - r4
            float r9 = -r9
            goto L56
        L4a:
            float r9 = r7.bottom
            float r0 = r0.bottom
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 >= 0) goto L55
            float r9 = r0 - r9
            goto L56
        L55:
            r9 = r1
        L56:
            if (r8 == 0) goto L89
            android.graphics.RectF r8 = r6.mViewPort
            float r8 = r8.width()
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 >= 0) goto L73
            android.graphics.RectF r8 = r6.mViewPort
            float r8 = r8.width()
            float r8 = r8 - r2
            float r8 = r8 / r3
            float r7 = r7.left
            android.graphics.RectF r0 = r6.mViewPort
            float r0 = r0.left
            float r7 = r7 - r0
        L71:
            float r8 = r8 - r7
            goto L8a
        L73:
            float r8 = r7.left
            android.graphics.RectF r0 = r6.mViewPort
            float r2 = r0.left
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L80
            float r8 = r8 - r2
            float r8 = -r8
            goto L8a
        L80:
            float r7 = r7.right
            float r8 = r0.right
            int r0 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r0 >= 0) goto L89
            goto L71
        L89:
            r8 = r1
        L8a:
            android.graphics.RectF r7 = r6.mCenterRect
            r7.set(r8, r9, r1, r1)
            android.graphics.RectF r7 = r6.mCenterRect
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.imagezoom.ImageViewTouchBase.getCenter(android.graphics.Matrix, boolean, boolean):android.graphics.RectF");
    }

    public float getDefaultScale(DisplayType displayType) {
        if (displayType == DisplayType.FIT_TO_SCREEN) {
            return 1.0f;
        }
        return displayType == DisplayType.FIT_IF_BIGGER ? Math.min(1.0f, 1.0f / getScale(this.mBaseMatrix)) : 1.0f / getScale(this.mBaseMatrix);
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.mSuppMatrix);
    }

    public DisplayType getDisplayType() {
        return this.mScaleType;
    }

    public Matrix getImageViewMatrix() {
        return getImageViewMatrix(this.mSuppMatrix);
    }

    public float getMaxScale() {
        if (this.mMaxZoom == -1.0f) {
            this.mMaxZoom = computeMaxZoom();
        }
        return this.mMaxZoom;
    }

    public float getMinScale() {
        if (DEBUG) {
            String str = "getMinScale, mMinZoom: " + this.mMinZoom;
        }
        if (this.mMinZoom == -1.0f) {
            this.mMinZoom = computeMinZoom();
        }
        if (DEBUG) {
            String str2 = "mMinZoom: " + this.mMinZoom;
        }
        return this.mMinZoom;
    }

    public void getProperBaseMatrix(Drawable drawable, Matrix matrix, RectF rectF) {
        float fWidth = this.mBitmapRect.width();
        float fHeight = this.mBitmapRect.height();
        matrix.reset();
        float fMin = Math.min(rectF.width() / fWidth, rectF.height() / fHeight);
        matrix.postScale(fMin, fMin);
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.postTranslate(b.a(fWidth, fMin, rectF.width(), 2.0f), b.a(fHeight, fMin, rectF.height(), 2.0f));
        printMatrix(matrix);
    }

    @Override // android.view.View
    public float getRotation() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    public float getScale(Matrix matrix) {
        return getValue(matrix, 0);
    }

    public float getValue(Matrix matrix, int i) {
        matrix.getValues(this.mMatrixValues);
        return this.mMatrixValues[i];
    }

    public void init(Context context, AttributeSet attributeSet, int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mDefaultAnimationDuration = getResources().getInteger(android.R.integer.config_shortAnimTime);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (DEBUG) {
            String str = "onConfigurationChanged. scale: " + getScale() + ", minScale: " + getMinScale() + ", mUserScaled: " + this.mUserScaled;
        }
        if (this.mUserScaled) {
            this.mUserScaled = Math.abs(getScale() - getMinScale()) > 0.1f;
        }
        if (DEBUG) {
            String str2 = "mUserScaled: " + this.mUserScaled;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (getScaleType() != ImageView.ScaleType.FIT_XY) {
            super.onDraw(canvas);
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public void onDrawableChanged(Drawable drawable) {
        if (DEBUG) {
            String str = "scale: " + getScale() + ", minScale: " + getMinScale();
        }
        fireOnDrawableChangeListener(drawable);
    }

    public void onImageMatrixChanged() {
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i5) {
        float fWidth;
        float fHeight;
        boolean z3;
        float defaultScale;
        float f;
        boolean z4;
        float f4;
        if (DEBUG) {
            String str = "onLayout: " + z + ", bitmapChanged: " + this.mBitmapChanged + ", scaleChanged: " + this.mScaleTypeChanged;
        }
        if (z) {
            this.mViewPortOld.set(this.mViewPort);
            onViewPortChanged(i, i2, i3, i5);
            fWidth = this.mViewPort.width() - this.mViewPortOld.width();
            fHeight = this.mViewPort.height() - this.mViewPortOld.height();
        } else {
            fWidth = BitmapDescriptorFactory.HUE_RED;
            fHeight = 0.0f;
        }
        super.onLayout(z, i, i2, i3, i5);
        Runnable runnable = this.mLayoutRunnable;
        if (runnable != null) {
            this.mLayoutRunnable = null;
            runnable.run();
        }
        Drawable drawable = getDrawable();
        if (drawable == null) {
            if (this.mBitmapChanged) {
                onDrawableChanged(drawable);
            }
            if (z || this.mBitmapChanged || this.mScaleTypeChanged) {
                onLayoutChanged(i, i2, i3, i5);
            }
            if (this.mBitmapChanged) {
                z3 = false;
                this.mBitmapChanged = false;
            } else {
                z3 = false;
            }
            if (this.mScaleTypeChanged) {
                this.mScaleTypeChanged = z3;
                return;
            }
            return;
        }
        if (z || this.mScaleTypeChanged || this.mBitmapChanged) {
            if (this.mBitmapChanged) {
                this.mUserScaled = false;
                this.mBaseMatrix.reset();
                if (!this.mMinZoomDefined) {
                    this.mMinZoom = -1.0f;
                }
                if (!this.mMaxZoomDefined) {
                    this.mMaxZoom = -1.0f;
                }
            }
            float defaultScale2 = getDefaultScale(getDisplayType());
            float scale = getScale(this.mBaseMatrix);
            float scale2 = getScale();
            float fMin = Math.min(1.0f, 1.0f / scale);
            getProperBaseMatrix(drawable, this.mBaseMatrix, this.mViewPort);
            float scale3 = getScale(this.mBaseMatrix);
            if (DEBUG) {
                String str2 = "old matrix scale: " + scale;
                String str3 = "new matrix scale: " + scale3;
                String str4 = "old min scale: " + fMin;
                String str5 = "old scale: " + scale2;
            }
            if (this.mBitmapChanged || this.mScaleTypeChanged) {
                if (DEBUG) {
                    String str6 = "display type: " + getDisplayType();
                    String str7 = "newMatrix: " + this.mNextMatrix;
                }
                Matrix matrix = this.mNextMatrix;
                if (matrix != null) {
                    this.mSuppMatrix.set(matrix);
                    this.mNextMatrix = null;
                    defaultScale = getScale();
                } else {
                    this.mSuppMatrix.reset();
                    defaultScale = getDefaultScale(getDisplayType());
                }
                f = defaultScale;
                setImageMatrix(getImageViewMatrix());
                if (f != getScale()) {
                    if (DEBUG) {
                        String str8 = "scale != getScale: " + f + " != " + getScale();
                    }
                    zoomTo(f);
                }
            } else if (z) {
                if (this.mMinZoomDefined) {
                    f4 = -1.0f;
                } else {
                    f4 = -1.0f;
                    this.mMinZoom = -1.0f;
                }
                if (!this.mMaxZoomDefined) {
                    this.mMaxZoom = f4;
                }
                setImageMatrix(getImageViewMatrix());
                postTranslate(-fWidth, -fHeight);
                if (this.mUserScaled) {
                    f = Math.abs(scale2 - fMin) > 0.1f ? (scale / scale3) * scale2 : 1.0f;
                    if (DEBUG) {
                        String str9 = "userScaled. scale=" + f;
                    }
                    zoomTo(f);
                } else {
                    float defaultScale3 = getDefaultScale(getDisplayType());
                    if (DEBUG) {
                        String str10 = "!userScaled. scale=" + defaultScale3;
                    }
                    zoomTo(defaultScale3);
                    f = defaultScale3;
                }
                if (DEBUG) {
                    String str11 = "old min scale: " + defaultScale2;
                    String str12 = "old scale: " + scale2;
                    String str13 = "new scale: " + f;
                }
            } else {
                f = 1.0f;
            }
            if (f > getMaxScale() || f < getMinScale()) {
                zoomTo(f);
            }
            center(true, true);
            if (this.mBitmapChanged) {
                onDrawableChanged(drawable);
            }
            if (z || this.mBitmapChanged || this.mScaleTypeChanged) {
                onLayoutChanged(i, i2, i3, i5);
            }
            if (this.mScaleTypeChanged) {
                z4 = false;
                this.mScaleTypeChanged = false;
            } else {
                z4 = false;
            }
            if (this.mBitmapChanged) {
                this.mBitmapChanged = z4;
            }
            if (DEBUG) {
                String str14 = "scale: " + getScale() + ", minScale: " + getMinScale() + ", maxScale: " + getMaxScale();
            }
        }
    }

    public void onLayoutChanged(int i, int i2, int i3, int i5) {
        if (DEBUG) {
        }
        fireOnLayoutChangeListener(i, i2, i3, i5);
    }

    public void onViewPortChanged(float f, float f4, float f5, float f6) {
        this.mViewPort.set(f, f4, f5, f6);
        this.mCenter.x = this.mViewPort.centerX();
        this.mCenter.y = this.mViewPort.centerY();
    }

    public void onZoom(float f) {
    }

    public void onZoomAnimationCompleted(float f) {
    }

    public void panBy(double d, double d5) {
        RectF bitmapRect = getBitmapRect();
        this.mScrollPoint.set((float) d, (float) d5);
        updateRect(bitmapRect, this.mScrollPoint);
        PointF pointF = this.mScrollPoint;
        float f = pointF.x;
        if (f == BitmapDescriptorFactory.HUE_RED && pointF.y == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        postTranslate(f, pointF.y);
        center(true, true);
    }

    public void postScale(float f, float f4, float f5) {
        this.mSuppMatrix.postScale(f, f, f4, f5);
        setImageMatrix(getImageViewMatrix());
    }

    public void postTranslate(float f, float f4) {
        if (f == BitmapDescriptorFactory.HUE_RED && f4 == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        this.mSuppMatrix.postTranslate(f, f4);
        setImageMatrix(getImageViewMatrix());
    }

    public void printMatrix(Matrix matrix) {
        float value = getValue(matrix, 0);
        float value2 = getValue(matrix, 4);
        String str = "matrix: { x: " + getValue(matrix, 2) + ", y: " + getValue(matrix, 5) + ", scalex: " + value + ", scaley: " + value2 + " }";
    }

    public void resetDisplay() {
        this.mBitmapChanged = true;
        requestLayout();
    }

    public void resetMatrix() {
        if (DEBUG) {
        }
        this.mSuppMatrix = new Matrix();
        float defaultScale = getDefaultScale(getDisplayType());
        setImageMatrix(getImageViewMatrix());
        if (DEBUG) {
            String str = "default scale: " + defaultScale + ", scale: " + getScale();
        }
        if (defaultScale != getScale()) {
            zoomTo(defaultScale);
        }
        postInvalidate();
    }

    public void scrollBy(float f, float f4) {
        panBy(f, f4);
    }

    public void setDisplayType(DisplayType displayType) {
        if (displayType != this.mScaleType) {
            if (DEBUG) {
                String str = "setDisplayType: " + displayType;
            }
            this.mUserScaled = false;
            this.mScaleType = displayType;
            this.mScaleTypeChanged = true;
            requestLayout();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageBitmap(bitmap, null, -1.0f, -1.0f);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        setImageDrawable(drawable, null, -1.0f, -1.0f);
    }

    public void setImageDrawableInternal(Drawable drawable, Matrix matrix, float f, float f4) {
        this.mBaseMatrix.reset();
        super.setImageDrawable(drawable);
        if (f == -1.0f || f4 == -1.0f) {
            this.mMinZoom = -1.0f;
            this.mMaxZoom = -1.0f;
            this.mMinZoomDefined = false;
            this.mMaxZoomDefined = false;
        } else {
            float fMin = Math.min(f, f4);
            float fMax = Math.max(fMin, f4);
            this.mMinZoom = fMin;
            this.mMaxZoom = fMax;
            this.mMinZoomDefined = true;
            this.mMaxZoomDefined = true;
            if (getDisplayType() == DisplayType.FIT_TO_SCREEN || getDisplayType() == DisplayType.FIT_IF_BIGGER) {
                if (this.mMinZoom >= 1.0f) {
                    this.mMinZoomDefined = false;
                    this.mMinZoom = -1.0f;
                }
                if (this.mMaxZoom <= 1.0f) {
                    this.mMaxZoomDefined = true;
                    this.mMaxZoom = -1.0f;
                }
            }
        }
        if (matrix != null) {
            this.mNextMatrix = new Matrix(matrix);
        }
        if (DEBUG) {
            String str = "mMinZoom: " + this.mMinZoom + ", mMaxZoom: " + this.mMaxZoom;
        }
        this.mBitmapChanged = true;
        updateDrawable(drawable);
        requestLayout();
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        Matrix imageMatrix = getImageMatrix();
        boolean z = (matrix == null && !imageMatrix.isIdentity()) || !(matrix == null || imageMatrix.equals(matrix));
        super.setImageMatrix(matrix);
        if (z) {
            onImageMatrixChanged();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        setImageDrawable(getContext().getResources().getDrawable(i));
    }

    public void setMaxScale(float f) {
        if (DEBUG) {
            String str = "setMaxZoom: " + f;
        }
        this.mMaxZoom = f;
    }

    public void setMinScale(float f) {
        if (DEBUG) {
            String str = "setMinZoom: " + f;
        }
        this.mMinZoom = f;
    }

    public void setOnDrawableChangedListener(OnDrawableChangeListener onDrawableChangeListener) {
        this.mDrawableChangeListener = onDrawableChangeListener;
    }

    public void setOnLayoutChangeListener(OnLayoutChangeListener onLayoutChangeListener) {
        this.mOnLayoutChangeListener = onLayoutChangeListener;
    }

    public void stopAllAnimations() {
        Animator animator = this.mCurrentAnimation;
        if (animator != null) {
            animator.cancel();
            this.mCurrentAnimation = null;
        }
    }

    public void updateDrawable(Drawable drawable) {
        if (drawable != null) {
            this.mBitmapRect.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        } else {
            this.mBitmapRect.setEmpty();
        }
    }

    public void updateRect(RectF rectF, PointF pointF) {
    }

    public void zoomTo(float f) {
        if (DEBUG) {
            String str = "zoomTo: " + f;
        }
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        if (f < getMinScale()) {
            f = getMinScale();
        }
        if (DEBUG) {
            String str2 = "sanitized scale: " + f;
        }
        PointF center = getCenter();
        zoomTo(f, center.x, center.y);
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RectF getBitmapRect(Matrix matrix) {
        getImageViewMatrix(matrix).mapRect(this.mBitmapRectTmp, this.mBitmapRect);
        return this.mBitmapRectTmp;
    }

    public Matrix getImageViewMatrix(Matrix matrix) {
        this.mDisplayMatrix.set(this.mBaseMatrix);
        this.mDisplayMatrix.postConcat(matrix);
        return this.mDisplayMatrix;
    }

    public float getScale() {
        return getScale(this.mSuppMatrix);
    }

    public void scrollBy(float f, float f4, long j2) {
        final ValueAnimator duration = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, f).setDuration(j2);
        final ValueAnimator duration2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, f4).setDuration(j2);
        stopAllAnimations();
        AnimatorSet animatorSet = new AnimatorSet();
        this.mCurrentAnimation = animatorSet;
        animatorSet.playTogether(duration, duration2);
        this.mCurrentAnimation.setDuration(j2);
        this.mCurrentAnimation.setInterpolator(new DecelerateInterpolator());
        this.mCurrentAnimation.start();
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: it.sephiroth.android.library.imagezoom.ImageViewTouchBase.2
            float oldValueX = BitmapDescriptorFactory.HUE_RED;
            float oldValueY = BitmapDescriptorFactory.HUE_RED;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) duration.getAnimatedValue()).floatValue();
                float fFloatValue2 = ((Float) duration2.getAnimatedValue()).floatValue();
                ImageViewTouchBase.this.panBy(fFloatValue - this.oldValueX, fFloatValue2 - this.oldValueY);
                this.oldValueX = fFloatValue;
                this.oldValueY = fFloatValue2;
                ImageViewTouchBase.this.postInvalidateOnAnimation();
            }
        });
        this.mCurrentAnimation.addListener(new Animator.AnimatorListener() { // from class: it.sephiroth.android.library.imagezoom.ImageViewTouchBase.3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ImageViewTouchBase imageViewTouchBase = ImageViewTouchBase.this;
                RectF center = imageViewTouchBase.getCenter(imageViewTouchBase.mSuppMatrix, true, true);
                float f5 = center.left;
                if (f5 == BitmapDescriptorFactory.HUE_RED && center.top == BitmapDescriptorFactory.HUE_RED) {
                    return;
                }
                ImageViewTouchBase.this.scrollBy(f5, center.top);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
    }

    public void setImageBitmap(Bitmap bitmap, Matrix matrix, float f, float f4) {
        if (bitmap != null) {
            setImageDrawable(new FastBitmapDrawable(bitmap), matrix, f, f4);
        } else {
            setImageDrawable(null, matrix, f, f4);
        }
    }

    public void setImageDrawable(final Drawable drawable, final Matrix matrix, final float f, final float f4) {
        if (getWidth() <= 0) {
            this.mLayoutRunnable = new Runnable() { // from class: it.sephiroth.android.library.imagezoom.ImageViewTouchBase.1
                @Override // java.lang.Runnable
                public void run() {
                    ImageViewTouchBase.this.setImageDrawable(drawable, matrix, f, f4);
                }
            };
        } else {
            setImageDrawableInternal(drawable, matrix, f, f4);
        }
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaseMatrix = new Matrix();
        this.mSuppMatrix = new Matrix();
        this.mLayoutRunnable = null;
        this.mUserScaled = false;
        this.mMaxZoom = -1.0f;
        this.mMinZoom = -1.0f;
        this.mDisplayMatrix = new Matrix();
        this.mMatrixValues = new float[9];
        this.mScaleType = DisplayType.FIT_IF_BIGGER;
        this.mCenter = new PointF();
        this.mBitmapRect = new RectF();
        this.mBitmapRectTmp = new RectF();
        this.mCenterRect = new RectF();
        this.mScrollPoint = new PointF();
        this.mViewPort = new RectF();
        this.mViewPortOld = new RectF();
        init(context, attributeSet, i);
    }

    public void zoomTo(float f, long j2) {
        PointF center = getCenter();
        zoomTo(f, center.x, center.y, j2);
    }

    public void zoomTo(float f, float f4, float f5) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        postScale(f / getScale(), f4, f5);
        onZoom(getScale());
        center(true, true);
    }

    public PointF getCenter() {
        return this.mCenter;
    }

    public void zoomTo(float f, float f4, float f5, long j2) {
        if (f > getMaxScale()) {
            f = getMaxScale();
        }
        float scale = getScale();
        Matrix matrix = new Matrix(this.mSuppMatrix);
        matrix.postScale(f, f, f4, f5);
        RectF center = getCenter(matrix, true, true);
        final float f6 = (center.left * f) + f4;
        final float f32 = (center.top * f) + f5;
        stopAllAnimations();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(scale, f);
        valueAnimatorOfFloat.setDuration(j2);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.0f));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: it.sephiroth.android.library.imagezoom.ImageViewTouchBase.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ImageViewTouchBase.this.zoomTo(((Float) valueAnimator.getAnimatedValue()).floatValue(), f6, f32);
                ImageViewTouchBase.this.postInvalidateOnAnimation();
            }
        });
        valueAnimatorOfFloat.start();
    }
}
