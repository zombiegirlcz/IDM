package eoi;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class m {
    private m() {
    }

    public static final boolean a(m mVar) {
        mVar.getClass();
        return ((Boolean) o.B.getValue()).booleanValue();
    }

    public static boolean b(Activity activity, Object screen, View view) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(view, "view");
        boolean z = (screen instanceof com.revolut.kompot.navigable.a) || (screen instanceof Fragment) || (screen instanceof Activity);
        Context context = view.getContext();
        return Intrinsics.f(activity, context != null ? z92.f.i(context) : null) && z;
    }
}
