package qu0;

import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import fp0.l;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTimeUtils;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProgressBar f249169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f249170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearInterpolator f249171c;
    public final o6.a d;
    public long e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f249172g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ObjectAnimator f249173h;
    public boolean i;

    public a(ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        this.f249169a = progressBar;
        this.f249170b = new Handler(Looper.getMainLooper());
        this.f249171c = new LinearInterpolator();
        this.d = new o6.a(this, 16);
        this.e = -1L;
        this.f = -1L;
    }

    public final void a() {
        ObjectAnimator objectAnimator = this.f249173h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f249170b.removeCallbacks(this.d);
        this.f249173h = null;
        this.f249172g = null;
        this.e = -1L;
        this.f = -1L;
    }

    public final void b() {
        if (this.f == -1 || this.i) {
            return;
        }
        this.i = true;
        long jCurrentTimeMillis = DateTimeUtils.currentTimeMillis() - this.e;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        this.f = jCurrentTimeMillis;
        ObjectAnimator objectAnimator = this.f249173h;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
        this.f249170b.removeCallbacks(this.d);
    }

    public final void c() {
        if (this.f == -1 || !this.i) {
            return;
        }
        this.i = false;
        ObjectAnimator objectAnimator = this.f249173h;
        if (objectAnimator != null) {
            objectAnimator.resume();
        }
        this.e = DateTimeUtils.currentTimeMillis();
        this.f249170b.postDelayed(this.d, this.f);
    }
}
