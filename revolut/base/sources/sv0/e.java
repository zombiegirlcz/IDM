package sv0;

import android.app.Activity;
import android.content.Context;
import jo0.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e {
    private e() {
    }

    public static void a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        uv0.e.d.e(new lu0.a(context, 28));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public static c b(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (((Boolean) g.v.getValue()).booleanValue()) {
            return new c(activity, (uv0.b) uv0.e.d.e(new d(activity, 0)));
        }
        return null;
    }
}
