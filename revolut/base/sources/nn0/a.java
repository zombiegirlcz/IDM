package nn0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f217430a;

    public a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f217430a = context;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f217430a, ((a) obj2).f217430a);
    }

    public final int hashCode() {
        return this.f217430a.hashCode();
    }
}
