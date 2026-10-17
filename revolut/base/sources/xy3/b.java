package xy3;

import kotlin.jvm.internal.Intrinsics;
import xy3.a;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.b f309558a;

    public b(a.b step) {
        Intrinsics.checkNotNullParameter(step, "step");
        this.f309558a = step;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f309558a, ((b) obj2).f309558a);
    }

    public final int hashCode() {
        return this.f309558a.hashCode();
    }
}
