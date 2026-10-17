package au0;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ro0.q;

/* JADX INFO: loaded from: classes19.dex */
public final class y3 implements t2 {

    @NotNull
    public static final w3 Companion = new w3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f9442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9444c;
    public ro0.p d;
    public float e;
    public final int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f9445g;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public y3(View navBarView) {
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        this.f9442a = navBarView;
        this.f9443b = ((Boolean) jo0.g.z.getValue()).booleanValue();
        this.f9444c = r6.b.a(navBarView, "getContext(...)", 100.0f);
        this.e = 1.0f;
        this.f = new int[]{0, 0, 0};
        this.f9445g = new float[]{BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED};
    }

    @Override // au0.t2
    public final void a(ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        e(kotlin.collections.d.N(this.f));
    }

    @Override // au0.t2
    public final void c(float f, int i) {
        int iD;
        Drawable background = this.f9442a.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (this.f9443b) {
            float f4 = (((i >> 24) & 255) / 255.0f) * (1.0f - kotlin.ranges.f.f(f, BitmapDescriptorFactory.HUE_RED, 1.0f));
            iD = io0.a.d(f4 <= 0.9f ? f4 : 0.9f, i);
        } else {
            iD = io0.a.d(0.9f, i);
        }
        if (iD != kotlin.collections.d.N(this.f) || gradientDrawable == null) {
            e(iD);
        }
        float fAlpha = Color.alpha(i) / 255.0f;
        if (fAlpha == this.e) {
            return;
        }
        this.e = fAlpha;
        ro0.p pVar = this.d;
        if (pVar != null) {
            pVar.c();
        }
    }

    public final void e(int i) {
        View view = this.f9442a;
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable == null) {
            gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, null);
            view.setBackground(gradientDrawable);
        }
        int[] iArr = this.f;
        iArr[0] = i;
        iArr[1] = i;
        iArr[2] = 0;
        float[] fArr = this.f9445g;
        fArr[0] = 0.0f;
        fArr[1] = kotlin.ranges.f.f((view.getMeasuredHeight() - this.f9444c) / view.getMeasuredHeight(), BitmapDescriptorFactory.HUE_RED, 1.0f);
        fArr[2] = 1.0f;
        gradientDrawable.setColors(iArr, fArr);
    }

    @Override // au0.t2
    public final void onAttachedToWindow() {
        q.a aVar = ro0.q.Companion;
        ro0.e0 e0Var = ro0.e0.NAV_BAR;
        aVar.getClass();
        View view = this.f9442a;
        ro0.q qVarA = q.a.a(view, e0Var);
        this.d = qVarA != null ? ro0.q.e(qVarA, view, new x3(this), new ro0.k(ro0.j.BLURRED_TOP), new aqe.a(this, 13), null, 48) : null;
    }

    @Override // au0.t2
    public final void onDetachedFromWindow() {
        ro0.p pVar = this.d;
        if (pVar != null) {
            pVar.e();
        }
        this.d = null;
    }
}
