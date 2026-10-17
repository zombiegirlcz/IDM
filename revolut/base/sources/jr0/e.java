package jr0;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Outline f177898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f177899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f177900c;
    public final PathMeasure d;
    public final RectF e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f177901g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f177902h;

    public e(View scaleView) {
        Intrinsics.checkNotNullParameter(scaleView, "scaleView");
        this.f177898a = new Outline();
        this.f177899b = new Rect();
        this.f177900c = new Path();
        this.d = new PathMeasure();
        this.e = new RectF();
        this.f = Float.NaN;
        this.f177901g = scaleView;
        this.f177902h = new Rect();
    }
}
