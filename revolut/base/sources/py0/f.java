package py0;

import android.app.Dialog;
import android.view.View;
import com.revolut.core.ui_kit.internal.views.TrackableEditText;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.CustomTrackableComponent;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;

/* JADX INFO: loaded from: classes20.dex */
public interface f {
    void a(View view, TrackableItem trackableItem, d dVar);

    void b(View view, String str);

    void c(Dialog dialog);

    void d(View view, Clause clause, String str, Object obj2, Object obj3);

    void e(TrackableEditText trackableEditText, String str);

    void f(CustomTrackableComponent customTrackableComponent, d dVar, Clause clause, String str);

    void g(Dialog dialog, Clause clause, String str, Object obj2, Object obj3);

    void h(View view);

    void i(View view, String str);
}
