package tx0;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class u4 implements w4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u4 f275249a = new u4();

    private u4() {
    }

    @Override // tx0.w4
    public final void a(Context context, ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        params.width = d5.d(context);
    }

    public final void b(Context context, ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        params.height = d5.b(context);
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof u4);
    }

    public final int hashCode() {
        return -1455638247;
    }
}
