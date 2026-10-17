package gl0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f144534a;

    public b(Context baseContext) {
        Intrinsics.checkNotNullParameter(baseContext, "baseContext");
        this.f144534a = baseContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f144534a, ((b) obj2).f144534a);
    }

    public final int hashCode() {
        return this.f144534a.hashCode();
    }
}
