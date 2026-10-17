package f60;

import android.app.Activity;
import androidx.view.ComponentActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class d implements e4m.e {
    public static ComponentActivity a(Activity activity) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        return (ComponentActivity) activity;
    }
}
