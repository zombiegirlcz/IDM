package xml;

import android.app.Dialog;
import android.view.View;
import com.revolut.core.ui_kit.internal.views.TrackableEditText;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import kotlin.jvm.internal.Intrinsics;
import py0.f;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements f {
    @Override // py0.f
    public final void a(View view, TrackableItem item, py0.d dVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(item, "item");
    }

    @Override // py0.f
    public final void b(View view, String contentHash) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(contentHash, "contentHash");
    }

    @Override // py0.f
    public final void c(Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
    }

    @Override // py0.f
    public final void d(View rootView, Clause clause, String windowTitleFallback, Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(windowTitleFallback, "windowTitleFallback");
    }

    @Override // py0.f
    public final void e(TrackableEditText view, String query) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(query, "query");
    }

    @Override // py0.f
    public final void f(CustomTrackableComponent item, py0.d dVar, Clause clause, String windowType) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(windowType, "windowType");
    }

    @Override // py0.f
    public final void g(Dialog dialog, Clause clause, String windowTitleFallback, Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        Intrinsics.checkNotNullParameter(windowTitleFallback, "windowTitleFallback");
    }

    @Override // py0.f
    public final void h(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // py0.f
    public final void i(View view, String contentHash) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(contentHash, "contentHash");
    }
}
