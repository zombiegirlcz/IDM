package ip0;

import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class yh0 implements vu0.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public uh0 f167314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public uh0 f167315b;

    @Override // vu0.t
    public final void a(SwipeToActionLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
        uh0 uh0Var = this.f167314a;
        if (uh0Var != null) {
            uh0Var.invoke();
        }
    }

    @Override // vu0.t
    public final void b(SwipeToActionLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
        uh0 uh0Var = this.f167315b;
        if (uh0Var != null) {
            uh0Var.invoke();
        }
    }

    @Override // vu0.t
    public final void c(SwipeToActionLayout view, vu0.u state) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(state, "state");
    }
}
