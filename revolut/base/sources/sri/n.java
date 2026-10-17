package sri;

import android.app.Activity;
import androidx.view.ComponentActivity;
import com.revolut.core.ui_kit.R$id;
import kotlin.jvm.internal.Intrinsics;
import yp0.c0;
import yp0.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class n {
    public static void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        hx0.d.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity instanceof ComponentActivity) {
            int i = R$id.internal_activity_exit_helper_tag;
            d0 d0Var = d0.f315718a;
            c0 c0VarA = d0.a(activity);
            Object objA = c0VarA.a(i);
            if (objA == null) {
                objA = new hx0.b((ComponentActivity) activity);
                c0VarA.b(i, objA);
            }
            ((hx0.b) objA).a();
        }
    }
}
