package ya0;

import aii.r;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendScreen f311884a;

    public b(BackendScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f311884a = screen;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f311884a, ((b) obj2).f311884a);
    }

    public final int hashCode() {
        return this.f311884a.hashCode();
    }
}
