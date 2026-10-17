package fp0;

import android.content.Context;
import android.content.res.ColorStateList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f137025a = new j();

    private j() {
    }

    @Override // fp0.k
    public final boolean a() {
        return true;
    }

    @Override // fp0.i
    public final ColorStateList c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b.f137017a.c(context);
    }

    public final boolean equals(Object obj2) {
        return this == obj2 || (obj2 instanceof j);
    }

    public final int hashCode() {
        return -56516686;
    }
}
