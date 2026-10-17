package o25;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vu3.e f221486a;

    public a(vu3.e action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f221486a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f221486a, ((a) obj2).f221486a);
    }

    public final int hashCode() {
        return this.f221486a.hashCode();
    }
}
