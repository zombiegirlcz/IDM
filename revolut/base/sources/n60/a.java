package n60;

import android.view.View;
import e0m.e;
import kli.c;
import kotlin.jvm.internal.Intrinsics;
import yji.d;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f212661c;

    public a(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f212661c = controller;
    }

    public final void Q() {
        e.a(this.f212661c.D2());
    }

    public final void R() {
        c.c(this.f212661c.D2(), false);
    }

    public final void S(boolean z) {
        View viewFindFocus;
        View viewD2 = this.f212661c.D2();
        if (z && (viewFindFocus = viewD2.findFocus()) != null) {
            viewD2 = viewFindFocus;
        }
        c.d(viewD2, 0L);
    }
}
