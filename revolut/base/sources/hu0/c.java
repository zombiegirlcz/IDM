package hu0;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.OverScroller;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import dki.v;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f155479a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f155480b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScaleGestureDetector f155481c;
    public VelocityTracker d;
    public boolean e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f155482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f155483h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f61.a f155484j;

    public c(Context context, f61.a aVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f155483h = viewConfiguration.getScaledTouchSlop();
        this.f155484j = aVar;
        this.f155481c = new ScaleGestureDetector(context, new b(this, 0), new Handler(Looper.getMainLooper()));
    }

    public final void a(MotionEvent motionEvent) {
        float x3;
        float y2;
        float x5;
        float y5;
        int iRound;
        int i;
        int iRound2;
        int i2;
        float x7;
        float y9;
        int i3;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            f61.a aVar = this.f155484j;
            if (action == 1) {
                this.f155479a = -1;
                if (this.e && this.d != null) {
                    try {
                        x5 = motionEvent.getX(this.f155480b);
                    } catch (Exception unused) {
                        x5 = motionEvent.getX();
                    }
                    this.f = x5;
                    try {
                        y5 = motionEvent.getY(this.f155480b);
                    } catch (Exception unused2) {
                        y5 = motionEvent.getY();
                    }
                    this.f155482g = y5;
                    this.d.addMovement(motionEvent);
                    this.d.computeCurrentVelocity(1000);
                    float xVelocity = this.d.getXVelocity();
                    float yVelocity = this.d.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.i) {
                        f fVar = (f) aVar.f132372b;
                        g gVar = fVar.f155493h;
                        v vVar = new v(fVar, gVar.getContext());
                        fVar.f155500r = vVar;
                        int width = (gVar.getWidth() - gVar.getPaddingLeft()) - gVar.getPaddingRight();
                        int height = (gVar.getHeight() - gVar.getPaddingTop()) - gVar.getPaddingBottom();
                        int i5 = (int) (-xVelocity);
                        int i6 = (int) (-yVelocity);
                        fVar.b();
                        Matrix matrixC = fVar.c();
                        RectF rectF = fVar.f155497n;
                        if (gVar.getDrawable() != null) {
                            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, r13.getIntrinsicWidth(), r13.getIntrinsicHeight());
                            matrixC.mapRect(rectF);
                        } else {
                            rectF = null;
                        }
                        if (rectF != null) {
                            int iRound3 = Math.round(-rectF.left);
                            float f = width;
                            if (f < rectF.width()) {
                                iRound = Math.round(rectF.width() - f);
                                i = 0;
                            } else {
                                iRound = iRound3;
                                i = iRound;
                            }
                            int iRound4 = Math.round(-rectF.top);
                            float f4 = height;
                            if (f4 < rectF.height()) {
                                iRound2 = Math.round(rectF.height() - f4);
                                i2 = 0;
                            } else {
                                iRound2 = iRound4;
                                i2 = iRound2;
                            }
                            vVar.f115556b = iRound3;
                            vVar.f115557c = iRound4;
                            if (iRound3 != iRound || iRound4 != iRound2) {
                                ((OverScroller) vVar.d).fling(iRound3, iRound4, i5, i6, i, iRound, i2, iRound2, 0, 0);
                            }
                        }
                        gVar.post(fVar.f155500r);
                    }
                }
                VelocityTracker velocityTracker = this.d;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.d = null;
                }
            } else if (action == 2) {
                try {
                    x7 = motionEvent.getX(this.f155480b);
                } catch (Exception unused3) {
                    x7 = motionEvent.getX();
                }
                try {
                    y9 = motionEvent.getY(this.f155480b);
                } catch (Exception unused4) {
                    y9 = motionEvent.getY();
                }
                float f5 = x7 - this.f;
                float f6 = y9 - this.f155482g;
                if (!this.e) {
                    this.e = Math.sqrt((double) ((f6 * f6) + (f5 * f5))) >= ((double) this.f155483h);
                }
                if (this.e) {
                    f fVar2 = (f) aVar.f132372b;
                    c cVar = fVar2.f155494j;
                    if (!cVar.f155481c.isInProgress()) {
                        fVar2.f155496m.postTranslate(f5, f6);
                        fVar2.a();
                        ViewParent parent = fVar2.f155493h.getParent();
                        if (fVar2.f && !cVar.f155481c.isInProgress() && !fVar2.f155492g) {
                            int i21 = fVar2.f155501s;
                            if ((i21 == 2 || ((i21 == 0 && f5 >= 1.0f) || ((i21 == 1 && f5 <= -1.0f) || (((i3 = fVar2.f155502t) == 0 && f6 >= 1.0f) || (i3 == 1 && f6 <= -1.0f))))) && parent != null) {
                                parent.requestDisallowInterceptTouchEvent(false);
                            }
                        } else if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    this.f = x7;
                    this.f155482g = y9;
                    VelocityTracker velocityTracker2 = this.d;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                }
            } else if (action == 3) {
                this.f155479a = -1;
                VelocityTracker velocityTracker3 = this.d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.d = null;
                }
            } else if (action == 6) {
                int action2 = (motionEvent.getAction() & 65280) >> 8;
                if (motionEvent.getPointerId(action2) == this.f155479a) {
                    int i22 = action2 != 0 ? 0 : 1;
                    this.f155479a = motionEvent.getPointerId(i22);
                    this.f = motionEvent.getX(i22);
                    this.f155482g = motionEvent.getY(i22);
                }
            }
        } else {
            this.f155479a = motionEvent.getPointerId(0);
            VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
            this.d = velocityTrackerObtain;
            if (velocityTrackerObtain != null) {
                velocityTrackerObtain.addMovement(motionEvent);
            }
            try {
                x3 = motionEvent.getX(this.f155480b);
            } catch (Exception unused5) {
                x3 = motionEvent.getX();
            }
            this.f = x3;
            try {
                y2 = motionEvent.getY(this.f155480b);
            } catch (Exception unused6) {
                y2 = motionEvent.getY();
            }
            this.f155482g = y2;
            this.e = false;
        }
        int i32 = this.f155479a;
        this.f155480b = motionEvent.findPointerIndex(i32 != -1 ? i32 : 0);
    }
}
