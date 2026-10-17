package bb6;

import android.view.View;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.kompot.navigable.a f14173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f14174b;

    public d(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        this.f14173a = controller;
    }

    public final void a(ViewController otherController) {
        Intrinsics.checkNotNullParameter(otherController, "otherController");
        View viewFindFocus = this.f14173a.D2().findFocus();
        this.f14174b = viewFindFocus != null ? Integer.valueOf(viewFindFocus.getId()) : null;
        otherController.k2(new aqe.a(this, 29));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f14173a, ((d) obj2).f14173a);
    }

    public final int hashCode() {
        return this.f14173a.hashCode();
    }
}
