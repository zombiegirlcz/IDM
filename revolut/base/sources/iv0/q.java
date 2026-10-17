package iv0;

import android.view.View;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f168693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f168694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AnalyticsContext f168695c;
    public final Object d;
    public float e;

    public q(View rootView, int i) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.f168693a = rootView;
        this.f168694b = i;
        this.d = yhm.j.c(yhm.k.NONE, new p(this, 0));
        this.e = 1.0f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final View a() {
        return (View) this.d.getValue();
    }

    public void b(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    public void c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void d(boolean z) {
        if (z) {
            a().setVisibility(0);
        } else if (this.d.isInitialized()) {
            a().setVisibility(8);
        }
    }
}
