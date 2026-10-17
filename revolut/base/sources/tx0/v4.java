package tx0;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class v4 implements w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v4 f275253a = new v4();

    private v4() {
    }

    @Override // tx0.w4
    public final void a(Context context, ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        params.width = c8g.c.H(context);
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof v4);
    }

    public final int hashCode() {
        return 228079482;
    }
}
