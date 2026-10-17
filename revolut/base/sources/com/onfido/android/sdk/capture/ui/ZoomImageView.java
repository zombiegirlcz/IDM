package com.onfido.android.sdk.capture.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes17.dex */
public class ZoomImageView extends AppCompatImageView {
    private static final float SUPER_MAX_MULTIPLIER = 1.25f;
    private static final float SUPER_MIN_MULTIPLIER = 0.75f;
    private ZoomVariables delayedZoomVariables;
    private boolean imageRenderedAtLeastOnce;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float[] f49987m;
    private GestureDetector mGestureDetector;
    private ScaleGestureDetector mScaleDetector;
    private ImageView.ScaleType mScaleType;
    private float matchViewHeight;
    private float matchViewWidth;
    private Matrix matrix;
    private float maxScale;
    private float minScale;
    private float normalizedScale;
    private boolean onDrawReady;
    private float prevMatchViewHeight;
    private float prevMatchViewWidth;
    private Matrix prevMatrix;
    private int prevViewHeight;
    private int prevViewWidth;
    private State state;
    private float superMaxScale;
    private float superMinScale;
    private OnTouchImageViewListener touchImageViewListener;
    private View.OnTouchListener userTouchListener;
    private int viewHeight;
    private int viewWidth;

    /* JADX INFO: renamed from: com.onfido.android.sdk.capture.ui.ZoomImageView$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public class DoubleTapZoom implements Runnable {
        private static final float ZOOM_TIME = 200.0f;
        private float bitmapX;
        private float bitmapY;
        private PointF endTouch;
        private AccelerateDecelerateInterpolator interpolator = new AccelerateDecelerateInterpolator();
        private long startTime;
        private PointF startTouch;
        private float startZoom;
        private boolean stretchImageToSuper;
        private float targetZoom;

        public DoubleTapZoom(float f, float f4, float f5, boolean z) {
            ZoomImageView.this.setState(State.ANIMATE_ZOOM);
            this.startTime = System.currentTimeMillis();
            this.startZoom = ZoomImageView.this.normalizedScale;
            this.targetZoom = f;
            this.stretchImageToSuper = z;
            PointF pointFY = ZoomImageView.y(ZoomImageView.this, f4, f5);
            float f6 = pointFY.x;
            this.bitmapX = f6;
            float f32 = pointFY.y;
            this.bitmapY = f32;
            this.startTouch = ZoomImageView.this.transformCoordBitmapToTouch(f6, f32);
            this.endTouch = new PointF(ZoomImageView.this.viewWidth / 2, ZoomImageView.this.viewHeight / 2);
        }

        private double calculateDeltaScale(float f) {
            float f4 = this.startZoom;
            return ((double) j6.a.a(this.targetZoom, f4, f, f4)) / ((double) ZoomImageView.this.normalizedScale);
        }

        private float interpolate() {
            return this.interpolator.getInterpolation(Math.min(1.0f, (System.currentTimeMillis() - this.startTime) / 200.0f));
        }

        private void translateImageToCenterTouchPosition(float f) {
            PointF pointF = this.startTouch;
            float f4 = pointF.x;
            PointF pointF2 = this.endTouch;
            float fA = j6.a.a(pointF2.x, f4, f, f4);
            float f5 = pointF.y;
            float fA2 = j6.a.a(pointF2.y, f5, f, f5);
            PointF pointFTransformCoordBitmapToTouch = ZoomImageView.this.transformCoordBitmapToTouch(this.bitmapX, this.bitmapY);
            ZoomImageView.this.matrix.postTranslate(fA - pointFTransformCoordBitmapToTouch.x, fA2 - pointFTransformCoordBitmapToTouch.y);
        }

        @Override // java.lang.Runnable
        public void run() {
            float fInterpolate = interpolate();
            ZoomImageView.this.scaleImage(calculateDeltaScale(fInterpolate), this.bitmapX, this.bitmapY, this.stretchImageToSuper);
            translateImageToCenterTouchPosition(fInterpolate);
            ZoomImageView.this.fixScaleTrans();
            ZoomImageView zoomImageView = ZoomImageView.this;
            zoomImageView.setImageMatrix(zoomImageView.matrix);
            OnTouchImageViewListener onTouchImageViewListener = ZoomImageView.this.touchImageViewListener;
            if (onTouchImageViewListener != null) {
                onTouchImageViewListener.onMove();
            }
            if (fInterpolate < 1.0f) {
                ZoomImageView.this.compatPostOnAnimation(this);
            } else {
                ZoomImageView.this.fitImageToView();
                ZoomImageView.this.setState(State.NONE);
            }
        }
    }

    public class GestureListener extends GestureDetector.SimpleOnGestureListener {
        private GestureListener() {
        }

        public /* synthetic */ GestureListener(ZoomImageView zoomImageView, int i) {
            this();
        }
    }

    public interface OnTouchImageViewListener {
        void onMove();
    }

    public class PrivateOnTouchListener implements View.OnTouchListener {
        private PointF last;

        private PrivateOnTouchListener() {
            this.last = new PointF();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            ZoomImageView.this.mScaleDetector.onTouchEvent(motionEvent);
            ZoomImageView.this.mGestureDetector.onTouchEvent(motionEvent);
            PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
            State state = ZoomImageView.this.state;
            State state2 = State.NONE;
            if (state == state2 || state == State.DRAG || state == State.ZOOM) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.last.set(pointF);
                    ZoomImageView.this.setState(State.DRAG);
                } else if (action == 1) {
                    ZoomImageView zoomImageView = ZoomImageView.this;
                    float f = zoomImageView.normalizedScale;
                    float f4 = zoomImageView.minScale;
                    if (f > f4) {
                        ZoomImageView.this.compatPostOnAnimation(zoomImageView.new DoubleTapZoom(f4, motionEvent.getX(), motionEvent.getY(), false));
                    }
                } else if (action == 2) {
                    ZoomImageView zoomImageView2 = ZoomImageView.this;
                    State state3 = zoomImageView2.state;
                    if ((state3 == State.DRAG || state3 == State.ZOOM) && zoomImageView2.normalizedScale > zoomImageView2.minScale) {
                        float f5 = pointF.x;
                        PointF pointF2 = this.last;
                        float f6 = f5 - pointF2.x;
                        float f32 = pointF.y - pointF2.y;
                        float fixDragTrans = zoomImageView2.getFixDragTrans(f6, zoomImageView2.viewWidth, zoomImageView2.getImageWidth());
                        ZoomImageView zoomImageView3 = ZoomImageView.this;
                        ZoomImageView.this.matrix.postTranslate(fixDragTrans, zoomImageView3.getFixDragTrans(f32, zoomImageView3.viewHeight, zoomImageView3.getImageHeight()));
                        ZoomImageView.this.fixTrans();
                        this.last.set(pointF.x, pointF.y);
                    }
                } else if (action == 6) {
                    ZoomImageView.this.setState(state2);
                }
            }
            ZoomImageView zoomImageView4 = ZoomImageView.this;
            zoomImageView4.setImageMatrix(zoomImageView4.matrix);
            View.OnTouchListener onTouchListener = ZoomImageView.this.userTouchListener;
            if (onTouchListener != null) {
                onTouchListener.onTouch(view, motionEvent);
            }
            OnTouchImageViewListener onTouchImageViewListener = ZoomImageView.this.touchImageViewListener;
            if (onTouchImageViewListener != null) {
                onTouchImageViewListener.onMove();
            }
            return true;
        }

        public /* synthetic */ PrivateOnTouchListener(ZoomImageView zoomImageView, int i) {
            this();
        }
    }

    public class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private ScaleListener() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            ZoomImageView.this.scaleImage(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY(), false);
            OnTouchImageViewListener onTouchImageViewListener = ZoomImageView.this.touchImageViewListener;
            if (onTouchImageViewListener == null) {
                return true;
            }
            onTouchImageViewListener.onMove();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            ZoomImageView.this.setState(State.ZOOM);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0018 A[PHI: r0
          0x0018: PHI (r0v5 float) = (r0v1 float), (r0v2 float) binds: [B:3:0x0016, B:6:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onScaleEnd(android.view.ScaleGestureDetector r8) {
            /*
                r7 = this;
                super.onScaleEnd(r8)
                com.onfido.android.sdk.capture.ui.ZoomImageView r8 = com.onfido.android.sdk.capture.ui.ZoomImageView.this
                com.onfido.android.sdk.capture.ui.ZoomImageView$State r0 = com.onfido.android.sdk.capture.ui.ZoomImageView.State.NONE
                com.onfido.android.sdk.capture.ui.ZoomImageView.v(r8, r0)
                com.onfido.android.sdk.capture.ui.ZoomImageView r2 = com.onfido.android.sdk.capture.ui.ZoomImageView.this
                float r8 = com.onfido.android.sdk.capture.ui.ZoomImageView.g(r2)
                float r0 = com.onfido.android.sdk.capture.ui.ZoomImageView.d(r2)
                int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r1 <= 0) goto L1a
            L18:
                r8 = r0
                goto L23
            L1a:
                float r0 = com.onfido.android.sdk.capture.ui.ZoomImageView.f(r2)
                int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r1 >= 0) goto L26
                goto L18
            L23:
                r0 = 1
            L24:
                r3 = r8
                goto L28
            L26:
                r0 = 0
                goto L24
            L28:
                if (r0 == 0) goto L43
                com.onfido.android.sdk.capture.ui.ZoomImageView$DoubleTapZoom r1 = new com.onfido.android.sdk.capture.ui.ZoomImageView$DoubleTapZoom
                int r8 = com.onfido.android.sdk.capture.ui.ZoomImageView.l(r2)
                int r8 = r8 / 2
                float r4 = (float) r8
                int r8 = com.onfido.android.sdk.capture.ui.ZoomImageView.k(r2)
                int r8 = r8 / 2
                float r5 = (float) r8
                r6 = 0
                r1.<init>(r3, r4, r5, r6)
                com.onfido.android.sdk.capture.ui.ZoomImageView r8 = com.onfido.android.sdk.capture.ui.ZoomImageView.this
                com.onfido.android.sdk.capture.ui.ZoomImageView.m(r8, r1)
            L43:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.ZoomImageView.ScaleListener.onScaleEnd(android.view.ScaleGestureDetector):void");
        }

        public /* synthetic */ ScaleListener(ZoomImageView zoomImageView, int i) {
            this();
        }
    }

    public enum State {
        NONE,
        DRAG,
        ZOOM,
        FLING,
        ANIMATE_ZOOM
    }

    public class ZoomVariables {
        public float focusX;
        public float focusY;
        public float scale;
        public ImageView.ScaleType scaleType;

        public ZoomVariables(float f, float f4, float f5, ImageView.ScaleType scaleType) {
            this.scale = f;
            this.focusX = f4;
            this.focusY = f5;
            this.scaleType = scaleType;
        }
    }

    public ZoomImageView(Context context) {
        super(context);
        this.userTouchListener = null;
        this.touchImageViewListener = null;
        sharedConstructing(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void compatPostOnAnimation(Runnable runnable) {
        postOnAnimation(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void fitImageToView() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onfido.android.sdk.capture.ui.ZoomImageView.fitImageToView():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fixScaleTrans() {
        fixTrans();
        this.matrix.getValues(this.f49987m);
        float imageWidth = getImageWidth();
        float f = this.viewWidth;
        if (imageWidth < f) {
            this.f49987m[2] = (f - getImageWidth()) / 2.0f;
        }
        float imageHeight = getImageHeight();
        float f4 = this.viewHeight;
        if (imageHeight < f4) {
            this.f49987m[5] = (f4 - getImageHeight()) / 2.0f;
        }
        this.matrix.setValues(this.f49987m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fixTrans() {
        this.matrix.getValues(this.f49987m);
        float[] fArr = this.f49987m;
        float f = fArr[2];
        float f4 = fArr[5];
        float fixTrans = getFixTrans(f, this.viewWidth, getImageWidth());
        float fixTrans2 = getFixTrans(f4, this.viewHeight, getImageHeight());
        if (fixTrans == BitmapDescriptorFactory.HUE_RED && fixTrans2 == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        this.matrix.postTranslate(fixTrans, fixTrans2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFixDragTrans(float f, float f4, float f5) {
        return f5 <= f4 ? BitmapDescriptorFactory.HUE_RED : f;
    }

    private float getFixTrans(float f, float f4, float f5) {
        float f6;
        float f32 = f4 - f5;
        if (f5 <= f4) {
            f6 = f32;
            f32 = 0.0f;
        } else {
            f6 = 0.0f;
        }
        return f < f32 ? (-f) + f32 : f > f6 ? (-f) + f6 : BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getImageHeight() {
        return this.matchViewHeight * this.normalizedScale;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getImageWidth() {
        return this.matchViewWidth * this.normalizedScale;
    }

    private void savePreviousImageValues() {
        Matrix matrix = this.matrix;
        if (matrix == null || this.viewHeight == 0 || this.viewWidth == 0) {
            return;
        }
        matrix.getValues(this.f49987m);
        this.prevMatrix.setValues(this.f49987m);
        this.prevMatchViewHeight = this.matchViewHeight;
        this.prevMatchViewWidth = this.matchViewWidth;
        this.prevViewHeight = this.viewHeight;
        this.prevViewWidth = this.viewWidth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scaleImage(double d, float f, float f4, boolean z) {
        float f5;
        float f6;
        if (z) {
            f5 = this.superMinScale;
            f6 = this.superMaxScale;
        } else {
            f5 = this.minScale;
            f6 = this.maxScale;
        }
        float f32 = this.normalizedScale;
        float f35 = (float) (((double) f32) * d);
        this.normalizedScale = f35;
        if (f35 > f6) {
            this.normalizedScale = f6;
            d = f6 / f32;
        } else if (f35 < f5) {
            this.normalizedScale = f5;
            d = f5 / f32;
        }
        float f36 = (float) d;
        this.matrix.postScale(f36, f36, f, f4);
        fixScaleTrans();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(State state) {
        this.state = state;
    }

    private int setViewSize(int i, int i2, int i3) {
        return i != Integer.MIN_VALUE ? i != 0 ? i2 : i3 : Math.min(i3, i2);
    }

    private void sharedConstructing(Context context) {
        super.setClickable(true);
        int i = 0;
        this.mScaleDetector = new ScaleGestureDetector(context, new ScaleListener(this, i));
        this.mGestureDetector = new GestureDetector(context, new GestureListener(this, i));
        this.matrix = new Matrix();
        this.prevMatrix = new Matrix();
        this.f49987m = new float[9];
        this.normalizedScale = 1.0f;
        if (this.mScaleType == null) {
            this.mScaleType = ImageView.ScaleType.FIT_CENTER;
        }
        this.minScale = 1.0f;
        this.maxScale = 3.0f;
        this.superMinScale = 0.75f;
        this.superMaxScale = 3.75f;
        setImageMatrix(this.matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
        setState(State.NONE);
        this.onDrawReady = false;
        super.setOnTouchListener(new PrivateOnTouchListener(this, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PointF transformCoordBitmapToTouch(float f, float f4) {
        if (getDrawable() == null) {
            return new PointF(-1.0f, -1.0f);
        }
        this.matrix.getValues(this.f49987m);
        return new PointF((getImageWidth() * (f / r0.getIntrinsicWidth())) + this.f49987m[2], (getImageHeight() * (f4 / r0.getIntrinsicHeight())) + this.f49987m[5]);
    }

    private PointF transformCoordTouchToBitmap(float f, float f4, boolean z) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return new PointF(-1.0f, -1.0f);
        }
        this.matrix.getValues(this.f49987m);
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        float[] fArr = this.f49987m;
        float f5 = fArr[2];
        float f6 = fArr[5];
        float imageWidth = ((f - f5) * intrinsicWidth) / getImageWidth();
        float imageHeight = ((f4 - f6) * intrinsicHeight) / getImageHeight();
        if (z) {
            imageWidth = Math.min(Math.max(imageWidth, BitmapDescriptorFactory.HUE_RED), intrinsicWidth);
            imageHeight = Math.min(Math.max(imageHeight, BitmapDescriptorFactory.HUE_RED), intrinsicHeight);
        }
        return new PointF(imageWidth, imageHeight);
    }

    private void translateMatrixAfterRotate(int i, float f, float f4, float f5, int i2, int i3, int i5) {
        float f6 = i3;
        if (f5 < f6) {
            float[] fArr = this.f49987m;
            fArr[i] = kii.e.a(i5, fArr[0], f6, 0.5f);
        } else {
            if (f > BitmapDescriptorFactory.HUE_RED) {
                this.f49987m[i] = -((f5 - f6) * 0.5f);
                return;
            }
            this.f49987m[i] = -(((((i2 * 0.5f) + Math.abs(f)) / f4) * f5) - (f6 * 0.5f));
        }
    }

    public static /* bridge */ /* synthetic */ PointF y(ZoomImageView zoomImageView, float f, float f4) {
        return zoomImageView.transformCoordTouchToBitmap(f, f4, false);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        this.matrix.getValues(this.f49987m);
        float f = this.f49987m[2];
        if (getImageWidth() < this.viewWidth) {
            return false;
        }
        if (f < -1.0f || i >= 0) {
            return (Math.abs(f) + ((float) this.viewWidth)) + 1.0f < getImageWidth() || i <= 0;
        }
        return false;
    }

    public float getCurrentZoom() {
        return this.normalizedScale;
    }

    public float getMaxZoom() {
        return this.maxScale;
    }

    public float getMinZoom() {
        return this.minScale;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    public PointF getScrollPosition() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return null;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        PointF pointFTransformCoordTouchToBitmap = transformCoordTouchToBitmap(this.viewWidth / 2, this.viewHeight / 2, true);
        pointFTransformCoordTouchToBitmap.x /= intrinsicWidth;
        pointFTransformCoordTouchToBitmap.y /= intrinsicHeight;
        return pointFTransformCoordTouchToBitmap;
    }

    public RectF getZoomedRect() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        if (this.mScaleType == ImageView.ScaleType.FIT_XY) {
            throw new UnsupportedOperationException("getZoomedRect() not supported with FIT_XY");
        }
        PointF pointFTransformCoordTouchToBitmap = transformCoordTouchToBitmap(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, true);
        PointF pointFTransformCoordTouchToBitmap2 = transformCoordTouchToBitmap(this.viewWidth, this.viewHeight, true);
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        return new RectF(pointFTransformCoordTouchToBitmap.x / intrinsicWidth, pointFTransformCoordTouchToBitmap.y / intrinsicHeight, pointFTransformCoordTouchToBitmap2.x / intrinsicWidth, pointFTransformCoordTouchToBitmap2.y / intrinsicHeight);
    }

    public boolean isZoomed() {
        return this.normalizedScale != 1.0f;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        savePreviousImageValues();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        this.onDrawReady = true;
        this.imageRenderedAtLeastOnce = true;
        ZoomVariables zoomVariables = this.delayedZoomVariables;
        if (zoomVariables != null) {
            setZoom(zoomVariables.scale, zoomVariables.focusX, zoomVariables.focusY, zoomVariables.scaleType);
            this.delayedZoomVariables = null;
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.viewWidth = setViewSize(mode, size, intrinsicWidth);
        int viewSize = setViewSize(mode2, size2, intrinsicHeight);
        this.viewHeight = viewSize;
        setMeasuredDimension(this.viewWidth, viewSize);
        fitImageToView();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.normalizedScale = bundle.getFloat("saveScale");
        float[] floatArray = bundle.getFloatArray("matrix");
        this.f49987m = floatArray;
        this.prevMatrix.setValues(floatArray);
        this.prevMatchViewHeight = bundle.getFloat("matchViewHeight");
        this.prevMatchViewWidth = bundle.getFloat("matchViewWidth");
        this.prevViewHeight = bundle.getInt("viewHeight");
        this.prevViewWidth = bundle.getInt("viewWidth");
        this.imageRenderedAtLeastOnce = bundle.getBoolean("imageRendered");
        super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putFloat("saveScale", this.normalizedScale);
        bundle.putFloat("matchViewHeight", this.matchViewHeight);
        bundle.putFloat("matchViewWidth", this.matchViewWidth);
        bundle.putInt("viewWidth", this.viewWidth);
        bundle.putInt("viewHeight", this.viewHeight);
        this.matrix.getValues(this.f49987m);
        bundle.putFloatArray("matrix", this.f49987m);
        bundle.putBoolean("imageRendered", this.imageRenderedAtLeastOnce);
        return bundle;
    }

    public void resetZoom() {
        this.normalizedScale = 1.0f;
        fitImageToView();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        savePreviousImageValues();
        fitImageToView();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        savePreviousImageValues();
        fitImageToView();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        savePreviousImageValues();
        fitImageToView();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri2) {
        super.setImageURI(uri2);
        savePreviousImageValues();
        fitImageToView();
    }

    public void setMaxZoom(float f) {
        this.maxScale = f;
        this.superMaxScale = f * SUPER_MAX_MULTIPLIER;
    }

    public void setMinZoom(float f) {
        this.minScale = f;
        this.superMinScale = f * 0.75f;
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.userTouchListener = onTouchListener;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.FIT_START || scaleType == ImageView.ScaleType.FIT_END) {
            throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
        }
        ImageView.ScaleType scaleType2 = ImageView.ScaleType.MATRIX;
        if (scaleType == scaleType2) {
            super.setScaleType(scaleType2);
            return;
        }
        this.mScaleType = scaleType;
        if (this.onDrawReady) {
            setZoom(this);
        }
    }

    public void setScrollPosition(float f, float f4) {
        setZoom(this.normalizedScale, f, f4);
    }

    public void setZoom(float f) {
        setZoom(f, 0.5f, 0.5f);
    }

    public ZoomImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.userTouchListener = null;
        this.touchImageViewListener = null;
        sharedConstructing(context);
    }

    public void setZoom(float f, float f4, float f5) {
        setZoom(f, f4, f5, this.mScaleType);
    }

    public ZoomImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.userTouchListener = null;
        this.touchImageViewListener = null;
        sharedConstructing(context);
    }

    public void setZoom(float f, float f4, float f5, ImageView.ScaleType scaleType) {
        if (!this.onDrawReady) {
            this.delayedZoomVariables = new ZoomVariables(f, f4, f5, scaleType);
            return;
        }
        if (scaleType != this.mScaleType) {
            setScaleType(scaleType);
        }
        resetZoom();
        scaleImage(f, this.viewWidth / 2, this.viewHeight / 2, false);
        this.matrix.getValues(this.f49987m);
        this.f49987m[2] = -((f4 * getImageWidth()) - (this.viewWidth * 0.5f));
        this.f49987m[5] = -((getImageHeight() * f5) - (this.viewHeight * 0.5f));
        this.matrix.setValues(this.f49987m);
        fixTrans();
        setImageMatrix(this.matrix);
    }

    public void setZoom(ZoomImageView zoomImageView) {
        PointF scrollPosition = zoomImageView.getScrollPosition();
        setZoom(zoomImageView.getCurrentZoom(), scrollPosition.x, scrollPosition.y, zoomImageView.getScaleType());
    }
}
