package vw0;

import android.content.Context;
import jo0.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {
    private c() {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public static Context a(Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        return (!((Boolean) g.N.getValue()).booleanValue() || (base instanceof d)) ? base : new d(base, 0);
    }
}
