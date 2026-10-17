package j01;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    private d() {
    }

    public static void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setOnTouchListener(new e(new View[]{view}));
    }
}
