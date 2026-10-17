package androidx.camera.viewfinder.core;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.camera.view.PreviewView;
import androidx.camera.view.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rim.d;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 42\u00020\u0001:\u0003564B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\"\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u001dR\u0016\u0010 \u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010#\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010$\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010!R\u0016\u0010%\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u0016\u0010&\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010!R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001bR\u0016\u0010+\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010!R\u0016\u0010,\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010)R\u0016\u0010-\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010!R\u0016\u0010.\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010!R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\u0016R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010\u001b¨\u00067"}, d2 = {"Landroidx/camera/viewfinder/core/ZoomGestureDetector;", "", "Landroid/content/Context;", "context", "", "spanSlop", "minSpan", "Landroidx/camera/viewfinder/core/ZoomGestureDetector$OnZoomGestureListener;", "listener", "<init>", "(Landroid/content/Context;IILandroidx/camera/viewfinder/core/ZoomGestureDetector$OnZoomGestureListener;)V", "", "inAnchoredZoomMode", "()Z", "", "getIncrementalScaleFactor", "()F", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/content/Context;", "I", "Landroidx/camera/viewfinder/core/ZoomGestureDetector$OnZoomGestureListener;", "focusX", "focusY", "isQuickZoomEnabled", "Z", "setQuickZoomEnabled", "(Z)V", "isStylusZoomEnabled", "setStylusZoomEnabled", "currentSpan", "F", "previousSpan", "currentSpanX", "currentSpanY", "previousSpanX", "previousSpanY", "", "eventTime", "J", "isInProgress", "initialSpan", "prevTime", "anchoredZoomStartX", "anchoredZoomStartY", "anchoredZoomMode", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "eventBeforeOrAboveStartingGestureEvent", "Companion", "ZoomEvent", "OnZoomGestureListener", "viewfinder-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ZoomGestureDetector {
    private int anchoredZoomMode;
    private float anchoredZoomStartX;
    private float anchoredZoomStartY;

    @NotNull
    private final Context context;
    private float currentSpan;
    private float currentSpanX;
    private float currentSpanY;
    private boolean eventBeforeOrAboveStartingGestureEvent;
    private long eventTime;
    private int focusX;
    private int focusY;

    @NotNull
    private GestureDetector gestureDetector;
    private float initialSpan;
    private boolean isInProgress;
    private boolean isQuickZoomEnabled;
    private boolean isStylusZoomEnabled;

    @NotNull
    private final OnZoomGestureListener listener;
    private final int minSpan;
    private long prevTime;
    private float previousSpan;
    private float previousSpanX;
    private float previousSpanY;
    private final int spanSlop;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/camera/viewfinder/core/ZoomGestureDetector$OnZoomGestureListener;", "", "viewfinder-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnZoomGestureListener {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b&\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B'\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0013"}, d2 = {"Landroidx/camera/viewfinder/core/ZoomGestureDetector$ZoomEvent;", "", "", "eventTime", "", "focusX", "focusY", "<init>", "(JII)V", "J", "getEventTime", "()J", "I", "getFocusX", "()I", "getFocusY", "Begin", "Move", "End", "viewfinder-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ZoomEvent {
        private final long eventTime;
        private final int focusX;
        private final int focusY;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/camera/viewfinder/core/ZoomGestureDetector$ZoomEvent$Begin;", "Landroidx/camera/viewfinder/core/ZoomGestureDetector$ZoomEvent;", "eventTime", "", "focusX", "", "focusY", "<init>", "(JII)V", "viewfinder-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Begin extends ZoomEvent {
            public Begin(long j2, int i, int i2) {
                super(j2, i, i2, null);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/camera/viewfinder/core/ZoomGestureDetector$ZoomEvent$End;", "Landroidx/camera/viewfinder/core/ZoomGestureDetector$ZoomEvent;", "", "eventTime", "", "focusX", "focusY", "", "incrementalScaleFactor", "<init>", "(JIIF)V", "F", "getIncrementalScaleFactor", "()F", "viewfinder-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class End extends ZoomEvent {
            private final float incrementalScaleFactor;

            public End(long j2, int i, int i2, float f) {
                super(j2, i, i2, null);
                this.incrementalScaleFactor = f;
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/camera/viewfinder/core/ZoomGestureDetector$ZoomEvent$Move;", "Landroidx/camera/viewfinder/core/ZoomGestureDetector$ZoomEvent;", "eventTime", "", "focusX", "", "focusY", "incrementalScaleFactor", "", "<init>", "(JIIF)V", "getIncrementalScaleFactor", "()F", "viewfinder-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Move extends ZoomEvent {
            private final float incrementalScaleFactor;

            public Move(long j2, int i, int i2, float f) {
                super(j2, i, i2, null);
                this.incrementalScaleFactor = f;
            }

            public final float getIncrementalScaleFactor() {
                return this.incrementalScaleFactor;
            }
        }

        public /* synthetic */ ZoomEvent(long j2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2, i, i2);
        }

        private ZoomEvent(long j2, int i, int i2) {
            this.eventTime = j2;
            this.focusX = i;
            this.focusY = i2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZoomGestureDetector(@NotNull Context context, @NotNull OnZoomGestureListener listener) {
        this(context, 0, 0, listener, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    private final float getIncrementalScaleFactor() {
        if (!inAnchoredZoomMode()) {
            float f = this.previousSpan;
            if (f > BitmapDescriptorFactory.HUE_RED) {
                return this.currentSpan / f;
            }
            return 1.0f;
        }
        boolean z = this.eventBeforeOrAboveStartingGestureEvent;
        boolean z3 = (z && this.currentSpan < this.previousSpan) || (!z && this.currentSpan > this.previousSpan);
        float fAbs = Math.abs(1 - (this.currentSpan / this.previousSpan)) * 0.5f;
        if (this.previousSpan <= this.spanSlop) {
            return 1.0f;
        }
        return z3 ? fAbs + 1.0f : 1.0f - fAbs;
    }

    private final boolean inAnchoredZoomMode() {
        return this.anchoredZoomMode != 0;
    }

    public final boolean onTouchEvent(@NotNull MotionEvent event) {
        boolean z;
        float f;
        float f4;
        Intrinsics.checkNotNullParameter(event, "event");
        this.eventTime = event.getEventTime();
        int actionMasked = event.getActionMasked();
        if (this.isQuickZoomEnabled) {
            this.gestureDetector.onTouchEvent(event);
        }
        int pointerCount = event.getPointerCount();
        boolean z3 = (event.getButtonState() & 32) != 0;
        boolean z4 = this.anchoredZoomMode == 2 && !z3;
        boolean z6 = actionMasked == 1 || actionMasked == 3 || z4;
        float f5 = BitmapDescriptorFactory.HUE_RED;
        if (actionMasked == 0 || z6) {
            if (this.isInProgress) {
                z = true;
                ((g) this.listener).a(new ZoomEvent.End(this.eventTime, this.focusX, this.focusY, getIncrementalScaleFactor()));
                this.isInProgress = false;
                this.initialSpan = BitmapDescriptorFactory.HUE_RED;
                this.anchoredZoomMode = 0;
            } else {
                z = true;
                if (inAnchoredZoomMode() && z6) {
                    this.isInProgress = false;
                    this.initialSpan = BitmapDescriptorFactory.HUE_RED;
                    this.anchoredZoomMode = 0;
                }
            }
            if (!z6) {
            }
            return z;
        }
        z = true;
        if (!this.isInProgress && this.isStylusZoomEnabled && !inAnchoredZoomMode() && !z6 && z3) {
            this.anchoredZoomStartX = event.getX();
            this.anchoredZoomStartY = event.getY();
            this.anchoredZoomMode = 2;
            this.initialSpan = BitmapDescriptorFactory.HUE_RED;
        }
        boolean z11 = (actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z4) ? z : false;
        boolean z12 = actionMasked == 6 ? z : false;
        int actionIndex = z12 ? event.getActionIndex() : -1;
        int i = z12 ? pointerCount - 1 : pointerCount;
        if (inAnchoredZoomMode()) {
            f4 = this.anchoredZoomStartX;
            f = this.anchoredZoomStartY;
            this.eventBeforeOrAboveStartingGestureEvent = event.getY() < f ? z : false;
        } else {
            float x3 = 0.0f;
            float y2 = 0.0f;
            for (int i2 = 0; i2 < pointerCount; i2++) {
                if (actionIndex != i2) {
                    x3 += event.getX(i2);
                    y2 += event.getY(i2);
                }
            }
            float f6 = i;
            float f32 = x3 / f6;
            f = y2 / f6;
            f4 = f32;
        }
        float fAbs = 0.0f;
        for (int i3 = 0; i3 < pointerCount; i3++) {
            if (actionIndex != i3) {
                float fAbs2 = Math.abs(event.getX(i3) - f4) + f5;
                fAbs = Math.abs(event.getY(i3) - f) + fAbs;
                f5 = fAbs2;
            }
        }
        float f35 = i;
        float f36 = f5 / f35;
        float f37 = fAbs / f35;
        float f41 = 2;
        float f42 = f36 * f41;
        float f57 = f37 * f41;
        float fHypot = inAnchoredZoomMode() ? f57 : (float) Math.hypot(f42, f57);
        boolean z29 = this.isInProgress;
        this.focusX = d.c(f4);
        this.focusY = d.c(f);
        if (!inAnchoredZoomMode() && this.isInProgress && (fHypot < this.minSpan || z11)) {
            ((g) this.listener).a(new ZoomEvent.End(this.eventTime, this.focusX, this.focusY, getIncrementalScaleFactor()));
            this.isInProgress = false;
            this.initialSpan = fHypot;
        }
        if (z11) {
            this.currentSpanX = f42;
            this.previousSpanX = f42;
            this.currentSpanY = f57;
            this.previousSpanY = f57;
            this.currentSpan = fHypot;
            this.previousSpan = fHypot;
            this.initialSpan = fHypot;
        }
        int i5 = inAnchoredZoomMode() ? this.spanSlop : this.minSpan;
        if (!this.isInProgress && fHypot >= i5 && (z29 || Math.abs(fHypot - this.initialSpan) > this.spanSlop)) {
            this.currentSpanX = f42;
            this.previousSpanX = f42;
            this.currentSpanY = f57;
            this.previousSpanY = f57;
            this.currentSpan = fHypot;
            this.previousSpan = fHypot;
            long j2 = this.eventTime;
            this.prevTime = j2;
            this.isInProgress = ((PreviewView) ((g) this.listener).f6938a).lambda$new$1(new ZoomEvent.Begin(j2, this.focusX, this.focusY));
        }
        if (actionMasked == 2) {
            this.currentSpanX = f42;
            this.currentSpanY = f57;
            this.currentSpan = fHypot;
            if (this.isInProgress ? ((PreviewView) ((g) this.listener).f6938a).lambda$new$1(new ZoomEvent.Move(this.eventTime, this.focusX, this.focusY, getIncrementalScaleFactor())) : z) {
                this.previousSpanX = this.currentSpanX;
                this.previousSpanY = this.currentSpanY;
                this.previousSpan = this.currentSpan;
                this.prevTime = this.eventTime;
            }
        }
        return z;
    }

    public ZoomGestureDetector(@NotNull Context context, int i, int i2, @NotNull OnZoomGestureListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.context = context;
        this.spanSlop = i;
        this.minSpan = i2;
        this.listener = listener;
        this.isQuickZoomEnabled = true;
        this.isStylusZoomEnabled = true;
        this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: androidx.camera.viewfinder.core.ZoomGestureDetector$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent e) {
                Intrinsics.checkNotNullParameter(e, "e");
                this.this$0.anchoredZoomStartX = e.getX();
                this.this$0.anchoredZoomStartY = e.getY();
                this.this$0.anchoredZoomMode = 1;
                return true;
            }
        });
    }

    public /* synthetic */ ZoomGestureDetector(Context context, int i, int i2, OnZoomGestureListener onZoomGestureListener, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i, (i3 & 4) != 0 ? 0 : i2, onZoomGestureListener);
    }
}
