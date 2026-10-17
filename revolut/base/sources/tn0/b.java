package tn0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f272277a;

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f272277a = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f272277a, ((b) obj2).f272277a);
    }

    public final int hashCode() {
        return this.f272277a.hashCode();
    }
}
