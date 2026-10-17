package rv0;

import android.view.Window;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h {
    private h() {
    }

    public static void a(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        window.setSoftInputMode((window.getAttributes().softInputMode & (-16)) | 3);
    }
}
