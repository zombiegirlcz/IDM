package ux0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f283756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ValueAnimator f283757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f283758c;
    public float d;
    public float e;
    public Float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f283759g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f283760h;
    public Bitmap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Canvas f283761j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f283762l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TextView f283763m;

    public j(a hostView) {
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.f283756a = hostView;
        this.f283759g = Math.max(600L, 400L);
        this.f283760h = new Paint();
        Context context = hostView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.k = kli.a.k(context, 20.0f);
        this.f283762l = hostView.f283728s;
        this.f283763m = hostView.f283729t;
    }

    public final void a(float f) {
        float f4 = f * this.f283759g;
        float f5 = f4 / 400;
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        this.e = f5;
        float f6 = f4 / 600;
        float f32 = f6 <= 1.0f ? f6 : 1.0f;
        this.d = f32;
        if (this.f283758c) {
            float f35 = ((0 - r5) * f32) + this.k;
            TextView textView = this.f283762l;
            textView.setTranslationX(f35);
            textView.setAlpha(this.e);
            TextView textView2 = this.f283763m;
            textView2.setTranslationX(f35);
            textView2.setAlpha(this.e);
        }
        this.f283756a.invalidate();
    }
}
