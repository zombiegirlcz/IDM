package lo0;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.revolut.core.ui_kit.internal.views.TrackableEditText;
import kotlin.jvm.internal.Intrinsics;
import uo.v;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements v {
    @Override // uo.v
    public final void a(Object screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
    }

    @Override // uo.v
    public final void b(Object screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        View viewK = rd0.e.k(screen);
        Context context = viewK != null ? viewK.getContext() : null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        View currentFocus = activity != null ? activity.getCurrentFocus() : null;
        gx0.b bVar = currentFocus instanceof gx0.b ? (gx0.b) currentFocus : null;
        if (bVar == null) {
            return;
        }
        TrackableEditText trackableEditText = (TrackableEditText) bVar;
        trackableEditText.isFocused();
        trackableEditText.e();
    }
}
