package pli;

import androidx.view.ComponentActivity;
import androidx.view.result.ActivityResultRegistry;
import e4m.e;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public abstract class b implements e {
    public static ActivityResultRegistry a(ComponentActivity componentActivity) {
        a.Companion.getClass();
        Intrinsics.checkNotNullParameter(componentActivity, "componentActivity");
        ActivityResultRegistry activityResultRegistry = componentActivity.getActivityResultRegistry();
        s.k(activityResultRegistry);
        return activityResultRegistry;
    }
}
