package xg0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uh0.b f305479a;

    public t(uh0.b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f305479a = request;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && Intrinsics.f(this.f305479a, ((t) obj2).f305479a);
    }

    public final int hashCode() {
        return this.f305479a.hashCode();
    }
}
