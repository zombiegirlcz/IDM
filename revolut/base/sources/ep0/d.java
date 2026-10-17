package ep0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {
    private d() {
    }

    public static int a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
