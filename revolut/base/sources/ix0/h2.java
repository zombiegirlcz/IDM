package ix0;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View[] f169242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g2 f169243b;

    public h2(View... views) {
        Intrinsics.checkNotNullParameter(views, "views");
        this.f169242a = views;
    }

    public final void a(boolean z, boolean z3) {
        g2 g2Var = this.f169243b;
        if (z != (g2Var != null ? g2Var.a() : b())) {
            g2 g2Var2 = this.f169243b;
            if (g2Var2 != null) {
                g2Var2.cancel();
            }
            g2 g2Var3 = new g2(this, z, z3);
            this.f169243b = g2Var3;
            g2Var3.start();
            return;
        }
        if (z) {
            return;
        }
        g2 g2Var4 = this.f169243b;
        if (g2Var4 != null) {
            g2Var4.b(z3);
        } else if (z3) {
            c();
        } else {
            d(false);
        }
    }

    public final boolean b() {
        g2 g2Var = this.f169243b;
        if (g2Var != null) {
            return g2Var.a();
        }
        for (View view : this.f169242a) {
            if (view.getVisibility() != 0) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        g2 g2Var = this.f169243b;
        if (g2Var != null) {
            g2Var.cancel();
        }
        for (View view : this.f169242a) {
            view.setVisibility(4);
            view.setAlpha(1.0f);
        }
    }

    public final void d(boolean z) {
        g2 g2Var = this.f169243b;
        if (g2Var != null) {
            g2Var.cancel();
        }
        for (View view : this.f169242a) {
            view.setVisibility(z ? 0 : 8);
            view.setAlpha(1.0f);
        }
    }
}
