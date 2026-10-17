package au0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f4 implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f9201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h4 f9202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g4 f9203c;
    public final h2 d;
    public float e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public aw0.v1 f9204g;

    public f4(View navBarView, h4 host, g4 buttons, List items, RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(navBarView, "navBarView");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f9201a = navBarView;
        this.f9202b = host;
        this.f9203c = buttons;
        this.d = new h2(navBarView, buttons, items, recyclerView);
        this.e = 1.0f;
    }

    @Override // au0.t2
    public final void a(ViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        j2 j2Var = this.d.f9220b;
        if (j2Var.isActive()) {
            j2Var.d();
        }
        this.f9202b.q();
    }

    @Override // au0.t2
    public final void b(aw0.v1 colorScheme) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        if (this.f9204g == colorScheme) {
            return;
        }
        this.f9204g = colorScheme;
        h2 h2Var = this.d;
        h2Var.getClass();
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        h2Var.f9220b.b(colorScheme);
    }

    @Override // au0.t2
    public final void c(float f, int i) {
        this.e = f;
        this.f9203c.q(e());
        boolean zE = e();
        View view = this.f9201a;
        h2 h2Var = this.d;
        if (zE) {
            if (!h2Var.f9220b.isActive()) {
                view.setBackgroundColor(i);
                return;
            }
            h2Var.d = false;
            j2 j2Var = h2Var.f9220b;
            if (j2Var.isActive()) {
                j2Var.g(Integer.valueOf(i));
                return;
            }
            return;
        }
        h2Var.d = true;
        j2 j2Var2 = h2Var.f9220b;
        if (j2Var2.isActive()) {
            j2Var2.c(h2Var.f9221c, i);
        } else {
            Integer numValueOf = Integer.valueOf(i);
            h2Var.f9219a.setBackgroundColor(0);
            j2Var2.e(h2Var.f9221c, numValueOf);
        }
        if (!j2Var2.isActive()) {
            view.setBackgroundColor(i);
            return;
        }
        float f4 = 1.0f - f;
        int q0 = this.f9202b.getQ0();
        float fA = q0 > 0 ? r6.b.a(view, "getContext(...)", 64.0f) / q0 : 0.0f;
        if (fA > BitmapDescriptorFactory.HUE_RED) {
            f4 = kotlin.ranges.f.f(f4 / fA, BitmapDescriptorFactory.HUE_RED, 1.0f);
        }
        float f5 = kotlin.ranges.f.f(f4, BitmapDescriptorFactory.HUE_RED, 1.0f);
        h2Var.f9221c = f5;
        if (j2Var2.isActive()) {
            j2Var2.f(f5);
        }
    }

    @Override // au0.t2
    public final void d(boolean z) {
        this.f = z;
    }

    public final boolean e() {
        return this.f && this.e == BitmapDescriptorFactory.HUE_RED;
    }

    @Override // au0.t2
    public final goi.f getNavbarMaskState() {
        return (e() || !this.d.f9220b.isActive()) ? goi.d.f145165a : new goi.e(this.f9201a);
    }

    @Override // au0.t2
    public final void onAttachedToWindow() {
        this.f9203c.q(e());
        h2 h2Var = this.d;
        j2 j2Var = h2Var.f9220b;
        j2Var.onAttachedToWindow();
        if (!h2Var.d || j2Var.isActive()) {
            return;
        }
        h2Var.f9219a.setBackgroundColor(0);
        h2Var.f9220b.e(h2Var.f9221c, null);
    }

    @Override // au0.t2
    public final void onDetachedFromWindow() {
        this.f9203c.q(true);
        this.d.f9220b.onDetachedFromWindow();
    }
}
