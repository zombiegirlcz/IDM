package hub;

import kotlin.jvm.internal.Intrinsics;
import m1c.e0;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f155600a;

    public c(e0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f155600a = context;
    }

    public final e0 b() {
        return this.f155600a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f155600a == ((c) obj2).f155600a;
    }

    public final int hashCode() {
        return this.f155600a.hashCode();
    }
}
