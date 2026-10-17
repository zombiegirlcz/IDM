package fp0;

import android.content.Context;
import android.content.res.ColorStateList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f137024a = new h();

    private h() {
    }

    @Override // fp0.k
    public final boolean a() {
        return false;
    }

    @Override // fp0.i
    public final ColorStateList c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b.f137017a.c(context);
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof h);
    }

    public final int hashCode() {
        return -1486746836;
    }
}
