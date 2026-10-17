package r7;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.Choreographer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ValueAnimator implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d7.j f251942l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f251936a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f251937b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArraySet f251938c = new CopyOnWriteArraySet();
    public float d = 1.0f;
    public boolean e = false;
    public long f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f251939g = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f251940h = BitmapDescriptorFactory.HUE_RED;
    public int i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f251941j = -2.1474836E9f;
    public float k = 2.1474836E9f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f251943m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f251944n = false;

    public final float a() {
        d7.j jVar = this.f251942l;
        if (jVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = this.f251940h;
        float f4 = jVar.f111683l;
        return (f - f4) / (jVar.f111684m - f4);
    }

    @Override // android.animation.Animator
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f251937b.add(animatorListener);
    }

    @Override // android.animation.Animator
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f251938c.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f251936a.add(animatorUpdateListener);
    }

    public final float b() {
        d7.j jVar = this.f251942l;
        if (jVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = this.k;
        return f == 2.1474836E9f ? jVar.f111684m : f;
    }

    public final float c() {
        d7.j jVar = this.f251942l;
        if (jVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f = this.f251941j;
        return f == -2.1474836E9f ? jVar.f111683l : f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it8 = this.f251937b.iterator();
        while (it8.hasNext()) {
            ((Animator.AnimatorListener) it8.next()).onAnimationCancel(this);
        }
        f(e());
        h(true);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        boolean z = false;
        if (this.f251943m) {
            h(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        d7.j jVar = this.f251942l;
        if (jVar == null || !this.f251943m) {
            return;
        }
        d7.a aVar = d7.d.f111646a;
        float fAbs = (this.f != 0 ? j2 - r2 : 0L) / ((1.0E9f / jVar.f111685n) / Math.abs(this.d));
        float f = this.f251939g;
        if (e()) {
            fAbs = -fAbs;
        }
        float f4 = f + fAbs;
        float fC = c();
        float fB = b();
        PointF pointF = g.f251946a;
        if (f4 >= fC && f4 <= fB) {
            z = true;
        }
        float f5 = this.f251939g;
        float fB2 = g.b(f4, c(), b());
        this.f251939g = fB2;
        if (this.f251944n) {
            fB2 = (float) Math.floor(fB2);
        }
        this.f251940h = fB2;
        this.f = j2;
        if (z) {
            if (!this.f251944n || this.f251939g != f5) {
                g();
            }
        } else if (getRepeatCount() == -1 || this.i < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.e = !this.e;
                this.d = -this.d;
            } else {
                float fB3 = e() ? b() : c();
                this.f251939g = fB3;
                this.f251940h = fB3;
            }
            this.f = j2;
            if (!this.f251944n || this.f251939g != f5) {
                g();
            }
            Iterator it8 = this.f251937b.iterator();
            while (it8.hasNext()) {
                ((Animator.AnimatorListener) it8.next()).onAnimationRepeat(this);
            }
            this.i++;
        } else {
            float fC2 = this.d < BitmapDescriptorFactory.HUE_RED ? c() : b();
            this.f251939g = fC2;
            this.f251940h = fC2;
            h(true);
            if (!this.f251944n || this.f251939g != f5) {
                g();
            }
            f(e());
        }
        if (this.f251942l != null) {
            float f6 = this.f251940h;
            if (f6 < this.f251941j || f6 > this.k) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f251941j), Float.valueOf(this.k), Float.valueOf(this.f251940h)));
            }
        }
        d7.a aVar2 = d7.d.f111646a;
    }

    public final boolean e() {
        return this.d < BitmapDescriptorFactory.HUE_RED;
    }

    public final void f(boolean z) {
        Iterator it8 = this.f251937b.iterator();
        while (it8.hasNext()) {
            ((Animator.AnimatorListener) it8.next()).onAnimationEnd(this, z);
        }
    }

    public final void g() {
        Iterator it8 = this.f251936a.iterator();
        while (it8.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it8.next()).onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float fC;
        float fB;
        float fC2;
        if (this.f251942l == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (e()) {
            fC = b() - this.f251940h;
            fB = b();
            fC2 = c();
        } else {
            fC = this.f251940h - c();
            fB = b();
            fC2 = c();
        }
        return fC / (fB - fC2);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(a());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        d7.j jVar = this.f251942l;
        if (jVar == null) {
            return 0L;
        }
        return (long) jVar.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public final void h(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f251943m = false;
        }
    }

    public final void i(float f) {
        if (this.f251939g == f) {
            return;
        }
        float fB = g.b(f, c(), b());
        this.f251939g = fB;
        if (this.f251944n) {
            fB = (float) Math.floor(fB);
        }
        this.f251940h = fB;
        this.f = 0L;
        g();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f251943m;
    }

    public final void j(float f, float f4) {
        if (f > f4) {
            throw new IllegalArgumentException("minFrame (" + f + ") must be <= maxFrame (" + f4 + ")");
        }
        d7.j jVar = this.f251942l;
        float f5 = jVar == null ? -3.4028235E38f : jVar.f111683l;
        float f6 = jVar == null ? Float.MAX_VALUE : jVar.f111684m;
        float fB = g.b(f, f5, f6);
        float fB2 = g.b(f4, f5, f6);
        if (fB == this.f251941j && fB2 == this.k) {
            return;
        }
        this.f251941j = fB;
        this.k = fB2;
        i((int) g.b(this.f251940h, fB, fB2));
    }

    @Override // android.animation.Animator
    public final void removeAllListeners() {
        this.f251937b.clear();
    }

    @Override // android.animation.ValueAnimator
    public final void removeAllUpdateListeners() {
        this.f251936a.clear();
    }

    @Override // android.animation.Animator
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f251937b.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f251938c.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f251936a.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ Animator setDuration(long j2) {
        setDuration(j2);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.e) {
            return;
        }
        this.e = false;
        this.d = -this.d;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void setStartDelay(long j2) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final ValueAnimator setDuration(long j2) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
