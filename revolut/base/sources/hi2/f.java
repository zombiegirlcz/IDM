package hi2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hrf.h f152455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f152456b;

    public f(hrf.h errorState, List suggestions) {
        Intrinsics.checkNotNullParameter(errorState, "errorState");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f152455a = errorState;
        this.f152456b = suggestions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f152455a, fVar.f152455a) && Intrinsics.f(this.f152456b, fVar.f152456b);
    }

    public final int hashCode() {
        return this.f152456b.hashCode() + (this.f152455a.hashCode() * 31);
    }
}
