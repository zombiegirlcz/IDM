package et0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0 f129059a = new k0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n0 f129060b = n0.FULL;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f129061c = true;

    private k0() {
    }

    @Override // et0.m0
    public final n0 a() {
        return f129060b;
    }

    @Override // et0.m0
    public final int b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Integer.MAX_VALUE;
    }

    @Override // et0.m0
    public final int c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return 0;
    }

    @Override // et0.m0
    public final boolean d() {
        return f129061c;
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof k0);
    }

    public final int hashCode() {
        return 124531601;
    }
}
