package wu0;

import android.content.Context;
import android.os.Handler;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import kotlin.jvm.internal.Intrinsics;
import vu0.t;
import vu0.u;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f300048a;

    public c(d dVar) {
        this.f300048a = dVar;
    }

    @Override // vu0.t
    public final void a(SwipeToActionLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // vu0.t
    public final void b(SwipeToActionLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
        d dVar = this.f300048a;
        dVar.f = null;
        SwipeToActionLayout swipeToActionLayout = dVar.f300049a;
        Intrinsics.checkNotNullParameter(this, "listener");
        swipeToActionLayout.f57614b.remove(this);
        b bVar = new b(dVar, 0);
        dVar.e = bVar;
        Handler handler = dVar.f300050b;
        Context context = swipeToActionLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        handler.postDelayed(bVar, (long) (jq0.a.b(context) * 1000));
    }

    @Override // vu0.t
    public final void c(SwipeToActionLayout view, u state) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(state, "state");
    }
}
