package dda;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f113192a;

    public p(Map parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f113192a = parameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && Intrinsics.f(this.f113192a, ((p) obj2).f113192a);
    }

    public final int hashCode() {
        return this.f113192a.hashCode();
    }
}
