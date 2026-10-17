package ho;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.revolut.retail.analytics.R$id;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public final boolean a(View view) {
        Context context;
        Activity activityM;
        Intrinsics.checkNotNullParameter(view, "view");
        od0.a aVar = od0.a.f224253a;
        if (!od0.a.e() || (context = view.getContext()) == null || (activityM = kli.a.m(context)) == null) {
            return false;
        }
        return Intrinsics.f(activityM.getWindow().getDecorView().getRootView().getTag(R$id.internal_disabled_ui_tracking), Boolean.TRUE);
    }
}
