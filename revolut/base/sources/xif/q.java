package xif;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f306374a;

    public q(List scopes) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        this.f306374a = scopes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f306374a, ((q) obj2).f306374a);
    }

    public final int hashCode() {
        return this.f306374a.hashCode();
    }
}
