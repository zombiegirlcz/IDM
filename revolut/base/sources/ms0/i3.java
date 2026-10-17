package ms0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.TextView;
import com.revolut.core.ui_kit.internal.views.ProductIntroView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductIntroView f208280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ValueAnimator f208281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f208282c;
    public boolean d;
    public float e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f208283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f208284h;
    public Bitmap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Bitmap f208285j;
    public Canvas k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f208286l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UiKitPlayerView f208287m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final View f208288n;
    public final View o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TagView f208289p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f208290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f208291r;

    public i3(ProductIntroView hostView) {
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.f208280a = hostView;
        this.f208283g = Math.max(600L, 400L);
        this.f208284h = new Paint();
        Context context = hostView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f208286l = kli.a.k(context, 20.0f);
        this.f208287m = hostView.f56304m;
        this.f208288n = hostView.f56305n;
        this.o = hostView.o;
        this.f208289p = hostView.f56306p;
        this.f208290q = hostView.f56307q;
        this.f208291r = hostView.f56308r;
    }

    public final mx0.d2 a() {
        mx0.d2 d2Var;
        t2 t2VarN = this.f208280a.f56311w.n();
        o2 o2Var = t2VarN instanceof o2 ? (o2) t2VarN : null;
        return (o2Var == null || (d2Var = o2Var.d) == null) ? mx0.d2.NORMAL : d2Var;
    }

    public final float b(boolean z) {
        int left;
        int left2;
        UiKitPlayerView uiKitPlayerView = this.f208287m;
        if (z) {
            left = this.f208280a.getWidth();
            left2 = uiKitPlayerView.getLeft();
        } else {
            left = uiKitPlayerView.getLeft();
            left2 = -uiKitPlayerView.getWidth();
        }
        return ((left2 - left) * this.e) + (left - uiKitPlayerView.getLeft());
    }

    public final void c(float f) {
        float f4 = f * this.f208283g;
        float f5 = f4 / 400;
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        this.f = f5;
        float f6 = f4 / 600;
        this.e = f6 <= 1.0f ? f6 : 1.0f;
        mx0.d2 d2VarA = a();
        mx0.d2 d2Var = mx0.d2.NORMAL;
        UiKitPlayerView uiKitPlayerView = this.f208287m;
        if (d2VarA == d2Var) {
            uiKitPlayerView.setTranslationX(b(true));
        } else {
            uiKitPlayerView.setAlpha(this.f);
        }
        boolean z = this.d;
        if (z || this.f208282c) {
            float f32 = ((0 - r0) * this.e) + this.f208286l;
            if (z) {
                TextView textView = this.f208290q;
                textView.setTranslationX(f32);
                TextView textView2 = this.f208291r;
                textView2.setTranslationX(f32);
                textView.setAlpha(this.f);
                textView2.setAlpha(this.f);
            }
            if (this.f208282c) {
                TagView tagView = this.f208289p;
                tagView.setTranslationX(f32);
                tagView.setAlpha(this.f);
            }
        }
        this.f208280a.invalidate();
    }
}
