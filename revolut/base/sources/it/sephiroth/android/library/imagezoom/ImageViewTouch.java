package it.sephiroth.android.library.imagezoom;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes14.dex */
public class ImageViewTouch extends ImageViewTouchBase {
    public static final long MIN_FLING_DELTA_TIME = 150;
    static final float SCROLL_DELTA_THRESHOLD = 1.0f;
    protected int mDoubleTapDirection;
    protected boolean mDoubleTapEnabled;
    private OnImageViewTouchDoubleTapListener mDoubleTapListener;
    protected GestureDetector mGestureDetector;
    protected GestureDetector.OnGestureListener mGestureListener;
    long mPointerUpTime;
    protected ScaleGestureDetector mScaleDetector;
    protected boolean mScaleEnabled;
    private float mScaleFactor;
    protected ScaleGestureDetector.OnScaleGestureListener mScaleListener;
    protected boolean mScrollEnabled;
    private OnImageViewTouchSingleTapListener mSingleTapListener;
    protected int mTouchSlop;

    public class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public GestureListener() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (ImageViewTouchBase.DEBUG) {
                String str = "onDoubleTap. double tap enabled? " + ImageViewTouch.this.mDoubleTapEnabled;
            }
            ImageViewTouch imageViewTouch = ImageViewTouch.this;
            if (imageViewTouch.mDoubleTapEnabled) {
                if (imageViewTouch.mScaleDetector.isQuickScaleEnabled()) {
                    return true;
                }
                ImageViewTouch imageViewTouch2 = ImageViewTouch.this;
                imageViewTouch2.mUserScaled = true;
                float scale = imageViewTouch2.getScale();
                ImageViewTouch imageViewTouch3 = ImageViewTouch.this;
                ImageViewTouch.this.zoomTo(Math.min(ImageViewTouch.this.getMaxScale(), Math.max(imageViewTouch3.onDoubleTapPost(scale, imageViewTouch3.getMaxScale(), ImageViewTouch.this.getMinScale()), ImageViewTouch.this.getMinScale())), motionEvent.getX(), motionEvent.getY(), ImageViewTouch.this.mDefaultAnimationDuration);
            }
            if (ImageViewTouch.this.mDoubleTapListener != null) {
                ImageViewTouch.this.mDoubleTapListener.onDoubleTap();
            }
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            if (ImageViewTouchBase.DEBUG) {
            }
            ImageViewTouch.this.stopAllAnimations();
            return ImageViewTouch.this.onDown(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f4) {
            if (!ImageViewTouch.this.mScrollEnabled || motionEvent == null || motionEvent2 == null || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || ImageViewTouch.this.mScaleDetector.isInProgress()) {
                return false;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            ImageViewTouch imageViewTouch = ImageViewTouch.this;
            if (jUptimeMillis - imageViewTouch.mPointerUpTime > 150) {
                return imageViewTouch.onFling(motionEvent, motionEvent2, f, f4);
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (!ImageViewTouch.this.isLongClickable() || ImageViewTouch.this.mScaleDetector.isInProgress()) {
                return;
            }
            ImageViewTouch.this.setPressed(true);
            ImageViewTouch.this.performLongClick();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f4) {
            if (ImageViewTouch.this.mScrollEnabled && motionEvent != null && motionEvent2 != null && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !ImageViewTouch.this.mScaleDetector.isInProgress()) {
                return ImageViewTouch.this.onScroll(motionEvent, motionEvent2, f, f4);
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (ImageViewTouch.this.mSingleTapListener != null) {
                ImageViewTouch.this.mSingleTapListener.onSingleTapConfirmed();
            }
            return ImageViewTouch.this.onSingleTapConfirmed(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return ImageViewTouch.this.onSingleTapUp(motionEvent);
        }
    }

    public interface OnImageViewTouchDoubleTapListener {
        void onDoubleTap();
    }

    public interface OnImageViewTouchSingleTapListener {
        void onSingleTapConfirmed();
    }

    public class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        protected boolean mScaled = false;

        public ScaleListener() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
            float scaleFactor = scaleGestureDetector.getScaleFactor() * ImageViewTouch.this.getScale();
            ImageViewTouch imageViewTouch = ImageViewTouch.this;
            if (imageViewTouch.mScaleEnabled) {
                boolean z = this.mScaled;
                if (z && currentSpan != BitmapDescriptorFactory.HUE_RED) {
                    imageViewTouch.mUserScaled = true;
                    ImageViewTouch.this.zoomTo(Math.min(imageViewTouch.getMaxScale(), Math.max(scaleFactor, ImageViewTouch.this.getMinScale() - 0.1f)), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    ImageViewTouch imageViewTouch2 = ImageViewTouch.this;
                    imageViewTouch2.mDoubleTapDirection = 1;
                    imageViewTouch2.invalidate();
                    return true;
                }
                if (!z) {
                    this.mScaled = true;
                }
            }
            return true;
        }
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDoubleTapEnabled = true;
        this.mScaleEnabled = true;
        this.mScrollEnabled = true;
    }

    public boolean canScroll() {
        if (getScale() > 1.0f) {
            return true;
        }
        return !this.mViewPort.contains(getBitmapRect());
    }

    public boolean getDoubleTapEnabled() {
        return this.mDoubleTapEnabled;
    }

    public GestureDetector.OnGestureListener getGestureListener() {
        return new GestureListener();
    }

    public boolean getQuickScaleEnabled() {
        return this.mScaleDetector.isQuickScaleEnabled();
    }

    public float getScaleFactor() {
        return this.mScaleFactor;
    }

    public ScaleGestureDetector.OnScaleGestureListener getScaleListener() {
        return new ScaleListener();
    }

    @Override // it.sephiroth.android.library.imagezoom.ImageViewTouchBase
    public void init(Context context, AttributeSet attributeSet, int i) {
        super.init(context, attributeSet, i);
        this.mTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.mGestureListener = getGestureListener();
        this.mScaleListener = getScaleListener();
        this.mScaleDetector = new ScaleGestureDetector(getContext(), this.mScaleListener);
        this.mGestureDetector = new GestureDetector(getContext(), this.mGestureListener, null, true);
        this.mDoubleTapDirection = 1;
        setQuickScaleEnabled(false);
    }

    public float onDoubleTapPost(float f, float f4, float f5) {
        float f6 = this.mScaleFactor;
        return f + f6 <= f4 ? f + f6 : f5;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return !getBitmapChanged();
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f4) {
        if (!canScroll()) {
            return false;
        }
        if (ImageViewTouchBase.DEBUG) {
        }
        if (Math.abs(f) <= this.mMinFlingVelocity * 4 && Math.abs(f4) <= this.mMinFlingVelocity * 4) {
            return false;
        }
        if (ImageViewTouchBase.DEBUG) {
            String str = "velocity: " + f4;
            String str2 = "diff: " + (motionEvent2.getY() - motionEvent.getY());
        }
        float fMin = Math.min(Math.max(2.0f, getScale() / 2.0f), 3.0f);
        float width = getWidth() * fMin * (f / this.mMaxFlingVelocity);
        float height = getHeight() * fMin * (f4 / this.mMaxFlingVelocity);
        if (ImageViewTouchBase.DEBUG) {
            String str3 = "scale: " + getScale() + ", scale_final: " + fMin;
            String str4 = "scaledDistanceX: " + width;
            String str5 = "scaledDistanceY: " + height;
        }
        this.mUserScaled = true;
        scrollBy(width, height, (long) Math.min(Math.max(300.0d, Math.sqrt(Math.pow(height, 2.0d) + Math.pow(width, 2.0d)) / 5.0d), 800.0d));
        postInvalidate();
        return true;
    }

    @Override // it.sephiroth.android.library.imagezoom.ImageViewTouchBase
    public void onLayoutChanged(int i, int i2, int i3, int i5) {
        super.onLayoutChanged(i, i2, i3, i5);
        String str = "min: " + getMinScale() + ", max: " + getMaxScale() + ", result: " + ((getMaxScale() - getMinScale()) / 2.0f);
        this.mScaleFactor = ((getMaxScale() - getMinScale()) / 2.0f) + 0.5f;
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f4) {
        if (!canScroll()) {
            return false;
        }
        this.mUserScaled = true;
        scrollBy(-f, -f4);
        invalidate();
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return !getBitmapChanged();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getBitmapChanged()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 6) {
            this.mPointerUpTime = motionEvent.getEventTime();
        }
        this.mScaleDetector.onTouchEvent(motionEvent);
        if (!this.mScaleDetector.isInProgress()) {
            this.mGestureDetector.onTouchEvent(motionEvent);
        }
        if (actionMasked != 1) {
            return true;
        }
        return onUp(motionEvent);
    }

    public boolean onUp(MotionEvent motionEvent) {
        if (getBitmapChanged()) {
            return false;
        }
        if (getScale() >= getMinScale()) {
            return true;
        }
        zoomTo(getMinScale(), 50L);
        return true;
    }

    @Override // it.sephiroth.android.library.imagezoom.ImageViewTouchBase
    public void onZoomAnimationCompleted(float f) {
        if (ImageViewTouchBase.DEBUG) {
            String str = "onZoomAnimationCompleted. scale: " + f + ", minZoom: " + getMinScale();
        }
        if (f < getMinScale()) {
            zoomTo(getMinScale(), 50L);
        }
    }

    public void setDoubleTapEnabled(boolean z) {
        this.mDoubleTapEnabled = z;
    }

    public void setDoubleTapListener(OnImageViewTouchDoubleTapListener onImageViewTouchDoubleTapListener) {
        this.mDoubleTapListener = onImageViewTouchDoubleTapListener;
    }

    public void setQuickScaleEnabled(boolean z) {
        this.mScaleDetector.setQuickScaleEnabled(z);
    }

    public void setScaleEnabled(boolean z) {
        this.mScaleEnabled = z;
    }

    public void setScrollEnabled(boolean z) {
        this.mScrollEnabled = z;
    }

    public void setSingleTapListener(OnImageViewTouchSingleTapListener onImageViewTouchSingleTapListener) {
        this.mSingleTapListener = onImageViewTouchSingleTapListener;
    }

    public boolean canScroll(int i) {
        RectF bitmapRect = getBitmapRect();
        updateRect(bitmapRect, this.mScrollPoint);
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        if (bitmapRect == null) {
            return false;
        }
        float f = bitmapRect.right;
        int i2 = rect.right;
        return (f < ((float) i2) || i >= 0) ? ((double) Math.abs(bitmapRect.left - this.mScrollPoint.x)) > 1.0d : Math.abs(f - ((float) i2)) > 1.0f;
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDoubleTapEnabled = true;
        this.mScaleEnabled = true;
        this.mScrollEnabled = true;
    }
}
