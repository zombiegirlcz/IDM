package aq0;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import com.revolut.core.ui_kit.gallery_picker.GalleryPickerView;
import com.revolut.core.ui_kit.internal.gallery_picker.GalleryGridLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements ScaleGestureDetector.OnScaleGestureListener {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f8205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f8206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f8207c;
    public final zjh.i d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ScaleGestureDetector f8209h;
    public VelocityTracker i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f8210j;
    public float k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f8211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8212m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8213n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f8214p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f8215q;

    public c(Context context, h isZoomAnimating, h isZoomEnabled, h currentScale, zjh.i listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(isZoomAnimating, "isZoomAnimating");
        Intrinsics.checkNotNullParameter(isZoomEnabled, "isZoomEnabled");
        Intrinsics.checkNotNullParameter(currentScale, "currentScale");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8205a = isZoomAnimating;
        this.f8206b = isZoomEnabled;
        this.f8207c = currentScale;
        this.d = listener;
        this.e = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.f8208g = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f8209h = new ScaleGestureDetector(context, this);
        this.f8214p = b.NONE;
        this.f8215q = 1.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aq0.c.a(android.view.MotionEvent):void");
    }

    public final boolean b(MotionEvent event) {
        GalleryPickerView galleryPickerView = (GalleryPickerView) this.d.f322838b;
        Intrinsics.checkNotNullParameter(event, "event");
        if (((Boolean) this.f8205a.invoke()).booleanValue() || event.getPointerCount() >= 2 || this.f8209h.isInProgress()) {
            return true;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                this.f8211l = event.getEventTime();
                if (!this.f8212m) {
                    float fAbs = Math.abs(event.getX() - this.f8210j);
                    float fAbs2 = Math.abs(event.getY() - this.k);
                    float f = this.e;
                    if (fAbs > f || fAbs2 > f) {
                        this.f8212m = true;
                        this.f8214p = b.SCROLL;
                        GalleryPickerView.Companion companion = GalleryPickerView.INSTANCE;
                        galleryPickerView.c();
                        this.f8210j = event.getX();
                        this.k = event.getY();
                        return true;
                    }
                }
            }
            return this.f8212m;
        }
        OverScroller overScroller = galleryPickerView.f55811l;
        boolean z = galleryPickerView.f55812m || galleryPickerView.f55813n || !overScroller.isFinished();
        if (!overScroller.isFinished()) {
            overScroller.forceFinished(true);
        }
        if (galleryPickerView.f55812m) {
            galleryPickerView.f55812m = false;
            galleryPickerView.d();
        }
        galleryPickerView.f55813n = false;
        this.f8214p = b.NONE;
        this.f8210j = event.getX();
        this.k = event.getY();
        this.f8211l = event.getEventTime();
        this.f8212m = false;
        VelocityTracker velocityTracker = this.i;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        VelocityTracker velocityTracker2 = this.i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(event);
        }
        return z;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        if (!((Boolean) this.f8205a.invoke()).booleanValue()) {
            float scaleFactor = detector.getScaleFactor() * this.f8215q;
            this.f8215q = scaleFactor;
            if (Math.abs(scaleFactor - 1.0f) >= 0.15f) {
                this.f8215q = 1.0f;
                float f = detector.getScaleFactor() <= 1.0f ? 0.55f : 1.0f;
                if (f != ((Number) this.f8207c.invoke()).floatValue()) {
                    GalleryPickerView galleryPickerView = (GalleryPickerView) this.d.f322838b;
                    GalleryPickerView.Companion companion = GalleryPickerView.INSTANCE;
                    galleryPickerView.g(f);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        GalleryPickerView galleryPickerView = (GalleryPickerView) this.d.f322838b;
        Intrinsics.checkNotNullParameter(detector, "detector");
        if (((Boolean) this.f8205a.invoke()).booleanValue() || !((Boolean) this.f8206b.invoke()).booleanValue() || this.f8214p == b.SCROLL) {
            return false;
        }
        this.f8212m = false;
        this.f8213n = true;
        this.f8214p = b.ZOOM;
        OverScroller overScroller = galleryPickerView.f55811l;
        if (!overScroller.isFinished()) {
            overScroller.forceFinished(true);
        }
        galleryPickerView.f55812m = false;
        galleryPickerView.f55813n = false;
        GalleryPickerView.Companion companion = GalleryPickerView.INSTANCE;
        galleryPickerView.c();
        VelocityTracker velocityTracker = this.i;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        this.f8215q = 1.0f;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        GalleryPickerView galleryPickerView = (GalleryPickerView) this.d.f322838b;
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.f8213n = false;
        this.o = true;
        VelocityTracker velocityTracker = this.i;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        if (((Boolean) this.f8205a.invoke()).booleanValue()) {
            return;
        }
        GalleryGridLayoutManager galleryGridLayoutManager = galleryPickerView.f55807c;
        if (galleryGridLayoutManager == null) {
            Intrinsics.r("galleryLayoutManager");
            throw null;
        }
        galleryGridLayoutManager.m();
        GalleryPickerView.Companion companion = GalleryPickerView.INSTANCE;
        galleryPickerView.d();
    }
}
