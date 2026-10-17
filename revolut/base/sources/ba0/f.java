package ba0;

import com.revolut.feature.backend_flow.domain.models.BackendFlowNavigationIcon;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendScreen f13869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BackendFlowNavigationIcon f13871c;

    public f(BackendScreen screen, boolean z, BackendFlowNavigationIcon navigationIcon) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        this.f13869a = screen;
        this.f13870b = z;
        this.f13871c = navigationIcon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f13869a, fVar.f13869a) && this.f13870b == fVar.f13870b && Intrinsics.f(this.f13871c, fVar.f13871c);
    }

    public final int hashCode() {
        return this.f13871c.hashCode() + j6.a.c(this.f13869a.hashCode() * 31, 31, this.f13870b);
    }
}
