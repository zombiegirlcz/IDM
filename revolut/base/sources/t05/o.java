package t05;

import com.revolut.feature.credit.health.impl.domain.model.ActiveApplication;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActiveApplication f266926a;

    public o(ActiveApplication application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f266926a = application;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f266926a, ((o) obj2).f266926a);
    }

    public final int hashCode() {
        return this.f266926a.hashCode();
    }
}
