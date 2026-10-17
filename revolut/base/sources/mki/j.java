package mki;

import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class j {
    private j() {
    }

    public static void a(String context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Looper.getMainLooper().isCurrentThread();
    }
}
